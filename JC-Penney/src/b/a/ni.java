// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nh, ou, nc

final class ni
{

    int a;
    ou b;
    nc c;

    private ni()
    {
    }

    ni(byte byte0)
    {
        this();
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof nh))
        {
            return false;
        } else
        {
            return nh.a((nh)obj, a, b, c);
        }
    }

    public final int hashCode()
    {
        return nh.a(a, b, c);
    }
}
