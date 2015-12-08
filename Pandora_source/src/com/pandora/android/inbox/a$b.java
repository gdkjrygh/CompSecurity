// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
        j = com.pandora.android.inbox.a.a(a).getResources().getDimensionPixelSize(0x7f0900f5);
        c = Bitmap.createBitmap(j, j, android.graphics.ap.Config.ARGB_8888);
        Canvas canvas = new Canvas(c);
        Paint paint = new Paint(2);
        bitmap = Bitmap.createScaledBitmap(bitmap, j, j, false);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        Bitmap bitmap1 = BitmapFactory.decodeResource(com.pandora.android.inbox.a.a(a).getResources(), 0x7f02012f);
        i = (j - bitmap1.getWidth()) / 2;
        j = (j - bitmap1.getHeight()) / 2;
        canvas.drawBitmap(bitmap1, i, j, paint);
        bitmap.recycle();
        return c;
    }

    public String a()
    {
        return "overlay";
    }

    public (a a1, Context context)
    {
        a = a1;
        super(context);
    }
}
