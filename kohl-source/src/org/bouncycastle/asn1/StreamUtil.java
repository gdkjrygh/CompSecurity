// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package org.bouncycastle.asn1:
//            LimitedInputStream, ASN1InputStream

class StreamUtil
{

    private static final long MAX_MEMORY = Runtime.getRuntime().maxMemory();

    StreamUtil()
    {
    }

    static int calculateBodyLength(int i)
    {
        int j = 1;
        boolean flag = true;
        if (i > 127)
        {
            int k = 1;
            j = i;
            i = k;
            do
            {
                j >>>= 8;
                if (j == 0)
                {
                    break;
                }
                i++;
            } while (true);
            k = (i - 1) * 8;
            i = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (k < 0)
                {
                    break;
                }
                k -= 8;
                i++;
            } while (true);
        }
        return j;
    }

    static int calculateTagLength(int i)
        throws IOException
    {
        if (i >= 31)
        {
            if (i < 128)
            {
                return 2;
            }
            byte abyte0[] = new byte[5];
            int j = abyte0.length - 1;
            abyte0[j] = (byte)(i & 0x7f);
            int k;
            int l;
            do
            {
                k = i >> 7;
                l = j - 1;
                abyte0[l] = (byte)(k & 0x7f | 0x80);
                j = l;
                i = k;
            } while (k > 127);
            return (abyte0.length - l) + 1;
        } else
        {
            return 1;
        }
    }

    static int findLimit(InputStream inputstream)
    {
        if (inputstream instanceof LimitedInputStream)
        {
            return ((LimitedInputStream)inputstream).getRemaining();
        }
        if (inputstream instanceof ASN1InputStream)
        {
            return ((ASN1InputStream)inputstream).getLimit();
        }
        if (inputstream instanceof ByteArrayInputStream)
        {
            return ((ByteArrayInputStream)inputstream).available();
        }
        if (!(inputstream instanceof FileInputStream))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l = ((FileInputStream)inputstream).getChannel().size();
        if (l < 0x7fffffffL)
        {
            return (int)l;
        }
        break MISSING_BLOCK_LABEL_75;
        inputstream;
        if (MAX_MEMORY > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)MAX_MEMORY;
        }
    }

}
