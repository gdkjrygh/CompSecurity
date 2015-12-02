// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import de.greenrobot.event.EventBus;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogManager, ErrorDialogFragmentFactory, ErrorDialogConfig, ThrowableFailureEvent

public static class  extends Fragment
{

    protected Bundle argumentsForErrorDialog;
    private EventBus eventBus;
    private Object executionScope;
    protected boolean finishAfterDialog;

    public static void attachTo(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        FragmentManager fragmentmanager = activity.getFragmentManager();
          = ()fragmentmanager.findFragmentByTag("de.greenrobot.eventbus.error_dialog_manager");
        activity = ;
        if ( == null)
        {
            activity = new <init>();
            fragmentmanager.beginTransaction().add(activity, "de.greenrobot.eventbus.error_dialog_manager").commit();
            fragmentmanager.executePendingTransactions();
        }
        activity.finishAfterDialog = flag;
        activity.argumentsForErrorDialog = bundle;
        activity.executionScope = obj;
    }

    public void onEventMainThread(ThrowableFailureEvent throwablefailureevent)
    {
        if (ErrorDialogManager.access$0(executionScope, throwablefailureevent))
        {
            ErrorDialogManager.checkLogException(throwablefailureevent);
            FragmentManager fragmentmanager = getFragmentManager();
            fragmentmanager.executePendingTransactions();
            DialogFragment dialogfragment = (DialogFragment)fragmentmanager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (dialogfragment != null)
            {
                dialogfragment.dismiss();
            }
            throwablefailureevent = (DialogFragment)ErrorDialogManager.factory.prepareErrorFragment(throwablefailureevent, finishAfterDialog, argumentsForErrorDialog);
            if (throwablefailureevent != null)
            {
                throwablefailureevent.show(fragmentmanager, "de.greenrobot.eventbus.error_dialog");
                return;
            }
        }
    }

    public void onPause()
    {
        eventBus.unregister(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        eventBus = ErrorDialogManager.factory.config.getEventBus();
        eventBus.register(this);
    }

    public ()
    {
    }
}
