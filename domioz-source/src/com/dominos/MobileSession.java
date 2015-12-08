// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos;

import android.content.Context;
import com.dominos.analytics.facebook.FacebookManager_;
import com.dominos.android.sdk.app.Session;
import com.dominos.beacon.manager.BeaconManager_;
import com.dominos.beacon.manager.GeofenceManager_;
import com.dominos.news.manager.PushManager_;
import java.util.ArrayList;
import java.util.List;

public class MobileSession extends Session
{

    public static final String BEACON_MANAGER = "beacon_manager";
    public static final String FACEBOOK_MANAGER = "facebook_manager";
    public static final String GEOFENCE_MANAGER = "geofence_manager";
    public static final String PUSH_MANAGER = "push_manager";

    public MobileSession(Context context)
    {
        super(context);
    }

    protected List getChannelManagers(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(PushManager_.getInstance_(context));
        arraylist.add(BeaconManager_.getInstance_(context));
        arraylist.add(GeofenceManager_.getInstance_(context));
        arraylist.add(FacebookManager_.getInstance_(context));
        return arraylist;
    }
}
