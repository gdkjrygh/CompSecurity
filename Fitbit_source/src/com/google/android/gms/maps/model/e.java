// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.internal.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, f

public final class e
{

    private final k a;

    public e(k k1)
    {
        a = (k)am.a(k1);
    }

    public int a()
    {
        int i;
        try
        {
            i = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public int b()
    {
        int i;
        try
        {
            i = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public List c()
    {
        Object obj;
        try
        {
            Object obj1 = a.c();
            obj = new ArrayList(((List) (obj1)).size());
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new f(com.google.android.gms.maps.model.internal.l.a.a((IBinder)((Iterator) (obj1)).next())))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return ((List) (obj));
    }

    public boolean d()
    {
        boolean flag;
        try
        {
            flag = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof e))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((e)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
