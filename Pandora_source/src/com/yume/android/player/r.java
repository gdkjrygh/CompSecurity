// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package com.yume.android.player:
//            s

final class r
{

    private byte A[];
    private int B;
    private int C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private short H[];
    private byte I[];
    private byte J[];
    private byte K[];
    private Vector L;
    private int M;
    private InputStream a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h[];
    private int i[];
    private int j[];
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private Bitmap y;
    private Bitmap z;

    r()
    {
        g = 1;
        A = new byte[256];
        B = 0;
        C = 0;
        D = 0;
        E = false;
        F = 0;
    }

    private boolean c()
    {
        return b != 0;
    }

    private int[] c(int i1)
    {
        int ai[];
        byte abyte0[];
        int l1;
        l1 = 0;
        int i2 = i1 * 3;
        ai = null;
        abyte0 = new byte[i2];
        int j1;
        try
        {
            j1 = a.read(abyte0);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            j1 = 0;
        }
        if (j1 >= i2) goto _L2; else goto _L1
_L1:
        b = 1;
_L4:
        return ai;
_L2:
        int ai1[] = new int[256];
        int k1 = 0;
        do
        {
            ai = ai1;
            if (k1 >= i1)
            {
                continue;
            }
            int j2 = l1 + 1;
            byte byte0 = abyte0[l1];
            l1 = j2 + 1;
            ai1[k1] = (byte0 & 0xff) << 16 | 0xff000000 | (abyte0[j2] & 0xff) << 8 | abyte0[l1] & 0xff;
            k1++;
            l1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int d()
    {
        int i1;
        try
        {
            i1 = a.read();
        }
        catch (Exception exception)
        {
            b = 1;
            return 0;
        }
        return i1;
    }

    private int e()
    {
        int i1;
        int j1;
        B = d();
        j1 = 0;
        i1 = 0;
        if (B <= 0) goto _L2; else goto _L1
_L1:
        j1 = B;
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        j1 = i1;
        if (i1 < B)
        {
            b = 1;
            j1 = i1;
        }
_L2:
        return j1;
_L4:
        j1 = a.read(A, i1, B - i1);
        if (j1 == -1) goto _L3; else goto _L5
_L5:
        i1 += j1;
          goto _L1
        Exception exception;
        exception;
        exception.printStackTrace();
          goto _L3
    }

    private void f()
    {
        boolean flag1 = false;
_L7:
        if (flag1) goto _L2; else goto _L1
_L1:
        try
        {
            if (c())
            {
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        d();
        JVM INSTR lookupswitch 3: default 1681
    //                   33: 1366
    //                   44: 66
    //                   59: 1582;
           goto _L3 _L4 _L5 _L6
_L3:
        b = 1;
          goto _L7
_L5:
        int i1;
        q = i();
        r = i();
        s = i();
        t = i();
        i1 = d();
        Object obj;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int k5;
        int l5;
        int i6;
        boolean flag2;
        if ((i1 & 0x80) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        n = flag2;
        p = (int)Math.pow(2D, (i1 & 7) + 1);
        if ((i1 & 0x40) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        o = flag2;
        if (!n) goto _L9; else goto _L8
_L8:
        i = c(p);
        j = i;
_L30:
        j4 = 0;
        if (E)
        {
            j4 = j[G];
            j[G] = 0;
        }
        if (j == null)
        {
            b = 1;
        }
        flag2 = c();
        if (flag2) goto _L7; else goto _L10
_L10:
        k5 = s * t;
        if (K == null || K.length < k5)
        {
            K = new byte[k5];
        }
        if (H == null)
        {
            H = new short[4096];
        }
        if (I == null)
        {
            I = new byte[4096];
        }
        if (J == null)
        {
            J = new byte[4097];
        }
        l5 = d();
        i6 = 1 << l5;
        k2 = i6 + 2;
        i2 = -1;
        j1 = l5 + 1;
        k1 = (1 << j1) - 1;
        i1 = 0;
_L31:
        if (i1 < i6) goto _L12; else goto _L11
_L11:
        i4 = 0;
        l3 = 0;
        l1 = 0;
        l2 = 0;
        boolean flag = false;
        k4 = 0;
        k3 = 0;
        j2 = 0;
        i1 = i2;
        i2 = ((flag) ? 1 : 0);
_L39:
        if (k4 < k5) goto _L14; else goto _L13
_L13:
        if (i4 < k5) goto _L16; else goto _L15
_L15:
        j();
        if (c()) goto _L7; else goto _L17
_L17:
        M = M + 1;
        y = Bitmap.createBitmap(c, d, android.graphics.Bitmap.Config.ARGB_4444);
        obj = new int[c * d];
        if (D <= 0) goto _L19; else goto _L18
_L18:
        if (D != 3) goto _L21; else goto _L20
_L20:
        i1 = M - 2;
        if (i1 <= 0) goto _L23; else goto _L22
_L22:
        z = b(i1 - 1);
_L21:
        if (z == null) goto _L19; else goto _L24
_L24:
        z.getPixels(((int []) (obj)), 0, c, 0, 0, c, d);
        if (D != 2) goto _L19; else goto _L25
_L25:
        j1 = 0;
        if (!E)
        {
            j1 = m;
        }
          goto _L26
_L76:
        if (k1 < x) goto _L27; else goto _L19
_L77:
        if (j2 < t) goto _L29; else goto _L28
_L28:
        y = Bitmap.createBitmap(((int []) (obj)), c, d, android.graphics.Bitmap.Config.ARGB_4444);
_L81:
        try
        {
            L.addElement(new s(y, F));
            if (E)
            {
                j[G] = j4;
            }
            D = C;
            u = q;
            v = r;
            w = s;
            x = t;
            z = y;
            m = l;
            C = 0;
            E = false;
            F = 0;
            i = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L7
_L9:
        j = h;
        if (k == G)
        {
            l = 0;
        }
          goto _L30
_L12:
        H[i1] = 0;
        I[i1] = (byte)i1;
        i1++;
          goto _L31
_L14:
        if (l1 != 0) goto _L33; else goto _L32
_L32:
        if (j2 >= j1) goto _L35; else goto _L34
_L34:
        if (k3 != 0) goto _L37; else goto _L36
_L36:
        j3 = e();
        if (j3 <= 0) goto _L13; else goto _L38
_L38:
        k3 = 0;
_L74:
        i2 += (A[k3] & 0xff) << j2;
        j2 += 8;
        l3 = k3 + 1;
        k3 = j3 - 1;
          goto _L39
_L80:
        if (i1 != -1) goto _L41; else goto _L40
_L40:
        J[l1] = I[j3];
        l1++;
        i1 = j3;
        l2 = j3;
        i2 = l4;
          goto _L39
_L41:
        if (j3 != k2) goto _L43; else goto _L42
_L42:
        obj = J;
        int i5 = l1 + 1;
        obj[l1] = (byte)l2;
        i2 = i1;
        l1 = i5;
_L48:
        if (i2 > i6) goto _L45; else goto _L44
_L44:
        l2 = I[i2] & 0xff;
        if (k2 >= 4096) goto _L13; else goto _L46
_L46:
        J[l1] = (byte)l2;
        H[k2] = (short)i1;
        I[k2] = (byte)l2;
          goto _L47
_L75:
        l4 = l2 - 1;
        K[i4] = J[l4];
        j5 = k4 + 1;
        i4++;
        l2 = k2;
        k2 = l1;
        l1 = j2;
        j2 = j1;
        j3 = i2;
        k4 = k1;
        j1 = l2;
        k1 = l1;
        l1 = l4;
        l2 = i1;
        i2 = j2;
        j2 = k2;
        i1 = k4;
        k2 = j3;
        k4 = j5;
          goto _L39
_L45:
        J[l1] = I[i2];
        i2 = H[i2];
        l1++;
          goto _L48
_L16:
        K[i4] = 0;
        i4++;
          goto _L13
_L23:
        z = null;
          goto _L21
_L27:
        l1 = (v + k1) * c + u;
        i2 = w;
        i1 = l1;
          goto _L49
_L29:
        if (!o) goto _L51; else goto _L50
_L50:
        i1 = j1;
        i2 = k1;
        k2 = l1;
        if (j1 < t) goto _L53; else goto _L52
_L52:
        k2 = l1 + 1;
        k2;
        JVM INSTR tableswitch 2 4: default 1861
    //                   2 1922
    //                   3 1931
    //                   4 1939;
           goto _L54 _L55 _L56 _L57
_L73:
        l1 += r;
        if (l1 >= d) goto _L59; else goto _L58
_L58:
        k2 = l1 * c;
        i2 = q + k2;
        l1 = s + i2;
        if (c + k2 < l1)
        {
            l1 = c + k2;
        }
        k2 = s * j2;
          goto _L60
_L84:
        l2 = K[k2];
        l2 = j[l2 & 0xff];
        if (l2 != 0)
        {
            obj[i2] = l2;
        }
        i2++;
        k2++;
        continue; /* Loop/switch isn't completed */
_L4:
        d();
        JVM INSTR lookupswitch 4: default 1947
    //                   1: 1575
    //                   249: 1419
    //                   254: 1568
    //                   255: 1497;
           goto _L61 _L62 _L63 _L64 _L65
_L61:
        j();
          goto _L7
_L63:
        d();
        i1 = d();
        C = (i1 & 0x1c) >> 2;
        if (C == 0)
        {
            C = 1;
        }
          goto _L66
_L67:
        try
        {
            E = flag2;
            F = i() * 10;
            G = d();
            d();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L7
_L86:
        flag2 = false;
          goto _L67
_L65:
        e();
        obj = "";
        i1 = 0;
_L72:
        if (i1 < 11) goto _L69; else goto _L68
_L68:
        if (!((String) (obj)).equals("NETSCAPE2.0")) goto _L71; else goto _L70
_L70:
        h();
          goto _L7
_L69:
        obj = (new StringBuilder(String.valueOf(obj))).append((char)A[i1]).toString();
        i1++;
          goto _L72
_L71:
        j();
          goto _L7
_L64:
        j();
          goto _L7
_L62:
        j();
          goto _L7
_L6:
        flag1 = true;
          goto _L7
        obj;
          goto _L15
_L51:
        i1 = j1;
        j1 = k1;
        k1 = l1;
        l1 = j2;
          goto _L73
_L43:
        i2 = j3;
          goto _L48
_L37:
        j3 = k3;
        k3 = l3;
          goto _L74
_L33:
        j3 = k1;
        l4 = l2;
        k1 = j2;
        j2 = j1;
        j1 = i2;
        j5 = i1;
        i2 = k2;
        l2 = l1;
        i1 = l4;
        l1 = k1;
        k1 = j5;
        k2 = j2;
        j2 = j3;
          goto _L75
_L2:
        return;
_L26:
        k1 = 0;
          goto _L76
_L19:
        l1 = 1;
        k1 = 8;
        j1 = 0;
        j2 = 0;
          goto _L77
_L35:
        j3 = i2 & k1;
        l4 = i2 >> j1;
        j2 -= j1;
        if (j3 > k2 || j3 == i6 + 1) goto _L13; else goto _L78
_L78:
        if (j3 != i6) goto _L80; else goto _L79
_L79:
        j1 = l5 + 1;
        k1 = (1 << j1) - 1;
        k2 = i6 + 2;
        i1 = -1;
        i2 = l4;
          goto _L39
_L47:
        int j5 = k2 + 1;
        i1 = j1;
        i2 = k1;
        if ((j5 & k1) == 0)
        {
            i1 = j1;
            i2 = k1;
            if (j5 < 4096)
            {
                i1 = j1 + 1;
                i2 = k1 + j5;
            }
        }
        j1 = l4;
        k1 = j3;
        j3 = l2;
        k2 = i1;
        l2 = l1 + 1;
        i1 = j3;
        l1 = j2;
        j2 = i2;
        i2 = j5;
          goto _L75
        obj;
          goto _L81
_L49:
        if (i1 < i2 + l1) goto _L83; else goto _L82
_L82:
        k1++;
          goto _L76
_L83:
        obj[i1] = j1;
        i1++;
          goto _L49
_L54:
        i2 = k1;
        i1 = j1;
_L53:
        int i3 = i1 + i2;
        j1 = i2;
        k1 = k2;
        l1 = i1;
        i1 = i3;
          goto _L73
_L60:
        if (i2 < l1) goto _L84; else goto _L59
_L59:
        j2++;
        l1 = j1;
        i2 = k1;
        j1 = i1;
        k1 = l1;
        l1 = i2;
          goto _L77
_L55:
        i1 = 4;
        i2 = k1;
          goto _L53
_L56:
        i1 = 2;
        i2 = 4;
          goto _L53
_L57:
        i1 = 1;
        i2 = 2;
          goto _L53
_L66:
        if ((i1 & 1) == 0) goto _L86; else goto _L85
_L85:
        flag2 = true;
          goto _L67
    }

    private void g()
    {
        String s1;
        int i1;
        boolean flag;
        flag = true;
        s1 = "";
        i1 = 0;
_L2:
        if (i1 >= 6)
        {
            try
            {
                if (!s1.startsWith("GIF"))
                {
                    b = 1;
                    return;
                }
            }
            catch (Exception exception)
            {
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        s1 = (new StringBuilder(String.valueOf(s1))).append((char)d()).toString();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        c = i();
        d = i();
        i1 = d();
        if ((i1 & 0x80) == 0)
        {
            flag = false;
        }
        try
        {
            e = flag;
            f = 2 << (i1 & 7);
            k = d();
            d();
        }
        catch (Exception exception1) { }
        if (e && !c())
        {
            h = c(f);
            l = h[k];
            return;
        }
    }

    private void h()
    {
        boolean flag;
        do
        {
            try
            {
                e();
                if (A[0] == 1)
                {
                    g = A[1] & 0xff | (A[2] & 0xff) << 8;
                }
                if (B <= 0)
                {
                    break;
                }
                flag = c();
            }
            catch (Exception exception)
            {
                return;
            }
        } while (!flag);
    }

    private int i()
    {
        return d() | d() << 8;
    }

    private void j()
    {
        do
        {
            e();
        } while (B > 0 && !c());
    }

    public final int a()
    {
        return M;
    }

    public final int a(int i1)
    {
        F = -1;
        F = -1;
        if (i1 >= 0)
        {
            try
            {
                if (i1 < M)
                {
                    F = ((s)L.elementAt(i1)).b;
                }
            }
            catch (Exception exception) { }
        }
        return F;
    }

    public final int a(InputStream inputstream)
    {
        try
        {
            b = 0;
            M = 0;
            L = new Vector();
            h = null;
            i = null;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return 0;
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        a = inputstream;
        g();
        if (!c())
        {
            f();
            if (M < 0)
            {
                b = 1;
            }
        }
_L1:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        return b;
        b = 2;
          goto _L1
    }

    public final int b()
    {
        return g;
    }

    public final Bitmap b(int i1)
    {
        if (M <= 0)
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            int j1 = M;
            bitmap = ((s)L.elementAt(i1 % j1)).a;
        }
        catch (Exception exception)
        {
            return null;
        }
        return bitmap;
    }
}
