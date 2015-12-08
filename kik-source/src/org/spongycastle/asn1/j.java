// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package org.spongycastle.asn1:
//            i, ASN1InputStream

final class j
{

    private static final long a = Runtime.getRuntime().maxMemory();

    static int a(int k)
    {
        int i1 = 1;
        boolean flag = true;
        if (k > 127)
        {
            i1 = 1;
            int l = k;
            k = i1;
            do
            {
                l >>>= 8;
                if (l == 0)
                {
                    break;
                }
                k++;
            } while (true);
            l = (k - 1) * 8;
            k = ((flag) ? 1 : 0);
            do
            {
                i1 = k;
                if (l < 0)
                {
                    break;
                }
                k++;
                l -= 8;
            } while (true);
        }
        return i1;
    }

    static int a(InputStream inputstream)
    {
        if (inputstream instanceof i)
        {
            return ((i)inputstream).a();
        }
        if (inputstream instanceof ASN1InputStream)
        {
            return ((ASN1InputStream)inputstream).a();
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
        if (a > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)a;
        }
    }

    static int b(int k)
    {
        int l = 4;
        if (k >= 31)
        {
            if (k < 128)
            {
                return 2;
            }
            byte abyte0[] = new byte[5];
            abyte0[4] = (byte)(k & 0x7f);
            int i1;
            int j1;
            do
            {
                i1 = k >> 7;
                j1 = l - 1;
                abyte0[j1] = (byte)(i1 & 0x7f | 0x80);
                l = j1;
                k = i1;
            } while (i1 > 127);
            return (5 - j1) + 1;
        } else
        {
            return 1;
        }
    }

}
