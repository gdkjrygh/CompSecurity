// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;

// Referenced classes of package com.google.android.gms.location.internal:
//            m, f

public class a extends m
{

    protected final com.google.android.gms.location.internal.m a = new com.google.android.gms.location.internal.m() {

        final a a;

        public final void a()
        {
            a.a(a);
        }

        public final IInterface b()
            throws DeadObjectException
        {
            return (f)a.n();
        }

            
            {
                a = a.this;
                super();
            }
    };
    private final String e;

    public a(Context context, Looper looper, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c, String s, i i)
    {
        super(context, looper, 23, i, b1, c);
        e = s;
    }

    static void a(a a1)
    {
        a1.m();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return f.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle l()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        return bundle;
    }
}
