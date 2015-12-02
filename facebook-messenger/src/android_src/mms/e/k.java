// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package android_src.mms.e:
//            p, f, m, e, 
//            q, o, z, j, 
//            s

public class k
{

    static final boolean c;
    private static HashMap h;
    protected ByteArrayOutputStream a;
    protected int b;
    private f d;
    private m e;
    private final ContentResolver f;
    private q g;

    public k(Context context, f f1)
    {
        a = null;
        d = null;
        b = 0;
        e = null;
        g = null;
        d = f1;
        f = context.getContentResolver();
        g = f1.e();
        e = new m(this, null);
        a = new ByteArrayOutputStream();
        b = 0;
    }

    static m a(k k1)
    {
        return k1.e;
    }

    private int b()
    {
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(135);
        break MISSING_BLOCK_LABEL_37;
        if (e(141) == 0 && e(139) == 0 && e(151) == 0 && e(137) == 0)
        {
            e(133);
            if (e(155) == 0)
            {
                return 0;
            }
        }
        return 1;
    }

    private e b(e e1)
    {
        int i;
        try
        {
            i = c(e1.c());
            e1 = android_src.mms.e.e.a(e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            return null;
        }
        if (1 != i)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        e1.b("/TYPE=PLMN".getBytes());
        return e1;
        if (3 != i)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        e1.b("/TYPE=IPV4".getBytes());
        return e1;
        if (4 != i)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        e1.b("/TYPE=IPV6".getBytes());
        return e1;
    }

    private int c()
    {
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(131);
        while (e(152) != 0 || e(141) != 0 || e(149) != 0) 
        {
            return 1;
        }
        return 0;
    }

    protected static int c(String s1)
    {
        if (s1 != null)
        {
            if (s1.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}"))
            {
                return 3;
            }
            if (s1.matches("\\+?[0-9|\\.|\\-]+"))
            {
                return 1;
            }
            if (s1.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}"))
            {
                return 2;
            }
            if (s1.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}"))
            {
                return 4;
            }
        }
        return 5;
    }

    private int d()
    {
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(133);
        while (e(152) != 0 || e(141) != 0) 
        {
            return 1;
        }
        e(145);
        return 0;
    }

    private int e()
    {
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(128);
        c(152);
        byte abyte0[] = g.b(152);
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Transaction-ID is null.");
        }
        a(abyte0);
        if (e(141) == 0)
        {
            e(133);
            if (e(137) == 0)
            {
                boolean flag;
                if (e(151) != 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (e(130) != 1)
                {
                    flag = true;
                }
                if (e(129) != 1)
                {
                    flag = true;
                }
                if (flag)
                {
                    e(150);
                    e(138);
                    e(136);
                    e(143);
                    e(134);
                    e(144);
                    c(132);
                    f();
                    return 0;
                }
            }
        }
        return 1;
    }

    private int e(int i)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 129 155: default 128
    //                   129 194
    //                   130 194
    //                   131 128
    //                   132 128
    //                   133 414
    //                   134 384
    //                   135 128
    //                   136 586
    //                   137 257
    //                   138 475
    //                   139 167
    //                   140 128
    //                   141 134
    //                   142 128
    //                   143 384
    //                   144 384
    //                   145 384
    //                   146 128
    //                   147 128
    //                   148 128
    //                   149 384
    //                   150 448
    //                   151 194
    //                   152 167
    //                   153 128
    //                   154 128
    //                   155 384;
           goto _L1 _L2 _L2 _L1 _L1 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L1 _L9 _L1 _L4 _L4 _L4 _L1 _L1 _L1 _L4 _L10 _L2 _L8 _L1 _L1 _L4
_L1:
        byte byte0 = 3;
_L12:
        return byte0;
_L9:
        c(i);
        i = g.a(i);
        if (i == 0)
        {
            b(18);
            return 0;
        } else
        {
            b(i);
            return 0;
        }
_L8:
        byte abyte0[] = g.b(i);
        if (abyte0 == null)
        {
            return 2;
        } else
        {
            c(i);
            a(abyte0);
            return 0;
        }
_L2:
        e ae[];
        int i1;
        ae = g.d(i);
        if (ae == null)
        {
            return 2;
        }
        i1 = 0;
_L13:
        byte0 = flag;
        if (i1 >= ae.length) goto _L12; else goto _L11
_L11:
        e e2 = b(ae[i1]);
        if (e2 == null)
        {
            return 1;
        }
        c(i);
        a(e2);
        i1++;
          goto _L13
          goto _L12
_L6:
        c(i);
        e e3 = g.c(i);
        if (e3 == null || TextUtils.isEmpty(e3.c()) || (new String(e3.b())).equals("insert-address-token"))
        {
            a(1);
            a(129);
            return 0;
        }
        e.a();
        o o1 = e.d();
        a(128);
        e3 = b(e3);
        if (e3 == null)
        {
            return 1;
        } else
        {
            a(e3);
            i = o1.a();
            e.b();
            d(i);
            e.c();
            return 0;
        }
_L4:
        int l = g.a(i);
        if (l == 0)
        {
            return 2;
        } else
        {
            c(i);
            c(l);
            return 0;
        }
_L3:
        long l1 = g.e(i);
        if (-1L == l1)
        {
            return 2;
        } else
        {
            c(i);
            c(l1);
            return 0;
        }
_L10:
        e e1 = g.c(i);
        if (e1 == null)
        {
            return 2;
        } else
        {
            c(i);
            a(e1);
            return 0;
        }
_L7:
        byte abyte1[] = g.b(i);
        if (abyte1 == null)
        {
            return 2;
        }
        c(i);
        if (Arrays.equals(abyte1, "advertisement".getBytes()))
        {
            c(129);
            return 0;
        }
        if (Arrays.equals(abyte1, "auto".getBytes()))
        {
            c(131);
            return 0;
        }
        if (Arrays.equals(abyte1, "personal".getBytes()))
        {
            c(128);
            return 0;
        }
        if (Arrays.equals(abyte1, "informational".getBytes()))
        {
            c(130);
            return 0;
        } else
        {
            a(abyte1);
            return 0;
        }
_L5:
        long l2 = g.e(i);
        if (-1L == l2)
        {
            return 2;
        } else
        {
            c(i);
            e.a();
            o o2 = e.d();
            a(129);
            a(l2);
            i = o2.a();
            e.b();
            d(i);
            e.c();
            return 0;
        }
    }

