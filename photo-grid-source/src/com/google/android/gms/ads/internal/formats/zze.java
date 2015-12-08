// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.el;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza, zzh

public class zze extends el
    implements zzh.zza
{

    private final String a;
    private final List b;
    private final String c;
    private final dw d;
    private final String e;
    private final String f;
    private final zza g;
    private final Bundle h;
    private final Object i = new Object();
    private zzh j;

    public zze(String s, List list, String s1, dw dw, String s2, String s3, zza zza1, 
            Bundle bundle)
    {
        a = s;
        b = list;
        c = s1;
        d = dw;
        e = s2;
        f = s3;
        g = zza1;
        h = bundle;
    }

    public String getAdvertiser()
    {
        return f;
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
        return h;
    }

    public String getHeadline()
    {
        return a;
    }

    public List getImages()
    {
        return b;
    }

    public void zza(zzh zzh)
    {
        synchronized (i)
        {
            j = zzh;
        }
        return;
        zzh;
        obj;
        JVM INSTR monitorexit ;
        throw zzh;
    }

    public dw zzdA()
    {
        return d;
    }

    public a zzdx()
    {
        return com.google.android.gms.b.d.a(j);
    }

    public String zzdy()
    {
        return "1";
    }

    public zza zzdz()
    {
        return g;
    }
}
