// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;


// Referenced classes of package com.dropbox.client2.exception:
//            DropboxIOException

public class DropboxProxyChangeException extends DropboxIOException
{

    public DropboxProxyChangeException()
    {
        super("Proxy may have been updated, try request again.");
    }
}
