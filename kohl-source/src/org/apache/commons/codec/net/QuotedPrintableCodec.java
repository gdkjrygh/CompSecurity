// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

// Referenced classes of package org.apache.commons.codec.net:
//            Utils

public class QuotedPrintableCodec
    implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder
{

    private static final byte ESCAPE_CHAR = 61;
    private static final BitSet PRINTABLE_CHARS;
    private static final byte SPACE = 32;
    private static final byte TAB = 9;
    private final Charset charset;

    public QuotedPrintableCodec()
    {
        this(Charsets.UTF_8);
    }

    public QuotedPrintableCodec(String s)
        throws IllegalCharsetNameException, IllegalArgumentException, UnsupportedCharsetException
    {
        this(Charset.forName(s));
    }

    public QuotedPrintableCodec(Charset charset1)
    {
        charset = charset1;
    }

    public static final byte[] decodeQuotedPrintable(byte abyte0[])
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
_L7:
        if (i >= abyte0.length) goto _L2; else goto _L1
_L1:
        int j = abyte0[i];
        if (j != 61) goto _L4; else goto _L3
_L3:
        i++;
        try
        {
            j = Utils.digit16(abyte0[i]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException("Invalid quoted-printable encoding", abyte0);
        }
        i++;
        bytearrayoutputstream.write((char)((j << 4) + Utils.digit16(abyte0[i])));
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        bytearrayoutputstream.write(j);
        if (true) goto _L5; else goto _L2
_L2:
        return bytearrayoutputstream.toByteArray();
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static final void encodeQuotedPrintable(int i, ByteArrayOutputStream bytearrayoutputstream)
    {
        bytearrayoutputstream.write(61);
        char c = Character.toUpperCase(Character.forDigit(i >> 4 & 0xf, 16));
        i = Character.toUpperCase(Character.forDigit(i & 0xf, 16));
        bytearrayoutputstream.write(c);
        bytearrayoutputstream.write(i);
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitset, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        BitSet bitset1 = bitset;
        if (bitset == null)
        {
            bitset1 = PRINTABLE_CHARS;
        }
        bitset = new ByteArrayOutputStream();
        int k = abyte0.length;
        int i = 0;
        while (i < k) 
        {
            byte byte0 = abyte0[i];
            int j = byte0;
            if (byte0 < 0)
            {
                j = byte0 + 256;
            }
            if (bitset1.get(j))
            {
                bitset.write(j);
            } else
            {
                encodeQuotedPrintable(j, ((ByteArrayOutputStream) (bitset)));
            }
            i++;
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
            throw new DecoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be quoted-printable decoded").toString());
        }
    }

    public String decode(String s)
        throws DecoderException
    {
        return decode(s, getCharset());
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

    public String decode(String s, Charset charset1)
        throws DecoderException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new String(decode(StringUtils.getBytesUsAscii(s)), charset1);
        }
    }

    public byte[] decode(byte abyte0[])
        throws DecoderException
    {
        return decodeQuotedPrintable(abyte0);
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
            throw new EncoderException((new StringBuilder()).append("Objects of type ").append(obj.getClass().getName()).append(" cannot be quoted-printable encoded").toString());
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        return encode(s, getCharset());
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

    public String encode(String s, Charset charset1)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return StringUtils.newStringUsAscii(encode(s.getBytes(charset1)));
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return encodeQuotedPrintable(PRINTABLE_CHARS, abyte0);
    }

    public Charset getCharset()
    {
        return charset;
    }

    public String getDefaultCharset()
    {
        return charset.name();
    }

    static 
    {
        PRINTABLE_CHARS = new BitSet(256);
        for (int i = 33; i <= 60; i++)
        {
            PRINTABLE_CHARS.set(i);
        }

        for (int j = 62; j <= 126; j++)
        {
            PRINTABLE_CHARS.set(j);
        }

        PRINTABLE_CHARS.set(9);
        PRINTABLE_CHARS.set(32);
    }
}
