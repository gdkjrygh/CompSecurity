// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;

public final class a
{

    public static Bitmap a()
    {
        Bitmap bitmap = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(0xffdcdcdc);
        return bitmap;
    }

    public static ColorDrawable b()
    {
        return new ColorDrawable(0xffdcdcdc);
    }
}
