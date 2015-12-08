// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class hgx extends hhh
    implements hgy
{

    private final List a = new ArrayList();

    public hgx(List list)
    {
        a.addAll(list);
    }

    public final int a(long l)
    {
        int i;
        if (l == -1L)
        {
            return -1;
        }
        i = 0;
_L3:
        if (i >= a.size())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((hgo)a.get(i)).b() != l) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public final long a(int i)
    {
        return ((hgo)a.get(i)).b();
    }

    public final void a(int i, hgo hgo1)
    {
        a.add(i, hgo1);
    }

    public final void a(int i, List list)
    {
        a.addAll(i, list);
    }

    public final int b()
    {
        return a.size();
    }

    public final boolean b(int i)
    {
        return true;
    }

    public final hgo c(int i)
    {
        return (hgo)a.get(i);
    }

    public final void d(int i)
    {
        a.remove(i);
    }

    public final void d(int i, int j)
    {
        a.subList(i, i + j).clear();
    }

    public final void e(int i, int j)
    {
        hgo hgo1 = (hgo)a.remove(i);
        a.add(j, hgo1);
    }
}
