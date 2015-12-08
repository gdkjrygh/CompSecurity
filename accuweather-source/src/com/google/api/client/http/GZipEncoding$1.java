// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            GZipEncoding

class this._cls0 extends FilterOutputStream
{

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

    (OutputStream outputstream)
    {
        this$0 = GZipEncoding.this;
        super(outputstream);
    }
}
