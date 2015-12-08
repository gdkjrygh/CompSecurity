// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;

// Referenced classes of package org.apache.http.entity.mime:
//            AbstractMultipartForm, FormBodyPart, Header

class HttpBrowserCompatibleMultipart extends AbstractMultipartForm
{

    private final List parts;

    public HttpBrowserCompatibleMultipart(String s, Charset charset, String s1, List list)
    {
        super(s, charset, s1);
        parts = list;
    }

    protected void formatMultipartHeader(FormBodyPart formbodypart, OutputStream outputstream)
    {
        Header header = formbodypart.getHeader();
        writeField(header.getField("Content-Disposition"), charset, outputstream);
        if (formbodypart.getBody().getFilename() != null)
        {
            writeField(header.getField("Content-Type"), charset, outputstream);
        }
    }

    public List getBodyParts()
    {
        return parts;
    }
}
