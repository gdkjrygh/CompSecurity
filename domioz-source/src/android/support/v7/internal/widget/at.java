// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;

public final class at
{

    static final int a[] = {
        0xfefeff62
    };
    static final int b[] = {
        0x101009c
    };
    static final int c[] = {
        0x10102fe
    };
    static final int d[] = {
        0x10100a7
    };
    static final int e[] = {
        0x10100a0
    };
    static final int f[] = {
        0x10100a1
    };
    static final int g[] = {
        0xfefeff59, 0xfefeff64
    };
    static final int h[] = new int[0];
    private static final ThreadLocal i = new ThreadLocal();
    private static final int j[] = new int[1];

    public static int a(Context context, int k)
    {
        j[0] = k;
        context = context.obtainStyledAttributes(null, j);
        k = context.getColor(0, 0);
        context.recycle();
        return k;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    static int a(Context context, int k, float f1)
    {
        k = a(context, k);
        int l = Math.round((float)Color.alpha(k) * f1);
        if (l < 0 || l > 255)
        {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        } else
        {
            return k & 0xffffff | l << 24;
        }
    }

    public static ColorStateList a(int k, int l)
    {
        return new ColorStateList(new int[][] {
            a, h
        }, new int[] {
            l, k
        });
    }

    public static ColorStateList b(Context context, int k)
    {
        j[0] = k;
        context = context.obtainStyledAttributes(null, j);
        ColorStateList colorstatelist = context.getColorStateList(0);
        context.recycle();
        return colorstatelist;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    public static int c(Context context, int k)
    {
        Object obj = b(context, k);
        if (obj != null && ((ColorStateList) (obj)).isStateful())
        {
            return ((ColorStateList) (obj)).getColorForState(a, ((ColorStateList) (obj)).getDefaultColor());
        }
        TypedValue typedvalue = (TypedValue)i.get();
        obj = typedvalue;
        if (typedvalue == null)
        {
            obj = new TypedValue();
            i.set(obj);
        }
        context.getTheme().resolveAttribute(0x1010033, ((TypedValue) (obj)), true);
        return a(context, k, ((TypedValue) (obj)).getFloat());
    }

}
