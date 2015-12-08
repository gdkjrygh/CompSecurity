// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public final class Y
{

    public Y()
    {
    }

    public final String a(String s)
    {
        InputStream inputstream;
        Properties properties;
        properties = new Properties();
        inputstream = getClass().getClassLoader().getResourceAsStream("config.properties");
        if (inputstream == null)
        {
            throw new FileNotFoundException((new StringBuilder("property file '")).append("config.properties").append("' not found in the classpath").toString());
        }
        properties.load(inputstream);
        inputstream.close();
        return properties.getProperty(s);
        s;
        inputstream.close();
        throw s;
    }
}
