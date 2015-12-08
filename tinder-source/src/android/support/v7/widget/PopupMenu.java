// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.p;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

public class PopupMenu
    implements android.support.v7.internal.view.menu.f.a, android.support.v7.internal.view.menu.l.a
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
    private f mMenu;
    private OnMenuItemClickListener mMenuItemClickListener;
    private k mPopup;

    public PopupMenu(Context context, View view)
    {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i)
    {
        this(context, view, i, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int j, int l)
    {
        mContext = context;
        mMenu = new f(context);
        mMenu.a(this);
        mAnchor = view;
        mPopup = new k(context, mMenu, view, false, j, l);
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

    public int getGravity()
    {
        return mPopup.getGravity();
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

    public void onCloseMenu(f f1, boolean flag)
    {
        if (mDismissListener != null)
        {
            mDismissListener.onDismiss(this);
        }
    }

    public void onCloseSubMenu(p p)
    {
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        if (mMenuItemClickListener != null)
        {
            return mMenuItemClickListener.onMenuItemClick(menuitem);
        } else
        {
            return false;
        }
    }

    public void onMenuModeChange(f f1)
    {
    }

    public boolean onOpenSubMenu(f f1)
    {
        boolean flag = true;
        if (f1 == null)
        {
            flag = false;
        } else
        if (f1.hasVisibleItems())
        {
            (new k(mContext, f1, mAnchor)).show();
            return true;
        }
        return flag;
    }

    public void setGravity(int i)
    {
        mPopup.setGravity(i);
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
