// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class nit> extends cul
{

    private Iterable a;

    public final Iterator iterator()
    {
        return cuw.d(new <init>(a.iterator()));
    }

    (Iterable iterable)
    {
        a = iterable;
        super();
    }
}
