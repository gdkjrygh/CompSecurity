// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.exoplayer.ParserException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class bcv
    implements bbx
{

    int A;
    int B;
    int C;
    byte D[];
    boolean E;
    bbz F;
    private final bcs G;
    private final bec H;
    private final bec I;
    private final bec J;
    private final bec K;
    private long L;
    private int M;
    private boolean N;
    private int O;
    private int P;
    private boolean Q;
    final bcu a;
    final bec b;
    final bec c;
    long d;
    long e;
    long f;
    long g;
    long h;
    bcx i;
    bcx j;
    bcx k;
    boolean l;
    int m;
    long n;
    boolean o;
    long p;
    int q;
    long r;
    bdv s;
    bdv t;
    boolean u;
    int v;
    long w;
    int x;
    int y;
    int z[];

    public bcv()
    {
        this(((bcs) (new bcq())));
    }

    private bcv(bcs bcs1)
    {
        d = -1L;
        e = -1L;
        f = -1L;
        g = -1L;
        h = -1L;
        p = -1L;
        L = -1L;
        q = 0;
        r = -1L;
        G = bcs1;
        G.a(new bcw(this, (byte)0));
        a = new bcu();
        b = new bec(4);
        J = new bec(ByteBuffer.allocate(4).putInt(-1).array());
        c = new bec(4);
        H = new bec(beb.a);
        I = new bec(4);
        K = new bec();
    }

    private int a(bby bby1, bce bce1, int i1)
    {
        int j1 = K.b();
        if (j1 > 0)
        {
            i1 = Math.min(i1, j1);
            bce1.a(K, i1);
        } else
        {
            i1 = bce1.a(bby1, i1, false);
        }
        M = M + i1;
        P = P + i1;
        return i1;
    }

    static boolean a(String s1)
    {
        return "V_VP8".equals(s1) || "V_VP9".equals(s1) || "V_MPEG4/ISO/SP".equals(s1) || "V_MPEG4/ISO/ASP".equals(s1) || "V_MPEG4/ISO/AP".equals(s1) || "V_MPEG4/ISO/AVC".equals(s1) || "V_MPEGH/ISO/HEVC".equals(s1) || "A_OPUS".equals(s1) || "A_VORBIS".equals(s1) || "A_AAC".equals(s1) || "A_MPEG/L3".equals(s1) || "A_AC3".equals(s1);
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

    private void b()
    {
        M = 0;
        P = 0;
        O = 0;
        N = false;
        K.a();
    }

    public final int a(bby bby1)
    {
        Q = false;
        boolean flag1;
        for (flag1 = true; flag1 && !Q;)
        {
            flag1 = G.a(bby1);
            if (flag1)
            {
                long l1 = bby1.a();
                boolean flag;
                if (o)
                {
                    L = l1;
                    q = 1;
                    o = false;
                    flag = true;
                } else
                if (q == 2 && L != -1L)
                {
                    L = -1L;
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

    final long a(long l1)
    {
        if (f == -1L)
        {
            throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
        } else
        {
            return bej.a(l1, f, 1000L);
        }
    }

    public final void a()
    {
        r = -1L;
        v = 0;
        G.a();
        a.a();
        b();
    }

    final void a(bby bby1, int i1)
    {
        boolean flag1 = false;
        if (b.c >= i1)
        {
            return;
        }
        bec bec1 = b;
        int j1;
        boolean flag;
        if (bec1.a == null)
        {
            j1 = 0;
        } else
        {
            j1 = bec1.a.length;
        }
        if (j1 < i1)
        {
            b.a(Arrays.copyOf(b.a, Math.max(b.a.length << 1, i1)), b.c);
        }
        bby1.b(b.a, b.c, i1 - b.c);
        bby1 = b;
        flag = flag1;
        if (i1 >= 0)
        {
            flag = flag1;
            if (i1 <= ((bec) (bby1)).a.length)
            {
                flag = true;
            }
        }
        bds.a(flag);
        bby1.c = i1;
    }

    final void a(bby bby1, bce bce1, bcx bcx1, int i1)
    {
        if (N) goto _L2; else goto _L1
_L1:
        if (!bcx1.e) goto _L4; else goto _L3
_L3:
        C = C & -3;
        bby1.b(b.a, 0, 1);
        M = M + 1;
        if ((b.a[0] & 0x80) == 128)
        {
            throw new ParserException("Extension bit is set in signal byte");
        }
        if ((b.a[0] & 1) == 1)
        {
            b.a[0] = 8;
            b.a(0);
            bce1.a(b, 1);
            P = P + 1;
            C = C | 2;
        }
_L6:
        N = true;
_L2:
        i1 = K.c + i1;
        if (!"V_MPEG4/ISO/AVC".equals(bcx1.a) && !"V_MPEGH/ISO/HEVC".equals(bcx1.a))
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = I.a;
        abyte0[0] = 0;
        abyte0[1] = 0;
        abyte0[2] = 0;
        int j1 = bcx1.k;
        int k1 = 4 - bcx1.k;
        while (M < i1) 
        {
            if (O == 0)
            {
                int l1 = Math.min(j1, K.b());
                bby1.b(abyte0, k1 + l1, j1 - l1);
                if (l1 > 0)
                {
                    K.a(abyte0, k1, l1);
                }
                M = M + j1;
                I.a(0);
                O = I.h();
                H.a(0);
                bce1.a(H, 4);
                P = P + 4;
            } else
            {
                O = O - a(bby1, bce1, O);
            }
        }
        break MISSING_BLOCK_LABEL_426;
_L4:
        if (bcx1.f != null)
        {
            K.a(bcx1.f, bcx1.f.length);
        }
        if (true) goto _L6; else goto _L5
_L5:
        while (M < i1) 
        {
            a(bby1, bce1, i1 - M);
        }
        if ("A_VORBIS".equals(bcx1.a))
        {
            J.a(0);
            bce1.a(J, 4);
            P = P + 4;
        }
        return;
    }

    public final void a(bbz bbz)
    {
        F = bbz;
    }

    final void a(bce bce1, long l1)
    {
        bce1.a(l1, C, P, 0, D);
        Q = true;
        b();
    }
}
