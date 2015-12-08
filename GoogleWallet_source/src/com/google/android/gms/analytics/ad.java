// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ad
{

    private final Map BL = new HashMap();
    private final Map BM = new HashMap();
    private final boolean BN;
    private final String BO;

    public ad(String s, boolean flag)
    {
        BN = flag;
        BO = s;
    }

    public final void e(String s, int i)
    {
        if (!BN)
        {
            return;
        }
        Integer integer1 = (Integer)BL.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        BL.put(s, Integer.valueOf(integer.intValue() + i));
    }

    public final String fb()
    {
        if (!BN)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(BO);
        String s;
        for (Iterator iterator = BL.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(BL.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = BM.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)BM.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }

    public final void h(String s, String s1)
    {
        if (!BN || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            BM.put(s, s1);
            return;
        }
    }
}
