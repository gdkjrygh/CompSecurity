// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.util;

import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class c
{

    private static final Pattern a = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    public c()
    {
    }

    public static String a()
    {
        String s;
        try
        {
            s = InetAddress.getLocalHost().getHostName();
        }
        catch (Exception exception)
        {
            LogFactory.getLog(com/amazonaws/util/c).debug("Failed to determine the local hostname; fall back to use \"localhost\".", exception);
            return "localhost";
        }
        return s;
    }

    private static String a(String s)
    {
        if (s.endsWith(".s3") || s.endsWith(".s3-external-1"))
        {
            s = "us-east-1";
        } else
        {
            Object obj = a.matcher(s);
            if (((Matcher) (obj)).matches())
            {
                return ((Matcher) (obj)).group(1);
            }
            int i = s.lastIndexOf('.');
            if (i == -1)
            {
                return "us-east-1";
            }
            obj = s.substring(i + 1);
            s = ((String) (obj));
            if ("us-gov".equals(obj))
            {
                return "us-gov-west-1";
            }
        }
        return s;
    }

    public static String a(String s, String s1)
    {
        if (s.endsWith(".amazonaws.com"))
        {
            return a(s.substring(0, s.length() - ".amazonaws.com".length()));
        }
        if (s1 != null)
        {
            s = Pattern.compile((new StringBuilder()).append("^(?:.+\\.)?").append(Pattern.quote(s1)).append("[.-]([a-z0-9-]+)\\.").toString()).matcher(s);
            if (s.find())
            {
                return s.group(1);
            }
        }
        return "us-east-1";
    }

    public static String a(URI uri)
    {
        return a(uri.getHost(), null);
    }

    public static String b(URI uri)
    {
        uri = uri.getHost();
        if (!uri.endsWith(".amazonaws.com"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot parse a service name from an unrecognized endpoint (").append(uri).append(").").toString());
        }
        String s = uri.substring(0, uri.indexOf(".amazonaws.com"));
        if (s.endsWith(".s3") || a.matcher(s).matches())
        {
            uri = "s3";
        } else
        {
            uri = s;
            if (s.indexOf('.') != -1)
            {
                return s.substring(0, s.indexOf('.'));
            }
        }
        return uri;
    }

}
