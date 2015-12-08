// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.RemoteControlClient;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class p
    implements n
{

    public static final int A = 0x7f09019e;
    public static final int B = 0x7f090170;
    public static final int C = 0x7f0903a0;
    public static final int D = 0x7f09039f;
    public static final int E = 0x7f020202;
    public static final int F = 0x7f020203;
    public static final int G = 0x7f020204;
    public static final int H = 0x7f02026c;
    public static final int I = 0x7f020281;
    public static final int J = 0x7f020288;
    public static final int K = 0x7f0202a4;
    public static final int L = 0x7f0202c6;
    public static final int M = 0x7f0202c8;
    public static final int N = 0x7f090295;
    public static final int O = 0x7f0900a4;
    public static final int P = 0x7f090275;
    public static final int Q = 0x7f050021;
    public static final int R = 0x7f020074;
    public static final int S = 0x7f0201dc;
    public static final int T = 0x7f020290;
    public static final int U = 0x7f020293;
    public static final int V = 0x7f0202dc;
    public static final int W = 0x7f0c0199;
    public static final int X = 0x7f0c020d;
    public static final int Y = 0x7f090371;
    public static final int Z = 0x7f09036f;
    public static final int a = 0x7f0901c9;
    public static final int aA = 0x7f090182;
    public static final int aB = 0x7f09016a;
    public static final int aC = 0x7f090123;
    public static final int aD = 0x7f09043d;
    public static final int aE = 0x7f090441;
    public static final int aF = 0x7f090440;
    public static final int aG = 0x7f09045c;
    public static final int aH = 0x7f09043e;
    public static final int aI = 0x7f090443;
    public static final int aJ = 0x7f090442;
    public static final int aK = 0x7f09043f;
    public static final int aL = 0x7f090430;
    public static final int aM = 0x7f090432;
    public static final int aN = 0x7f090453;
    public static final int aO = 0x7f0903eb;
    public static final int aP = 0x7f0900a6;
    public static final int aQ = 0x7f0903ea;
    public static final int aR = 0x7f09022f;
    public static final int aS = 0x7f0b0262;
    public static final int aT = 0x7f0b024d;
    public static final int aU = 0x7f0b024f;
    public static final int aV = 0x7f0b024e;
    public static final int aW = 0x7f0b024c;
    public static final int aX = 0x7f0b0258;
    public static final int aY = 0x7f0b0257;
    public static final int aZ = 0x7f0b02bb;
    public static final int aa = 0x7f0900bd;
    public static final int ab = 0x7f090372;
    public static final int ac = 0x7f09045e;
    public static final int ad = 0x7f09036e;
    public static final int ae = 0x7f09045d;
    public static final int af = 0x7f090370;
    public static final int ag = 0x7f090377;
    public static final int ah = 0x7f090373;
    public static final int ai = 0x7f09036d;
    public static final int aj = 0x7f090374;
    public static final int ak = 0x7f09042e;
    public static final int al = 0x7f0901be;
    public static final int am = 0x7f090069;
    public static final int an = 0x7f09006a;
    public static final int ao = 0x7f090477;
    public static final int ap = 0x7f0903cb;
    public static final int aq = 0x7f0903d0;
    public static final int ar = 0x7f0903cd;
    public static final int as = 0x7f0903cc;
    public static final int at = 0x7f090389;
    public static final int au = 0x7f0901bc;
    public static final int av = 0x7f0c004b;
    public static final int aw = 0x7f0c020f;
    public static final int ax = 0x7f0c017e;
    public static final int ay = 0x7f02022a;
    public static final int az = 0x7f020272;
    public static final int b = 0x7f0901ca;
    public static final int bA = 0x7f0b0008;
    public static final int bB = 0x7f0b0005;
    public static final int bC = 0x7f0b0006;
    public static final int bD = 0x7f0e00b3;
    public static final int bE = 0x7f0e0045;
    public static final int bF = 0x7f09019a;
    public static final int bG = 0x7f090198;
    public static final int bH = 0x7f09019c;
    public static final int bI = 0x7f09019b;
    public static final int bJ = 0x7f090199;
    public static final int bK = 0x7f040061;
    public static final int bL = 0x7f04013d;
    public static final int bM = 0x7f040142;
    public static final int bN = 0x7f040143;
    public static final int ba = 0x7f0b025c;
    public static final int bb = 0x7f0b025b;
    public static final int bc = 0x7f0b025a;
    public static final int bd = 0x7f0b0259;
    public static final int be = 0x7f0b0589;
    public static final int bf = 0x7f0b025d;
    public static final int bg = 0x7f0b0260;
    public static final int bh = 0x7f0b0264;
    public static final int bi = 0x7f0b0265;
    public static final int bj = 0x7f0b025f;
    public static final int bk = 0x7f0b025e;
    public static final int bl = 0x7f0b0272;
    public static final int bm = 0x7f0b0271;
    public static final int bn = 0x7f0b0261;
    public static final int bo = 0x7f0b0277;
    public static final int bp = 0x7f0b0274;
    public static final int bq = 0x7f0b0273;
    public static final int br = 0x7f0b026f;
    public static final int bs = 0x7f0b0270;
    public static final int bt = 0x7f0b0255;
    public static final int bu = 0x7f0b0267;
    public static final int bv = 0x7f0b0266;
    public static final int bw = 0x7f0b0268;
    public static final int bx = 0x7f050015;
    public static final int by = 0x7f0b05c1;
    public static final int bz = 0x7f0b0009;
    public static final int c = 0x7f0901cb;
    public static final int d = 0x7f0901cc;
    public static final int e = 0x7f0900c8;
    public static final int f = 0x7f090171;
    public static final int g = 0x7f0b02a5;
    public static final int h = 0x7f0b01a8;
    public static final int i = 0x7f0b01a9;
    public static final int j = 0x7f0b01a7;
    public static final int k = 0x7f0b01aa;
    public static final int l = 0x7f090398;
    public static final int m = 0x7f090397;
    public static final int n = 0x7f09039c;
    public static final int o = 0x7f09039b;
    public static final int p = 0x7f090399;
    public static final int q = 0x7f09039a;
    public static final int r = 0x7f0901c5;
    public static final int s = 0x7f0901c6;
    public static final int t = 0x7f0901e5;
    public static final int u = 0x7f0901bf;
    public static final int v = 0x7f09007b;
    public static final int w = 0x7f09007a;
    public static final int x = 0x7f090358;
    public static final int y = 0x7f09039e;
    public static final int z = 0x7f09019d;

    p()
    {
    }

    public static int a(int i1)
    {
label0:
        {
            int j1 = i1;
            switch (i1)
            {
            default:
                if (!c.b(i1))
                {
                    break label0;
                }
                j1 = 99;
                break;

            case -2: 
            case -1: 
            case 0: // '\0'
            case 1: // '\001'
                break;
            }
            return j1;
        }
        return -3;
    }

    public static int a(int i1, int j1)
    {
        if (i1 < 0 || i1 >= j1)
        {
            String s1;
            if (i1 < 0)
            {
                s1 = a("%s (%s) must not be negative", new Object[] {
                    "index", Integer.valueOf(i1)
                });
            } else
            {
                if (j1 < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder(26)).append("negative size: ").append(j1).toString());
                }
                s1 = a("%s (%s) must be less than size (%s)", new Object[] {
                    "index", Integer.valueOf(i1), Integer.valueOf(j1)
                });
            }
            throw new IndexOutOfBoundsException(s1);
        } else
        {
            return i1;
        }
    }

    public static CharSequence a(CharSequence charsequence, Object obj)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return charsequence;
        }
    }

    public static Iterable a(Iterable iterable, Object obj)
    {
        if (a(iterable))
        {
            throw new NullPointerException(String.valueOf(obj));
        } else
        {
            return iterable;
        }
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static transient String a(String s1, Object aobj[])
    {
        int i1 = 0;
        s1 = String.valueOf(s1);
        StringBuilder stringbuilder = new StringBuilder(s1.length() + aobj.length * 16);
        int j1 = 0;
        do
        {
            if (i1 >= aobj.length)
            {
                break;
            }
            int k1 = s1.indexOf("%s", j1);
            if (k1 == -1)
            {
                break;
            }
            stringbuilder.append(s1.substring(j1, k1));
            stringbuilder.append(aobj[i1]);
            j1 = k1 + 2;
            i1++;
        } while (true);
        stringbuilder.append(s1.substring(j1));
        if (i1 < aobj.length)
        {
            stringbuilder.append(" [");
            stringbuilder.append(aobj[i1]);
            for (i1++; i1 < aobj.length; i1++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(aobj[i1]);
            }

            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    public static void a(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        parcelfiledescriptor.close();
        return;
        parcelfiledescriptor;
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(Object obj, Object obj1)
    {
        ((RemoteControlClient)obj).setMetadataUpdateListener((android.media.RemoteControlClient.OnMetadataUpdateListener)obj1);
    }

    public static void a(String s1)
    {
        if (jno.a >= 18)
        {
            Trace.beginSection(s1);
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void a(boolean flag, String s1, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(a(s1, aobj));
        } else
        {
            return;
        }
    }

    public static boolean a(Iterable iterable)
    {
        if (iterable == null)
        {
            return true;
        }
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            boolean flag;
            try
            {
                flag = iterable.contains(null);
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable)
            {
                return false;
            }
            return flag;
        }
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (iterable.next() == null)
            {
                return true;
            }
        }

        return false;
    }

    public static int b(int i1, int j1)
    {
        if (i1 < 0 || i1 > j1)
        {
            String s1;
            if (i1 < 0)
            {
                s1 = a("%s (%s) must not be negative", new Object[] {
                    "index", Integer.valueOf(i1)
                });
            } else
            {
                if (j1 < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder(26)).append("negative size: ").append(j1).toString());
                }
                s1 = a("%s (%s) must not be greater than size (%s)", new Object[] {
                    "index", Integer.valueOf(i1), Integer.valueOf(j1)
                });
            }
            throw new IndexOutOfBoundsException(s1);
        } else
        {
            return i1;
        }
    }

    public static Object b(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static void b()
    {
        if (jno.a >= 18)
        {
            Trace.endSection();
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void b(boolean flag, String s1, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalStateException(a(s1, aobj));
        } else
        {
            return;
        }
    }

    public final w a()
    {
        return new q();
    }

    public final void a(View view)
    {
    }
}
