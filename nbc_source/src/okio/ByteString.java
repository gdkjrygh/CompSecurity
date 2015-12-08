// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package okio:
//            Base64, Util, Buffer

public class ByteString
    implements Serializable, Comparable
{

    public static final ByteString EMPTY = of(new byte[0]);
    static final char HEX_DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final long serialVersionUID = 1L;
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

    public static ByteString decodeHex(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("hex == null");
        }
        if (s.length() % 2 != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected hex string: ").append(s).toString());
        }
        byte abyte0[] = new byte[s.length() / 2];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)((decodeHexDigit(s.charAt(i * 2)) << 4) + decodeHexDigit(s.charAt(i * 2 + 1)));
        }

        return of(abyte0);
    }

    private static int decodeHexDigit(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f')
        {
            return (c - 97) + 10;
        }
        if (c >= 'A' && c <= 'F')
        {
            return (c - 65) + 10;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected hex digit: ").append(c).toString());
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

    public static ByteString of(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            Util.checkOffsetAndCount(abyte0.length, i, j);
            byte abyte1[] = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
            return new ByteString(abyte1);
        }
    }

    public static ByteString read(InputStream inputstream, int i)
        throws IOException
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(i).toString());
        }
        byte abyte0[] = new byte[i];
        int k;
        for (int j = 0; j < i; j += k)
        {
            k = inputstream.read(abyte0, j, i - j);
            if (k == -1)
            {
                throw new EOFException();
            }
        }

        return new ByteString(abyte0);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException
    {
        objectinputstream = read(objectinputstream, objectinputstream.readInt());
        try
        {
            Field field = okio/ByteString.getDeclaredField("data");
            field.setAccessible(true);
            field.set(this, ((ByteString) (objectinputstream)).data);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeInt(data.length);
        objectoutputstream.write(data);
    }

    public String base64()
    {
        return Base64.encode(data);
    }

    public String base64Url()
    {
        return Base64.encodeUrl(data);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ByteString)obj);
    }

    public int compareTo(ByteString bytestring)
    {
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        return 1;
        int j = size();
        int k = bytestring.size();
        int i = 0;
        int i1;
        int j1;
        for (int l = Math.min(j, k); i < l; i++)
        {
            i1 = getByte(i) & 0xff;
            j1 = bytestring.getByte(i) & 0xff;
            if (i1 != j1)
            {
                break MISSING_BLOCK_LABEL_63;
            }
        }

        if (j == k)
        {
            return 0;
        }
        if (j >= k)
        {
            return 1;
        }
        if (true) goto _L1; else goto _L3
_L3:
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

    public boolean rangeEquals(int i, ByteString bytestring, int j, int k)
    {
        return bytestring.rangeEquals(j, data, i, k);
    }

    public boolean rangeEquals(int i, byte abyte0[], int j, int k)
    {
        return i <= data.length - k && j <= abyte0.length - k && Util.arrayRangeEquals(data, i, abyte0, j, k);
    }

    public ByteString sha256()
    {
        return digest("SHA-256");
    }

    public int size()
    {
        return data.length;
    }

    public ByteString substring(int i)
    {
        return substring(i, data.length);
    }

    public ByteString substring(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (j > data.length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("endIndex > length(").append(data.length).append(")").toString());
        }
        int k = j - i;
        if (k < 0)
        {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && j == data.length)
        {
            return this;
        } else
        {
            byte abyte0[] = new byte[k];
            System.arraycopy(data, i, abyte0, 0, k);
            return new ByteString(abyte0);
        }
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

    public ByteString toAsciiUppercase()
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
                if (byte0 >= 97 && byte0 <= 122)
                {
                    break;
                }
                i++;
            } while (true);
            obj = (byte[])data.clone();
            obj[i] = (byte)(byte0 - 32);
            i++;
            while (i < obj.length) 
            {
                byte byte1 = obj[i];
                if (byte1 >= 97 && byte1 <= 122)
                {
                    obj[i] = (byte)(byte1 - 32);
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

    public void write(OutputStream outputstream)
        throws IOException
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        } else
        {
            outputstream.write(data);
            return;
        }
    }

    void write(Buffer buffer)
    {
        buffer.write(data, 0, data.length);
    }

}
