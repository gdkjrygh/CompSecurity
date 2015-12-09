// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.InputStream;

public final class cvu
    implements Closeable
{

    public final InputStream a[];

    private cvu(InputStream ainputstream[])
    {
        a = ainputstream;
    }

    cvu(InputStream ainputstream[], byte byte0)
    {
        this(ainputstream);
    }

    public final void close()
    {
        InputStream ainputstream[] = a;
        int j = ainputstream.length;
        for (int i = 0; i < j; i++)
        {
            cvw.a(ainputstream[i]);
        }

    }
}
