// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.succinct:
//            FixedBitsTrieNodeList, b

public abstract class TrieNodeList
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x620b2cf353b87cf6L;

    public TrieNodeList()
    {
    }

    public static TrieNodeList readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return FixedBitsTrieNodeList.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new RuntimeException((new StringBuilder(28)).append("unknown class id ").append(i).toString());
        }
    }

    public abstract void add(b b);

    public abstract void clear();

    public abstract void fill(int i, b b);

    public abstract int size();

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);

}
