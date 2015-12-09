// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

// Referenced classes of package org.apache.commons.codec.net:
//            Utils

public class URLCodec
    implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{

    protected static final byte ESCAPE_CHAR = 37;
    static final int RADIX = 16;
    protected static final BitSet WWW_FORM_URL;
    protected String charset;

    public URLCodec()
    {
        this("UTF-8");
    }

    public URLCodec(String s)
    {
        charset = s;
    }

    public static final byte[] decodeUrl(byte abyte0[])
        throws DecoderException
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        if (abyte0 == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L2:
        int j;
        if (i >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        j = abyte0[i];
        if (j != 43)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(32);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (j != 37)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        i++;
        try
        {
            j = Utils.digit16(abyte0[i]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException("Invalid URL encoding: ", abyte0);
        }
        i++;
        bytearrayoutputstream.write((char)((j << 4) + Utils.digit16(abyte0[i])));
          goto _L3
        bytearrayoutputstream.write(j);
          goto _L3
        return bytearrayoutputstream.toByteArray();
    }

    public static final byte[] encodeUrl(BitSet bitset, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        BitSet bitset1 = bitset;
        if (bitset == null)
        {
            bitset1 = WWW_FORM_URL;
        }
        bitset = new ByteArrayOutputStream();
        int l = abyte0.length;
        int j = 0;
        while (j < l) 
        {
            byte byte0 = abyte0[j];
            int i = byte0;
            if (byte0 < 0)
            {
                i = byte0 + 256;
            }
            if (bitset1.get(i))
            {
                int k = i;
                if (i == 32)
                {
                    k = 43;
                }
                bitset.write(k);
            } else
            {
                bitset.write(37);
                char c = Character.toUpperCase(Character.forDigit(i >> 4 & 0xf, 16));
                i = Character.toUpperCase(Character.forDigit(i & 0xf, 16));
                bitset.write(c);
                bitset.write(i);
            }
            j++;
        }
        return bitset.toByteArray();
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof byte[])
        {
            return decode((byte[])(byte[])obj);
        }
        if (obj instanceof String)
        {
            return decode((String)obj);
        } else
        {
            throw new DecoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be URL decoded").toString());
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
            s = decode(s, getDefaultCharset());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderException(s.getMessage(), s);
        }
        return s;
    }

    public String decode(String s, String s1)
        throws DecoderException, UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new String(decode(StringUtils.getBytesUsAscii(s)), s1);
        }
    }

    public byte[] decode(byte abyte0[])
        throws DecoderException
    {
        return decodeUrl(abyte0);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof byte[])
        {
            return encode((byte[])(byte[])obj);
        }
        if (obj instanceof String)
        {
            return encode((String)obj);
        } else
        {
            throw new EncoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be URL encoded").toString());
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = encode(s, getDefaultCharset());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncoderException(s.getMessage(), s);
        }
        return s;
    }

    public String encode(String s, String s1)
        throws UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return StringUtils.newStringUsAscii(encode(s.getBytes(s1)));
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return encodeUrl(WWW_FORM_URL, abyte0);
    }

    public String getDefaultCharset()
    {
        return charset;
    }

    public String getEncoding()
    {
        return charset;
    }

    static 
    {
        WWW_FORM_URL = new BitSet(256);
        for (int i = 97; i <= 122; i++)
        {
            WWW_FORM_URL.set(i);
        }

        for (int j = 65; j <= 90; j++)
        {
            WWW_FORM_URL.set(j);
        }

        for (int k = 48; k <= 57; k++)
        {
            WWW_FORM_URL.set(k);
        }

        WWW_FORM_URL.set(45);
        WWW_FORM_URL.set(95);
        WWW_FORM_URL.set(46);
        WWW_FORM_URL.set(42);
        WWW_FORM_URL.set(32);
    }
}
