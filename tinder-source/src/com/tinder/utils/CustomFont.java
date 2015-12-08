// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class CustomFont
{
    public static final class Font extends Enum
    {

        public static final Font a;
        public static final Font b;
        public static final Font c;
        public static final Font d;
        public static final Font e;
        private static final Font g[];
        String f;

        public static Font valueOf(String s)
        {
            return (Font)Enum.valueOf(com/tinder/utils/CustomFont$Font, s);
        }

        public static Font[] values()
        {
            return (Font[])g.clone();
        }

        public final String toString()
        {
            return f;
        }

        static 
        {
            a = new Font("LIGHT", 0, "proximanovasoft-regular.otf");
            b = new Font("REGULAR", 1, "proximanovasoft-regular.otf");
            c = new Font("MEDIUM", 2, "proximanovasoft-medium.otf");
            d = new Font("SEMI_BOLD", 3, "proximanovasoft-semibold.otf");
            e = new Font("BOLD", 4, "proximanovasoft-bold.otf");
            g = (new Font[] {
                a, b, c, d, e
            });
        }

        private Font(String s, int i, String s1)
        {
            super(s, i);
            f = s1;
        }
    }


    public static String a(Context context, AttributeSet attributeset)
    {
        Font font = Font.b;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.tinder.a.a.com_tinder_views_CustomTextView);
        int i = typedarray.getInt(1, -1);
        if (i == -1)
        {
            attributeset = typedarray.getString(0);
            context = attributeset;
            if (attributeset == null)
            {
                context = font.f;
            }
        } else
        {
            context = Font.values()[i].f;
        }
        typedarray.recycle();
        return context;
    }
}
