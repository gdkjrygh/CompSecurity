// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;


// Referenced classes of package com.pandora.android.widget:
//            Widget

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private int d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/pandora/android/widget/Widget$a, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    public int a()
    {
        return d;
    }

    static 
    {
        a = new <init>("SMALL", 0, 0x7f0400c0);
        b = new <init>("MEDIUM", 1, 0x7f0400c1);
        c = new <init>("LARGE", 2, 0x7f0400c2);
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
