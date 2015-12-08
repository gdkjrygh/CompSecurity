// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.i;
import java.io.IOException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.c.a.a.b:
//            f, d

static final class a
{

    private final e a;

    private void a(int j, int k)
        throws IOException
    {
        if (j < k)
        {
            a.a(j | 0);
            return;
        }
        a.a(k | 0);
        for (j -= k; j >= 128; j >>>= 7)
        {
            a.a(j & 0x7f | 0x80);
        }

        a.a(j);
    }

    private void a(i j)
        throws IOException
    {
        a(j.c.length, 127);
        a.a(j);
    }

    final void a(List list)
        throws IOException
    {
        int l = list.size();
        int k = 0;
        while (k < l) 
        {
            i j = ((d)list.get(k)).h.c();
            Integer integer = (Integer)f.b().get(j);
            if (integer != null)
            {
                a(integer.intValue() + 1, 15);
                a(((d)list.get(k)).i);
            } else
            {
                a.a(0);
                a(j);
                a(((d)list.get(k)).i);
            }
            k++;
        }
    }

    ion(e e1)
    {
        a = e1;
    }
}
