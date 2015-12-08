// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import com.skype.android.config.FileUtil;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Logger;

public class LoggingWriter extends Writer
{

    private StringWriter a;
    private Writer b;
    private Logger c;

    public LoggingWriter(Writer writer, Logger logger)
    {
        b = writer;
        c = logger;
        a = new StringWriter();
    }

    public void close()
        throws IOException
    {
        FileUtil.closeStream(b);
        FileUtil.closeStream(a);
        c.info(a.toString());
    }

    public void flush()
        throws IOException
    {
        FileUtil.flushStream(b);
        FileUtil.flushStream(a);
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        a.write(ac, i, j);
        b.write(ac, i, j);
    }
}
