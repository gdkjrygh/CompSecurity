// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.controller;

import com.digby.localpoint.sdk.core.ILPVersion;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.geofence.IGeoFenceListReceiver;
import com.digby.mm.android.library.utils.ILocationHelper;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.ISharedPrefsManager;
import java.util.Comparator;
import java.util.List;

public interface IDigbyController
{

    public abstract void getGeoFences(IFilter ifilter, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException;

    public abstract void getGeoFences(IFilter ifilter, Comparator comparator, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException;

    public abstract void getGeoFences(IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException;

    public abstract void getGeoFences(Comparator comparator, IGeoFenceListReceiver igeofencelistreceiver)
        throws IllegalStateException;

    public abstract ILocationHelper getLocationHelper();

    public abstract List getMessages();

    public abstract List getMessages(IFilter ifilter);

    public abstract List getMessages(IFilter ifilter, Comparator comparator);

    public abstract List getMessages(Comparator comparator);

    public abstract ILPVersion getSDKVersion();

    public abstract ISettings getSettings();

    public abstract ISharedPrefsManager getSharedPrefsManager();

    public abstract boolean isDeviceRegistered();

    public abstract void sendEvent(IEvent ievent, IEventResponseHandler ieventresponsehandler);

    public abstract boolean startLocationServices();

    public abstract void stopLocationServices();
}
