// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            Source, Buffer, ByteString

public interface BufferedSource
    extends Source
{

    public abstract Buffer buffer();

    public abstract boolean exhausted()
        throws IOException;

    public abstract long indexOf(byte byte0)
        throws IOException;

    public abstract InputStream inputStream();

    public abstract byte readByte()
        throws IOException;

    public abstract byte[] readByteArray()
        throws IOException;

    public abstract byte[] readByteArray(long l)
        throws IOException;

    public abstract ByteString readByteString(long l)
        throws IOException;

    public abstract long readDecimalLong()
        throws IOException;

    public abstract long readHexadecimalUnsignedLong()
        throws IOException;

    public abstract int readInt()
        throws IOException;

    public abstract int readIntLe()
        throws IOException;

    public abstract short readShort()
        throws IOException;

    public abstract short readShortLe()
        throws IOException;

    public abstract String readUtf8LineStrict()
        throws IOException;

    public abstract void require(long l)
        throws IOException;

    public abstract void skip(long l)
        throws IOException;
}
