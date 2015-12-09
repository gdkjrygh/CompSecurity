// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.net;

import android.net.NetworkInfo;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.net:
//            NetworkType

public final class LogMobileType extends Enum
{

    private static final LogMobileType $VALUES[];
    public static final LogMobileType MOBILE;
    private static final String TAG = "nf_net";
    public static final LogMobileType UKNOWN;
    public static final LogMobileType WIFI;
    public static final LogMobileType _2G;
    public static final LogMobileType _3G;
    public static final LogMobileType _4G;
    private String desc;

    private LogMobileType(String s, int i, String s1)
    {
        super(s, i);
        desc = s1;
    }

    public static LogMobileType toLogMobileType(NetworkInfo networkinfo)
    {
        if (networkinfo == null)
        {
            return null;
        }
        if (networkinfo.getType() == 6)
        {
            return _4G;
        }
        if (networkinfo.getType() == 1)
        {
            return WIFI;
        }
        networkinfo = NetworkType.getNetworkType(networkinfo.getSubtype());
        if (Log.isLoggable("nf_net", 3))
        {
            Log.d("nf_net", (new StringBuilder()).append("NetworkType").append(networkinfo).toString());
        }
        return toLogMobileType(((NetworkType) (networkinfo)));
    }

    private static LogMobileType toLogMobileType(NetworkType networktype)
    {
        if (networktype == null)
        {
            return UKNOWN;
        }
        if (NetworkType.is2G(networktype))
        {
            return _2G;
        }
        if (NetworkType.is3G(networktype))
        {
            return _3G;
        }
        if (NetworkType.is4G(networktype))
        {
            return _4G;
        }
        if (NetworkType.UNKNOWN.equals(networktype))
        {
            return MOBILE;
        } else
        {
            return UKNOWN;
        }
    }

    public static LogMobileType valueOf(String s)
    {
        return (LogMobileType)Enum.valueOf(com/netflix/mediaclient/net/LogMobileType, s);
    }

    public static LogMobileType[] values()
    {
        return (LogMobileType[])$VALUES.clone();
    }

    public final String getDesc()
    {
        return desc;
    }

    static 
    {
        _2G = new LogMobileType("_2G", 0, "2g");
        _3G = new LogMobileType("_3G", 1, "3g");
        _4G = new LogMobileType("_4G", 2, "4g");
        WIFI = new LogMobileType("WIFI", 3, "wifi");
        MOBILE = new LogMobileType("MOBILE", 4, "mobile");
        UKNOWN = new LogMobileType("UKNOWN", 5, "uknown");
        $VALUES = (new LogMobileType[] {
            _2G, _3G, _4G, WIFI, MOBILE, UKNOWN
        });
    }
}
