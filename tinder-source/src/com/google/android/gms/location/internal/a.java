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
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;

// Referenced classes of package com.google.android.gms.location.internal:
//            o, h

public class a extends j
{

    protected final o e = new o() {

        final a a;

        public final void a()
        {
            a.a(a);
        }

        public final IInterface b()
            throws DeadObjectException
        {
            return (h)a.m();
        }

            
            {
                a = a.this;
                super();
            }
    };
    private final String f;

    public a(Context context, Looper looper, com.google.android.gms.common.api.c.b b, com.google.android.gms.common.api.c.c c, String s, g g)
    {
        super(context, looper, 23, g, b, c);
        f = s;
    }

    static void a(a a1)
    {
        a1.l();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return h.a.a(ibinder);
    }

    protected final String e()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String f()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final Bundle k()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", f);
        return bundle;
    }
}
