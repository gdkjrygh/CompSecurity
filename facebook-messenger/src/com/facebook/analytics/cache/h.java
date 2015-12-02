// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;

import com.facebook.analytics.ak;

// Referenced classes of package com.facebook.analytics.cache:
//            e, d

public class h
{

    private d a;
    private ak b;

    public h(d d, ak ak)
    {
        a = d;
        b = ak;
    }

    public e a(String s)
    {
        return new e(a, s, b, null);
    }
}
