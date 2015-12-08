// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj, zzcp

public final class zzck
{

    public final List zzuA;
    public final long zzuB;
    public final List zzuC;
    public final List zzuD;
    public final List zzuE;
    public final String zzuF;
    public final long zzuG;
    public int zzuH;
    public int zzuI;

    public zzck(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (zzb.zzC(2))
        {
            zzb.zzam((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            zzcj zzcj1 = new zzcj(jsonarray.getJSONObject(i));
            arraylist.add(zzcj1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (zza(zzcj1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        zzuH = j;
        zzuI = jsonarray.length();
        zzuA = Collections.unmodifiableList(arraylist);
        zzuF = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            zzuB = s.optLong("ad_network_timeout_millis", -1L);
            zzuC = zzh.zzba().zza(s, "click_urls");
            zzuD = zzh.zzba().zza(s, "imp_urls");
            zzuE = zzh.zzba().zza(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            zzuG = l;
            return;
        } else
        {
            zzuB = -1L;
            zzuC = null;
            zzuD = null;
            zzuE = null;
            zzuG = -1L;
            return;
        }
    }

    private boolean zza(zzcj zzcj1)
    {
        for (zzcj1 = zzcj1.zzut.iterator(); zzcj1.hasNext();)
        {
            if (((String)zzcj1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
