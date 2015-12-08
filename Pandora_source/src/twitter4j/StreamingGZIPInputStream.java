// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

final class StreamingGZIPInputStream extends GZIPInputStream
{

    private final InputStream wrapped;

    public StreamingGZIPInputStream(InputStream inputstream)
        throws IOException
    {
        super(inputstream);
        wrapped = inputstream;
    }

    public int available()
        throws IOException
    {
        return wrapped.available();
    }
}
