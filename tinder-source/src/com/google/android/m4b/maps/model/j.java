// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.internal.k;

// Referenced classes of package com.google.android.m4b.maps.model:
//            RuntimeRemoteException, LatLng

public final class j
{

    public final k a;

    public j(k k1)
    {
        a = (k)x.a(k1);
    }

    public final LatLng a()
    {
        LatLng latlng;
        try
        {
            latlng = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public final void b()
    {
        try
        {
            a.a(true);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final boolean c()
    {
        boolean flag;
        try
        {
            flag = a.p();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void d()
    {
        try
        {
            a.r();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof j))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((j)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = a.C();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
