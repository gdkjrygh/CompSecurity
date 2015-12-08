// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

final class hof extends aep
{

    private hoe a;

    hof(hoe hoe1)
    {
        a = hoe1;
        super();
    }

    public final void a(int i, int j, int k)
    {
        hoe hoe1 = a;
        if (hoe1.a != null)
        {
            hoe1.b = new HashMap();
            for (i = 0; i < hoe1.a.a(); i++)
            {
                hoe1.b.put(Long.valueOf(hoe1.a.b(i)), Integer.valueOf(i));
            }

        }
    }
}
