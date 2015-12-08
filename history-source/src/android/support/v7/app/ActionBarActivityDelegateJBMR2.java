// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateJB, ActionBarImplJBMR2, ActionBarActivity, ActionBar

class ActionBarActivityDelegateJBMR2 extends ActionBarActivityDelegateJB
{

    ActionBarActivityDelegateJBMR2(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar createSupportActionBar()
    {
        return new ActionBarImplJBMR2(mActivity, mActivity);
    }
}
