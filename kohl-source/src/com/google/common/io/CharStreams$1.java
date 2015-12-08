// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.StringReader;

// Referenced classes of package com.google.common.io:
//            InputSupplier, CharStreams

static final class val.value
    implements InputSupplier
{

    final String val$value;

    public StringReader getInput()
    {
        return new StringReader(val$value);
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    (String s)
    {
        val$value = s;
        super();
    }
}
