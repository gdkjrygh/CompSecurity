// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

public final class otk extends UploadDataProvider
{

    private final byte a[];
    private int b;

    public otk(byte abyte0[])
    {
        a = (byte[])p.a(abyte0);
        b = 0;
    }

    public final long a()
    {
        return (long)a.length;
    }

    public final void a(UploadDataSink uploaddatasink)
    {
        b = 0;
        uploaddatasink.a();
    }

    public final void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer)
    {
        int i = Math.min(bytebuffer.remaining(), a.length - b);
        bytebuffer.put(a, b, i);
        b = i + b;
        uploaddatasink.a(false);
    }
}
