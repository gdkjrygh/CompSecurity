// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.pt;

import com.google.android.apps.translatedecoder.succinct.ImplicitTrie;
import com.google.android.apps.translatedecoder.succinct.b;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.pt:
//            PhraseTable, TargetPhrasesContainer

public class ImplicitTrieBasedPt extends PhraseTable
    implements Serializable
{

    public static final int CLASS_ID = 1;
    private static final long serialVersionUID = 0x3c7433ea49b1eba7L;
    private final ImplicitTrie srcTrie;
    private final TargetPhrasesContainer tgtPhrases;

    public ImplicitTrieBasedPt(int i, double d, ImplicitTrie implicittrie, TargetPhrasesContainer targetphrasescontainer)
    {
        maxPhraseLen = i;
        oovCost = d;
        srcTrie = implicittrie;
        tgtPhrases = targetphrasescontainer;
    }

    public static PhraseTable readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        return new ImplicitTrieBasedPt(bytebuffer.getInt(), bytebuffer.getDouble(), ImplicitTrie.readFromByteBuffer(bytebuffer), TargetPhrasesContainer.readFromByteBuffer(bytebuffer));
    }

    public List getPhrases(int ai[])
    {
        return getPhrases(ai, 0, ai.length - 1);
    }

    public List getPhrases(int ai[], int i, int j)
    {
        if ((j - i) + 1 <= maxPhraseLen)
        {
            if ((ai = srcTrie.lookup(ai, i, j)) != null && ((b) (ai)).c >= 0.0D)
            {
                return tgtPhrases.convertToPhrases((int)((b) (ai)).c);
            }
        }
        return null;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        bytebuffer.putInt(maxPhraseLen);
        bytebuffer.putDouble(oovCost);
        srcTrie.writeToByteBuffer(bytebuffer);
        tgtPhrases.writeToByteBuffer(bytebuffer);
    }
}
