// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d;

import android.util.Log;
import com.nuance.dragon.toolkit.d.b.d;

// Referenced classes of package com.nuance.dragon.toolkit.d:
//            f

public final class e
{

    public static void a(Object obj, String s)
    {
        Log.d("NMT", e(obj, s));
    }

    public static void a(Object obj, String s, Throwable throwable)
    {
        Log.e("NMT", e(obj, s), throwable);
    }

    public static void b(Object obj, String s)
    {
        Log.i("NMT", e(obj, s));
    }

    public static void c(Object obj, String s)
    {
        Log.w("NMT", e(obj, s));
    }

    public static void d(Object obj, String s)
    {
        Log.e("NMT", e(obj, s));
    }

    private static String e(Object obj, String s)
    {
        if (obj != null)
        {
            if (f.a())
            {
                obj = null;
            } else
            if (obj instanceof String)
            {
                obj = (String)obj;
            } else
            if (obj instanceof Class)
            {
                obj = com.nuance.dragon.toolkit.d.b.d.a((Class)obj);
            } else
            {
                obj = com.nuance.dragon.toolkit.d.b.d.a(obj.getClass());
            }
            if (obj != null && ((String) (obj)).length() != 0)
            {
                return (new StringBuilder()).append(((String) (obj))).append(": ").append(s).toString();
            }
        }
        return s;
    }
}
