// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            OutputSupplier, CharStreams

static final class val.charset
    implements OutputSupplier
{

    final Charset val$charset;
    final OutputSupplier val$out;

    public OutputStreamWriter getOutput()
        throws IOException
    {
        return new OutputStreamWriter((OutputStream)val$out.getOutput(), val$charset);
    }

    public volatile Object getOutput()
        throws IOException
    {
        return getOutput();
    }

    (OutputSupplier outputsupplier, Charset charset1)
    {
        val$out = outputsupplier;
        val$charset = charset1;
        super();
    }
}
