// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            j, k, u

public class t extends j
{

    private final u b;
    private com.facebook.ads.NativeAdView.Type c;
    private boolean d;

    public t(Context context, k k1, u u1)
    {
        super(context, k1);
        b = u1;
    }

    public void a(com.facebook.ads.NativeAdView.Type type)
    {
        c = type;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    protected void b()
    {
        if (b == null)
        {
            return;
        }
        HashMap hashmap = new HashMap();
        if (a != null)
        {
            hashmap.put("mil", Boolean.valueOf(a.a()));
        }
        if (c != null)
        {
            hashmap.put("nti", String.valueOf(c.getValue()));
        }
        if (d)
        {
            hashmap.put("nhs", String.valueOf(d));
        }
        b.a(hashmap);
    }
}
