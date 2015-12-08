// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.b;

import android.util.Log;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.io.IOUtils;

// Referenced classes of package it.sephiroth.android.library.b:
//            b, j, e, i, 
//            h, d, g

public class c
{

    public static final int A = a(0, (short)532);
    public static final int B = a(0, (short)-32104);
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G = a(2, (short)-32102);
    public static final int H = a(2, (short)-32099);
    public static final int I = a(2, (short)-30686);
    public static final int J = a(2, (short)-30684);
    public static final int K = a(2, (short)-30681);
    public static final int L = a(2, (short)-30680);
    public static final int M = a(2, (short)-28672);
    public static final int N = a(2, (short)-28669);
    public static final int O = a(2, (short)-28668);
    public static final int P = a(2, (short)-28415);
    public static final int Q = a(2, (short)-28414);
    public static final int R = a(2, (short)-28159);
    public static final int S = a(2, (short)-28158);
    public static final int T = a(2, (short)-28157);
    public static final int U = a(2, (short)-28156);
    public static final int V = a(2, (short)-28155);
    public static final int W = a(2, (short)-28154);
    public static final int X = a(2, (short)-28153);
    public static final int Y = a(2, (short)-28152);
    public static final int Z = a(2, (short)-28151);
    public static final int a = a(0, (short)256);
    public static final int aA = a(2, (short)-23549);
    public static final int aB = a(2, (short)-23548);
    public static final int aC = a(2, (short)-23547);
    public static final int aD = a(2, (short)-23546);
    public static final int aE = a(2, (short)-23545);
    public static final int aF = a(2, (short)-23544);
    public static final int aG = a(2, (short)-23543);
    public static final int aH = a(2, (short)-23542);
    public static final int aI = a(2, (short)-23541);
    public static final int aJ = a(2, (short)-23540);
    public static final int aK = a(2, (short)-23520);
    public static final int aL = a(2, (short)-23502);
    public static final int aM = a(2, (short)-23501);
    public static final int aN = a(2, (short)-23500);
    public static final int aO = a(2, (short)-30672);
    public static final int aP = a(4, (short)0);
    public static final int aQ = a(4, (short)1);
    public static final int aR = a(4, (short)2);
    public static final int aS = a(4, (short)3);
    public static final int aT = a(4, (short)4);
    public static final int aU = a(4, (short)5);
    public static final int aV = a(4, (short)6);
    public static final int aW = a(4, (short)7);
    public static final int aX = a(4, (short)8);
    public static final int aY = a(4, (short)9);
    public static final int aZ = a(4, (short)10);
    public static final int aa = a(2, (short)-28150);
    public static final int ab = a(2, (short)-28140);
    public static final int ac = a(2, (short)-28036);
    public static final int ad = a(2, (short)-28026);
    public static final int ae = a(2, (short)-28016);
    public static final int af = a(2, (short)-28015);
    public static final int ag = a(2, (short)-28014);
    public static final int ah = a(2, (short)-24576);
    public static final int ai = a(2, (short)-24575);
    public static final int aj = a(2, (short)-24574);
    public static final int ak = a(2, (short)-24573);
    public static final int al = a(2, (short)-24572);
    public static final int am;
    public static final int an = a(2, (short)-24053);
    public static final int ao = a(2, (short)-24052);
    public static final int ap = a(2, (short)-24050);
    public static final int aq = a(2, (short)-24049);
    public static final int ar = a(2, (short)-24048);
    public static final int as = a(2, (short)-24044);
    public static final int at = a(2, (short)-24043);
    public static final int au = a(2, (short)-24041);
    public static final int av = a(2, (short)-23808);
    public static final int aw = a(2, (short)-23807);
    public static final int ax = a(2, (short)-23806);
    public static final int ay = a(2, (short)-23551);
    public static final int az = a(2, (short)-23550);
    public static final int b = a(0, (short)257);
    private static HashSet bA;
    public static final int ba = a(4, (short)11);
    public static final int bb = a(4, (short)12);
    public static final int bc = a(4, (short)13);
    public static final int bd = a(4, (short)14);
    public static final int be = a(4, (short)15);
    public static final int bf = a(4, (short)16);
    public static final int bg = a(4, (short)17);
    public static final int bh = a(4, (short)18);
    public static final int bi = a(4, (short)19);
    public static final int bj = a(4, (short)20);
    public static final int bk = a(4, (short)21);
    public static final int bl = a(4, (short)22);
    public static final int bm = a(4, (short)23);
    public static final int bn = a(4, (short)24);
    public static final int bo = a(4, (short)25);
    public static final int bp = a(4, (short)26);
    public static final int bq = a(4, (short)27);
    public static final int br = a(4, (short)28);
    public static final int bs = a(4, (short)29);
    public static final int bt = a(4, (short)30);
    public static final int bu = a(3, (short)1);
    public static final ByteOrder bv;
    protected static HashSet bw;
    private static final DateFormat by = new SimpleDateFormat("yyyy:MM:dd");
    private static final DateFormat bz = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    public static final int c = a(0, (short)258);
    public static final int d = a(0, (short)259);
    public static final int e = a(0, (short)262);
    public static final int f = a(0, (short)270);
    public static final int g = a(0, (short)271);
    public static final int h = a(0, (short)272);
    public static final int i;
    public static final int j = a(0, (short)274);
    public static final int k = a(0, (short)277);
    public static final int l = a(0, (short)278);
    public static final int m;
    public static final int n = a(0, (short)282);
    public static final int o = a(0, (short)283);
    public static final int p = a(0, (short)284);
    public static final int q = a(0, (short)296);
    public static final int r = a(0, (short)301);
    public static final int s = a(0, (short)305);
    public static final int t = a(0, (short)306);
    public static final int u = a(0, (short)315);
    public static final int v = a(0, (short)318);
    public static final int w = a(0, (short)319);
    public static final int x = a(0, (short)529);
    public static final int y = a(0, (short)530);
    public static final int z = a(0, (short)531);
    private final Calendar bB = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private SparseIntArray bC;
    private b bx;

