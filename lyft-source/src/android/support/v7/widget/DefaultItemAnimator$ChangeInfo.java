// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


class <init>
{

    public f a;
    public f b;
    public int c;
    public int d;
    public int e;
    public int f;

    public String toString()
    {
        return (new StringBuilder()).append("ChangeInfo{oldHolder=").append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }

    private ( ,  1)
    {
        a = ;
        b = 1;
    }

    private b(b b1, b b2, int i, int j, int k, int l)
    {
        this(b1, b2);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    f(f f1, f f2, int i, int j, int k, int l, f f3)
    {
        this(f1, f2, i, j, k, l);
    }
}
