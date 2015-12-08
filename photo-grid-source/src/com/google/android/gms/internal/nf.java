// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            nb, wb, mv

public final class nf
    implements nb
{

    private final boolean a;

    public nf(boolean flag)
    {
        a = flag;
    }

    private static wb a(wb wb1)
    {
        wb wb2 = new wb();
        for (int i = 0; i < wb1.size(); i++)
        {
            wb2.put(wb1.b(i), ((Future)wb1.c(i)).get());
        }

        return wb2;
    }

    public final com.google.android.gms.ads.internal.formats.zzh.zza a(mv mv1, JSONObject jsonobject)
    {
        wb wb1 = new wb();
        wb wb2 = new wb();
        rl rl = mv1.a(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i);
            String s = jsonobject1.getString("type");
            if ("string".equals(s))
            {
                wb2.put(jsonobject1.getString("name"), jsonobject1.getString("string_value"));
            } else
            if ("image".equals(s))
            {
                wb1.put(jsonobject1.getString("name"), mv1.a(jsonobject1, "image_value", a));
            } else
            {
                zzb.zzaH((new StringBuilder("Unknown custom asset type: ")).append(s).toString());
            }
            i++;
        }
        return new zzf(jsonobject.getString("custom_template_id"), a(wb1), wb2, (zza)rl.get());
    }
}
