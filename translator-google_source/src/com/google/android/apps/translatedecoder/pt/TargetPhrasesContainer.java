// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.pt;

import com.google.android.apps.translatedecoder.succinct.Quantizer;
import com.google.android.apps.translatedecoder.util.BitData;
import com.google.android.apps.translatedecoder.util.BitSetBasedBitData;
import com.google.android.apps.translatedecoder.util.a;
import com.google.android.apps.translatedecoder.util.e;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.pt:
//            PhrasePair

public class TargetPhrasesContainer
    implements Serializable
{

    private static final long serialVersionUID = 0xfa84b5656ac3f1beL;
    private final BitData data;
    private final int dictTagWordId;
    private final Quantizer quantizer;
    private final int valLen;
    private final int wordIdLen;

    public TargetPhrasesContainer(BitData bitdata, int i, int j, Quantizer quantizer1, int k)
    {
        data = bitdata;
        wordIdLen = i;
        valLen = j;
        quantizer = quantizer1;
        dictTagWordId = k;
    }

    public TargetPhrasesContainer(BitSet bitset, int i, int j, Quantizer quantizer1)
    {
        this(((BitData) (new BitSetBasedBitData(bitset))), i, j, quantizer1, -1);
    }

    public TargetPhrasesContainer(BitSet bitset, int i, int j, Quantizer quantizer1, int k)
    {
        this(((BitData) (new BitSetBasedBitData(bitset))), i, j, quantizer1, k);
    }

    private static int a(int i, int ai[])
    {
        for (int j = 0; j < ai.length; j++)
        {
            if (ai[j] == i)
            {
                return j;
            }
        }

        return -1;
    }

    public static TargetPhrasesContainer readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        int j = bytebuffer.getInt();
        int k = bytebuffer.getInt();
        Quantizer quantizer1 = Quantizer.readFromByteBuffer(bytebuffer);
        return new TargetPhrasesContainer(BitData.readFromByteBuffer(bytebuffer), i, j, quantizer1, k);
    }

    public int addTargetPhrases(List list, int i)
    {
        int j = 0;
        i <<= 3;
        int k;
        do
        {
            k = i;
            if (j >= list.size())
            {
                break;
            }
            BitData bitdata = data;
            int ai[] = ((PhrasePair)list.get(j)).tgtWords();
            int j1 = quantizer.getUnit(((PhrasePair)list.get(j)).cost());
            int l;
            boolean flag;
            if (j >= list.size() - 1)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            flag = false;
            l = i;
            i = ((flag) ? 1 : 0);
            while (i < ai.length) 
            {
                com.google.android.apps.translatedecoder.util.a.a(ai[i], bitdata, l, wordIdLen);
                int i1 = l + wordIdLen;
                l = i1 + 1;
                boolean flag1;
                if (i < ai.length - 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bitdata.set(i1, flag1);
                i++;
            }
            com.google.android.apps.translatedecoder.util.a.a(j1, bitdata, l, valLen);
            l += valLen;
            i = l + 1;
            boolean flag2;
            if (k == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            bitdata.set(l, flag2);
            j++;
        } while (true);
        for (; k % 8 != 0; k++)
        {
            data.set(k);
        }

        return k / 8;
    }

    public List convertToPhrases(int i)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        i <<= 3;
        boolean flag = true;
        do
        {
            if (!flag)
            {
                break;
            }
            arraylist1.clear();
            boolean flag1 = true;
            do
            {
                if (!flag1)
                {
                    break;
                }
                arraylist1.add(Integer.valueOf(com.google.android.apps.translatedecoder.util.a.a(data, i, wordIdLen)));
                int i1 = wordIdLen + i;
                BitData bitdata = data;
                int k = i1 + 1;
                i = k;
                if (!bitdata.get(i1))
                {
                    flag1 = false;
                    i = k;
                }
            } while (true);
            double d = quantizer.getValue(com.google.android.apps.translatedecoder.util.a.a(data, i, valLen));
            int l = i + valLen;
            if (dictTagWordId >= 0)
            {
                int ai[] = e.a(arraylist1);
                i = a(dictTagWordId, ai);
                int j;
                if (i == -1)
                {
                    arraylist.add(new PhrasePair(ai, d));
                } else
                {
                    arraylist.add(new PhrasePair(Arrays.copyOfRange(ai, 0, i), Arrays.copyOfRange(ai, i + 1, ai.length), d));
                }
            } else
            {
                arraylist.add(new PhrasePair(e.a(arraylist1), d));
            }
            ai = data;
            j = l + 1;
            i = j;
            if (!ai.get(l))
            {
                flag = false;
                i = j;
            }
        } while (true);
        return arraylist;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(wordIdLen);
        bytebuffer.putInt(valLen);
        bytebuffer.putInt(dictTagWordId);
        quantizer.writeToByteBuffer(bytebuffer);
        data.writeToByteBuffer(bytebuffer);
    }
}
