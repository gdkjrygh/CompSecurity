// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            f

private static final class clerView.v
{

    public clerView.v a;
    public clerView.v b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final String toString()
    {
        return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }

    private clerView.v(clerView.v v, clerView.v v1)
    {
        a = v;
        b = v1;
    }

    private clerView.v(clerView.v v, clerView.v v1, int i, int j, int k, int l)
    {
        this(v, v1);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    clerView.v(clerView.v v, clerView.v v1, int i, int j, int k, int l, byte byte0)
    {
        this(v, v1, i, j, k, l);
    }
}
