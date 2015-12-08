// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{

    private final IUiSettingsDelegate pV;

    UiSettings(IUiSettingsDelegate iuisettingsdelegate)
    {
        pV = iuisettingsdelegate;
    }

    public boolean isCompassEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isCompassEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isMyLocationButtonEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isMyLocationButtonEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isRotateGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isRotateGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isScrollGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isScrollGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isTiltGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isTiltGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomControlsEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isZoomControlsEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = pV.isZoomGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void setAllGesturesEnabled(boolean flag)
    {
        try
        {
            pV.setAllGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setCompassEnabled(boolean flag)
    {
        try
        {
            pV.setCompassEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setMyLocationButtonEnabled(boolean flag)
    {
        try
        {
            pV.setMyLocationButtonEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setRotateGesturesEnabled(boolean flag)
    {
        try
        {
            pV.setRotateGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setScrollGesturesEnabled(boolean flag)
    {
        try
        {
            pV.setScrollGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setTiltGesturesEnabled(boolean flag)
    {
        try
        {
            pV.setTiltGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomControlsEnabled(boolean flag)
    {
        try
        {
            pV.setZoomControlsEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomGesturesEnabled(boolean flag)
    {
        try
        {
            pV.setZoomGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
