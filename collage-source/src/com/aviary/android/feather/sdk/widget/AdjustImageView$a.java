// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    public final int d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/aviary/android/feather/sdk/widget/AdjustImageView$a, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    static 
    {
        a = new <init>("FLIP_NONE", 0, 1);
        b = new <init>("FLIP_HORIZONTAL", 1, 2);
        c = new <init>("FLIP_VERTICAL", 2, 4);
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
