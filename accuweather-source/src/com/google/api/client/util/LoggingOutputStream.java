// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.util:
//            LoggingByteArrayOutputStream

public class LoggingOutputStream extends FilterOutputStream
{

    private final LoggingByteArrayOutputStream logStream;

    public LoggingOutputStream(OutputStream outputstream, Logger logger, Level level, int i)
    {
        super(outputstream);
        logStream = new LoggingByteArrayOutputStream(logger, level, i);
    }

    public void close()
        throws IOException
    {
        logStream.close();
        super.close();
    }

    public final LoggingByteArrayOutputStream getLogStream()
    {
        return logStream;
    }

    public void write(int i)
        throws IOException
    {
        out.write(i);
        logStream.write(i);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        out.write(abyte0, i, j);
        logStream.write(abyte0, i, j);
    }
}
