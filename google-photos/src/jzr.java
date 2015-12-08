// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class jzr extends jzs
{

    private final ArrayList a;
    private jzf b;

    public jzr(jzf jzf1, ArrayList arraylist)
    {
        b = jzf1;
        super(jzf1, (byte)0);
        a = arraylist;
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((jyl)iterator.next()).a(b.g)) { }
    }
}
