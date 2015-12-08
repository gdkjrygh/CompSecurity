// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

// Referenced classes of package com.google.android.gms.internal:
//            hn, hs, hb, qa, 
//            hj, hk, hm, ho

public final class ha
{

    private final Object a;
    private final Context b;
    private final String c;
    private final VersionInfoParcel d;
    private hm e;
    private hm f;
    private hs g;
    private int h;

    public ha(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        a = new Object();
        h = 1;
        c = s;
        b = context.getApplicationContext();
        d = versioninfoparcel;
        e = new hn();
        f = new hn();
    }

    public ha(Context context, VersionInfoParcel versioninfoparcel, String s, hm hm, hm hm1)
    {
        this(context, versioninfoparcel, s);
        e = hm;
        f = hm1;
    }

    static int a(ha ha1, int i)
    {
        ha1.h = i;
        return i;
    }

    static Context a(ha ha1)
    {
        return ha1.b;
    }

    static hs a(ha ha1, hs hs1)
    {
        ha1.g = hs1;
        return hs1;
    }

    static VersionInfoParcel b(ha ha1)
    {
        return ha1.d;
    }

    static Object c(ha ha1)
    {
        return ha1.a;
    }

    static hm d(ha ha1)
    {
        return ha1.e;
    }

    static int e(ha ha1)
    {
        return ha1.h;
    }

    static String f(ha ha1)
    {
        return ha1.c;
    }

    static hs g(ha ha1)
    {
        return ha1.g;
    }

    protected final hs a()
    {
        hs hs1 = new hs(f);
        qa.a(new hb(this, hs1));
        hs1.a(new hj(this, hs1), new hk(this, hs1));
        return hs1;
    }

    public final ho b()
    {
label0:
        {
            ho ho;
            synchronized (a)
            {
                if (g != null && g.e() != -1)
                {
                    break label0;
                }
                h = 2;
                g = a();
                ho = g.a();
            }
            return ho;
        }
        ho ho1;
        if (h != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ho1 = g.a();
        obj;
        JVM INSTR monitorexit ;
        return ho1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (h != 1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        h = 2;
        a();
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (h != 2)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
        exception = g.a();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
