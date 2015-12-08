// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class Polyline
{

    private final IPolylineDelegate a;

    public Polyline(IPolylineDelegate ipolylinedelegate)
    {
        a = (IPolylineDelegate)zzu.a(ipolylinedelegate);
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

    public void a(int i)
    {
        try
        {
            a.a(i);
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

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Polyline))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((Polyline)obj).a);
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
            i = a.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
