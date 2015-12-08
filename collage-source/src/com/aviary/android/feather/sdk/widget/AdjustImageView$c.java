// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AdjustImageView

public static final class i extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h j[];
    final int i;

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/aviary/android/feather/sdk/widget/AdjustImageView$c, s);
    }

    public static i[] values()
    {
        return (i[])j.clone();
    }

    static 
    {
        a = new <init>("MATRIX", 0, 0);
        b = new <init>("FIT_XY", 1, 1);
        c = new <init>("FIT_START", 2, 2);
        d = new <init>("FIT_CENTER", 3, 3);
        e = new <init>("FIT_END", 4, 4);
        f = new <init>("CENTER", 5, 5);
        g = new <init>("CENTER_CROP", 6, 6);
        h = new <init>("CENTER_INSIDE", 7, 7);
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int k, int l)
    {
        super(s, k);
        i = l;
    }
}
