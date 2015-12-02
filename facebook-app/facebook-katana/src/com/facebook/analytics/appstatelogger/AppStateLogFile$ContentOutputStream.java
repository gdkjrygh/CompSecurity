// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

// Referenced classes of package com.facebook.analytics.appstatelogger:
//            AppStateLogFile

class b extends OutputStream
{

    final AppStateLogFile a;
    private boolean b;

    private void a()
    {
        if (b)
        {
            throw new IOException("Stream is closed");
        } else
        {
            return;
        }
    }

    public void close()
    {
        a();
        flush();
        b = true;
        byte abyte0[] = AppStateLogFile.a(a).digest();
        AppStateLogFile.a(a, abyte0);
        AppStateLogFile.a(a, false);
    }

    public void flush()
    {
        a();
    }

    public void write(int i)
    {
        a();
        AppStateLogFile.b(a).write(i);
    }

    public void write(byte abyte0[])
    {
        a();
        AppStateLogFile.b(a).write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a();
        AppStateLogFile.b(a).write(abyte0, i, j);
    }

    public (AppStateLogFile appstatelogfile)
    {
        a = appstatelogfile;
        super();
        b = false;
    }
}
