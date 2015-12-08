// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzdp

public final class zzdj
{

    public final String zzsk;
    public final String zzsl;
    public final List zzsm;
    public final String zzsn;
    public final String zzso;
    public final List zzsp;
    public final String zzsq;

    public zzdj(JSONObject jsonobject)
    {
        Object obj1 = null;
        super();
        zzsl = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            arraylist.add(((JSONArray) (obj)).getString(i));
        }

        zzsm = Collections.unmodifiableList(arraylist);
        zzsn = jsonobject.optString("allocation_id", null);
        zzsp = zzab.zzaV().zza(jsonobject, "imp_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        zzsk = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        } else
        {
            jsonobject = null;
        }
        zzsq = jsonobject;
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).optString("class_name");
        }
        zzso = jsonobject;
    }
}
