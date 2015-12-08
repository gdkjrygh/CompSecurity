// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.common.api:
//            a, Status

public static abstract class c extends c
    implements c
{

    private final c Dk;
    private c Dv;

    private void a(RemoteException remoteexception)
    {
        m(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    protected abstract void a(a a1)
        throws RemoteException;

    public void a(a a1)
    {
        Dv = a1;
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

    public int eB()
    {
        return 0;
    }

    public final c ew()
    {
        return Dk;
    }

    protected void ey()
    {
        super.ey();
        if (Dv != null)
        {
            Dv.b(this);
            Dv = null;
        }
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
        hn.b(flag, "Failed result must not be success");
        b(c(status));
    }

    protected c(c c)
    {
        Dk = (c)hn.f(c);
    }
}
