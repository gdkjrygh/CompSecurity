// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.aviary.android.feather.library.c.b;
import it.sephiroth.android.library.picasso.q;
import java.util.concurrent.Callable;

public class a
    implements q, Callable
{

    static com.aviary.android.feather.common.a.c a;
    final String b;
    final String c;
    final String d;
    int e;
    int f;
    int g;
    int h;

    public a(String s, String s1, String s2)
    {
        g = -1;
        h = -1;
        c = s1;
        d = s2;
        b = s;
    }

    private Bitmap c()
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        options.inInputShareable = true;
        options.inPurgeable = true;
        options.inTargetDensity = e;
        options.inDensity = f;
        Bitmap bitmap = BitmapFactory.decodeFile(b, options);
        a.b("input.density: %d, target.density: %d", new Object[] {
            Integer.valueOf(f), Integer.valueOf(e)
        });
        a.b("options.size: %dx%d", new Object[] {
            Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight)
        });
        return bitmap;
    }

    public Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap != null)
        {
            bitmap1 = bitmap;
            if (g > 0)
            {
                bitmap1 = bitmap;
                if (h > 0)
                {
                    a.b("need to resize to: %dx%d", new Object[] {
                        Integer.valueOf(g), Integer.valueOf(h)
                    });
                    Bitmap bitmap2 = com.aviary.android.feather.library.c.b.a(bitmap, g, h);
                    bitmap1 = bitmap;
                    if (!bitmap2.equals(bitmap))
                    {
                        bitmap.recycle();
                        bitmap1 = bitmap2;
                    }
                }
            }
        }
        Object obj = bitmap1;
        if ("effect".equals(d))
        {
            bitmap = bitmap1;
            if (!bitmap1.isMutable())
            {
                obj = bitmap1.copy(bitmap1.getConfig(), true);
                bitmap = bitmap1;
                if (obj != bitmap1)
                {
                    bitmap1.recycle();
                    bitmap = ((Bitmap) (obj));
                }
            }
            obj = bitmap;
            if (bitmap != null)
            {
                obj = bitmap;
                if (bitmap.isMutable())
                {
                    Canvas canvas = new Canvas(bitmap);
                    obj = new Paint(129);
                    ((Paint) (obj)).setColor(-1);
                    ((Paint) (obj)).setTextSize(bitmap.getHeight() / 10);
                    Rect rect = new Rect();
                    ((Paint) (obj)).getTextBounds(c, 0, c.length(), rect);
                    canvas.drawText(c, (bitmap.getWidth() - rect.width()) / 2, (float)bitmap.getHeight() - ((Paint) (obj)).descent() - 2.0F, ((Paint) (obj)));
                    obj = bitmap;
                }
            }
        }
        a.b("final bitmap.size: %dx%d", new Object[] {
            Integer.valueOf(((Bitmap) (obj)).getWidth()), Integer.valueOf(((Bitmap) (obj)).getHeight())
        });
        return ((Bitmap) (obj));
    }

    public String a()
    {
        return b;
    }

    public Bitmap b()
        throws Exception
    {
        return a(c());
    }

    public Object call()
        throws Exception
    {
        return b();
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/sdk/a/a.getSimpleName(), com.aviary.android.feather.common.a.d.a);
    }
}
