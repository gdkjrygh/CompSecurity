// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class s
{

    static final byte a[] = "from-data".getBytes();
    static final byte b[] = "attachment".getBytes();
    static final byte c[] = "inline".getBytes();
    private Map d;
    private Uri e;
    private byte f[];

    public s()
    {
        d = null;
        e = null;
        f = null;
        d = new HashMap();
    }

    public void a(int l)
    {
        d.put(Integer.valueOf(129), Integer.valueOf(l));
    }

    public void a(Uri uri)
    {
        e = uri;
    }

    public void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return;
        } else
        {
            f = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, f, 0, abyte0.length);
            return;
        }
    }

    public byte[] a()
    {
        if (f == null)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[f.length];
            System.arraycopy(f, 0, abyte0, 0, f.length);
            return abyte0;
        }
    }

    public Uri b()
    {
        return e;
    }

    public void b(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        }
        if (abyte0.length > 1 && (char)abyte0[0] == '<' && (char)abyte0[abyte0.length - 1] == '>')
        {
            d.put(Integer.valueOf(192), abyte0);
            return;
        } else
        {
            byte abyte1[] = new byte[abyte0.length + 2];
            abyte1[0] = 60;
            abyte1[abyte1.length - 1] = 62;
            System.arraycopy(abyte0, 0, abyte1, 1, abyte0.length);
            d.put(Integer.valueOf(192), abyte1);
            return;
        }
    }

    public void c(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-location");
        } else
        {
            d.put(Integer.valueOf(142), abyte0);
            return;
        }
    }

    public byte[] c()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(192));
    }

    public int d()
    {
        Integer integer = (Integer)d.get(Integer.valueOf(129));
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    public void d(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-disposition");
        } else
        {
            d.put(Integer.valueOf(197), abyte0);
            return;
        }
    }

    public void e(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-type");
        } else
        {
            d.put(Integer.valueOf(145), abyte0);
            return;
        }
    }

    public byte[] e()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(142));
    }

    public void f(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-transfer-encoding");
        } else
        {
            d.put(Integer.valueOf(200), abyte0);
            return;
        }
    }

    public byte[] f()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(197));
    }

    public void g(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-id");
        } else
        {
            d.put(Integer.valueOf(151), abyte0);
            return;
        }
    }

    public byte[] g()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(145));
    }

    public void h(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("null content-id");
        } else
        {
            d.put(Integer.valueOf(152), abyte0);
            return;
        }
    }

    public byte[] h()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(200));
    }

    public byte[] i()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(151));
    }

    public byte[] j()
    {
        return (byte[])(byte[])d.get(Integer.valueOf(152));
    }

    public String k()
    {
        byte abyte1[] = (byte[])(byte[])d.get(Integer.valueOf(151));
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            byte abyte2[] = (byte[])(byte[])d.get(Integer.valueOf(152));
            abyte0 = abyte2;
            if (abyte2 == null)
            {
                abyte0 = (byte[])(byte[])d.get(Integer.valueOf(142));
            }
        }
        if (abyte0 == null)
        {
            abyte0 = (byte[])(byte[])d.get(Integer.valueOf(192));
            return (new StringBuilder()).append("cid:").append(new String(abyte0)).toString();
        } else
        {
            return new String(abyte0);
        }
    }

}
