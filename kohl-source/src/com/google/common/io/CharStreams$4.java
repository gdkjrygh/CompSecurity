// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.common.io:
//            InputSupplier, CharStreams, MultiReader

static final class val.suppliers
    implements InputSupplier
{

    final Iterable val$suppliers;

    public Reader getInput()
        throws IOException
    {
        return new MultiReader(val$suppliers.iterator());
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    (Iterable iterable)
    {
        val$suppliers = iterable;
        super();
    }
}
