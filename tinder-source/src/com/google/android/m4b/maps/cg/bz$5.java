// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.df.h;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bz, aq

final class b
    implements Runnable
{

    private Bitmap a;
    private h b;
    private bz c;

    public final void run()
    {
        bz.c(c).b(a, b);
    }

    (bz bz1, Bitmap bitmap, h h)
    {
        c = bz1;
        a = bitmap;
        b = h;
        super();
    }
}
