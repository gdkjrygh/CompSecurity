// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;

import com.fitbit.FitBitApplication;
import com.fitbit.config.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.mixpanel:
//            h, MixPanelTrackingHelper

public class g extends h
{

    private final String a = "FConnect: Complete";
    private String b;

    public g(String s)
    {
        b = s;
    }

    public String a()
    {
        return "FConnect: Complete";
    }

    public JSONObject b()
    {
        JSONObject jsonobject = super.b();
        try
        {
            jsonobject.put("!DEVICE", b.toUpperCase());
            jsonobject.put("!CLIENTVERSION", FitBitApplication.a().f().a());
            jsonobject.put("!PAGEGROUP", com.fitbit.mixpanel.MixPanelTrackingHelper.a(MixPanelTrackingHelper.MixpanelPageGroup.b));
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }
}
