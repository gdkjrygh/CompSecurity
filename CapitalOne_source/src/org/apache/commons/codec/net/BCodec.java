// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;

// Referenced classes of package org.apache.commons.codec.net:
//            RFC1522Codec

public class BCodec extends RFC1522Codec
    implements StringEncoder, StringDecoder
{

    private final Charset charset;

    public BCodec()
    {
        this(Charsets.UTF_8);
    }

    public BCodec(String s)
    {
        this(Charset.forName(s));
    }

    public BCodec(Charset charset1)
    {
        charset = charset1;
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof String)
        {
            return decode((String)obj);
        } else
        {
            throw new DecoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be decoded using BCodec").toString());
        }
    }

    public String decode(String s)
        throws DecoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = decodeText(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderException(s.getMessage(), s);
        }
        return s;
    }

    protected byte[] doDecoding(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.decodeBase64(abyte0);
        }
    }

    protected byte[] doEncoding(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeBase64(abyte0);
        }
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof String)
        {
            return encode((String)obj);
        } else
        {
            throw new EncoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be encoded using BCodec").toString());
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return encode(s, getCharset());
        }
    }

    public String encode(String s, String s1)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = encodeText(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncoderException(s.getMessage(), s);
        }
        return s;
    }

    public String encode(String s, Charset charset1)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return encodeText(s, charset1);
        }
    }

    public Charset getCharset()
    {
        return charset;
    }

    public String getDefaultCharset()
    {
        return charset.name();
    }

    protected String getEncoding()
    {
        return "B";
    }
}
