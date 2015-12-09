// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.imagezoom;


// Referenced classes of package it.sephiroth.android.library.imagezoom:
//            ImageViewTouchBase

public static final class A extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(it/sephiroth/android/library/imagezoom/ImageViewTouchBase$a, s);
    }

    public static A[] values()
    {
        return (A[])d.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("FIT_TO_SCREEN", 1);
        c = new <init>("FIT_IF_BIGGER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
