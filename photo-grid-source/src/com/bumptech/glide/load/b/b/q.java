// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.util.DisplayMetrics;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            r

final class q
    implements r
{

    private final DisplayMetrics a;

    public q(DisplayMetrics displaymetrics)
    {
        a = displaymetrics;
    }

    public final int a()
    {
        return a.widthPixels;
    }

    public final int b()
    {
        return a.heightPixels;
    }
}
