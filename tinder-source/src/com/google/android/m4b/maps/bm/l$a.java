// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.bo.g;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            l

static final class a
{

    final LinkedList a = new LinkedList();

    public final g a()
    {
        return (g)a.getFirst();
    }

    public final boolean a(a a1)
    {
        if (((g)a1.a.getLast()).equals(a.getFirst()))
        {
            a.removeFirst();
            a.addAll(0, a1.a);
            return true;
        }
        if (((g)a1.a.getFirst()).equals(a.getLast()))
        {
            a.removeLast();
            a.addAll(a1.a);
            return true;
        } else
        {
            return false;
        }
    }

    public final g b()
    {
        return (g)a.getLast();
    }

    public (g g1, g g2)
    {
        a.add(g1);
        a.add(g2);
    }
}
