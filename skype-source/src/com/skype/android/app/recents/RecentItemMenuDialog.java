// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.Menu;
import android.view.MenuItem;
import com.skype.ObjectInterface;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.ListItemMenuDialog;
import com.skype.android.skylib.ObjectIdMap;

public class RecentItemMenuDialog extends ListItemMenuDialog
{
    public static interface MenuCallback
    {

        public abstract boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface);

        public abstract void onCreateContextMenu(Menu menu, ObjectInterface objectinterface);
    }


    ObjectIdMap map;
    private Class objectClass;
    private ObjectInterface objectInterface;

    public RecentItemMenuDialog()
    {
    }

    public static RecentItemMenuDialog create(MenuCallback menucallback, CharSequence charsequence, Class class1, int i)
    {
        RecentItemMenuDialog recentitemmenudialog = new RecentItemMenuDialog();
        recentitemmenudialog.objectClass = class1;
        class1 = new Bundle();
        if (menucallback instanceof Fragment)
        {
            menucallback = (Fragment)menucallback;
            menucallback.getActivity().getSupportFragmentManager().a(class1, "context_fragment", menucallback);
        }
        class1.putInt("com.skype.objId", i);
        class1.putCharSequence("list_title", charsequence);
        recentitemmenudialog.setArguments(class1);
        return recentitemmenudialog;
    }

    protected void createContextMenuItems()
    {
        int i = getArguments().getInt("com.skype.objId");
        MenuCallback menucallback;
        if (i > 0)
        {
            objectInterface = map.a(i, objectClass);
        } else
        {
            objectInterface = null;
        }
        menucallback = (MenuCallback)getCallback();
        if (menucallback != null)
        {
            menucallback.onCreateContextMenu(getMenuBuilder(), objectInterface);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    protected void onItemSelected(MenuItem menuitem)
    {
        MenuCallback menucallback = (MenuCallback)getCallback();
        if (menucallback != null)
        {
            menucallback.onContextItemSelected(menuitem, objectInterface);
        }
    }
}
