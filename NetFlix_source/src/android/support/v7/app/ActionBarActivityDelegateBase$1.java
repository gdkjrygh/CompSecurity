// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarActivity

class this._cls0
    implements Runnable
{

    final ActionBarActivityDelegateBase this$0;

    public void run()
    {
        android.support.v7.internal.view.menu.MenuBuilder menubuilder = ActionBarActivityDelegateBase.access$000(ActionBarActivityDelegateBase.this);
        if (mActivity.superOnCreatePanelMenu(0, menubuilder) && mActivity.superOnPreparePanel(0, null, menubuilder))
        {
            ActionBarActivityDelegateBase.access$100(ActionBarActivityDelegateBase.this, menubuilder);
        } else
        {
            ActionBarActivityDelegateBase.access$100(ActionBarActivityDelegateBase.this, null);
        }
        ActionBarActivityDelegateBase.access$202(ActionBarActivityDelegateBase.this, false);
    }

    ()
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
    }
}
