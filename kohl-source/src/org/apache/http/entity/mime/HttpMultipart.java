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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package org.apache.http.entity.mime:
//            MIME, HttpMultipartMode, FormBodyPart, Header, 
//            MinimalField

public class HttpMultipart
{

    private static final ByteArrayBuffer CR_LF;
    private static final ByteArrayBuffer FIELD_SEP;
    private static final ByteArrayBuffer TWO_DASHES;
    private final String boundary;
    private final Charset charset;
    private final HttpMultipartMode mode;
    private final List parts;
    private final String subType;

    public HttpMultipart(String s, String s1)
    {
        this(s, null, s1);
    }

    public HttpMultipart(String s, Charset charset1, String s1)
    {
        this(s, charset1, s1, HttpMultipartMode.STRICT);
    }

    public HttpMultipart(String s, Charset charset1, String s1, HttpMultipartMode httpmultipartmode)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
        subType = s;
        if (charset1 == null)
        {
            charset1 = MIME.DEFAULT_CHARSET;
        }
        charset = charset1;
        boundary = s1;
        parts = new ArrayList();
        mode = httpmultipartmode;
    }

    private void doWriteTo(HttpMultipartMode httpmultipartmode, OutputStream outputstream, boolean flag)
        throws IOException
    {
        ByteArrayBuffer bytearraybuffer;
        Iterator iterator;
        bytearraybuffer = encode(charset, getBoundary());
        iterator = parts.iterator();
_L2:
        FormBodyPart formbodypart;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        formbodypart = (FormBodyPart)iterator.next();
        writeBytes(TWO_DASHES, outputstream);
        writeBytes(bytearraybuffer, outputstream);
        writeBytes(CR_LF, outputstream);
        obj = formbodypart.getHeader();
        static class _cls1
        {

            static final int $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[];

            static 
            {
                $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode = new int[HttpMultipartMode.values().length];
                try
                {
                    $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.STRICT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.BROWSER_COMPATIBLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.apache.http.entity.mime.HttpMultipartMode[httpmultipartmode.ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_170;
_L3:
        writeBytes(CR_LF, outputstream);
        if (flag)
        {
            formbodypart.getBody().writeTo(outputstream);
        }
        writeBytes(CR_LF, outputstream);
        if (true) goto _L2; else goto _L1
_L1:
        obj = ((Header) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            writeField((MinimalField)((Iterator) (obj)).next(), outputstream);
        }
          goto _L3
        writeField(formbodypart.getHeader().getField("Content-Disposition"), charset, outputstream);
        if (formbodypart.getBody().getFilename() != null)
        {
            writeField(formbodypart.getHeader().getField("Content-Type"), charset, outputstream);
        }
          goto _L3
        writeBytes(TWO_DASHES, outputstream);
        writeBytes(bytearraybuffer, outputstream);
        writeBytes(TWO_DASHES, outputstream);
        writeBytes(CR_LF, outputstream);
        return;
    }

    private static ByteArrayBuffer encode(Charset charset1, String s)
    {
        charset1 = charset1.encode(CharBuffer.wrap(s));
        s = new ByteArrayBuffer(charset1.remaining());
        s.append(charset1.array(), charset1.position(), charset1.remaining());
        return s;
    }

    private static void writeBytes(String s, OutputStream outputstream)
        throws IOException
    {
        writeBytes(encode(MIME.DEFAULT_CHARSET, s), outputstream);
    }

    private static void writeBytes(String s, Charset charset1, OutputStream outputstream)
        throws IOException
    {
        writeBytes(encode(charset1, s), outputstream);
    }

    private static void writeBytes(ByteArrayBuffer bytearraybuffer, OutputStream outputstream)
        throws IOException
    {
        outputstream.write(bytearraybuffer.buffer(), 0, bytearraybuffer.length());
    }

    private static void writeField(MinimalField minimalfield, OutputStream outputstream)
        throws IOException
    {
        writeBytes(minimalfield.getName(), outputstream);
        writeBytes(FIELD_SEP, outputstream);
        writeBytes(minimalfield.getBody(), outputstream);
        writeBytes(CR_LF, outputstream);
    }

    private static void writeField(MinimalField minimalfield, Charset charset1, OutputStream outputstream)
        throws IOException
    {
        writeBytes(minimalfield.getName(), charset1, outputstream);
        writeBytes(FIELD_SEP, outputstream);
        writeBytes(minimalfield.getBody(), charset1, outputstream);
        writeBytes(CR_LF, outputstream);
    }

    public void addBodyPart(FormBodyPart formbodypart)
    {
        if (formbodypart == null)
        {
            return;
        } else
        {
            parts.add(formbodypart);
            return;
        }
    }

    public List getBodyParts()
    {
        return parts;
    }

    public String getBoundary()
    {
        return boundary;
    }

    public Charset getCharset()
    {
        return charset;
    }

    public HttpMultipartMode getMode()
    {
        return mode;
    }

    public String getSubType()
    {
        return subType;
    }

    public long getTotalLength()
    {
label0:
        {
            long l2 = -1L;
            long l = 0L;
            long l1;
            for (Iterator iterator = parts.iterator(); iterator.hasNext();)
            {
                long l3 = ((FormBodyPart)iterator.next()).getBody().getContentLength();
                l1 = l2;
                if (l3 < 0L)
                {
                    break label0;
                }
                l += l3;
            }

            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            int i;
            try
            {
                doWriteTo(mode, bytearrayoutputstream, false);
                i = bytearrayoutputstream.toByteArray().length;
            }
            catch (IOException ioexception)
            {
                return -1L;
            }
            l1 = (long)i + l;
        }
        return l1;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        doWriteTo(mode, outputstream, true);
    }

    static 
    {
        FIELD_SEP = encode(MIME.DEFAULT_CHARSET, ": ");
        CR_LF = encode(MIME.DEFAULT_CHARSET, "\r\n");
        TWO_DASHES = encode(MIME.DEFAULT_CHARSET, "--");
    }
}
