// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.Context;
import com.qihoo360.mobilesafe.opti.i.IClearModule;
import com.qihoo360.mobilesafe.opti.i.IFunctionManager;
import dalvik.system.DexClassLoader;

// Referenced classes of package com.qihoo.a.a.a:
//            c, d, e

class b
{

    private static final String a = com/qihoo/a/a/a/b.getSimpleName();
    private static DexClassLoader b = null;
    private static Context c;
    private static b d;
    private final String e;
    private final IFunctionManager f;

    private b(String s, IFunctionManager ifunctionmanager)
    {
        e = s;
        f = ifunctionmanager;
        if ("on".equals(com.qihoo.a.a.a.c.a(c, "clear_sdk_config", "Item", "clear_sdk_update")))
        {
            (new d(c, f)).a();
        }
    }

    public static b a(Context context, String s, IFunctionManager ifunctionmanager)
    {
        com/qihoo/a/a/a/b;
        JVM INSTR monitorenter ;
        c = context;
        if (d == null)
        {
            d = new b(s, ifunctionmanager);
        }
        context = d;
        com/qihoo/a/a/a/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static DexClassLoader b(Context context)
        throws Throwable
    {
        if (b == null)
        {
            b = com.qihoo.a.a.a.e.a(context, "oclt.jar", "oclt.dex");
        }
        return b;
    }

    public IClearModule a(Context context)
        throws Throwable
    {
        context = b(c);
        return (IClearModule)com.qihoo.a.a.a.e.a(com.qihoo.a.a.a.e.a(com.qihoo.a.a.a.e.a(context, "com.qihoo360.plugin.clear.Entry", new Class[0]), new Object[0]), com.qihoo.a.a.a.e.a(context, "com.qihoo360.plugin.clear.Entry", "getModule", new Class[] {
            android/content/Context, com/qihoo360/mobilesafe/opti/i/IFunctionManager, java/lang/String
        }), new Object[] {
            c, f, e
        });
    }

}
