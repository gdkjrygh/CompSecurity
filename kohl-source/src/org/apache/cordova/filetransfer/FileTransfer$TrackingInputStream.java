// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

private static abstract class  extends FilterInputStream
{

    public abstract long getTotalRawBytesRead();

    public (InputStream inputstream)
    {
        super(inputstream);
    }
}
