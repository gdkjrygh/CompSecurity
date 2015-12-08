// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.roidapp.baselib.c.n;

// Referenced classes of package com.roidapp.baselib.b:
//            i

final class j extends LruCache
{

    final i a;

    j(i i, int k)
    {
        a = i;
        super(k);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        if (n.h())
        {
            return ((Bitmap) (obj)).getAllocationByteCount();
        }
        if (n.e())
        {
            return ((Bitmap) (obj)).getByteCount();
        } else
        {
            return ((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight();
        }
    }
}
