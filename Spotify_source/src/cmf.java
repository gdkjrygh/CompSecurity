// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class cmf extends cmi
{

    private final ArrayList a;
    private clz b;

    public cmf(clz clz1, ArrayList arraylist)
    {
        b = clz1;
        super(clz1, (byte)0);
        a = arraylist;
    }

    public final void a()
    {
        Set set = b.a.n;
        if (set.isEmpty())
        {
            set = b.j();
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((bqr)iterator.next()).a(b.g, set)) { }
    }
}
