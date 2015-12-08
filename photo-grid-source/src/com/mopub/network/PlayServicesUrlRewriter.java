// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.content.Context;
import android.net.Uri;
import com.mopub.common.GpsHelper;

public class PlayServicesUrlRewriter
    implements com.mopub.volley.toolbox.HurlStack.UrlRewriter
{

    public static final String DO_NOT_TRACK_TEMPLATE = "mp_tmpl_do_not_track";
    public static final String UDID_TEMPLATE = "mp_tmpl_advertising_id";
    private final String a;
    private final Context b;

    public PlayServicesUrlRewriter(String s, Context context)
    {
        a = s;
        b = context.getApplicationContext();
    }

    public String rewriteUrl(String s)
    {
        Object obj1;
        if (!s.contains("mp_tmpl_advertising_id") && !s.contains("mp_tmpl_do_not_track"))
        {
            return s;
        }
        obj1 = new com.mopub.common.GpsHelper.AdvertisingInfo(a, false);
        if (!GpsHelper.isPlayServicesAvailable(b)) goto _L2; else goto _L1
_L1:
        Object obj = GpsHelper.fetchAdvertisingInfoSync(b);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj1 = "ifa:";
_L5:
        obj1 = s.replace("mp_tmpl_advertising_id", Uri.encode((new StringBuilder()).append(((String) (obj1))).append(((com.mopub.common.GpsHelper.AdvertisingInfo) (obj)).advertisingId).toString()));
        if (((com.mopub.common.GpsHelper.AdvertisingInfo) (obj)).limitAdTracking)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        return ((String) (obj1)).replace("mp_tmpl_do_not_track", s);
_L2:
        obj = obj1;
        obj1 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }
}
