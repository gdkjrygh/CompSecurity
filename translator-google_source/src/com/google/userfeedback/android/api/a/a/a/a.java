// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a.a;

import com.google.userfeedback.android.api.a.a.g;
import com.google.userfeedback.android.api.a.a.h;
import com.google.userfeedback.android.api.a.b.b;
import com.google.userfeedback.android.api.a.b.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;

// Referenced classes of package com.google.userfeedback.android.api.a.a.a:
//            b, c, d

public final class a
{

    public static final Boolean a = new Boolean(false);
    public static final Boolean b = new Boolean(true);
    public static final byte c[] = new byte[0];
    private static final com.google.userfeedback.android.api.a.a.a.b h = new com.google.userfeedback.android.api.a.a.a.b();
    private com.google.userfeedback.android.api.a.a.a.c d;
    private final com.google.userfeedback.android.api.a.b.a e = new com.google.userfeedback.android.api.a.b.a();
    private com.google.userfeedback.android.api.a.b.a f;
    private int g;

    public a(com.google.userfeedback.android.api.a.a.a.c c1)
    {
        g = 0x80000000;
        d = c1;
    }

    private int a(int i)
    {
        return a(e.a(i));
    }

    private int a(int i, h h1)
    {
        int j;
        int k1;
        k1 = a(i);
        j = b(i);
        j;
        JVM INSTR tableswitch 0 36: default 180
    //                   0 257
    //                   1 257
    //                   2 257
    //                   3 257
    //                   4 180
    //                   5 257
    //                   6 180
    //                   7 180
    //                   8 180
    //                   9 180
    //                   10 180
    //                   11 180
    //                   12 180
    //                   13 180
    //                   14 180
    //                   15 180
    //                   16 257
    //                   17 352
    //                   18 358
    //                   19 340
    //                   20 340
    //                   21 340
    //                   22 352
    //                   23 358
    //                   24 340
    //                   25 346
    //                   26 364
    //                   27 346
    //                   28 346
    //                   29 340
    //                   30 340
    //                   31 358
    //                   32 352
    //                   33 340
    //                   34 340
    //                   35 346
    //                   36 346;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L2 _L3 _L4 _L5 _L5 _L5 _L3 _L4 _L5 _L6 _L7 _L6 _L6 _L5 _L5 _L4 _L3 _L5 _L5 _L6 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        h1 = String.valueOf("Unsupp.Type:");
        String s = String.valueOf(d);
        throw new RuntimeException((new StringBuilder(String.valueOf(h1).length() + 24 + String.valueOf(s).length())).append(h1).append(s).append("/").append(i).append("/").append(j).toString());
_L18:
        int i1;
        int j1;
        j1 = 0;
        i1 = 0;
_L15:
        if (j1 >= k1) goto _L9; else goto _L8
_L8:
        int k;
        int l1;
        k = i1 + a(((OutputStream) (h1)), i << 3 | j);
        l1 = h1.b;
        j;
        JVM INSTR tableswitch 0 5: default 332
    //                   0 473
    //                   1 370
    //                   2 528
    //                   3 648
    //                   4 332
    //                   5 370;
           goto _L10 _L11 _L12 _L13 _L14 _L10 _L12
_L10:
        throw new IllegalArgumentException();
_L5:
        j = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        j = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 5;
        continue; /* Loop/switch isn't completed */
_L7:
        j = 3;
        continue; /* Loop/switch isn't completed */
_L12:
        int l;
        long l2 = ((Long)a(i, j1, 19)).longValue();
        if (j == 5)
        {
            l = 4;
        } else
        {
            l = 8;
        }
        for (i1 = 0; i1 < l; i1++)
        {
            h1.write((int)(255L & l2));
            l2 >>= 8;
        }

        l = 0;
_L16:
        i1 = k;
        if (l == 0)
        {
            i1 = k + (h1.b - l1);
        }
        j1++;
          goto _L15
_L11:
        long l4 = ((Long)a(i, j1, 19)).longValue();
        long l3 = l4;
        if (c(i))
        {
            l3 = -(l4 >>> 63) ^ l4 << 1;
        }
        a(((OutputStream) (h1)), l3);
        l = 0;
          goto _L16
_L13:
        byte abyte0[];
        if (b(i) == 27)
        {
            l = 16;
        } else
        {
            l = 25;
        }
        abyte0 = ((byte []) (a(i, j1, l)));
        if (abyte0 instanceof byte[])
        {
            abyte0 = (byte[])abyte0;
            a(((OutputStream) (h1)), abyte0.length);
            h1.write(abyte0);
            l = 0;
        } else
        {
            h1.a(h1.b);
            l = h1.c;
            h1.a(-1);
            i1 = ((a)abyte0).a(h1);
            h1.a[l] = i1;
            k += i1 + a(i1);
            l = 1;
        }
          goto _L16
_L14:
        l = ((a)a(i, j1, 26)).a(h1);
        k = a(((OutputStream) (h1)), i << 3 | 4) + (l + k);
        l = 1;
          goto _L16
_L9:
        return i1;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private static int a(long l)
    {
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        int j = 10;
_L4:
        return j;
_L2:
        int i = 1;
        do
        {
            j = i;
            if (l < 128L)
            {
                continue;
            }
            i++;
            l >>= 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int a(h h1)
    {
        b b1 = new b(e);
        int i;
        int j;
        for (i = 0; b1.a(); i += a(j, h1))
        {
            if (!b1.a())
            {
                throw new NoSuchElementException();
            }
            j = b1.a;
            b1.a = 0x80000000;
        }

        return i;
    }

    private int a(InputStream inputstream, int i, boolean flag, com.google.userfeedback.android.api.a.a.a.b b1)
    {
        if (flag)
        {
            com.google.userfeedback.android.api.a.b.a a1 = e;
            for (int j = 0; j < a1.a.length; j++)
            {
                a1.a[j] = null;
            }

            if (a1.b != null)
            {
                a1.b.clear();
            }
            a1.d = 0x80000000;
            a1.c = 0x80000000;
            a1.e = 0;
            f = null;
        }
_L7:
        int k;
        int j1;
        k = i;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        long l1 = a(inputstream, true, b1);
        k = i;
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        k = i - b1.a;
        i = (int)l1 & 7;
        if (i == 4)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        j1 = (int)(l1 >>> 3);
        if (b(j1) == 16)
        {
            if (f == null)
            {
                f = new com.google.userfeedback.android.api.a.b.a();
            }
            f.a(j1, com.google.userfeedback.android.api.a.b.c.a(i));
        }
        i;
        JVM INSTR tableswitch 0 5: default 220
    //                   0 254
    //                   1 317
    //                   2 386
    //                   3 482
    //                   4 220
    //                   5 317;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IOException((new StringBuilder(52)).append("Unknown wire type ").append(i).append(", reading garbage data?").toString());
_L2:
        Object obj;
        long l4 = a(inputstream, false, b1);
        i = b1.a;
        long l2 = l4;
        if (c(j1))
        {
            l2 = -(l4 & 1L) ^ l4 >>> 1;
        }
        obj = com.google.userfeedback.android.api.a.b.c.a(l2);
        i = k - i;
_L8:
        a(j1, obj);
        if (true) goto _L7; else goto _L6
_L6:
        int l;
        long l3;
        if (i == 5)
        {
            i = 4;
        } else
        {
            i = 8;
        }
        l = k - i;
        k = 0;
        l3 = 0L;
        for (; i > 0; i--)
        {
            l3 |= (long)inputstream.read() << k;
            k += 8;
        }

        obj = com.google.userfeedback.android.api.a.b.c.a(l3);
        i = l;
          goto _L8
_L4:
        int k1 = (int)a(inputstream, false, b1);
        int i1 = k - b1.a - k1;
        byte abyte0[];
        if (k1 == 0)
        {
            abyte0 = c;
        } else
        {
            abyte0 = new byte[k1];
        }
        k = 0;
        obj = abyte0;
        i = i1;
        if (k >= k1) goto _L8; else goto _L9
_L9:
        i = inputstream.read(abyte0, k, k1 - k);
        if (i <= 0)
        {
            throw new IOException("Unexp.EOF");
        }
        k += i;
        break MISSING_BLOCK_LABEL_422;
_L5:
        if (d == null)
        {
            obj = null;
        } else
        {
            obj = (com.google.userfeedback.android.api.a.a.a.c)d.a(j1);
        }
        obj = new a(((com.google.userfeedback.android.api.a.a.a.c) (obj)));
        i = ((a) (obj)).a(inputstream, k, false, b1);
          goto _L8
        if (k < 0)
        {
            throw new IOException();
        }
        return k;
          goto _L8
    }

    private static int a(OutputStream outputstream, long l)
    {
        int i = 0;
        do
        {
            int j;
label0:
            {
                j = i;
                if (i < 10)
                {
                    j = (int)(127L & l);
                    l >>>= 7;
                    if (l != 0L)
                    {
                        break label0;
                    }
                    outputstream.write(j);
                    j = i + 1;
                }
                return j;
            }
            outputstream.write(j | 0x80);
            i++;
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

    private static long a(InputStream inputstream, boolean flag, com.google.userfeedback.android.api.a.a.a.b b1)
    {
        b1.a = 0;
        long l = 0L;
        int i = 0;
        int j = 0;
        long l1;
        do
        {
            l1 = l;
            if (i >= 10)
            {
                break;
            }
            int k = inputstream.read();
            if (k == -1)
            {
                if (i == 0 && flag)
                {
                    return -1L;
                } else
                {
                    throw new IOException("EOF");
                }
            }
            l |= (long)(k & 0x7f) << j;
            l1 = l;
            if ((k & 0x80) == 0)
            {
                break;
            }
            j += 7;
            i++;
        } while (true);
        b1.a = i + 1;
        return l1;
    }

    private Object a(int i, int j, int k)
    {
label0:
        {
            Object obj = e.a(i);
            if (j >= a(obj))
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            Vector vector;
            Object obj1;
            if (obj instanceof Vector)
            {
                vector = (Vector)obj;
                obj = vector.elementAt(j);
            } else
            {
                vector = null;
            }
            obj1 = a(obj, k, i);
            if (obj1 != obj && obj != null)
            {
                if (vector != null)
                {
                    break label0;
                }
                b(i, obj1);
            }
            return obj1;
        }
        vector.setElementAt(obj1, j);
        return obj1;
    }

    private Object a(Object obj, int i, int j)
    {
        i;
        JVM INSTR tableswitch 16 36: default 100
    //                   16 117
    //                   17 100
    //                   18 100
    //                   19 166
    //                   20 100
    //                   21 166
    //                   22 166
    //                   23 166
    //                   24 110
    //                   25 198
    //                   26 278
    //                   27 278
    //                   28 259
    //                   29 100
    //                   30 100
    //                   31 166
    //                   32 166
    //                   33 166
    //                   34 166
    //                   35 198
    //                   36 259;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L3 _L3 _L3 _L4 _L5 _L6 _L6 _L7 _L1 _L1 _L3 _L3 _L3 _L3 _L5 _L7
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
        long l;
        if (((Boolean)obj).booleanValue())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        return com.google.userfeedback.android.api.a.b.c.a(l);
_L5:
        if (obj instanceof String)
        {
            return com.google.userfeedback.android.api.a.a.g.a((String)obj);
        }
        if (!(obj instanceof a)) goto _L2; else goto _L10
_L10:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            ((a)obj).a(((OutputStream) (bytearrayoutputstream)));
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
        return com.google.userfeedback.android.api.a.a.g.a(((byte []) (obj)), obj.length);
_L6:
        if (!(obj instanceof byte[])) goto _L2; else goto _L12
_L12:
        if (j <= 0) goto _L14; else goto _L13
_L13:
        if (d == null) goto _L14; else goto _L15
_L15:
        a a1 = new a((com.google.userfeedback.android.api.a.a.a.c)d.a(j));
_L16:
        obj = (byte[])obj;
        a1.a(((InputStream) (new ByteArrayInputStream(((byte []) (obj))))), obj.length, true, new com.google.userfeedback.android.api.a.a.a.b());
        return a1;
_L14:
        try
        {
            a1 = new a(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((IOException) (obj)).toString());
        }
          goto _L16
    }

    private int b(int i)
    {
label0:
        {
            Object obj;
            int j;
            if (d != null)
            {
                obj = (d)d.a.a(i);
                int k;
                if (obj == null)
                {
                    j = 16;
                } else
                {
                    j = ((d) (obj)).a & 0xff;
                }
            } else
            {
                j = 16;
            }
            if (j == 16)
            {
                if (f != null)
                {
                    obj = (Integer)f.a(i);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    j = ((Integer) (obj)).intValue();
                }
            }
            k = j;
            if (j == 16)
            {
                k = j;
                if (a(i) > 0)
                {
                    obj = a(i, 0, 16);
                    if (!(obj instanceof Long) && !(obj instanceof Boolean))
                    {
                        break label0;
                    }
                    k = 0;
                }
            }
            return k;
        }
        return 2;
    }

    private boolean c(int i)
    {
        i = b(i);
        return i == 33 || i == 34;
    }

    public final void a(int i, float f1)
    {
        a(i, Float.floatToIntBits(f1));
    }

    public final void a(int i, long l)
    {
        b(i, com.google.userfeedback.android.api.a.b.c.a(l));
    }

    public final void a(int i, Object obj)
    {
        Object obj1 = e.a(i);
        Vector vector = null;
        if (obj1 instanceof Vector)
        {
            vector = (Vector)obj1;
        }
        if (obj1 == null || vector != null && vector.size() == 0)
        {
            b(i, obj);
            return;
        }
        Vector vector1 = vector;
        if (vector == null)
        {
            vector1 = new Vector();
            vector1.addElement(obj1);
            e.a(i, vector1);
        }
        vector1.addElement(obj);
    }

    public final void a(OutputStream outputstream)
    {
        int i = 0;
        h h1 = new h();
        a(h1);
        int l = h1.c;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            k = h1.a[i];
            h1.a(outputstream, j, k - j);
            a(outputstream, h1.a[i + 1]);
            i += 2;
        }

        if (j < h1.b)
        {
            h1.a(outputstream, j, h1.b - j);
        }
    }

    public final void b(int i, Object obj)
    {
        if (i < 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            e.a(i, obj);
            return;
        }
    }

}
