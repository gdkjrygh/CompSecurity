// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.model.internal.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, LatLng

public final class Circle
{

    private final b aar;

    public Circle(b b1)
    {
        aar = (b)hm.f(b1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Circle))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = aar.a(((Circle)obj).aar);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public LatLng getCenter()
    {
        LatLng latlng;
        try
        {
            latlng = aar.getCenter();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public int getFillColor()
    {
        int i;
        try
        {
            i = aar.getFillColor();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public String getId()
    {
        String s;
        try
        {
            s = aar.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public double getRadius()
    {
        double d;
        try
        {
            d = aar.getRadius();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return d;
    }

    public int getStrokeColor()
    {
        int i;
        try
        {
            i = aar.getStrokeColor();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public float getStrokeWidth()
    {
        float f;
        try
        {
            f = aar.getStrokeWidth();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public float getZIndex()
    {
        float f;
        try
        {
            f = aar.getZIndex();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = aar.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = aar.isVisible();
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
            aar.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setCenter(LatLng latlng)
    {
        try
        {
            aar.setCenter(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setFillColor(int i)
    {
        try
        {
            aar.setFillColor(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setRadius(double d)
    {
        try
        {
            aar.setRadius(d);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setStrokeColor(int i)
    {
        try
        {
            aar.setStrokeColor(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setStrokeWidth(float f)
    {
        try
        {
            aar.setStrokeWidth(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            aar.setVisible(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZIndex(float f)
    {
        try
        {
            aar.setZIndex(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
