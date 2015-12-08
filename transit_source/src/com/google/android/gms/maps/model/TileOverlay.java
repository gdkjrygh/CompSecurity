// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class TileOverlay
{

    private final f qO;

    public TileOverlay(f f1)
    {
        qO = (f)dm.e(f1);
    }

    public void clearTileCache()
    {
        try
        {
            qO.clearTileCache();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof TileOverlay))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = qO.a(((TileOverlay)obj).qO);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public String getId()
    {
        String s;
        try
        {
            s = qO.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public float getZIndex()
    {
        float f1;
        try
        {
            f1 = qO.getZIndex();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = qO.hashCodeRemote();
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
            flag = qO.isVisible();
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
            qO.remove();
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
            qO.setVisible(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZIndex(float f1)
    {
        try
        {
            qO.setZIndex(f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
