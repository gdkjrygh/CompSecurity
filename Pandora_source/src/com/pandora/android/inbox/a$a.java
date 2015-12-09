// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import p.ab.d;
import p.t.c;

// Referenced classes of package com.pandora.android.inbox:
//            a

private class a extends d
{

    final a a;

    protected Bitmap a(c c, Bitmap bitmap, int i, int j)
    {
        i = Math.min(bitmap.getWidth(), bitmap.getHeight());
        c = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i) / 2, (bitmap.getHeight() - i) / 2, i, i);
        bitmap = new Paint();
        bitmap.setShader(new BitmapShader(c, android.graphics.er.TileMode.CLAMP, android.graphics.er.TileMode.CLAMP));
        bitmap.setAntiAlias(true);
        float f = (float)i / 2.0F;
        Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.ap.Config.ARGB_8888);
        (new Canvas(bitmap1)).drawCircle(f, f, f, bitmap);
        c.recycle();
        return bitmap1;
    }

    public String a()
    {
        return "circle";
    }

    public (a a1, Context context)
    {
        a = a1;
        super(context);
    }
}
