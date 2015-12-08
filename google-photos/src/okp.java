// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class okp extends InputStream
    implements HttpUrlRequestListener
{

    private final HttpUrlRequest a;
    private final RandomAccessFile b;
    private final InputStream c;
    private final long d;
    private final long e;
    private long f;

    public okp(Context context, File file, String s, long l, long l1, 
            Map map)
    {
        if (l < 0L || l1 != -1L && l > l1)
        {
            throw new IllegalArgumentException("Invalid stream limits");
        }
        f = l;
        d = l1;
        if (file == null)
        {
            l = 0L;
        } else
        {
            l = file.length();
        }
        e = l;
        if (f < e)
        {
            b = new RandomAccessFile(file, "r");
            b.seek(f);
        } else
        {
            b = null;
        }
        if (s != null)
        {
            file = Pipe.open();
            c = Channels.newInputStream(file.source());
            a = npi.a(context, s, 4, map, file.sink(), this);
            l = Math.max(e, f);
            if (l != 0L)
            {
                (new StringBuilder(41)).append("Starting request at: ").append(l);
                a.a(l);
            }
            a.g();
            return;
        } else
        {
            a = null;
            c = null;
            return;
        }
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
    }

    public final void close()
    {
        super.close();
        if (c != null)
        {
            c.close();
        }
        if (b != null)
        {
            b.close();
        }
    }

    public final int read()
    {
        throw new UnsupportedOperationException();
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (d != -1L && f >= d)
        {
            j = -1;
        } else
        {
            if (f < e)
            {
                long l1 = e;
                long l = l1;
                if (d != -1L)
                {
                    l = l1;
                    if (d < l1)
                    {
                        l = d;
                    }
                }
                j = Math.min((int)(l - f), j);
                i = b.read(abyte0, i, j);
            } else
            if (c != null)
            {
                int k = j;
                if (d != -1L)
                {
                    k = Math.min((int)(d - f), j);
                }
                i = c.read(abyte0, i, k);
            } else
            {
                i = -1;
            }
            j = i;
            if (i != -1)
            {
                f = f + (long)i;
                return i;
            }
        }
        return j;
    }
}
