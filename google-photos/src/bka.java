// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class bka
{

    final ahq a;
    final HashMap b = new HashMap();
    private final LinkedList c = new LinkedList();

    public bka(ahq ahq)
    {
        a = ahq;
    }

    void a()
    {
_L5:
        if (c.isEmpty()) goto _L2; else goto _L1
_L1:
        ahn ahn1;
        aju aaju[];
        int i;
        int j;
        ahn1 = (ahn)c.pop();
        aaju = ahn1.mConnectedOutputPortArray;
        j = aaju.length;
        i = 0;
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!aaju[i].g.a.mIsActive) goto _L4; else goto _L3
_L3:
        i = 1;
_L7:
        if (i == 0)
        {
            b(ahn1);
        }
          goto _L5
_L4:
        i++;
          goto _L6
_L2:
        return;
        i = 0;
          goto _L7
    }

    void a(ahn ahn1)
    {
        aju aaju[] = ahn1.mConnectedOutputPortArray;
        int j = aaju.length;
        for (int i = 0; i < j; i++)
        {
            ahn ahn2 = aaju[i].g.a;
            if (!b.containsKey(ahn2))
            {
                b.put(ahn2, new HashSet());
            }
            ((HashSet)b.get(ahn2)).add(ahn1);
            a(ahn2);
        }

    }

    void b(ahn ahn1)
    {
        aiw aiw1 = aiw.a();
        if (aiw1 != null && !aiw1.g.a(8) && !aiw1.g.a(1))
        {
            throw new RuntimeException("Attempting to modify filter state while runner is executing. Please pause or stop the runner first!");
        }
        if (ahn1.mIsActive)
        {
            ahn1.mIsActive = false;
        }
        if (b.containsKey(ahn1))
        {
            ahn1 = ((HashSet)b.get(ahn1)).iterator();
            while (ahn1.hasNext()) 
            {
                ahn ahn2 = (ahn)ahn1.next();
                if (ahn2.mConnectedOutputPortArray.length == 1)
                {
                    b(ahn2);
                } else
                if (!c.contains(ahn2))
                {
                    c.add(ahn2);
                }
            }
        }
    }
}
