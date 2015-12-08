// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ac;

import com.google.android.m4b.maps.ae.b;
import com.google.android.m4b.maps.ap.d;
import com.google.android.m4b.maps.ap.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

// Referenced classes of package com.google.android.m4b.maps.ac:
//            b

public final class com.google.android.m4b.maps.ac.a
{
    static final class a
    {

        public int a;

        private a()
        {
            a = 0;
        }

        a(byte byte0)
        {
            this();
        }
    }


    public static final Boolean a = new Boolean(false);
    public static final Boolean b = new Boolean(true);
    private static byte f[] = new byte[0];
    private static final a h = new a((byte)0);
    com.google.android.m4b.maps.ac.b c;
    final b d;
    b e;
    private int g;

    public com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.ac.b b1)
    {
        g = 0x80000000;
        c = b1;
        if (b1 == null)
        {
            d = new b();
            return;
        }
        b1 = b1.a;
        int i1;
        if (((b) (b1)).c <= 0)
        {
            i1 = 128;
        } else
        {
            i1 = ((b) (b1)).c + 1;
        }
        d = new b(i1);
    }

    private static int a(long l1)
    {
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        int j1 = 10;
_L4:
        return j1;
_L2:
        int i1 = 1;
        do
        {
            j1 = i1;
            if (l1 < 128L)
            {
                continue;
            }
            i1++;
            l1 >>= 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int a(d d1)
    {
        com.google.android.m4b.maps.ae.b.a a1;
        int l1;
        a1 = d.a();
        l1 = 0;
_L10:
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (!a1.a())
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = a1.b();
        k2 = j(j2);
        l2 = n(j2);
        i2 = 0;
        k1 = 0;
_L7:
        int i1;
        int i3;
        if (i2 >= k2)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        i1 = k1 + a(((OutputStream) (d1)), j2 << 3 | l2);
        i3 = d1.b;
        l2;
        JVM INSTR tableswitch 0 5: default 116
    //                   0 228
    //                   1 124
    //                   2 279
    //                   3 401
    //                   4 116
    //                   5 124;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L3
_L5:
        break MISSING_BLOCK_LABEL_401;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException();
_L3:
        int j1;
        long l3 = ((Long)a(j2, i2, 19)).longValue();
        if (l2 == 5)
        {
            j1 = 4;
        } else
        {
            j1 = 8;
        }
        for (k1 = 0; k1 < j1; k1++)
        {
            d1.write((int)(255L & l3));
            l3 >>= 8;
        }

        j1 = 0;
_L8:
        k1 = i1;
        if (j1 == 0)
        {
            k1 = i1 + (d1.b - i3);
        }
        i2++;
        if (true) goto _L7; else goto _L6
_L6:
        long l5 = ((Long)a(j2, i2, 19)).longValue();
        long l4 = l5;
        if (l(j2))
        {
            l4 = b(l5);
        }
        a(((OutputStream) (d1)), l4);
        j1 = 0;
          goto _L8
_L4:
        byte abyte0[];
        if (k(j2) == 27)
        {
            j1 = 16;
        } else
        {
            j1 = 25;
        }
        abyte0 = ((byte []) (a(j2, i2, j1)));
        if (abyte0 instanceof byte[])
        {
            abyte0 = (byte[])abyte0;
            a(((OutputStream) (d1)), abyte0.length);
            d1.write(abyte0);
            j1 = 0;
        } else
        {
            d1.a(d1.b);
            j1 = d1.c;
            d1.a(-1);
            k1 = ((com.google.android.m4b.maps.ac.a)abyte0).a(d1);
            d1.a[j1] = k1;
            i1 += k1 + a(k1);
            j1 = 1;
        }
          goto _L8
        j1 = ((com.google.android.m4b.maps.ac.a)a(j2, i2, 26)).a(d1);
        i1 = a(((OutputStream) (d1)), j2 << 3 | 4) + (j1 + i1);
        j1 = 1;
          goto _L8
        l1 = k1 + l1;
        if (true) goto _L10; else goto _L9
_L9:
        return l1;
    }

    private int a(InputStream inputstream, int i1, boolean flag, a a1)
    {
        if (flag)
        {
            b b1 = d;
            for (int j1 = 0; j1 < b1.a.length; j1++)
            {
                b1.a[j1] = null;
            }

            if (b1.b != null)
            {
                b1.b.clear();
            }
            b1.d = 0x80000000;
            b1.c = 0x80000000;
            b1.e = 0;
            e = null;
        }
_L7:
        int k1;
        int k2;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        long l3 = a(inputstream, true, a1);
        if (l3 == -1L)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        k1 = i1 - a1.a;
        i1 = (int)l3 & 7;
        if (i1 == 4)
        {
            break MISSING_BLOCK_LABEL_531;
        }
        k2 = (int)(l3 >>> 3);
        if (k(k2) == 16)
        {
            if (e == null)
            {
                e = new b();
            }
            e.a(k2, Integer.valueOf(i1));
        }
        i1;
        JVM INSTR tableswitch 0 5: default 216
    //                   0 250
    //                   1 313
    //                   2 382
    //                   3 478
    //                   4 216
    //                   5 313;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L3
_L5:
        break MISSING_BLOCK_LABEL_478;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IOException((new StringBuilder(52)).append("Unknown wire type ").append(i1).append(", reading garbage data?").toString());
_L2:
        Object obj;
        long l6 = a(inputstream, false, a1);
        i1 = a1.a;
        long l4 = l6;
        if (l(k2))
        {
            l4 = -(l6 & 1L) ^ l6 >>> 1;
        }
        obj = Long.valueOf(l4);
        i1 = k1 - i1;
_L8:
        a(k2, obj);
        if (true) goto _L7; else goto _L6
_L6:
        int i2;
        long l5;
        if (i1 == 5)
        {
            i1 = 4;
        } else
        {
            i1 = 8;
        }
        i2 = k1 - i1;
        k1 = 0;
        l5 = 0L;
        for (; i1 > 0; i1--)
        {
            l5 |= (long)inputstream.read() << k1;
            k1 += 8;
        }

        obj = Long.valueOf(l5);
        i1 = i2;
          goto _L8
_L4:
        int l2 = (int)a(inputstream, false, a1);
        int j2 = k1 - a1.a - l2;
        byte abyte0[];
        if (l2 == 0)
        {
            abyte0 = f;
        } else
        {
            abyte0 = new byte[l2];
        }
        k1 = 0;
        obj = abyte0;
        i1 = j2;
        if (k1 >= l2) goto _L8; else goto _L9
_L9:
        i1 = inputstream.read(abyte0, k1, l2 - k1);
        if (i1 <= 0)
        {
            throw new IOException("Unexp.EOF");
        }
        k1 += i1;
        break MISSING_BLOCK_LABEL_418;
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = (com.google.android.m4b.maps.ac.b)c.a(k2);
        }
        obj = new com.google.android.m4b.maps.ac.a(((com.google.android.m4b.maps.ac.b) (obj)));
        i1 = ((com.google.android.m4b.maps.ac.a) (obj)).a(inputstream, k1, false, a1);
          goto _L8
        i1 = k1;
        if (i1 < 0)
        {
            throw new IOException();
        }
        if (e != null)
        {
            inputstream = e;
            int l1;
            if (((b) (inputstream)).c <= 0)
            {
                l1 = 1;
            } else
            {
                l1 = ((b) (inputstream)).c + 1;
            }
            a1 = ((a) (new Object[l1]));
            System.arraycopy(((Object) (((b) (inputstream)).a)), 0, a1, 0, l1);
            Arrays.fill(((b) (inputstream)).a, null);
            inputstream.a = a1;
        }
        return i1;
    }

    private static int a(OutputStream outputstream, long l1)
    {
        int i1 = 0;
        do
        {
            int j1;
label0:
            {
                j1 = i1;
                if (i1 < 10)
                {
                    j1 = (int)(127L & l1);
                    l1 >>>= 7;
                    if (l1 != 0L)
                    {
                        break label0;
                    }
                    outputstream.write(j1);
                    j1 = i1 + 1;
                }
                return j1;
            }
            outputstream.write(j1 | 0x80);
            i1++;
        } while (true);
    }

    private static int a(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Vector)
        {
            return ((Vector)obj).size();
        } else
        {
            return 1;
        }
    }

    static long a(InputStream inputstream, boolean flag)
    {
        return a(inputstream, flag, h);
    }

    private static long a(InputStream inputstream, boolean flag, a a1)
    {
        a1.a = 0;
        long l1 = 0L;
        int i1 = 0;
        int j1 = 0;
        long l2;
        do
        {
            l2 = l1;
            if (i1 >= 10)
            {
                break;
            }
            int k1 = inputstream.read();
            if (k1 == -1)
            {
                if (i1 == 0 && flag)
                {
                    return -1L;
                } else
                {
                    throw new IOException("EOF");
                }
            }
            l1 |= (long)(k1 & 0x7f) << j1;
            l2 = l1;
            if ((k1 & 0x80) == 0)
            {
                break;
            }
            j1 += 7;
            i1++;
        } while (true);
        a1.a = i1 + 1;
        return l2;
    }

    private Object a(int i1, int j1, int k1)
    {
        Object obj = d.a(i1);
        if (j1 >= a(obj))
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return a(i1, j1, k1, obj);
        }
    }

    private Object a(int i1, int j1, int k1, Object obj)
    {
label0:
        {
            Vector vector;
            Object obj1;
            if (obj instanceof Vector)
            {
                vector = (Vector)obj;
                obj = vector.elementAt(j1);
            } else
            {
                vector = null;
            }
            obj1 = a(obj, k1, i1);
            if (obj1 != obj && obj != null)
            {
                if (vector != null)
                {
                    break label0;
                }
                b(i1, obj1);
            }
            return obj1;
        }
        vector.setElementAt(obj1, j1);
        return obj1;
    }

    private Object a(Object obj, int i1, int j1)
    {
        i1;
        JVM INSTR tableswitch 16 36: default 100
    //                   16 118
    //                   17 100
    //                   18 100
    //                   19 171
    //                   20 171
    //                   21 171
    //                   22 171
    //                   23 171
    //                   24 111
    //                   25 203
    //                   26 283
    //                   27 283
    //                   28 264
    //                   29 171
    //                   30 171
    //                   31 171
    //                   32 171
    //                   33 171
    //                   34 171
    //                   35 203
    //                   36 264;
           goto _L1 _L2 _L1 _L1 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L6 _L7 _L3 _L3 _L3 _L3 _L3 _L3 _L5 _L7
_L1:
        throw new RuntimeException("Unsupp.Type");
_L4:
        if (!(obj instanceof Boolean)) goto _L8; else goto _L2
_L2:
        return obj;
_L8:
        switch ((int)((Long)obj).longValue())
        {
        default:
            throw new IllegalArgumentException("Type mismatch");

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;
        }
_L3:
        if (!(obj instanceof Boolean)) goto _L2; else goto _L9
_L9:
        long l1;
        if (((Boolean)obj).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        return Long.valueOf(l1);
_L5:
        if (obj instanceof String)
        {
            return com.google.android.m4b.maps.ap.g.a((String)obj);
        }
        if (!(obj instanceof com.google.android.m4b.maps.ac.a)) goto _L2; else goto _L10
_L10:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            ((com.google.android.m4b.maps.ac.a)obj).b(bytearrayoutputstream);
            obj = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((IOException) (obj)).toString());
        }
        return obj;
