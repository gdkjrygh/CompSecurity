// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp:
//            HttpResponseCache

static final class val.snapshot extends FilterInputStream
{

    final com.squareup.okhttp.internal.t val$snapshot;

    public void close()
        throws IOException
    {
        val$snapshot.close();
        super.close();
    }

    e.Snapshot(InputStream inputstream, com.squareup.okhttp.internal.t t)
    {
        val$snapshot = t;
        super(inputstream);
    }
}
