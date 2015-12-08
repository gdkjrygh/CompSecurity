// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Handler;
import com.google.android.m4b.maps.g.a;

// Referenced classes of package com.google.android.m4b.maps.h:
//            r, d

final class b
    implements b
{

    public final int a;
    public final d b;
    public final a c = null;
    private r d;

    public final void a(a a1)
    {
        r.e(d).post(new <init>(d, a, a1));
    }

    public (r r1, int i, d d1)
    {
        d = r1;
        super();
        a = i;
        b = d1;
        d1.a(this);
    }
}
