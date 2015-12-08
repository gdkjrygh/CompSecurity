// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.b;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

// Referenced classes of package it.sephiroth.android.library.b:
//            l

public class h
{

    private static final int a[];
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    private static Charset c = Charset.forName("US-ASCII");
    private final short d;
    private final short e;
    private boolean f;
    private int g;
    private int h;
    private Object i;
    private int j;

    h(short word0, short word1, int i1, int j1, boolean flag)
    {
        d = word0;
        e = word1;
        g = i1;
        f = flag;
        h = j1;
        i = null;
    }

    public static boolean a(int i1)
    {
        return i1 == 0 || i1 == 1 || i1 == 2 || i1 == 3 || i1 == 4;
    }

    public static boolean a(short word0)
    {
        return word0 == 1 || word0 == 2 || word0 == 3 || word0 == 4 || word0 == 5 || word0 == 7 || word0 == 9 || word0 == 10;
    }

    public static int b(short word0)
    {
        return a[word0];
    }

    private boolean b(int ai[])
    {
        boolean flag1 = false;
        int j1 = ai.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    int k1 = ai[i1];
                    if (k1 <= 65535 && k1 >= 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private boolean b(long al[])
    {
        boolean flag1 = false;
        int j1 = al.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    long l1 = al[i1];
                    if (l1 >= 0L && l1 <= 0xffffffffL)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private boolean b(l al[])
    {
        boolean flag1 = false;
        int j1 = al.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    l l1 = al[i1];
                    if (l1.a() >= 0L && l1.b() >= 0L && l1.a() <= 0xffffffffL && l1.b() <= 0xffffffffL)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private static String c(short word0)
    {
        switch (word0)
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return "";

        case 1: // '\001'
            return "UNSIGNED_BYTE";

        case 2: // '\002'
            return "ASCII";

        case 3: // '\003'
            return "UNSIGNED_SHORT";

        case 4: // '\004'
            return "UNSIGNED_LONG";

        case 5: // '\005'
            return "UNSIGNED_RATIONAL";

        case 7: // '\007'
            return "UNDEFINED";

        case 9: // '\t'
            return "LONG";

        case 10: // '\n'
            return "RATIONAL";
        }
    }

    private boolean c(int ai[])
    {
        boolean flag1 = false;
        int j1 = ai.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    if (ai[i1] >= 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private boolean c(l al[])
    {
        boolean flag1 = false;
        int j1 = al.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    l l1 = al[i1];
                    if (l1.a() >= 0xffffffff80000000L && l1.b() >= 0xffffffff80000000L && l1.a() <= 0x7fffffffL && l1.b() <= 0x7fffffffL)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private boolean h(int i1)
    {
        return f && g != i1;
    }

    public int a()
    {
        return h;
    }

    protected void a(boolean flag)
    {
        f = flag;
    }

    public boolean a(byte byte0)
    {
        return a(new byte[] {
            byte0
        });
    }

    public boolean a(long l1)
    {
        return a(new long[] {
            l1
        });
    }

    public boolean a(l l1)
    {
        return a(new l[] {
            l1
        });
    }

    public boolean a(Object obj)
    {
        int i1 = 0;
        if (obj != null)
        {
            if (obj instanceof Short)
            {
                return d(((Short)obj).shortValue() & 0xffff);
            }
            if (obj instanceof String)
            {
                return a((String)obj);
            }
            if (obj instanceof int[])
            {
                return a((int[])(int[])obj);
            }
            if (obj instanceof long[])
            {
                return a((long[])(long[])obj);
            }
            if (obj instanceof l)
            {
                return a((l)obj);
            }
            if (obj instanceof l[])
            {
                return a((l[])(l[])obj);
            }
            if (obj instanceof byte[])
            {
                return a((byte[])(byte[])obj);
            }
            if (obj instanceof Integer)
            {
                return d(((Integer)obj).intValue());
            }
            if (obj instanceof Long)
            {
                return a(((Long)obj).longValue());
            }
            if (obj instanceof Byte)
            {
                return a(((Byte)obj).byteValue());
            }
            if (obj instanceof Short[])
            {
                obj = (Short[])(Short[])obj;
                int ai[] = new int[obj.length];
                i1 = 0;
                while (i1 < obj.length) 
                {
                    int k1;
                    if (obj[i1] == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = obj[i1].shortValue() & 0xffff;
                    }
                    ai[i1] = k1;
                    i1++;
                }
                return a(ai);
            }
            if (obj instanceof Integer[])
            {
                obj = (Integer[])(Integer[])obj;
                int ai1[] = new int[obj.length];
                i1 = 0;
                while (i1 < obj.length) 
                {
                    int l1;
                    if (obj[i1] == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = obj[i1].intValue();
                    }
                    ai1[i1] = l1;
                    i1++;
                }
                return a(ai1);
            }
            if (obj instanceof Long[])
            {
                obj = (Long[])(Long[])obj;
                long al[] = new long[obj.length];
                while (i1 < obj.length) 
                {
                    long l2;
                    if (obj[i1] == null)
                    {
                        l2 = 0L;
                    } else
                    {
                        l2 = obj[i1].longValue();
                    }
                    al[i1] = l2;
                    i1++;
                }
                return a(al);
            }
            if (obj instanceof Byte[])
            {
                obj = (Byte[])(Byte[])obj;
                byte abyte0[] = new byte[obj.length];
                int j1 = 0;
                while (j1 < obj.length) 
                {
                    byte byte0;
                    if (obj[j1] == null)
                    {
                        byte0 = 0;
                    } else
                    {
                        byte0 = obj[j1].byteValue();
                    }
                    abyte0[j1] = byte0;
                    j1++;
                }
                return a(abyte0);
            }
        }
        return false;
    }

    public boolean a(String s)
    {
        if (e != 2 && e != 7)
        {
            return false;
        }
        byte abyte0[] = s.getBytes(c);
        int i1;
        if (abyte0.length > 0)
        {
            s = abyte0;
            if (abyte0[abyte0.length - 1] != 0)
            {
                if (e == 7)
                {
                    s = abyte0;
                } else
                {
                    s = Arrays.copyOf(abyte0, abyte0.length + 1);
                }
            }
        } else
        {
            s = abyte0;
            if (e == 2)
            {
                s = abyte0;
                if (g == 1)
                {
                    s = new byte[1];
                    s[0] = 0;
                }
            }
        }
        i1 = s.length;
        if (h(i1))
        {
            return false;
        } else
        {
            g = i1;
            i = s;
            return true;
        }
    }

    public boolean a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public boolean a(byte abyte0[], int i1, int j1)
    {
        while (h(j1) || e != 1 && e != 7) 
        {
            return false;
        }
        i = new byte[j1];
        System.arraycopy(abyte0, i1, i, 0, j1);
        g = j1;
        return true;
    }

    public boolean a(int ai[])
    {
        int i1;
        for (i1 = 0; h(ai.length) || e != 3 && e != 9 && e != 4 || e == 3 && b(ai) || e == 4 && c(ai);)
        {
            return false;
        }

        long al[] = new long[ai.length];
        for (; i1 < ai.length; i1++)
        {
            al[i1] = ai[i1];
        }

        i = al;
        g = ai.length;
        return true;
    }

    public boolean a(long al[])
    {
        while (h(al.length) || e != 4 || b(al)) 
        {
            return false;
        }
        i = al;
        g = al.length;
        return true;
    }

    public boolean a(l al[])
    {
        while (h(al.length) || e != 5 && e != 10 || e == 5 && b(al) || e == 10 && c(al)) 
        {
            return false;
        }
        i = al;
        g = al.length;
        return true;
    }

    public short b()
    {
        return d;
    }

    protected void b(int i1)
    {
        h = i1;
    }

    protected void b(byte abyte0[])
    {
        b(abyte0, 0, abyte0.length);
    }

    protected void b(byte abyte0[], int i1, int j1)
    {
        if (e != 7 && e != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot get BYTE value from ").append(c(e)).toString());
        }
        Object obj = i;
        int k1 = j1;
        if (j1 > g)
        {
            k1 = g;
        }
        System.arraycopy(obj, 0, abyte0, i1, k1);
    }

    public int c()
    {
        return d() * b(e());
    }

    protected void c(int i1)
    {
        g = i1;
    }

    public int d()
    {
        return g;
    }

    public boolean d(int i1)
    {
        return a(new int[] {
            i1
        });
    }

    protected long e(int i1)
    {
        if (i instanceof long[])
        {
            return ((long[])(long[])i)[i1];
        }
        if (i instanceof byte[])
        {
            return (long)((byte[])(byte[])i)[i1];
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot get integer value from ").append(c(e)).toString());
        }
    }

    public short e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
_L2:
        return false;
        if (obj == null || !(obj instanceof h)) goto _L2; else goto _L1
_L1:
        obj = (h)obj;
        if (((h) (obj)).d != d || ((h) (obj)).g != g || ((h) (obj)).e != e)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((h) (obj)).i == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(i instanceof long[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((h) (obj)).i instanceof long[])
        {
            return Arrays.equals((long[])(long[])i, (long[])(long[])((h) (obj)).i);
        }
        if (true) goto _L2; else goto _L3
_L3:
        if (!(i instanceof l[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((h) (obj)).i instanceof l[])
        {
            return Arrays.equals((l[])(l[])i, (l[])(l[])((h) (obj)).i);
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (i instanceof byte[])
        {
            if (((h) (obj)).i instanceof byte[])
            {
                return Arrays.equals((byte[])(byte[])i, (byte[])(byte[])((h) (obj)).i);
            }
        } else
        {
            return i.equals(((h) (obj)).i);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((h) (obj)).i != null) goto _L2; else goto _L6
_L6:
        return true;
    }

    protected l f(int i1)
    {
        if (e != 10 && e != 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot get RATIONAL value from ").append(c(e)).toString());
        } else
        {
            return ((l[])(l[])i)[i1];
        }
    }

    public boolean f()
    {
        return i != null;
    }

    protected void g(int i1)
    {
        j = i1;
    }

    public int[] g()
    {
        while (i == null || !(i instanceof long[])) 
        {
            return null;
        }
        long al[] = (long[])(long[])i;
        int ai[] = new int[al.length];
        for (int i1 = 0; i1 < al.length; i1++)
        {
            ai[i1] = (int)al[i1];
        }

        return ai;
    }

    public Object h()
    {
        return i;
    }

    protected byte[] i()
    {
        return (byte[])(byte[])i;
    }

    protected int j()
    {
        return j;
    }

    protected boolean k()
    {
        return f;
    }

    public String l()
    {
        if (i == null)
        {
            return "";
        }
        if (i instanceof byte[])
        {
            if (e == 2)
            {
                return new String((byte[])(byte[])i, c);
            } else
            {
                return Arrays.toString((byte[])(byte[])i);
            }
        }
        if (i instanceof long[])
        {
            if (((long[])(long[])i).length == 1)
            {
                return String.valueOf(((long[])(long[])i)[0]);
            } else
            {
                return Arrays.toString((long[])(long[])i);
            }
        }
        if (i instanceof Object[])
        {
            if (((Object[])(Object[])i).length == 1)
            {
                Object obj = ((Object[])(Object[])i)[0];
                if (obj == null)
                {
                    return "";
                } else
                {
                    return obj.toString();
                }
            } else
            {
                return Arrays.toString((Object[])(Object[])i);
            }
        } else
        {
            return i.toString();
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(String.format("tag id: %04X\n", new Object[] {
            Short.valueOf(d)
        })).append("ifd id: ").append(h).append("\ntype: ").append(c(e)).append("\ncount: ").append(g).append("\noffset: ").append(j).append("\nvalue: ").append(l()).append("\n").toString();
    }

    static 
    {
        a = new int[11];
        a[1] = 1;
        a[2] = 1;
        a[3] = 2;
        a[4] = 4;
        a[5] = 8;
        a[7] = 1;
        a[9] = 4;
        a[10] = 8;
    }
}
