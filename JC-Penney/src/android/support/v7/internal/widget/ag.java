// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.b.a;
import android.util.TypedValue;

public class ag
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
        return android.support.v4.b.a.b(k, Math.round((float)Color.alpha(k) * f1));
    }

    public static ColorStateList a(int k, int l)
    {
        return new ColorStateList(new int[][] {
            a, h
        }, new int[] {
            l, k
        });
    }

    private static TypedValue a()
    {
        TypedValue typedvalue1 = (TypedValue)i.get();
        TypedValue typedvalue = typedvalue1;
        if (typedvalue1 == null)
        {
            typedvalue = new TypedValue();
            i.set(typedvalue);
        }
        return typedvalue;
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
        ColorStateList colorstatelist = b(context, k);
        if (colorstatelist != null && colorstatelist.isStateful())
        {
            return colorstatelist.getColorForState(a, colorstatelist.getDefaultColor());
        } else
        {
            TypedValue typedvalue = a();
            context.getTheme().resolveAttribute(0x1010033, typedvalue, true);
            return a(context, k, typedvalue.getFloat());
        }
    }

}
