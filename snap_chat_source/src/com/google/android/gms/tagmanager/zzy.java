// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaq, zzas, zzcr, zzcc, 
//            zzbf, zzar

class zzy
    implements zzaq
{

    private static final Object zzaxj = new Object();
    private static zzy zzayy;
    private zzcc zzaxM;
    private String zzayA;
    private zzar zzayB;
    private String zzayz;

    private zzy(Context context)
    {
        this(((zzar) (zzas.zzam(context))), ((zzcc) (new zzcr())));
    }

    zzy(zzar zzar1, zzcc zzcc1)
    {
        zzayB = zzar1;
        zzaxM = zzcc1;
    }

    public static zzaq zzak(Context context)
    {
        synchronized (zzaxj)
        {
            if (zzayy == null)
            {
                zzayy = new zzy(context);
            }
            context = zzayy;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean zzcY(String s)
    {
        if (!zzaxM.zzgv())
        {
            zzbf.zzac("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (zzayz != null)
        {
            s1 = s;
            if (zzayA != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(zzayz).append("?").append(zzayA).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    zzbf.zzab((new StringBuilder("Sending wrapped url hit: ")).append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzbf.zzd("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        zzayB.zzdb(s1);
        return true;
    }

}