    private int f()
    {
        o o1;
        j j1;
        e.a();
        o1 = e.d();
        Object obj = new String(g.b(132));
        obj = (Integer)h.get(obj);
        if (obj == null)
        {
            return 1;
        }
        b(((Integer) (obj)).intValue());
        j1 = ((z)d).a();
        if (j1 == null || j1.b() == 0)
        {
            b(0L);
            e.b();
            e.c();
            return 0;
        }
        s s1;
        byte abyte2[];
        s1 = j1.a(0);
        abyte2 = s1.c();
        if (abyte2 == null) goto _L2; else goto _L1
_L1:
        c(138);
        if (60 != abyte2[0]) goto _L4; else goto _L3
_L3:
        if (62 != abyte2[abyte2.length - 1]) goto _L4; else goto _L5
_L5:
        a(abyte2);
_L2:
        c(137);
        a(s1.g());
_L8:
        int k1;
        int i2;
        int i = o1.a();
        e.b();
        d(i);
        e.c();
        i2 = j1.b();
        b(i2);
        k1 = 0;
_L13:
        s s2;
        if (k1 >= i2) goto _L7; else goto _L6
_L4:
        try
        {
            a((new StringBuilder()).append("<").append(new String(abyte2)).append(">").toString());
            continue; /* Loop/switch isn't completed */
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            arrayindexoutofboundsexception.printStackTrace();
        }
          goto _L8
_L6:
        int l1;
        int j2;
        s2 = j1.a(k1);
        e.a();
        abyte2 = e.d();
        e.a();
        o o2 = e.d();
        byte abyte0[] = s2.g();
        if (abyte0 == null)
        {
            return 1;
        }
        Object obj1 = (Integer)h.get(new String(abyte0));
        if (obj1 == null)
        {
            a(abyte0);
        } else
        {
            b(((Integer) (obj1)).intValue());
        }
        obj1 = s2.i();
        abyte0 = ((byte []) (obj1));
        if (obj1 == null)
        {
            obj1 = s2.j();
            abyte0 = ((byte []) (obj1));
            if (obj1 == null)
            {
                obj1 = s2.e();
                abyte0 = ((byte []) (obj1));
                if (obj1 == null)
                {
                    return 1;
                }
            }
        }
        c(133);
        a(abyte0);
        int l = s2.d();
        if (l != 0)
        {
            c(129);
            b(l);
        }
        l = o2.a();
        e.b();
        d(l);
        e.c();
        abyte0 = s2.c();
        if (abyte0 != null)
        {
            c(192);
            if (60 == abyte0[0] && 62 == abyte0[abyte0.length - 1])
            {
                b(abyte0);
            } else
            {
                b((new StringBuilder()).append("<").append(new String(abyte0)).append(">").toString());
            }
        }
        abyte0 = s2.e();
        if (abyte0 != null)
        {
            c(142);
            a(abyte0);
        }
        j2 = abyte2.a();
        abyte0 = s2.a();
        if (abyte0 == null) goto _L10; else goto _L9
_L9:
        a(abyte0, 0, abyte0.length);
        l1 = abyte0.length;
_L12:
        if (l1 != abyte2.a() - j2)
        {
            throw new RuntimeException("BUG: Length sanity check failed");
        }
        break MISSING_BLOCK_LABEL_696;
_L10:
        byte abyte1[];
        InputStream inputstream;
        int i1;
        int k2;
        try
        {
            abyte1 = new byte[1024];
            inputstream = f.openInputStream(s2.b());
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return 1;
        }
        catch (IOException ioexception)
        {
            return 1;
        }
        catch (RuntimeException runtimeexception)
        {
            return 1;
        }
        i1 = 0;
        k2 = inputstream.read(abyte1);
        l1 = i1;
        if (k2 == -1) goto _L12; else goto _L11
_L11:
        a.write(abyte1, 0, k2);
        b = b + k2;
        i1 += k2;
        break MISSING_BLOCK_LABEL_638;
        e.b();
        b(j2);
        b(l1);
        e.c();
        k1++;
          goto _L13
_L7:
        return 0;
        if (true) goto _L2; else goto _L14
_L14:
    }

