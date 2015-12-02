// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.InputStream;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

public abstract class InputDecorator
{

    public InputDecorator()
    {
    }

    public abstract InputStream decorate(IOContext iocontext, InputStream inputstream);

    public abstract InputStream decorate(IOContext iocontext, byte abyte0[], int i, int j);

    public abstract Reader decorate(IOContext iocontext, Reader reader);
}
