// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.bl;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fz, nc, bg, rf, 
//            mv, ry

final class mw
    implements fz
{

    final bg a;
    final nc b;
    final rf c;
    final mv d;

    mw(mv mv1, bg bg1, nc nc1, rf rf1)
    {
        d = mv1;
        a = bg1;
        b = nc1;
        c = rf1;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        a.b("/nativeAdPreProcess", b.a);
        try
        {
            ry = (String)map.get("success");
            if (!TextUtils.isEmpty(ry))
            {
                c.b((new JSONObject(ry)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ry ry)
        {
            zzb.zzb("Malformed native JSON response.", ry);
        }
        d.a(0);
        bl.a(d.a(), "Unable to set the ad state error!");
        c.b(null);
    }
}
