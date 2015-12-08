// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            i

public static final class  extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final o k;
    public static final o l;
    public static final o m;
    public static final o n;
    public static final o o;
    private static final o p[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tremorvideo/sdk/android/richmedia/i$c, s);
    }

    public static [] values()
    {
        return ([])p.clone();
    }

    static 
    {
        a = new <init>("None", 0);
        b = new <init>("VideoStart", 1);
        c = new <init>("VideoEnd", 2);
        d = new <init>("TouchDown", 3);
        e = new <init>("TouchRelease", 4);
        f = new <init>("SceneStart", 5);
        g = new <init>("SceneEnd", 6);
        h = new <init>("SceneExit", 7);
        i = new <init>("Shake", 8);
        j = new <init>("DropEnter", 9);
        k = new <init>("DropRelease", 10);
        l = new <init>("DropCancel", 11);
        m = new <init>("Code", 12);
        n = new <init>("AgePass", 13);
        o = new <init>("AgeFail", 14);
        p = (new p[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
