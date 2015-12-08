// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fa

final class fb extends fa
{

    final String b;
    final fa c;

    fb(fa fa1, fa fa2, String s)
    {
        c = fa1;
        b = s;
        super(fa2, (byte)0);
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

    public final fa b()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    public final fa b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
