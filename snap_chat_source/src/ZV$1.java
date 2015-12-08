// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

static final class init> extends aba
{

    private List a;
    private ZQ b;

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            synchronized ((ZV)iterator.next())
            {
                if (ZV.a(zv) == 2)
                {
                    b.l.b(zv);
                }
            }
        }

    }

    >(List list, ZQ zq)
    {
        a = list;
        b = zq;
        super();
    }
}
