// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

static final class a
{

    private final ahX a;

    private void a(int i, int j)
    {
        if (i < j)
        {
            a.b(i | 0);
            return;
        }
        a.b(j | 0);
        for (i -= j; i >= 128; i >>>= 7)
        {
            a.b(i & 0x7f | 0x80);
        }

        a.b(i);
    }

    private void a(aia aia1)
    {
        a(aia1.b.length, 127);
        a.a(aia1);
    }

    final void a(List list)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            aia aia1 = ((Yn)list.get(i)).h.c();
            Integer integer = (Integer)Yp.b().get(aia1);
            if (integer != null)
            {
                a(integer.intValue() + 1, 15);
                a(((Yn)list.get(i)).i);
            } else
            {
                a.b(0);
                a(aia1);
                a(((Yn)list.get(i)).i);
            }
            i++;
        }
    }

    >(ahX ahx)
    {
        a = ahx;
    }
}
