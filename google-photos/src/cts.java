// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedList;

final class cts
{

    final LinkedList a = new LinkedList();

    cts()
    {
    }

    static void a(ciy ciy, cje cje1)
    {
        if (cje1 != null)
        {
            cje1.a(ciy);
            return;
        } else
        {
            dee.a(ciy);
            return;
        }
    }

    public final void a(ciy ciy, cje cje1, int i, cnq cnq1)
    {
        if (cnq1 != null && cnq1.k)
        {
            a(ciy, cje1);
        } else
        {
            a.addLast(new ctt(this, ciy, cje1, i));
        }
        if (cnq1 == null)
        {
            i = 0;
        } else
        {
            i = cnq1.j;
        }
        for (; a.size() > i; a(((ctt) (ciy)).a, ((ctt) (ciy)).b))
        {
            ciy = (ctt)a.poll();
        }

    }
}
