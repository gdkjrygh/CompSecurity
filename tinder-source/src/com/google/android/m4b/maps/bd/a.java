// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bd;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;

// Referenced classes of package com.google.android.m4b.maps.bd:
//            d

public final class a
    implements d
{

    private final d a;
    private final d b;

    public a(d d1, d d2)
    {
        a = d1;
        b = d2;
    }

    public final void a(ac ac, int i, aa aa)
    {
        if (a != null)
        {
            a.a(ac, i, aa);
        }
        if (b != null)
        {
            b.a(ac, i, aa);
        }
    }
}
