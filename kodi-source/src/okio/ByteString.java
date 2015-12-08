// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package okio:
//            Base64, Util, Buffer

public class ByteString
    implements Serializable
{

    public static final ByteString EMPTY = of(new byte[0]);
    static final char HEX_DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    final byte data[];
    transient int hashCode;
    transient String utf8;

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

    private ByteString digest(String s)
    {
        try
        {
            s = of(MessageDigest.getInstance(s).digest(data));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
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

    public String base64()
    {
        return Base64.encode(data);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        if ((obj instanceof ByteString) && ((ByteString)obj).size() == data.length && ((ByteString)obj).rangeEquals(0, data, 0, data.length))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public byte getByte(int i)
    {
        return data[i];
    }

    public int hashCode()
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

    public String hex()
    {
        char ac[] = new char[data.length * 2];
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

    public ByteString md5()
    {
        return digest("MD5");
    }

    public boolean rangeEquals(int i, byte abyte0[], int j, int k)
    {
        return i <= data.length - k && j <= abyte0.length - k && Util.arrayRangeEquals(data, i, abyte0, j, k);
    }

    public int size()
    {
        return data.length;
    }

    public ByteString toAsciiLowercase()
    {
        Object obj;
label0:
        {
            int i = 0;
            byte byte0;
            do
            {
                obj = this;
                if (i >= data.length)
                {
                    break label0;
                }
                byte0 = data[i];
                if (byte0 >= 65 && byte0 <= 90)
                {
                    break;
                }
                i++;
            } while (true);
            obj = (byte[])data.clone();
            obj[i] = (byte)(byte0 + 32);
            i++;
            while (i < obj.length) 
            {
                byte byte1 = obj[i];
                if (byte1 >= 65 && byte1 <= 90)
                {
                    obj[i] = (byte)(byte1 + 32);
                }
                i++;
            }
            obj = new ByteString(((byte []) (obj)));
        }
        return ((ByteString) (obj));
    }

    public byte[] toByteArray()
    {
        return (byte[])data.clone();
    }

    public String toString()
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
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(data.length), md5().hex()
            });
        }
    }

    public String utf8()
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

    void write(Buffer buffer)
    {
        buffer.write(data, 0, data.length);
    }

}
