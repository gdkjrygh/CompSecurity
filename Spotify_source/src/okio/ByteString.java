// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import hcg;
import hch;
import hcy;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ByteString
    implements Serializable, Comparable
{

    public static final ByteString a = a(new byte[0]);
    private static char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final long serialVersionUID = 1L;
    transient int b;
    private transient String d;
    final byte data[];

    public ByteString(byte abyte0[])
    {
        data = abyte0;
    }

    public static ByteString a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            ByteString bytestring = new ByteString(s.getBytes(hcy.a));
            bytestring.d = s;
            return bytestring;
        }
    }

    public static transient ByteString a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new ByteString((byte[])abyte0.clone());
        }
    }

    public static ByteString b(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("base64 == null");
        }
        s = hcg.a(s);
        if (s != null)
        {
            return new ByteString(s);
        } else
        {
            return null;
        }
    }

    private ByteString c(String s)
    {
        try
        {
            s = a(MessageDigest.getInstance(s).digest(data));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        int j = objectinputstream.readInt();
        if (objectinputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(j).toString());
        }
        byte abyte0[] = new byte[j];
        int k;
        for (int i = 0; i < j; i += k)
        {
            k = objectinputstream.read(abyte0, i, j - i);
            if (k == -1)
            {
                throw new EOFException();
            }
        }

        objectinputstream = new ByteString(abyte0);
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
    {
        objectoutputstream.writeInt(data.length);
        objectoutputstream.write(data);
    }

    public byte a(int i)
    {
        return data[i];
    }

    public String a()
    {
        String s = d;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(data, hcy.a);
            d = s1;
            return s1;
        }
    }

    public void a(hch hch1)
    {
        hch1.b(data, 0, data.length);
    }

    public boolean a(int i, byte abyte0[], int j, int k)
    {
        return i <= data.length - k && j <= abyte0.length - k && hcy.a(data, i, abyte0, j, k);
    }

    public String b()
    {
        return hcg.a(data);
    }

    public ByteString c()
    {
        return c("MD5");
    }

    public int compareTo(Object obj)
    {
        int i;
        int j;
        int k;
        int l;
        obj = (ByteString)obj;
        j = f();
        k = ((ByteString) (obj)).f();
        l = Math.min(j, k);
        i = 0;
_L9:
        if (i >= l) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        i1 = a(i) & 0xff;
        j1 = ((ByteString) (obj)).a(i) & 0xff;
        if (i1 == j1) goto _L4; else goto _L3
_L3:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        return -1;
_L6:
        return 1;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j == k)
        {
            return 0;
        }
        if (j < k) goto _L5; else goto _L7
_L7:
        return 1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String d()
    {
        int i = 0;
        char ac[] = new char[data.length << 1];
        byte abyte0[] = data;
        int k = abyte0.length;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac[j] = c[byte0 >> 4 & 0xf];
            j = l + 1;
            ac[l] = c[byte0 & 0xf];
        }

        return new String(ac);
    }

    public ByteString e()
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

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        return (obj instanceof ByteString) && ((ByteString)obj).f() == data.length && ((ByteString)obj).a(0, data, 0, data.length);
    }

    public int f()
    {
        return data.length;
    }

    public byte[] g()
    {
        return (byte[])data.clone();
    }

    public int hashCode()
    {
        int i = b;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(data);
            b = j;
            return j;
        }
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
                Integer.valueOf(data.length), d()
            });
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(data.length), c().d()
            });
        }
    }

}
