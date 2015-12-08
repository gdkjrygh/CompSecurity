// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.graphics.Bitmap;
import android.os.Handler;
import com.android.slyce.b.b;
import com.android.slyce.e.a;
import com.android.slyce.k.h;

// Referenced classes of package com.android.slyce:
//            k, s, l

class r
    implements b
{

    final k a;

    private r(k k1)
    {
        a = k1;
        super();
    }

    r(k k1, l l)
    {
        this(k1);
    }

    public void a(Bitmap bitmap)
    {
        h.a(com.android.slyce.k.a(a), "onBarcodeSnap");
        com.android.slyce.k.a(a, bitmap);
    }

    public void a(String s1, String s2)
    {
        h.a(com.android.slyce.k.a(a), "onBarcodeResult");
        if (!com.android.slyce.k.b(a) && k.c(a))
        {
            (new Handler()).postDelayed(new s(this), 2000L);
        }
        com.android.slyce.k.a(a, s1, s2, com.android.slyce.k.b.b);
    }

    public void a(boolean flag)
    {
        k.e(a).a(flag);
    }
}
