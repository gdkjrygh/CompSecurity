// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

class zzca
{
    static final class zza extends Enum
    {

        public static final zza zzazB;
        public static final zza zzazC;
        public static final zza zzazD;
        private static final zza zzazE[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzca$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzazE.clone();
        }

        static 
        {
            zzazB = new zza("NONE", 0);
            zzazC = new zza("CONTAINER", 1);
            zzazD = new zza("CONTAINER_DEBUG", 2);
            zzazE = (new zza[] {
                zzazB, zzazC, zzazD
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static zzca zzazx;
    private volatile String zzaxw;
    private volatile String zzazA;
    private volatile zza zzazy;
    private volatile String zzazz;

    zzca()
    {
        clear();
    }

    private String zzdf(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String zzm(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static zzca zztx()
    {
        com/google/android/gms/tagmanager/zzca;
        JVM INSTR monitorenter ;
        zzca zzca1;
        if (zzazx == null)
        {
            zzazx = new zzca();
        }
        zzca1 = zzazx;
        com/google/android/gms/tagmanager/zzca;
        JVM INSTR monitorexit ;
        return zzca1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzca;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        zzazy = zza.zzazB;
        zzazz = null;
        zzaxw = null;
        zzazA = null;
    }

    String getContainerId()
    {
        return zzaxw;
    }

    boolean zzl(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        zzbf.zzab((new StringBuilder("Container preview url: ")).append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        zzazy = zza.zzazD;
_L6:
        zzazA = zzm(uri);
        if (zzazy == zza.zzazC || zzazy == zza.zzazD)
        {
            zzazz = (new StringBuilder("/r?")).append(zzazA).toString();
        }
        zzaxw = zzdf(zzazA);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        zzazy = zza.zzazC;
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
            if (!zzdf(uri.getQuery()).equals(zzaxw))
            {
                break MISSING_BLOCK_LABEL_235;
            }
            zzbf.zzab((new StringBuilder("Exit preview mode for container: ")).append(zzaxw).toString());
            zzazy = zza.zzazB;
            zzazz = null;
        }
          goto _L5
        zzbf.zzac((new StringBuilder("Invalid preview uri: ")).append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    zza zzty()
    {
        return zzazy;
    }

    String zztz()
    {
        return zzazz;
    }
}
