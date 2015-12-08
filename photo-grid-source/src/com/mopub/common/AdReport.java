// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import com.mopub.network.AdResponse;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.mopub.common:
//            ClientMetadata

public class AdReport
    implements Serializable
{

    private final AdResponse a;
    private final String b;
    private final String c;
    private final String d;
    private final Locale e;
    private final String f;

    public AdReport(String s, ClientMetadata clientmetadata, AdResponse adresponse)
    {
        b = s;
        c = clientmetadata.getSdkVersion();
        d = clientmetadata.getDeviceModel();
        e = clientmetadata.getDeviceLocale();
        f = clientmetadata.getDeviceId();
        a = adresponse;
    }

    private static void a(StringBuilder stringbuilder, String s, String s1)
    {
        stringbuilder.append(s);
        stringbuilder.append(" : ");
        stringbuilder.append(s1);
        stringbuilder.append("\n");
    }

    public String getResponseString()
    {
        return a.getStringBody();
    }

    public String toString()
    {
        Integer integer = null;
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, "sdk_version", c);
        a(stringbuilder, "creative_id", a.getDspCreativeId());
        a(stringbuilder, "platform_version", Integer.toString(android.os.Build.VERSION.SDK_INT));
        a(stringbuilder, "device_model", d);
        a(stringbuilder, "ad_unit_id", b);
        Object obj;
        Object obj1;
        StringBuilder stringbuilder1;
        long l;
        if (e == null)
        {
            obj = null;
        } else
        {
            obj = e.toString();
        }
        a(stringbuilder, "device_locale", ((String) (obj)));
        a(stringbuilder, "device_id", f);
        a(stringbuilder, "network_type", a.getNetworkType());
        a(stringbuilder, "platform", "android");
        l = a.getTimestamp();
        obj = integer;
        if (l != -1L)
        {
            obj = (new SimpleDateFormat("M/d/yy hh:mm:ss a z", Locale.US)).format(new Date(l));
        }
        a(stringbuilder, "timestamp", ((String) (obj)));
        a(stringbuilder, "ad_type", a.getAdType());
        obj1 = a.getWidth();
        integer = a.getHeight();
        stringbuilder1 = new StringBuilder("{");
        obj = obj1;
        if (obj1 == null)
        {
            obj = "0";
        }
        obj1 = stringbuilder1.append(obj).append(", ");
        if (integer == null)
        {
            obj = "0";
        } else
        {
            obj = integer;
        }
        a(stringbuilder, "ad_size", ((StringBuilder) (obj1)).append(obj).append("}").toString());
        return stringbuilder.toString();
    }
}
