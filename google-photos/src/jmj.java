// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

public final class jmj
    implements jkd
{

    private static final byte F[] = {
        49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
        44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
        48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
        48, 10
    };
    private static final byte G[] = {
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
        32, 32
    };
    int A;
    int B;
    int C;
    boolean D;
    jkf E;
    private final jmf H;
    private final jnl I;
    private final jnl J;
    private final jnl K;
    private final jnl L;
    private final jnl M;
    private long N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private boolean S;
    final jmi a;
    final SparseArray b;
    final jnl c;
    final jnl d;
    long e;
    long f;
    long g;
    long h;
    long i;
    jml j;
    boolean k;
    boolean l;
    int m;
    long n;
    boolean o;
    long p;
    long q;
    jnh r;
    jnh s;
    boolean t;
    int u;
    long v;
    long w;
    int x;
    int y;
    int z[];

    public jmj()
    {
        this(new jmf());
    }

    private jmj(jmf jmf1)
    {
        e = -1L;
        f = -1L;
        g = -1L;
        h = -1L;
        i = -1L;
        p = -1L;
        N = -1L;
        q = -1L;
        H = jmf1;
        H.a(new jmk(this));
        a = new jmi();
        b = new SparseArray();
        c = new jnl(4);
        K = new jnl(ByteBuffer.allocate(4).putInt(-1).array());
        d = new jnl(4);
        I = new jnl(jnj.a);
        J = new jnl(4);
        L = new jnl();
        M = new jnl();
    }

    static int a(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 160: 
        case 174: 
        case 183: 
        case 187: 
        case 224: 
        case 225: 
        case 18407: 
        case 19899: 
        case 20532: 
        case 20533: 
        case 25152: 
        case 28032: 
        case 290298740: 
        case 357149030: 
        case 374648427: 
        case 408125543: 
        case 440786851: 
        case 475249515: 
        case 524531317: 
            return 1;

        case 131: 
        case 155: 
        case 159: 
        case 176: 
        case 179: 
        case 186: 
        case 215: 
        case 231: 
        case 241: 
        case 251: 
        case 16980: 
        case 17029: 
        case 17143: 
        case 18401: 
        case 18408: 
        case 20529: 
        case 20530: 
        case 21420: 
        case 22186: 
        case 22203: 
        case 2352003: 
        case 2807729: 
            return 2;

        case 134: 
        case 17026: 
        case 2274716: 
            return 3;

        case 161: 
        case 163: 
        case 16981: 
        case 18402: 
        case 21419: 
        case 25506: 
            return 4;

        case 181: 
        case 17545: 
            return 5;
        }
    }

    private int a(jke jke1, jkq jkq1, int i1)
    {
        int j1 = L.b();
        if (j1 > 0)
        {
            i1 = Math.min(i1, j1);
            jkq1.a(L, i1);
        } else
        {
            i1 = jkq1.a(jke1, i1, false);
        }
        O = O + i1;
        R = R + i1;
        return i1;
    }

    private void a()
    {
        O = 0;
        R = 0;
        Q = 0;
        P = false;
        L.a();
    }

    static int[] a(int ai[], int i1)
    {
        int ai1[];
        if (ai == null)
        {
            ai1 = new int[i1];
        } else
        {
            ai1 = ai;
            if (ai.length < i1)
            {
                return new int[Math.max(ai.length << 1, i1)];
            }
        }
        return ai1;
    }

    static boolean b(int i1)
    {
        return i1 == 0x1549a966 || i1 == 0x1f43b675 || i1 == 0x1c53bb6b || i1 == 0x1654ae6b;
    }

    public final int a(jke jke1, jkk jkk1)
    {
        S = false;
        boolean flag1;
        for (flag1 = true; flag1 && !S;)
        {
            flag1 = H.a(jke1);
            if (flag1)
            {
                long l1 = jke1.b();
                boolean flag;
                if (o)
                {
                    N = l1;
                    jkk1.a = p;
                    o = false;
                    flag = true;
                } else
                if (l && N != -1L)
                {
                    jkk1.a = N;
                    N = -1L;
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return 1;
                }
            }
        }

        return !flag1 ? -1 : 0;
    }

    long a(long l1)
    {
        if (g == -1L)
        {
            throw new jjj("Can't scale timecode prior to timecodeScale being set.");
        } else
        {
            return jno.a(l1, g, 1000L);
        }
    }

    void a(jke jke1, int i1)
    {
        if (c.c >= i1)
        {
            return;
        }
        if (c.c() < i1)
        {
            c.a(Arrays.copyOf(c.a, Math.max(c.a.length << 1, i1)), c.c);
        }
        jke1.b(c.a, c.c, i1 - c.c);
        c.a(i1);
    }

    void a(jke jke1, jml jml1, int i1)
    {
        if (!"S_TEXT/UTF8".equals(jml1.a)) goto _L2; else goto _L1
_L1:
        int j1 = F.length + i1;
        if (M.c() < j1)
        {
            M.a = Arrays.copyOf(F, j1 + i1);
        }
        jke1.b(M.a, F.length, i1);
        M.b(0);
        M.a(j1);
_L10:
        return;
_L2:
        jkq jkq1 = jml1.p;
        if (P) goto _L4; else goto _L3
_L3:
        if (!jml1.e) goto _L6; else goto _L5
_L5:
        C = C & -3;
        jke1.b(c.a, 0, 1);
        O = O + 1;
        if ((c.a[0] & 0x80) == 128)
        {
            throw new jjj("Extension bit is set in signal byte");
        }
        if ((c.a[0] & 1) == 1)
        {
            c.a[0] = 8;
            c.b(0);
            jkq1.a(c, 1);
            R = R + 1;
            C = C | 2;
        }
_L8:
        P = true;
_L4:
        i1 = L.c + i1;
        if (!"V_MPEG4/ISO/AVC".equals(jml1.a) && !"V_MPEGH/ISO/HEVC".equals(jml1.a))
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = J.a;
        abyte0[0] = 0;
        abyte0[1] = 0;
        abyte0[2] = 0;
        int k1 = jml1.q;
        int l1 = 4 - jml1.q;
        while (O < i1) 
        {
            if (Q == 0)
            {
                int i2 = Math.min(k1, L.b());
                jke1.b(abyte0, l1 + i2, k1 - i2);
                if (i2 > 0)
                {
                    L.a(abyte0, l1, i2);
                }
                O = O + k1;
                J.b(0);
                Q = J.j();
                I.b(0);
                jkq1.a(I, 4);
                R = R + 4;
            } else
            {
                Q = Q - a(jke1, jkq1, Q);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (jml1.f != null)
        {
            L.a(jml1.f, jml1.f.length);
        }
        if (true) goto _L8; else goto _L7
_L7:
        while (O < i1) 
        {
            a(jke1, jkq1, i1 - O);
        }
        if (!"A_VORBIS".equals(jml1.a)) goto _L10; else goto _L9
_L9:
        K.b(0);
        jkq1.a(K, 4);
        R = R + 4;
        return;
    }

    public final void a(jkf jkf)
    {
        E = jkf;
    }

    void a(jml jml1, long l1)
    {
        if ("S_TEXT/UTF8".equals(jml1.a))
        {
            byte abyte1[] = M.a;
            long l2 = w;
            byte abyte0[];
            if (l2 == -1L)
            {
                abyte0 = G;
            } else
            {
                int i1 = (int)(l2 / 0xd693a400L);
                l2 -= (long)i1 * 0xd693a400L;
                int j1 = (int)(l2 / 0x3938700L);
                l2 -= 0x3938700 * j1;
                int k1 = (int)(l2 / 0xf4240L);
                int i2 = (int)((l2 - (long)(0xf4240 * k1)) / 1000L);
                abyte0 = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[] {
                    Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(i2)
                }).getBytes();
            }
            System.arraycopy(abyte0, 0, abyte1, 19, 12);
            jml1.p.a(M, M.c);
            R = R + M.c;
        }
        jml1.p.a(l1, C, R, 0, jml1.g);
        S = true;
        a();
    }

    public final boolean a(jke jke1)
    {
        jmh jmh1;
        long l1;
        long l3;
        long l4;
        jmh1 = new jmh();
        long l2 = jke1.c();
        int i1;
        if (l2 == -1L || l2 > 1024L)
        {
            l1 = 1024L;
        } else
        {
            l1 = l2;
        }
        i1 = (int)l1;
        jke1.c(jmh1.a.a, 0, 4);
        l1 = jmh1.a.g();
        jmh1.b = 4;
        for (; l1 != 0x1a45dfa3L; l1 = l1 << 8 & -256L | (long)(jmh1.a.a[0] & 0xff))
        {
            int j1 = jmh1.b + 1;
            jmh1.b = j1;
            if (j1 == i1)
            {
                break MISSING_BLOCK_LABEL_293;
            }
            jke1.c(jmh1.a.a, 0, 1);
        }

        l1 = jmh1.a(jke1);
        l4 = jmh1.b;
        if (l1 == 0x8000000000000000L || l2 != -1L && l4 + l1 >= l2)
        {
            return false;
        }
_L4:
        if ((long)jmh1.b >= l4 + l1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (jmh1.a(jke1) == 0x8000000000000000L)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        l3 = jmh1.a(jke1);
        if (l3 < 0L || l3 > 0x7fffffffL)
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        if (l3 != 0L)
        {
            jke1.b((int)l3);
            jmh1.b = (int)(l3 + (long)jmh1.b);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ((long)jmh1.b == l1 + l4)
        {
            return true;
        }
        return false;
    }

    public final void b()
    {
        q = -1L;
        u = 0;
        H.a();
        a.a();
        a();
    }

}
