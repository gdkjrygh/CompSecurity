// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.speech.audio.a.a;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            m

final class o extends a
{

    private m a;
    private final int b;

    o(m m1, int i)
    {
        a = m1;
        b = i;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.a(b);
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            throw new GsaIOException("Secondary Tee stream closed.", 0x60017);
        }
        break MISSING_BLOCK_LABEL_26;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        i = a.a(b, abyte0, i, j);
        j = i;
        if (i == 0)
        {
            j = -1;
        }
        this;
        JVM INSTR monitorexit ;
        return j;
    }
}
