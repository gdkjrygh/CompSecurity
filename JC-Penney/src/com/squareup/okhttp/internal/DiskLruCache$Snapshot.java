// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import c.ad;
import java.io.Closeable;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util, DiskLruCache

public final class <init>
    implements Closeable
{

    private final String key;
    private final long lengths[];
    private final long sequenceNumber;
    private final ad sources[];
    final DiskLruCache this$0;

    public void close()
    {
        ad aad[] = sources;
        int j = aad.length;
        for (int i = 0; i < j; i++)
        {
            Util.closeQuietly(aad[i]);
        }

    }

    public sources edit()
    {
        return DiskLruCache.access$2200(DiskLruCache.this, key, sequenceNumber);
    }

    public long getLength(int i)
    {
        return lengths[i];
    }

    public ad getSource(int i)
    {
        return sources[i];
    }

    public String key()
    {
        return key;
    }


    private (String s, long l, ad aad[], long al[])
    {
        this$0 = DiskLruCache.this;
        super();
        key = s;
        sequenceNumber = l;
        sources = aad;
        lengths = al;
    }

    lengths(String s, long l, ad aad[], long al[], lengths lengths1)
    {
        this(s, l, aad, al);
    }
}
