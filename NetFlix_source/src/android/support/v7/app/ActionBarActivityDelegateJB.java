// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateICS, ActionBarImplJB, ActionBarActivity, ActionBar

class ActionBarActivityDelegateJB extends ActionBarActivityDelegateICS
{

    ActionBarActivityDelegateJB(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    public ActionBar createSupportActionBar()
    {
        return new ActionBarImplJB(mActivity, mActivity);
    }
}
