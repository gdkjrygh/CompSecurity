// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            InputSupplier, ByteStreams, LimitInputStream, Closeables

static final class val.length
    implements InputSupplier
{

    final long val$length;
    final long val$offset;
    final InputSupplier val$supplier;

    public InputStream getInput()
        throws IOException
    {
        InputStream inputstream = (InputStream)val$supplier.getInput();
        if (val$offset > 0L)
        {
            try
            {
                ByteStreams.skipFully(inputstream, val$offset);
            }
            catch (IOException ioexception)
            {
                Closeables.closeQuietly(inputstream);
                throw ioexception;
            }
        }
        return new LimitInputStream(inputstream, val$length);
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    am(InputSupplier inputsupplier, long l, long l1)
    {
        val$supplier = inputsupplier;
        val$offset = l;
        val$length = l1;
        super();
    }
}
