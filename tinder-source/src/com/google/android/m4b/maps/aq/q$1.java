// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.df.h;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            q

final class b
    implements Runnable
{

    private h a;
    private Bitmap b;
    private q c;

    public final void run()
    {
        c.a(a, b);
    }

    (q q1, h h, Bitmap bitmap)
    {
        c = q1;
        a = h;
        b = bitmap;
        super();
    }
}
