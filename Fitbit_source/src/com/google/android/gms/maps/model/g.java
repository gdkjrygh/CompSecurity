// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.internal.m;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, a, LatLng

public final class g
{

    private final m a;

    public g(m m1)
    {
        a = (m)am.a(m1);
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
            a.a(f1, f2);
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

    public void a(a a1)
    {
        try
        {
            a.a(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new RuntimeRemoteException(a1);
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

    public void b(float f1, float f2)
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

    public void b(String s)
    {
        try
        {
            a.b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void b(boolean flag)
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

    public void c(boolean flag)
    {
        try
        {
            a.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public String d()
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

    public String e()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof g))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((g)obj).a);
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
            flag = a.f();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void g()
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

    public void h()
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

    public int hashCode()
    {
        int i1;
        try
        {
            i1 = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i1;
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

    public boolean j()
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

    public boolean k()
    {
        boolean flag;
        try
        {
            flag = a.l();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public float l()
    {
        float f1;
        try
        {
            f1 = a.m();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public float m()
    {
        float f1;
        try
        {
            f1 = a.n();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }
}
