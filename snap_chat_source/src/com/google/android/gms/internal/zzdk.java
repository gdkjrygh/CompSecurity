// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzdj, zzab, zzdp

public final class zzdk
{

    public final List zzsr;
    public final long zzss;
    public final List zzst;
    public final List zzsu;
    public final List zzsv;
    public final String zzsw;
    public final long zzsx;
    public int zzsy;
    public int zzsz;

    public zzdk(String s)
    {
        s = new JSONObject(s);
        if (zzhx.zzA(2))
        {
            zzhx.zzab((new StringBuilder("Mediation Response JSON: ")).append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            zzdj zzdj1 = new zzdj(jsonarray.getJSONObject(i));
            arraylist.add(zzdj1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (zza(zzdj1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        zzsy = j;
        zzsz = jsonarray.length();
        zzsr = Collections.unmodifiableList(arraylist);
        zzsw = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            zzss = s.optLong("ad_network_timeout_millis", -1L);
            zzst = zzab.zzaV().zza(s, "click_urls");
            zzsu = zzab.zzaV().zza(s, "imp_urls");
            zzsv = zzab.zzaV().zza(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            zzsx = l;
            return;
        } else
        {
            zzss = -1L;
            zzst = null;
            zzsu = null;
            zzsv = null;
            zzsx = -1L;
            return;
        }
    }

    private boolean zza(zzdj zzdj1)
    {
        for (zzdj1 = zzdj1.zzsm.iterator(); zzdj1.hasNext();)
        {
            if (((String)zzdj1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
