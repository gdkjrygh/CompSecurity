// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            OutputSupplier, Files

static final class val.append
    implements OutputSupplier
{

    final boolean val$append;
    final File val$file;

    public FileOutputStream getOutput()
        throws IOException
    {
        return new FileOutputStream(val$file, val$append);
    }

    public volatile Object getOutput()
        throws IOException
    {
        return getOutput();
    }

    pplier(File file1, boolean flag)
    {
        val$file = file1;
        val$append = flag;
        super();
    }
}
