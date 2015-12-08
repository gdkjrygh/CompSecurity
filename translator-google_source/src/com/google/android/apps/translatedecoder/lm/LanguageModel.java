// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.lm;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.b;
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

// Referenced classes of package com.google.android.apps.translatedecoder.lm:
//            ImplictTrieBasedLm

public abstract class LanguageModel
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xb5735f6a01e2c389L;
    public b config;
    int lmOrder;
    transient int maxNumCachedNgrams;
    boolean noBackoff;
    double oovCost;
    transient boolean simulateProdlm;
    transient int unkId;

    public LanguageModel()
    {
        simulateProdlm = false;
        unkId = -1;
        maxNumCachedNgrams = 0;
    }

    public static LanguageModel readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ImplictTrieBasedLm.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(27)).append("unknown class id").append(i).toString());
        }
    }

    public static LanguageModel readFromFile(String s)
    {
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("LmRffNullLmFile");
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
        return ((LanguageModel) (obj));
        LanguageModel languagemodel;
        try
        {
            ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(s));
            languagemodel = (LanguageModel)objectinputstream.readObject();
            objectinputstream.close();
            filechannel.close();
        }
        catch (Exception exception)
        {
            throw new DecoderRuntimeException("LmRffFailed", exception, s);
        }
        return languagemodel;
    }

    public b config()
    {
        return config;
    }

    public int lmOrder()
    {
        return lmOrder;
    }

    public int maxNumCachedNgrams()
    {
        return maxNumCachedNgrams;
    }

    public abstract double ngramCost(List list);

    public abstract double ngramCost(int ai[], int i, int j, int ai1[]);

    public boolean noBackoff()
    {
        return noBackoff;
    }

    public double oovCost()
    {
        return oovCost;
    }

    public double sentenceCost(List list, int i)
    {
        double d;
        boolean flag;
        flag = false;
        d = 0.0D;
        if (list != null) goto _L2; else goto _L1
_L1:
        double d1 = d;
_L4:
        return d1;
_L2:
        int k = list.size();
        d1 = d;
        if (k <= 0)
        {
            continue;
        }
        d1 = d;
        int j;
        do
        {
            d = d1;
            j = ((flag) ? 1 : 0);
            if (i >= lmOrder)
            {
                break;
            }
            d = d1;
            j = ((flag) ? 1 : 0);
            if (i > k)
            {
                break;
            }
            d1 += ngramCost(list.subList(0, i));
            i++;
        } while (true);
        do
        {
            d1 = d;
            if (j > k - lmOrder)
            {
                continue;
            }
            d += ngramCost(list.subList(j, lmOrder + j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setConfig(b b)
    {
        config = b;
    }

    public void setLmOrder(int i)
    {
        lmOrder = i;
    }

    public void setMaxNumCachedNgrams(int i)
    {
        maxNumCachedNgrams = i;
    }

    public void setNoBackoff(boolean flag)
    {
        noBackoff = flag;
    }

    public void setOovCost(double d)
    {
        oovCost = d;
    }

    public void setSimulateProdlm(boolean flag)
    {
        simulateProdlm = flag;
    }

    public void setUnkId(int i)
    {
        unkId = i;
    }

    public boolean simulateProdlm()
    {
        return simulateProdlm;
    }

    public int unkId()
    {
        return unkId;
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
