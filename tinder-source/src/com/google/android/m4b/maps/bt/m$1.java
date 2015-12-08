// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.m4b.maps.df.h;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            m

final class c
    implements Runnable
{

    private Bitmap a;
    private boolean b;
    private h c;
    private m d;

    public final void run()
    {
        Canvas canvas = new Canvas(a);
        d.a.draw(canvas);
        d.a(a, b);
        d.a(c, a);
    }

    (m m1, Bitmap bitmap, h h)
    {
        d = m1;
        a = bitmap;
        b = false;
        c = h;
        super();
    }
}
