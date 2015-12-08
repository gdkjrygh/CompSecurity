// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.appattach.tracking.appAttachTracking;
import java.net.URLDecoder;
import java.util.HashMap;

public class ReferrerReceiver extends BroadcastReceiver
{

    private final String CAMPAIGN_SOURCE = "accuweather_promotional_campaign";
    private final String UTM_CAMPAIGN = "utm_campaign";
    private final String UTM_MEDIUM = "utm_medium";

    public ReferrerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        if (obj == null || !TextUtils.equals(((CharSequence) (obj)), "com.android.vending.INSTALL_REFERRER")) goto _L2; else goto _L1
_L1:
        if (!PartnerCoding.isPartnerCodedAppAttach(context)) goto _L4; else goto _L3
_L3:
        intent = appAttachTracking.getAppAttachID();
        Logger.i(this, (new StringBuilder()).append("appAttachId = ").append(intent).toString());
        if (!TextUtils.isEmpty(intent))
        {
            Logger.i(this, "appAttach partner code block.");
            (new PartnerCoding()).initializePartnerCode(context, intent, true);
        }
_L2:
        return;
_L4:
        if (!intent.hasExtra("referrer")) goto _L2; else goto _L5
_L5:
        obj = new HashMap();
        int j;
        intent = intent.getStringExtra("referrer").split("&");
        j = intent.length;
        int i = 0;
_L7:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        String as[] = intent[i].split("=");
        if (as.length > 1)
        {
            ((HashMap) (obj)).put(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
            Logger.i(this, (new StringBuilder()).append("referrer: ").append(obj).toString());
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        intent;
        intent.printStackTrace();
        if (!((String)((HashMap) (obj)).get("utm_campaign")).toLowerCase().equals("accuweather_promotional_campaign")) goto _L2; else goto _L8
_L8:
        intent = (String)((HashMap) (obj)).get("utm_medium");
        Logger.i(this, "campaign is %s and medium is %s", new Object[] {
            "", intent
        });
        (new PartnerCoding()).initializePartnerCode(context, intent, false);
        return;
    }
}
