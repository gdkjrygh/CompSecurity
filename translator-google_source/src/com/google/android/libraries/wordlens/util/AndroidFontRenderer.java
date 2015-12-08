// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.libraries.wordlens.util:
//            a, b, c, d

public class AndroidFontRenderer
{

    private static final boolean DEBUG = false;
    private static Typeface sCurrentTypeface;
    private static final ConcurrentHashMap sTextBoundsRectCache = new ConcurrentHashMap();
    private static final ConcurrentHashMap sTextHMetricsCache = new ConcurrentHashMap();
    private static ThreadLocal tFontMetrics = new c();
    private static ThreadLocal tFontTextPaint = new a();
    private static ThreadLocal tFontTypeface = new b();
    private static ThreadLocal tTextBounds = new d();

    public AndroidFontRenderer()
    {
    }

    private static void checkForUpdatedTypeface()
    {
        if (tFontTypeface.get() != sCurrentTypeface)
        {
            tFontTypeface.set(sCurrentTypeface);
            ((Paint)tFontTextPaint.get()).setTypeface(sCurrentTypeface);
        }
    }

    public static void initFontRendering()
    {
    }

    public static byte[] nfontDrawGlyph(char c1, int i, int j, float f, float f1, float f2, float f3)
    {
        return nfontDrawString(Character.toString(c1), i, j, f, f1, f2, f3, android.graphics.Bitmap.Config.ALPHA_8);
    }

    private static byte[] nfontDrawString(String s, int i, int j, float f, float f1, float f2, float f3, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap = Bitmap.createBitmap(i, j, config);
        Canvas canvas = new Canvas(bitmap);
        if (android.graphics.Bitmap.Config.ARGB_8888 == config)
        {
            bitmap.eraseColor(-1);
        }
        canvas.translate(f, f1);
        canvas.scale(f2, f3);
        canvas.drawText(s, 0.0F, 0.0F, (Paint)tFontTextPaint.get());
        s = new byte[bitmap.getRowBytes() * bitmap.getHeight()];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(s));
        return s;
    }

    public static byte[] nfontDrawString(byte abyte0[], int i, int j, float f, float f1, float f2, float f3)
    {
        try
        {
            abyte0 = nfontDrawString(new String(abyte0, "UTF-8"), i, j, f, f1, f2, f3, android.graphics.Bitmap.Config.ALPHA_8);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static float nfontGetFontHMetrics(char c1)
    {
        checkForUpdatedTypeface();
        Float float1 = (Float)sTextHMetricsCache.get(Character.valueOf(c1));
        Object obj = float1;
        if (float1 == null)
        {
            obj = Character.toString(c1);
            obj = Float.valueOf(((Paint)tFontTextPaint.get()).measureText(((String) (obj))));
            sTextHMetricsCache.put(Character.valueOf(c1), obj);
        }
        return ((Float) (obj)).floatValue();
    }

    public static float[] nfontGetFontVMetrics()
    {
        checkForUpdatedTypeface();
        android.graphics.Paint.FontMetrics fontmetrics = (android.graphics.Paint.FontMetrics)tFontMetrics.get();
        return (new float[] {
            fontmetrics.ascent, fontmetrics.descent, fontmetrics.leading
        });
    }

    public static int[] nfontGetTextBounds(char c1)
    {
        return nfontGetTextBounds(Character.toString(c1));
    }

    private static int[] nfontGetTextBounds(String s)
    {
        checkForUpdatedTypeface();
        int ai[] = (Rect)sTextBoundsRectCache.get(s);
        if (ai == null)
        {
            ai = new Rect();
            ((Paint)tFontTextPaint.get()).getTextBounds(s, 0, s.length(), ai);
            sTextBoundsRectCache.put(s, ai);
            s = ai;
        } else
        {
            s = ai;
        }
        ai = (int[])tTextBounds.get();
        ai[0] = ((Rect) (s)).left;
        ai[1] = ((Rect) (s)).top;
        ai[2] = ((Rect) (s)).right;
        ai[3] = ((Rect) (s)).bottom;
        return ai;
    }

    public static int[] nfontGetTextBounds(byte abyte0[])
    {
        try
        {
            abyte0 = nfontGetTextBounds(new String(abyte0, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static void setCurrentTypeface(Typeface typeface)
    {
        if (typeface == null)
        {
            sCurrentTypeface = Typeface.DEFAULT_BOLD;
            return;
        } else
        {
            sCurrentTypeface = typeface;
            return;
        }
    }

    public static void shutdownFontRendering()
    {
    }

    static 
    {
        sCurrentTypeface = Typeface.DEFAULT_BOLD;
    }



}
