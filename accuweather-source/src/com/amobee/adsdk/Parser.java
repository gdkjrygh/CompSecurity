// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            AdManager, AmobeeAdPlaceholder, Log, BaseAdapter, 
//            GmsAdsAdapter, MillennialAdapter, Pulse3DAdapter, Parameters, 
//            NetworkHelper, AmobeeAdSpace, AmobeeAdapter, IAmobeeListener

class Parser
{
    static class CreateAdmobAdapterWrapper
    {

        static BaseAdapter createAdmobAdapter(String s, String s1, String s2, String s3, Context context, String s4)
        {
            s1 = AdManager.getInstance();
            s = null;
            if (AdManager.doesClassExist("com.google.android.gms.ads.AdView"))
            {
                s = new GmsAdsAdapter(context, s1.parameters(), s2, s3, s4);
            }
            return s;
        }

        CreateAdmobAdapterWrapper()
        {
        }
    }

    static class CreateMillennialAdapterWrapper
    {

        static BaseAdapter createMillennialAdapter(String s, String s1, String s2, String s3, Context context, AmobeeAdPlaceholder amobeeadplaceholder, String s4)
        {
            return new MillennialAdapter(context, AdManager.getInstance().parameters(), s2, s3, amobeeadplaceholder, s4);
        }

        CreateMillennialAdapterWrapper()
        {
        }
    }

    static class CreatePulse3DAdapterWrapper
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

        CreatePulse3DAdapterWrapper()
        {
        }
    }


    static final String TAG = "Amobee Parser";

    Parser()
    {
    }

    static BaseAdapter createClientAdNwAdapter(String s, String s1, String s2, String s3, String s4, AmobeeAdPlaceholder amobeeadplaceholder, String s5)
    {
        AdManager.getInstance();
        s3 = amobeeadplaceholder.getContext();
        if (s.equals("adMob") || s1.equals("adMob"))
        {
            return CreateAdmobAdapterWrapper.createAdmobAdapter(s, s1, s2, s4, s3, s5);
        }
        if (s.equals("clMmi") || s1.equals("clMmi"))
        {
            return CreateMillennialAdapterWrapper.createMillennialAdapter(s, s1, s2, s4, s3, amobeeadplaceholder, s5);
        } else
        {
            return null;
        }
    }

    static void createPulse3DAdapter(String s, AmobeeAdPlaceholder amobeeadplaceholder, String s1, Context context, String s2)
    {
        CreatePulse3DAdapterWrapper.createPulse3DAdapterFunc(s, amobeeadplaceholder, s1, context, s2);
    }

    static void parse(final HashMap map, final AmobeeAdPlaceholder placeholder)
    {
        Log.d("Amobee Parser", (new StringBuilder("parsing for")).append(placeholder).toString());
        final AdManager am = AdManager.getInstance();
        final Context context = am.getContext();
        map = new Runnable() {

            private final AdManager val$am;
            private final Context val$context;
            private final HashMap val$map;
            private final AmobeeAdPlaceholder val$placeholder;

            public void run()
            {
                String s;
                Object obj1;
                String s2;
                s = (String)map.get(NetworkHelper.NW);
                String s3 = (String)map.get(NetworkHelper.MEDIATION);
                String s5 = (String)map.get(NetworkHelper.NWID);
                String s6 = (String)map.get(NetworkHelper.NW_MAP_PARAMS);
                s2 = (String)map.get(NetworkHelper.CORRELATOR);
                String s7 = (String)map.get(NetworkHelper.NOTIFICATION);
                String s8 = (String)map.get(NetworkHelper.FREQUENCY);
                String s9 = (String)map.get(NetworkHelper.FREQUENCY_SESSION);
                obj1 = (String)map.get(NetworkHelper.ADSPACE);
                String s10 = (String)map.get(NetworkHelper.PASSBACK);
                if (s8 != null && !s8.equals(""))
                {
                    AmobeeAdSpace amobeeadspace = new AmobeeAdSpace(((String) (obj1)));
                    if (!s9.equals(""))
                    {
                        amobeeadspace.setSession(Integer.parseInt(s9));
                    }
                    amobeeadspace.setCappingMinutes(Integer.parseInt(s8));
                    am.saveAdSpace(amobeeadspace);
                } else
                {
                    am.removeAdSpace(((String) (obj1)));
                }
                if (s7 != null && !s7.equals(""))
                {
                    am.setNotificationServerURL(s7);
                } else
                {
                    am.setNotificationServerURL("");
                }
                if (s5 == null || s5.equals("") || (s == null || s.equals("")) && (s3 == null || s3.equals(""))) goto _L2; else goto _L1
_L1:
                if (s10 != null && !s10.equals(""))
                {
                    am.setPassbackURL(s10);
                }
                obj1 = Parser.createClientAdNwAdapter(s, s3, (String)map.get(NetworkHelper.NWID), s6, s2, placeholder, ((String) (obj1)));
                if (obj1 == null) goto _L4; else goto _L3
_L3:
                placeholder.setCurrentAdapter(((BaseAdapter) (obj1)));
_L6:
                return;
_L4:
                NetworkHelper.sendNotification(BaseAdapter.createNotificationURL(0, s2));
                if (s != null)
                {
                    if (s.equals(""));
                }
                AdManager.getInstance().getAd(placeholder);
                return;
_L2:
                am.setPassbackURL("");
                String s4 = (String)map.get(NetworkHelper.FRAGMENT);
                String s1 = (String)map.get(NetworkHelper.STATUS);
                if (s4 != null && !s4.equals("") && s1.equals("6200"))
                {
                    Object obj = placeholder.getCurrentAdapter();
                    if (s4.contains("<Pulse3DFileLocation>"))
                    {
                        Parser.createPulse3DAdapter(s2, placeholder, s4, context, ((String) (obj1)));
                        return;
                    }
                    if (obj == null || !(obj instanceof AmobeeAdapter))
                    {
                        obj = new AmobeeAdapter(context, am.parameters(), s4, placeholder.getBannerWidth(true), placeholder.getBannerHeight(true), ((String) (obj1)));
                        placeholder.setCurrentAdapter(((BaseAdapter) (obj)));
                        ((BaseAdapter) (obj)).adRecieved();
                    } else
                    {
                        ((AmobeeAdapter)obj).updateAdapter(am.parameters(), s4, placeholder.getBannerWidth(true), placeholder.getBannerHeight(true), ((String) (obj1)));
                    }
                    ((BaseAdapter) (obj)).setAdspace(((String) (obj1)));
                    return;
                }
                if (placeholder.getNextAdapter() == null)
                {
                    am.getAmobeeListener().amobeeOnAdFailed(placeholder);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                map = hashmap;
                am = admanager;
                placeholder = amobeeadplaceholder;
                context = context1;
                super();
            }
        };
        if (context instanceof Activity)
        {
            ((Activity)context).runOnUiThread(map);
            return;
        } else
        {
            Log.d("[a\u2022mo\u2022bee]", "context is not Activity, posting on placeholder");
            placeholder.post(map);
            return;
        }
    }
}
