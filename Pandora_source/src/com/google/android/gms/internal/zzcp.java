// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzfa, zzck, zzfc, zzcj, 
//            zzfp

public class zzcp
{

    public zzcp()
    {
    }

    public List zza(JSONObject jsonobject, String s)
        throws JSONException
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

    public void zza(Context context, String s, zzfa zzfa1, String s1, boolean flag, List list)
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
        for (iterator = list.iterator(); iterator.hasNext(); (new zzfp(context, s, list)).zzeW())
        {
            String s3 = ((String)iterator.next()).replaceAll("@gw_adlocid@", s1).replaceAll("@gw_adnetrefresh@", s2).replaceAll("@gw_qdata@", zzfa1.zzBt.zzuF).replaceAll("@gw_sdkver@", s).replaceAll("@gw_sessid@", zzh.zzaT().getSessionId()).replaceAll("@gw_seqnum@", zzfa1.zzyZ);
            list = s3;
            if (zzfa1.zzuU != null)
            {
                list = s3.replaceAll("@gw_adnetid@", zzfa1.zzuU.zzus).replaceAll("@gw_allocid@", zzfa1.zzuU.zzuu);
            }
        }

    }
}
