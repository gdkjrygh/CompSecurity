// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final BufferedReader val$reader;
    final Writer val$writer;

    public HttpRequest run()
        throws IOException
    {
        return copy(val$reader, val$writer);
    }

    public volatile Object run()
        throws tpRequestException, IOException
    {
        return run();
    }

    tpRequestException(BufferedReader bufferedreader, Writer writer1)
    {
        this$0 = final_httprequest;
        val$reader = bufferedreader;
        val$writer = writer1;
        super(final_closeable, Z.this);
    }
}
