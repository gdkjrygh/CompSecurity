// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class gcd
    implements gcq
{

    private final Collection a = new LinkedList();

    public gcd()
    {
    }

    public void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gcq)iterator.next()).a()) { }
    }

    public final void a(gcq gcq1)
    {
        a.add(gcq1);
    }

    public final void b(gcq gcq1)
    {
        a.remove(gcq1);
    }
}
