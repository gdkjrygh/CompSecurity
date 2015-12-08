// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class dh extends Drawable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        private static final a i[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/dh$a, s);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("TopLeft", 0);
            b = new a("TopMiddle", 1);
            c = new a("TopRight", 2);
            d = new a("MiddleLeft", 3);
            e = new a("MiddleRight", 4);
            f = new a("BottomLeft", 5);
            g = new a("BottomMiddle", 6);
            h = new a("BottomRight", 7);
            i = (new a[] {
                a, b, c, d, e, f, g, h
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    Bitmap a[];
    int b;

    public dh(Bitmap abitmap[], int i)
    {
        a = abitmap;
        b = i;
    }

    private void a(Canvas canvas, Rect rect)
    {
        Bitmap abitmap[] = new Bitmap[3];
        abitmap[0] = a[a.a.ordinal()];
        abitmap[1] = a[a.b.ordinal()];
        abitmap[2] = a[a.c.ordinal()];
        a(canvas, new Rect(rect.left, rect.top, rect.right, rect.top + abitmap[0].getHeight()), abitmap);
    }

    public static void a(Canvas canvas, Rect rect, Bitmap abitmap[])
    {
        Rect rect1 = new Rect(rect.left, rect.top, rect.left + abitmap[0].getWidth(), rect.top + abitmap[0].getHeight());
        canvas.drawBitmap(abitmap[0], null, rect1, null);
        rect1 = new Rect();
        rect1.left = rect.left + abitmap[0].getWidth();
        rect1.right = rect.right - abitmap[2].getWidth() - 1;
        rect1.top = rect.top;
        rect1.bottom = rect.top + abitmap[1].getHeight();
        canvas.drawBitmap(abitmap[1], null, rect1, null);
        rect = new Rect(rect1.right, rect.top, rect1.right + abitmap[2].getWidth(), rect.top + abitmap[2].getHeight());
        canvas.drawBitmap(abitmap[2], null, rect, null);
    }

    private void b(Canvas canvas, Rect rect)
    {
        int i = rect.top + a[a.a.ordinal()].getHeight();
        int j = rect.bottom - a[a.f.ordinal()].getHeight() - 1;
        int k = rect.left + a[a.d.ordinal()].getWidth();
        int l = rect.right;
        int i1 = a[a.e.ordinal()].getWidth();
        Rect rect1 = new Rect();
        rect1.left = rect.left;
        rect1.right = k;
        rect1.top = i;
        rect1.bottom = j;
        canvas.drawBitmap(a[a.d.ordinal()], null, rect1, null);
        rect1.left = rect.right - 1 - a[a.e.ordinal()].getWidth();
        rect1.right = rect.right - 1;
        rect1.top = i;
        rect1.bottom = j;
        canvas.drawBitmap(a[a.e.ordinal()], null, rect1, null);
        rect = new Paint();
        rect.setStyle(android.graphics.Paint.Style.FILL);
        rect.setColor(b);
        canvas.drawRect(k, i, l - i1 - 1, j, rect);
    }

    private void c(Canvas canvas, Rect rect)
    {
        Bitmap abitmap[] = new Bitmap[3];
        abitmap[0] = a[a.f.ordinal()];
        abitmap[1] = a[a.g.ordinal()];
        abitmap[2] = a[a.h.ordinal()];
        a(canvas, new Rect(rect.left, rect.bottom - abitmap[0].getHeight() - 1, rect.right, rect.bottom - 1), abitmap);
    }

    public void draw(Canvas canvas)
    {
        Rect rect = copyBounds();
        a(canvas, rect);
        b(canvas, rect);
        c(canvas, rect);
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
