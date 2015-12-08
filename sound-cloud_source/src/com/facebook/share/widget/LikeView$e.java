// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            LikeView

public static final class e extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static a d;
    private static final a g[];
    public int e;
    private String f;

    public static e a(int i)
    {
        e ae[] = values();
        int k = ae.length;
        for (int j = 0; j < k; j++)
        {
            e e1 = ae[j];
            if (e1.e == i)
            {
                return e1;
            }
        }

        return null;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/share/widget/LikeView$e, s);
    }

    public static e[] values()
    {
        return (e[])g.clone();
    }

    public final String toString()
    {
        return f;
    }

    static 
    {
        a = new <init>("UNKNOWN", 0, "unknown", 0);
        b = new <init>("OPEN_GRAPH", 1, "open_graph", 1);
        c = new <init>("PAGE", 2, "page", 2);
        g = (new g[] {
            a, b, c
        });
        d = a;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        f = s1;
        e = j;
    }
}
