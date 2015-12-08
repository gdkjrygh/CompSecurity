// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.speech.b.a;
import com.google.common.a.c;
import com.google.common.base.p;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            l

public final class k extends Thread
{

    public boolean a;
    private final InputStream b;
    private final int c;
    private final l d;
    private final a e;

    protected k(InputStream inputstream, int i, l l1, a a1, boolean flag)
    {
        super("MicrophoneReader");
        b = inputstream;
        c = i;
        d = l1;
        e = a1;
        a = flag;
    }

    public final void run()
    {
        byte abyte0[];
        boolean flag;
        p.a(b);
        abyte0 = new byte[c];
        flag = true;
_L5:
        Exception exception;
        boolean flag1;
        int i;
        try
        {
            i = b.read(abyte0);
        }
        catch (IOException ioexception)
        {
            com.google.common.a.c.a(b);
            return;
        }
        finally
        {
            com.google.common.a.c.a(b);
        }
        if (i == -1) goto _L2; else goto _L1
_L1:
        if (Thread.currentThread().isInterrupted()) goto _L2; else goto _L3
_L3:
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (e != null)
        {
            e.a();
        }
        break MISSING_BLOCK_LABEL_128;
_L7:
        flag = flag1;
        if (d == null) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (!a) goto _L5; else goto _L6
_L6:
        d.a(abyte0, 0, i);
        flag = flag1;
          goto _L5
_L2:
        com.google.common.a.c.a(b);
        return;
        throw exception;
        flag1 = false;
          goto _L7
    }
}
