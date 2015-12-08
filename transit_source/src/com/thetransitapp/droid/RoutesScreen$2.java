// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen, LocationScreen

class this._cls0
    implements com.actionbarsherlock.view.ItemClickListener
{

    final RoutesScreen this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        Object obj = new Bundle();
        if (getLastLocation() != null)
        {
            ((Bundle) (obj)).putDouble("latitude", getLastLocation().getLatitude());
            ((Bundle) (obj)).putDouble("longitude", getLastLocation().getLongitude());
        }
        menuitem = new LocationScreen();
        menuitem.setArguments(((Bundle) (obj)));
        obj = getActivity().getSupportFragmentManager().beginTransaction();
        ((FragmentTransaction) (obj)).replace(0x7f05003a, menuitem, .TransitScreen.LOCATION_SCREEN.name());
        ((FragmentTransaction) (obj)).addToBackStack(.TransitScreen.LOCATION_SCREEN.name());
        ((FragmentTransaction) (obj)).commit();
        return true;
    }

    ion()
    {
        this$0 = RoutesScreen.this;
        super();
    }
}
