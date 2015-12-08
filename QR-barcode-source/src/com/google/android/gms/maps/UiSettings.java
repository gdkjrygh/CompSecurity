// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{

    private final IUiSettingsDelegate ajw;

    UiSettings(IUiSettingsDelegate iuisettingsdelegate)
    {
        ajw = iuisettingsdelegate;
    }

    public boolean isCompassEnabled()
    {
        boolean flag;
        try
        {
            flag = ajw.isCompassEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isIndoorLevelPickerEnabled()
    {
        boolean flag;
        try
        {
            flag = ajw.isIndoorLevelPickerEnabled();
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
            flag = ajw.isMyLocationButtonEnabled();
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
            flag = ajw.isRotateGesturesEnabled();
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
            flag = ajw.isScrollGesturesEnabled();
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
            flag = ajw.isTiltGesturesEnabled();
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
            flag = ajw.isZoomControlsEnabled();
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
            flag = ajw.isZoomGesturesEnabled();
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
            ajw.setAllGesturesEnabled(flag);
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
            ajw.setCompassEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setIndoorLevelPickerEnabled(boolean flag)
    {
        try
        {
            ajw.setIndoorLevelPickerEnabled(flag);
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
            ajw.setMyLocationButtonEnabled(flag);
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
            ajw.setRotateGesturesEnabled(flag);
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
            ajw.setScrollGesturesEnabled(flag);
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
            ajw.setTiltGesturesEnabled(flag);
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
            ajw.setZoomControlsEnabled(flag);
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
            ajw.setZoomGesturesEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
