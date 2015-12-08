// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class xc extends d
{

    public String a;
    public long b;
    public String c;
    public String d;

    public xc()
    {
    }

    public final void a(d d1)
    {
        d1 = (xc)d1;
        if (!TextUtils.isEmpty(a))
        {
            d1.a = a;
        }
        if (b != 0L)
        {
            d1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            d1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            d1.d = d;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", a);
        hashmap.put("timeInMillis", Long.valueOf(b));
        hashmap.put("category", c);
        hashmap.put("label", d);
        return a(hashmap);
    }
}
