// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


public final class bn extends Enum
{

    public static final bn a;
    public static final bn b;
    public static final bn c;
    private static final bn e[];
    private int d;

    private bn(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static bn valueOf(String s)
    {
        return (bn)Enum.valueOf(kik/android/widget/bn, s);
    }

    public static bn[] values()
    {
        return (bn[])e.clone();
    }

    static 
    {
        a = new bn("TRENDING", 0, 0);
        b = new bn("FEATURED", 1, 1);
        c = new bn("SEARCH", 2, 2);
        e = (new bn[] {
            a, b, c
        });
    }
}
