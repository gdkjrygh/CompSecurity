// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class af
{

    private final Map BO = new HashMap();
    private final Map BP = new HashMap();
    private final boolean BQ;
    private final String BR;

    public af(String s, boolean flag)
    {
        BQ = flag;
        BR = s;
    }

    public void e(String s, int i)
    {
        if (!BQ)
        {
            return;
        }
        Integer integer1 = (Integer)BO.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        BO.put(s, Integer.valueOf(integer.intValue() + i));
    }

    public String fg()
    {
        if (!BQ)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(BR);
        String s;
        for (Iterator iterator = BO.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(BO.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = BP.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)BP.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }

    public void g(String s, String s1)
    {
        if (!BQ || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            BP.put(s, s1);
            return;
        }
    }
}
