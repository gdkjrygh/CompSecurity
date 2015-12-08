// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.e;

import com.cmcm.adsdk.b.c.b;
import java.util.List;
import java.util.Locale;

public final class a
{

    private static String a()
    {
        String s;
        try
        {
            s = Locale.getDefault().getLanguage();
            String s1 = Locale.getDefault().getCountry();
            s = (new StringBuilder()).append(s).append("_").append(s1).toString();
        }
        catch (Exception exception)
        {
            com.cmcm.adsdk.b.c.b.a((new StringBuilder("Get Language and Country is error...")).append(exception.getMessage()).toString());
            return "";
        }
        return s;
    }

    public static boolean a(String s)
    {
        return s != null && !"".equals(s);
    }

    public static boolean a(List list)
    {
        return list != null && list.size() != 0;
    }

    public static String b(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("action=pos_config");
        stringbuilder.append("&postype=1");
        stringbuilder.append((new StringBuilder("&mid=")).append(s).toString());
        stringbuilder.append("&posid=");
        stringbuilder.append((new StringBuilder("&cver=")).append(com.cmcm.adsdk.a.f()).toString());
        stringbuilder.append((new StringBuilder("&lan=")).append(a()).toString());
        stringbuilder.append("&v=15");
        return stringbuilder.toString();
    }
}
