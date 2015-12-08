// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            dp

final class dq extends dp
{

    final String b;
    final dp c;

    dq(dp dp1, dp dp2, String s)
    {
        c = dp1;
        b = s;
        super(dp2, (byte)0);
    }

    final CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return b;
        } else
        {
            return c.a(obj);
        }
    }

    public final dp b()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    public final dp b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
