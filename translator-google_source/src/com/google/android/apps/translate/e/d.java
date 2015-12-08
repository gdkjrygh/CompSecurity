// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.libraries.a.a;
import com.google.android.libraries.a.b;
import com.google.android.libraries.translate.core.Singleton;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.e:
//            e, h, g, f

public final class d
{

    private static final Map a = Maps.b();
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final com.google.android.libraries.a.d d = new e();

    public static Typeface a(String s)
    {
        return com.google.android.libraries.a.b.a(Singleton.a(), s, d);
    }

    public static g a(TextView textview, String s)
    {
        return a(com.google.android.libraries.a.b.a(textview), s);
    }

    public static g a(a a1, String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        h h1 = (h)a.get(s);
        if (h1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        h1 = new h(a1, s);
        a.put(s, h1);
        h1.execute(new Void[0]);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return new g(a1, s);
        com.google.android.apps.translate.e.h.a(h1).add(a1);
          goto _L1
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    static Object a()
    {
        return c;
    }

    public static Typeface b(String s)
    {
        return com.google.android.libraries.a.b.a(Singleton.a(), s);
    }

    static Object b()
    {
        return b;
    }

    public static g c(String s)
    {
        return a(new f(), s);
    }

    static Map c()
    {
        return a;
    }

}
