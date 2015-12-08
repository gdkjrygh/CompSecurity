// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

public abstract class InputDecorator
    implements Serializable
{

    private static final long serialVersionUID = 1L;

    public InputDecorator()
    {
    }

    public abstract InputStream decorate(IOContext iocontext, InputStream inputstream)
        throws IOException;

    public abstract InputStream decorate(IOContext iocontext, byte abyte0[], int i, int j)
        throws IOException;

    public abstract Reader decorate(IOContext iocontext, Reader reader)
        throws IOException;
}
