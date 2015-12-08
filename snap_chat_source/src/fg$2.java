// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class lang.Object
    implements Iterable
{

    private CharSequence a;
    private String b;
    private lang.String c;
    private long d;
    private fg e;

    public final Iterator iterator()
    {
        return new ff(e, a, b, c, d);
    }

    public >(fg fg1, CharSequence charsequence, String s, String s1)
    {
        e = fg1;
        a = charsequence;
        b = s;
        c = s1;
        d = 0x7fffffffffffffffL;
        super();
    }
}
