// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class aty
{

    private final ava a;

    aty(ava ava1)
    {
        a = ava1;
    }

    public final void a()
    {
        try
        {
            a.c(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void a(boolean flag)
    {
        try
        {
            a.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void b()
    {
        try
        {
            a.h(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void b(boolean flag)
    {
        try
        {
            a.b(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void c()
    {
        try
        {
            a.j(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void c(boolean flag)
    {
        try
        {
            a.d(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final void d(boolean flag)
    {
        try
        {
            a.e(flag);
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
            flag = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return flag;
    }

    public final void e(boolean flag)
    {
        try
        {
            a.f(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }

    public final boolean e()
    {
        boolean flag;
        try
        {
            flag = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return flag;
    }

    public final void f(boolean flag)
    {
        try
        {
            a.g(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
    }
}
