// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.eh;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzh

public class zzd extends eh
    implements zzh.zza
{

    private final String a;
    private final List b;
    private final String c;
    private final dw d;
    private final String e;
    private final double f;
    private final String g;
    private final String h;
    private final zza i;
    private final Bundle j;
    private final Object k = new Object();
    private zzh l;

    public zzd(String s, List list, String s1, dw dw, String s2, double d1, 
            String s3, String s4, zza zza1, Bundle bundle)
    {
        a = s;
        b = list;
        c = s1;
        d = dw;
        e = s2;
        f = d1;
        g = s3;
        h = s4;
        i = zza1;
        j = bundle;
    }

    public String getBody()
    {
        return c;
    }

    public String getCallToAction()
    {
        return e;
    }

    public String getCustomTemplateId()
    {
        return "";
    }

    public Bundle getExtras()
    {
        return j;
    }

    public String getHeadline()
    {
        return a;
    }

    public List getImages()
    {
        return b;
    }

    public String getPrice()
    {
        return h;
    }

    public double getStarRating()
    {
        return f;
    }

    public String getStore()
    {
        return g;
    }

    public void zza(zzh zzh)
    {
        synchronized (k)
        {
            l = zzh;
        }
        return;
        zzh;
        obj;
        JVM INSTR monitorexit ;
        throw zzh;
    }

    public dw zzdw()
    {
        return d;
    }

    public a zzdx()
    {
        return com.google.android.gms.b.d.a(l);
    }

    public String zzdy()
    {
        return "2";
    }

    public zza zzdz()
    {
        return i;
    }
}
