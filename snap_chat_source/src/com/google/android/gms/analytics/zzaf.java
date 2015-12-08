// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zzaf
{

    private final Map zzEO = new HashMap();
    private final Map zzEP = new HashMap();
    private final boolean zzEQ;
    private final String zzER;

    public zzaf(String s, boolean flag)
    {
        zzEQ = flag;
        zzER = s;
    }

    public void zze(String s, int i)
    {
        if (!zzEQ)
        {
            return;
        }
        Integer integer1 = (Integer)zzEO.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        zzEO.put(s, Integer.valueOf(integer.intValue() + i));
    }

    public String zzgx()
    {
        if (!zzEQ)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzER);
        String s;
        for (Iterator iterator = zzEO.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(zzEO.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = zzEP.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)zzEP.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }

    public void zzk(String s, String s1)
    {
        if (!zzEQ || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            zzEP.put(s, s1);
            return;
        }
    }
}
