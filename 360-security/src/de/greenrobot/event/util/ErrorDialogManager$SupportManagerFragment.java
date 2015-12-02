// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.support.v4.app.h;
import de.greenrobot.event.EventBus;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogManager, ErrorDialogFragmentFactory, ErrorDialogConfig, ThrowableFailureEvent

public static class  extends Fragment
{

    protected Bundle argumentsForErrorDialog;
    private EventBus eventBus;
    private Object executionScope;
    protected boolean finishAfterDialog;
    private boolean skipRegisterOnNextResume;

    public static void attachTo(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        f f1 = ((FragmentActivity)activity).e();
          = ()f1.a("de.greenrobot.eventbus.error_dialog_manager");
        activity = ;
        if ( == null)
        {
            activity = new <init>();
            f1.a().a(activity, "de.greenrobot.eventbus.error_dialog_manager").a();
            f1.b();
        }
        activity.finishAfterDialog = flag;
        activity.argumentsForErrorDialog = bundle;
        activity.executionScope = obj;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eventBus = ErrorDialogManager.factory.config.getEventBus();
        eventBus.register(this);
        skipRegisterOnNextResume = true;
    }

    public void onEventMainThread(ThrowableFailureEvent throwablefailureevent)
    {
        if (ErrorDialogManager.access$0(executionScope, throwablefailureevent))
        {
            ErrorDialogManager.checkLogException(throwablefailureevent);
            f f1 = getFragmentManager();
            f1.b();
            DialogFragment dialogfragment = (DialogFragment)f1.a("de.greenrobot.eventbus.error_dialog");
            if (dialogfragment != null)
            {
                dialogfragment.dismiss();
            }
            throwablefailureevent = (DialogFragment)ErrorDialogManager.factory.prepareErrorFragment(throwablefailureevent, finishAfterDialog, argumentsForErrorDialog);
            if (throwablefailureevent != null)
            {
                throwablefailureevent.show(f1, "de.greenrobot.eventbus.error_dialog");
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
        if (skipRegisterOnNextResume)
        {
            skipRegisterOnNextResume = false;
            return;
        } else
        {
            eventBus = ErrorDialogManager.factory.config.getEventBus();
            eventBus.register(this);
            return;
        }
    }

    public ()
    {
    }
}
