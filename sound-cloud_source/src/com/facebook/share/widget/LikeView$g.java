// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            LikeView

public static final class f extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    static a d;
    private static final a g[];
    private String e;
    private int f;

    static int a(f f1)
    {
        return f1.f;
    }

    static f a(int i)
    {
        f af[] = values();
        int k = af.length;
        for (int j = 0; j < k; j++)
        {
            f f1 = af[j];
            if (f1.f == i)
            {
                return f1;
            }
        }

        return null;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/share/widget/LikeView$g, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new <init>("STANDARD", 0, "standard", 0);
        b = new <init>("BUTTON", 1, "button", 1);
        c = new <init>("BOX_COUNT", 2, "box_count", 2);
        g = (new g[] {
            a, b, c
        });
        d = a;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        e = s1;
        f = j;
    }
}
