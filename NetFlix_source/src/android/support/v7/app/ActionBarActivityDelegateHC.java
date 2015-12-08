// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarImplHC, ActionBarActivity, ActionBar

class ActionBarActivityDelegateHC extends ActionBarActivityDelegateBase
{

    ActionBarActivityDelegateHC(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar createSupportActionBar()
    {
        ensureSubDecor();
        return new ActionBarImplHC(mActivity, mActivity);
    }

    void onCreate(Bundle bundle)
    {
        mActivity.getWindow().requestFeature(10);
        super.onCreate(bundle);
    }
}
