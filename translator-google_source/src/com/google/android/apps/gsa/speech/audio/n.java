// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.speech.audio.a.a;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            m

final class n extends a
{

    private final m a;

    n(m m1)
    {
        a = m1;
    }

    public final void close()
    {
        m m1;
        a.a(0);
        m1 = a;
        try
        {
            m1.a.close();
        }
        catch (IOException ioexception)
        {
            String s = String.valueOf(ioexception);
            L.a("Tee", (new StringBuilder(String.valueOf(s).length() + 33)).append("IOException closing audio track: ").append(s).toString(), new Object[0]);
        }
        m1;
        JVM INSTR monitorenter ;
        m1.c = true;
        m1.notifyAll();
        m1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        j = a.a(abyte0, i, j);
        i = j;
        if (j == 0)
        {
            i = -1;
        }
        return i;
    }
}
