// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.view.ActionModeWrapper;
import android.support.v7.internal.view.ActionModeWrapperJB;
import android.view.ActionMode;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateICS, ActionBarImplJB, ActionBarActivity, ActionBar

class ActionBarActivityDelegateJB extends ActionBarActivityDelegateICS
{

    ActionBarActivityDelegateJB(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    android.support.v7.internal.view.ActionModeWrapper.CallbackWrapper createActionModeCallbackWrapper(Context context, android.support.v7.view.ActionMode.Callback callback)
    {
        return new android.support.v7.internal.view.ActionModeWrapperJB.CallbackWrapper(context, callback);
    }

    ActionModeWrapper createActionModeWrapper(Context context, ActionMode actionmode)
    {
        return new ActionModeWrapperJB(context, actionmode);
    }

    public ActionBar createSupportActionBar()
    {
        return new ActionBarImplJB(mActivity, mActivity);
    }
}
