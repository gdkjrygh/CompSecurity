// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class cd
{
    static final class a extends Enum
    {

        public static final a agB;
        public static final a agC;
        public static final a agD;
        private static final a agE[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/cd$a, s);
        }

        public static a[] values()
        {
            return (a[])agE.clone();
        }

        static 
        {
            agB = new a("NONE", 0);
            agC = new a("CONTAINER", 1);
            agD = new a("CONTAINER_DEBUG", 2);
            agE = (new a[] {
                agB, agC, agD
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    private static cd agx;
    private volatile String aet;
    private volatile String agA;
    private volatile a agy;
    private volatile String agz;

    cd()
    {
        clear();
    }

    private String ca(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String j(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static cd md()
    {
        com/google/android/gms/tagmanager/cd;
        JVM INSTR monitorenter ;
        cd cd1;
        if (agx == null)
        {
            agx = new cd();
        }
        cd1 = agx;
        com/google/android/gms/tagmanager/cd;
        JVM INSTR monitorexit ;
        return cd1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/cd;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        agy = a.agB;
        agz = null;
        aet = null;
        agA = null;
    }

    String getContainerId()
    {
        return aet;
    }

    boolean i(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        bh.C((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        agy = a.agD;
_L6:
        agA = j(uri);
        if (agy == a.agC || agy == a.agD)
        {
            agz = (new StringBuilder()).append("/r?").append(agA).toString();
        }
        aet = ca(agA);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        agy = a.agC;
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
            if (!ca(uri.getQuery()).equals(aet))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            bh.C((new StringBuilder()).append("Exit preview mode for container: ").append(aet).toString());
            agy = a.agB;
            agz = null;
        }
          goto _L5
        bh.D((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    a me()
    {
        return agy;
    }

    String mf()
    {
        return agz;
    }
}
