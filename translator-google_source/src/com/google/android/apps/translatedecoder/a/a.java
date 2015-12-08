// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.a;

import com.google.android.apps.translatedecoder.preprocess.Tokenizer;
import com.google.android.apps.translatedecoder.pt.PhrasePair;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import com.google.android.apps.translatedecoder.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.a:
//            b

public final class a
{

    private final b a;
    private final SymbolTable b;
    private final PhraseTable c;
    private final Tokenizer d;
    private final com.google.android.apps.translatedecoder.rapidresp.a e;

    public a(b b1, SymbolTable symboltable, Tokenizer tokenizer, PhraseTable phrasetable, com.google.android.apps.translatedecoder.rapidresp.a a1)
    {
        a = b1;
        b = symboltable;
        c = phrasetable;
        d = tokenizer;
        e = a1;
    }

    public final List a(int ai[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj1 = c.getPhrases(ai);
        obj = obj1;
        if (e != null)
        {
            obj = e.a(ai, true, ((List) (obj1)));
        }
        obj1 = obj3;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((List) (obj)).size() > 0) goto _L4; else goto _L3
_L3:
        obj1 = obj3;
_L2:
        return ((List) (obj1));
_L4:
        Iterator iterator = ((List) (obj)).iterator();
        obj = obj2;
        do
        {
            obj1 = obj;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj1 = (PhrasePair)iterator.next();
            if (((PhrasePair) (obj1)).dictInfo() != null)
            {
                if (obj == null)
                {
                    obj = new ArrayList();
                }
                if (a.e)
                {
                    obj1 = new com.google.android.apps.translatedecoder.a.b(b.getWords(ai), Tokenizer.deTokenize(a.d, b.getWords(((PhrasePair) (obj1)).tgtWords())), b.getWords(((PhrasePair) (obj1)).dictInfo()), ((PhrasePair) (obj1)).cost());
                } else
                {
                    obj1 = new com.google.android.apps.translatedecoder.a.b(b.getWords(ai), b.getWords(((PhrasePair) (obj1)).tgtWords()), b.getWords(((PhrasePair) (obj1)).dictInfo()), ((PhrasePair) (obj1)).cost());
                }
                ((List) (obj)).add(obj1);
            }
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }
}
