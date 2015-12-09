// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import java.util.HashMap;

public class j
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e[];
    private String f[];
    private String g[];
    private String h;
    private String i;
    private String j;

    public j(HashMap hashmap)
    {
        a = (String)hashmap.get("confirmationText");
        b = (String)hashmap.get("descriptionText");
        c = (String)hashmap.get("headlineText");
        d = (String)hashmap.get("imageBannerUrl");
        e = a(hashmap, "conversionUrls");
        f = a(hashmap, "impressionUrls");
        g = a(hashmap, "initiationUrls");
        h = (String)hashmap.get("learnMoreUrl");
        i = (String)hashmap.get("privacyPolicyUrl");
        j = (String)hashmap.get("submitUrl");
    }

    private String[] a(HashMap hashmap, String s)
    {
        if (!hashmap.isEmpty() && hashmap.containsKey(s))
        {
            return ((String)hashmap.get(s)).split(",");
        } else
        {
            return null;
        }
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String[] e()
    {
        return e;
    }

    public String[] f()
    {
        return f;
    }

    public String[] g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }
}
