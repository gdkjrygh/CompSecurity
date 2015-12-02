// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class aa
{

    private HashMap a;

    public aa(String s, Charset charset, boolean flag)
        throws IOException
    {
        a(s, charset);
    }

    private void a(String s, Charset charset)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(s.getBytes()), charset));
        a = new HashMap();
        s = null;
        do
        {
            String s1;
            do
            {
                charset = bufferedreader.readLine();
                if (charset == null)
                {
                    bufferedreader.close();
                    return;
                }
                s1 = charset.trim();
            } while (s1.length() == 0 || s1.startsWith("#") || s1.startsWith(";"));
            if (charset.startsWith("["))
            {
                if (!s1.endsWith("]") || s1.indexOf("]") != s1.length() - 1)
                {
                    s = null;
                } else
                {
                    s = s1.substring(1, s1.length() - 1);
                }
            } else
            if (s != null)
            {
                int i = charset.indexOf('=');
                if (i != -1)
                {
                    String s2 = charset.substring(0, i);
                    String s3 = charset.substring(i + 1);
                    if (s2 != null && s3 != null)
                    {
                        Properties properties = (Properties)a.get(s);
                        charset = properties;
                        if (properties == null)
                        {
                            charset = new Properties();
                            a.put(s, charset);
                        }
                        charset.setProperty(s2, s3);
                    }
                }
            }
        } while (true);
    }

    public String a(String s, String s1)
    {
        s = (Properties)a.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getProperty(s1);
        }
    }

    public Iterator a()
    {
        return a.keySet().iterator();
    }
}
