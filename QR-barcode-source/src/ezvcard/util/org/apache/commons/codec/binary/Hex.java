// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util.org.apache.commons.codec.binary;

import ezvcard.util.org.apache.commons.codec.BinaryDecoder;
import ezvcard.util.org.apache.commons.codec.BinaryEncoder;
import ezvcard.util.org.apache.commons.codec.DecoderException;
import ezvcard.util.org.apache.commons.codec.EncoderException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package ezvcard.util.org.apache.commons.codec.binary:
//            StringUtils

public class Hex
    implements BinaryEncoder, BinaryDecoder
{

    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    private static final char DIGITS_LOWER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final char DIGITS_UPPER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private final String charsetName;

    public Hex()
    {
        charsetName = "UTF-8";
    }

    public Hex(String s)
    {
        charsetName = s;
    }

    public static byte[] decodeHex(char ac[])
        throws DecoderException
    {
        int k = ac.length;
        if ((k & 1) != 0)
        {
            throw new DecoderException("Odd number of characters.");
        }
        byte abyte0[] = new byte[k >> 1];
        int i = 0;
        for (int j = 0; j < k;)
        {
            int l = toDigit(ac[j], j);
            j++;
            int i1 = toDigit(ac[j], j);
            j++;
            abyte0[i] = (byte)((l << 4 | i1) & 0xff);
            i++;
        }

        return abyte0;
    }

    public static char[] encodeHex(byte abyte0[])
    {
        return encodeHex(abyte0, true);
    }

    public static char[] encodeHex(byte abyte0[], boolean flag)
    {
        char ac[];
        if (flag)
        {
            ac = DIGITS_LOWER;
        } else
        {
            ac = DIGITS_UPPER;
        }
        return encodeHex(abyte0, ac);
    }

    protected static char[] encodeHex(byte abyte0[], char ac[])
    {
        int k = abyte0.length;
        char ac1[] = new char[k << 1];
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            int l = j + 1;
            ac1[j] = ac[(abyte0[i] & 0xf0) >>> 4];
            j = l + 1;
            ac1[l] = ac[abyte0[i] & 0xf];
        }

        return ac1;
    }

    public static String encodeHexString(byte abyte0[])
    {
        return new String(encodeHex(abyte0));
    }

    protected static int toDigit(char c, int i)
        throws DecoderException
    {
        int j = Character.digit(c, 16);
        if (j == -1)
        {
            throw new DecoderException((new StringBuilder()).append("Illegal hexadecimal character ").append(c).append(" at index ").append(i).toString());
        } else
        {
            return j;
        }
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        try
        {
            if (obj instanceof String)
            {
                obj = ((String)obj).toCharArray();
            } else
            {
                obj = (char[])(char[])obj;
            }
            return decodeHex(((char []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new DecoderException(((ClassCastException) (obj)).getMessage(), ((Throwable) (obj)));
        }
    }

    public byte[] decode(byte abyte0[])
        throws DecoderException
    {
        try
        {
            abyte0 = decodeHex((new String(abyte0, getCharsetName())).toCharArray());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException(abyte0.getMessage(), abyte0);
        }
        return abyte0;
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        try
        {
            if (obj instanceof String)
            {
                obj = ((String)obj).getBytes(getCharsetName());
            } else
            {
                obj = (byte[])(byte[])obj;
            }
            return encodeHex(((byte []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new EncoderException(((ClassCastException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new EncoderException(((UnsupportedEncodingException) (obj)).getMessage(), ((Throwable) (obj)));
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return StringUtils.getBytesUnchecked(encodeHexString(abyte0), getCharsetName());
    }

    public String getCharsetName()
    {
        return charsetName;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[charsetName=").append(charsetName).append("]").toString();
    }

}
