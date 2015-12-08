// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.entity.AbstractHttpEntity;

final class ole extends AbstractHttpEntity
{

    private final InputStream a;

    public ole(InputStream inputstream)
    {
        a = inputstream;
    }

    public final void consumeContent()
    {
        a.close();
    }

    public final InputStream getContent()
    {
        return a;
    }

    public final long getContentLength()
    {
        return -1L;
    }

    public final boolean isRepeatable()
    {
        return true;
    }

    public final boolean isStreaming()
    {
        return false;
    }

    public final void writeTo(OutputStream outputstream)
    {
        byte abyte0[] = new byte[0x20000];
_L1:
        int i = a.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        Object obj;
        obj;
        p.a(outputstream);
        p.a(a);
        return;
        obj;
        p.a(outputstream);
        p.a(a);
        throw obj;
    }
}
