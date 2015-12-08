// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class at extends ah
{

    public String a;
    public int b;
    public String c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;

    public at()
    {
        this((byte)0);
    }

    private at(byte byte0)
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
            byte0 = 0x7fffffff;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private at(int i)
    {
        zzx.zzbD(i);
        b = i;
        g = false;
    }

    private void a()
    {
        if (h)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public final void a(ah ah1)
    {
        ah1 = (at)ah1;
        if (!TextUtils.isEmpty(a))
        {
            String s = a;
            ah1.a();
            ah1.a = s;
        }
        if (b != 0)
        {
            int i = b;
            ah1.a();
            ah1.b = i;
        }
        if (d != 0)
        {
            int j = d;
            ah1.a();
            ah1.d = j;
        }
        if (!TextUtils.isEmpty(e))
        {
            String s1 = e;
            ah1.a();
            ah1.e = s1;
        }
        if (!TextUtils.isEmpty(c))
        {
            String s2 = c;
            ah1.a();
            boolean flag;
            if (TextUtils.isEmpty(s2))
            {
                ah1.c = null;
            } else
            {
                ah1.c = s2;
            }
        }
        if (f)
        {
            flag = f;
            ah1.a();
            ah1.f = flag;
        }
        if (g)
        {
            flag = g;
            ah1.a();
            ah1.g = flag;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", a);
        hashmap.put("interstitial", Boolean.valueOf(f));
        hashmap.put("automatic", Boolean.valueOf(g));
        hashmap.put("screenId", Integer.valueOf(b));
        hashmap.put("referrerScreenId", Integer.valueOf(d));
        hashmap.put("referrerScreenName", e);
        hashmap.put("referrerUri", c);
        return a(hashmap);
    }
}
