// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.converter;

import java.io.IOException;
import java.io.OutputStream;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.converter:
//            GsonConverter

private static class mimeType
    implements TypedOutput
{

    private final byte jsonBytes[];
    private final String mimeType;

    public String fileName()
    {
        return null;
    }

    public long length()
    {
        return (long)jsonBytes.length;
    }

    public String mimeType()
    {
        return mimeType;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(jsonBytes);
    }

    (byte abyte0[], String s)
    {
        jsonBytes = abyte0;
        mimeType = (new StringBuilder()).append("application/json; charset=").append(s).toString();
    }
}
