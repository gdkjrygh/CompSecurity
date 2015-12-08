// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.io.IOException;
import java.io.InputStream;
import retrofit.mime.TypedInput;

// Referenced classes of package retrofit.client:
//            UrlConnectionClient

private static class <init>
    implements TypedInput
{

    private final long length;
    private final String mimeType;
    private final InputStream stream;

    public InputStream in()
        throws IOException
    {
        return stream;
    }

    public long length()
    {
        return length;
    }

    public String mimeType()
    {
        return mimeType;
    }

    private (String s, long l, InputStream inputstream)
    {
        mimeType = s;
        length = l;
        stream = inputstream;
    }

    stream(String s, long l, InputStream inputstream, stream stream1)
    {
        this(s, l, inputstream);
    }
}
