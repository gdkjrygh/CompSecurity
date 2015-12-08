// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.c.a;

import com.google.android.apps.gsa.a.c.d;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.shared.util.e;
import com.google.android.apps.gsa.speech.a.b;
import com.google.android.apps.gsa.speech.audio.AudioUtils;
import com.google.f.e.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class a
    implements d
{

    private final InputStream a;
    private final byte b[];
    private final com.google.android.apps.gsa.shared.util.common.b c;
    private boolean d;

    public a(InputStream inputstream, int i, b b1)
    {
        inputstream = AudioUtils.a(inputstream, i);
        if (i == 3)
        {
            i = b1.a(435);
        } else
        if (i == 9)
        {
            i = b1.a(456);
        } else
        {
            throw new RuntimeException((new StringBuilder(36)).append("Unsupported AMR encoding:").append(i).toString());
        }
        this(inputstream, new byte[i]);
    }

    private a(InputStream inputstream, byte abyte0[])
    {
        a = inputstream;
        b = abyte0;
        c = new com.google.android.apps.gsa.shared.util.common.b();
    }

    private void a()
    {
        InputStream inputstream;
        if (d)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        d = true;
        inputstream = a;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        inputstream.close();
        return;
        IOException ioexception;
        ioexception;
        try
        {
            L.a(5, "IoUtils", "IOException thrown while closing Closeable.", new Object[0]);
            return;
        }
        catch (IOException ioexception1)
        {
            throw new AssertionError(ioexception1);
        }
    }

    public final l b()
    {
        if (d)
        {
            return null;
        }
        int i = e.a(a, b, 0, b.length);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Object obj;
        com.google.protobuf.nano.c c1;
        com.google.f.e.b b1;
        byte abyte0[];
        abyte0 = b;
        obj = com.google.android.apps.gsa.a.b.b.a();
        c1 = com.google.f.e.b.a;
        b1 = new com.google.f.e.b();
        abyte0 = Arrays.copyOfRange(abyte0, 0, i);
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a();
            }
            throw new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.InputStreamException(((Throwable) (obj)), 0x2000b);
        }
        b1.d = abyte0;
        b1.c = b1.c | 1;
        ((l) (obj)).setExtension(c1, b1);
        return ((l) (obj));
        a();
        return null;
    }

    public final void close()
    {
        a();
    }
}
