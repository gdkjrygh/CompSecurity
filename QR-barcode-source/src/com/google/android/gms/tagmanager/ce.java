// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class ce
{
    static final class a extends Enum
    {

        public static final a aqh;
        public static final a aqi;
        public static final a aqj;
        private static final a aqk[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/ce$a, s);
        }

        public static a[] values()
        {
            return (a[])aqk.clone();
        }

        static 
        {
            aqh = new a("NONE", 0);
            aqi = new a("CONTAINER", 1);
            aqj = new a("CONTAINER_DEBUG", 2);
            aqk = (new a[] {
                aqh, aqi, aqj
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    private static ce aqd;
    private volatile String aoc;
    private volatile a aqe;
    private volatile String aqf;
    private volatile String aqg;

    ce()
    {
        clear();
    }

    private String cI(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String j(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static ce oJ()
    {
        com/google/android/gms/tagmanager/ce;
        JVM INSTR monitorenter ;
        ce ce1;
        if (aqd == null)
        {
            aqd = new ce();
        }
        ce1 = aqd;
        com/google/android/gms/tagmanager/ce;
        JVM INSTR monitorexit ;
        return ce1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/ce;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        aqe = a.aqh;
        aqf = null;
        aoc = null;
        aqg = null;
    }

    String getContainerId()
    {
        return aoc;
    }

    boolean i(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        bh.V((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        aqe = a.aqj;
_L6:
        aqg = j(uri);
        if (aqe == a.aqi || aqe == a.aqj)
        {
            aqf = (new StringBuilder()).append("/r?").append(aqg).toString();
        }
        aoc = cI(aqg);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        aqe = a.aqi;
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
            if (!cI(uri.getQuery()).equals(aoc))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            bh.V((new StringBuilder()).append("Exit preview mode for container: ").append(aoc).toString());
            aqe = a.aqh;
            aqf = null;
        }
          goto _L5
        bh.W((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    a oK()
    {
        return aqe;
    }

    String oL()
    {
        return aqf;
    }
}
