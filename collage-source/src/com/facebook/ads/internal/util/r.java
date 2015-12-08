// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.facebook.ads.internal.util:
//            n, j

public class r
{

    static final int a;
    static final ExecutorService b;
    private static volatile boolean c = true;
    private final Bitmap d;
    private Bitmap e;
    private final j f = new n();

    public r(Bitmap bitmap)
    {
        d = bitmap;
    }

    public Bitmap a()
    {
        return e;
    }

    public Bitmap a(int i)
    {
        e = f.a(d, i);
        return e;
    }

    static 
    {
        a = Runtime.getRuntime().availableProcessors();
        b = Executors.newFixedThreadPool(a);
    }
}
