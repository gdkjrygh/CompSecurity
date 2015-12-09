// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            pe, nj, nh, oe, 
//            oi, og, pf, gl, 
//            gn, ow, hl, gh, 
//            gi, oo, nr, kw

public abstract class gr
{

    public static boolean a = true;

    public gr()
    {
    }

    protected static String a(nj nj1)
    {
        int j = ((pe) (nj1)).K.length;
        StringBuffer stringbuffer = new StringBuffer(j * 5 + 2);
        stringbuffer.append('{');
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(nj1.b(i).k());
        }

        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    protected static String a(oi oi1)
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append('#');
        if (oi1 instanceof oe)
        {
            stringbuffer.append("null");
        } else
        {
            stringbuffer.append(oi1.e());
            stringbuffer.append(' ');
            stringbuffer.append(oi1.h_());
        }
        return stringbuffer.toString();
    }

    protected static String a(oi oi1, int i)
    {
        StringBuffer stringbuffer;
        long l;
        stringbuffer = new StringBuffer(20);
        stringbuffer.append("#");
        if (oi1 instanceof og)
        {
            l = ((og)oi1).h();
        } else
        {
            l = oi1.g();
        }
        i;
        JVM INSTR lookupswitch 5: default 84
    //                   4: 103
    //                   8: 136
    //                   16: 149
    //                   32: 162
    //                   64: 175;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new RuntimeException("shouldn't happen");
_L2:
        stringbuffer.append(new String(new char[] {
            Character.forDigit((int)l & 0xf, 16)
        }));
_L8:
        return stringbuffer.toString();
_L3:
        stringbuffer.append(pf.d((int)l));
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append(pf.b((int)l));
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append(pf.a((int)l));
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append(pf.a(l));
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected static short a(int i, int j)
    {
        if ((i & 0xff) != i)
        {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((j & 0xff) != j)
        {
            throw new IllegalArgumentException("high out of range 0..255");
        } else
        {
            return (short)(j << 8 | i);
        }
    }

    protected static short a(gl gl1, int i)
    {
        if ((i & 0xff) != i)
        {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int j = gl1.d.a;
        if ((j & 0xff) != j)
        {
            throw new IllegalArgumentException("opcode out of range 0..255");
        } else
        {
            return (short)(j | i << 8);
        }
    }

    protected static void a(ow ow1, short word0, int i)
    {
        a(ow1, word0, (short)i, (short)(i >> 16));
    }

    protected static void a(ow ow1, short word0, int i, short word1, short word2)
    {
        a(ow1, word0, (short)i, (short)(i >> 16), word1, word2);
    }

    protected static void a(ow ow1, short word0, short word1)
    {
        ow1.c(word0);
        ow1.c(word1);
    }

    protected static void a(ow ow1, short word0, short word1, short word2)
    {
        ow1.c(word0);
        ow1.c(word1);
        ow1.c(word2);
    }

    public static void a(ow ow1, short word0, short word1, short word2, short word3, short word4)
    {
        ow1.c(word0);
        ow1.c(word1);
        ow1.c(word2);
        ow1.c(word3);
        ow1.c(word4);
    }

    protected static boolean a(int i)
    {
        return i == (i & 0xf);
    }

    protected static int b(int i, int j)
    {
        if ((i & 0xf) != i)
        {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((j & 0xf) != j)
        {
            throw new IllegalArgumentException("high out of range 0..15");
        } else
        {
            return j << 4 | i;
        }
    }

    protected static String b(nj nj1)
    {
        StringBuilder stringbuilder;
        int i;
        i = ((pe) (nj1)).K.length;
        stringbuilder = new StringBuilder(30);
        stringbuilder.append("{");
        i;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 102
    //                   1 114;
           goto _L1 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        nh nh2 = nj1.b(i - 1);
        nh nh1 = nh2;
        if (nh2.i() == 2)
        {
            nh1 = nh2.b(1);
        }
        stringbuilder.append(nj1.b(0).k());
        stringbuilder.append("..");
        stringbuilder.append(nh1.k());
_L5:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L3:
        stringbuilder.append(nj1.b(0).k());
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected static boolean b(int i)
    {
        return (byte)i == i;
    }

    protected static boolean c(int i)
    {
        return i == (i & 0xff);
    }

    protected static boolean c(nj nj1)
    {
        int k = ((pe) (nj1)).K.length;
        if (k >= 2)
        {
            int j = nj1.b(0).e();
            int i = 0;
            while (i < k) 
            {
                nh nh1 = nj1.b(i);
                if (nh1.e() != j)
                {
                    return false;
                }
                j += nh1.i();
                i++;
            }
        }
        return true;
    }

    protected static String d(gl gl1)
    {
        int i = ((hl)gl1).a.d();
        if (i == (char)i)
        {
            return pf.b(i);
        } else
        {
            return pf.a(i);
        }
    }

    protected static boolean d(int i)
    {
        return (short)i == i;
    }

    protected static String e(gl gl1)
    {
        int i = ((hl)gl1).b();
        if (i == (short)i)
        {
            gl1 = new char[5];
            int j;
            boolean flag;
            if (i < 0)
            {
                gl1[0] = '-';
                i = -i;
            } else
            {
                gl1[0] = '+';
            }
            flag = false;
            j = i;
            for (i = ((flag) ? 1 : 0); i < 4; i++)
            {
                gl1[4 - i] = Character.forDigit(j & 0xf, 16);
                j >>= 4;
            }

            return new String(gl1);
        } else
        {
            return pf.e(i);
        }
    }

    protected static boolean e(int i)
    {
        return i == (0xffff & i);
    }

    protected static String f(gl gl1)
    {
        gl1 = ((gi)gl1).a;
        if (gl1 instanceof oo)
        {
            return ((oo)gl1).f();
        } else
        {
            return gl1.h_();
        }
    }

    protected static String g(gl gl1)
    {
        gl1 = (gi)gl1;
        boolean flag;
        if (((gi) (gl1)).b >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(20);
        int i = gl1.b();
        stringbuilder.append(((gi) (gl1)).a.e());
        stringbuilder.append('@');
        if (i < 0x10000)
        {
            stringbuilder.append(pf.b(i));
        } else
        {
            stringbuilder.append(pf.a(i));
        }
        return stringbuilder.toString();
    }

    protected static short h(gl gl1)
    {
        int i = gl1.d.a;
        if (i < 255 || i > 65535)
        {
            throw new IllegalArgumentException("extended opcode out of range 255..65535");
        } else
        {
            return (short)i;
        }
    }

    public abstract int a();

    public abstract String a(gl gl1);

    public final String a(gl gl1, boolean flag)
    {
        String s = kw.a(gl1.d.a);
        String s1 = a(gl1);
        gl1 = b(gl1, flag);
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append(s);
        if (s1.length() != 0)
        {
            stringbuilder.append(' ');
            stringbuilder.append(s1);
        }
        if (gl1.length() != 0)
        {
            stringbuilder.append(" // ");
            stringbuilder.append(gl1);
        }
        return stringbuilder.toString();
    }

    public abstract void a(ow ow1, gl gl1);

    public boolean a(hl hl1)
    {
        return false;
    }

    public abstract String b(gl gl1, boolean flag);

    public abstract boolean b(gl gl1);

    public BitSet c(gl gl1)
    {
        return new BitSet();
    }

}