    public c()
    {
        bx = new b(bv);
        bC = null;
        by.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static int a(int i1, short word0)
    {
        return 0xffff & word0 | i1 << 16;
    }

    private static int a(InputStream inputstream, OutputStream outputstream, b b1)
        throws IOException
    {
        Log.i("ExifInterface", "writeExif_internal");
        c c1 = new c();
        c1.a(inputstream, 0);
        outputstream.write(255);
        outputstream.write(216);
        inputstream = c1.bx.h();
        if (((f.d)inputstream.get(0)).b != 224)
        {
            Log.w("ExifInterface", "first section is not a JFIF or EXIF tag");
            outputstream.write(j.a);
        }
        e e1 = new e(c1);
        e1.a(b1);
        e1.a(outputstream);
        for (int i1 = 0; i1 < inputstream.size() - 1; i1++)
        {
            b1 = (f.d)inputstream.get(i1);
            Log.v("ExifInterface", (new StringBuilder()).append("writing section.. ").append(String.format("0x%2X", new Object[] {
                Integer.valueOf(((f.d) (b1)).b)
            })).toString());
            outputstream.write(255);
            outputstream.write(((f.d) (b1)).b);
            outputstream.write(((f.d) (b1)).c);
        }

        inputstream = (f.d)inputstream.get(inputstream.size() - 1);
        Log.v("ExifInterface", (new StringBuilder()).append("writing last section.. ").append(String.format("0x%2X", new Object[] {
            Integer.valueOf(((f.d) (inputstream)).b)
        })).toString());
        outputstream.write(255);
        outputstream.write(((f.d) (inputstream)).b);
        outputstream.write(((f.d) (inputstream)).c);
        return c1.bx.a;
    }

    protected static int a(int ai1[])
    {
        if (ai1 != null && ai1.length != 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        return k1;
_L2:
        int ai2[];
        int i1;
        int j1;
        ai2 = it.sephiroth.android.library.b.i.a();
        j1 = 0;
        i1 = 0;
_L5:
        k1 = i1;
        if (j1 >= 5) goto _L4; else goto _L3
_L3:
        int i2;
        i2 = ai1.length;
        k1 = 0;
_L6:
label0:
        {
            int l1 = i1;
            if (k1 < i2)
            {
                l1 = ai1[k1];
                if (ai2[j1] != l1)
                {
                    break label0;
                }
                l1 = i1 | 1 << j1;
            }
            j1++;
            i1 = l1;
        }
          goto _L5
        k1++;
          goto _L6
    }

    protected static boolean a(short word0)
    {
        return bA.contains(Short.valueOf(word0));
    }

    public static int b(int i1)
    {
        return i1 >>> 16;
    }

    public static int b(short word0)
    {
        switch (word0)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public static short c(int i1)
    {
        return (short)i1;
    }

    private void d()
    {
        int i1 = a(new int[] {
            0, 1
        }) << 24;
        bC.put(g, i1 | 0x20000);
        bC.put(a, i1 | 0x40000 | 1);
        bC.put(b, i1 | 0x40000 | 1);
        bC.put(c, i1 | 0x30000 | 3);
        bC.put(d, i1 | 0x30000 | 1);
        bC.put(e, i1 | 0x30000 | 1);
        bC.put(j, i1 | 0x30000 | 1);
        bC.put(k, i1 | 0x30000 | 1);
        bC.put(p, i1 | 0x30000 | 1);
        bC.put(y, i1 | 0x30000 | 2);
        bC.put(z, i1 | 0x30000 | 1);
        bC.put(n, i1 | 0x50000 | 1);
        bC.put(o, i1 | 0x50000 | 1);
        bC.put(q, i1 | 0x30000 | 1);
        bC.put(i, i1 | 0x40000);
        bC.put(l, i1 | 0x40000 | 1);
        bC.put(m, i1 | 0x40000);
        bC.put(r, i1 | 0x30000 | 0x300);
        bC.put(v, i1 | 0x50000 | 2);
        bC.put(w, i1 | 0x50000 | 6);
        bC.put(x, i1 | 0x50000 | 3);
        bC.put(A, i1 | 0x50000 | 6);
        bC.put(t, i1 | 0x20000 | 0x14);
        bC.put(f, i1 | 0x20000);
        bC.put(h, i1 | 0x20000);
        bC.put(s, i1 | 0x20000);
        bC.put(u, i1 | 0x20000);
        bC.put(B, i1 | 0x20000);
        bC.put(C, i1 | 0x40000 | 1);
        bC.put(D, i1 | 0x40000 | 1);
        i1 = a(new int[] {
            1
        }) << 24;
        bC.put(E, i1 | 0x40000 | 1);
        bC.put(F, i1 | 0x40000 | 1);
        i1 = a(new int[] {
            2
        }) << 24;
        bC.put(M, i1 | 0x70000 | 4);
        bC.put(ah, i1 | 0x70000 | 4);
        bC.put(ai, i1 | 0x30000 | 1);
        bC.put(P, i1 | 0x70000 | 4);
        bC.put(Q, i1 | 0x50000 | 1);
        bC.put(aj, i1 | 0x40000 | 1);
        bC.put(ak, i1 | 0x40000 | 1);
        bC.put(ac, i1 | 0x70000);
        bC.put(ad, i1 | 0x70000);
        bC.put(al, i1 | 0x20000 | 0xd);
        bC.put(N, i1 | 0x20000 | 0x14);
        bC.put(O, i1 | 0x20000 | 0x14);
        bC.put(ae, i1 | 0x20000);
        bC.put(af, i1 | 0x20000);
        bC.put(ag, i1 | 0x20000);
        bC.put(aK, i1 | 0x20000 | 0x21);
        bC.put(aL, 0xa0000 | i1 | 3);
        bC.put(aM, i1 | 0x20000);
        bC.put(aN, i1 | 0x20000);
        bC.put(aO, i1 | 0x30000 | 1);
        bC.put(G, i1 | 0x50000 | 1);
        bC.put(H, i1 | 0x50000 | 1);
        bC.put(I, i1 | 0x30000 | 1);
        bC.put(J, i1 | 0x20000);
        bC.put(K, i1 | 0x30000);
        bC.put(L, i1 | 0x70000);
        bC.put(R, 0xa0000 | i1 | 1);
        bC.put(S, i1 | 0x50000 | 1);
        bC.put(T, 0xa0000 | i1 | 1);
        bC.put(U, 0xa0000 | i1 | 1);
        bC.put(V, i1 | 0x50000 | 1);
        bC.put(W, i1 | 0x50000 | 1);
        bC.put(X, i1 | 0x30000 | 1);
        bC.put(Y, i1 | 0x30000 | 1);
        bC.put(Z, i1 | 0x30000 | 1);
        bC.put(aa, i1 | 0x50000 | 1);
        bC.put(ab, i1 | 0x30000);
        bC.put(an, i1 | 0x50000 | 1);
        bC.put(ao, i1 | 0x70000);
        bC.put(ap, i1 | 0x50000 | 1);
        bC.put(aq, i1 | 0x50000 | 1);
        bC.put(ar, i1 | 0x30000 | 1);
        bC.put(as, i1 | 0x30000 | 2);
        bC.put(at, i1 | 0x50000 | 1);
        bC.put(au, i1 | 0x30000 | 1);
        bC.put(av, i1 | 0x70000 | 1);
        bC.put(aw, i1 | 0x70000 | 1);
        bC.put(ax, i1 | 0x70000);
        bC.put(ay, i1 | 0x30000 | 1);
        bC.put(az, i1 | 0x30000 | 1);
        bC.put(aA, i1 | 0x30000 | 1);
        bC.put(aB, i1 | 0x50000 | 1);
        bC.put(aC, i1 | 0x30000 | 1);
        bC.put(aD, i1 | 0x30000 | 1);
        bC.put(aE, i1 | 0x50000 | 1);
        bC.put(aF, i1 | 0x30000 | 1);
        bC.put(aG, i1 | 0x30000 | 1);
        bC.put(aH, i1 | 0x30000 | 1);
        bC.put(aI, i1 | 0x70000);
        bC.put(aJ, i1 | 0x30000 | 1);
        bC.put(am, i1 | 0x40000 | 1);
        i1 = a(new int[] {
            4
        }) << 24;
        bC.put(aP, 0x10000 | i1 | 4);
        bC.put(aQ, i1 | 0x20000 | 2);
        bC.put(aS, i1 | 0x20000 | 2);
        bC.put(aR, 0xa0000 | i1 | 3);
        bC.put(aT, 0xa0000 | i1 | 3);
        bC.put(aU, 0x10000 | i1 | 1);
        bC.put(aV, i1 | 0x50000 | 1);
        bC.put(aW, i1 | 0x50000 | 3);
        bC.put(aX, i1 | 0x20000);
        bC.put(aY, i1 | 0x20000 | 2);
        bC.put(aZ, i1 | 0x20000 | 2);
        bC.put(ba, i1 | 0x50000 | 1);
        bC.put(bb, i1 | 0x20000 | 2);
        bC.put(bc, i1 | 0x50000 | 1);
        bC.put(bd, i1 | 0x20000 | 2);
        bC.put(be, i1 | 0x50000 | 1);
        bC.put(bf, i1 | 0x20000 | 2);
        bC.put(bg, i1 | 0x50000 | 1);
        bC.put(bh, i1 | 0x20000);
        bC.put(bi, i1 | 0x20000 | 2);
        bC.put(bj, i1 | 0x50000 | 1);
        bC.put(bm, i1 | 0x20000 | 2);
        bC.put(bn, i1 | 0x50000 | 1);
        bC.put(bo, i1 | 0x20000 | 2);
        bC.put(bp, i1 | 0x50000 | 1);
        bC.put(bq, i1 | 0x70000);
        bC.put(br, i1 | 0x70000);
        bC.put(bs, i1 | 0x20000 | 0xb);
        bC.put(bt, i1 | 0x30000 | 0xb);
        i1 = a(new int[] {
            3
        });
        bC.put(bu, i1 << 24 | 0x20000);
    }

    protected static int e(int i1)
    {
        return 0xffff & i1;
    }

    protected static boolean e(int i1, int j1)
    {
        boolean flag1 = false;
        int ai1[] = it.sephiroth.android.library.b.i.a();
        int k1 = i(i1);
        i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < ai1.length)
                {
                    if (j1 != ai1[i1] || (k1 >> i1 & 1) != 1)
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

    protected static short f(int i1)
    {
        return (short)(i1 >> 16 & 0xff);
    }

    protected static int i(int i1)
    {
        return i1 >>> 24;
    }

    public int a(int i1)
    {
        if (b().get(i1) == 0)
        {
            return -1;
        } else
        {
            return b(i1);
        }
    }

    public h a(int i1, int j1)
    {
        if (!it.sephiroth.android.library.b.h.a(j1))
        {
            return null;
        } else
        {
            return bx.a(c(i1), j1);
        }
    }

    public h a(int i1, int j1, Object obj)
    {
        int k1 = b().get(i1);
        h h1;
        if (k1 == 0 || obj == null)
        {
            h1 = null;
        } else
        {
            short word0 = f(k1);
            int l1 = e(k1);
            boolean flag;
            if (l1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!e(k1, j1))
            {
                return null;
            }
            h h2 = new h(c(i1), word0, l1, j1, flag);
            h1 = h2;
            if (!h2.a(obj))
            {
                return null;
            }
        }
        return h1;
    }

    public h a(int i1, Object obj)
    {
        return a(i1, b(i1), obj);
    }

    public h a(h h1)
    {
        return bx.a(h1);
    }

    public List a()
    {
        return bx.f();
    }

    public void a(InputStream inputstream, int i1)
        throws IOException
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("Argument is null");
        }
        try
        {
            inputstream = (new g(this)).a(inputstream, i1);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException((new StringBuilder()).append("Invalid exif format : ").append(inputstream).toString());
        }
        bx = inputstream;
    }

    public void a(String s1)
        throws IOException
    {
        File file;
        Log.i("ExifInterface", (new StringBuilder()).append("writeExif: ").append(s1).toString());
        file = new File(s1);
        s1 = new File((new StringBuilder()).append(s1).append(".t").toString());
        Log.d("ExifInterface", "delete old backup file");
        s1.delete();
        a(file.getAbsolutePath(), s1.getAbsolutePath());
        Log.d("ExifInterface", "rename the bak into dst");
        s1.renameTo(file);
        s1.delete();
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        s1.delete();
        throw obj;
    }

    public void a(String s1, String s2)
        throws IOException
    {
        Log.i("ExifInterface", (new StringBuilder()).append("writeExif: ").append(s2).toString());
        if (s1.equals(s2))
        {
            return;
        } else
        {
            s1 = new FileInputStream(s1);
            s2 = new FileOutputStream(s2);
            int i1 = a(((InputStream) (s1)), ((OutputStream) (s2)), bx);
            FileChannel filechannel = s1.getChannel();
            FileChannel filechannel1 = s2.getChannel();
            filechannel.transferTo(i1, filechannel.size() - (long)i1, filechannel1);
            s2.flush();
            IOUtils.closeQuietly(s1);
            IOUtils.closeQuietly(s2);
            return;
        }
    }

    public void a(Collection collection)
    {
        if (collection != null)
        {
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                a((h)collection.next());
            }
        }
    }

    protected SparseIntArray b()
    {
        if (bC == null)
        {
            bC = new SparseIntArray();
            d();
        }
        return bC;
    }

    public Integer b(int i1, int j1)
    {
        int ai1[] = c(i1, j1);
        if (ai1 == null || ai1.length <= 0)
        {
            return null;
        } else
        {
            return new Integer(ai1[0]);
        }
    }

    public int[] c()
    {
        return bx.g();
    }

    public int[] c(int i1, int j1)
    {
        h h1 = a(i1, j1);
        if (h1 == null)
        {
            return null;
        } else
        {
            return h1.g();
        }
    }

    public Integer d(int i1)
    {
        return b(i1, a(i1));
    }

    public void d(int i1, int j1)
    {
        bx.b(c(i1), j1);
    }

    protected h g(int i1)
    {
        int j1 = b().get(i1);
        if (j1 == 0)
        {
            return null;
        }
        short word0 = f(j1);
        j1 = e(j1);
        int k1;
        boolean flag;
        if (j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = b(i1);
        return new h(c(i1), word0, j1, k1, flag);
    }

    public void h(int i1)
    {
        d(i1, a(i1));
    }

    static 
    {
        i = a(0, (short)273);
        m = a(0, (short)279);
        C = a(0, (short)-30871);
        D = a(0, (short)-30683);
        E = a(1, (short)513);
        F = a(1, (short)514);
        am = a(2, (short)-24571);
        bv = ByteOrder.BIG_ENDIAN;
        bA = new HashSet();
        bA.add(Short.valueOf(c(D)));
        bA.add(Short.valueOf(c(C)));
        bA.add(Short.valueOf(c(E)));
        bA.add(Short.valueOf(c(am)));
        bA.add(Short.valueOf(c(i)));
        bw = new HashSet(bA);
        bw.add(Short.valueOf(c(-1)));
        bw.add(Short.valueOf(c(F)));
        bw.add(Short.valueOf(c(m)));
    }
}
