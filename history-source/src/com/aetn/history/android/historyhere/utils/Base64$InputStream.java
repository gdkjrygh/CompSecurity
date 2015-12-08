// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.aetn.history.android.historyhere.utils:
//            Base64

public static class decodabet extends FilterInputStream
{

    private boolean breakLines;
    private byte buffer[];
    private int bufferLength;
    private byte decodabet[];
    private boolean encode;
    private int lineLength;
    private int numSigBytes;
    private int options;
    private int position;

    public int read()
        throws IOException
    {
        return -1;
        byte abyte1[] = new byte[4];
        int j = 0;
        do
        {
label0:
            {
                int i1;
                if (j < 4)
                {
                    do
                    {
                        i1 = in.read();
                    } while (i1 >= 0 && decodabet[i1 & 0x7f] <= -5);
                    if (i1 >= 0)
                    {
                        break label0;
                    }
                }
                if (j == 4)
                {
                    numSigBytes = Base64.access$200(abyte1, 0, buffer, 0, options);
                    position = 0;
                } else
                if (j == 0)
                {
                    return -1;
                } else
                {
                    throw new IOException("Improperly padded Base64 input.");
                }
                continue;
            }
            abyte1[j] = (byte)i1;
            j++;
        } while (true);
        if (position < 0)
        {
            if (!encode)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            byte abyte0[] = new byte[3];
            int l = 0;
            int i = 0;
            do
            {
                if (i >= 3)
                {
                    break;
                }
                int j1 = in.read();
                if (j1 < 0)
                {
                    break;
                }
                abyte0[i] = (byte)j1;
                l++;
                i++;
            } while (true);
            if (l <= 0)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            Base64.access$100(abyte0, 0, l, buffer, 0, options);
            position = 0;
            numSigBytes = 4;
        }
        do
        {
            if (position >= 0)
            {
                if (position >= numSigBytes)
                {
                    return -1;
                }
                if (encode && breakLines && lineLength >= 76)
                {
                    lineLength = 0;
                    return 10;
                }
                lineLength = lineLength + 1;
                byte abyte2[] = buffer;
                int k = position;
                position = k + 1;
                k = abyte2[k];
                if (position >= bufferLength)
                {
                    position = -1;
                }
                return k & 0xff;
            }
            throw new IOException("Error in Base64 code reading stream.");
        } while (true);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int l;
label0:
        {
            int k = 0;
            do
            {
                l = k;
                if (k >= j)
                {
                    break label0;
                }
                l = read();
                if (l < 0)
                {
                    break;
                }
                abyte0[i + k] = (byte)l;
                k++;
            } while (true);
            l = k;
            if (k == 0)
            {
                l = -1;
            }
        }
        return l;
    }

    public (InputStream inputstream)
    {
        this(inputstream, 0);
    }

    public <init>(InputStream inputstream, int i)
    {
        boolean flag1 = true;
        super(inputstream);
        options = i;
        int j;
        boolean flag;
        if ((i & 8) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        breakLines = flag;
        if ((i & 1) > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        encode = flag;
        if (encode)
        {
            j = 4;
        } else
        {
            j = 3;
        }
        bufferLength = j;
        buffer = new byte[bufferLength];
        position = -1;
        lineLength = 0;
        decodabet = Base64.access$000(i);
    }
}
