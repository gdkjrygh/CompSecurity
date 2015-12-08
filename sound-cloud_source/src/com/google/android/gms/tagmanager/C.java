// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            s

class C
{
    static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private static C d;
    volatile int a;
    volatile String b;
    volatile String c;
    private volatile String e;

    C()
    {
        a = a.a;
        c = null;
        b = null;
        e = null;
    }

    static C a()
    {
        com/google/android/gms/tagmanager/C;
        JVM INSTR monitorenter ;
        C c1;
        if (d == null)
        {
            d = new C();
        }
        c1 = d;
        com/google/android/gms/tagmanager/C;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/C;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(String s1)
    {
        return s1.split("&")[0].split("=")[1];
    }

    final boolean a(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s1 = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s1.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        s.e();
        if (!s1.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        a = a.c;
_L6:
        e = uri.getQuery().replace("&gtm_debug=x", "");
        if (a == a.b || a == a.c)
        {
            c = (new StringBuilder("/r?")).append(e).toString();
        }
        b = a(e);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        a = a.b;
          goto _L6
        uri;
        throw uri;
_L2:
label0:
        {
            if (!s1.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
            {
                break label0;
            }
            if (!a(uri.getQuery()).equals(b))
            {
                break MISSING_BLOCK_LABEL_205;
            }
            (new StringBuilder("Exit preview mode for container: ")).append(b);
            s.e();
            a = a.a;
            c = null;
        }
          goto _L5
        s.c();
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }
}
