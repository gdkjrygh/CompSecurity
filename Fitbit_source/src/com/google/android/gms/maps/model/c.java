// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.internal.i;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, LatLng

public final class c
{

    private final i a;

    public c(i j)
    {
        a = (i)am.a(j);
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

    public void a(double d1)
    {
        try
        {
            a.a(d1);
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

    public void a(int j)
    {
        try
        {
            a.a(j);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
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

    public void a(boolean flag)
    {
        try
        {
            a.a(flag);
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

    public void b(int j)
    {
        try
        {
            a.b(j);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public LatLng c()
    {
        LatLng latlng;
        try
        {
            latlng = a.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public double d()
    {
        double d1;
        try
        {
            d1 = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return d1;
    }

    public float e()
    {
        float f1;
        try
        {
            f1 = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof c))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((c)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int f()
    {
        int j;
        try
        {
            j = a.f();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return j;
    }

    public int g()
    {
        int j;
        try
        {
            j = a.g();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return j;
    }

    public float h()
    {
        float f1;
        try
        {
            f1 = a.h();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public int hashCode()
    {
        int j;
        try
        {
            j = a.j();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return j;
    }

    public boolean i()
    {
        boolean flag;
        try
        {
            flag = a.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }
}
