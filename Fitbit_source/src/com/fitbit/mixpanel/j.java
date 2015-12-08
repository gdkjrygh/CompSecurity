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

public abstract class j extends h
{

    private String a;

    public j()
    {
        a = null;
    }

    public j(String s)
    {
        a = s;
    }

    public JSONObject b()
    {
        JSONObject jsonobject = super.b();
        try
        {
            jsonobject.put("!CLIENTVERSION", FitBitApplication.a().f().a());
            jsonobject.put("!PAGEGROUP", com.fitbit.mixpanel.MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.MixpanelPageGroup.a));
            if (a != null)
            {
                jsonobject.put("!DEVICE", a.toUpperCase());
            }
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }
}
