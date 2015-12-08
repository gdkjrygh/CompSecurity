// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gjh
    implements lu
{

    private List a;

    public gjh()
    {
        a = new ArrayList();
    }

    public final void a(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lu)iterator.next()).a(i)) { }
    }

    public final void a(int i, float f, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lu)iterator.next()).a(i, f, j)) { }
    }

    public final void a(lu lu1)
    {
        ctz.a(lu1);
        a.add(lu1);
    }

    public final void b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lu)iterator.next()).b(i)) { }
    }
}
