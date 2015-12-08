// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.common.api:
//            a, Status

public static abstract class c extends c
    implements c
{

    private us AL;
    private final c Az;

    private void a(RemoteException remoteexception)
    {
        k(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    protected abstract void a(a a1)
        throws RemoteException;

    public void a(a a1)
    {
        AL = a1;
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

    public final c ea()
    {
        return Az;
    }

    protected void ec()
    {
        super.ec();
        if (AL != null)
        {
            AL.b(this);
            AL = null;
        }
    }

    public int ef()
    {
        return 0;
    }

    public final void k(Status status)
    {
        boolean flag;
        if (!status.isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Failed result must not be success");
        a(d(status));
    }

    protected c(c c)
    {
        Az = (c)fq.f(c);
    }
}
