// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cf, fh, ab, gx, 
//            hi

final class c
    implements cf
{

    final ab a;
    final c b;
    final gx c;
    final fh d;

    public final void a(hi hi, Map map)
    {
        a.b("/nativeAdPreProcess", b.a);
        try
        {
            hi = (String)map.get("success");
            if (!TextUtils.isEmpty(hi))
            {
                c.b((new JSONObject(hi)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (hi hi)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Malformed native JSON response.", hi);
        }
        d.a(0);
        y.a(d.a(), "Unable to set the ad state error!");
        c.b(null);
    }

    l.y(fh fh1, ab ab1, l.y y1, gx gx1)
    {
        d = fh1;
        a = ab1;
        b = y1;
        c = gx1;
        super();
    }
}
