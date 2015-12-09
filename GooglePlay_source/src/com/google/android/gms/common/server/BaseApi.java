// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;

public abstract class BaseApi
{

    public BaseApi()
    {
    }

    public static String append(String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        if (s.indexOf("?") != -1)
        {
            stringbuilder.append('&');
        } else
        {
            stringbuilder.append('?');
        }
        stringbuilder.append(s1);
        stringbuilder.append('=');
        stringbuilder.append(s2);
        return stringbuilder.toString();
    }

    public static void append(StringBuilder stringbuilder, String s, String s1)
    {
        if (stringbuilder.indexOf("?") != -1)
        {
            stringbuilder.append('&');
        } else
        {
            stringbuilder.append('?');
        }
        stringbuilder.append(s);
        stringbuilder.append('=');
        stringbuilder.append(s1);
    }

    public static String enc(String s)
    {
        Preconditions.checkNotNull(s, "Encoding a null parameter!");
        return Uri.encode(s);
    }
}
