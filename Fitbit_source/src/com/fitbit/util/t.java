// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.e.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class t
{

    public static final String a = "EncodingUtils";

    public t()
    {
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
            com.fitbit.e.a.e("EncodingUtils", "UTF8 is an Unsupported encoding", unsupportedencodingexception, new Object[0]);
            return URLEncoder.encode(s);
        }
        return s1;
    }
}
