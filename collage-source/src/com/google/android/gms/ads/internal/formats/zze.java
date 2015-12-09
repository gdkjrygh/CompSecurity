// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.bj;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzh

public class zze extends com.google.android.gms.internal.bp.a
    implements zzh.zza
{

    private final Bundle mExtras;
    private final Object zzpc = new Object();
    private final String zzvK;
    private final List zzvL;
    private final String zzvM;
    private final String zzvO;
    private final zza zzvS;
    private zzh zzvT;
    private final bj zzvU;
    private final String zzvV;

    public zze(String s, List list, String s1, bj bj, String s2, String s3, zza zza1, 
            Bundle bundle)
    {
        zzvK = s;
        zzvL = list;
        zzvM = s1;
        zzvU = bj;
        zzvO = s2;
        zzvV = s3;
        zzvS = zza1;
        mExtras = bundle;
    }

    public String getAdvertiser()
    {
        return zzvV;
    }

    public String getBody()
    {
        return zzvM;
    }

    public String getCallToAction()
    {
        return zzvO;
    }

    public String getCustomTemplateId()
    {
        return "";
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getHeadline()
    {
        return zzvK;
    }

    public List getImages()
    {
        return zzvL;
    }

    public void zza(zzh zzh)
    {
        synchronized (zzpc)
        {
            zzvT = zzh;
        }
        return;
        zzh;
        obj;
        JVM INSTR monitorexit ;
        throw zzh;
    }

    public a zzdt()
    {
        return b.a(zzvT);
    }

    public String zzdu()
    {
        return "1";
    }

    public zza zzdv()
    {
        return zzvS;
    }

    public bj zzdw()
    {
        return zzvU;
    }
}
