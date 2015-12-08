// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhe, zzdk, zzab, zzhg, 
//            zzdj, zzhu

public class zzdp
{

    public zzdp()
    {
    }

    public List zza(JSONObject jsonobject, String s)
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject != null)
        {
            s = new ArrayList(jsonobject.length());
            for (int i = 0; i < jsonobject.length(); i++)
            {
                s.add(jsonobject.getString(i));
            }

            return Collections.unmodifiableList(s);
        } else
        {
            return null;
        }
    }

    public void zza(Context context, String s, zzhe zzhe1, String s1, boolean flag, List list)
    {
        String s2;
        Iterator iterator;
        if (flag)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        for (iterator = list.iterator(); iterator.hasNext(); (new zzhu(context, s, list)).start())
        {
            String s3 = ((String)iterator.next()).replaceAll("@gw_adlocid@", s1).replaceAll("@gw_adnetrefresh@", s2).replaceAll("@gw_qdata@", zzhe1.zzyt.zzsw).replaceAll("@gw_sdkver@", s).replaceAll("@gw_sessid@", zzab.zzaP().getSessionId()).replaceAll("@gw_seqnum@", zzhe1.zzwq);
            list = s3;
            if (zzhe1.zzsL != null)
            {
                list = s3.replaceAll("@gw_adnetid@", zzhe1.zzsL.zzsl).replaceAll("@gw_allocid@", zzhe1.zzsL.zzsn);
            }
        }

    }
}
