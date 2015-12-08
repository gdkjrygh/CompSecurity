// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LogParams extends HashMap
{

    public static final String KEY_CAUSE = "cause";

    public LogParams()
    {
    }

    private String a(char c, char c1, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = entrySet().iterator();
        boolean flag1 = false;
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (flag1)
            {
                stringbuilder.append(c1);
            }
            stringbuilder.append((String)entry.getKey()).append(c);
            if (flag)
            {
                try
                {
                    stringbuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                }
                catch (UnsupportedEncodingException unsupportedencodingexception) { }
            } else
            {
                stringbuilder.append(entry.getValue());
            }
            flag1 = true;
        }
        return stringbuilder.toString();
    }

    public static LogParams create(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new LogParams();
        } else
        {
            return (new LogParams()).addParam("cause", s);
        }
    }

    public LogParams addParam(String s, Object obj)
    {
        put(s, obj);
        return this;
    }

    public String toString()
    {
        return a(':', ',', false);
    }

    public String toUrlString()
    {
        return a('=', '&', true);
    }
}
