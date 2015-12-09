// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.an;


// Referenced classes of package p.an:
//            a, i

public abstract class h extends a
{

    private final int a;
    private final int b;

    public h()
    {
        this(0x80000000, 0x80000000);
    }

    public h(int j, int k)
    {
        a = j;
        b = k;
    }

    public final void a(i j)
    {
        if (!p.ap.h.a(a, b))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ").append(a).append(" and height: ").append(b).append(", either provide dimensions in the constructor").append(" or call override()").toString());
        } else
        {
            j.a(a, b);
            return;
        }
    }
}
