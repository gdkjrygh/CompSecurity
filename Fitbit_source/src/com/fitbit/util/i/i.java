// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.content.Context;
import android.content.res.TypedArray;

public class i
{

    public i()
    {
    }

    public static float a(Context context, int j, int k, float f)
    {
        context = a(context, j, new int[] {
            k
        });
        f = context.getDimension(0, f);
        context.recycle();
        return f;
    }

    public static float a(TypedArray typedarray, int j, float f)
    {
        return typedarray.getDimension(j, f);
    }

    public static int a(Context context, int j, int k)
    {
        context = context.getTheme();
        int l = k;
        if (context != null)
        {
            context = context.obtainStyledAttributes(new int[] {
                j
            });
            l = context.getResourceId(0, k);
            context.recycle();
        }
        return l;
    }

    public static int a(Context context, int j, int k, int l)
    {
        context = a(context, j, new int[] {
            k
        });
        j = context.getInt(0, l);
        context.recycle();
        return j;
    }

    public static int a(TypedArray typedarray, int j, int k)
    {
        return typedarray.getColor(j, k);
    }

    public static transient TypedArray a(Context context, int j, int ai[])
    {
        return context.obtainStyledAttributes(j, ai);
    }

    public static transient TypedArray a(Context context, int ai[])
    {
        Object obj = null;
        android.content.res.Resources.Theme theme = context.getTheme();
        context = obj;
        if (theme != null)
        {
            context = theme.obtainStyledAttributes(ai);
        }
        return context;
    }

    public static int b(Context context, int j, int k, int l)
    {
        context = a(context, j, new int[] {
            k
        });
        j = context.getColor(0, l);
        context.recycle();
        return j;
    }

    public static int b(TypedArray typedarray, int j, int k)
    {
        return typedarray.getResourceId(j, k);
    }

    public static int c(Context context, int j, int k, int l)
    {
        context = a(context, j, new int[] {
            k
        });
        j = b(context, 0, l);
        context.recycle();
        return j;
    }
}
