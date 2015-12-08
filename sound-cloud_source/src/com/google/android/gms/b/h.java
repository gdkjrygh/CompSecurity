// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class h extends ah
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;
    public double h;

    public h()
    {
    }

    public final void a(ah ah1)
    {
        boolean flag = true;
        ah1 = (h)ah1;
        if (!TextUtils.isEmpty(a))
        {
            ah1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            ah1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            ah1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            ah1.d = d;
        }
        if (e)
        {
            ah1.e = true;
        }
        if (!TextUtils.isEmpty(f))
        {
            ah1.f = f;
        }
        if (g)
        {
            ah1.g = g;
        }
        if (h != 0.0D)
        {
            double d1 = h;
            if (d1 < 0.0D || d1 > 100D)
            {
                flag = false;
            }
            zzx.zzb(flag, "Sample rate must be between 0% and 100%");
            ah1.h = d1;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", a);
        hashmap.put("clientId", b);
        hashmap.put("userId", c);
        hashmap.put("androidAdId", d);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(e));
        hashmap.put("sessionControl", f);
        hashmap.put("nonInteraction", Boolean.valueOf(g));
        hashmap.put("sampleRate", Double.valueOf(h));
        return a(hashmap);
    }
}
