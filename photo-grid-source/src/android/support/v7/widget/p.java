// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            bi

final class p
{

    public bi a;
    public bi b;
    public int c;
    public int d;
    public int e;
    public int f;

    private p(bi bi, bi bi1)
    {
        a = bi;
        b = bi1;
    }

    private p(bi bi, bi bi1, int i, int j, int k, int l)
    {
        this(bi, bi1);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    p(bi bi, bi bi1, int i, int j, int k, int l, byte byte0)
    {
        this(bi, bi1, i, j, k, l);
    }

    public final String toString()
    {
        return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }
}
