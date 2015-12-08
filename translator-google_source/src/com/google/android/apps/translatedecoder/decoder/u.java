// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.lm.a;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            c, l, a, e, 
//            p, m

public final class u
{

    boolean a;
    private final PhraseTable b;
    private final com.google.android.apps.translatedecoder.rapidresp.a c;
    private int d[];
    private int e[];
    private final c f;
    private final e g;
    private final int h;
    private final int i;
    private final a j;

    public u(PhraseTable phrasetable, com.google.android.apps.translatedecoder.rapidresp.a a1, a a2, b b1, SymbolTable symboltable, int ai[], int ai1[])
    {
        a = false;
        b = phrasetable;
        c = a1;
        j = a2;
        d = ai;
        e = ai1;
        i = symboltable.addWord("<S>");
        h = symboltable.addWord("</S>");
        if (b1.u <= 0)
        {
            f = new c();
        } else
        {
            f = new c(new com.google.android.apps.translatedecoder.decoder.a(b1.u));
        }
        g = new l(a2, f);
    }

    public final m a()
    {
        int k;
        if (d == null || d.length <= 0)
        {
            return null;
        }
        k = 0;
_L2:
        if (k >= d.length + 1)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        f.a(0, j.a(null, new int[] {
            i
        }));
_L3:
        f.c(k);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (k > d.length)
            {
                break label0;
            }
            int j1 = 0;
            while (j1 < k) 
            {
                List list;
                List list3;
                int ai[];
label1:
                {
                    list3 = f.b(j1);
                    if (list3 == null || list3.size() == 0)
                    {
                        continue;
                    }
                    ai = Arrays.copyOfRange(d, j1, k);
                    List list2 = b.getPhrases(ai);
                    if (list2 != null)
                    {
                        list = list2;
                        if (list2.size() != 0)
                        {
                            break label1;
                        }
                    }
                    int ai1[] = Arrays.copyOfRange(e, j1, k);
                    list = list2;
                    if (!Arrays.equals(d, e))
                    {
                        list = b.getPhrases(ai1);
                    }
                }
                int l1;
                int i2;
                if (list == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = list.size();
                }
                if (c != null)
                {
                    list = c.a(ai, false, list);
                }
                if (list == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = list.size();
                }
                if (l1 != i2)
                {
                    a = true;
                }
                if (list != null && list.size() != 0)
                {
                    g.a(list3, list, k);
                }
                j1++;
            }
            if (!f.a(k))
            {
                int k1 = k - 1;
                List list1 = f.b(k1);
                com.google.android.apps.translatedecoder.pt.PhrasePair phrasepair = b.createOOVPhrase(d[k1]);
                if (phrasepair != null && list1 != null)
                {
                    g.a(list1, phrasepair, k);
                } else
                {
                    throw new RuntimeException("Either phrase or nodes are null.");
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new RuntimeException((new StringBuilder(24)).append("Wrong endPos ").append(k).toString());
        int i1 = d.length + 1;
        Object obj = f.b(i1 - 1);
        if (obj == null || ((List) (obj)).size() == 0)
        {
            throw new RuntimeException((new StringBuilder(40)).append("No src nodes for end postion ").append(i1 - 1).toString());
        }
        com.google.android.apps.translatedecoder.pt.PhrasePair phrasepair1 = b.createIdentityPhrase(h, 0.0D);
        obj = g.b(((List) (obj)), phrasepair1, i1);
        if (((p) (obj)).a == null)
        {
            throw new RuntimeException("No goal node, must be wrong!");
        } else
        {
            return new m(((p) (obj)));
        }
    }
}
