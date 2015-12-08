// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ij, fh

public final class fk
    implements fh.a
{

    private final boolean a;

    public fk(boolean flag)
    {
        a = flag;
    }

    private static ij a(ij ij1)
        throws InterruptedException, ExecutionException
    {
        ij ij2 = new ij();
        for (int i = 0; i < ij1.size(); i++)
        {
            ij2.put(ij1.b(i), ((Future)ij1.c(i)).get());
        }

        return ij2;
    }

    public final com.google.android.gms.ads.internal.formats.h.a a(fh fh1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        ij ij1 = new ij();
        ij ij2 = new ij();
        ha ha = fh1.a(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.getJSONObject(i);
            String s = jsonobject1.getString("type");
            if ("string".equals(s))
            {
                ij2.put(jsonobject1.getString("name"), jsonobject1.getString("string_value"));
            } else
            if ("image".equals(s))
            {
                ij1.put(jsonobject1.getString("name"), fh1.a(jsonobject1, "image_value", a));
            } else
            {
                b.c((new StringBuilder("Unknown custom asset type: ")).append(s).toString());
            }
            i++;
        }
        return new f(jsonobject.getString("custom_template_id"), a(ij1), ij2, (a)ha.get());
    }
}
