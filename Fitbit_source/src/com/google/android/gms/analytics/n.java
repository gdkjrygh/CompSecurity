// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            m

public class n
{

    public static String a(m m1, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(m1.a());
        if (m1.c() > 0L)
        {
            l -= m1.c();
            if (l >= 0L)
            {
                stringbuilder.append("&qt").append("=").append(l);
            }
        }
        stringbuilder.append("&z").append("=").append(m1.b());
        return stringbuilder.toString();
    }

    public static String a(String s)
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

    static Map a(Map map)
    {
        HashMap hashmap = new HashMap();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (((String)entry.getKey()).startsWith("&") && entry.getValue() != null)
            {
                String s = ((String)entry.getKey()).substring(1);
                if (!TextUtils.isEmpty(s))
                {
                    hashmap.put(s, entry.getValue());
                }
            }
        } while (true);
        return hashmap;
    }
}
