// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;

import javax.net.ssl.SSLException;

// Referenced classes of package com.dropbox.client2.exception:
//            DropboxIOException

public class DropboxSSLException extends DropboxIOException
{

    private static final long serialVersionUID = 1L;

    public DropboxSSLException(SSLException sslexception)
    {
        super(sslexception);
    }
}
