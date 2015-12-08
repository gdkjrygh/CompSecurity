// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Set;

final class gkv
    implements Runnable
{

    private ehr a;
    private int b;
    private int c;
    private List d;
    private gkt e;

    gkv(gkt gkt1, ehr ehr, int i, int j, List list)
    {
        e = gkt1;
        a = ehr;
        b = i;
        c = j;
        d = list;
        super();
    }

    public final void run()
    {
        glj glj1 = gkt.a(e, a);
        glj1.d = b;
        if (glj1.a())
        {
            return;
        } else
        {
            int i = c;
            glj1.a.remove(Integer.valueOf(i));
            gkt.a(e).a(a, gkt.b(e).a(c, d));
            gld gld1 = gkt.c(e);
            i = c;
            i = gld1.a * i;
            glj1.a(i, d.size() + i);
            return;
        }
    }
}
