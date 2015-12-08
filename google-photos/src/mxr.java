// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class mxr extends FilterOutputStream
{

    mxn a;
    private int b;
    private int c;
    private int d;
    private byte e[];
    private ByteBuffer f;
    private final mxm g;

    protected mxr(OutputStream outputstream, mxm mxm1)
    {
        super(new BufferedOutputStream(outputstream, 0x10000));
        b = 0;
        e = new byte[1];
        f = ByteBuffer.allocate(4);
        g = mxm1;
    }

    private int a(int i, byte abyte0[], int j, int k)
    {
        i = Math.min(i - f.position(), k);
        f.put(abyte0, j, i);
        return i;
    }

    private static int a(mxy mxy1, int i)
    {
        int j = mxy1.c();
        mxy1 = mxy1.b();
        int l = mxy1.length;
        j = i + (j * 12 + 2 + 4);
        for (i = 0; i < l;)
        {
            mxx mxx1 = mxy1[i];
            int k = j;
            if (mxx1.a() > 4)
            {
                mxx1.g = j;
                k = j + mxx1.a();
            }
            i++;
            j = k;
        }

        return j;
    }

    private void a()
    {
        boolean flag1 = false;
        if (a != null)
        {
            Object obj1 = a;
            Object obj = new ArrayList();
            Object obj2 = ((mxn) (obj1)).c();
            if (obj2 != null)
            {
                for (int i = 0; i < ((List) (obj2)).size(); i++)
                {
                    mxx mxx2 = (mxx)((mxn) (obj1)).c().get(0);
                    if (mxx2.f == null && !mxm.a(mxx2.a))
                    {
                        ((mxn) (obj1)).b(mxx2.a, mxx2.e);
                        ((ArrayList) (obj)).add(mxx2);
                    }
                }

            }
            b();
            int j = c();
            if (j + 8 > 65535)
            {
                throw new IOException("Exif header is too large (>64Kb)");
            }
            obj1 = new mya(out);
            ((mya) (obj1)).a(ByteOrder.BIG_ENDIAN);
            ((mya) (obj1)).a((short)-31);
            ((mya) (obj1)).a((short)(j + 2 + mxz.a.length));
            ((mya) (obj1)).write(mxz.a);
            if (a.c == ByteOrder.BIG_ENDIAN)
            {
                ((mya) (obj1)).a((short)19789);
            } else
            {
                ((mya) (obj1)).a((short)18761);
            }
            ((mya) (obj1)).a(a.c);
            ((mya) (obj1)).a((short)42);
            ((mya) (obj1)).a(8);
            a(a.b(0), ((mya) (obj1)));
            a(a.b(2), ((mya) (obj1)));
            obj2 = a.b(3);
            if (obj2 != null)
            {
                a(((mxy) (obj2)), ((mya) (obj1)));
            }
            obj2 = a.b(4);
            if (obj2 != null)
            {
                a(((mxy) (obj2)), ((mya) (obj1)));
            }
            if (a.b(1) != null)
            {
                a(a.b(1), ((mya) (obj1)));
            }
            a(((mya) (obj1)));
            mxx mxx1;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(mxx1))
            {
                mxx1 = (mxx)((Iterator) (obj)).next();
            }

            boolean flag = flag1;
            if (a.d != null)
            {
                flag = true;
            }
            if (flag)
            {
                byte abyte0[] = a.d;
                ((mya) (obj1)).a(ByteOrder.BIG_ENDIAN);
                ((mya) (obj1)).a((short)-31);
                ((mya) (obj1)).a((short)(abyte0.length + 2 + mxz.b.length));
                ((mya) (obj1)).write(mxz.b);
                ((mya) (obj1)).write(abyte0);
                return;
            }
        }
    }

    private static void a(mxx mxx1, mya mya1)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (mxx1.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (mxx1.b)
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return;

        case 1: // '\001'
        case 7: // '\007'
            byte abyte0[] = new byte[mxx1.d];
            mxx1.b(abyte0);
            mya1.write(abyte0);
            return;

        case 2: // '\002'
            byte abyte1[] = (byte[])mxx1.f;
            if (abyte1.length == mxx1.d)
            {
                abyte1[abyte1.length - 1] = 0;
                mya1.write(abyte1);
                return;
            } else
            {
                mya1.write(abyte1);
                mya1.write(0);
                return;
            }

        case 4: // '\004'
        case 9: // '\t'
            j = mxx1.d;
            while (i < j) 
            {
                mya1.a((int)mxx1.c(i));
                i++;
            }
            break;

        case 5: // '\005'
        case 10: // '\n'
            int k = mxx1.d;
            i = j;
            while (i < k) 
            {
                myb myb1 = mxx1.d(i);
                mya1.a((int)myb1.a);
                mya1.a((int)myb1.b);
                i++;
            }
            break;

        case 3: // '\003'
            j = mxx1.d;
            i = 0;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (i < j) 
        {
            mya1.a((short)(int)mxx1.c(i));
            i++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static void a(mxy mxy1, mya mya1)
    {
        boolean flag = false;
        mxx amxx[] = mxy1.b();
        mya1.a((short)amxx.length);
        int i1 = amxx.length;
        int i = 0;
        while (i < i1) 
        {
            mxx mxx1 = amxx[i];
            mya1.a(mxx1.a);
            mya1.a(mxx1.b);
            mya1.a(mxx1.d);
            if (Log.isLoggable("ExifOutputStream", 2))
            {
                String s = String.valueOf(mxx1);
                (new StringBuilder(String.valueOf(s).length() + 1)).append("\n").append(s);
            }
            if (mxx1.a() > 4)
            {
                mya1.a(mxx1.g);
            } else
            {
                a(mxx1, mya1);
                int j1 = mxx1.a();
                int k = 0;
                while (k < 4 - j1) 
                {
                    mya1.write(0);
                    k++;
                }
            }
            i++;
        }
        mya1.a(mxy1.b);
        int l = amxx.length;
        for (int j = ((flag) ? 1 : 0); j < l; j++)
        {
            mxy1 = amxx[j];
            if (mxy1.a() > 4)
            {
                a(((mxx) (mxy1)), mya1);
            }
        }

    }

    private void a(mya mya1)
    {
        if (!a.a()) goto _L2; else goto _L1
_L1:
        mya1.write(a.a);
_L4:
        return;
_L2:
        if (a.b())
        {
            int i = 0;
            while (i < a.b.size()) 
            {
                mya1.write(a.a(i));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        Object obj2 = a.b(0);
        mxy mxy1 = ((mxy) (obj2));
        if (obj2 == null)
        {
            mxy1 = new mxy(0);
            a.a(mxy1);
        }
        obj2 = g.g(mxm.k);
        if (obj2 == null)
        {
            int i = mxm.k;
            throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i).toString());
        }
        mxy1.a(((mxx) (obj2)));
        mxy mxy2 = a.b(2);
        obj2 = mxy2;
        if (mxy2 == null)
        {
            obj2 = new mxy(2);
            a.a(((mxy) (obj2)));
        }
        if (a.b(4) != null)
        {
            mxx mxx2 = g.g(mxm.l);
            if (mxx2 == null)
            {
                int j = mxm.l;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j).toString());
            }
            mxy1.a(mxx2);
        }
        if (a.b(3) != null)
        {
            mxx mxx1 = g.g(mxm.u);
            if (mxx1 == null)
            {
                int k = mxm.u;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(k).toString());
            }
            ((mxy) (obj2)).a(mxx1);
        }
        obj2 = a.b(1);
        if (a.a())
        {
            Object obj = obj2;
            if (obj2 == null)
            {
                obj = new mxy(1);
                a.a(((mxy) (obj)));
            }
            obj2 = g.g(mxm.m);
            if (obj2 == null)
            {
                int l = mxm.m;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(l).toString());
            }
            ((mxy) (obj)).a(((mxx) (obj2)));
            obj2 = g.g(mxm.n);
            if (obj2 == null)
            {
                int i1 = mxm.n;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i1).toString());
            }
            ((mxx) (obj2)).b(a.a.length);
            ((mxy) (obj)).a(((mxx) (obj2)));
            ((mxy) (obj)).b(mxm.a(mxm.f));
            ((mxy) (obj)).b(mxm.a(mxm.h));
        } else
        {
            if (a.b())
            {
                Object obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = new mxy(1);
                    a.a(((mxy) (obj1)));
                }
                int j1 = a.b.size();
                obj2 = g.g(mxm.f);
                if (obj2 == null)
                {
                    j1 = mxm.f;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                mxx mxx3 = g.g(mxm.h);
                if (mxx3 == null)
                {
                    j1 = mxm.h;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                long al[] = new long[j1];
                for (int k1 = 0; k1 < a.b.size(); k1++)
                {
                    al[k1] = a.a(k1).length;
                }

                mxx3.a(al);
                ((mxy) (obj1)).a(((mxx) (obj2)));
                ((mxy) (obj1)).a(mxx3);
                ((mxy) (obj1)).b(mxm.a(mxm.m));
                ((mxy) (obj1)).b(mxm.a(mxm.n));
                return;
            }
            if (obj2 != null)
            {
                ((mxy) (obj2)).b(mxm.a(mxm.f));
                ((mxy) (obj2)).b(mxm.a(mxm.h));
                ((mxy) (obj2)).b(mxm.a(mxm.m));
                ((mxy) (obj2)).b(mxm.a(mxm.n));
                return;
            }
        }
    }

    private int c()
    {
        mxy mxy1 = a.b(0);
        int i = a(mxy1, 8);
        mxy1.a(mxm.a(mxm.k)).b(i);
        mxy mxy2 = a.b(2);
        int j = a(mxy2, i);
        mxy mxy3 = a.b(3);
        i = j;
        if (mxy3 != null)
        {
            mxy2.a(mxm.a(mxm.u)).b(j);
            i = a(mxy3, j);
        }
        mxy2 = a.b(4);
        j = i;
        if (mxy2 != null)
        {
            mxy1.a(mxm.a(mxm.l)).b(i);
            j = a(mxy2, i);
        }
        mxy2 = a.b(1);
        i = j;
        if (mxy2 != null)
        {
            mxy1.b = j;
            i = a(mxy2, j);
        }
        if (a.a())
        {
            mxy2.a(mxm.a(mxm.m)).b(i);
            return a.a.length + i;
        }
        if (a.b())
        {
            long al[] = new long[a.b.size()];
            boolean flag = false;
            int k = i;
            for (i = ((flag) ? 1 : 0); i < a.b.size(); i++)
            {
                al[i] = k;
                k += a.a(i).length;
            }

            mxy2.a(mxm.a(mxm.f)).a(al);
            return k;
        } else
        {
            return i;
        }
    }

    public final void write(int i)
    {
        e[0] = (byte)(i & 0xff);
        write(e);
    }

    public final void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
