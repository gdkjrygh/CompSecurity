// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nhg
    implements qwc
{

    private final qwc a;

    private nhg(qwc qwc1)
    {
        a = qwc1;
    }

    public static qwc a(qwc qwc1)
    {
        return new nhg(qwc1);
    }

    public final Object a()
    {
        nhr nhr1 = (nhr)a.a();
        if (nhr1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return nhr1;
        }
    }
}
