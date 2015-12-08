// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.lm.LanguageModel;
import com.google.android.apps.translatedecoder.lm.a;
import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            e, p, w, c, 
//            n

public final class l
    implements e
{

    private final a a;
    private final c b;

    public l(a a1, c c1)
    {
        a = a1;
        b = c1;
    }

    private void a(p p1, w w1, int i)
    {
        int ai[] = a.a(p1.b, w1.tgtWords());
        a(p1, w1, b.a(i, ai));
    }

    private void a(p p1, w w1, p p2)
    {
        double d;
        boolean flag;
label0:
        {
            boolean flag1 = false;
            double d1 = p1.a();
            double d2 = w1.cost();
            a a1 = a;
            int ai[] = p1.b;
            int ai1[] = w1.tgtWords();
            if (ai.length > a1.b - 1)
            {
                throw new DecoderRuntimeException("State has too many words!");
            }
            ai1 = a1.a(ai1);
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < ai.length; i++)
            {
                arraylist.add(Integer.valueOf(ai[i]));
            }

            d = 0.0D;
            for (int j = 0; j < ai1.length; j++)
            {
                arraylist.add(Integer.valueOf(ai1[j]));
                d += a1.a.ngramCost(arraylist);
                if (a1.c != null)
                {
                    a1.c.add(a1.d.getWords(arraylist));
                }
                if (arraylist.size() >= a1.b)
                {
                    arraylist.remove(0);
                }
            }

            d = d * a.f.l + (d2 + d1);
            if (p2.a != null)
            {
                flag = flag1;
                if (d >= p2.a.b)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            p2.a = new n(p1, d, w1);
        }
    }

    public final void a(List list, w w1, int i)
    {
        for (list = list.iterator(); list.hasNext(); a((p)list.next(), w1, i)) { }
    }

    public final void a(List list, List list1, int i)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            p p1 = (p)list.next();
            Iterator iterator = list1.iterator();
            while (iterator.hasNext()) 
            {
                a(p1, (w)iterator.next(), i);
            }
        }

    }

    public final p b(List list, w w1, int i)
    {
        p p1 = new p(i, null);
        for (list = list.iterator(); list.hasNext(); a((p)list.next(), w1, p1)) { }
        return p1;
    }
}
