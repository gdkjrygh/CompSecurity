// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.actions;

import com.accuweather.android.models.location.LocationModel;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class LocationMode
    implements com.actionbarsherlock.view.ActionMode.Callback
{
    public static interface ILocationModeListener
    {

        public abstract void onActionItemClicked(LocationModel locationmodel, ActionMode actionmode, MenuItem menuitem);
    }


    private ILocationModeListener mListener;
    private LocationModel mLocation;
    private boolean mShouldShowDelete;

    public LocationMode(LocationModel locationmodel)
    {
        mShouldShowDelete = true;
        mLocation = locationmodel;
    }

    private static String getEllipsizedName(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s.length() < 10)
        {
            return s;
        } else
        {
            stringbuilder.append(s.substring(0, 9)).append("...");
            return stringbuilder.toString();
        }
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        mListener.onActionItemClicked(mLocation, actionmode, menuitem);
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        menu.add(getEllipsizedName(mLocation.getAliasedName())).setShowAsAction(2);
        menu.add(com.accuweather.android.R.string.HomeLocation).setIcon(com.accuweather.android.R.drawable.ic_menu_home).setShowAsAction(2);
        if (mShouldShowDelete)
        {
            menu.add(com.accuweather.android.R.string.Delete).setIcon(com.accuweather.android.R.drawable.ic_menu_delete).setShowAsAction(2);
        }
        menu.add(com.accuweather.android.R.string.Nickname).setShowAsAction(0);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return false;
    }

    public void setDeleteVisible(boolean flag)
    {
        mShouldShowDelete = flag;
    }

    public void setLocationModeListener(ILocationModeListener ilocationmodelistener)
    {
        mListener = ilocationmodelistener;
    }
}
