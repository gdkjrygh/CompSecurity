// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

    private final zzi a;

    public Marker(zzi zzi1)
    {
        a = (zzi)zzu.a(zzi1);
    }

    public void a()
    {
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void a(float f1)
    {
        try
        {
            a.a(f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void a(float f1, float f2)
    {
        try
        {
            a.b(f1, f2);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void a(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            a.a(bitmapdescriptor.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDescriptor bitmapdescriptor)
        {
            throw new RuntimeRemoteException(bitmapdescriptor);
        }
    }

    public void a(LatLng latlng)
    {
        try
        {
            a.a(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void a(String s)
    {
        try
        {
            a.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void a(boolean flag)
    {
        try
        {
            a.b(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public String b()
    {
        String s;
        try
        {
            s = a.b();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public void b(float f1)
    {
        try
        {
            a.b(f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public String c()
    {
        String s;
        try
        {
            s = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public void d()
    {
        try
        {
            a.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void e()
    {
        try
        {
            a.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
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
            flag = a.a(((Marker)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public boolean f()
    {
        boolean flag;
        try
        {
            flag = a.j();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
