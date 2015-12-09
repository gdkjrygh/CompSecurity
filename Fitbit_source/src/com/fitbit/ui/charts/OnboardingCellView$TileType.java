// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;

// Referenced classes of package com.fitbit.ui.charts:
//            OnboardingCellView

public static class <init> extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];
    private final int id;
    private final int image;
    final int text;
    private final int url;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/fitbit/ui/charts/OnboardingCellView$TileType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])i.clone();
    }

    public CharSequence a(Context context, e_3B_.clone clone)
    {
        clone = (new StringBuilder()).append(context.getString(text));
        if (a())
        {
            context = context.getString(0x7f08038f);
        } else
        {
            context = "";
        }
        return clone.append(context).toString();
    }

    public String a(Context context)
    {
        return context.getString(url);
    }

    public boolean a()
    {
        return url != 0;
    }

    public int b()
    {
        return image;
    }

    public int c()
    {
        return id;
    }

    static 
    {
        a = new <init>("STEPS", 0, 0x7f0203ad, 0x7f0804f3, 0x7f0804f2, 0);
        b = new <init>("CALORIES", 1, 0x7f0203a8, 0x7f0800b5, 0x7f0800b4, 1);
        c = new <init>("EXERCISE", 2, 0x7f0203a9, 0x7f08019e, 0, 2);
        d = new <init>("FOOD_LOGGING", 3, 0x7f0203aa, 0x7f080213, 0, 3);
        e = new <init>("HEART_RATE", 4, 0x7f0203ab, 0x7f08024b, 0x7f08024a, 4);
        f = new <init>("BIKE", 5, 0x7f0203a7, 0x7f08008c, 0x7f0805e9, 5);
        g = new <init>("SLEEP", 6, 0x7f0203ac, 0x7f0804d0, 0x7f08062c, 6);
    /* block-local class not found */
    class _cls1 {}

        h = new _cls1("SLEEP_NEWS", 7, 0x7f0202f0, 0x7f0804cf, 0, 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private _cls1(String s, int j, int k, int l, int i1, int j1)
    {
        super(s, j);
        image = k;
        text = l;
        url = i1;
        id = j1;
    }

    id(String s, int j, int k, int l, int i1, int j1, id id1)
    {
        this(s, j, k, l, i1, j1);
    }
}
