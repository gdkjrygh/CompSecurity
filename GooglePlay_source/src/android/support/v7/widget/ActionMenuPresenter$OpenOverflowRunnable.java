// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private final class mPopup
    implements Runnable
{

    private mPopup mPopup;
    final ActionMenuPresenter this$0;

    public final void run()
    {
        Object obj = mMenu;
        if (((MenuBuilder) (obj)).mCallback != null)
        {
            ((MenuBuilder) (obj)).mCallback.(((MenuBuilder) (obj)));
        }
        obj = (View)mMenuView;
        if (obj != null && ((View) (obj)).getWindowToken() != null && mPopup.())
        {
            mOverflowPopup = mPopup;
        }
        mPostedOpenRunnable = null;
    }

    public ( )
    {
        this$0 = ActionMenuPresenter.this;
        super();
        mPopup = ;
    }
}
