// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            by, fo, ah, gk, 
//            gs, gv

class uc
    implements by
{

    final ah ub;
    final gk uc;
    final fo ud;

    public void a(gv gv, Map map)
    {
        ub.g("/nativeAdPreProcess");
        try
        {
            gv = (String)map.get("success");
            if (!TextUtils.isEmpty(gv))
            {
                uc.a((new JSONObject(gv)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (gv gv)
        {
            gs.b("Malformed native JSON response.", gv);
        }
        ud.s(0);
        o.a(ud.cH(), "Unable to set the ad state error!");
        uc.a(null);
    }

    l.o(fo fo1, ah ah1, gk gk1)
    {
        ud = fo1;
        ub = ah1;
        uc = gk1;
        super();
    }
}
