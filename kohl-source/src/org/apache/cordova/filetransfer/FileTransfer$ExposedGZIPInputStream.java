// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

private static class I extends GZIPInputStream
{

    public Inflater getInflater()
    {
        return inf;
    }

    public I(InputStream inputstream)
        throws IOException
    {
        super(inputstream);
    }
}
