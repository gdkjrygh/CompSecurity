// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbf, zzbe, zzdg

public class zzbg
    implements zzbf
{

    private final zzbe zzrh;
    private final HashSet zzri = new HashSet();

    public zzbg(zzbe zzbe1)
    {
        zzrh = zzbe1;
    }

    public void zza(String s, zzdg zzdg1)
    {
        zzrh.zza(s, zzdg1);
        zzri.add(new java.util.AbstractMap.SimpleEntry(s, zzdg1));
    }

    public void zza(String s, String s1)
    {
        zzrh.zza(s, s1);
    }

    public void zza(String s, JSONObject jsonobject)
    {
        zzrh.zza(s, jsonobject);
    }

    public void zzb(String s, zzdg zzdg1)
    {
        zzrh.zzb(s, zzdg1);
        zzri.remove(new java.util.AbstractMap.SimpleEntry(s, zzdg1));
    }

    public void zzcg()
    {
        java.util.AbstractMap.SimpleEntry simpleentry;
        for (Iterator iterator = zzri.iterator(); iterator.hasNext(); zzrh.zzb((String)simpleentry.getKey(), (zzdg)simpleentry.getValue()))
        {
            simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
            com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("Unregistering eventhandler: ").append(((zzdg)simpleentry.getValue()).toString()).toString());
        }

        zzri.clear();
    }
}
