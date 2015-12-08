// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzar, zzat, zzcs, zzcd, 
//            zzbg, zzas

class zzz
    implements zzar
{

    private static final Object zzaKl = new Object();
    private static zzz zzaLA;
    private zzcd zzaKO;
    private String zzaLB;
    private String zzaLC;
    private zzas zzaLD;

    private zzz(Context context)
    {
        this(((zzas) (zzat.zzaH(context))), ((zzcd) (new zzcs())));
    }

    zzz(zzas zzas1, zzcd zzcd1)
    {
        zzaLD = zzas1;
        zzaKO = zzcd1;
    }

    public static zzar zzaF(Context context)
    {
        synchronized (zzaKl)
        {
            if (zzaLA == null)
            {
                zzaLA = new zzz(context);
            }
            context = zzaLA;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean zzes(String s)
    {
        if (!zzaKO.zzkb())
        {
            zzbg.zzaC("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (zzaLB != null)
        {
            s1 = s;
            if (zzaLC != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(zzaLB).append("?").append(zzaLC).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    zzbg.zzaB((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzbg.zzd("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        zzaLD.zzew(s1);
        return true;
    }

}
