// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            c

public abstract class InputDecorator
    implements Serializable
{

    private static final long serialVersionUID = 1L;

    public InputDecorator()
    {
    }

    public abstract InputStream a(c c, InputStream inputstream)
        throws IOException;

    public abstract InputStream a(c c, byte abyte0[], int i, int j)
        throws IOException;

    public abstract Reader a(c c, Reader reader)
        throws IOException;
}
