// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.TreeMap;

final class mxs
{

    private static final Charset g = Charset.forName("US-ASCII");
    private static final short t;
    private static final short u;
    private static final short v;
    private static final short w;
    private static final short x;
    private static final short y;
    private static final short z;
    private final TreeMap A = new TreeMap();
    final mxl a;
    int b;
    mxx c;
    mxv d;
    int e;
    int f;
    private final int h;
    private int i;
    private int j;
    private mxx k;
    private mxx l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private byte q[];
    private int r;
    private final mxm s;

    private mxs(InputStream inputstream, int i1, mxm mxm1)
    {
        i = 0;
        j = 0;
        n = false;
        e = 0;
        if (inputstream == null)
        {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        s = mxm1;
        n = a(inputstream);
        a = new mxl(inputstream);
        h = i1;
        if (n)
        {
            i1 = a.a();
            if (18761 == i1)
            {
                a.a(ByteOrder.LITTLE_ENDIAN);
            } else
            if (19789 == i1)
            {
                a.a(ByteOrder.BIG_ENDIAN);
            } else
            {
                throw new mxo("Invalid TIFF header");
            }
            if (a.a() != 42)
            {
                throw new mxo("Invalid TIFF header");
            }
            long l1 = a.c();
            if (l1 > 0x7fffffffL)
            {
                throw new mxo((new StringBuilder(35)).append("Invalid offset ").append(l1).toString());
            }
            r = (int)l1;
            b = 0;
            if (a(0) || h())
            {
                a(0, l1);
                i1 = (int)l1 - 8;
                if (i1 < 0)
                {
                    throw new mxo((new StringBuilder(35)).append("Invalid offset ").append(l1).toString());
                }
                if (i1 > 0)
                {
                    q = new byte[i1];
                    a(q);
                    return;
                }
            }
        }
    }

    private int a(byte abyte0[], int i1, int j1)
    {
        return a.read(abyte0, 0, j1);
    }

    protected static mxs a(InputStream inputstream, int i1, mxm mxm1)
    {
        return new mxs(inputstream, i1, mxm1);
    }

    protected static mxs a(InputStream inputstream, mxm mxm1)
    {
        return new mxs(inputstream, 63, mxm1);
    }

    private void a(int i1, long l1)
    {
        A.put(Integer.valueOf((int)l1), new mxu(i1, a(i1)));
    }

    private boolean a(int i1)
    {
        boolean flag = true;
        i1;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 40
    //                   1 51
    //                   2 62
    //                   3 85
    //                   4 73;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        flag = false;
_L8:
        return flag;
_L2:
        if ((h & 1) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((h & 2) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ((h & 4) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if ((h & 8) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if ((h & 0x10) == 0)
        {
            return false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean a(int i1, int j1)
    {
        j1 = s.d().get(j1);
        if (j1 == 0)
        {
            return false;
        } else
        {
            return mxm.c(j1, i1);
        }
    }

    private boolean a(InputStream inputstream)
    {
        short word0;
        boolean flag1;
        flag1 = false;
        inputstream = new mxl(inputstream);
        if (inputstream.a() != -40)
        {
            throw new mxo("Invalid JPEG format");
        }
        word0 = inputstream.a();
_L10:
        boolean flag = flag1;
        if (word0 == -39) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (mxz.a(word0)) goto _L2; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = inputstream.a() & 0xffff;
        i1 = j1;
        if (word0 != -31) goto _L5; else goto _L4
_L4:
        i1 = j1;
        if (j1 < mxz.a.length + 2) goto _L5; else goto _L6
_L6:
        byte abyte0[];
        abyte0 = new byte[mxz.a.length];
        inputstream.read(abyte0, 0, mxz.a.length);
        j1 -= mxz.a.length;
        i1 = j1;
        if (!Arrays.equals(abyte0, mxz.a)) goto _L5; else goto _L7
_L7:
        f = ((mxl) (inputstream)).a;
        o = j1;
        e = f + o;
        flag = true;
_L2:
        return flag;
_L5:
        if (i1 >= 2 && (long)(i1 - 2) == inputstream.skip(i1 - 2))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (Log.isLoggable("ExifParser", 5))
        {
            Log.w("ExifParser", "Invalid JPEG format.");
            return false;
        }
        if (true) goto _L2; else goto _L8
_L8:
        word0 = inputstream.a();
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void b(int i1)
    {
        mxl mxl1 = a;
        long l1 = (long)i1 - (long)mxl1.a;
        if (l1 < 0L)
        {
            throw new IOException();
        }
        if (mxl1.skip(l1) != l1)
        {
            throw new EOFException();
        }
        for (; !A.isEmpty() && ((Integer)A.firstKey()).intValue() < i1; A.pollFirstEntry()) { }
    }

    private void b(int i1, long l1)
    {
        A.put(Integer.valueOf((int)l1), new mxv(4, i1));
    }

    private void c(mxx mxx1)
    {
        int i1 = 0;
        if (mxx1.d != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        short word0;
        int j1;
        word0 = mxx1.a;
        j1 = mxx1.e;
        if (word0 == t && a(j1, mxm.k))
        {
            if (a(2) || a(3))
            {
                a(2, mxx1.c(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == u && a(j1, mxm.l))
        {
            if (a(4))
            {
                a(4, mxx1.c(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == v && a(j1, mxm.u))
        {
            if (a(3))
            {
                a(3, mxx1.c(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == w && a(j1, mxm.m))
        {
            if (g())
            {
                long l1 = mxx1.c(0);
                A.put(Integer.valueOf((int)l1), new mxv(3));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == x && a(j1, mxm.n))
        {
            if (g())
            {
                l = mxx1;
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 != y || !a(j1, mxm.f))
        {
            break; /* Loop/switch isn't completed */
        }
        if (g())
        {
            if (mxx1.b())
            {
                while (i1 < mxx1.d) 
                {
                    word0 = mxx1.b;
                    b(i1, mxx1.c(i1));
                    i1++;
                }
            } else
            {
                A.put(Integer.valueOf(mxx1.g), new mxt(mxx1, false));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (word0 != z || !a(j1, mxm.h) || !g() || !mxx1.b()) goto _L1; else goto _L4
_L4:
        k = mxx1;
        return;
    }

    private boolean g()
    {
        return (h & 0x20) != 0;
    }

    private boolean h()
    {
        b;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 68
    //                   2 73;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        if (a(2) || a(4) || a(3) || a(1))
        {
            return true;
        }
          goto _L1
_L3:
        return g();
_L4:
        return a(3);
    }

    private mxx i()
    {
        boolean flag = true;
        short word0 = a.a();
        short word1 = a.a();
        long l1 = a.c();
        if (l1 > 0x7fffffffL)
        {
            throw new mxo("Number of component is larger then Integer.MAX_VALUE");
        }
        if (!mxx.a(word1))
        {
            if (Log.isLoggable("ExifParser", 5))
            {
                Log.w("ExifParser", String.format("Tag %04x: Invalid data type %d", new Object[] {
                    Short.valueOf(word0), Short.valueOf(word1)
                }));
            }
            a.skip(4L);
            return null;
        }
        int i1 = (int)l1;
        int j1 = b;
        mxx mxx1;
        if ((int)l1 == 0)
        {
            flag = false;
        }
        mxx1 = new mxx(word0, word1, i1, j1, flag);
        i1 = mxx1.a();
        if (i1 > 4)
        {
            long l2 = a.c();
            if (l2 > 0x7fffffffL)
            {
                throw new mxo("offset is larger then Integer.MAX_VALUE");
            }
            if (q != null && l2 < (long)r && word1 == 7)
            {
                byte abyte0[] = new byte[(int)l1];
                System.arraycopy(q, (int)l2 - 8, abyte0, 0, (int)l1);
                mxx1.a(abyte0);
                return mxx1;
            } else
            {
                mxx1.g = (int)l2;
                return mxx1;
            }
        } else
        {
            boolean flag1 = mxx1.c;
            mxx1.c = false;
            b(mxx1);
            mxx1.c = flag1;
            a.skip(4 - i1);
            mxx1.g = a.a - 4;
            return mxx1;
        }
    }

    private boolean j()
    {
        int i1 = o - a.a - 2;
        if (i1 <= 0 || a.skip(i1) == (long)i1) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("ExifParser", 5))
        {
            Log.w("ExifParser", "Invalid JPEG format.");
        }
_L4:
        return false;
_L2:
        a.a(ByteOrder.BIG_ENDIAN);
        short word0 = a.a();
_L8:
        if (word0 == -39) goto _L4; else goto _L3
_L3:
        if (mxz.a(word0)) goto _L4; else goto _L5
_L5:
        int j1 = a.a() & 0xffff;
        i1 = j1;
        if (word0 != -31)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        i1 = j1;
        byte abyte0[];
        if (j1 < mxz.b.length + 2)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        abyte0 = new byte[mxz.b.length];
        a(abyte0, 0, mxz.b.length);
        j1 -= mxz.b.length;
        i1 = j1;
        if (!Arrays.equals(abyte0, mxz.b))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        p = j1 - 2;
        return true;
        if (i1 < 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((long)(i1 - 2) == a.skip(i1 - 2))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (!Log.isLoggable("ExifParser", 5)) goto _L4; else goto _L6
_L6:
        Log.w("ExifParser", "Invalid JPEG format.");
        return false;
        EOFException eofexception;
        eofexception;
        if (!Log.isLoggable("ExifParser", 5)) goto _L4; else goto _L7
_L7:
        Log.w("ExifParser", "Invalid JPEG format.");
        return false;
        word0 = a.a();
          goto _L8
    }

    private long k()
    {
        return (long)a.b() & 0xffffffffL;
    }

    protected final int a()
    {
        byte byte0 = 1;
        int k1;
        int l1;
        do
        {
            if (!n)
            {
                byte0 = 6;
            } else
            {
                k1 = a.a;
                l1 = i + 2 + j * 12;
                if (k1 >= l1)
                {
                    break;
                }
                c = i();
                if (c == null)
                {
                    continue;
                }
                if (m)
                {
                    c(c);
                    return 1;
                }
            }
            return byte0;
        } while (true);
        if (k1 == l1)
        {
            if (b == 0)
            {
                long l2 = k();
                if ((a(1) || g()) && l2 != 0L)
                {
                    a(1, l2);
                }
            } else
            {
                mxt mxt1;
                String s1;
                IOException ioexception;
                int j1;
                if (!A.isEmpty())
                {
                    j1 = ((Integer)A.firstEntry().getKey()).intValue() - a.a;
                } else
                {
                    j1 = 4;
                }
                if (j1 < 4)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        Log.w("ExifParser", (new StringBuilder(45)).append("Invalid size of link to next IFD: ").append(j1).toString());
                    }
                } else
                {
                    long l3 = k();
                    if (l3 != 0L && Log.isLoggable("ExifParser", 5))
                    {
                        Log.w("ExifParser", (new StringBuilder(46)).append("Invalid link to next IFD: ").append(l3).toString());
                    }
                }
            }
        }
        do
        {
            if (A.isEmpty())
            {
                break;
            }
            java.util.Map.Entry entry = A.pollFirstEntry();
            Object obj = entry.getValue();
            try
            {
                b(((Integer)entry.getKey()).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                if (Log.isLoggable("ExifParser", 5))
                {
                    s1 = String.valueOf(entry.getKey());
                    obj = String.valueOf(obj.getClass().getName());
                    Log.w("ExifParser", (new StringBuilder(String.valueOf(s1).length() + 57 + String.valueOf(obj).length())).append("Failed to skip to data at: ").append(s1).append(" for ").append(((String) (obj))).append(", the file may be broken.").toString());
                }
                continue;
            }
            if (obj instanceof mxu)
            {
                b = ((mxu)obj).a;
                j = a.a() & 0xffff;
                i = ((Integer)entry.getKey()).intValue();
                if (j * 12 + i + 2 > o)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        int i1 = b;
                        Log.w("ExifParser", (new StringBuilder(31)).append("Invalid size of IFD ").append(i1).toString());
                    }
                    return 6;
                }
                m = h();
                if (((mxu)obj).b)
                {
                    return 0;
                }
                b();
            } else
            {
                if (obj instanceof mxv)
                {
                    d = (mxv)obj;
                    return d.b;
                }
                mxt1 = (mxt)obj;
                c = mxt1.a;
                if (c.b != 7)
                {
                    b(c);
                    c(c);
                }
                if (mxt1.b)
                {
                    return 2;
                }
            }
        } while (true);
        return p != 0 || !j() ? 6 : 5;
    }

    protected final int a(byte abyte0[])
    {
        return a.read(abyte0);
    }

    protected final void a(mxx mxx1)
    {
        if (mxx1.g >= a.a)
        {
            A.put(Integer.valueOf(mxx1.g), new mxt(mxx1, true));
        }
    }

    protected final void b()
    {
        int i1 = i;
        int k1 = j * 12 + (i1 + 2);
        i1 = a.a;
        if (i1 <= k1)
        {
            if (m)
            {
                do
                {
                    if (i1 >= k1)
                    {
                        break;
                    }
                    c = i();
                    int j1 = i1 + 12;
                    i1 = j1;
                    if (c != null)
                    {
                        c(c);
                        i1 = j1;
                    }
                } while (true);
            } else
            {
                b(k1);
            }
            long l1 = k();
            if (b == 0 && (a(1) || g()) && l1 > 0L)
            {
                a(1, l1);
                return;
            }
        }
    }

    protected final void b(mxx mxx1)
    {
        int i1;
        int j2;
        int j3;
        boolean flag;
        j2 = 0;
        j3 = 0;
        flag = false;
        i1 = 0;
        short word0 = mxx1.b;
        if (word0 == 2 || word0 == 7 || word0 == 1)
        {
            int i4 = mxx1.d;
            if (!A.isEmpty() && ((Integer)A.firstEntry().getKey()).intValue() < i4 + a.a)
            {
                Object obj = A.firstEntry().getValue();
                if (obj instanceof mxv)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(mxx1);
                        Log.w("ExifParser", (new StringBuilder(String.valueOf(obj).length() + 35)).append("Thumbnail overlaps value for tag: \n").append(((String) (obj))).toString());
                    }
                    obj = A.pollFirstEntry();
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(((java.util.Map.Entry) (obj)).getKey());
                        Log.w("ExifParser", (new StringBuilder(String.valueOf(obj).length() + 26)).append("Invalid thumbnail offset: ").append(((String) (obj))).toString());
                    }
                } else
                {
                    int k4;
                    if (obj instanceof mxu)
                    {
                        if (Log.isLoggable("ExifParser", 5))
                        {
                            int j4 = ((mxu)obj).a;
                            obj = String.valueOf(mxx1);
                            Log.w("ExifParser", (new StringBuilder(String.valueOf(obj).length() + 41)).append("Ifd ").append(j4).append(" overlaps value for tag: \n").append(((String) (obj))).toString());
                        }
                    } else
                    if ((obj instanceof mxt) && Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(((mxt)obj).a);
                        String s1 = String.valueOf(mxx1);
                        Log.w("ExifParser", (new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(s1).length())).append("Tag value for tag: \n").append(((String) (obj))).append(" overlaps value for tag: \n").append(s1).toString());
                    }
                    k4 = ((Integer)A.firstEntry().getKey()).intValue() - a.a;
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(mxx1);
                        Log.w("ExifParser", (new StringBuilder(String.valueOf(obj).length() + 52)).append("Invalid size of tag: \n").append(((String) (obj))).append(" setting count to: ").append(k4).toString());
                    }
                    mxx1.d = k4;
                }
            }
        }
        mxx1.b;
        JVM INSTR tableswitch 1 10: default 276
    //                   1 582
    //                   2 604
    //                   3 771
    //                   4 667
    //                   5 711
    //                   6 276
    //                   7 582
    //                   8 276
    //                   9 825
    //                   10 876;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L2 _L1 _L7 _L8
_L1:
        if (Log.isLoggable("ExifParser", 2))
        {
            mxx1 = String.valueOf(mxx1);
            (new StringBuilder(String.valueOf(mxx1).length() + 1)).append("\n").append(mxx1);
        }
        return;
_L2:
        byte abyte0[] = new byte[mxx1.d];
        a(abyte0);
        mxx1.a(abyte0);
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = mxx1.d;
        Object obj1 = g;
        if (i1 > 0)
        {
            mxl mxl1 = a;
            byte abyte1[] = new byte[i1];
            mxl1.a(abyte1, 0, abyte1.length);
            obj1 = new String(abyte1, ((Charset) (obj1)));
        } else
        {
            obj1 = "";
        }
        mxx1.a(((String) (obj1)));
        continue; /* Loop/switch isn't completed */
_L5:
        long al[] = new long[mxx1.d];
        for (j2 = al.length; i1 < j2; i1++)
        {
            al[i1] = k();
        }

        mxx1.a(al);
        continue; /* Loop/switch isn't completed */
_L6:
        myb amyb[] = new myb[mxx1.d];
        j3 = amyb.length;
        for (int j1 = j2; j1 < j3; j1++)
        {
            amyb[j1] = new myb(k(), k());
        }

        mxx1.a(amyb);
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[] = new int[mxx1.d];
        int k2 = ai.length;
        for (int k1 = j3; k1 < k2; k1++)
        {
            ai[k1] = a.a() & 0xffff;
        }

        mxx1.a(ai);
        continue; /* Loop/switch isn't completed */
_L7:
        int ai1[] = new int[mxx1.d];
        int l2 = ai1.length;
        for (int l1 = ((flag) ? 1 : 0); l1 < l2; l1++)
        {
            ai1[l1] = a.b();
        }

        mxx1.a(ai1);
        continue; /* Loop/switch isn't completed */
_L8:
        myb amyb1[] = new myb[mxx1.d];
        int i3 = amyb1.length;
        for (int i2 = 0; i2 < i3; i2++)
        {
            int k3 = a.b();
            int l3 = a.b();
            amyb1[i2] = new myb(k3, l3);
        }

        mxx1.a(amyb1);
        if (true) goto _L1; else goto _L9
_L9:
    }

    protected final int c()
    {
        if (k == null)
        {
            return 0;
        } else
        {
            return (int)k.c(0);
        }
    }

    protected final int d()
    {
        if (l == null)
        {
            return 0;
        } else
        {
            return (int)l.c(0);
        }
    }

    final byte[] e()
    {
        byte abyte0[] = new byte[p];
        a(abyte0, 0, p);
        return abyte0;
    }

    protected final ByteOrder f()
    {
        return a.b.order();
    }

    static 
    {
        t = mxm.a(mxm.k);
        u = mxm.a(mxm.l);
        v = mxm.a(mxm.u);
        w = mxm.a(mxm.m);
        x = mxm.a(mxm.n);
        y = mxm.a(mxm.f);
        z = mxm.a(mxm.h);
    }
}
