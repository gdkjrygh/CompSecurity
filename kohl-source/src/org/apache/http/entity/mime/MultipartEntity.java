// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.message.BasicHeader;

// Referenced classes of package org.apache.http.entity.mime:
//            HttpMultipartMode, HttpMultipart, FormBodyPart

public class MultipartEntity
    implements HttpEntity
{

    private static final char MULTIPART_CHARS[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final Header contentType;
    private volatile boolean dirty;
    private long length;
    private final HttpMultipart multipart;

    public MultipartEntity()
    {
        this(HttpMultipartMode.STRICT, null, null);
    }

    public MultipartEntity(HttpMultipartMode httpmultipartmode)
    {
        this(httpmultipartmode, null, null);
    }

    public MultipartEntity(HttpMultipartMode httpmultipartmode, String s, Charset charset)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = generateBoundary();
        }
        s = httpmultipartmode;
        if (httpmultipartmode == null)
        {
            s = HttpMultipartMode.STRICT;
        }
        multipart = new HttpMultipart("form-data", charset, s1, s);
        contentType = new BasicHeader("Content-Type", generateContentType(s1, charset));
        dirty = true;
    }

    public void addPart(String s, ContentBody contentbody)
    {
        addPart(new FormBodyPart(s, contentbody));
    }

    public void addPart(FormBodyPart formbodypart)
    {
        multipart.addBodyPart(formbodypart);
        dirty = true;
    }

    public void consumeContent()
        throws IOException, UnsupportedOperationException
    {
        if (isStreaming())
        {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        } else
        {
            return;
        }
    }

    protected String generateBoundary()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        int j = random.nextInt(11);
        for (int i = 0; i < j + 30; i++)
        {
            stringbuilder.append(MULTIPART_CHARS[random.nextInt(MULTIPART_CHARS.length)]);
        }

        return stringbuilder.toString();
    }

    protected String generateContentType(String s, Charset charset)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("multipart/form-data; boundary=");
        stringbuilder.append(s);
        if (charset != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(charset.name());
        }
        return stringbuilder.toString();
    }

    public InputStream getContent()
        throws IOException, UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        if (dirty)
        {
            length = multipart.getTotalLength();
            dirty = false;
        }
        return length;
    }

    public Header getContentType()
    {
        return contentType;
    }

    public boolean isChunked()
    {
        return !isRepeatable();
    }

    public boolean isRepeatable()
    {
        for (Iterator iterator = multipart.getBodyParts().iterator(); iterator.hasNext();)
        {
            if (((FormBodyPart)iterator.next()).getBody().getContentLength() < 0L)
            {
                return false;
            }
        }

        return true;
    }

    public boolean isStreaming()
    {
        return !isRepeatable();
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        multipart.writeTo(outputstream);
    }

}
