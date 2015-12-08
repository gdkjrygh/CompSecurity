// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class wz extends d
{

    public String a;
    public boolean b;

    public wz()
    {
    }

    public final void a(d d1)
    {
        d1 = (wz)d1;
        if (!TextUtils.isEmpty(a))
        {
            d1.a = a;
        }
        if (b)
        {
            d1.b = b;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("description", a);
        hashmap.put("fatal", Boolean.valueOf(b));
        return a(hashmap);
    }
}
