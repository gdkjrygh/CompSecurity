// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class MenuItemSingleton
{
    public static interface ChangeListener
    {

        public abstract void dataChanged();
    }


    private static MenuItemSingleton _instance = new MenuItemSingleton();
    private ArrayList items;
    private ChangeListener listener;

    private MenuItemSingleton()
    {
        items = new ArrayList();
        listener = null;
    }

    public static MenuItemSingleton getInstance()
    {
        return _instance;
    }

    public void addMenuItem(final MenuItem item)
    {
        AppHelper.runOnUiThread(new Runnable() {

            final MenuItemSingleton this$0;
            final MenuItem val$item;

            public void run()
            {
                items.add(item);
                if (listener != null)
                {
                    listener.dataChanged();
                }
            }

            
            {
                this$0 = MenuItemSingleton.this;
                item = menuitem;
                super();
            }
        });
    }

    public void clear()
    {
        AppHelper.runOnUiThread(new Runnable() {

            final MenuItemSingleton this$0;

            public void run()
            {
                items.clear();
                if (listener != null)
                {
                    listener.dataChanged();
                }
            }

            
            {
                this$0 = MenuItemSingleton.this;
                super();
            }
        });
    }

    public List getItems()
    {
        return items;
    }

    public void registerListener(ChangeListener changelistener)
    {
        listener = changelistener;
    }



}
