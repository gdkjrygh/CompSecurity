// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import org.json.JSONObject;

public class ae
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;

    public ae(int i, int j, int k, int l, int i1, boolean flag, boolean flag1, 
            long l1)
    {
        e = 10;
        f = false;
        g = false;
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
        f = flag;
        g = flag1;
        h = l1;
    }

    public ae(JSONObject jsonobject)
    {
        e = 10;
        f = false;
        g = false;
        a = jsonobject.optInt("accountMonthlyListening");
        b = jsonobject.optInt("deviceMonthlyListening");
        c = jsonobject.optInt("monthlyCapHours");
        d = jsonobject.optInt("monthlyCapWarningPercent");
        e = jsonobject.optInt("monthlyCapWarningRepeatPercent", 10);
        f = jsonobject.optBoolean("isMonthlyPayer", false);
        g = jsonobject.optBoolean("isCapped", false);
        if (jsonobject.has("listeningTimestamp"))
        {
            h = jsonobject.optLong("listeningTimestamp");
        }
    }

    public int a()
    {
        return a;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public boolean f()
    {
        return g;
    }

    public boolean g()
    {
        return f;
    }

    public long h()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserUsageInfo{accountMonthlyListening=").append(a).append(", deviceMonthlyListening=").append(b).append(", monthlyCapHours=").append(c).append(", monthlyCapWarningPercent=").append(d).append(", monthlyCapWarningRepeatPercent=").append(e).append(", isMonthlyPayer=").append(f).append(", isCapped=").append(g).append(", listeningTimestamp=").append(h).append('}').toString();
    }
}
