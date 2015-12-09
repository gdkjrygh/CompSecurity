// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;


// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            ClipActivityView

private static final class A extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/cardinalblue/android/piccollage/view/ClipActivityView$a, s);
    }

    public static A[] values()
    {
        return (A[])e.clone();
    }

    static 
    {
        a = new <init>("MODE_NOTHING", 0);
        b = new <init>("MODE_PRE_TOUCH", 1);
        c = new <init>("MODE_DRAWING", 2);
        d = new <init>("MODE_PINCHING", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
