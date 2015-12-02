// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import gc;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

class mPopup
    implements Runnable
{

    private this._cls0 mPopup;
    final ActionMenuPresenter this$0;

    public void run()
    {
        ActionMenuPresenter.access$800(ActionMenuPresenter.this).f();
        View view = (View)ActionMenuPresenter.access$900(ActionMenuPresenter.this);
        if (view != null && view.getWindowToken() != null && mPopup.())
        {
            ActionMenuPresenter.access$202(ActionMenuPresenter.this, mPopup);
        }
        ActionMenuPresenter.access$302(ActionMenuPresenter.this, null);
    }

    public ( )
    {
        this$0 = ActionMenuPresenter.this;
        super();
        mPopup = ;
    }
}
