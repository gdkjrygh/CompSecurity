// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util.org.apache.commons.codec.net;

import ezvcard.util.org.apache.commons.codec.DecoderException;
import ezvcard.util.org.apache.commons.codec.EncoderException;
import ezvcard.util.org.apache.commons.codec.binary.StringUtils;
import java.io.UnsupportedEncodingException;

abstract class RFC1522Codec
{

    protected static final String POSTFIX = "?=";
    protected static final String PREFIX = "=?";
    protected static final char SEP = 63;

    RFC1522Codec()
    {
    }

    protected String decodeText(String s)
        throws DecoderException, UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        }
        if (!s.startsWith("=?") || !s.endsWith("?="))
        {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int i = s.length() - 2;
        int k = s.indexOf('?', 2);
        if (k == i)
        {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String s1 = s.substring(2, k);
        if (s1.equals(""))
        {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        k++;
        int l = s.indexOf('?', k);
        if (l == i)
        {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String s2 = s.substring(k, l);
        if (!getEncoding().equalsIgnoreCase(s2))
        {
            throw new DecoderException((new StringBuilder()).append("This codec cannot decode ").append(s2).append(" encoded content").toString());
        } else
        {
            int j = l + 1;
            return new String(doDecoding(StringUtils.getBytesUsAscii(s.substring(j, s.indexOf('?', j)))), s1);
        }
    }

    protected abstract byte[] doDecoding(byte abyte0[])
        throws DecoderException;

    protected abstract byte[] doEncoding(byte abyte0[])
        throws EncoderException;

    protected String encodeText(String s, String s1)
        throws EncoderException, UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("=?");
            stringbuffer.append(s1);
            stringbuffer.append('?');
            stringbuffer.append(getEncoding());
            stringbuffer.append('?');
            stringbuffer.append(StringUtils.newStringUsAscii(doEncoding(s.getBytes(s1))));
            stringbuffer.append("?=");
            return stringbuffer.toString();
        }
    }

    protected abstract String getEncoding();
}
