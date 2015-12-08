// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.util.Base64;
import com.google.gson.Gson;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientToken
{

    private static final Pattern a = Pattern.compile("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)");
    private String b;
    private String c;

    public ClientToken()
    {
    }

    public static ClientToken a(String s)
    {
        String s1 = s;
        if (a.matcher(s).matches())
        {
            s1 = new String(Base64.decode(s, 0));
        }
        return (ClientToken)(new Gson()).fromJson(s1, com/braintreepayments/api/models/ClientToken);
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

}
