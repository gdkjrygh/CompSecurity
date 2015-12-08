// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bg

class PreviewManager
{
    static final class a extends Enum
    {

        public static final a aOG;
        public static final a aOH;
        public static final a aOI;
        private static final a aOJ[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/tagmanager/PreviewManager$a, s);
        }

        public static a[] values()
        {
            return (a[])aOJ.clone();
        }

        static 
        {
            aOG = new a("NONE", 0);
            aOH = new a("CONTAINER", 1);
            aOI = new a("CONTAINER_DEBUG", 2);
            aOJ = (new a[] {
                aOG, aOH, aOI
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static PreviewManager aOC;
    private volatile String aMA;
    private volatile a aOD;
    private volatile String aOE;
    private volatile String aOF;

    PreviewManager()
    {
        clear();
    }

    private void clear()
    {
        aOD = a.aOG;
        aOE = null;
        aMA = null;
        aOF = null;
    }

    private static String dK(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    static PreviewManager getInstance()
    {
        com/google/android/gms/tagmanager/PreviewManager;
        JVM INSTR monitorenter ;
        PreviewManager previewmanager;
        if (aOC == null)
        {
            aOC = new PreviewManager();
        }
        previewmanager = aOC;
        com/google/android/gms/tagmanager/PreviewManager;
        JVM INSTR monitorexit ;
        return previewmanager;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/PreviewManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String l(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    final String getContainerId()
    {
        return aMA;
    }

    final boolean k(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        bg.v((new StringBuilder("Container preview url: ")).append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        aOD = a.aOI;
_L6:
        aOF = l(uri);
        if (aOD == a.aOH || aOD == a.aOI)
        {
            aOE = (new StringBuilder("/r?")).append(aOF).toString();
        }
        aMA = dK(aOF);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        aOD = a.aOH;
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
            if (!dK(uri.getQuery()).equals(aMA))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            bg.v((new StringBuilder("Exit preview mode for container: ")).append(aMA).toString());
            aOD = a.aOG;
            aOE = null;
        }
          goto _L5
        bg.w((new StringBuilder("Invalid preview uri: ")).append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    final a tm()
    {
        return aOD;
    }

    final String tn()
    {
        return aOE;
    }
}
