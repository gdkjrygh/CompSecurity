// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.support.v7.app.MediaRouteButton;
import android.view.KeyEvent;
import android.view.Menu;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.cast:
//            CastConnectionHelper

public class NoOpCastConnectionHelper extends DefaultActivityLightCycle
    implements CastConnectionHelper
{

    public NoOpCastConnectionHelper()
    {
    }

    public void addMediaRouterButton(MediaRouteButton mediaroutebutton)
    {
    }

    public void addMediaRouterButton(Menu menu, int i)
    {
    }

    public void addOnConnectionChangeListener(CastConnectionHelper.OnConnectionChangeListener onconnectionchangelistener)
    {
    }

    public String getDeviceName()
    {
        return "";
    }

    public boolean isCasting()
    {
        return false;
    }

    public boolean onDispatchVolumeEvent(KeyEvent keyevent)
    {
        return false;
    }

    public void reconnectSessionIfPossible()
    {
    }

    public void removeMediaRouterButton(MediaRouteButton mediaroutebutton)
    {
    }

    public void removeOnConnectionChangeListener(CastConnectionHelper.OnConnectionChangeListener onconnectionchangelistener)
    {
    }
}
