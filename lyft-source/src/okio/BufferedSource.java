// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            Source, Buffer, ByteString, Sink

public interface BufferedSource
    extends Source
{

    public abstract Buffer buffer();

    public abstract boolean exhausted();

    public abstract long indexOf(byte byte0);

    public abstract long indexOf(byte byte0, long l);

    public abstract long indexOfElement(ByteString bytestring);

    public abstract long indexOfElement(ByteString bytestring, long l);

    public abstract InputStream inputStream();

    public abstract int read(byte abyte0[]);

    public abstract int read(byte abyte0[], int i, int j);

    public abstract long readAll(Sink sink);

    public abstract byte readByte();

    public abstract byte[] readByteArray();

    public abstract byte[] readByteArray(long l);

    public abstract ByteString readByteString();

    public abstract ByteString readByteString(long l);

    public abstract long readDecimalLong();

    public abstract void readFully(Buffer buffer1, long l);

    public abstract void readFully(byte abyte0[]);

    public abstract long readHexadecimalUnsignedLong();

    public abstract int readInt();

    public abstract int readIntLe();

    public abstract long readLong();

    public abstract long readLongLe();

    public abstract short readShort();

    public abstract short readShortLe();

    public abstract String readString(long l, Charset charset);

    public abstract String readString(Charset charset);

    public abstract String readUtf8();

    public abstract String readUtf8(long l);

    public abstract String readUtf8Line();

    public abstract String readUtf8LineStrict();

    public abstract boolean request(long l);

    public abstract void require(long l);

    public abstract void skip(long l);
}
