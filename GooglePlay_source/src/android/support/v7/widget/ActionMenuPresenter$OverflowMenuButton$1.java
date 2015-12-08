// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, ListPopupWindow

final class  extends 
{

    final  this$1;
    final ActionMenuPresenter val$this$0;

    public final ListPopupWindow getPopup()
    {
        if (mOverflowPopup == null)
        {
            return null;
        } else
        {
            return ((MenuPopupHelper) (mOverflowPopup)).mPopup;
        }
    }

    public final boolean onForwardingStarted()
    {
        showOverflowMenu();
        return true;
    }

    public final boolean onForwardingStopped()
    {
        if (mPostedOpenRunnable != null)
        {
            return false;
        } else
        {
            hideOverflowMenu();
            return true;
        }
    }

    (ActionMenuPresenter actionmenupresenter)
    {
        this$1 = final_;
        val$this$0 = actionmenupresenter;
        super(View.this);
    }
}
