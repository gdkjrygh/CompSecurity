// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache, Util

public final class <init>
    implements Closeable
{

    private final InputStream ins[];
    private final String key;
    private final long lengths[];
    private final long sequenceNumber;
    final DiskLruCache this$0;

    public void close()
    {
        InputStream ainputstream[] = ins;
        int j = ainputstream.length;
        for (int i = 0; i < j; i++)
        {
            Util.closeQuietly(ainputstream[i]);
        }

    }

    public ins edit()
        throws IOException
    {
        return DiskLruCache.access$1600(DiskLruCache.this, key, sequenceNumber);
    }

    public InputStream getInputStream(int i)
    {
        return ins[i];
    }

    public long getLength(int i)
    {
        return lengths[i];
    }

    public String getString(int i)
        throws IOException
    {
        return DiskLruCache.access$1700(getInputStream(i));
    }

    private (String s, long l, InputStream ainputstream[], long al[])
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        sequenceNumber = l;
        ins = ainputstream;
        lengths = al;
    }

    lengths(String s, long l, InputStream ainputstream[], long al[], lengths lengths1)
    {
        this(s, l, ainputstream, al);
    }
}
