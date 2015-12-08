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

        public static final a YT;
        public static final a YU;
        public static final a YV;
        private static final a YW[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/cd$a, s);
        }

        public static a[] values()
        {
            return (a[])YW.clone();
        }

        static 
        {
            YT = new a("NONE", 0);
            YU = new a("CONTAINER", 1);
            YV = new a("CONTAINER_DEBUG", 2);
            YW = (new a[] {
                YT, YU, YV
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static cd YP;
    private volatile String WJ;
    private volatile a YQ;
    private volatile String YR;
    private volatile String YS;

    cd()
    {
        clear();
    }

    private String bI(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String h(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static cd kT()
    {
        com/google/android/gms/tagmanager/cd;
        JVM INSTR monitorenter ;
        cd cd1;
        if (YP == null)
        {
            YP = new cd();
        }
        cd1 = YP;
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
        YQ = a.YT;
        YR = null;
        WJ = null;
        YS = null;
    }

    boolean g(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        bh.y((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        YQ = a.YV;
_L6:
        YS = h(uri);
        if (YQ == a.YU || YQ == a.YV)
        {
            YR = (new StringBuilder()).append("/r?").append(YS).toString();
        }
        WJ = bI(YS);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        YQ = a.YU;
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
            if (!bI(uri.getQuery()).equals(WJ))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            bh.y((new StringBuilder()).append("Exit preview mode for container: ").append(WJ).toString());
            YQ = a.YT;
            YR = null;
        }
          goto _L5
        bh.z((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    String getContainerId()
    {
        return WJ;
    }

    a kU()
    {
        return YQ;
    }

    String kV()
    {
        return YR;
    }
}
