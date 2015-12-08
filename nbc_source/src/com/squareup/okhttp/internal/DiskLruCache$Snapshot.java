// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.IOException;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache, Util

public final class <init>
    implements Closeable
{

    private final String key;
    private final long lengths[];
    private final long sequenceNumber;
    private final Source sources[];
    final DiskLruCache this$0;

    public void close()
    {
        Source asource[] = sources;
        int j = asource.length;
        for (int i = 0; i < j; i++)
        {
            Util.closeQuietly(asource[i]);
        }

    }

    public sources edit()
        throws IOException
    {
        return DiskLruCache.access$2200(DiskLruCache.this, key, sequenceNumber);
    }

    public long getLength(int i)
    {
        return lengths[i];
    }

    public Source getSource(int i)
    {
        return sources[i];
    }

    public String key()
    {
        return key;
    }


    private (String s, long l, Source asource[], long al[])
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        sequenceNumber = l;
        sources = asource;
        lengths = al;
    }

    lengths(String s, long l, Source asource[], long al[], lengths lengths1)
    {
        this(s, l, asource, al);
    }
}
