// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cd, fn, ah, gj, 
//            gr, jx, gu

class uq
    implements cd
{

    final ah up;
    final gj uq;
    final fn ur;

    public void a(gu gu, Map map)
    {
        up.g("/nativeAdPreProcess");
        try
        {
            gu = (String)map.get("success");
            if (!TextUtils.isEmpty(gu))
            {
                uq.a((new JSONObject(gu)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (gu gu)
        {
            gr.b("Malformed native JSON response.", gu);
        }
        ur.t(0);
        jx.a(ur.cO(), "Unable to set the ad state error!");
        uq.a(null);
    }

    (fn fn1, ah ah1, gj gj1)
    {
        ur = fn1;
        up = ah1;
        uq = gj1;
        super();
    }
}
