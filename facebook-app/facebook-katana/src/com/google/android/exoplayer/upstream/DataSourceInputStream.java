// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSource, DataSpec

public final class DataSourceInputStream extends InputStream
{

    private final DataSource a;
    private final DataSpec b;
    private final byte c[] = new byte[1];
    private boolean d;
    private boolean e;

    public DataSourceInputStream(DataSource datasource, DataSpec dataspec)
    {
        d = false;
        e = false;
        a = datasource;
        b = dataspec;
    }

    private void b()
    {
        if (!d)
        {
            a.a(b);
            d = true;
        }
    }

    public final void a()
    {
        b();
    }

    public final void close()
    {
        if (!e)
        {
            a.a();
            e = true;
        }
    }

    public final int read()
    {
        if (read(c) == -1)
        {
            return -1;
        } else
        {
            return c[0] & 0xff;
        }
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        b();
        return a.a(abyte0, i, j);
    }

    public final long skip(long l)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        b();
        return super.skip(l);
    }
}
