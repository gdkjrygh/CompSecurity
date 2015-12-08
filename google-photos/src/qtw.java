// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class qtw extends qtx
{

    private static Map h;
    private static Map i;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    public int a;
    public int b;
    public int c;
    private byte g[];
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public qtw()
    {
    }

    private static int a(qty qty1)
    {
        int j1 = qty1.a(5);
        int i1 = j1;
        if (j1 == 31)
        {
            i1 = qty1.a(6) + 32;
        }
        return i1;
    }

    public final int a()
    {
        if (a != 2)
        {
            throw new UnsupportedOperationException("can't serialize that yet");
        } else
        {
            return 4;
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = bytebuffer.slice();
        bytebuffer1.limit(e);
        bytebuffer.position(bytebuffer.position() + e);
        g = new byte[e];
        bytebuffer1.get(g);
        bytebuffer1.rewind();
        bytebuffer = new qty(bytebuffer1);
        a = a(((qty) (bytebuffer)));
        b = bytebuffer.a(4);
        if (b == 15)
        {
            j = bytebuffer.a(24);
        }
        c = bytebuffer.a(4);
        if (a == 5 || a == 29)
        {
            k = 5;
            l = 1;
            if (a == 29)
            {
                m = 1;
            }
            n = bytebuffer.a(4);
            if (n == 15)
            {
                o = bytebuffer.a(24);
            }
            a = a(((qty) (bytebuffer)));
            if (a == 22)
            {
                p = bytebuffer.a(4);
            }
        } else
        {
            k = 0;
        }
        a;
        JVM INSTR tableswitch 1 41: default 384
    //                   1 704
    //                   2 704
    //                   3 704
    //                   4 704
    //                   5 384
    //                   6 704
    //                   7 704
    //                   8 903
    //                   9 914
    //                   10 384
    //                   11 384
    //                   12 925
    //                   13 936
    //                   14 936
    //                   15 936
    //                   16 936
    //                   17 704
    //                   18 384
    //                   19 704
    //                   20 704
    //                   21 704
    //                   22 704
    //                   23 704
    //                   24 947
    //                   25 958
    //                   26 969
    //                   27 969
    //                   28 1162
    //                   29 384
    //                   30 1173
    //                   31 384
    //                   32 1193
    //                   33 1193
    //                   34 1193
    //                   35 1204
    //                   36 1215
    //                   37 1235
    //                   38 1235
    //                   39 1246
    //                   40 1257
    //                   41 1257;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L2 _L2 _L3 _L4 _L1 _L1 _L5 _L6 _L6 _L6 _L6 _L2 _L1 _L2 _L2 _L2 _L2 _L2 _L7 _L8 _L9 _L9 _L10 _L1 _L11 _L1 _L12 _L12 _L12 _L13 _L14 _L15 _L15 _L16 _L17 _L17
_L1:
        a;
        JVM INSTR tableswitch 17 39: default 496
    //                   17 1268
    //                   18 496
    //                   19 1268
    //                   20 1268
    //                   21 1268
    //                   22 1268
    //                   23 1268
    //                   24 1268
    //                   25 1268
    //                   26 1268
    //                   27 1268
    //                   28 496
    //                   29 496
    //                   30 496
    //                   31 496
    //                   32 496
    //                   33 496
    //                   34 496
    //                   35 496
    //                   36 496
    //                   37 496
    //                   38 496
    //                   39 1268;
           goto _L18 _L19 _L18 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L19 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L18 _L19
_L18:
        if (k != 5 && bytebuffer.a() >= 16)
        {
            u = bytebuffer.a(11);
            if (u == 695)
            {
                k = a(((qty) (bytebuffer)));
                if (k == 5)
                {
                    l = bytebuffer.a(1);
                    if (l == 1)
                    {
                        n = bytebuffer.a(4);
                        if (n == 15)
                        {
                            o = bytebuffer.a(24);
                        }
                        if (bytebuffer.a() >= 12)
                        {
                            u = bytebuffer.a(11);
                            if (u == 1352)
                            {
                                m = bytebuffer.a(1);
                            }
                        }
                    }
                }
                if (k == 22)
                {
                    l = bytebuffer.a(1);
                    if (l == 1)
                    {
                        n = bytebuffer.a(4);
                        if (n == 15)
                        {
                            o = bytebuffer.a(24);
                        }
                    }
                    p = bytebuffer.a(4);
                }
            }
        }
        return;
_L2:
        int i1 = c;
        int k1 = a;
        v = bytebuffer.a(1);
        w = bytebuffer.a(1);
        if (w == 1)
        {
            x = bytebuffer.a(14);
        }
        y = bytebuffer.a(1);
        if (i1 == 0)
        {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (k1 == 6 || k1 == 20)
        {
            z = bytebuffer.a(3);
        }
        if (y == 1)
        {
            if (k1 == 22)
            {
                A = bytebuffer.a(5);
                B = bytebuffer.a(11);
            }
            if (k1 == 17 || k1 == 19 || k1 == 20 || k1 == 23)
            {
                C = bytebuffer.a(1);
                D = bytebuffer.a(1);
                E = bytebuffer.a(1);
            }
            F = bytebuffer.a(1);
        }
        G = true;
        continue; /* Loop/switch isn't completed */
_L3:
        throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
_L4:
        throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
_L5:
        throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
_L6:
        throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
_L7:
        throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
_L8:
        throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
_L9:
        int j1 = b;
        j1 = c;
        j1 = a;
        H = bytebuffer.a(1);
        if (H == 1)
        {
            I = bytebuffer.a(2);
            if (I != 1)
            {
                K = bytebuffer.a(1);
                L = bytebuffer.a(2);
                M = bytebuffer.a(1);
                if (M == 1)
                {
                    N = bytebuffer.a(1);
                }
            }
            if (I != 0)
            {
                O = bytebuffer.a(1);
                P = bytebuffer.a(8);
                Q = bytebuffer.a(4);
                R = bytebuffer.a(12);
                S = bytebuffer.a(2);
            }
            J = bytebuffer.a(1);
            V = true;
        } else
        {
            T = bytebuffer.a(1);
            if (T == 1)
            {
                U = bytebuffer.a(2);
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
_L11:
        q = bytebuffer.a(1);
        throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
_L12:
        throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
_L13:
        throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
_L14:
        r = bytebuffer.a(5);
        throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
_L15:
        throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
_L16:
        throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
_L17:
        throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
_L19:
        s = bytebuffer.a(2);
        if (s == 2 || s == 3)
        {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (s != 3) goto _L18; else goto _L20
_L20:
        t = bytebuffer.a(1);
        if (t != 0) goto _L18; else goto _L21
_L21:
        throw new RuntimeException("not implemented");
        if (true) goto _L1; else goto _L22
_L22:
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (qtw)obj;
            if (D != ((qtw) (obj)).D)
            {
                return false;
            }
            if (C != ((qtw) (obj)).C)
            {
                return false;
            }
            if (E != ((qtw) (obj)).E)
            {
                return false;
            }
            if (a != ((qtw) (obj)).a)
            {
                return false;
            }
            if (c != ((qtw) (obj)).c)
            {
                return false;
            }
            if (x != ((qtw) (obj)).x)
            {
                return false;
            }
            if (w != ((qtw) (obj)).w)
            {
                return false;
            }
            if (t != ((qtw) (obj)).t)
            {
                return false;
            }
            if (s != ((qtw) (obj)).s)
            {
                return false;
            }
            if (M != ((qtw) (obj)).M)
            {
                return false;
            }
            if (k != ((qtw) (obj)).k)
            {
                return false;
            }
            if (p != ((qtw) (obj)).p)
            {
                return false;
            }
            if (y != ((qtw) (obj)).y)
            {
                return false;
            }
            if (F != ((qtw) (obj)).F)
            {
                return false;
            }
            if (o != ((qtw) (obj)).o)
            {
                return false;
            }
            if (n != ((qtw) (obj)).n)
            {
                return false;
            }
            if (r != ((qtw) (obj)).r)
            {
                return false;
            }
            if (v != ((qtw) (obj)).v)
            {
                return false;
            }
            if (G != ((qtw) (obj)).G)
            {
                return false;
            }
            if (S != ((qtw) (obj)).S)
            {
                return false;
            }
            if (T != ((qtw) (obj)).T)
            {
                return false;
            }
            if (U != ((qtw) (obj)).U)
            {
                return false;
            }
            if (R != ((qtw) (obj)).R)
            {
                return false;
            }
            if (P != ((qtw) (obj)).P)
            {
                return false;
            }
            if (O != ((qtw) (obj)).O)
            {
                return false;
            }
            if (Q != ((qtw) (obj)).Q)
            {
                return false;
            }
            if (L != ((qtw) (obj)).L)
            {
                return false;
            }
            if (K != ((qtw) (obj)).K)
            {
                return false;
            }
            if (H != ((qtw) (obj)).H)
            {
                return false;
            }
            if (z != ((qtw) (obj)).z)
            {
                return false;
            }
            if (B != ((qtw) (obj)).B)
            {
                return false;
            }
            if (A != ((qtw) (obj)).A)
            {
                return false;
            }
            if (J != ((qtw) (obj)).J)
            {
                return false;
            }
            if (I != ((qtw) (obj)).I)
            {
                return false;
            }
            if (V != ((qtw) (obj)).V)
            {
                return false;
            }
            if (m != ((qtw) (obj)).m)
            {
                return false;
            }
            if (q != ((qtw) (obj)).q)
            {
                return false;
            }
            if (j != ((qtw) (obj)).j)
            {
                return false;
            }
            if (b != ((qtw) (obj)).b)
            {
                return false;
            }
            if (l != ((qtw) (obj)).l)
            {
                return false;
            }
            if (u != ((qtw) (obj)).u)
            {
                return false;
            }
            if (N != ((qtw) (obj)).N)
            {
                return false;
            }
            if (!Arrays.equals(g, ((qtw) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k1 = 1;
        int i1;
        int j1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        int k8;
        int l8;
        int i9;
        int j9;
        int k9;
        int l9;
        int i10;
        int j10;
        int k10;
        int l10;
        int i11;
        int j11;
        int k11;
        if (g != null)
        {
            i1 = Arrays.hashCode(g);
        } else
        {
            i1 = 0;
        }
        l1 = a;
        i2 = b;
        j2 = j;
        k2 = c;
        l2 = k;
        i3 = l;
        j3 = m;
        k3 = n;
        l3 = o;
        i4 = p;
        j4 = q;
        k4 = r;
        l4 = s;
        i5 = t;
        j5 = u;
        k5 = v;
        l5 = w;
        i6 = x;
        j6 = y;
        k6 = z;
        l6 = A;
        i7 = B;
        j7 = C;
        k7 = D;
        l7 = E;
        i8 = F;
        if (G)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        j8 = H;
        k8 = I;
        l8 = J;
        i9 = K;
        j9 = L;
        k9 = M;
        l9 = N;
        i10 = O;
        j10 = P;
        k10 = Q;
        l10 = R;
        i11 = S;
        j11 = T;
        k11 = U;
        if (!V)
        {
            k1 = 0;
        }
        return (((((((((((((((j1 + ((((((((((((((((((((((((((i1 * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6) * 31 + k6) * 31 + l6) * 31 + i7) * 31 + j7) * 31 + k7) * 31 + l7) * 31 + i8) * 31) * 31 + j8) * 31 + k8) * 31 + l8) * 31 + i9) * 31 + j9) * 31 + k9) * 31 + l9) * 31 + i10) * 31 + j10) * 31 + k10) * 31 + l10) * 31 + i11) * 31 + j11) * 31 + k11) * 31 + k1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("AudioSpecificConfig");
        stringbuilder.append("{configBytes=").append(bav.a(g));
        stringbuilder.append(", audioObjectType=").append(a).append(" (").append((String)i.get(Integer.valueOf(a))).append(")");
        stringbuilder.append(", samplingFrequencyIndex=").append(b).append(" (").append(h.get(Integer.valueOf(b))).append(")");
        stringbuilder.append(", samplingFrequency=").append(j);
        stringbuilder.append(", channelConfiguration=").append(c);
        if (k > 0)
        {
            stringbuilder.append(", extensionAudioObjectType=").append(k).append(" (").append((String)i.get(Integer.valueOf(k))).append(")");
            stringbuilder.append(", sbrPresentFlag=").append(l);
            stringbuilder.append(", psPresentFlag=").append(m);
            stringbuilder.append(", extensionSamplingFrequencyIndex=").append(n).append(" (").append(h.get(Integer.valueOf(n))).append(")");
            stringbuilder.append(", extensionSamplingFrequency=").append(o);
            stringbuilder.append(", extensionChannelConfiguration=").append(p);
        }
        stringbuilder.append(", syncExtensionType=").append(u);
        if (G)
        {
            stringbuilder.append(", frameLengthFlag=").append(v);
            stringbuilder.append(", dependsOnCoreCoder=").append(w);
            stringbuilder.append(", coreCoderDelay=").append(x);
            stringbuilder.append(", extensionFlag=").append(y);
            stringbuilder.append(", layerNr=").append(z);
            stringbuilder.append(", numOfSubFrame=").append(A);
            stringbuilder.append(", layer_length=").append(B);
            stringbuilder.append(", aacSectionDataResilienceFlag=").append(C);
            stringbuilder.append(", aacScalefactorDataResilienceFlag=").append(D);
            stringbuilder.append(", aacSpectralDataResilienceFlag=").append(E);
            stringbuilder.append(", extensionFlag3=").append(F);
        }
        if (V)
        {
            stringbuilder.append(", isBaseLayer=").append(H);
            stringbuilder.append(", paraMode=").append(I);
            stringbuilder.append(", paraExtensionFlag=").append(J);
            stringbuilder.append(", hvxcVarMode=").append(K);
            stringbuilder.append(", hvxcRateMode=").append(L);
            stringbuilder.append(", erHvxcExtensionFlag=").append(M);
            stringbuilder.append(", var_ScalableFlag=").append(N);
            stringbuilder.append(", hilnQuantMode=").append(O);
            stringbuilder.append(", hilnMaxNumLine=").append(P);
            stringbuilder.append(", hilnSampleRateCode=").append(Q);
            stringbuilder.append(", hilnFrameLength=").append(R);
            stringbuilder.append(", hilnContMode=").append(S);
            stringbuilder.append(", hilnEnhaLayer=").append(T);
            stringbuilder.append(", hilnEnhaQuantMode=").append(U);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        h = new HashMap();
        i = new HashMap();
        h.put(Integer.valueOf(0), Integer.valueOf(0x17700));
        h.put(Integer.valueOf(1), Integer.valueOf(0x15888));
        h.put(Integer.valueOf(2), Integer.valueOf(64000));
        h.put(Integer.valueOf(3), Integer.valueOf(48000));
        h.put(Integer.valueOf(4), Integer.valueOf(44100));
        h.put(Integer.valueOf(5), Integer.valueOf(32000));
        h.put(Integer.valueOf(6), Integer.valueOf(24000));
        h.put(Integer.valueOf(7), Integer.valueOf(22050));
        h.put(Integer.valueOf(8), Integer.valueOf(16000));
        h.put(Integer.valueOf(9), Integer.valueOf(12000));
        h.put(Integer.valueOf(10), Integer.valueOf(11025));
        h.put(Integer.valueOf(11), Integer.valueOf(8000));
        i.put(Integer.valueOf(1), "AAC main");
        i.put(Integer.valueOf(2), "AAC LC");
        i.put(Integer.valueOf(3), "AAC SSR");
        i.put(Integer.valueOf(4), "AAC LTP");
        i.put(Integer.valueOf(5), "SBR");
        i.put(Integer.valueOf(6), "AAC Scalable");
        i.put(Integer.valueOf(7), "TwinVQ");
        i.put(Integer.valueOf(8), "CELP");
        i.put(Integer.valueOf(9), "HVXC");
        i.put(Integer.valueOf(10), "(reserved)");
        i.put(Integer.valueOf(11), "(reserved)");
        i.put(Integer.valueOf(12), "TTSI");
        i.put(Integer.valueOf(13), "Main synthetic");
        i.put(Integer.valueOf(14), "Wavetable synthesis");
        i.put(Integer.valueOf(15), "General MIDI");
        i.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio FX");
        i.put(Integer.valueOf(17), "ER AAC LC");
        i.put(Integer.valueOf(18), "(reserved)");
        i.put(Integer.valueOf(19), "ER AAC LTP");
        i.put(Integer.valueOf(20), "ER AAC Scalable");
        i.put(Integer.valueOf(21), "ER TwinVQ");
        i.put(Integer.valueOf(22), "ER BSAC");
        i.put(Integer.valueOf(23), "ER AAC LD");
        i.put(Integer.valueOf(24), "ER CELP");
        i.put(Integer.valueOf(25), "ER HVXC");
        i.put(Integer.valueOf(26), "ER HILN");
        i.put(Integer.valueOf(27), "ER Parametric");
        i.put(Integer.valueOf(28), "SSC");
        i.put(Integer.valueOf(29), "PS");
        i.put(Integer.valueOf(30), "MPEG Surround");
        i.put(Integer.valueOf(31), "(escape)");
        i.put(Integer.valueOf(32), "Layer-1");
        i.put(Integer.valueOf(33), "Layer-2");
        i.put(Integer.valueOf(34), "Layer-3");
        i.put(Integer.valueOf(35), "DST");
        i.put(Integer.valueOf(36), "ALS");
        i.put(Integer.valueOf(37), "SLS");
        i.put(Integer.valueOf(38), "SLS non-core");
        i.put(Integer.valueOf(39), "ER AAC ELD");
        i.put(Integer.valueOf(40), "SMR Simple");
        i.put(Integer.valueOf(41), "SMR Main");
    }
}
