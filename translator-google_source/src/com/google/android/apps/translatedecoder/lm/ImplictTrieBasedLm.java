// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.lm;

import com.google.android.apps.translatedecoder.succinct.ImplicitTrie;
import com.google.android.apps.translatedecoder.succinct.b;
import com.google.android.apps.translatedecoder.util.e;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.lm:
//            LanguageModel

public class ImplictTrieBasedLm extends LanguageModel
{

    public static final int CLASS_ID = 1;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xb76c57bcdf97e58fL;
    private transient Map b;
    private double stupidBackoffCost;
    private final ImplicitTrie trie;

    public ImplictTrieBasedLm(int i, double d, double d1, boolean flag, ImplicitTrie implicittrie)
    {
        this(i, d, d1, flag, implicittrie, 0);
    }

    public ImplictTrieBasedLm(int i, double d, double d1, boolean flag, ImplicitTrie implicittrie, 
            int j)
    {
        lmOrder = i;
        oovCost = d;
        stupidBackoffCost = d1;
        noBackoff = flag;
        trie = implicittrie;
        maxNumCachedNgrams = j;
    }

    public static LanguageModel readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        int i = bytebuffer.getInt();
        double d = bytebuffer.getDouble();
        if (bytebuffer.getInt() != 1)
        {
            flag = false;
        }
        return new ImplictTrieBasedLm(i, d, bytebuffer.getDouble(), flag, ImplicitTrie.readFromByteBuffer(bytebuffer));
    }

    public double ngramCost(List list)
    {
        if (maxNumCachedNgrams > 0)
        {
            if (b == null)
            {
                b = new HashMap();
            }
            String s = e.b(list);
            Double double1 = (Double)b.get(s);
            if (double1 != null)
            {
                return double1.doubleValue();
            }
            double d = ngramCostHelper(list);
            if (b.size() >= maxNumCachedNgrams)
            {
                b.clear();
            }
            b.put(s, Double.valueOf(d));
            return d;
        } else
        {
            return ngramCostHelper(list);
        }
    }

    public double ngramCost(int ai[], int i, int j, int ai1[])
    {
        ai = trie.reverseTrieLookup(ai, i, j, ai1);
        int k = ai1[0];
        if (ai != null)
        {
            double d = ((b) (ai)).c;
            double d1 = stupidBackoffCost;
            return (double)(((j - i) + 1) - k) * d1 + (0.0D + d);
        } else
        {
            return oovCost;
        }
    }

    public double ngramCostHelper(List list)
    {
        if (!noBackoff) goto _L2; else goto _L1
_L1:
        list = trie.lookup(list);
        if (list == null) goto _L4; else goto _L3
_L3:
        double d = ((b) (list)).c;
_L6:
        return d;
_L4:
        return oovCost;
_L2:
        double d1 = 0.0D;
        int i = 0;
        do
        {
            d = d1;
            if (i >= list.size())
            {
                continue;
            }
            b b1 = trie.lookup(list.subList(i, list.size()));
            if (b1 != null)
            {
                return d1 + b1.c;
            }
            if (i == list.size() - 1)
            {
                d = oovCost;
            } else
            if (!simulateProdlm)
            {
                d = d1 + stupidBackoffCost;
            } else
            {
                if (lmOrder > 2)
                {
                    int j = lmOrder;
                    throw new RuntimeException((new StringBuilder(49)).append("simulateProdlm does not work for order").append(j).toString());
                }
                d = d1;
                if (((Integer)list.get(0)).intValue() != unkId)
                {
                    d = d1 + stupidBackoffCost;
                }
            }
            i++;
            d1 = d;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setStupidBackoffCost(double d)
    {
        stupidBackoffCost = d;
    }

    public double stupidBackoffCost()
    {
        return stupidBackoffCost;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        int i = 1;
        bytebuffer.putInt(1);
        bytebuffer.putInt(lmOrder);
        bytebuffer.putDouble(oovCost);
        if (!noBackoff)
        {
            i = 0;
        }
        bytebuffer.putInt(i);
        bytebuffer.putDouble(stupidBackoffCost);
        trie.writeToByteBuffer(bytebuffer);
    }

}
