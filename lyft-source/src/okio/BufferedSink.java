// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            Sink, Buffer, ByteString, Source

public interface BufferedSink
    extends Sink
{

    public abstract Buffer buffer();

    public abstract BufferedSink emit();

    public abstract BufferedSink emitCompleteSegments();

    public abstract OutputStream outputStream();

    public abstract BufferedSink write(ByteString bytestring);

    public abstract BufferedSink write(Source source, long l);

    public abstract BufferedSink write(byte abyte0[]);

    public abstract BufferedSink write(byte abyte0[], int i, int j);

    public abstract long writeAll(Source source);

    public abstract BufferedSink writeByte(int i);

    public abstract BufferedSink writeDecimalLong(long l);

    public abstract BufferedSink writeHexadecimalUnsignedLong(long l);

    public abstract BufferedSink writeInt(int i);

    public abstract BufferedSink writeIntLe(int i);

    public abstract BufferedSink writeLong(long l);

    public abstract BufferedSink writeLongLe(long l);

    public abstract BufferedSink writeShort(int i);

    public abstract BufferedSink writeShortLe(int i);

    public abstract BufferedSink writeString(String s, Charset charset);

    public abstract BufferedSink writeUtf8(String s);
}
