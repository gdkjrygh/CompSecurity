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

        public static final a asq;
        public static final a asr;
        public static final a ass;
        private static final a ast[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/ce$a, s);
        }

        public static a[] values()
        {
            return (a[])ast.clone();
        }

        static 
        {
            asq = new a("NONE", 0);
            asr = new a("CONTAINER", 1);
            ass = new a("CONTAINER_DEBUG", 2);
            ast = (new a[] {
                asq, asr, ass
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    private static ce asm;
    private volatile String aqm;
    private volatile a asn;
    private volatile String aso;
    private volatile String asp;

    ce()
    {
        clear();
    }

    private String cK(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String j(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static ce qa()
    {
        com/google/android/gms/tagmanager/ce;
        JVM INSTR monitorenter ;
        ce ce1;
        if (asm == null)
        {
            asm = new ce();
        }
        ce1 = asm;
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
        asn = a.asq;
        aso = null;
        aqm = null;
        asp = null;
    }

    String getContainerId()
    {
        return aqm;
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
        asn = a.ass;
_L6:
        asp = j(uri);
        if (asn == a.asr || asn == a.ass)
        {
            aso = (new StringBuilder()).append("/r?").append(asp).toString();
        }
        aqm = cK(asp);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        asn = a.asr;
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
            if (!cK(uri.getQuery()).equals(aqm))
            {
                break MISSING_BLOCK_LABEL_247;
            }
            bh.V((new StringBuilder()).append("Exit preview mode for container: ").append(aqm).toString());
            asn = a.asq;
            aso = null;
        }
          goto _L5
        bh.W((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    a qb()
    {
        return asn;
    }

    String qc()
    {
        return aso;
    }
}
