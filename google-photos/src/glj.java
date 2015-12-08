// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class glj
{

    final Set a = new HashSet();
    final Set b = new HashSet();
    boolean c;
    int d;
    int e;
    int f;

    glj()
    {
    }

    final void a(int i, int j)
    {
        Object obj = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gki gki1 = ((gkj)iterator.next()).b(i, j);
            if (gki1 != null)
            {
                ((List) (obj)).add(gki1);
            }
        } while (true);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((gki)((Iterator) (obj)).next()).a(i, j)) { }
    }

    final boolean a()
    {
        return d != e;
    }

    final boolean b()
    {
        return b.size() > 0;
    }
}
