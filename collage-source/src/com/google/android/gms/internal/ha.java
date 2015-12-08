// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            d, ip, hk

public class ha
{

    public static final a a = new _cls1();
    private static ip b;
    private static final Object c = new Object();

    public ha(Context context)
    {
        b = a(context);
    }

    private static ip a(Context context)
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

    public hk a(String s, a a1)
    {
    /* block-local class not found */
    class c {}

        c c1 = new c(null);
    /* block-local class not found */
    class b {}

        b.a(new b(s, a1, c1));
        return c1;
    }

    public hk a(String s, Map map)
    {
        c c1 = new c(null);
        s = new _cls3(s, c1, new _cls2(s, c1), map);
        b.a(s);
        return c1;
    }


    // Unreferenced inner class com/google/android/gms/internal/ha$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
