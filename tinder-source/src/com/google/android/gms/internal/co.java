// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            c, df, cs, zzr, 
//            b, zza

public final class co
{
    public static interface a
    {
    }

    private final class b extends cs
        implements dv.b
    {

        final co a;

        public final void a(Object obj)
        {
            super.b(obj);
        }

        private b()
        {
            a = co.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    static df a;
    public static final a b = new a() {

    };
    private static final Object c = new Object();

    public co(Context context)
    {
        a = a(context);
    }

    private static df a(Context context)
    {
        synchronized (c)
        {
            if (a == null)
            {
                a = com.google.android.gms.internal.c.a(context.getApplicationContext());
            }
            context = a;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }


    // Unreferenced inner class com/google/android/gms/internal/co$2

/* anonymous class */
    final class _cls2
        implements dv.a
    {

        final String a;
        final b b;
        final co c;

        public final void a(zzr zzr1)
        {
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Failed to load URL: ")).append(a).append("\n").append(zzr1.toString()).toString());
            b.a(null);
        }

            
            {
                c = co.this;
                a = s;
                b = b1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/internal/co$3

/* anonymous class */
    final class _cls3 extends com.google.android.gms.internal.b
    {

        final Map a;
        final co b;

        public final Map a()
            throws zza
        {
            if (a == null)
            {
                return super.a();
            } else
            {
                return a;
            }
        }

            
            {
                b = co.this;
                a = map;
                super(s, b1, a1, (byte)0);
            }
    }

}
