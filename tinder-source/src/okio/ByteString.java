// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package okio:
//            t, b

public class ByteString
    implements Serializable, Comparable
{

    static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    public static final ByteString b = a(new byte[0]);
    private static final long serialVersionUID = 1L;
    public final byte c[];
    transient int d;
    transient String e;

    ByteString(byte abyte0[])
    {
        c = abyte0;
    }

    public static ByteString a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            ByteString bytestring = new ByteString(s.getBytes(t.a));
            bytestring.e = s;
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
        s = okio.b.a(s);
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
            s = a(MessageDigest.getInstance(s).digest(c));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException
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
            Field field = okio/ByteString.getDeclaredField("c");
            field.setAccessible(true);
            field.set(this, ((ByteString) (objectinputstream)).c);
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
        objectoutputstream.writeInt(c.length);
        objectoutputstream.write(c);
    }

    public final String a()
    {
        String s = e;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(c, t.a);
            e = s1;
            return s1;
        }
    }

    public final String b()
    {
        int i = 0;
        char ac[] = new char[c.length * 2];
        byte abyte0[] = c;
        int k = abyte0.length;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac[j] = a[byte0 >> 4 & 0xf];
            j = l + 1;
            ac[l] = a[byte0 & 0xf];
        }

        return new String(ac);
    }

    public final ByteString c()
    {
        int i = 0;
        do
        {
label0:
            {
                Object obj = this;
                if (i < c.length)
                {
                    byte byte0 = c[i];
                    if (byte0 < 65 || byte0 > 90)
                    {
                        break label0;
                    }
                    obj = (byte[])c.clone();
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

    public int compareTo(Object obj)
    {
        int i;
        int j;
        int k;
        int l;
        obj = (ByteString)obj;
        j = c.length;
        k = ((ByteString) (obj)).c.length;
        l = Math.min(j, k);
        i = 0;
_L9:
        if (i >= l) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        i1 = c[i] & 0xff;
        j1 = ((ByteString) (obj)).c[i] & 0xff;
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

    public final byte[] d()
    {
        return (byte[])c.clone();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof ByteString) && ((ByteString)obj).c.length == c.length)
        {
            obj = (ByteString)obj;
            byte abyte0[] = c;
            int i = c.length;
            boolean flag;
            if (((ByteString) (obj)).c.length - i >= 0 && abyte0.length - i >= 0 && t.a(((ByteString) (obj)).c, abyte0, i))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(c);
            d = j;
            return j;
        }
    }

    public String toString()
    {
        if (c.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (c.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(c.length), b()
            });
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(c.length), c("MD5").b()
            });
        }
    }

}
