// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            BitData, a

public class BitSetBasedBitData extends BitData
{

    private static final long serialVersionUID = 0xd2a9f4ea5b8e3465L;
    private final BitSet bitSet;

    public BitSetBasedBitData(BitSet bitset)
    {
        bitSet = bitset;
    }

    public void clear()
    {
        bitSet.clear();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BitSetBasedBitData)
        {
            return ((BitSetBasedBitData)obj).bitSet.equals(bitSet);
        } else
        {
            return false;
        }
    }

    public boolean get(int i)
    {
        return bitSet.get(i);
    }

    public int length()
    {
        return bitSet.length();
    }

    public int nextSetBit(int i)
    {
        return bitSet.nextSetBit(i);
    }

    public void set(int i, boolean flag)
    {
        bitSet.set(i, flag);
    }

    public int size()
    {
        return bitSet.size();
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        Object obj = new ArrayList();
        int i = 0;
        while (i < length()) 
        {
            if (length() - i < 64)
            {
                ((List) (obj)).add(Long.valueOf(a.b(this, i, length() - i)));
            } else
            {
                ((List) (obj)).add(Long.valueOf(a.b(this, i, 64)));
            }
            i += 64;
        }
        bytebuffer.putInt((((List) (obj)).size() << 6) / 8);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); bytebuffer.putLong(((Long)((Iterator) (obj)).next()).longValue())) { }
    }
}
