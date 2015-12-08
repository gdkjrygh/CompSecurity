// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.a.a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public final class ah
{

    protected a a;
    private transient String b;
    private transient Properties c;

    public ah(String s)
    {
        a = new a();
        s = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        a(s);
        s.close();
    }

    private void a(BufferedReader bufferedreader)
    {
        do
        {
            String s = bufferedreader.readLine();
            if (s == null)
            {
                break;
            }
            String s2 = s.trim();
            if (s2.matches("\\[.*\\]"))
            {
                b = s2.replaceFirst("\\[(.*)\\]", "$1");
                c = new Properties();
            } else
            if (s2.matches(".*=.*"))
            {
                int i = s2.indexOf('=');
                String s1 = s2.substring(0, i);
                s2 = s2.substring(i + 1);
                c.setProperty(s1, s2);
                a.put(b, c);
            }
        } while (true);
    }

    public final int a(String s, String s1, int i)
    {
        s = a(s, s1, Integer.toString(i));
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return i;
        }
        return j;
    }

    public final String a(String s, String s1, String s2)
    {
        s = (Properties)a.get(s);
        if (s != null)
        {
            if ((s = s.getProperty(s1)) != null)
            {
                return s;
            }
        }
        return s2;
    }
}
