// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.roidapp.baselib.b:
//            j

public final class i
{

    private final LruCache a;

    public i(int k)
    {
        a = new j(this, k);
    }

    public final Bitmap a(String s)
    {
        if (s != null)
        {
            return (Bitmap)a.get(s);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        a.evictAll();
    }

    public final void a(String s, Bitmap bitmap)
    {
        if (s != null && bitmap != null)
        {
            a.put(s, bitmap);
        }
    }
}
