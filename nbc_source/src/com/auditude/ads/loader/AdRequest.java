// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.loader;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.util.MD5;
import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.URLUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdRequest
{

    private static final String IMPRESSION_FORMAT = "15";
    private static final String OUTPUT_FORMAT = "1.4";
    private String aamSegments[];
    private String aamUuid;
    private HashMap data;
    private String domain;
    private Object mediaId;
    private int timeout;
    private boolean useSSL;
    private int zoneId;

    public AdRequest(Object obj, int i, String s, HashMap hashmap, int j)
    {
        useSSL = false;
        zoneId = i;
        domain = s;
        mediaId = obj;
        data = hashmap;
        timeout = j;
        if (timeout >= 0);
    }

    private String getGeoString()
    {
        Object obj = AuditudeEnv.getInstance().getAdSettings();
        String s = ObjectUtil.convertToString(((AdSettings) (obj)).getCustomParamValue("auditudeParamZipCode"), null);
        obj = ObjectUtil.convertToString(((AdSettings) (obj)).getCustomParamValue("auditudeParamCountryCode"), null);
        if (StringUtil.isNullOrEmpty(s) && StringUtil.isNullOrEmpty(((String) (obj))))
        {
            return null;
        } else
        {
            return (new StringBuilder(";")).append(((String) (obj))).append(";;;").append(s).append(";;").toString();
        }
    }

    private String getGroupId()
    {
        return "1000005";
    }

    private String getTimelineString()
    {
        HashMap hashmap = data;
        if (hashmap == null || !hashmap.containsKey("auditudeTimeline"))
        {
            return null;
        } else
        {
            return (String)hashmap.get("auditudeTimeline");
        }
    }

    public final String getAdRequestUrl()
    {
        Object obj;
        StringBuilder stringbuilder;
        int i;
        Object obj1 = null;
        if (domain == null || mediaId == null || zoneId <= 0)
        {
            return null;
        }
        Object obj3 = new StringBuilder("http");
        AdSettings adsettings;
        if (useSSL)
        {
            obj = "s";
        } else
        {
            obj = "";
        }
        stringbuilder = new StringBuilder(((StringBuilder) (obj3)).append(((String) (obj))).append("://").toString());
        obj3 = "";
        adsettings = AuditudeEnv.getInstance().getAdSettings();
        obj = obj3;
        if (adsettings.getProperty("adRequestDomain") != null)
        {
            obj = obj3;
            if (StringUtil.isNotNullOrEmpty(adsettings.getProperty("adRequestDomain").toString()))
            {
                obj = adsettings.getProperty("adRequestDomain").toString();
            }
        }
        if (StringUtil.isNotNullOrEmpty(((String) (obj))))
        {
            stringbuilder.append((new StringBuilder(String.valueOf(obj))).append("/adserver?").toString());
        } else
        {
            if (!URLUtil.isIPAddress(domain))
            {
                stringbuilder.append("ad.");
            }
            stringbuilder.append((new StringBuilder(String.valueOf(domain))).append("/adserver?").toString());
        }
        if (!(mediaId instanceof Iterable))
        {
            break MISSING_BLOCK_LABEL_500;
        }
        obj = obj1;
        if (mediaId instanceof Iterable)
        {
            obj = (Iterable)mediaId;
        }
        i = 0;
        obj = ((Iterable) (obj)).iterator();
_L3:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        stringbuilder.append((new StringBuilder("&z=")).append(zoneId).toString());
        stringbuilder.append((new StringBuilder("&l=")).append((new com.auditude.ads.util.AuditudeUtil.LocaltimeTagResult()).getResult()).toString());
        stringbuilder.append("&of=1.4");
        stringbuilder.append("&tm=15");
        stringbuilder.append((new StringBuilder("&g=")).append(getGroupId()).toString());
        obj = getGeoString();
        if (StringUtil.isNotNullOrEmpty(((String) (obj))))
        {
            stringbuilder.append((new StringBuilder("&geo=")).append(URLUtil.urlEncode(((String) (obj)))).toString());
        }
        obj = getTimelineString();
        if (StringUtil.isNotNullOrEmpty(((String) (obj))))
        {
            stringbuilder.append((new StringBuilder("&tl=")).append(((String) (obj))).toString());
        }
        return stringbuilder.toString();
_L2:
        Object obj2 = ((Iterator) (obj)).next();
        if (obj2 != null && !StringUtil.isNullOrEmpty((String)obj2))
        {
            if (i > 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((new StringBuilder("u=")).append(MD5.GetMd5String((String)obj2)).toString());
            i++;
        }
          goto _L3
        if (mediaId.getClass() == java/lang/String)
        {
            stringbuilder.append((new StringBuilder("u=")).append(MD5.GetMd5String(mediaId.toString())).toString());
        }
          goto _L1
    }

    public final String getDomain()
    {
        return domain;
    }

    public final String getKeyValueString()
    {
        StringBuilder stringbuilder;
        Object obj;
        obj = data;
        if (obj == null || !((HashMap) (obj)).containsKey("userData"))
        {
            return null;
        }
        stringbuilder = new StringBuilder("");
        obj = ((HashMap) (obj)).get("userData");
        if (obj == null)
        {
            return stringbuilder.toString();
        }
        if (obj.getClass() != java/lang/String) goto _L2; else goto _L1
_L1:
        String as[] = ((String)obj).split(";");
        if (as == null || as.length <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = as.length;
        i = 0;
_L10:
        if (i < j) goto _L4; else goto _L2
_L2:
        if (!(obj instanceof Map)) goto _L6; else goto _L5
_L5:
        obj = ((Map)obj).entrySet().iterator();
_L11:
        boolean flag = ((Iterator) (obj)).hasNext();
        if (flag) goto _L7; else goto _L6
_L6:
        if (aamSegments == null || aamSegments.length <= 0) goto _L9; else goto _L8
_L8:
        i = 0;
_L12:
        if (i < aamSegments.length)
        {
            break MISSING_BLOCK_LABEL_366;
        }
_L9:
        if (aamUuid != null && aamUuid.length() > 0)
        {
            stringbuilder.append((new StringBuilder("aud_aam_uuid=")).append(aamUuid).append("\n").toString());
        }
        return stringbuilder.toString();
_L4:
        String s = as[i];
        int k = s.indexOf("=");
        if (k > 0)
        {
            stringbuilder.append((new StringBuilder(String.valueOf(URLUtil.urlEncode(s.substring(0, k))))).append("=").append(URLUtil.urlEncode(s.substring(k + 1))).append("\n").toString());
        }
        i++;
          goto _L10
_L7:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        stringbuilder.append((new StringBuilder(String.valueOf(URLUtil.urlEncode(entry.getKey().toString())))).append("=").append(URLUtil.urlEncode(entry.getValue().toString())).append("\n").toString());
        ((Iterator) (obj)).remove();
          goto _L11
        RuntimeException runtimeexception;
        runtimeexception;
          goto _L6
        stringbuilder.append((new StringBuilder("aud_aam_segs=")).append(aamSegments[i]).append("\n").toString());
        i++;
          goto _L12
    }

    public final Object getMediaId()
    {
        return mediaId;
    }

    public final boolean getUseSSL()
    {
        return useSSL;
    }

    public final int getZoneId()
    {
        return zoneId;
    }

    public final void setAamSegments(String as[])
    {
        aamSegments = as;
    }

    public final void setAamUuid(String s)
    {
        aamUuid = s;
    }

    public final void setUseSSL(boolean flag)
    {
        useSSL = flag;
    }
}
