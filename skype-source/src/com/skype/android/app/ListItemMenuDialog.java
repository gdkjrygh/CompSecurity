// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v7.internal.view.menu.f;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;

public class ListItemMenuDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener, android.support.v7.internal.view.menu.f.a
{
    protected static class MenuAdapter extends ArrayAdapter
    {

        private int defaultTextColor;
        private int disabledTextColor;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x1090003, viewgroup, false);
            }
            view = (TextView)view1.findViewById(0x1020014);
            int j = getContext().getResources().getDimensionPixelSize(0x7f0c00c0);
            view.setPadding(getContext().getResources().getDimensionPixelSize(0x7f0c020c), j, j, j);
            viewgroup = (MenuItem)getItem(i);
            if (viewgroup.isEnabled())
            {
                i = defaultTextColor;
            } else
            {
                i = disabledTextColor;
            }
            view.setTextColor(i);
            view.setText(viewgroup.getTitle());
            return view1;
        }

        public boolean isEnabled(int i)
        {
            return ((MenuItem)getItem(i)).isEnabled();
        }

        public MenuAdapter(Context context, int i)
        {
            this(context, i, i);
        }

        public MenuAdapter(Context context, int i, int j)
        {
            super(context, 0x1090003);
            defaultTextColor = i;
            disabledTextColor = j;
        }
    }

    public static interface MenuCallback
    {

        public abstract boolean onContextItemSelected(MenuItem menuitem, int i);

        public abstract void onCreateContextMenu(Menu menu, int i);
    }

    public static interface MenuCallbackCanceled
    {

        public abstract void onContextMenuCanceled(Menu menu, int i);
    }


    public static final String FRAGMENT_CANCEL_KEY = "context_fragment_cancel";
    public static final String FRAGMENT_KEY = "context_fragment";
    public static final String LIST_POSITION = "list_position";
    public static final String LIST_TITLE = "list_title";
    private MenuAdapter adapter;
    private Object callback;
    private Object cancelCallback;
    private f menuBuilder;

    public ListItemMenuDialog()
    {
        setArguments(new Bundle());
    }

    public static ListItemMenuDialog create(MenuCallback menucallback, MenuCallbackCanceled menucallbackcanceled, CharSequence charsequence, int i)
    {
        ListItemMenuDialog listitemmenudialog = new ListItemMenuDialog();
        Bundle bundle = new Bundle();
        if (menucallback instanceof Fragment)
        {
            Fragment fragment = (Fragment)menucallback;
            fragment.getActivity().getSupportFragmentManager().a(bundle, "context_fragment", fragment);
        }
        if (menucallbackcanceled instanceof Fragment)
        {
            Fragment fragment1 = (Fragment)menucallbackcanceled;
            fragment1.getActivity().getSupportFragmentManager().a(bundle, "context_fragment_cancel", fragment1);
        }
        listitemmenudialog.callback = menucallback;
        listitemmenudialog.cancelCallback = menucallbackcanceled;
        bundle.putInt("list_position", i);
        bundle.putCharSequence("list_title", charsequence);
        listitemmenudialog.setArguments(bundle);
        return listitemmenudialog;
    }

    public static ListItemMenuDialog create(MenuCallback menucallback, CharSequence charsequence, int i)
    {
        return create(menucallback, null, charsequence, i);
    }

    protected void createContextMenuItems()
    {
        int i = getArguments().getInt("list_position");
        if (getCallback() != null)
        {
            ((MenuCallback)getCallback()).onCreateContextMenu(menuBuilder, i);
        }
    }

    protected Object getCallback()
    {
        if (callback != null) goto _L2; else goto _L1
_L1:
        if (!(getActivity() instanceof MenuCallback)) goto _L4; else goto _L3
_L3:
        callback = getActivity();
_L2:
        return callback;
_L4:
        if (getArguments().containsKey("context_fragment"))
        {
            callback = getActivity().getSupportFragmentManager().a(getArguments(), "context_fragment");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected Object getCancelCallback()
    {
        if (cancelCallback != null) goto _L2; else goto _L1
_L1:
        if (!(getActivity() instanceof MenuCallbackCanceled)) goto _L4; else goto _L3
_L3:
        cancelCallback = getActivity();
_L2:
        return cancelCallback;
_L4:
        if (getArguments().containsKey("context_fragment_cancel"))
        {
            cancelCallback = getActivity().getSupportFragmentManager().a(getArguments(), "context_fragment_cancel");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected f getMenuBuilder()
    {
        return menuBuilder;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (cancelCallback != null)
        {
            int i = getArguments().getInt("list_position");
            ((MenuCallbackCanceled)cancelCallback).onContextMenuCanceled(menuBuilder, i);
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (getCallback() != null)
        {
            onItemSelected((MenuItem)adapter.getItem(i));
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        FragmentActivity fragmentactivity = getActivity();
        menuBuilder = new f(fragmentactivity);
        menuBuilder.a(this);
        bundle = getMaterialDialogBuilder(fragmentactivity);
        CharSequence charsequence = getArguments().getCharSequence("list_title");
        if (charsequence != null)
        {
            bundle.a(charsequence);
        }
        int i = fragmentactivity.getResources().getColor(0x7f0f00fe);
        int k = fragmentactivity.getResources().getColor(0x7f0f0114);
        adapter = new MenuAdapter(getActivity(), i, k);
        bundle.a(adapter, this);
        createContextMenuItems();
        for (int j = 0; j < menuBuilder.size(); j++)
        {
            MenuItem menuitem = menuBuilder.getItem(j);
            if (menuitem.isVisible())
            {
                adapter.add(menuitem);
            }
        }

        return bundle.c();
    }

    protected void onItemSelected(MenuItem menuitem)
    {
        int i = getArguments().getInt("list_position");
        ((MenuCallback)getCallback()).onContextItemSelected(menuitem, i);
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        return false;
    }

    public void onMenuModeChange(f f1)
    {
    }

    public void setCallback(MenuCallback menucallback)
    {
        callback = menucallback;
    }
}
