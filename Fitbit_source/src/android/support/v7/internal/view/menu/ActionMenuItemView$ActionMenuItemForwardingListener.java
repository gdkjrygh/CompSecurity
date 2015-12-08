// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.widget.ListPopupWindow;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuItemView

private class this._cls0 extends android.support.v7.widget.ingListener
{

    final ActionMenuItemView this$0;

    public ListPopupWindow getPopup()
    {
        if (ActionMenuItemView.access$000(ActionMenuItemView.this) != null)
        {
            return ActionMenuItemView.access$000(ActionMenuItemView.this)._mth0();
        } else
        {
            return null;
        }
    }

    protected boolean onForwardingStarted()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ActionMenuItemView.access$100(ActionMenuItemView.this) != null)
        {
            flag = flag1;
            if (ActionMenuItemView.access$100(ActionMenuItemView.this)._mth0(ActionMenuItemView.access$200(ActionMenuItemView.this)))
            {
                ListPopupWindow listpopupwindow = getPopup();
                flag = flag1;
                if (listpopupwindow != null)
                {
                    flag = flag1;
                    if (listpopupwindow.isShowing())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean onForwardingStopped()
    {
        ListPopupWindow listpopupwindow = getPopup();
        if (listpopupwindow != null)
        {
            listpopupwindow.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public ()
    {
        this$0 = ActionMenuItemView.this;
        super(ActionMenuItemView.this);
    }
}
