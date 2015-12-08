// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.roidapp.photogrid.release:
//            r

final class t extends LruCache
{

    final r a;

    t(r r1, int i)
    {
        a = r1;
        super(i);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        return r.a((Bitmap)obj1);
    }
}
