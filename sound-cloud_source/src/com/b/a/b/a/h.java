// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.a;

import android.widget.ImageView;

public final class h extends Enum
{

    public static final int a;
    public static final int b;
    private static final int c[];

    public static int a(ImageView imageview)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[imageview.getScaleType().ordinal()])
        {
        default:
            return b;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return a;
        }
    }

    public static int[] a()
    {
        return (int[])c.clone();
    }

    static 
    {
        a = 1;
        b = 2;
        c = (new int[] {
            a, b
        });
    }
}
