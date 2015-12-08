// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;

import java.io.IOException;

// Referenced classes of package com.dropbox.client2.exception:
//            DropboxException

public class DropboxIOException extends DropboxException
{

    private static final long serialVersionUID = 2L;

    public DropboxIOException(IOException ioexception)
    {
        super(ioexception);
    }

    public DropboxIOException(String s)
    {
        super(s);
    }
}
