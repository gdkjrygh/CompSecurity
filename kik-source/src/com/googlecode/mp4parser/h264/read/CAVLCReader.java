// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.BTree;
import com.googlecode.mp4parser.h264.CharCache;
import com.googlecode.mp4parser.h264.Debug;
import java.io.InputStream;

// Referenced classes of package com.googlecode.mp4parser.h264.read:
//            BitstreamReader

public class CAVLCReader extends BitstreamReader
{

    public CAVLCReader(InputStream inputstream)
    {
        super(inputstream);
    }

    private int readUE()
    {
        int j = 0;
        int i = 0;
        do
        {
            if (read1Bit() != 0)
            {
                if (i > 0)
                {
                    long l = readNBit(i);
                    j = (int)((long)((1 << i) - 1) + l);
                }
                return j;
            }
            i++;
        } while (true);
    }

    private void trace(String s, String s1)
    {
        StringBuilder stringbuilder;
        int i;
        boolean flag;
        int j;
        flag = false;
        stringbuilder = new StringBuilder();
        String s2 = String.valueOf(BitstreamReader.bitsRead - debugBits.length());
        j = s2.length();
        stringbuilder.append((new StringBuilder("@")).append(s2).toString());
        i = 0;
_L3:
        if (i < 8 - j) goto _L2; else goto _L1
_L1:
        int k;
        stringbuilder.append(s);
        j = stringbuilder.length();
        k = debugBits.length();
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= 100 - j - k)
        {
            stringbuilder.append(debugBits);
            stringbuilder.append((new StringBuilder(" (")).append(s1).append(")").toString());
            debugBits.clear();
            Debug.println(stringbuilder.toString());
            return;
        }
        break MISSING_BLOCK_LABEL_173;
_L2:
        stringbuilder.append(' ');
        i++;
          goto _L3
        stringbuilder.append(' ');
        i++;
          goto _L4
    }

    public byte[] read(int i)
    {
        byte abyte0[] = new byte[i];
        int j = 0;
        do
        {
            if (j >= i)
            {
                return abyte0;
            }
            abyte0[j] = (byte)readByte();
            j++;
        } while (true);
    }

    public boolean readAE()
    {
        throw new UnsupportedOperationException("Stan");
    }

    public int readAEI()
    {
        throw new UnsupportedOperationException("Stan");
    }

    public boolean readBool(String s)
    {
        String s1;
        boolean flag;
        if (read1Bit() == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        trace(s, s1);
        return flag;
    }

    public Object readCE(BTree btree, String s)
    {
        Object obj;
        do
        {
            btree = btree.down(read1Bit());
            if (btree == null)
            {
                throw new RuntimeException("Illegal code");
            }
            obj = btree.getValue();
        } while (obj == null);
        trace(s, obj.toString());
        return obj;
    }

    public int readME(String s)
    {
        return readUE(s);
    }

    public long readNBit(int i, String s)
    {
        long l = readNBit(i);
        trace(s, String.valueOf(l));
        return l;
    }

    public int readSE(String s)
    {
        int i = readUE();
        i = ((i & 1) + (i >> 1)) * (((i & 1) << 1) - 1);
        trace(s, String.valueOf(i));
        return i;
    }

    public int readTE(int i)
    {
        if (i > 1)
        {
            return readUE();
        } else
        {
            return ~read1Bit() & 1;
        }
    }

    public void readTrailingBits()
    {
        read1Bit();
        readRemainingByte();
    }

    public int readU(int i, String s)
    {
        return (int)readNBit(i, s);
    }

    public int readUE(String s)
    {
        int i = readUE();
        trace(s, String.valueOf(i));
        return i;
    }

    public int readZeroBitCount(String s)
    {
        int i = 0;
        do
        {
            if (read1Bit() != 0)
            {
                trace(s, String.valueOf(i));
                return i;
            }
            i++;
        } while (true);
    }
}
