// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            iu, fg

public class fj
    implements fg.a
{

    private final boolean a;

    public fj(boolean flag)
    {
        a = flag;
    }

    private iu a(iu iu1)
        throws InterruptedException, ExecutionException
    {
        iu iu2 = new iu();
        for (int i = 0; i < iu1.size(); i++)
        {
            iu2.put(iu1.b(i), ((Future)iu1.c(i)).get());
        }

        return iu2;
    }

    private void a(fg fg1, JSONObject jsonobject, iu iu1)
        throws JSONException
    {
        iu1.put(jsonobject.getString("name"), fg1.a(jsonobject, "image_value", a));
    }

    private void a(JSONObject jsonobject, iu iu1)
        throws JSONException
    {
        iu1.put(jsonobject.getString("name"), jsonobject.getString("string_value"));
    }

    public com.google.android.gms.ads.internal.formats.zzh.zza a(fg fg1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return b(fg1, jsonobject);
    }

    public zzf b(fg fg1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        iu iu1 = new iu();
        iu iu2 = new iu();
        hk hk = fg1.b(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i);
            String s = jsonobject1.getString("type");
            if ("string".equals(s))
            {
                a(jsonobject1, iu2);
            } else
            if ("image".equals(s))
            {
                a(fg1, jsonobject1, iu1);
            } else
            {
                zzb.zzaE((new StringBuilder()).append("Unknown custom asset type: ").append(s).toString());
            }
            i++;
        }
        return new zzf(jsonobject.getString("custom_template_id"), a(iu1), iu2, (zza)hk.get());
    }
}
