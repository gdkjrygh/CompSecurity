// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class h
{

    public h()
    {
    }

    public static String a(Map map, String s)
    {
        if (map == null || map.isEmpty())
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(s);
        Object obj = map.keySet();
        if (!s.endsWith("?"))
        {
            stringbuilder.append("?");
        }
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                stringbuilder.deleteCharAt(stringbuilder.length() - 1);
                return stringbuilder.toString();
            }
            s = (String)((Iterator) (obj)).next();
            StringBuilder stringbuilder1 = (new StringBuilder(String.valueOf(URLEncoder.encode(s)))).append("=");
            if (map.get(s) == null)
            {
                s = "";
            } else
            {
                s = map.get(s).toString();
            }
            stringbuilder.append(stringbuilder1.append(URLEncoder.encode(s)).append("&").toString());
        } while (true);
    }
}
