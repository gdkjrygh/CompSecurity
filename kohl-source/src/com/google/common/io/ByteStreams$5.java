// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            InputSupplier, ByteStreams, MultiInputStream

static final class val.suppliers
    implements InputSupplier
{

    final Iterable val$suppliers;

    public InputStream getInput()
        throws IOException
    {
        return new MultiInputStream(val$suppliers.iterator());
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    am(Iterable iterable)
    {
        val$suppliers = iterable;
        super();
    }
}
