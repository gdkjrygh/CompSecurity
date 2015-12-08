// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import java.io.IOException;

public final class ohp
    implements oih
{

    private static final boolean e;
    public BitmapRegionDecoder a;
    public int b;
    public int c;
    public final int d;
    private int f;
    private mzm g;
    private Rect h;
    private Rect i;
    private android.graphics.BitmapFactory.Options j;
    private Canvas k;

    public ohp(Context context, String s, int l, int i1)
    {
        h = new Rect();
        i = new Rect();
        f = oid.a(context);
        d = i1;
        float f1;
        try
        {
            a = BitmapRegionDecoder.newInstance(s, true);
            b = a.getWidth();
            c = a.getHeight();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Log.isLoggable("BitmapRegionTileSource", 5))
            {
                Log.w("BitmapRegionTileSource", "ctor failed", context);
            }
            continue; /* Loop/switch isn't completed */
        }
_L10:
        j = new android.graphics.BitmapFactory.Options();
        j.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        j.inPreferQualityOverSpeed = true;
        j.inTempStorage = new byte[16384];
        if (l == 0) goto _L2; else goto _L1
_L1:
        i1 = Math.min(l, 1024);
        f1 = (float)i1 / (float)Math.max(b, c);
        context = j;
        l = (int)Math.floor(1.0F / f1);
        if (l <= 1)
        {
            l = 1;
        } else
        if (l <= 8)
        {
            l = mzl.b(l);
        } else
        {
            l = l / 8 << 3;
        }
        context.inSampleSize = l;
        j.inJustDecodeBounds = false;
        s = BitmapFactory.decodeFile(s, j);
        if (s == null)
        {
            context = null;
        } else
        {
            float f2 = (float)i1 / (float)Math.max(s.getWidth(), s.getHeight());
            context = s;
            if ((double)f2 <= 0.5D)
            {
                l = Math.round((float)s.getWidth() * f2);
                i1 = Math.round((float)s.getHeight() * f2);
                if (l == s.getWidth() && i1 == s.getHeight())
                {
                    context = s;
                } else
                {
                    Object obj = s.getConfig();
                    context = ((Context) (obj));
                    if (obj == null)
                    {
                        context = android.graphics.Bitmap.Config.ARGB_8888;
                    }
                    context = Bitmap.createBitmap(l, i1, context);
                    obj = new Canvas(context);
                    ((Canvas) (obj)).scale(f2, f2);
                    ((Canvas) (obj)).drawBitmap(s, 0.0F, 0.0F, new Paint(6));
                    s.recycle();
                }
            }
            if (context != null && context.getConfig() == null)
            {
                s = context.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
                context.recycle();
                context = s;
            }
        }
        if (context == null) goto _L4; else goto _L3
_L3:
        if (context.getWidth() > 2048 || context.getHeight() > 2048) goto _L6; else goto _L5
_L5:
        g = new mzn(context);
_L2:
        return;
_L6:
        if (!Log.isLoggable("BitmapRegionTileSource", 5)) goto _L2; else goto _L7
_L7:
        Log.w("BitmapRegionTileSource", String.format("Failed to create preview of appropriate size!  in: %dx%d, out: %dx%d", new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(context.getWidth()), Integer.valueOf(context.getHeight())
        }));
        return;
_L4:
        if (!Log.isLoggable("BitmapRegionTileSource", 5)) goto _L2; else goto _L8
_L8:
        Log.w("BitmapRegionTileSource", "Failed to decode preview.");
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int a()
    {
        return f;
    }

    public final Bitmap a(int l, int i1, int j1, Bitmap bitmap)
    {
        int k1 = f;
        if (e) goto _L2; else goto _L1
_L1:
        int l1 = k1 << l;
        h.set(i1, j1, i1 + l1, l1 + j1);
        i.set(0, 0, b, c);
        j.inSampleSize = 1 << l;
        bitmap = a.decodeRegion(i, j);
        if (bitmap == null && Log.isLoggable("BitmapRegionTileSource", 5))
        {
            Log.w("BitmapRegionTileSource", "fail in decoding region");
        }
        if (!h.equals(i)) goto _L4; else goto _L3
_L3:
        return bitmap;
_L4:
        Bitmap bitmap1 = Bitmap.createBitmap(k1, k1, android.graphics.Bitmap.Config.ARGB_8888);
        if (k == null)
        {
            k = new Canvas();
        }
        k.setBitmap(bitmap1);
        k.drawBitmap(bitmap, i.left - h.left >> l, i.top - h.top >> l, null);
        k.setBitmap(null);
        return bitmap1;
_L2:
        Bitmap bitmap2;
        int i2 = k1 << l;
        h.set(i1, j1, i1 + i2, i2 + j1);
        bitmap2 = bitmap;
        if (bitmap == null)
        {
            bitmap2 = Bitmap.createBitmap(k1, k1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        j.inSampleSize = 1 << l;
        j.inBitmap = bitmap2;
        bitmap = a.decodeRegion(h, j);
        bitmap2 = bitmap;
        if (j.inBitmap != bitmap2 && j.inBitmap != null)
        {
            j.inBitmap = null;
        }
        bitmap = bitmap2;
        if (bitmap2 != null) goto _L3; else goto _L5
_L5:
        bitmap = bitmap2;
        if (!Log.isLoggable("BitmapRegionTileSource", 5)) goto _L3; else goto _L6
_L6:
        Log.w("BitmapRegionTileSource", "fail in decoding region");
        return bitmap2;
        bitmap;
        if (j.inBitmap != bitmap2 && j.inBitmap != null)
        {
            j.inBitmap = null;
        }
        throw bitmap;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final mzm d()
    {
        return g;
    }

    public final int e()
    {
        return d;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
