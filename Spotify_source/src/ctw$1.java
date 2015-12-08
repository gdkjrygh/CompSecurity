// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends ctw
{

    private String b;
    private ctw c;

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

    public final ctw b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    (ctw ctw1, ctw ctw2, String s)
    {
        c = ctw1;
        b = s;
        super(ctw2, (byte)0);
    }
}
