// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.graphics.Bitmap;
import android.support.v4.g.e;
import com.google.android.m4b.maps.a.m;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            p

final class  extends e
{

    protected final int sizeOf(Object obj, Object obj1)
    {
        obj = (m)obj1;
        if (((m) (obj)).a instanceof Bitmap)
        {
            obj = (Bitmap)((m) (obj)).a;
            int i = ((Bitmap) (obj)).getRowBytes();
            return ((Bitmap) (obj)).getHeight() * i;
        }
        if (((m) (obj)).a instanceof String)
        {
            return ((String)((m) (obj)).a).getBytes().length;
        }
        if (((m) (obj)).a instanceof byte[])
        {
            return ((byte[])((m) (obj)).a).length;
        } else
        {
            obj = String.valueOf(((m) (obj)).a);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 52)).append("LruCache does not have a sizeOf implementation for: ").append(((String) (obj))).toString());
        }
    }

    (int i)
    {
        super(i);
    }
}
