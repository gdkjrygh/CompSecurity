// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;

public class Navigator
{

    public static final int GOOGLE_NAVIGATION = 0;
    private static final String MARKET_GOOGLE_MAPS_URI = "market://details?id=com.google.android.apps.maps";
    public static final int WAZE_NAVIGATION = 1;
    public static final String WAZE_URI = "market://details?id=com.waze";
    private final Context context;
    private final ILyftPreferences lyftPreferences;

    public Navigator(Context context1, ILyftPreferences ilyftpreferences)
    {
        context = context1;
        lyftPreferences = ilyftpreferences;
    }

    private static Intent createNavigationIntent(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            s = new Intent("android.intent.action.MAIN");
            s.setClassName("com.google.android.apps.maps", "com.google.android.maps.driveabout.app.DestinationActivity");
            s.addCategory("android.intent.category.LAUNCHER");
            return s;
        } else
        {
            s = Uri.encode(s);
            return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("google.navigation:q=").append(s).toString()));
        }
    }

    public static int getNavigationResourceIdByIndex(int i)
    {
        return i != 1 ? 0x7f070209 : 0x7f07020a;
    }

    private void startGoogleNavigation(Location location)
    {
        if (location.isNull())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        location = createNavigationIntent(location.getRoutableLatLng());
_L1:
        location.addFlags(0x10008000);
        context.startActivity(location);
        return;
        try
        {
            location = createNavigationIntent(null);
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            startGoogleNavigationInstall();
            return;
        }
          goto _L1
    }

    private void startGoogleNavigationInstall()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.maps"));
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    private void startNavigation(Location location, int i)
    {
        if (i == 1)
        {
            startWazeNavigation(location);
            return;
        } else
        {
            startGoogleNavigation(location);
            return;
        }
    }

    public boolean isWazeInstalled()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("waze://?z=8"));
        return context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    public void navigate(Location location)
    {
        startNavigation(location, lyftPreferences.getSelectedNavigation());
    }

    public void startWazeInstall()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.waze"));
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public void startWazeNavigation(Location location)
    {
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        location = (new StringBuilder()).append("waze://?ll=").append(location.getLat()).append(",").append(location.getLng()).append("&navigate=yes").toString();
_L1:
        location = new Intent("android.intent.action.VIEW", Uri.parse(location));
        location.addFlags(0x10008000);
        context.startActivity(location);
        return;
        location = "waze://?z=8";
          goto _L1
        location;
        startWazeInstall();
        return;
    }
}
