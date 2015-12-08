// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.pt;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.pt:
//            ImplicitTrieBasedPt, PhrasePair

public abstract class PhraseTable
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xc417f4d5b1aa0275L;
    int maxPhraseLen;
    double oovCost;

    public PhraseTable()
    {
        maxPhraseLen = 5;
        oovCost = 100D;
    }

    public static PhraseTable readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ImplicitTrieBasedPt.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(28)).append("unknown class id ").append(i).toString());
        }
    }

    public static PhraseTable readFromFile(String s)
    {
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("PtFffNullFile");
        }
        FileChannel filechannel;
        Object obj;
        filechannel = (new RandomAccessFile(s, "r")).getChannel();
        obj = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)filechannel.size());
        if (((ByteBuffer) (obj)).getInt() != 0x49950a81)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = readFromByteBuffer(((ByteBuffer) (obj)));
        filechannel.close();
        return ((PhraseTable) (obj));
        PhraseTable phrasetable;
        try
        {
            ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(s));
            phrasetable = (PhraseTable)objectinputstream.readObject();
            objectinputstream.close();
            filechannel.close();
        }
        catch (Exception exception)
        {
            throw new DecoderRuntimeException("PtFffFailed", exception, s);
        }
        return phrasetable;
    }

    public PhrasePair createIdentityPhrase(int i, double d)
    {
        return new PhrasePair(new int[] {
            i
        }, d);
    }

    public PhrasePair createOOVPhrase(int i)
    {
        return createIdentityPhrase(i, oovCost);
    }

    public abstract List getPhrases(int ai[]);

    public abstract List getPhrases(int ai[], int i, int j);

    public int maxPhraseLen()
    {
        return maxPhraseLen;
    }

    public double oovCost()
    {
        return oovCost;
    }

    public void setMaxPhraseLen(int i)
    {
        maxPhraseLen = i;
    }

    public void setOovCost(double d)
    {
        oovCost = d;
    }

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);

    public void writeToFile(String s)
    {
        writeToFile(s, false);
    }

    public void writeToFile(String s, boolean flag)
    {
        if (flag)
        {
            try
            {
                s = new RandomAccessFile(s, "rw");
                FileChannel filechannel = s.getChannel();
                java.nio.MappedByteBuffer mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 0x1dcd6500L);
                mappedbytebuffer.putInt(0x49950a81);
                writeToByteBuffer(mappedbytebuffer);
                filechannel.truncate(mappedbytebuffer.position());
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        s = new ObjectOutputStream(new FileOutputStream(s));
        s.writeObject(this);
        s.close();
        return;
    }

}
