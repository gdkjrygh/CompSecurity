// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import java.util.HashMap;

// Referenced classes of package com.amobee.adsdk:
//            AmobeeInterstitial, NetworkHelper, AmobeeInterstitialListener, Log, 
//            AmobeeAdSpace, AdManager

class val.am
    implements Runnable
{

    final AmobeeInterstitial this$0;
    private final String val$adSpace;
    private final AdManager val$am;

    public void run()
    {
        new HashMap();
        String s = "";
        String s1 = "";
        Object obj = NetworkHelper.requestInterstitial(val$adSpace, AmobeeInterstitial.access$0(AmobeeInterstitial.this));
        if (obj == null)
        {
            AmobeeInterstitial.access$1(AmobeeInterstitial.this).interstitialFailed(AmobeeInterstitial.this);
            return;
        }
        if (((HashMap) (obj)).get(NetworkHelper.FRAGMENT) != null)
        {
            s = (String)((HashMap) (obj)).get(NetworkHelper.FRAGMENT);
            Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("Interstitial fragment: ")).append(s).toString());
        }
        if (((HashMap) (obj)).get(NetworkHelper.STATUS) != null)
        {
            s1 = (String)((HashMap) (obj)).get(NetworkHelper.STATUS);
        }
        if (!s.equals("") && s1.equals("6200"))
        {
            AmobeeInterstitial.access$2(AmobeeInterstitial.this, s);
            s = (String)((HashMap) (obj)).get(NetworkHelper.FREQUENCY);
            String s2 = (String)((HashMap) (obj)).get(NetworkHelper.FREQUENCY_SESSION);
            obj = (String)((HashMap) (obj)).get(NetworkHelper.ADSPACE);
            if (s != null && !s.equals(""))
            {
                AmobeeAdSpace amobeeadspace = new AmobeeAdSpace(((String) (obj)));
                if (s2 != null && !s2.equals(""))
                {
                    amobeeadspace.setSession(Integer.parseInt(s2));
                }
                amobeeadspace.setCappingMinutes(Integer.parseInt(s));
                val$am.saveAdSpace(amobeeadspace);
            }
            AmobeeInterstitial.access$3(AmobeeInterstitial.this, ((String) (obj)));
            AmobeeInterstitial.access$1(AmobeeInterstitial.this).interstitialRecieved(AmobeeInterstitial.this);
            return;
        } else
        {
            AmobeeInterstitial.access$1(AmobeeInterstitial.this).interstitialFailed(AmobeeInterstitial.this);
            return;
        }
    }

    tener()
    {
        this$0 = final_amobeeinterstitial;
        val$adSpace = s;
        val$am = AdManager.this;
        super();
    }
}
