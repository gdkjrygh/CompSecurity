// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            aa, ai, ck, cf

public class ca extends aa
{

    protected final ck d = new ck() {

        final ca a;

        public void a()
        {
            ca.a(a);
        }

        public cf b()
            throws DeadObjectException
        {
            return (cf)a.k();
        }

        public IInterface c()
            throws DeadObjectException
        {
            return b();
        }

            
            {
                a = ca.this;
                super();
            }
    };
    private final String e;

    public ca(Context context, Looper looper, com.google.android.gms.common.api.h.b b, com.google.android.gms.common.api.h.c c1, String s)
    {
        super(context, looper, b, c1, new String[0]);
        e = s;
    }

    static void a(ca ca1)
    {
        ca1.j();
    }

    protected IInterface a(IBinder ibinder)
    {
        return c(ibinder);
    }

    protected void a(ai ai1, aa.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        ai1.e(e1, 0x648278, g().getPackageName(), bundle);
    }

    protected cf c(IBinder ibinder)
    {
        return cf.a.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String e()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
