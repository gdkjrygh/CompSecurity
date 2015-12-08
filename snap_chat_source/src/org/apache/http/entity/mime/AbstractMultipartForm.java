// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package org.apache.http.entity.mime:
//            MIME, MinimalField, FormBodyPart

abstract class AbstractMultipartForm
{

    private static final ByteArrayBuffer CR_LF;
    private static final ByteArrayBuffer FIELD_SEP;
    private static final ByteArrayBuffer TWO_DASHES;
    private final String boundary;
    protected final Charset charset;
    private final String subType;

    public AbstractMultipartForm(String s, Charset charset1, String s1)
    {
        Args.notNull(s, "Multipart subtype");
        Args.notNull(s1, "Multipart boundary");
        subType = s;
        if (charset1 == null)
        {
            charset1 = MIME.DEFAULT_CHARSET;
        }
        charset = charset1;
        boundary = s1;
    }

    private static ByteArrayBuffer encode(Charset charset1, String s)
    {
        charset1 = charset1.encode(CharBuffer.wrap(s));
        s = new ByteArrayBuffer(charset1.remaining());
        s.append(charset1.array(), charset1.position(), charset1.remaining());
        return s;
    }

    private static void writeBytes(String s, OutputStream outputstream)
    {
        writeBytes(encode(MIME.DEFAULT_CHARSET, s), outputstream);
    }

    private static void writeBytes(String s, Charset charset1, OutputStream outputstream)
    {
        writeBytes(encode(charset1, s), outputstream);
    }

    private static void writeBytes(ByteArrayBuffer bytearraybuffer, OutputStream outputstream)
    {
        outputstream.write(bytearraybuffer.buffer(), 0, bytearraybuffer.length());
    }

    protected static void writeField(MinimalField minimalfield, OutputStream outputstream)
    {
        writeBytes(minimalfield.getName(), outputstream);
        writeBytes(FIELD_SEP, outputstream);
        writeBytes(minimalfield.getBody(), outputstream);
        writeBytes(CR_LF, outputstream);
    }

    protected static void writeField(MinimalField minimalfield, Charset charset1, OutputStream outputstream)
    {
        writeBytes(minimalfield.getName(), charset1, outputstream);
        writeBytes(FIELD_SEP, outputstream);
        writeBytes(minimalfield.getBody(), charset1, outputstream);
        writeBytes(CR_LF, outputstream);
    }

    void doWriteTo(OutputStream outputstream, boolean flag)
    {
        ByteArrayBuffer bytearraybuffer = encode(charset, getBoundary());
        for (Iterator iterator = getBodyParts().iterator(); iterator.hasNext(); writeBytes(CR_LF, outputstream))
        {
            FormBodyPart formbodypart = (FormBodyPart)iterator.next();
            writeBytes(TWO_DASHES, outputstream);
            writeBytes(bytearraybuffer, outputstream);
            writeBytes(CR_LF, outputstream);
            formatMultipartHeader(formbodypart, outputstream);
            writeBytes(CR_LF, outputstream);
            if (flag)
            {
                formbodypart.getBody().writeTo(outputstream);
            }
        }

        writeBytes(TWO_DASHES, outputstream);
        writeBytes(bytearraybuffer, outputstream);
        writeBytes(TWO_DASHES, outputstream);
        writeBytes(CR_LF, outputstream);
    }

    protected abstract void formatMultipartHeader(FormBodyPart formbodypart, OutputStream outputstream);

    public abstract List getBodyParts();

    public String getBoundary()
    {
        return boundary;
    }

    public long getTotalLength()
    {
        Object obj = getBodyParts().iterator();
        long l = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            long l1 = ((FormBodyPart)((Iterator) (obj)).next()).getBody().getContentLength();
            if (l1 >= 0L)
            {
                l = l1 + l;
            } else
            {
                return -1L;
            }
        }
        obj = new ByteArrayOutputStream();
        int i;
        try
        {
            doWriteTo(((OutputStream) (obj)), false);
            i = ((ByteArrayOutputStream) (obj)).toByteArray().length;
        }
        catch (IOException ioexception)
        {
            return -1L;
        }
        return (long)i + l;
    }

    public void writeTo(OutputStream outputstream)
    {
        doWriteTo(outputstream, true);
    }

    static 
    {
        FIELD_SEP = encode(MIME.DEFAULT_CHARSET, ": ");
        CR_LF = encode(MIME.DEFAULT_CHARSET, "\r\n");
        TWO_DASHES = encode(MIME.DEFAULT_CHARSET, "--");
    }
}
