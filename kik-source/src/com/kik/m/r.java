// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class r
{

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
        long l = 0L;
        for (int i = inputstream.read(abyte0); i > 0; i = inputstream.read(abyte0))
        {
            outputstream.write(abyte0, 0, i);
            l += i;
        }

        return l;
    }

    public static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
        outputstream.printStackTrace();
        return;
    }
}
