// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzha, zzdy, zzhc, zzdx, 
//            zzhp

public class zzed
{

    public zzed()
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

    public void zza(Context context, String s, zzha zzha1, String s1, boolean flag, List list)
    {
        if (list != null && !list.isEmpty())
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
            iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                String s3 = ((String)iterator.next()).replaceAll("@gw_adlocid@", s1).replaceAll("@gw_adnetrefresh@", s2).replaceAll("@gw_qdata@", zzha1.zzFm.zzxI).replaceAll("@gw_sdkver@", s).replaceAll("@gw_sessid@", zzo.zzby().getSessionId()).replaceAll("@gw_seqnum@", zzha1.zzCp);
                list = s3;
                if (zzha1.zzxZ != null)
                {
                    list = s3.replaceAll("@gw_adnetid@", zzha1.zzxZ.zzxt).replaceAll("@gw_allocid@", zzha1.zzxZ.zzxv);
                }
                (new zzhp(context, s, list)).zzgi();
            }
        }
    }
}
