// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.model:
//            SourceAwareMetadataObject

public class Source extends SourceAwareMetadataObject
{
    public static final class Fields
    {

        public static final String BIT_RATE = "bitRate";
        public static final String DURATION = "duration";
        public static final String HEADERS = "headers";
        public static final String URL = "url";

        public Fields()
        {
        }
    }


    public Source(String s)
    {
        super(new HashMap());
        a(s);
    }

    public Source(String s, DeliveryType deliverytype)
    {
        super(new HashMap());
        a(s);
        a(deliverytype);
    }

    public Source(Map map)
    {
        super(map);
    }

    private void a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("urlRequired"));
        } else
        {
            a.put("url", s);
            return;
        }
    }

    public Integer getBitRate()
    {
        Object obj = a.get("bitRate");
        if (obj != null && (obj instanceof Integer))
        {
            return (Integer)obj;
        } else
        {
            return Integer.valueOf(-1);
        }
    }

    public String getUrl()
    {
        return (String)a.get("url");
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Source{");
        stringbuilder.append("deliveryType: ").append(getDeliveryType().toString());
        StringBuilder stringbuilder1 = stringbuilder.append(", url: ");
        String s;
        if (getUrl() == null)
        {
            s = "N/A";
        } else
        {
            s = getUrl();
        }
        stringbuilder1.append(s);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
