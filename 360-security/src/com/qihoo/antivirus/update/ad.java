// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ad
{

    private Properties a;
    private Map b;

    public ad()
    {
        a = new Properties();
        b = new HashMap();
    }

    public String a(String s)
    {
        return a.getProperty(s);
    }

    public void a(String s, String s1)
    {
        a.setProperty(s, s1);
    }
}
