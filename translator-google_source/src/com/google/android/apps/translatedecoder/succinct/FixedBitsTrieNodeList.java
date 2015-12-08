// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;

import com.google.android.apps.translatedecoder.util.BitData;
import com.google.android.apps.translatedecoder.util.BitSetBasedBitData;
import com.google.android.apps.translatedecoder.util.a;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.succinct:
//            TrieNodeList, Quantizer, b

public class FixedBitsTrieNodeList extends TrieNodeList
{

    public static final int CLASS_ID = 1;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x846cdf7c036aaff0L;
    private final BitData data;
    private final int offsetLen;
    private final Quantizer quantizer;
    private int size;
    private final int trieNodeLen;
    private final int valueLen;
    private final int wordIdLen;

    public FixedBitsTrieNodeList(BitData bitdata, int i, int j, int k, int l, Quantizer quantizer1)
    {
        size = i;
        wordIdLen = j;
        offsetLen = k;
        valueLen = l;
        trieNodeLen = j + k + l;
        quantizer = quantizer1;
        if (quantizer == null)
        {
            throw new IllegalArgumentException("quantizer is null!");
        } else
        {
            data = bitdata;
            return;
        }
    }

    public FixedBitsTrieNodeList(BitSet bitset, int i, int j, int k, int l, Quantizer quantizer1)
    {
        this(((BitData) (new BitSetBasedBitData(bitset))), i, j, k, l, quantizer1);
    }

    public static TrieNodeList readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        int j = bytebuffer.getInt();
        int k = bytebuffer.getInt();
        int l = bytebuffer.getInt();
        Quantizer quantizer1 = Quantizer.readFromByteBuffer(bytebuffer);
        return new FixedBitsTrieNodeList(BitData.readFromByteBuffer(bytebuffer), i, j, k, l, quantizer1);
    }

    public void add(b b1)
    {
        com.google.android.apps.translatedecoder.util.a.a(b1.a, data, size * trieNodeLen, wordIdLen);
        com.google.android.apps.translatedecoder.util.a.a(b1.b, data, size * trieNodeLen + wordIdLen, offsetLen);
        com.google.android.apps.translatedecoder.util.a.a(quantizer.getUnit(b1.c), data, size * trieNodeLen + wordIdLen + offsetLen, valueLen);
        size = size + 1;
    }

    public void clear()
    {
        data.clear();
        size = 0;
    }

    public void fill(int i, b b1)
    {
        if (wordIdLen > 0)
        {
            b1.a = com.google.android.apps.translatedecoder.util.a.a(data, trieNodeLen * i, wordIdLen);
        } else
        {
            b1.a = -1;
        }
        if (offsetLen > 0)
        {
            b1.b = com.google.android.apps.translatedecoder.util.a.a(data, trieNodeLen * i + wordIdLen, offsetLen);
        } else
        {
            b1.b = -1;
        }
        if (valueLen > 0)
        {
            b1.c = quantizer.getValue(com.google.android.apps.translatedecoder.util.a.a(data, trieNodeLen * i + wordIdLen + offsetLen, valueLen));
            return;
        } else
        {
            b1.c = 0.0D;
            return;
        }
    }

    public int size()
    {
        return size;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        bytebuffer.putInt(size);
        bytebuffer.putInt(wordIdLen);
        bytebuffer.putInt(offsetLen);
        bytebuffer.putInt(valueLen);
        quantizer.writeToByteBuffer(bytebuffer);
        data.writeToByteBuffer(bytebuffer);
    }

}
