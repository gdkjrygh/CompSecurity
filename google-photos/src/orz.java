// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public final class orz
    implements qsw
{

    private final Uri a;
    private final FileChannel b;

    private orz(FileChannel filechannel, Uri uri)
    {
        a = uri;
        b = filechannel;
    }

    public static qsw a(Context context, Uri uri)
    {
        return new orz((new android.content.res.AssetFileDescriptor.AutoCloseInputStream(context.getContentResolver().openAssetFileDescriptor(uri, "r"))).getChannel(), uri);
    }

    public final int a(ByteBuffer bytebuffer)
    {
        return b.read(bytebuffer);
    }

    public final long a()
    {
        return b.size();
    }

    public final long a(long l, long l1, WritableByteChannel writablebytechannel)
    {
        return b.transferTo(l, l1, writablebytechannel);
    }

    public final ByteBuffer a(long l, long l1)
    {
        int i;
        if (l1 > 0x7fffffffL || l1 < 0L)
        {
            throw new IOException((new StringBuilder(62)).append("ByteBuffer cannot perform mapping of size ").append(l1).toString());
        }
        i = (int)l1;
        ByteBuffer bytebuffer;
        bytebuffer = ByteBuffer.allocate(i);
        b.position(l);
        qux.a(b, bytebuffer);
        return bytebuffer;
        Object obj;
        obj;
_L2:
        try
        {
            b.close();
        }
        catch (Exception exception) { }
        throw new IOException(((Throwable) (obj)));
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(long l)
    {
        b.position(l);
    }

    public final long b()
    {
        return b.position();
    }

    public final void close()
    {
        b.close();
    }

    public final String toString()
    {
        return a.toString();
    }
}
