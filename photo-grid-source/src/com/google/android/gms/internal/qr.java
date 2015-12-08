// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            qs, d, qy, qw, 
//            tm, qu, qt, qv, 
//            rl

public final class qr
{

    public static final qv a = new qs();
    private static tm b;
    private static final Object c = new Object();

    public qr(Context context)
    {
        b = a(context);
    }

    private static tm a(Context context)
    {
        synchronized (c)
        {
            if (b == null)
            {
                b = d.a(context.getApplicationContext());
            }
            context = b;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final rl a(String s, qv qv)
    {
        qy qy1 = new qy(this, (byte)0);
        b.a(new qw(s, qv, qy1));
        return qy1;
    }

    public final rl a(String s, Map map)
    {
        qy qy1 = new qy(this, (byte)0);
        s = new qu(this, s, qy1, new qt(this, s, qy1), map);
        b.a(s);
        return qy1;
    }

}
