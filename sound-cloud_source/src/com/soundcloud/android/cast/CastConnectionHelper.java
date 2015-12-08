// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.support.v7.app.MediaRouteButton;
import android.view.KeyEvent;
import android.view.Menu;
import com.soundcloud.lightcycle.ActivityLightCycle;

public interface CastConnectionHelper
    extends ActivityLightCycle
{
    public static interface OnConnectionChangeListener
    {

        public abstract void onCastConnectionChange();
    }


    public abstract void addMediaRouterButton(MediaRouteButton mediaroutebutton);

    public abstract void addMediaRouterButton(Menu menu, int i);

    public abstract void addOnConnectionChangeListener(OnConnectionChangeListener onconnectionchangelistener);

    public abstract String getDeviceName();

    public abstract boolean isCasting();

    public abstract boolean onDispatchVolumeEvent(KeyEvent keyevent);

    public abstract void reconnectSessionIfPossible();

    public abstract void removeMediaRouterButton(MediaRouteButton mediaroutebutton);

    public abstract void removeOnConnectionChangeListener(OnConnectionChangeListener onconnectionchangelistener);
}
