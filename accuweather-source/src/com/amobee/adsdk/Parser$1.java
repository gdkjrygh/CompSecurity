// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import java.util.HashMap;

// Referenced classes of package com.amobee.adsdk:
//            Parser, NetworkHelper, AmobeeAdSpace, AdManager, 
//            AmobeeAdPlaceholder, BaseAdapter, AmobeeAdapter, IAmobeeListener

class val.context
    implements Runnable
{

    private final AdManager val$am;
    private final Context val$context;
    private final HashMap val$map;
    private final AmobeeAdPlaceholder val$placeholder;

    public void run()
    {
        String s;
        Object obj1;
        String s2;
        s = (String)val$map.get(NetworkHelper.NW);
        String s3 = (String)val$map.get(NetworkHelper.MEDIATION);
        String s5 = (String)val$map.get(NetworkHelper.NWID);
        String s6 = (String)val$map.get(NetworkHelper.NW_MAP_PARAMS);
        s2 = (String)val$map.get(NetworkHelper.CORRELATOR);
        String s7 = (String)val$map.get(NetworkHelper.NOTIFICATION);
        String s8 = (String)val$map.get(NetworkHelper.FREQUENCY);
        String s9 = (String)val$map.get(NetworkHelper.FREQUENCY_SESSION);
        obj1 = (String)val$map.get(NetworkHelper.ADSPACE);
        String s10 = (String)val$map.get(NetworkHelper.PASSBACK);
        if (s8 != null && !s8.equals(""))
        {
            AmobeeAdSpace amobeeadspace = new AmobeeAdSpace(((String) (obj1)));
            if (!s9.equals(""))
            {
                amobeeadspace.setSession(Integer.parseInt(s9));
            }
            amobeeadspace.setCappingMinutes(Integer.parseInt(s8));
            val$am.saveAdSpace(amobeeadspace);
        } else
        {
            val$am.removeAdSpace(((String) (obj1)));
        }
        if (s7 != null && !s7.equals(""))
        {
            val$am.setNotificationServerURL(s7);
        } else
        {
            val$am.setNotificationServerURL("");
        }
        if (s5 == null || s5.equals("") || (s == null || s.equals("")) && (s3 == null || s3.equals(""))) goto _L2; else goto _L1
_L1:
        if (s10 != null && !s10.equals(""))
        {
            val$am.setPassbackURL(s10);
        }
        obj1 = Parser.createClientAdNwAdapter(s, s3, (String)val$map.get(NetworkHelper.NWID), s6, s2, val$placeholder, ((String) (obj1)));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        val$placeholder.setCurrentAdapter(((BaseAdapter) (obj1)));
_L6:
        return;
_L4:
        NetworkHelper.sendNotification(BaseAdapter.createNotificationURL(0, s2));
        if (s != null)
        {
            if (s.equals(""));
        }
        AdManager.getInstance().getAd(val$placeholder);
        return;
_L2:
        val$am.setPassbackURL("");
        String s4 = (String)val$map.get(NetworkHelper.FRAGMENT);
        String s1 = (String)val$map.get(NetworkHelper.STATUS);
        if (s4 != null && !s4.equals("") && s1.equals("6200"))
        {
            Object obj = val$placeholder.getCurrentAdapter();
            if (s4.contains("<Pulse3DFileLocation>"))
            {
                Parser.createPulse3DAdapter(s2, val$placeholder, s4, val$context, ((String) (obj1)));
                return;
            }
            if (obj == null || !(obj instanceof AmobeeAdapter))
            {
                obj = new AmobeeAdapter(val$context, val$am.parameters(), s4, val$placeholder.getBannerWidth(true), val$placeholder.getBannerHeight(true), ((String) (obj1)));
                val$placeholder.setCurrentAdapter(((BaseAdapter) (obj)));
                ((BaseAdapter) (obj)).adRecieved();
            } else
            {
                ((AmobeeAdapter)obj).updateAdapter(val$am.parameters(), s4, val$placeholder.getBannerWidth(true), val$placeholder.getBannerHeight(true), ((String) (obj1)));
            }
            ((BaseAdapter) (obj)).setAdspace(((String) (obj1)));
            return;
        }
        if (val$placeholder.getNextAdapter() == null)
        {
            val$am.getAmobeeListener().amobeeOnAdFailed(val$placeholder);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    laceholder()
    {
        val$map = hashmap;
        val$am = admanager;
        val$placeholder = amobeeadplaceholder;
        val$context = context1;
        super();
    }
}
