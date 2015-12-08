// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.util:
//            StreamingContent, LoggingOutputStream, LoggingByteArrayOutputStream

public final class LoggingStreamingContent
    implements StreamingContent
{

    private final StreamingContent content;
    private final int contentLoggingLimit;
    private final Logger logger;
    private final Level loggingLevel;

    public LoggingStreamingContent(StreamingContent streamingcontent, Logger logger1, Level level, int i)
    {
        content = streamingcontent;
        logger = logger1;
        loggingLevel = level;
        contentLoggingLimit = i;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        LoggingOutputStream loggingoutputstream = new LoggingOutputStream(outputstream, logger, loggingLevel, contentLoggingLimit);
        content.writeTo(loggingoutputstream);
        loggingoutputstream.getLogStream().close();
        outputstream.flush();
        return;
        outputstream;
        loggingoutputstream.getLogStream().close();
        throw outputstream;
    }
}
