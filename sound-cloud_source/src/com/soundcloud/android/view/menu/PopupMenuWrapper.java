// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.menu;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class PopupMenuWrapper
{
    public static class Factory
    {

        public PopupMenuWrapper build(Context context1, View view)
        {
            return new PopupMenuWrapper(new PopupMenu(context1, view), context1);
        }

        public Factory()
        {
        }
    }

    public static interface PopupMenuWrapperListener
    {

        public abstract void onDismiss();

        public abstract boolean onMenuItemClick(MenuItem menuitem, Context context1);
    }


    private final Context context;
    private final PopupMenu popupMenu;

    public PopupMenuWrapper(PopupMenu popupmenu, Context context1)
    {
        popupMenu = popupmenu;
        context = context1;
    }

    public void dismiss()
    {
        popupMenu.dismiss();
    }

    public MenuItem findItem(int i)
    {
        return popupMenu.getMenu().findItem(i);
    }

    public void inflate(int i)
    {
        popupMenu.inflate(i);
    }

    public void setItemEnabled(int i, boolean flag)
    {
        popupMenu.getMenu().findItem(i).setEnabled(flag);
    }

    public void setItemText(int i, String s)
    {
        popupMenu.getMenu().findItem(i).setTitle(s);
    }

    public void setItemVisible(int i, boolean flag)
    {
        popupMenu.getMenu().findItem(i).setVisible(flag);
    }

    public void setOnDismissListener(final PopupMenuWrapperListener popupMenuWrapperListener)
    {
        popupMenu.setOnDismissListener(new _cls2());
    }

    public void setOnMenuItemClickListener(final PopupMenuWrapperListener popupMenuWrapperListener)
    {
        popupMenu.setOnMenuItemClickListener(new _cls1());
    }

    public void show()
    {
        popupMenu.show();
    }


    private class _cls2
        implements android.widget.PopupMenu.OnDismissListener
    {

        final PopupMenuWrapper this$0;
        final PopupMenuWrapperListener val$popupMenuWrapperListener;

        public void onDismiss(PopupMenu popupmenu)
        {
            popupMenuWrapperListener.onDismiss();
        }

        _cls2()
        {
            this$0 = PopupMenuWrapper.this;
            popupMenuWrapperListener = popupmenuwrapperlistener;
            super();
        }
    }


    private class _cls1
        implements android.widget.PopupMenu.OnMenuItemClickListener
    {

        final PopupMenuWrapper this$0;
        final PopupMenuWrapperListener val$popupMenuWrapperListener;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return popupMenuWrapperListener.onMenuItemClick(menuitem, context);
        }

        _cls1()
        {
            this$0 = PopupMenuWrapper.this;
            popupMenuWrapperListener = popupmenuwrapperlistener;
            super();
        }
    }

}
