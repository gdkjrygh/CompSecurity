// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


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
}
