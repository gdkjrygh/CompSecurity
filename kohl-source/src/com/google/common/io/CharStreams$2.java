// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            InputSupplier, CharStreams

static final class val.charset
    implements InputSupplier
{

    final Charset val$charset;
    final InputSupplier val$in;

    public InputStreamReader getInput()
        throws IOException
    {
        return new InputStreamReader((InputStream)val$in.getInput(), val$charset);
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    (InputSupplier inputsupplier, Charset charset1)
    {
        val$in = inputsupplier;
        val$charset = charset1;
        super();
    }
}
