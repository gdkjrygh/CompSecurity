// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.common.api:
//            a, Status

public static abstract class c extends c
    implements c
{

    private final c Dn;
    private c Dy;

    private void a(RemoteException remoteexception)
    {
        m(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    protected abstract void a(a a1)
        throws RemoteException;

    public void a(a a1)
    {
        Dy = a1;
    }

    public final void b(a a1)
        throws DeadObjectException
    {
        a(new <init>(a1.getLooper()));
        try
        {
            a(a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a(a1);
            throw a1;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a(a1);
        }
    }

    public final c eB()
    {
        return Dn;
    }

    protected void eD()
    {
        super.eD();
        if (Dy != null)
        {
            Dy.b(this);
            Dy = null;
        }
    }

    public int eG()
    {
        return 0;
    }

    public final void m(Status status)
    {
        boolean flag;
        if (!status.isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Failed result must not be success");
        b(c(status));
    }

    protected c(c c)
    {
        Dn = (c)hm.f(c);
    }
}
