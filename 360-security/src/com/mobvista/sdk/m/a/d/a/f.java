// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.graphics.Bitmap;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            l, d

final class f extends l
{

    final d a;

    f(d d, int i)
    {
        a = d;
        super(i);
    }

    private static int a(Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    protected final volatile int a(Object obj, Object obj1)
    {
        return a((Bitmap)obj1);
    }
}
