// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package okio:
//            Base64, Util

public final class ByteString
    implements Serializable
{

    public static final ByteString EMPTY = of(new byte[0]);
    private static final char HEX_DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    final byte data[];
    private transient int hashCode;
    private transient String utf8;

    ByteString(byte abyte0[])
    {
        data = abyte0;
    }

    public static ByteString decodeBase64(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("base64 == null");
        }
        s = Base64.decode(s);
        if (s != null)
        {
            return new ByteString(s);
        } else
        {
            return null;
        }
    }

    public static ByteString encodeUtf8(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            ByteString bytestring = new ByteString(s.getBytes(Util.UTF_8));
            bytestring.utf8 = s;
            return bytestring;
        }
    }

    public static transient ByteString of(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new ByteString((byte[])abyte0.clone());
        }
    }

    public final String base64()
    {
        return Base64.encode(data);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof ByteString) && Arrays.equals(((ByteString)obj).data, data);
    }

    public final byte getByte(int i)
    {
        return data[i];
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(data);
            hashCode = j;
            return j;
        }
    }

    public final String hex()
    {
        char ac[] = new char[data.length << 1];
        byte abyte0[] = data;
        int k = abyte0.length;
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac[j] = HEX_DIGITS[byte0 >> 4 & 0xf];
            j = l + 1;
            ac[l] = HEX_DIGITS[byte0 & 0xf];
        }

        return new String(ac);
    }

    public final int size()
    {
        return data.length;
    }

    public final ByteString toAsciiLowercase()
    {
        int i = 0;
        do
        {
label0:
            {
                Object obj = this;
                if (i < data.length)
                {
                    byte byte0 = data[i];
                    if (byte0 < 65 || byte0 > 90)
                    {
                        break label0;
                    }
                    obj = (byte[])data.clone();
                    obj[i] = (byte)(byte0 + 32);
                    for (i++; i < obj.length; i++)
                    {
                        byte byte1 = obj[i];
                        if (byte1 >= 65 && byte1 <= 90)
                        {
                            obj[i] = (byte)(byte1 + 32);
                        }
                    }

                    obj = new ByteString(((byte []) (obj)));
                }
                return ((ByteString) (obj));
            }
            i++;
        } while (true);
    }

    public final byte[] toByteArray()
    {
        return (byte[])data.clone();
    }

    public final String toString()
    {
        if (data.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (data.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(data.length), hex()
            });
        }
        String s;
        try
        {
            s = String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(data.length), of(MessageDigest.getInstance("MD5").digest(data)).hex()
            });
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        return s;
    }

    public final String utf8()
    {
        String s = utf8;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(data, Util.UTF_8);
            utf8 = s1;
            return s1;
        }
    }

}
