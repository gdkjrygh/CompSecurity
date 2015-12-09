// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.is;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private static final class _cls9 extends is
{

    protected int a(_cls9 _pcls9, Bitmap bitmap)
    {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    protected int a(Object obj, Object obj1)
    {
        return a((a)obj, (Bitmap)obj1);
    }

    protected void a(boolean flag, a a1, Bitmap bitmap, Bitmap bitmap1)
    {
        super.a(flag, a1, bitmap, bitmap1);
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (a)obj, (Bitmap)obj1, (Bitmap)obj2);
    }
}
