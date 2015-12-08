// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.internal.d;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

    private final d qz;

    public Marker(d d1)
    {
        qz = (d)dm.e(d1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Marker))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = qz.h(((Marker)obj).qz);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public float getAlpha()
    {
        float f;
        try
        {
            f = qz.getAlpha();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getId()
    {
        String s;
        try
        {
            s = qz.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public LatLng getPosition()
    {
        LatLng latlng;
        try
        {
            latlng = qz.getPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public float getRotation()
    {
        float f;
        try
        {
            f = qz.getRotation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getSnippet()
    {
        String s;
        try
        {
            s = qz.getSnippet();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public String getTitle()
    {
        String s;
        try
        {
            s = qz.getTitle();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = qz.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public void hideInfoWindow()
    {
        try
        {
            qz.hideInfoWindow();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean isDraggable()
    {
        boolean flag;
        try
        {
            flag = qz.isDraggable();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isFlat()
    {
        boolean flag;
        try
        {
            flag = qz.isFlat();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isInfoWindowShown()
    {
        boolean flag;
        try
        {
            flag = qz.isInfoWindowShown();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = qz.isVisible();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void remove()
    {
        try
        {
            qz.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAlpha(float f)
    {
        try
        {
            qz.setAlpha(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAnchor(float f, float f1)
    {
        try
        {
            qz.setAnchor(f, f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setDraggable(boolean flag)
    {
        try
        {
            qz.setDraggable(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFlat(boolean flag)
    {
        try
        {
            qz.setFlat(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setIcon(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            qz.i(bitmapdescriptor.cs());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDescriptor bitmapdescriptor)
        {
            throw new RuntimeRemoteException(bitmapdescriptor);
        }
    }

    public void setInfoWindowAnchor(float f, float f1)
    {
        try
        {
            qz.setInfoWindowAnchor(f, f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setPosition(LatLng latlng)
    {
        try
        {
            qz.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setRotation(float f)
    {
        try
        {
            qz.setRotation(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setSnippet(String s)
    {
        try
        {
            qz.setSnippet(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setTitle(String s)
    {
        try
        {
            qz.setTitle(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            qz.setVisible(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void showInfoWindow()
    {
        try
        {
            qz.showInfoWindow();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
