// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.ui.images.d.c;
import com.facebook.ui.images.d.d;
import com.facebook.ui.images.d.h;
import com.facebook.ui.images.d.i;
import com.facebook.ui.images.d.j;

// Referenced classes of package com.facebook.widget.tiles:
//            d, c, a

public class b
{

    private static final Class a = com/facebook/widget/tiles/b;
    private final Resources b;
    private final com.facebook.widget.tiles.c c;

    public b(Resources resources, com.facebook.widget.tiles.c c1)
    {
        b = resources;
        c = c1;
    }

    private Bitmap a(Bitmap bitmap, int k, int l)
    {
        com.facebook.debug.log.b.a(a, "Bitmap resize with canvas drawing");
        Bitmap bitmap1 = Bitmap.createBitmap(k, k, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawColor(l);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, k, k), null);
        return bitmap1;
    }

    private Bitmap a(Bitmap bitmap, int k, int l, int i1)
    {
        if (k != l)
        {
            return a(bitmap, a(k, l), i1);
        } else
        {
            return a(bitmap, k, i1);
        }
    }

    private Bitmap a(Bitmap bitmap, h h, int k)
    {
        com.facebook.debug.log.b.a(a, "Bitmap resize with GraphicSizer");
        h = new j(h, bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawColor(k);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        return h.a(bitmap1);
    }

    private Drawable a(a a1, int k, int l, int i1, int j1)
    {
        com.facebook.widget.tiles.d d1 = new com.facebook.widget.tiles.d(a1, j1, l, i1);
        Bitmap bitmap = c.a(d1);
        a1 = bitmap;
        if (bitmap == null)
        {
            a1 = a(((BitmapDrawable)b.getDrawable(k)).getBitmap(), l, i1, j1);
            c.a(d1, a1);
        }
        return new BitmapDrawable(b, a1);
    }

    private h a(int k, int l)
    {
        com.facebook.debug.log.b.a(a, "Sizing container for unequal resizing");
        return (new i()).a((new d()).a((float)k / (float)l).b(1.0F).c(1.0F).a(c.CENTER).e()).a(k / 2).b(l / 2).c(k).d(l).j();
    }

    public Drawable a(a a1, int k, int l)
    {
        return a(a1, a1.a(), k, l, a1.b());
    }

}
