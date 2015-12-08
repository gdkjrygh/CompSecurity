// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class nit> extends cul
{

    private Iterable a;
    private ctv b;

    public final Iterator iterator()
    {
        return cuw.a(a.iterator(), b);
    }

    (Iterable iterable, ctv ctv)
    {
        a = iterable;
        b = ctv;
        super();
    }
}
