// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class cmh extends cmi
{

    private final ArrayList a;
    private clz b;

    public cmh(clz clz1, ArrayList arraylist)
    {
        b = clz1;
        super(clz1, (byte)0);
        a = arraylist;
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((bqr)iterator.next()).a(b.g)) { }
    }
}
