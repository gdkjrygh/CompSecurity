// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            InputSupplier, ByteStreams

static final class val.len
    implements InputSupplier
{

    final byte val$b[];
    final int val$len;
    final int val$off;

    public ByteArrayInputStream getInput()
    {
        return new ByteArrayInputStream(val$b, val$off, val$len);
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    (byte abyte0[], int i, int j)
    {
        val$b = abyte0;
        val$off = i;
        val$len = j;
        super();
    }
}
