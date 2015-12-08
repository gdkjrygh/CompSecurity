// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public final class PopupMenu
    implements android.support.v7.internal.view.menu.MenuBuilder.Callback, android.support.v7.internal.view.menu.MenuPresenter.Callback
{
    public static interface OnDismissListener
    {

        public abstract void onDismiss$add183e();
    }

    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    private View mAnchor;
    private Context mContext;
    public OnDismissListener mDismissListener;
    public MenuBuilder mMenu;
    public OnMenuItemClickListener mMenuItemClickListener;
    public MenuPopupHelper mPopup;

    public PopupMenu(Context context, View view)
    {
        this(context, view, (byte)0);
    }

    private PopupMenu(Context context, View view, byte byte0)
    {
        this(context, view, 0, 0x7f010127);
    }

    private PopupMenu(Context context, View view, int i, int j)
    {
        mContext = context;
        mMenu = new MenuBuilder(context);
        mMenu.setCallback(this);
        mAnchor = view;
        mPopup = new MenuPopupHelper(context, mMenu, view, false, 0x7f010127, 0);
        mPopup.mDropDownGravity = 0;
        mPopup.mPresenterCallback = this;
    }

    public final void inflate(int i)
    {
        (new SupportMenuInflater(mContext)).inflate(i, mMenu);
    }

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mDismissListener != null)
        {
            mDismissListener.add183e();
        }
    }

    public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        if (mMenuItemClickListener != null)
        {
            return mMenuItemClickListener.onMenuItemClick(menuitem);
        } else
        {
            return false;
        }
    }

    public final void onMenuModeChange(MenuBuilder menubuilder)
    {
    }

    public final boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        boolean flag = true;
        if (menubuilder == null)
        {
            flag = false;
        } else
        if (menubuilder.hasVisibleItems())
        {
            (new MenuPopupHelper(mContext, menubuilder, mAnchor)).show();
            return true;
        }
        return flag;
    }
}
