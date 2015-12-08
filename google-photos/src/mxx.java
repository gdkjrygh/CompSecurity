// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class mxx
{

    private static final Charset h = Charset.forName("US-ASCII");
    private static final int i[];
    final short a;
    final short b;
    boolean c;
    int d;
    int e;
    public Object f;
    int g;

    mxx(short word0, short word1, int j, int k, boolean flag)
    {
        a = word0;
        b = word1;
        d = j;
        c = flag;
        e = k;
        f = null;
    }

    public static boolean a(int j)
    {
        return j == 0 || j == 1 || j == 2 || j == 3 || j == 4;
    }

    public static boolean a(short word0)
    {
        return word0 == 1 || word0 == 2 || word0 == 3 || word0 == 4 || word0 == 5 || word0 == 7 || word0 == 9 || word0 == 10;
    }

    private static String b(short word0)
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

    private boolean e(int j)
    {
        return c && d != j;
    }

    public final int a()
    {
        int j = d;
        short word0 = b;
        return j * i[word0];
    }

    public final boolean a(Object obj)
    {
        int j = 0;
        if (obj != null)
        {
            if (obj instanceof Short)
            {
                return b(((Short)obj).shortValue() & 0xffff);
            }
            if (obj instanceof String)
            {
                return a((String)obj);
            }
            if (obj instanceof int[])
            {
                return a((int[])obj);
            }
            if (obj instanceof long[])
            {
                return a((long[])obj);
            }
            if (obj instanceof myb)
            {
                return a(new myb[] {
                    (myb)obj
                });
            }
            if (obj instanceof myb[])
            {
                return a((myb[])obj);
            }
            if (obj instanceof byte[])
            {
                return a((byte[])obj);
            }
            if (obj instanceof Integer)
            {
                return b(((Integer)obj).intValue());
            }
            if (obj instanceof Long)
            {
                return a(new long[] {
                    ((Long)obj).longValue()
                });
            }
            if (obj instanceof Byte)
            {
                return a(new byte[] {
                    ((Byte)obj).byteValue()
                });
            }
            if (obj instanceof Short[])
            {
                obj = (Short[])obj;
                int ai[] = new int[obj.length];
                j = 0;
                while (j < obj.length) 
                {
                    int l;
                    if (obj[j] == null)
                    {
                        l = 0;
                    } else
                    {
                        l = obj[j].shortValue() & 0xffff;
                    }
                    ai[j] = l;
                    j++;
                }
                return a(ai);
            }
            if (obj instanceof Integer[])
            {
                obj = (Integer[])obj;
                int ai1[] = new int[obj.length];
                j = 0;
                while (j < obj.length) 
                {
                    int i1;
                    if (obj[j] == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = obj[j].intValue();
                    }
                    ai1[j] = i1;
                    j++;
                }
                return a(ai1);
            }
            if (obj instanceof Long[])
            {
                obj = (Long[])obj;
                long al[] = new long[obj.length];
                while (j < obj.length) 
                {
                    long l1;
                    if (obj[j] == null)
                    {
                        l1 = 0L;
                    } else
                    {
                        l1 = obj[j].longValue();
                    }
                    al[j] = l1;
                    j++;
                }
                return a(al);
            }
            if (obj instanceof Byte[])
            {
                obj = (Byte[])obj;
                byte abyte0[] = new byte[obj.length];
                int k = 0;
                while (k < obj.length) 
                {
                    byte byte0;
                    if (obj[k] == null)
                    {
                        byte0 = 0;
                    } else
                    {
                        byte0 = obj[k].byteValue();
                    }
                    abyte0[k] = byte0;
                    k++;
                }
                return a(abyte0);
            }
        }
        return false;
    }

    public final boolean a(String s)
    {
        if (b != 2 && b != 7)
        {
            return false;
        }
        byte abyte0[] = s.getBytes(h);
        int j;
        if (abyte0.length > 0)
        {
            s = abyte0;
            if (b == 2)
            {
                s = abyte0;
                if (abyte0[abyte0.length - 1] != 0)
                {
                    if (c && abyte0.length == d)
                    {
                        abyte0[abyte0.length - 1] = 0;
                        s = abyte0;
                    } else
                    {
                        s = Arrays.copyOf(abyte0, abyte0.length + 1);
                    }
                }
            }
        } else
        {
            s = abyte0;
            if (b == 2)
            {
                s = abyte0;
                if (d == 1)
                {
                    s = new byte[1];
                    s[0] = 0;
                }
            }
        }
        j = s.length;
        if (e(j))
        {
            return false;
        } else
        {
            d = j;
            f = s;
            return true;
        }
    }

    public final boolean a(byte abyte0[])
    {
        int j;
        for (j = abyte0.length; e(j) || b != 1 && b != 7;)
        {
            return false;
        }

        f = new byte[j];
        System.arraycopy(abyte0, 0, f, 0, j);
        d = j;
        return true;
    }

    public final boolean a(int ai[])
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_3;
_L6:
        int j;
        int k;
        do
        {
            return false;
        } while (e(ai.length) || b != 3 && b != 9 && b != 4);
        if (b != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai.length;
        j = 0;
_L10:
        if (j >= k) goto _L2; else goto _L1
_L1:
        int l = ai[j];
        if (l <= 65535 && l >= 0) goto _L4; else goto _L3
_L3:
        j = 1;
_L11:
        if (j != 0) goto _L6; else goto _L5
_L5:
        if (b != 4)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai.length;
        j = 0;
_L12:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (ai[j] >= 0) goto _L8; else goto _L7
_L7:
        j = 1;
_L13:
        if (j != 0) goto _L6; else goto _L9
_L9:
        long al[];
        al = new long[ai.length];
        for (j = ((flag) ? 1 : 0); j < ai.length; j++)
        {
            al[j] = ai[j];
        }

        break MISSING_BLOCK_LABEL_166;
_L4:
        j++;
          goto _L10
_L2:
        j = 0;
          goto _L11
_L8:
        j++;
          goto _L12
        j = 0;
          goto _L13
        f = al;
        d = ai.length;
        return true;
          goto _L10
    }

    public final boolean a(long al[])
    {
        if (!e(al.length) && b == 4) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j;
        int k;
        k = al.length;
        j = 0;
_L5:
        long l;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        l = al[j];
        if (l >= 0L && l <= 0xffffffffL) goto _L4; else goto _L3
_L3:
        j = 1;
_L6:
        if (j == 0)
        {
            f = al;
            d = al.length;
            return true;
        }
          goto _L1
_L4:
        j++;
          goto _L5
        j = 0;
          goto _L6
    }

    public final boolean a(myb amyb[])
    {
_L2:
        return false;
        if (e(amyb.length) || b != 5 && b != 10) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        if (b != 5)
        {
            break; /* Loop/switch isn't completed */
        }
        k = amyb.length;
        j = 0;
_L11:
        if (j >= k) goto _L4; else goto _L3
_L3:
        myb myb1 = amyb[j];
        if (myb1.a >= 0L && myb1.b >= 0L && myb1.a <= 0xffffffffL && myb1.b <= 0xffffffffL) goto _L6; else goto _L5
_L5:
        j = 1;
_L12:
        if (j != 0) goto _L2; else goto _L7
_L7:
        if (b != 10)
        {
            break; /* Loop/switch isn't completed */
        }
        k = amyb.length;
        j = 0;
_L13:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        myb1 = amyb[j];
        if (myb1.a >= 0xffffffff80000000L && myb1.b >= 0xffffffff80000000L && myb1.a <= 0x7fffffffL && myb1.b <= 0x7fffffffL) goto _L9; else goto _L8
_L8:
        j = 1;
_L14:
        if (j != 0) goto _L2; else goto _L10
_L10:
        f = amyb;
        d = amyb.length;
        return true;
_L6:
        j++;
          goto _L11
_L4:
        j = 0;
          goto _L12
_L9:
        j++;
          goto _L13
        j = 0;
          goto _L14
    }

    protected final void b(byte abyte0[])
    {
        int j = abyte0.length;
        if (b != 7 && b != 1)
        {
            abyte0 = String.valueOf(b(b));
            if (abyte0.length() != 0)
            {
                abyte0 = "Cannot get BYTE value from ".concat(abyte0);
            } else
            {
                abyte0 = new String("Cannot get BYTE value from ");
            }
            throw new IllegalArgumentException(abyte0);
        } else
        {
            System.arraycopy(f, 0, abyte0, 0, Math.min(d, j));
            return;
        }
    }

    public final boolean b()
    {
        return f != null;
    }

    public final boolean b(int j)
    {
        return a(new int[] {
            j
        });
    }

    protected final long c(int j)
    {
        if (f instanceof long[])
        {
            return ((long[])f)[j];
        }
        if (f instanceof byte[])
        {
            return (long)((byte[])f)[j];
        }
        String s = String.valueOf(b(b));
        if (s.length() != 0)
        {
            s = "Cannot get integer value from ".concat(s);
        } else
        {
            s = new String("Cannot get integer value from ");
        }
        throw new IllegalArgumentException(s);
    }

    public final String c()
    {
        if (f != null)
        {
            if (f instanceof String)
            {
                return (String)f;
            }
            if (f instanceof byte[])
            {
                byte abyte0[] = (byte[])f;
                if (abyte0.length > 0 && abyte0[abyte0.length - 1] == 0)
                {
                    return new String(abyte0, 0, abyte0.length - 1, h);
                } else
                {
                    return new String(abyte0, h);
                }
            }
        }
        return null;
    }

    protected final myb d(int j)
    {
        if (b != 10 && b != 5)
        {
            String s = String.valueOf(b(b));
            if (s.length() != 0)
            {
                s = "Cannot get RATIONAL value from ".concat(s);
            } else
            {
                s = new String("Cannot get RATIONAL value from ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return ((myb[])f)[j];
        }
    }

    public final boolean equals(Object obj)
    {
_L2:
        return false;
        if (obj == null || !(obj instanceof mxx)) goto _L2; else goto _L1
_L1:
        obj = (mxx)obj;
        if (((mxx) (obj)).a != a || ((mxx) (obj)).d != d || ((mxx) (obj)).b != b)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((mxx) (obj)).f == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(f instanceof long[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((mxx) (obj)).f instanceof long[])
        {
            return Arrays.equals((long[])f, (long[])((mxx) (obj)).f);
        }
        if (true) goto _L2; else goto _L3
_L3:
        if (!(f instanceof myb[]))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((mxx) (obj)).f instanceof myb[])
        {
            return Arrays.equals((myb[])f, (myb[])((mxx) (obj)).f);
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (f instanceof byte[])
        {
            if (((mxx) (obj)).f instanceof byte[])
            {
                return Arrays.equals((byte[])f, (byte[])((mxx) (obj)).f);
            }
        } else
        {
            return f.equals(((mxx) (obj)).f);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((mxx) (obj)).f != null) goto _L2; else goto _L6
_L6:
        return true;
    }

    public final int hashCode()
    {
        short word0 = a;
        int k = d;
        short word1 = b;
        int j;
        if (f == null)
        {
            j = 0;
        } else
        {
            j = f.hashCode();
        }
        return j + (((word0 + 527) * 31 + k) * 31 + word1) * 31;
    }

    public final String toString()
    {
        String s = String.valueOf(String.format("tag id: %04X\n", new Object[] {
            Short.valueOf(a)
        }));
        int j = e;
        String s1 = String.valueOf(b(b));
        int k = d;
        int l = g;
        Object obj;
        if (f == null)
        {
            obj = "";
        } else
        if (f instanceof byte[])
        {
            if (b == 2)
            {
                obj = c();
            } else
            {
                obj = Arrays.toString((byte[])f);
            }
        } else
        if (f instanceof long[])
        {
            if (((long[])f).length == 1)
            {
                obj = String.valueOf(((long[])f)[0]);
            } else
            {
                obj = Arrays.toString((long[])f);
            }
        } else
        if (f instanceof Object[])
        {
            if (((Object[])f).length == 1)
            {
                obj = ((Object[])f)[0];
                if (obj == null)
                {
                    obj = "";
                } else
                {
                    obj = obj.toString();
                }
            } else
            {
                obj = Arrays.toString((Object[])f);
            }
        } else
        {
            obj = f.toString();
        }
        obj = String.valueOf(obj);
        return (new StringBuilder(String.valueOf(s).length() + 74 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append("ifd id: ").append(j).append("\ntype: ").append(s1).append("\ncount: ").append(k).append("\noffset: ").append(l).append("\nvalue: ").append(((String) (obj))).append("\n").toString();
    }

    static 
    {
        int ai[] = new int[11];
        i = ai;
        ai[1] = 1;
        i[2] = 1;
        i[3] = 2;
        i[4] = 4;
        i[5] = 8;
        i[7] = 1;
        i[9] = 4;
        i[10] = 8;
        new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    }
}
