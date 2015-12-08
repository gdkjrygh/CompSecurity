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

        public static final a agA;
        private static final a agB[];
        public static final a agy;
        public static final a agz;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/cd$a, s);
        }

        public static a[] values()
        {
            return (a[])agB.clone();
        }

        static 
        {
            agy = new a("NONE", 0);
            agz = new a("CONTAINER", 1);
            agA = new a("CONTAINER_DEBUG", 2);
            agB = (new a[] {
                agy, agz, agA
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    private static cd agu;
    private volatile String aeq;
    private volatile a agv;
    private volatile String agw;
    private volatile String agx;

    cd()
    {
        clear();
    }

    private String ca(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String i(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static cd lY()
    {
        com/google/android/gms/tagmanager/cd;
        JVM INSTR monitorenter ;
        cd cd1;
        if (agu == null)
        {
            agu = new cd();
        }
        cd1 = agu;
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
        agv = a.agy;
        agw = null;
        aeq = null;
        agx = null;
    }

    String getContainerId()
    {
        return aeq;
    }

    boolean h(Uri uri)
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
        agv = a.agA;
_L6:
        agx = i(uri);
        if (agv == a.agz || agv == a.agA)
        {
            agw = (new StringBuilder()).append("/r?").append(agx).toString();
        }
        aeq = ca(agx);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        agv = a.agz;
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
            if (!ca(uri.getQuery()).equals(aeq))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            bh.C((new StringBuilder()).append("Exit preview mode for container: ").append(aeq).toString());
            agv = a.agy;
            agw = null;
        }
          goto _L5
        bh.D((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    a lZ()
    {
        return agv;
    }

    String ma()
    {
        return agw;
    }
}
