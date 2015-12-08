// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.MediaRouteButton;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.cast:
//            CastConnectionHelper

public class DefaultCastConnectionHelper extends VideoCastConsumerImpl
    implements CastConnectionHelper
{

    private static final int EXPECTED_MEDIA_BUTTON_CAPACITY = 6;
    private final Set connectionChangeListeners = new HashSet();
    private boolean isCastableDeviceAvailable;
    private final Set mediaRouteButtons = new HashSet(6);
    private final VideoCastManager videoCastManager;

    public DefaultCastConnectionHelper(VideoCastManager videocastmanager)
    {
        videoCastManager = videocastmanager;
        videocastmanager.addVideoCastConsumer(this);
    }

    private void notifyConnectionChange()
    {
        for (Iterator iterator = connectionChangeListeners.iterator(); iterator.hasNext(); ((CastConnectionHelper.OnConnectionChangeListener)iterator.next()).onCastConnectionChange()) { }
    }

    private void updateMediaRouteButtonVisibility(MediaRouteButton mediaroutebutton)
    {
        int i;
        if (isCastableDeviceAvailable)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        mediaroutebutton.setVisibility(i);
    }

    private void updateMediaRouteButtons()
    {
        for (Iterator iterator = mediaRouteButtons.iterator(); iterator.hasNext(); updateMediaRouteButtonVisibility((MediaRouteButton)iterator.next())) { }
    }

    public void addMediaRouterButton(MediaRouteButton mediaroutebutton)
    {
        videoCastManager.addMediaRouterButton(mediaroutebutton);
        mediaRouteButtons.add(mediaroutebutton);
        updateMediaRouteButtonVisibility(mediaroutebutton);
    }

    public void addMediaRouterButton(Menu menu, int i)
    {
        videoCastManager.addMediaRouterButton(menu, i);
    }

    public void addOnConnectionChangeListener(CastConnectionHelper.OnConnectionChangeListener onconnectionchangelistener)
    {
        connectionChangeListeners.add(onconnectionchangelistener);
    }

    public String getDeviceName()
    {
        return videoCastManager.getDeviceName();
    }

    public boolean isCasting()
    {
        return videoCastManager.isConnected();
    }

    public void onCastAvailabilityChanged(boolean flag)
    {
        isCastableDeviceAvailable = flag;
        updateMediaRouteButtons();
    }

    public void onConnected()
    {
        notifyConnectionChange();
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
    }

    public void onDisconnected()
    {
        notifyConnectionChange();
    }

    public boolean onDispatchVolumeEvent(KeyEvent keyevent)
    {
        return videoCastManager.onDispatchVolumeKeyEvent(keyevent, 0.10000000000000001D);
    }

    public volatile void onNewIntent(Activity activity, Intent intent)
    {
        onNewIntent((AppCompatActivity)activity, intent);
    }

    public void onNewIntent(AppCompatActivity appcompatactivity, Intent intent)
    {
    }

    public volatile boolean onOptionsItemSelected(Activity activity, MenuItem menuitem)
    {
        return onOptionsItemSelected((AppCompatActivity)activity, menuitem);
    }

    public boolean onOptionsItemSelected(AppCompatActivity appcompatactivity, MenuItem menuitem)
    {
        return false;
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        videoCastManager.stopCastDiscovery();
        videoCastManager.decrementUiCounter();
    }

    public volatile void onRestoreInstanceState(Activity activity, Bundle bundle)
    {
        onRestoreInstanceState((AppCompatActivity)activity, bundle);
    }

    public void onRestoreInstanceState(AppCompatActivity appcompatactivity, Bundle bundle)
    {
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        videoCastManager.startCastDiscovery();
        videoCastManager.incrementUiCounter();
    }

    public volatile void onSaveInstanceState(Activity activity, Bundle bundle)
    {
        onSaveInstanceState((AppCompatActivity)activity, bundle);
    }

    public void onSaveInstanceState(AppCompatActivity appcompatactivity, Bundle bundle)
    {
    }

    public volatile void onStart(Activity activity)
    {
        onStart((AppCompatActivity)activity);
    }

    public void onStart(AppCompatActivity appcompatactivity)
    {
    }

    public volatile void onStop(Activity activity)
    {
        onStop((AppCompatActivity)activity);
    }

    public void onStop(AppCompatActivity appcompatactivity)
    {
    }

    public void reconnectSessionIfPossible()
    {
        videoCastManager.reconnectSessionIfPossible();
    }

    public void removeMediaRouterButton(MediaRouteButton mediaroutebutton)
    {
        mediaRouteButtons.remove(mediaroutebutton);
    }

    public void removeOnConnectionChangeListener(CastConnectionHelper.OnConnectionChangeListener onconnectionchangelistener)
    {
        connectionChangeListeners.remove(onconnectionchangelistener);
    }
}
