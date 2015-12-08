// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpEncoding

public class GZipEncoding
    implements HttpEncoding
{

    public GZipEncoding()
    {
    }

    public void encode(StreamingContent streamingcontent, OutputStream outputstream)
        throws IOException
    {
        outputstream = new GZIPOutputStream(new FilterOutputStream(outputstream) {

            final GZipEncoding this$0;

            public void close()
                throws IOException
            {
                try
                {
                    flush();
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            
            {
                this$0 = GZipEncoding.this;
                super(outputstream);
            }
        });
        streamingcontent.writeTo(outputstream);
        outputstream.close();
    }

    public String getName()
    {
        return "gzip";
    }
}
