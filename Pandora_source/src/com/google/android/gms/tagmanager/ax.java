// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class ax
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/ax$a, s);
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


    private static ax a;
    private volatile a b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    ax()
    {
        e();
    }

    static ax a()
    {
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorenter ;
        ax ax1;
        if (a == null)
        {
            a = new ax();
        }
        ax1 = a;
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorexit ;
        return ax1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String a(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String b(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    boolean a(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        zzbg.zzam((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        b = a.c;
_L6:
        e = b(uri);
        if (b == a.b || b == a.c)
        {
            d = (new StringBuilder()).append("/r?").append(e).toString();
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
                break MISSING_BLOCK_LABEL_247;
            }
            zzbg.zzam((new StringBuilder()).append("Exit preview mode for container: ").append(c).toString());
            b = a.a;
            d = null;
        }
          goto _L5
        zzbg.zzan((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    a b()
    {
        return b;
    }

    String c()
    {
        return d;
    }

    String d()
    {
        return c;
    }

    void e()
    {
        b = a.a;
        d = null;
        c = null;
        e = null;
    }
}
