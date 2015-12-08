// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak

class bg
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/bg$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("CONTAINER", 1);
            c = new a("CONTAINER_DEBUG", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static bg a;
    private volatile a b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    bg()
    {
        b = a.a;
        d = null;
        c = null;
        e = null;
    }

    static bg a()
    {
        com/google/android/gms/tagmanager/bg;
        JVM INSTR monitorenter ;
        bg bg1;
        if (a == null)
        {
            a = new bg();
        }
        bg1 = a;
        com/google/android/gms/tagmanager/bg;
        JVM INSTR monitorexit ;
        return bg1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/bg;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    final boolean a(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        ak.b();
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        b = a.c;
_L6:
        e = uri.getQuery().replace("&gtm_debug=x", "");
        if (b == a.b || b == a.c)
        {
            d = (new StringBuilder("/r?")).append(e).toString();
        }
        c = a(e);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        b = a.b;
          goto _L6
        uri;
        throw uri;
_L2:
label0:
        {
            if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
            {
                break label0;
            }
            if (!a(uri.getQuery()).equals(c))
            {
                break MISSING_BLOCK_LABEL_221;
            }
            (new StringBuilder("Exit preview mode for container: ")).append(c);
            ak.b();
            b = a.a;
            d = null;
        }
          goto _L5
        ak.b((new StringBuilder("Invalid preview uri: ")).append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    final a b()
    {
        return b;
    }

    final String c()
    {
        return d;
    }

    final String d()
    {
        return c;
    }
}
