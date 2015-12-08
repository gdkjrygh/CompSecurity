// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            DecompressingEntity

public class GzipDecompressingEntity extends DecompressingEntity
{

    public GzipDecompressingEntity(HttpEntity httpentity)
    {
        super(httpentity);
    }

    InputStream decorate(InputStream inputstream)
        throws IOException
    {
        return new GZIPInputStream(inputstream);
    }

    public volatile InputStream getContent()
        throws IOException
    {
        return super.getContent();
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        return -1L;
    }

    public volatile void writeTo(OutputStream outputstream)
        throws IOException
    {
        super.writeTo(outputstream);
    }
}