    protected void a(int i)
    {
        a.write(i);
        b = b + 1;
    }

    protected void a(long l)
    {
        int i1 = 0;
        long l1 = l;
        int i;
        for (i = 0; l1 != 0L && i < 8; i++)
        {
            l1 >>>= 8;
        }

        d(i);
        int j1 = (i - 1) * 8;
        for (; i1 < i; i1++)
        {
            a((int)(l >>> j1 & 255L));
            j1 -= 8;
        }

    }

    protected void a(e e1)
    {
        if (!c && e1 == null)
        {
            throw new AssertionError();
        }
        int i = e1.a();
        e1 = e1.b();
        if (e1 == null)
        {
            return;
        } else
        {
            e.a();
            o o1 = e.d();
            b(i);
            a(((byte []) (e1)));
            i = o1.a();
            e.b();
            d(i);
            e.c();
            return;
        }
    }

    protected void a(String s1)
    {
        a(s1.getBytes());
    }

    protected void a(byte abyte0[])
    {
        if ((abyte0[0] & 0xff) > 127)
        {
            a(127);
        }
        a(abyte0, 0, abyte0.length);
        a(0);
    }

    protected void a(byte abyte0[], int i, int l)
    {
        a.write(abyte0, i, l);
        b = b + l;
    }

    public byte[] a()
    {
        d.f();
        JVM INSTR tableswitch 128 135: default 52
    //                   128 54
    //                   129 52
    //                   130 52
    //                   131 69
    //                   132 52
    //                   133 78
    //                   134 52
    //                   135 87;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4 _L1 _L5
_L1:
        return null;
_L2:
        if (e() != 0) goto _L1; else goto _L6
_L6:
        return a.toByteArray();
_L3:
        if (c() != 0)
        {
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d() != 0)
        {
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b() != 0)
        {
            return null;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected void b(int i)
    {
        a((i | 0x80) & 0xff);
    }

    protected void b(long l)
    {
        int i = 0;
        long l1 = 127L;
label0:
        do
        {
label1:
            {
                int i1 = i;
                if (i < 5)
                {
                    if (l >= l1)
                    {
                        break label1;
                    }
                }
                for (i1 = i; i1 > 0; i1--)
                {
                    a((int)((l >>> i1 * 7 & 127L | 128L) & 255L));
                }

                break label0;
            }
            l1 = l1 << 7 | 127L;
            i++;
        } while (true);
        a((int)(l & 127L));
    }

    protected void b(String s1)
    {
        b(s1.getBytes());
    }

    protected void b(byte abyte0[])
    {
        a(34);
        a(abyte0, 0, abyte0.length);
        a(0);
    }

    protected void c(int i)
    {
        a(i);
    }

    protected void c(long l)
    {
        a(l);
    }

    protected void d(int i)
    {
        a(i);
    }

    protected void d(long l)
    {
        if (l < 31L)
        {
            d((int)l);
            return;
        } else
        {
            a(31);
            b(l);
            return;
        }
    }

    static 
    {
        int i = 0;
        boolean flag;
        if (!android_src/mms/e/k.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        h = null;
        h = new HashMap();
        for (; i < p.a.length; i++)
        {
            h.put(p.a[i], Integer.valueOf(i));
        }

    }
}