_L5:
        if (c <= 0 && d <= 0 && b == 2 || j <= 0) goto _L2; else goto _L1
_L1:
        int k = i;
        int j1 = j;
        if (c > 0)
        {
            k = Math.min(c, j);
            j1 = j - k;
            c = c - k;
            k = i + k;
        }
        i = k;
        j = j1;
        if (d > 0)
        {
            i = Math.min(d, j1);
            out.write(abyte0, k, i);
            j = j1 - i;
            d = d - i;
            i = k + i;
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        return;
_L4:
        b;
        JVM INSTR tableswitch 0 1: default 156
    //                   0 159
    //                   1 257;
           goto _L5 _L6 _L7
_L6:
        int l = a(2, abyte0, i, j);
        i += l;
        j -= l;
        if (f.position() < 2) goto _L3; else goto _L8
_L8:
        f.rewind();
        if (f.getShort() != -40)
        {
            throw new IOException("Not a valid jpeg image, cannot write exif");
        }
        out.write(f.array(), 0, 2);
        b = 1;
        f.rewind();
        a();
          goto _L5
_L7:
        int i1 = a(4, abyte0, i, j);
        i += i1;
        j -= i1;
        if (f.position() == 2 && f.getShort() == -39)
        {
            out.write(f.array(), 0, 2);
            f.rewind();
        }
        if (f.position() < 4) goto _L3; else goto _L9
_L9:
        f.rewind();
        short word0 = f.getShort();
        if (word0 == -31)
        {
            c = (f.getShort() & 0xffff) - 2;
            b = 2;
        } else
        if (!mxz.a(word0))
        {
            out.write(f.array(), 0, 4);
            d = (f.getShort() & 0xffff) - 2;
        } else
        {
            out.write(f.array(), 0, 4);
            b = 2;
        }
        f.rewind();
          goto _L5
_L2:
        if (j > 0)
        {
            out.write(abyte0, i, j);
            return;
        }
          goto _L3
    }
}
