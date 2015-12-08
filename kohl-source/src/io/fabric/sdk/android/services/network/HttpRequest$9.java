// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final Reader val$input;
    final Writer val$output;

    public HttpRequest run()
        throws IOException
    {
        char ac[] = new char[HttpRequest.access$100(HttpRequest.this)];
        do
        {
            int i = val$input.read(ac);
            if (i != -1)
            {
                val$output.write(ac, 0, i);
            } else
            {
                return HttpRequest.this;
            }
        } while (true);
    }

    public volatile Object run()
        throws tpRequestException, IOException
    {
        return run();
    }

    tpRequestException(Reader reader, Writer writer)
    {
        this$0 = final_httprequest;
        val$input = reader;
        val$output = writer;
        super(final_closeable, Z.this);
    }
}
