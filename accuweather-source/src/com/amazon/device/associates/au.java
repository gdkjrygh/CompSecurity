// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class au
{

    public au()
    {
    }

    public static final String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return s;
        }
        return s1;
    }
}
