// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;

// Referenced classes of package org.xbmc.kore.ui:
//            NavigationDrawerFragment

class  extends ActionBarDrawerToggle
{

    final NavigationDrawerFragment this$0;

    public void onDrawerClosed(View view)
    {
        super.onDrawerClosed(view);
        if (!isAdded())
        {
            return;
        } else
        {
            NavigationDrawerFragment.access$100(NavigationDrawerFragment.this);
            getActivity().invalidateOptionsMenu();
            return;
        }
    }

    public void onDrawerOpened(View view)
    {
        super.onDrawerOpened(view);
        if (!isAdded())
        {
            return;
        } else
        {
            NavigationDrawerFragment.access$100(NavigationDrawerFragment.this);
            getActivity().invalidateOptionsMenu();
            return;
        }
    }

    (Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this$0 = NavigationDrawerFragment.this;
        super(activity, drawerlayout, i, j);
    }
}
