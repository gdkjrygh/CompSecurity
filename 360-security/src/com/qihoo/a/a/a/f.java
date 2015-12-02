// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class f
{

    public static final void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    public static final void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static final byte[] b(InputStream inputstream)
        throws NoSuchAlgorithmException, IOException
    {
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        byte abyte0[] = new byte[4096];
        do
        {
            int i;
            do
            {
                i = inputstream.read(abyte0);
                if (i < 0)
                {
                    return messagedigest.digest();
                }
            } while (i <= 0);
            messagedigest.update(abyte0, 0, i);
        } while (true);
    }
}
