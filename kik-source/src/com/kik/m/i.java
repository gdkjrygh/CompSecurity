// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

final class i
    implements Callable
{

    final HttpEntity a;
    final h.a b;

    i(HttpEntity httpentity, h.a a1)
    {
        a = httpentity;
        b = a1;
        super();
    }

    private byte[] a()
    {
        InputStream inputstream;
        Object obj;
        byte abyte0[];
        inputstream = a.getContent();
        long l1 = a.getContentLength();
        if (inputstream == null)
        {
            return null;
        }
        long l = l1;
        if (l1 < 0L)
        {
            l = 8192L;
        }
        obj = new ByteArrayBuffer((int)l);
        abyte0 = new byte[8192];
_L1:
        Exception exception;
        int j;
        try
        {
            j = inputstream.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            inputstream.close();
            return null;
        }
        finally
        {
            inputstream.close();
        }
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        b.a(((ByteArrayBuffer) (obj)), abyte0, j);
          goto _L1
        inputstream.close();
        return ((ByteArrayBuffer) (obj)).toByteArray();
        throw exception;
    }

    public final Object call()
    {
        return a();
    }
}
