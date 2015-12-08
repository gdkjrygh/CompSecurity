// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            bv

final class z
{

    public bv a;
    public bv b;
    public int c;
    public int d;
    public int e;
    public int f;

    private z(bv bv, bv bv1)
    {
        a = bv;
        b = bv1;
    }

    private z(bv bv, bv bv1, int i, int j, int k, int l)
    {
        this(bv, bv1);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    z(bv bv, bv bv1, int i, int j, int k, int l, byte byte0)
    {
        this(bv, bv1, i, j, k, l);
    }

    public final String toString()
    {
        return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }
}
