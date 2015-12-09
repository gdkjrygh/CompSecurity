// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.internal.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class i
{

    private final b a;

    public i(b b1)
    {
        a = (b)am.a(b1);
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

    public void a(List list)
    {
        try
        {
            a.a(list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new RuntimeRemoteException(list);
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

    public List c()
    {
        List list;
        try
        {
            list = a.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return list;
    }

    public float d()
    {
        float f1;
        try
        {
            f1 = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public int e()
    {
        int j;
        try
        {
            j = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return j;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof i))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((i)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public float f()
    {
        float f1;
        try
        {
            f1 = a.f();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public boolean g()
    {
        boolean flag;
        try
        {
            flag = a.g();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean h()
    {
        boolean flag;
        try
        {
            flag = a.h();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public int hashCode()
    {
        int j;
        try
        {
            j = a.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return j;
    }
}
