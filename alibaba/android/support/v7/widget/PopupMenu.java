// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.SupportMenuInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import gc;
import gh;
import gm;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

public class PopupMenu
    implements gc.a, gi.a
{
    public static interface OnDismissListener
    {

        public abstract void onDismiss(PopupMenu popupmenu);
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    private View mAnchor;
    private Context mContext;
    private OnDismissListener mDismissListener;
    private android.view.View.OnTouchListener mDragListener;
    private gc mMenu;
    private OnMenuItemClickListener mMenuItemClickListener;
    private gh mPopup;

    public PopupMenu(Context context, View view)
    {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i)
    {
        this(context, view, i, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int j, int k)
    {
        mContext = context;
        mMenu = new gc(context);
        mMenu.a(this);
        mAnchor = view;
        mPopup = new gh(context, mMenu, view, false, j, k);
        mPopup.setGravity(i);
        mPopup.setCallback(this);
    }

    public void dismiss()
    {
        mPopup.dismiss();
    }

    public android.view.View.OnTouchListener getDragToOpenListener()
    {
        if (mDragListener == null)
        {
            mDragListener = new ListPopupWindow.ForwardingListener(mAnchor) {

                final PopupMenu this$0;

                public ListPopupWindow getPopup()
                {
                    return mPopup.getPopup();
                }

                protected boolean onForwardingStarted()
                {
                    show();
                    return true;
                }

                protected boolean onForwardingStopped()
                {
                    dismiss();
                    return true;
                }

            
            {
                this$0 = PopupMenu.this;
                super(view);
            }
            };
        }
        return mDragListener;
    }

    public Menu getMenu()
    {
        return mMenu;
    }

    public MenuInflater getMenuInflater()
    {
        return new SupportMenuInflater(mContext);
    }

    public void inflate(int i)
    {
        getMenuInflater().inflate(i, mMenu);
    }

    public void onCloseMenu(gc gc1, boolean flag)
    {
        if (mDismissListener != null)
        {
            mDismissListener.onDismiss(this);
        }
    }

    public void onCloseSubMenu(gm gm)
    {
    }

    public boolean onMenuItemSelected(gc gc1, MenuItem menuitem)
    {
        if (mMenuItemClickListener != null)
        {
            return mMenuItemClickListener.onMenuItemClick(menuitem);
        } else
        {
            return false;
        }
    }

    public void onMenuModeChange(gc gc1)
    {
    }

    public boolean onOpenSubMenu(gc gc1)
    {
        boolean flag = true;
        if (gc1 == null)
        {
            flag = false;
        } else
        if (gc1.hasVisibleItems())
        {
            (new gh(mContext, gc1, mAnchor)).show();
            return true;
        }
        return flag;
    }

    public void setOnDismissListener(OnDismissListener ondismisslistener)
    {
        mDismissListener = ondismisslistener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
    {
        mMenuItemClickListener = onmenuitemclicklistener;
    }

    public void show()
    {
        mPopup.show();
    }

}
