// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.content.ContentBody;

// Referenced classes of package org.apache.http.entity.mime:
//            HttpMultipartMode, MultipartEntityBuilder, FormBodyPart, MultipartFormEntity

public class MultipartEntity
    implements HttpEntity
{

    private static final char MULTIPART_CHARS[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final MultipartEntityBuilder builder;
    private volatile MultipartFormEntity entity;

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
        builder = (new MultipartEntityBuilder()).setMode(httpmultipartmode).setCharset(charset).setBoundary(s);
        entity = null;
    }

    private MultipartFormEntity getEntity()
    {
        if (entity == null)
        {
            entity = builder.buildEntity();
        }
        return entity;
    }

    public void addPart(String s, ContentBody contentbody)
    {
        addPart(new FormBodyPart(s, contentbody));
    }

    public void addPart(FormBodyPart formbodypart)
    {
        builder.addPart(formbodypart);
        entity = null;
    }

    public void consumeContent()
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
    {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public Header getContentEncoding()
    {
        return getEntity().getContentEncoding();
    }

    public long getContentLength()
    {
        return getEntity().getContentLength();
    }

    public Header getContentType()
    {
        return getEntity().getContentType();
    }

    public boolean isChunked()
    {
        return getEntity().isChunked();
    }

    public boolean isRepeatable()
    {
        return getEntity().isRepeatable();
    }

    public boolean isStreaming()
    {
        return getEntity().isStreaming();
    }

    public void writeTo(OutputStream outputstream)
    {
        getEntity().writeTo(outputstream);
    }

}
