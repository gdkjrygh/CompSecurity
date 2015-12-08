// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final InputStream val$input;
    final OutputStream val$output;

    public HttpRequest run()
        throws IOException
    {
        byte abyte0[] = new byte[HttpRequest.access$100(HttpRequest.this)];
        do
        {
            int i = val$input.read(abyte0);
            if (i != -1)
            {
                val$output.write(abyte0, 0, i);
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

    tpRequestException(InputStream inputstream, OutputStream outputstream)
    {
        this$0 = final_httprequest;
        val$input = inputstream;
        val$output = outputstream;
        super(final_closeable, Z.this);
    }
}
