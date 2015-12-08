// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            MetaModel, Hit

class HitBuilder
{

    HitBuilder()
    {
    }

    static String encode(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError((new StringBuilder()).append("URL encoding failed for: ").append(s).toString());
        }
        return s1;
    }

    static Map generateHitParams(MetaModel metamodel, Map map)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)iterator.next();
            MetaModel.MetaInfo metainfo = metamodel.getMetaInfo((String)map.getKey());
            if (metainfo != null)
            {
                String s1 = metainfo.getUrlParam((String)map.getKey());
                if (s1 != null)
                {
                    String s = (String)map.getValue();
                    map = s;
                    if (metainfo.getFormatter() != null)
                    {
                        map = metainfo.getFormatter().format(s);
                    }
                    if (map != null && !map.equals(metainfo.getDefaultValue()))
                    {
                        hashmap.put(s1, map);
                    }
                }
            }
        } while (true);
        return hashmap;
    }

    static String postProcessHit(Hit hit, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(hit.getHitParams());
        if (hit.getHitTime() > 0L)
        {
            l -= hit.getHitTime();
            if (l >= 0L)
            {
                stringbuilder.append("&").append("qt").append("=").append(l);
            }
        }
        stringbuilder.append("&").append("z").append("=").append(hit.getHitId());
        return stringbuilder.toString();
    }
}
