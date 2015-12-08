// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class xa extends d
{

    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;

    public xa()
    {
        this((byte)0);
    }

    private xa(byte byte0)
    {
        UUID uuid;
        uuid = UUID.randomUUID();
        byte0 = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (byte0 == 0) goto _L2; else goto _L1
_L1:
        this(byte0);
        return;
_L2:
        int i = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
        byte0 = i;
        if (i == 0)
        {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            byte0 = 0x7fffffff;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private xa(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Given Integer is zero");
        } else
        {
            b = i;
            g = false;
            return;
        }
    }

    private void d()
    {
        if (h)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        return a;
    }

    public final void a(d d1)
    {
        d1 = (xa)d1;
        if (!TextUtils.isEmpty(a))
        {
            String s = a;
            d1.d();
            d1.a = s;
        }
        if (b != 0)
        {
            int i = b;
            d1.d();
            d1.b = i;
        }
        if (c != 0)
        {
            int j = c;
            d1.d();
            d1.c = j;
        }
        if (!TextUtils.isEmpty(d))
        {
            String s1 = d;
            d1.d();
            d1.d = s1;
        }
        if (!TextUtils.isEmpty(e))
        {
            String s2 = e;
            d1.d();
            boolean flag;
            if (TextUtils.isEmpty(s2))
            {
                d1.e = null;
            } else
            {
                d1.e = s2;
            }
        }
        if (f)
        {
            flag = f;
            d1.d();
            d1.f = flag;
        }
        if (g)
        {
            flag = g;
            d1.d();
            d1.g = flag;
        }
    }

    public final int b()
    {
        return b;
    }

    public final String c()
    {
        return e;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", a);
        hashmap.put("interstitial", Boolean.valueOf(f));
        hashmap.put("automatic", Boolean.valueOf(g));
        hashmap.put("screenId", Integer.valueOf(b));
        hashmap.put("referrerScreenId", Integer.valueOf(c));
        hashmap.put("referrerScreenName", d);
        hashmap.put("referrerUri", e);
        return a(hashmap);
    }
}
