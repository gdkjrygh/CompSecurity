// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class crl
    implements Iterable
{

    private crk a;

    public crl(crk crk)
    {
        a = crk;
        super();
    }

    public final Iterator iterator()
    {
        return new crm(a);
    }
}