_L7:
        if (!(obj instanceof byte[])) goto _L2; else goto _L11
_L11:
        obj = (byte[])obj;
        return com.google.android.m4b.maps.ap.g.a(((byte []) (obj)), obj.length);
_L6:
        if (!(obj instanceof byte[])) goto _L2; else goto _L12
_L12:
        if (j1 <= 0) goto _L14; else goto _L13
_L13:
        if (c == null) goto _L14; else goto _L15
_L15:
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a((com.google.android.m4b.maps.ac.b)c.a(j1));
_L17:
        return a1.a((byte[])obj);
_L14:
        a1 = new com.google.android.m4b.maps.ac.a(null);
        if (true) goto _L17; else goto _L16
_L16:
        obj;
        throw new RuntimeException(((IOException) (obj)).toString());
    }

    private void a(Writer writer)
    {
        a(writer, 0);
    }

    private void a(Writer writer, int i1)
    {
        Object obj;
        int k1;
        obj = new StringBuffer();
        for (int j1 = 0; j1 < i1 * 2; j1++)
        {
            ((StringBuffer) (obj)).append(' ');
        }

        obj = ((StringBuffer) (obj)).toString();
        k1 = 0;
_L10:
        int l1;
        if (k1 > d.d)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = 0;
_L7:
        int i2;
        if (l1 >= j(k1))
        {
            break MISSING_BLOCK_LABEL_368;
        }
        writer.append(((CharSequence) (obj))).append(Integer.toString(k1));
        i2 = k(k1);
        if (i2 == 26)
        {
            writer.append(' ');
        } else
        {
            writer.append(':');
        }
        i2;
        JVM INSTR tableswitch 17 36: default 200
    //                   17 301
    //                   18 279
    //                   19 323
    //                   20 323
    //                   21 323
    //                   22 323
    //                   23 323
    //                   24 323
    //                   25 344
    //                   26 242
    //                   27 242
    //                   28 323
    //                   29 323
    //                   30 323
    //                   31 323
    //                   32 323
    //                   33 323
    //                   34 323
    //                   35 344
    //                   36 323;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L6 _L6 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L4
_L5:
        break MISSING_BLOCK_LABEL_344;
_L1:
        writer.append("UNSUPPORTED TYPE: ").append(Integer.toString(i2));
_L8:
        writer.append('\n');
        l1++;
          goto _L7
_L6:
        writer.append("{\n");
        c(k1, l1).a(writer, i1 + 1);
        writer.append(((CharSequence) (obj))).append('}');
          goto _L8
_L3:
        writer.append(Float.toString(Float.intBitsToFloat(b(k1, l1))));
          goto _L8
_L2:
        writer.append(Double.toString(Double.longBitsToDouble(f(k1, l1))));
          goto _L8
_L4:
        writer.append(a(k1, l1, i2).toString());
          goto _L8
        writer.append(com.google.android.m4b.maps.ae.a.a((byte[])a(k1, l1, 25)));
          goto _L8
        k1++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static long b(long l1)
    {
        return l1 << 1 ^ -(l1 >>> 63);
    }

    private long f(int i1, int j1)
    {
        return ((Long)a(i1, j1, 19)).longValue();
    }

    private Object g(int i1, int j1)
    {
        Object obj = d.a(i1);
        int k1 = a(obj);
        if (k1 == 0)
        {
            return m(i1);
        }
        if (k1 > 1)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a(i1, 0, j1, obj);
        }
    }

    private int k(int i1)
    {
label0:
        {
            Object obj;
            int j1;
            if (c != null)
            {
                obj = (b.a)c.a.a(i1);
                int k1;
                if (obj == null)
                {
                    j1 = 16;
                } else
                {
                    j1 = ((b.a) (obj)).a & 0xff;
                }
            } else
            {
                j1 = 16;
            }
            if (j1 == 16)
            {
                if (e != null)
                {
                    obj = (Integer)e.a(i1);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    j1 = ((Integer) (obj)).intValue();
                }
            }
            k1 = j1;
            if (j1 == 16)
            {
                k1 = j1;
                if (j(i1) > 0)
                {
                    obj = a(i1, 0, 16);
                    if (!(obj instanceof Long) && !(obj instanceof Boolean))
                    {
                        break label0;
                    }
                    k1 = 0;
                }
            }
            return k1;
        }
        return 2;
    }

    private boolean l(int i1)
    {
        i1 = k(i1);
        return i1 == 33 || i1 == 34;
    }

    private Object m(int i1)
    {
        switch (k(i1))
        {
        default:
            if (c != null)
            {
                break;
            }
            // fall through

        case 16: // '\020'
        case 26: // '\032'
        case 27: // '\033'
            return null;
        }
        return c.a(i1);
    }

    private final int n(int i1)
    {
        int k1 = k(i1);
        int j1 = k1;
        switch (k1)
        {
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        default:
            String s = String.valueOf("Unsupp.Type:");
            String s1 = String.valueOf(c);
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(s1).length())).append(s).append(s1).append("/").append(i1).append("/").append(k1).toString());

        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 24: // '\030'
        case 29: // '\035'
        case 30: // '\036'
        case 33: // '!'
        case 34: // '"'
            j1 = 0;
            // fall through

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 16: // '\020'
            return j1;

        case 25: // '\031'
        case 27: // '\033'
        case 28: // '\034'
        case 35: // '#'
        case 36: // '$'
            return 2;

        case 17: // '\021'
        case 22: // '\026'
        case 32: // ' '
            return 1;

        case 18: // '\022'
        case 23: // '\027'
        case 31: // '\037'
            return 5;

        case 26: // '\032'
            return 3;
        }
    }

    public final int a(InputStream inputstream, int i1)
    {
        return a(inputstream, i1, true, new a((byte)0));
    }

    public final int a(boolean flag)
    {
        if (g != 0x80000000 && flag)
        {
            return g;
        }
        com.google.android.m4b.maps.ae.b.a a1 = d.a();
        int i1 = 0;
label0:
        do
        {
            int j1;
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
                            if (!a1.a())
                            {
                                break label0;
                            }
                            int l1 = a1.b();
                            int i2 = j(l1);
                            int k1 = 0;
                            j1 = i1;
label5:
                            do
                            {
                                {
                                    if (k1 >= i2)
                                    {
                                        break label1;
                                    }
                                    int j2 = a(l1 << 3);
                                    switch (n(l1))
                                    {
                                    case 2: // '\002'
                                    case 4: // '\004'
                                    default:
                                        Object obj = a(l1, k1, 16);
                                        long l2;
                                        long l3;
                                        if (obj instanceof byte[])
                                        {
                                            i1 = ((byte[])obj).length;
                                        } else
                                        if (obj instanceof String)
                                        {
                                            i1 = com.google.android.m4b.maps.ap.g.a((String)obj, null, 0);
                                        } else
                                        {
                                            i1 = ((com.google.android.m4b.maps.ac.a)obj).a(flag);
                                        }
                                        i1 += a(i1) + j2;
                                        break;

                                    case 0: // '\0'
                                        break label3;

                                    case 1: // '\001'
                                        break label4;

                                    case 3: // '\003'
                                        break label2;

                                    case 5: // '\005'
                                        break label5;
                                    }
                                }
                                j1 += i1;
                                k1++;
                            } while (true);
                            i1 = j2 + 4;
                            break MISSING_BLOCK_LABEL_159;
                        }
                        i1 = j2 + 8;
                        break MISSING_BLOCK_LABEL_159;
                    }
                    l3 = f(l1, k1);
                    l2 = l3;
                    if (l(l1))
                    {
                        l2 = b(l3);
                    }
                    i1 = a(l2) + j2;
                    break MISSING_BLOCK_LABEL_159;
                }
                i1 = c(l1, k1).a(flag) + j2 + j2;
                break MISSING_BLOCK_LABEL_159;
            }
            i1 = j1;
        } while (true);
        g = i1;
        return g;
    }

    public final com.google.android.m4b.maps.ac.a a()
    {
        com.google.android.m4b.maps.ac.a a1;
        try
        {
            a1 = new com.google.android.m4b.maps.ac.a(c);
            a1.a(c());
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Could not serialize and parse ProtoBuf.");
        }
        return a1;
    }

    public final com.google.android.m4b.maps.ac.a a(int i1)
    {
        return new com.google.android.m4b.maps.ac.a((com.google.android.m4b.maps.ac.b)c.a(i1));
    }

    public final com.google.android.m4b.maps.ac.a a(int i1, float f1)
    {
        return a(i1, Float.floatToIntBits(f1));
    }

    public final com.google.android.m4b.maps.ac.a a(int i1, long l1)
    {
        return b(i1, Long.valueOf(l1));
    }

    public final com.google.android.m4b.maps.ac.a a(int i1, boolean flag)
    {
        Boolean boolean1;
        if (flag)
        {
            boolean1 = b;
        } else
        {
            boolean1 = a;
        }
        return b(i1, boolean1);
    }

    public final com.google.android.m4b.maps.ac.a a(InputStream inputstream)
    {
        a(inputstream, 0x7fffffff);
        return this;
    }

    public final com.google.android.m4b.maps.ac.a a(byte abyte0[])
    {
        a(((InputStream) (new ByteArrayInputStream(abyte0))), abyte0.length);
        return this;
    }

    public final void a(int i1, int j1)
    {
        a(i1, Long.valueOf(j1));
    }

    public final void a(int i1, Object obj)
    {
        Object obj1 = d.a(i1);
        Vector vector = null;
        if (obj1 instanceof Vector)
        {
            vector = (Vector)obj1;
        }
        if (obj1 == null || vector != null && vector.size() == 0)
        {
            b(i1, obj);
            return;
        }
        Vector vector1 = vector;
        if (vector == null)
        {
            vector1 = new Vector();
            vector1.addElement(obj1);
            d.a(i1, vector1);
        }
        vector1.addElement(obj);
    }

    public final void a(OutputStream outputstream)
    {
        a(outputstream, true);
    }

    public final void a(OutputStream outputstream, boolean flag)
    {
        int k1 = 0;
        d d1 = new d();
        int i1 = a(d1);
        if (flag)
        {
            ((DataOutput)outputstream).writeInt(i1);
        }
        int i2 = d1.c;
        for (int j1 = 0; j1 < i2;)
        {
            int l1 = d1.a[j1];
            d1.a(outputstream, k1, l1 - k1);
            a(outputstream, d1.a[j1 + 1]);
            j1 += 2;
            k1 = l1;
        }

        if (k1 < d1.b)
        {
            d1.a(outputstream, k1, d1.b - k1);
        }
    }

    public final int b()
    {
        return a(false);
    }

    public final int b(int i1, int j1)
    {
        return (int)((Long)a(i1, j1, 21)).longValue();
    }

    public final com.google.android.m4b.maps.ac.a b(int i1, Object obj)
    {
        if (i1 < 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            d.a(i1, obj);
            return this;
        }
    }

    public final void b(OutputStream outputstream)
    {
        a(outputstream, false);
    }

    public final boolean b(int i1)
    {
        return ((Boolean)g(i1, 24)).booleanValue();
    }

    public final com.google.android.m4b.maps.ac.a c(int i1, int j1)
    {
        return (com.google.android.m4b.maps.ac.a)a(i1, j1, 26);
    }

    public final byte[] c()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        b(bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public final byte[] c(int i1)
    {
        return (byte[])g(i1, 25);
    }

    public final Object clone()
    {
        return a();
    }

    public final int d(int i1)
    {
        return (int)((Long)g(i1, 21)).longValue();
    }

    public final String d(int i1, int j1)
    {
        return (String)a(i1, j1, 28);
    }

    public final long e(int i1)
    {
        return ((Long)g(i1, 19)).longValue();
    }

    public final void e(int i1, int j1)
    {
        int k1 = j(i1);
        if (j1 >= k1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (k1 == 1)
        {
            d.b(i1);
            return;
        } else
        {
            ((Vector)d.a(i1)).removeElementAt(j1);
            return;
        }
    }

    public final com.google.android.m4b.maps.ac.a f(int i1)
    {
        return (com.google.android.m4b.maps.ac.a)g(i1, 26);
    }

    public final String g(int i1)
    {
        return (String)g(i1, 28);
    }

    public final boolean h(int i1)
    {
        return j(i1) > 0;
    }

    public final boolean i(int i1)
    {
        return h(i1) || m(i1) != null;
    }

    public final int j(int i1)
    {
        return a(d.a(i1));
    }

    public final String toString()
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            a(stringwriter);
        }
        catch (IOException ioexception)
        {
            stringwriter.write(ioexception.toString());
        }
        return stringwriter.toString();
    }

}
