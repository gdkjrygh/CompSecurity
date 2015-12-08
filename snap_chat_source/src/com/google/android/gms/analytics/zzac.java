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
//            zzab

public class zzac
{

    public static String encode(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError((new StringBuilder("URL encoding failed for: ")).append(s).toString());
        }
        return s1;
    }

    static Map zzC(Map map)
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

    public static String zza(zzab zzab1, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzab1.zzgr());
        if (zzab1.zzgt() > 0L)
        {
            l -= zzab1.zzgt();
            if (l >= 0L)
            {
                stringbuilder.append("&qt=").append(l);
            }
        }
        stringbuilder.append("&z=").append(zzab1.zzgs());
        return stringbuilder.toString();
    }
}
