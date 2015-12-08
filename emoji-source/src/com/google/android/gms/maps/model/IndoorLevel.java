// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.model.internal.e;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class IndoorLevel
{

    private final e aaJ;

    public IndoorLevel(e e1)
    {
        aaJ = (e)hm.f(e1);
    }

    public void activate()
    {
        try
        {
            aaJ.activate();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof IndoorLevel))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = aaJ.a(((IndoorLevel)obj).aaJ);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public String getName()
    {
        String s;
        try
        {
            s = aaJ.getName();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public String getShortName()
    {
        String s;
        try
        {
            s = aaJ.getShortName();
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
            i = aaJ.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
