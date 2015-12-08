// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.model.a.p;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, LatLng

public final class e
{

    private final p a;

    public e(p p1)
    {
        a = (p)u.a(p1);
    }

    public LatLng a()
    {
        LatLng latlng;
        try
        {
            latlng = a.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return latlng;
    }

    public String b()
    {
        String s;
        try
        {
            s = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return s;
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
            throw new f(((RemoteException) (obj)));
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
            throw new f(remoteexception);
        }
        return i;
    }
}
