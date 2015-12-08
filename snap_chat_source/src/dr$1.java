// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends dr
{

    private String b;
    private dr c;

    public final dr a()
    {
        throw new UnsupportedOperationException("already specified useForNull");
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

    public final dr b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    >(dr dr1, dr dr2, String s)
    {
        c = dr1;
        b = s;
        super(dr2, (byte)0);
    }
}
