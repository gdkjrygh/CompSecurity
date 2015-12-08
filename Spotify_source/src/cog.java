// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class cog extends cpd
{

    public String a;
    public int b;
    public String c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;

    public cog()
    {
        this((byte)0);
    }

    private cog(byte byte0)
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

    private cog(int i)
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

    public final void a(cpd cpd1)
    {
        cpd1 = (cog)cpd1;
        if (!TextUtils.isEmpty(a))
        {
            cpd1.a = a;
        }
        if (b != 0)
        {
            cpd1.b = b;
        }
        if (d != 0)
        {
            cpd1.d = d;
        }
        if (!TextUtils.isEmpty(e))
        {
            cpd1.e = e;
        }
        if (!TextUtils.isEmpty(c))
        {
            String s = c;
            if (TextUtils.isEmpty(s))
            {
                cpd1.c = null;
            } else
            {
                cpd1.c = s;
            }
        }
        if (f)
        {
            cpd1.f = f;
        }
        if (g)
        {
            cpd1.g = g;
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
