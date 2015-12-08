// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.rapidresp;

import com.google.android.apps.translatedecoder.pt.HashMapBasedPt;
import com.google.android.apps.translatedecoder.pt.PhrasePair;
import com.google.android.apps.translatedecoder.pt.PhraseTable;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.rapidresp:
//            PhraseType

public final class a
{

    private static final Logger c = Logger.getLogger("translate");
    private final PhraseTable a;
    private final double b;

    public a(int i, double d, String s, SymbolTable symboltable, double d1)
    {
        b = d1;
        a = new HashMapBasedPt(i, d, a(s), symboltable, true);
    }

    public a(PhraseTable phrasetable, double d)
    {
        a = phrasetable;
        b = d;
    }

    private static byte a(byte byte0)
    {
        if (byte0 == -128)
        {
            return 127;
        } else
        {
            return (byte)(byte0 - 1);
        }
    }

    private static PhraseType a(PhrasePair phrasepair)
    {
        if (phrasepair.cost() <= 0.0D)
        {
            return PhraseType.DOMINATING_PHRASE;
        } else
        {
            return PhraseType.ANTI_DOMINATING_PHRASE;
        }
    }

    private static String a(String s)
    {
        byte byte0;
        byte abyte0[];
        int i;
        Object obj;
        try
        {
            System.currentTimeMillis();
            s = (new RandomAccessFile(s, "r")).getChannel();
            obj = s.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)s.size());
            abyte0 = new byte[((ByteBuffer) (obj)).capacity()];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            new String("Rapid response File not found");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            new String("Rapid response File read failed");
            return null;
        }
        i = 0;
_L2:
        if (i >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        byte0 = ((ByteBuffer) (obj)).get();
        if (i % 3 == 0)
        {
            if (byte0 == 127)
            {
                byte0 = -128;
            } else
            {
                byte0++;
            }
            break MISSING_BLOCK_LABEL_142;
        }
        if (i % 3 != 1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        byte0 = a(byte0);
        break MISSING_BLOCK_LABEL_142;
        byte0 = a(a(byte0));
        break MISSING_BLOCK_LABEL_142;
        obj = new String(abyte0);
        s.close();
        return ((String) (obj));
        abyte0[i] = byte0;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final List a(int ai[], boolean flag, List list)
    {
        List list1 = a.getPhrases(ai);
        if (list1 == null || list1.size() <= 0)
        {
            return list;
        }
        ai = new ArrayList();
        if (list != null)
        {
            ai.addAll(list);
        }
        list = list1.iterator();
_L2:
        PhrasePair phrasepair;
        int i;
label0:
        {
            if (list.hasNext())
            {
                phrasepair = (PhrasePair)list.next();
                if (a(phrasepair) != PhraseType.DOMINATING_PHRASE || flag)
                {
                    break label0;
                }
                phrasepair.setCost(b);
                ai.clear();
                ai.add(phrasepair);
            }
            return ai;
        }
        if (a(phrasepair) != PhraseType.ANTI_DOMINATING_PHRASE)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i < ai.size())
        {
label1:
            {
                if (!Arrays.equals(((PhrasePair)ai.get(i)).tgtWords(), phrasepair.tgtWords()))
                {
                    break label1;
                }
                ai.remove(i);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        i++;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

}
