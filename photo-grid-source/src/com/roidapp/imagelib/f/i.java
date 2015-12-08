// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import java.util.HashMap;

final class i
{

    HashMap a;

    private i(String s)
    {
        a = new HashMap();
        s = s.split(";");
        int k = s.length;
        for (int j = 0; j < k; j++)
        {
            String as[] = s[j].split(":");
            if (as.length == 2)
            {
                a.put(as[0], as[1]);
            }
        }

    }

    i(String s, byte byte0)
    {
        this(s);
    }

    public final String a(String s)
    {
        return (String)a.get(s);
    }
}
