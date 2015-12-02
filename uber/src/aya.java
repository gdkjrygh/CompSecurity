// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import java.util.List;

public final class aya
{

    private final aye a;

    public aya(aye aye1)
    {
        a = (aye)wn.a(aye1);
    }

    public final void a()
    {
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final List b()
    {
        List list;
        try
        {
            list = a.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return list;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof aya))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((aya)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ayb(((RemoteException) (obj)));
        }
        return flag;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = a.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return i;
    }
}
