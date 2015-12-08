// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.leanplum:
//            q, r, aW, ba

final class p
{

    private static final List n = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10)
    });
    private static final List o = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2)
    });
    private aW a;
    private boolean b;
    private int c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private byte j[];
    private byte k[];
    private boolean l;
    private ByteArrayOutputStream m;

    public p(aW aw)
    {
        b = true;
        j = new byte[0];
        k = new byte[0];
        l = false;
        m = new ByteArrayOutputStream();
        a = aw;
    }

    private static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    private byte[] a(Object obj, int i1, int j1)
    {
        byte abyte0[];
        byte byte0;
        byte byte1;
        char c1;
        int k1;
        int l1;
        if (obj instanceof String)
        {
            obj = b((String)obj);
        } else
        {
            obj = (byte[])obj;
        }
        if (j1 > 0)
        {
            byte1 = 2;
        } else
        {
            byte1 = 0;
        }
        k1 = obj.length + byte1;
        if (k1 <= 125)
        {
            byte0 = 2;
        } else
        if (k1 <= 65535)
        {
            byte0 = 4;
        } else
        {
            byte0 = 10;
        }
        if (b)
        {
            c1 = '\004';
        } else
        {
            c1 = '\0';
        }
        l1 = byte0 + c1;
        if (b)
        {
            c1 = '\200';
        } else
        {
            c1 = '\0';
        }
        abyte0 = new byte[k1 + l1];
        abyte0[0] = (byte)((byte)i1 | 0xffffff80);
        if (k1 <= 125)
        {
            abyte0[1] = (byte)(c1 | k1);
        } else
        if (k1 <= 65535)
        {
            abyte0[1] = (byte)(c1 | 0x7e);
            abyte0[2] = (byte)(int)Math.floor(k1 / 256);
            abyte0[3] = (byte)k1;
        } else
        {
            abyte0[1] = (byte)(c1 | 0x7f);
            abyte0[2] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 56D));
            abyte0[3] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 48D));
            abyte0[4] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 40D));
            abyte0[5] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 32D));
            abyte0[6] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 24D));
            abyte0[7] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 16D));
            abyte0[8] = (byte)(int)Math.floor((double)k1 / Math.pow(2D, 8D));
            abyte0[9] = (byte)k1;
        }
        if (j1 > 0)
        {
            abyte0[l1] = (byte)(int)Math.floor(j1 / 256);
            abyte0[l1 + 1] = (byte)j1;
        }
        System.arraycopy(obj, 0, abyte0, byte1 + l1, obj.length);
        if (b)
        {
            obj = new byte[4];
            obj[0] = (byte)(int)Math.floor(Math.random() * 256D);
            obj[1] = (byte)(int)Math.floor(Math.random() * 256D);
            obj[2] = (byte)(int)Math.floor(Math.random() * 256D);
            obj[3] = (byte)(int)Math.floor(Math.random() * 256D);
            System.arraycopy(obj, 0, abyte0, byte0, obj.length);
            a(abyte0, ((byte []) (obj)), l1);
        }
        return abyte0;
    }

    private static byte[] a(byte abyte0[], byte abyte1[], int i1)
    {
        if (abyte1.length != 0)
        {
            int j1 = 0;
            while (j1 < abyte0.length - i1) 
            {
                abyte0[i1 + j1] = (byte)(abyte0[i1 + j1] ^ abyte1[j1 % 4]);
                j1++;
            }
        }
        return abyte0;
    }

    private static byte[] b(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public final void a(q q1)
    {
        do
        {
            if (q1.available() != -1)
            {
                switch (c)
                {
                case 0: // '\0'
                    byte byte1 = q1.readByte();
                    boolean flag;
                    boolean flag1;
                    boolean flag2;
                    if ((byte1 & 0x40) == 64)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ((byte1 & 0x20) == 32)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if ((byte1 & 0x10) == 16)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag || flag1 || flag2)
                    {
                        throw new r("RSV not zero");
                    }
                    boolean flag3;
                    if ((byte1 & 0x80) == 128)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    d = flag3;
                    f = byte1 & 0xf;
                    j = new byte[0];
                    k = new byte[0];
                    if (!n.contains(Integer.valueOf(f)))
                    {
                        throw new r("Bad opcode");
                    }
                    if (!o.contains(Integer.valueOf(f)) && !d)
                    {
                        throw new r("Expected non-final packet");
                    }
                    c = 1;
                    break;

                case 1: // '\001'
                    byte byte0 = q1.readByte();
                    boolean flag4;
                    if ((byte0 & 0x80) == 128)
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    e = flag4;
                    h = byte0 & 0x7f;
                    if (h >= 0 && h <= 125)
                    {
                        int i1;
                        if (e)
                        {
                            i1 = 3;
                        } else
                        {
                            i1 = 4;
                        }
                        c = i1;
                    } else
                    {
                        int j1;
                        if (h == 126)
                        {
                            j1 = 2;
                        } else
                        {
                            j1 = 8;
                        }
                        g = j1;
                        c = 2;
                    }
                    break;

                case 2: // '\002'
                    byte abyte0[] = q1.a(g);
                    int i2 = abyte0.length;
                    if (abyte0.length < i2)
                    {
                        throw new IllegalArgumentException("length must be less than or equal to b.length");
                    }
                    long l2 = 0L;
                    int k1 = 0;
                    do
                    {
                        if (k1 >= i2)
                        {
                            if (l2 < 0L || l2 > 0x7fffffffL)
                            {
                                throw new r((new StringBuilder("Bad integer: ")).append(l2).toString());
                            }
                            break;
                        }
                        l2 += (abyte0[k1] & 0xff) << (i2 - 1 - k1 << 3);
                        k1++;
                    } while (true);
                    h = (int)l2;
                    if (e)
                    {
                        k1 = 3;
                    } else
                    {
                        k1 = 4;
                    }
                    c = k1;
                    break;

                case 3: // '\003'
                    j = q1.a(4);
                    c = 4;
                    break;

                case 4: // '\004'
                    k = q1.a(h);
                    Object obj = a(k, j, 0);
                    int l1 = f;
                    if (l1 == 0)
                    {
                        if (i == 0)
                        {
                            throw new r("Mode was not set.");
                        }
                        m.write(((byte []) (obj)));
                        if (d)
                        {
                            obj = m.toByteArray();
                            if (i == 1)
                            {
                                a.a().a(a(((byte []) (obj))));
                            } else
                            {
                                a.a().a();
                            }
                            i = 0;
                            m.reset();
                        }
                    } else
                    if (l1 == 1)
                    {
                        if (d)
                        {
                            obj = a(((byte []) (obj)));
                            a.a().a(((String) (obj)));
                        } else
                        {
                            i = 1;
                            m.write(((byte []) (obj)));
                        }
                    } else
                    if (l1 == 2)
                    {
                        if (d)
                        {
                            a.a().a();
                        } else
                        {
                            i = 2;
                            m.write(((byte []) (obj)));
                        }
                    } else
                    if (l1 == 8)
                    {
                        if (obj.length >= 2)
                        {
                            l1 = obj[0] * 256 + obj[1];
                        } else
                        {
                            l1 = 0;
                        }
                        if (obj.length > 2)
                        {
                            int k2 = obj.length;
                            if (2 > k2)
                            {
                                throw new IllegalArgumentException();
                            }
                            int j2 = obj.length;
                            if (2 > j2)
                            {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                            k2 -= 2;
                            j2 = Math.min(k2, j2 - 2);
                            byte abyte1[] = new byte[k2];
                            System.arraycopy(obj, 2, abyte1, 0, j2);
                            obj = a(abyte1);
                        } else
                        {
                            obj = null;
                        }
                        a.a().a(l1, ((String) (obj)));
                    } else
                    if (l1 == 9)
                    {
                        if (obj.length > 125)
                        {
                            throw new r("Ping payload too large");
                        }
                        a.a(a(obj, 10, -1));
                    }
                    c = 0;
                    break;
                }
            } else
            {
                a.a().a(0, "EOF");
                return;
            }
        } while (true);
    }

    public final byte[] a(String s)
    {
        return a(s, 1, -1);
    }

}
