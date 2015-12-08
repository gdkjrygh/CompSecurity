// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.b;
import com.google.android.gms.tagmanager.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jv, ju

public class jw
{
    public static interface a
    {

        public abstract void b();
    }


    private static jw a;
    private jv b;
    private final Set c = new HashSet();
    private d d;
    private boolean e;
    private Context f;

    private jw(Context context, d d1)
    {
        d = null;
        f = context;
        d = d1;
    }

    static Context a(jw jw1)
    {
        return jw1.f;
    }

    static jv a(jw jw1, jv jv1)
    {
        jw1.b = jv1;
        return jv1;
    }

    public static jw a(Context context)
    {
        y.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/jw;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new jw(context, com.google.android.gms.tagmanager.d.a(context.getApplicationContext()));
        }
        com/google/android/gms/internal/jw;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/internal/jw;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void b(jw jw1)
    {
        jw1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = jw1.c.iterator(); iterator.hasNext(); ((a)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        jw1;
        JVM INSTR monitorexit ;
        throw exception;
        jw1;
        JVM INSTR monitorexit ;
    }

    public final jv a()
    {
        this;
        JVM INSTR monitorenter ;
        jv jv1 = b;
        this;
        JVM INSTR monitorexit ;
        return jv1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(jv jv1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        jv1;
        this;
        JVM INSTR monitorexit ;
        throw jv1;
        b = jv1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        c.add(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IllegalStateException("Method start() has already been called");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        e = true;
        d.a(b.a(), "admob").a(new h() {

            final jw a;

            public final void onResult(g g)
            {
                g = (b)g;
                if (g.getStatus().d())
                {
                    g = g.b();
                } else
                {
                    g = null;
                }
                g = new ju(jw.a(a), g, a.a());
                jw.a(a, g.a());
                com.google.android.gms.internal.jw.b(a);
            }

            
            {
                a = jw.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }
}
