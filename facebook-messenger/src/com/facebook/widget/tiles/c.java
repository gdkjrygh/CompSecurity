// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import android.graphics.Bitmap;
import com.google.common.a.hy;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.widget.tiles:
//            d

public class c
{

    private final ConcurrentMap a = (new hy()).a(128).c(4).i().n();

    public c()
    {
    }

    public Bitmap a(d d)
    {
        return (Bitmap)a.get(d);
    }

    public void a(d d, Bitmap bitmap)
    {
        a.put(d, bitmap);
    }
}
