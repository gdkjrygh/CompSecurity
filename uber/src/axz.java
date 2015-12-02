// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class axz
{

    private final ayq a;

    public axz(ayq ayq1)
    {
        a = (ayq)wn.a(ayq1);
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

    public final void a(float f)
    {
        try
        {
            a.d(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void a(float f, float f1)
    {
        try
        {
            a.a(f, f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void a(axw axw1)
    {
        try
        {
            a.a(axw1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (axw axw1)
        {
            throw new ayb(axw1);
        }
    }

    public final float b()
    {
        float f;
        try
        {
            f = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return f;
    }

    public final void c()
    {
        try
        {
            a.a(true);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final boolean d()
    {
        boolean flag;
        try
        {
            flag = a.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return flag;
    }

    public final float e()
    {
        float f;
        try
        {
            f = a.j();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return f;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof axz))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((axz)obj).a);
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
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return i;
    }
}
