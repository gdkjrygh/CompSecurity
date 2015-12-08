// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.os.SystemClock;
import com.google.android.m4b.maps.bi.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.e;
import com.google.android.m4b.maps.bi.f;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            p

static final class e extends a
{

    private final float b;
    private final float c;
    private final float d;
    private final int e;
    private final long f = SystemClock.uptimeMillis();
    private final e g;
    private f h;

    public final int a()
    {
        if (h == null)
        {
            return 0;
        } else
        {
            return h.a();
        }
    }

    public final d a(b b1)
    {
        c c1 = com.google.android.m4b.maps.bx.p.a(a, b1, g, b, c, d);
        int i = (int)(SystemClock.uptimeMillis() - f);
        h = new <init>(a, c1, e - i, true, 0.0F);
        return h.a(b1);
    }

    protected (c c1, e e1, float f1, float f2, float f3, int i)
    {
        super(c1);
        g = e1;
        b = f1;
        c = f2;
        d = f3;
        e = i;
    }
}
