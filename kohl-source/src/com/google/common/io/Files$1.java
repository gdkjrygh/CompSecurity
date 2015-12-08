// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            InputSupplier, Files

static final class val.file
    implements InputSupplier
{

    final File val$file;

    public FileInputStream getInput()
        throws IOException
    {
        return new FileInputStream(val$file);
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    plier(File file1)
    {
        val$file = file1;
        super();
    }
}
