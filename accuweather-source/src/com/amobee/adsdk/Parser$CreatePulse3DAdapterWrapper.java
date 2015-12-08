// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            Parser, AdManager, AmobeeAdPlaceholder, Pulse3DAdapter, 
//            Log, Parameters

static class _cls9
{

    static void createPulse3DAdapterFunc(String s, AmobeeAdPlaceholder amobeeadplaceholder, String s1, Context context, String s2)
    {
        AdManager admanager = AdManager.getInstance();
        if (!(amobeeadplaceholder.getCurrentAdapter() instanceof Pulse3DAdapter)) goto _L2; else goto _L1
_L1:
        amobeeadplaceholder = (Pulse3DAdapter)amobeeadplaceholder.getCurrentAdapter();
        amobeeadplaceholder.setCorrelator(s);
        amobeeadplaceholder.setURLFromFragment(s1);
        s = amobeeadplaceholder;
_L6:
        s.setAdspace(s2);
_L4:
        return;
_L2:
        boolean flag;
        boolean flag1;
        if (amobeeadplaceholder.getNextAdapter() instanceof Pulse3DAdapter)
        {
            amobeeadplaceholder = (Pulse3DAdapter)amobeeadplaceholder.getNextAdapter();
            amobeeadplaceholder.setCorrelator(s);
            amobeeadplaceholder.setURLFromFragment(s1);
            s = amobeeadplaceholder;
            continue; /* Loop/switch isn't completed */
        }
        context = new Pulse3DAdapter(context, admanager.parameters());
        context.setCorrelator(s);
        amobeeadplaceholder.setNextAdapter(context);
        context.setURLFromFragment(s1);
        Log.d("parser - pulse3d", (new StringBuilder("ad is loading from cache: ")).append(((Pulse3DAdapter) (context)).adIsLoadingFromCache).toString());
        flag = s1.contains("&backfill=0");
        flag1 = s1.contains("&backfill=1");
        if (flag) goto _L4; else goto _L3
_L3:
        if (((Pulse3DAdapter) (context)).adIsLoadingFromCache)
        {
            s = context;
            if (!flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        admanager.parameters().getParameters().remove("pulse3d");
        admanager.getAd(amobeeadplaceholder);
        Log.d("", "is: backfill request while pulse3d ad is loading...");
        s = context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    _cls9()
    {
    }
}
