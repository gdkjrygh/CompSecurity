// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdx, zzed

public final class zzdy
{

    public final List zzxD;
    public final long zzxE;
    public final List zzxF;
    public final List zzxG;
    public final List zzxH;
    public final String zzxI;
    public final long zzxJ;
    public final String zzxK;
    public final int zzxL;
    public int zzxM;
    public int zzxN;

    public zzdy(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (zzb.zzL(2))
        {
            zzb.zzaB((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            zzdx zzdx1 = new zzdx(jsonarray.getJSONObject(i));
            arraylist.add(zzdx1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (zza(zzdx1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        zzxM = j;
        zzxN = jsonarray.length();
        zzxD = Collections.unmodifiableList(arraylist);
        zzxI = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            zzxE = s.optLong("ad_network_timeout_millis", -1L);
            zzxF = zzo.zzbG().zza(s, "click_urls");
            zzxG = zzo.zzbG().zza(s, "imp_urls");
            zzxH = zzo.zzbG().zza(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            zzxJ = l;
            s = s.optJSONArray("rewards");
            if (s == null || s.length() == 0)
            {
                zzxK = null;
                zzxL = 0;
                return;
            } else
            {
                zzxK = s.getJSONObject(0).optString("rb_type");
                zzxL = s.getJSONObject(0).optInt("rb_amount");
                return;
            }
        } else
        {
            zzxE = -1L;
            zzxF = null;
            zzxG = null;
            zzxH = null;
            zzxJ = -1L;
            zzxK = null;
            zzxL = 0;
            return;
        }
    }

    private boolean zza(zzdx zzdx1)
    {
        for (zzdx1 = zzdx1.zzxu.iterator(); zzdx1.hasNext();)
        {
            if (((String)zzdx1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
