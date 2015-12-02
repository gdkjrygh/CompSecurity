// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.reflex:
//            d, u

public abstract class Image extends d
{

    public Image()
    {
        a(initialize());
    }

    private native int initialize();

    private native void nativeSetBitmap(Bitmap bitmap, int i, int j, int k);

    protected void a()
    {
        a(null);
    }

    protected void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            a(bitmap, bitmap.getWidth(), bitmap.getHeight(), u.Unknown);
            return;
        }
    }

    protected void a(Bitmap bitmap, int i, int j)
    {
        a(bitmap, i, j, u.Unknown);
    }

    protected void a(Bitmap bitmap, int i, int j, u u1)
    {
        if (!e() && bitmap != null)
        {
            return;
        } else
        {
            nativeSetBitmap(bitmap, i, j, u1.ordinal());
            return;
        }
    }
}
