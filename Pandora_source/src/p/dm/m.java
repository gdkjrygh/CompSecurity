// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import p.dl.a;
import p.dn.aa;
import p.dn.ab;
import p.dn.ac;
import p.dn.ad;
import p.dn.ae;
import p.dn.af;
import p.dn.ag;
import p.dn.ah;
import p.dn.ai;
import p.dn.aj;
import p.dn.ak;
import p.dn.al;
import p.dn.am;
import p.dn.an;
import p.dn.ao;
import p.dn.ap;
import p.dn.aq;
import p.dn.ar;
import p.dn.as;
import p.dn.at;
import p.dn.au;
import p.dn.av;
import p.dn.aw;
import p.dn.ax;
import p.dn.ay;
import p.dn.az;
import p.dn.ba;
import p.dn.bb;
import p.dn.bc;
import p.dn.bd;
import p.dn.be;
import p.dn.bf;
import p.dn.bg;
import p.dn.bh;
import p.dn.bi;
import p.dn.bj;
import p.dn.bk;
import p.dn.bl;
import p.dn.bm;
import p.dn.bn;
import p.dn.bo;
import p.dn.bp;
import p.dn.bq;
import p.dn.br;
import p.dn.bs;
import p.dn.bt;
import p.dn.bu;
import p.dn.bv;
import p.dn.bw;
import p.dn.bx;
import p.dn.by;
import p.dn.bz;
import p.dn.ca;
import p.dn.cb;
import p.dn.cc;
import p.dn.cd;
import p.dn.ce;
import p.dn.cf;
import p.dn.cg;
import p.dn.ch;
import p.dn.ci;
import p.dn.cj;
import p.dn.ck;
import p.dn.cl;
import p.dn.cm;
import p.dn.f;
import p.dn.g;
import p.dn.h;
import p.dn.i;
import p.dn.j;
import p.dn.k;
import p.dn.l;
import p.dn.n;
import p.dn.o;
import p.dn.p;
import p.dn.q;
import p.dn.r;
import p.dn.s;
import p.dn.t;
import p.dn.u;
import p.dn.v;
import p.dn.w;
import p.dn.x;
import p.dn.y;
import p.dn.z;
import p.do.b;
import p.dq.c;
import p.dq.d;
import p.ds.e;

// Referenced classes of package p.dm:
//            g, e, j, b, 
//            h, o, l, i, 
//            n, f

public abstract class m
    implements p.dl.a, d
{
    class a extends Thread
    {

        m a;
        Object b;
        int c;
        int d;
        final m e;

        public void a(int i1)
        {
            synchronized (b)
            {
                d = d + 1;
                b.notify();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(p.dm.b b1, int i1)
        {
            synchronized (b)
            {
                c = c + 1;
                p.dm.m.a(e).put(p.dm.m.u(i1), b1);
                b.notify();
            }
            return;
            b1;
            obj;
            JVM INSTR monitorexit ;
            throw b1;
        }

        public void run()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
_L2:
            if (c < 4)
            {
                if (d == 0)
                {
                    break MISSING_BLOCK_LABEL_32;
                }
                a.r();
                return;
            }
              goto _L1
            Exception exception;
            try
            {
                b.wait();
            }
            catch (InterruptedException interruptedexception) { }
            finally { }
            if (true) goto _L2; else goto _L1
_L1:
            a.s();
            obj;
            JVM INSTR monitorexit ;
            return;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        a(m m2)
        {
            e = m.this;
            super();
            b = new Object();
            c = 0;
            d = 0;
            a = m2;
            setName(getClass().getSimpleName());
        }
    }


    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static Hashtable b = new Hashtable();
    protected static boolean bG;
    public static p.dm.e bg;
    public static boolean bh = false;
    public static boolean bi = true;
    public static boolean bj = false;
    public static boolean bk = false;
    public static int bl = -1;
    public static int bm = 1;
    public static int bn = 1;
    protected int bA;
    protected ByteArrayOutputStream bB;
    protected int bC;
    protected p.dm.j bD;
    protected boolean bE;
    protected final Vector bF = new Vector();
    int bH[] = {
        -1, -1
    };
    Vector bI;
    int bJ[] = {
        -1, -1
    };
    Vector bK;
    protected Class bL;
    private boolean bM;
    private Hashtable bN;
    private a bO;
    private p.dp.a bP;
    private p.dp.a bQ;
    private b bR;
    private p.do.a bS;
    private p.dn.a bT;
    private Object bU;
    private Timer bV;
    protected p.dm.b bo;
    public c bp;
    protected boolean bq;
    protected Object br;
    public int bs;
    public int bt;
    public int bu;
    protected Hashtable bv;
    protected boolean bw;
    protected boolean bx;
    protected Integer by;
    protected boolean bz;
    private boolean c;
    private int d;
    private p.dm.g e;
    private int f;
    private Object g;
    private boolean h;

    public m(p.dm.e e1)
    {
        bq = false;
        c = false;
        d = 5000;
        e = p.dm.g.a;
        br = new Object();
        f = 0;
        bv = new Hashtable();
        bw = false;
        bx = false;
        g = new Object();
        h = false;
        bM = false;
        bN = new Hashtable();
        bz = false;
        bA = 4;
        bC = 0;
        bE = false;
        bU = new Object();
        bI = new Vector();
        bK = new Vector();
        bV = null;
        a(e1);
        bp = p.dq.c.a();
    }

    public static String a(Object obj)
    {
        if (obj != null)
        {
            obj = obj.getClass().getName();
            return ((String) (obj)).substring(((String) (obj)).lastIndexOf('.') + 1);
        } else
        {
            return null;
        }
    }

    static Hashtable a(m m1)
    {
        return m1.bN;
    }

    private void a(int i1, int j1, int k1, byte abyte0[])
    {
        int i2 = abyte0.length;
        d((new StringBuilder()).append("generateAndReturnGenreArtSegments categoryIndex=").append(i1).append(" stationIndex=").append(j1).append(" artLength:").append(i2).toString());
        if (i2 == 0)
        {
            a(i1, j1, i2, 0, 1, abyte0);
        } else
        {
            int j2 = k1 - 7;
            int k2 = i2 / j2;
            int l1;
            int l2;
            int i3;
            if (i2 % j2 > 0)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            l2 = k2 + l1;
            i3 = i2 - j2 * k2;
            if (bg.a(p.dm.e.b))
            {
                d((new StringBuilder()).append("totalSegments=").append(l2).append(" SHOULD see ").append(k2).append(" segments whose payload is exactly ").append(k1).append(" bytes long").append(" plus one segment whose payload is ").append(i3 + 7).append(" bytes long").toString());
            }
            l1 = 0;
            for (k1 = 0; l1 < k2; k1 += j2)
            {
                byte abyte1[] = new byte[j2];
                System.arraycopy(abyte0, k1, abyte1, 0, abyte1.length);
                a(i1, j1, i2, l1, l2, abyte1);
                l1++;
            }

            if (k2 < l2)
            {
                byte abyte2[] = new byte[i3];
                System.arraycopy(abyte0, k1, abyte2, 0, abyte2.length);
                a(i1, j1, i2, l1, l2, abyte2);
                return;
            }
        }
    }

    private void a(int i1, int ai1[], Vector vector)
    {
        if (i1 != -1)
        {
            if (i1 == ai1[0])
            {
                ai1[0] = ai1[1];
                ai1[1] = -1;
                vector.removeElementAt(0);
                return;
            }
            if (i1 == ai1[1])
            {
                ai1[1] = -1;
                vector.removeElementAt(1);
                return;
            }
        }
    }

    private void a(int i1, e ae1[], int ai1[], Vector vector)
    {
        if (i1 == -1)
        {
            return;
        }
        if (g(3))
        {
            ai1[0] = -1;
            ai1[1] = -1;
            vector.removeAllElements();
            ai1[0] = i1;
            vector.addElement(ae1);
            return;
        }
        a(i1, ai1, vector);
        if (vector.size() == 2)
        {
            ai1[0] = ai1[1];
            ai1[1] = -1;
            vector.removeElementAt(0);
        }
        if (ai1[0] == -1)
        {
            ai1[0] = i1;
        } else
        {
            ai1[1] = i1;
        }
        vector.addElement(ae1);
    }

    private void a(String s1, int i1, int j1, int k1, byte abyte0[], int l1)
    {
        switch (l1)
        {
        default:
            return;

        case 2: // '\002'
            a(s1, j1, k1, abyte0);
            return;

        case 1: // '\001'
            a(s1, i1, j1, k1, abyte0);
            return;
        }
    }

    private void a(String s1, int i1, byte abyte0[], int j1)
    {
        int l1 = abyte0.length;
        d((new StringBuilder()).append("generateAndReturnArtSegments stationToken: ").append(s1).append(" artLength:").append(l1).toString());
        if (l1 == 0)
        {
            a(s1, l1, 0, 1, abyte0, j1);
        } else
        {
            int i2 = i1 - 7;
            int j2 = l1 / i2;
            int k1;
            int k2;
            int l2;
            if (l1 % i2 > 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            k2 = j2 + k1;
            l2 = l1 - i2 * j2;
            if (bg.a(p.dm.e.b))
            {
                d((new StringBuilder()).append("totalSegments=").append(k2).append(" SHOULD see ").append(j2).append(" segments whose payload is exactly ").append(i1).append(" bytes long").append(" plus one segment whose payload is ").append(l2 + 7).append(" bytes long").toString());
            }
            k1 = 0;
            for (i1 = 0; k1 < j2; i1 += i2)
            {
                byte abyte1[] = new byte[i2];
                System.arraycopy(abyte0, i1, abyte1, 0, abyte1.length);
                a(s1, l1, k1, k2, abyte1, j1);
                k1++;
            }

            if (j2 < k2)
            {
                byte abyte2[] = new byte[l2];
                System.arraycopy(abyte0, i1, abyte2, 0, abyte2.length);
                a(s1, l1, k1, k2, abyte2, j1);
                return;
            }
        }
    }

    public static void a(Hashtable hashtable)
    {
        if (hashtable == null)
        {
            b = new Hashtable();
            return;
        } else
        {
            b = hashtable;
            return;
        }
    }

    public static void a(p.dm.e e1)
    {
        bg = e1;
        bG = bg.a(p.dm.e.b);
    }

    public static void a(byte abyte0[], StringBuffer stringbuffer)
    {
        a(abyte0, stringbuffer, true);
    }

    public static void a(byte abyte0[], StringBuffer stringbuffer, boolean flag)
    {
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            stringbuffer.append(a[(abyte0[i1] & 0xf0) >>> 4]);
            stringbuffer.append(a[abyte0[i1] & 0xf]);
            if (flag && i1 + 1 < abyte0.length)
            {
                stringbuffer.append(" ");
            }
        }

    }

    private void a(int ai1[])
    {
        if (bS != null)
        {
            bS.c();
        }
        d("getStationArt - create a new worker and request station art.");
        bS = A();
        bS.a(ai1);
    }

    public static void b(String s1, Throwable throwable)
    {
        p.df.a.a("PandoraLink", s1, throwable);
    }

    public static void c(String s1, Throwable throwable)
    {
        p.df.a.b("PandoraLink", s1, throwable);
    }

    public static String d(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 3);
        a(abyte0, stringbuffer, true);
        return stringbuffer.toString();
    }

    public static String e(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 3);
        a(abyte0, stringbuffer, false);
        return stringbuffer.toString();
    }

    public static boolean g(int i1)
    {
        return bn >= i1;
    }

    public static boolean h(int i1)
    {
        return bm >= i1;
    }

    public static void l(String s1)
    {
        p.df.a.c("PandoraLink", s1);
    }

    public static void m(String s1)
    {
        p.df.a.a("PandoraLink", s1);
    }

    public static boolean n(String s1)
    {
        if (b != null && b.containsKey(s1))
        {
            s1 = ((String) (b.get(s1)));
            if (s1 instanceof Boolean)
            {
                return ((Boolean)s1).booleanValue();
            }
        }
        return false;
    }

    public static String u(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 3333: 
            return "INRCV";

        case 3334: 
            return "INSND";

        case 3335: 
            return "OUTRCV";

        case 3336: 
            return "OUTSND";
        }
    }

    public static boolean v(int i1)
    {
        return i1 != 0 && i1 > 1970 && i1 < Calendar.getInstance().get(1) + 1;
    }

    public abstract p.do.a A();

    public boolean E()
    {
        return bE;
    }

    public void F()
    {
        H();
        if (bn == 1 || n("disableInsufficientConnectivity"))
        {
            return;
        } else
        {
            bV = new Timer();
            bV.schedule(new TimerTask() {

                final m a;

                public void run()
                {
                    a.I();
                }

            
            {
                a = m.this;
                super();
            }
            }, 30000L);
            return;
        }
    }

    public boolean G()
    {
        return bq;
    }

    public void H()
    {
        if (bV != null)
        {
            bV.cancel();
            bV = null;
        }
        if (bA == 7)
        {
            f(1);
        }
    }

    public void I()
    {
        if (bA == 1)
        {
            f(7);
        }
    }

    public boolean J()
    {
        return c;
    }

    public p.dm.b K()
    {
        p.dm.b b1;
        synchronized (br)
        {
            b1 = bo;
        }
        return b1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean L()
    {
        return bD != null;
    }

    public void M()
    {
        bD = null;
        if (bp != null)
        {
            bp.m();
        }
    }

    public InputStream N()
    {
        InputStream inputstream = null;
        d("getInputStream");
        if (bP != null)
        {
            d("stop piping ");
            bP.a();
            bP = null;
        }
        if (L())
        {
            inputstream = bD.b();
        } else
        if (bo != null)
        {
            if (ac() && ad())
            {
                d("setting up Interceptor [Device -> Pandora] input stream");
                bP = new p.dp.a(bo.e(), ((p.dm.b)bN.get("INRCV")).f());
                d("getInputStream - returning interceptor insnd.getInputStream()");
                return ((p.dm.b)bN.get("INSND")).e();
            } else
            {
                d("getInputStream - returning connection.getInputStream()");
                return bo.e();
            }
        }
        return inputstream;
    }

    public OutputStream O()
    {
        d("getOutputStream");
        if (bQ != null)
        {
            d("stop piping ");
            bQ.a();
            bQ = null;
        }
        if (bo == null)
        {
            return null;
        }
        if (L())
        {
            return bD.a();
        }
        if (ac() && ad())
        {
            d("setting up Interceptor [Pandora -> Device] output stream");
            bQ = new p.dp.a(((p.dm.b)bN.get("OUTSND")).e(), bo.f());
            d("getOutputStream - returning interceptor outrcv.getOutputStream()");
            return ((p.dm.b)bN.get("OUTRCV")).f();
        } else
        {
            d("getOutputStream - returning connection.getOutputStream()");
            return bo.f();
        }
    }

    public void P()
    {
        if (G())
        {
            bp.a(new ab());
        }
    }

    protected void Q()
    {
        bp.a(new by(10));
    }

    public void R()
    {
        bp.a(new ce(3));
    }

    public boolean S()
    {
        if (bo == null)
        {
            return true;
        } else
        {
            return bo.i();
        }
    }

    public void T()
    {
        Vector vector = bF;
        vector;
        JVM INSTR monitorenter ;
        bE = true;
        m("ready to process commands from the accessory.");
        int i1 = 0;
_L2:
        if (i1 >= bF.size())
        {
            break; /* Loop/switch isn't completed */
        }
        a((p.dn.a)bF.elementAt(i1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        bF.removeAllElements();
        vector;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        vector;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void U()
    {
        synchronized (bF)
        {
            bE = false;
            bF.removeAllElements();
        }
        return;
        exception;
        vector;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int V()
    {
        return bA;
    }

    public boolean W()
    {
        return p(V());
    }

    protected void X()
    {
        a(((u) (null)));
    }

    public String Y()
    {
        return "PandoraLink";
    }

    public boolean Z()
    {
        return true;
    }

    public p.dm.j a(p.dm.h h1)
    {
        if (h1 == null)
        {
            return null;
        }
        bD = h1.a(bo, bp);
        if (bD != null && bp != null)
        {
            bp.m();
        }
        return bD;
    }

    public void a(int i1, int j1, int k1, int l1, int i2, byte abyte0[])
    {
        if (G() && g(3))
        {
            bp.b(new bc(i1, j1, k1, l1, i2, abyte0), false);
        }
    }

    public void a(int i1, int j1, byte abyte0[], int k1)
    {
        d("returnGenreStationArt");
        if (!G())
        {
            return;
        } else
        {
            a(i1, j1, k1, abyte0);
            return;
        }
    }

    public void a(int i1, int j1, String as1[])
    {
        if (G())
        {
            bp.a(new bd(i1, j1, as1));
        }
    }

    public void a(int i1, byte abyte0[])
    {
        d("returnStationArt");
        if (!G())
        {
            return;
        } else
        {
            a(Integer.toString(i1), f, abyte0, 1);
            return;
        }
    }

    public void a(int i1, int ai1[])
    {
        if (!G())
        {
            return;
        } else
        {
            bp.a(new bl(i1, ai1));
            return;
        }
    }

    public void a(int i1, String as1[])
    {
        if (!G())
        {
            return;
        }
        int ai1[] = new int[as1.length];
        for (int j1 = 0; j1 < as1.length; j1++)
        {
            ai1[j1] = p.dm.o.a(as1[j1]);
        }

        bp.a(new bl(i1, ai1));
    }

    public void a(int i1, e ae1[])
    {
        if (G())
        {
            bp.a(new bg(i1, ae1));
        }
    }

    public void a(Object obj, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer("PANDORALINK [");
        stringbuffer.append(a(obj));
        stringbuffer.append("] ");
        stringbuffer.append(s1);
        m(stringbuffer.toString());
    }

    public void a(String s1, int i1)
    {
        if (bR == null)
        {
            bR = new b(this);
            bR.start();
        }
        bR.a(s1, i1);
    }

    public void a(String s1, int i1, int j1, int k1, int l1, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7)
    {
        if (!G())
        {
            return;
        } else
        {
            int i2 = p.dm.l.a(s1);
            bp.a(new bs(i2, i1, j1, k1, l1, flag, flag1, flag2, flag3, flag4, flag5, flag6, flag7));
            return;
        }
    }

    public void a(String s1, int i1, int j1, int k1, int l1, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, String s2, 
            String s3, String s4)
    {
        if (!G())
        {
            return;
        } else
        {
            int i2 = p.dm.l.a(s1);
            bp.a(new bt(i2, i1, j1, k1, l1, flag, flag1, flag2, flag3, flag4, flag5, flag6, flag7, s2, s3, s4));
            return;
        }
    }

    public void a(String s1, int i1, int j1, int k1, byte abyte0[])
    {
label0:
        {
            if (G())
            {
                if (!g(3))
                {
                    break label0;
                }
                bp.b(new bi(Integer.parseInt(s1), i1, j1, k1, abyte0), false);
            }
            return;
        }
        bp.a(new bi(Integer.parseInt(s1), i1, j1, k1, abyte0));
    }

    public void a(String s1, int i1, int j1, byte abyte0[])
    {
label0:
        {
            if (G())
            {
                if (!g(3))
                {
                    break label0;
                }
                c c1 = bp;
                s1 = new bp(p.dm.l.a(s1), i1, j1, abyte0);
                boolean flag;
                if (i1 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                c1.b(s1, flag);
            }
            return;
        }
        bp.a(new bp(p.dm.l.a(s1), i1, j1, abyte0));
    }

    public void a(String s1, int i1, byte abyte0[])
    {
        if (G())
        {
            int k1 = abyte0.length;
            if ("0".equals(s1))
            {
                b(s1, 0, 1, abyte0);
                return;
            }
            int j1 = i1 - 7;
            i1 = j1;
            if (k1 < j1)
            {
                i1 = k1;
            }
            int l1 = k1 / i1;
            int i2;
            int j2;
            if (k1 % i1 > 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i2 = l1 + j1;
            j2 = k1 - i1 * l1;
            if (bg.a(p.dm.e.b))
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("totalSegments=").append(i2).append(" SHOULD see ").append(l1).append(" segments whose payload is exactly ").append(i1).append(" bytes long");
                Object obj;
                if (j1 == 1)
                {
                    obj = (new StringBuilder()).append("plus one segment whose payload is ").append(j2 + 7).append(" bytes long").toString();
                } else
                {
                    obj = "";
                }
                d(stringbuilder.append(((String) (obj))).toString());
            }
            j1 = 0;
            k1 = 0;
            for (; j1 < l1; j1++)
            {
                obj = new byte[i1];
                System.arraycopy(abyte0, k1, obj, 0, obj.length);
                b(s1, j1, i2, ((byte []) (obj)));
                k1 += i1;
            }

            if (l1 < i2)
            {
                byte abyte1[] = new byte[j2];
                System.arraycopy(abyte0, k1, abyte1, 0, abyte1.length);
                b(s1, j1, i2, abyte1);
                return;
            }
        }
    }

    public void a(String s1, String s2)
    {
        if (G())
        {
            bp.a(new bo(p.dm.l.a(s1), s2));
        }
    }

    public void a(String s1, Throwable throwable)
    {
        b((new StringBuilder()).append("PANDORALINK ").append(s1).toString(), throwable);
    }

    public void a(String s1, boolean flag)
    {
        if (G())
        {
            bp.a(new ch(p.dm.l.a(s1), flag));
        }
    }

    public void a(p.dm.b b1, int i1)
    {
        if (bO == null)
        {
            bO = new a(this);
            bO.start();
        }
        bO.a(b1, i1);
    }

    public void a(p.dm.f f1)
        throws p.dm.i
    {
    }

    public void a(p.dm.g g1)
    {
        e = g1;
    }

    public void a(p.dn.a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        synchronized (bF)
        {
            if (bE)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            if (a1.e == p.dn.b.h)
            {
                bj = true;
                m("got PNDR_CONNECT - Pending PandoraLink Connection - wait for ready to process commands");
            }
            bF.addElement(a1);
        }
        return;
        a1;
        vector;
        JVM INSTR monitorexit ;
        throw a1;
        vector;
        JVM INSTR monitorexit ;
        int i1;
        if (bg.a(p.dm.e.c))
        {
            m((new StringBuilder()).append("PandoraLink.onCommand ").append(a1).toString());
            b(a1);
        }
        i1 = a1.e;
        if (i1 != p.dn.b.h)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((p.dn.b)a1).c();
        if (G() && h(2) && i1 >= 2)
        {
            m(9);
            return;
        }
        bn = i1;
        if (b((p.dn.b)a1))
        {
            bE = false;
            a((p.dn.b)a1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (G() || !h(2))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == p.dn.c.h)
        {
            Q();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (bg.a(p.dm.e.c) && !c(a1)) goto _L1; else goto _L4
_L4:
        if (i1 == p.dn.d.h)
        {
            a((p.dn.d)a1);
            return;
        }
        if (i1 == j.h)
        {
            a((j)a1);
            return;
        }
        if (i1 == k.h)
        {
            a((k)a1);
            return;
        }
        if (i1 == l.h)
        {
            a((l)a1);
            return;
        }
        if (i1 == o.h)
        {
            a((o)a1);
            return;
        }
        if (i1 == p.h)
        {
            a((p)a1);
            return;
        }
        if (i1 == q.h)
        {
            a((q)a1);
            return;
        }
        if (g(3) && i1 == p.dn.m.h)
        {
            a((p.dn.m)a1);
            return;
        }
        if (g(3) && i1 == n.h)
        {
            a((n)a1);
            return;
        }
        if (i1 == r.h)
        {
            a((r)a1);
            return;
        }
        if (i1 == s.h)
        {
            a((s)a1);
            return;
        }
        if (i1 == t.h)
        {
            a((t)a1);
            return;
        }
        if (i1 == u.h)
        {
            a((u)a1);
            return;
        }
        if (i1 == v.h)
        {
            a((v)a1);
            return;
        }
        if (i1 == w.h)
        {
            a((w)a1);
            return;
        }
        if (i1 == x.h)
        {
            a((x)a1);
            return;
        }
        if (i1 == y.h)
        {
            a((y)a1);
            return;
        }
        if (i1 == aa.h)
        {
            a((aa)a1);
            return;
        }
        if (i1 == ai.h)
        {
            a((ai)a1);
            return;
        }
        if (i1 == aj.h)
        {
            a((aj)a1);
            return;
        }
        if (i1 == ak.h)
        {
            a((ak)a1);
            return;
        }
        if (i1 == am.h)
        {
            a((am)a1);
            return;
        }
        if (i1 == ao.h)
        {
            a((ao)a1);
            return;
        }
        if (i1 == ap.h)
        {
            a((ap)a1);
            return;
        }
        if (i1 == an.h)
        {
            a((an)a1);
            return;
        }
        if (i1 == aq.h)
        {
            a((aq)a1);
            return;
        }
        if (i1 == ar.h)
        {
            a((ar)a1);
            return;
        }
        if (i1 == as.h)
        {
            a((as)a1);
            return;
        }
        if (i1 == at.h)
        {
            a((at)a1);
            return;
        }
        if (i1 == au.h)
        {
            a((au)a1);
            return;
        }
        if (i1 == av.h)
        {
            a((av)a1);
            return;
        }
        if (g(3) && i1 == aw.h)
        {
            a((aw)a1);
            return;
        }
        if (i1 == ax.h)
        {
            a((ax)a1);
            return;
        }
        if (i1 == ay.h)
        {
            a((ay)a1);
            return;
        }
        if (i1 == bv.h)
        {
            a((bv)a1);
            return;
        }
        if (i1 == bw.h)
        {
            a((bw)a1);
            return;
        }
        if (i1 == bx.h)
        {
            a((bx)a1);
            return;
        }
        if (g(2) && i1 == p.dn.c.h)
        {
            a((p.dn.c)a1);
            return;
        }
        if (g(3) && i1 == al.h)
        {
            a((al)a1);
            return;
        }
        if (g(3) && i1 == g.h)
        {
            a((g)a1);
            return;
        }
        if (g(3) && i1 == ac.h)
        {
            a((ac)a1);
            return;
        }
        if (g(3) && i1 == ad.h)
        {
            a((ad)a1);
            return;
        }
        if (g(3) && i1 == z.h)
        {
            a((z)a1);
            return;
        }
        if (g(3) && i1 == ae.h)
        {
            a((ae)a1);
            return;
        }
        if (g(3) && i1 == ag.h)
        {
            a((ag)a1);
            return;
        }
        if (g(3) && i1 == h.h)
        {
            a((h)a1);
            return;
        }
        if (g(3) && i1 == af.h)
        {
            a((af)a1);
            return;
        }
        if (g(3) && i1 == f.h)
        {
            a((f)a1);
            return;
        }
        if (g(3) && i1 == i.h)
        {
            a((i)a1);
            return;
        }
        if (g(3) && i1 == ah.h)
        {
            a((ah)a1);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public abstract void a(aa aa1);

    public abstract void a(ac ac1);

    public abstract void a(ad ad1);

    public abstract void a(ae ae1);

    public abstract void a(af af1);

    public abstract void a(ag ag1);

    public abstract void a(ah ah1);

    public abstract void a(ai ai1);

    public abstract void a(aj aj1);

    public abstract void a(ak ak1);

    public void a(al al1)
    {
        if (bx)
        {
            return;
        } else
        {
            a(((g) (null)));
            f = al1.c();
            a(al1.d());
            return;
        }
    }

    public abstract void a(am am1);

    public abstract void a(an an1);

    public abstract void a(ao ao1);

    public abstract void a(ap ap1);

    public void a(aq aq1)
    {
        if (V() != 0)
        {
            l(V());
        }
    }

    public abstract void a(ar ar1);

    public abstract void a(as as1);

    public abstract void a(at at1);

    public abstract void a(au au1);

    public abstract void a(av av1);

    public abstract void a(aw aw1);

    public abstract void a(ax ax1);

    public abstract void a(ay ay1);

    public abstract void a(p.dn.b b1);

    public void a(bv bv1)
    {
        r(bv1.c());
    }

    public abstract void a(bw bw1);

    public abstract void a(bx bx1);

    public void a(p.dn.c c1)
    {
        if (!G() && !bj)
        {
            return;
        }
        synchronized (br)
        {
            b(false);
            w();
            a(((u) (null)));
            v();
            H();
            bv.clear();
            bB = null;
            bC = 0;
            bs = 0;
            bt = 0;
            bu = 0;
            x();
            y();
            bp.d();
            if (bR != null)
            {
                bR.a();
                bR = null;
            }
            if (bS != null)
            {
                bS.c();
                bS = null;
            }
            bn = 1;
        }
        return;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void a(p.dn.d d1);

    public void a(f f1)
    {
        d("onEventCancelGenreStationArt");
        bp.a(p/dn/bc);
    }

    public void a(g g1)
    {
        bp.a(p/dn/bi);
        f = 0;
    }

    public abstract void a(h h1);

    public void a(i i1)
    {
        if (g(3))
        {
            m(11);
        }
    }

    public abstract void a(j j1);

    public abstract void a(k k1);

    public abstract void a(l l1);

    public abstract void a(p.dn.m m1);

    public abstract void a(n n1);

    public abstract void a(o o1);

    public abstract void a(p p1);

    public abstract void a(q q1);

    public abstract void a(r r1);

    public abstract void a(s s1);

    public abstract void a(t t1);

    public abstract void a(u u1);

    public abstract void a(v v1);

    public abstract void a(w w1);

    public abstract void a(x x1);

    public abstract void a(y y1);

    public abstract void a(z z1);

    public void a(p.ds.f af1[])
    {
        if (G())
        {
            bp.a(new bk(af1));
        }
    }

    public int aa()
    {
        return d;
    }

    public p.dm.g ab()
    {
        return e;
    }

    public boolean ac()
    {
        return bM;
    }

    public boolean ad()
    {
        boolean flag;
        synchronized (g)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ae()
    {
        d("interceptorDisconnect");
        d("setInterceptorEnabled to false");
        e(false);
        d("call parser to refresh streams");
        if (bp != null)
        {
            bp.m();
        }
    }

    public void af()
    {
        if (ac() && !ad())
        {
            d("onStreamsRefreshed: close all the interceptor connections!");
            String s1;
            for (Enumeration enumeration = bN.keys(); enumeration.hasMoreElements(); ((p.dm.b)bN.get(s1)).g())
            {
                s1 = (String)enumeration.nextElement();
            }

            bN.clear();
        }
    }

    public void ag()
    {
        d("PandoraLink.onLostConnection");
        if (ad())
        {
            d("onLostConnection: calling interceptorDisconnect!");
            ae();
        }
        d("onLostConnection: calling onLinkLostConnection!");
        l();
    }

    public void b(int i1, int j1)
    {
        if (G())
        {
            bp.a(new bb(i1, j1));
        }
    }

    public void b(int i1, int ai1[])
    {
        if (!G())
        {
            return;
        } else
        {
            bp.a(new bz(i1, ai1));
            return;
        }
    }

    public void b(int i1, String as1[])
    {
        if (G())
        {
            bp.a(new ba(i1, as1));
        }
    }

    protected void b(int i1, e ae1[])
    {
        a(i1, ae1, bH, bI);
    }

    public abstract void b(String s1);

    public void b(String s1, int i1)
    {
        while (!G() || s1 == null) 
        {
            return;
        }
        int j1 = p.dm.l.a(s1);
        if (!bv.containsKey(Integer.valueOf(j1)))
        {
            d((new StringBuilder()).append("Failed to return album art: we didn't had a preloaded art for token ").append(s1).append(", with small token: ").append(j1).toString());
            return;
        }
        try
        {
            p.l.a a1 = (p.l.a)bv.get(Integer.valueOf(j1));
            a1.a(new p.al.f(s1, j1) {

                final String a;
                final int b;
                final m c;

                public volatile boolean a(Exception exception, Object obj, p.an.k k1, boolean flag)
                {
                    return a(exception, (String)obj, k1, flag);
                }

                public boolean a(Exception exception, String s2, p.an.k k1, boolean flag)
                {
                    return false;
                }

                public volatile boolean a(Object obj, Object obj1, p.an.k k1, boolean flag, boolean flag1)
                {
                    return a((byte[])obj, (String)obj1, k1, flag, flag1);
                }

                public boolean a(byte abyte0[], String s2, p.an.k k1, boolean flag, boolean flag1)
                {
                    c.d((new StringBuilder()).append("Returning album art for token: ").append(a).append(", with small").append(" token: ").append(b).toString());
                    if (!flag)
                    {
                        c.d("Returning art was not in memory cache (not preloaded)...");
                    }
                    return false;
                }

            
            {
                c = m.this;
                a = s1;
                b = i1;
                super();
            }
            });
            a(s1, i1, (byte[])(byte[])a1.c(bt, bt).get(), 2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        a("Failed to return album art.", s1);
        bv.remove(Integer.valueOf(j1));
    }

    public void b(String s1, int i1, int j1, byte abyte0[])
    {
        if (G())
        {
            bp.a(new br(p.dm.l.a(s1), i1, j1, abyte0));
        }
    }

    public void b(String s1, String s2)
    {
        if (G())
        {
            bp.a(new bq(p.dm.l.a(s1), s2));
        }
    }

    public void b(String s1, boolean flag)
    {
        if (G())
        {
            bp.a(new ci(p.dm.l.a(s1), flag));
        }
    }

    public void b(p.dm.b b1)
    {
        c(b1);
    }

    protected void b(p.dn.a a1)
    {
        synchronized (bU)
        {
            bT = a1;
            bU.notifyAll();
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void b(boolean flag)
    {
        bq = flag;
        bj = false;
    }

    protected boolean b(p.dn.b b1)
    {
        if (bn == 0 || bn > bm)
        {
            l((new StringBuilder()).append("PNDR_SESSION_START attempted with unsupported API version ").append(bn).append(", current = ").append(bm).toString());
            R();
            return false;
        }
        bs = b1.f();
        bt = b1.e();
        bu = b1.j();
        bw = false;
        bx = false;
        if (bs != 0) goto _L2; else goto _L1
_L1:
        bw = true;
        bx = true;
_L4:
        b(true);
        u();
        d((new StringBuilder()).append("onSessionStart ").append(b1).toString());
        return true;
_L2:
        if (bt <= 0)
        {
            bw = true;
        }
        if (bu <= 0)
        {
            bx = true;
        } else
        if (bu > 130)
        {
            bu = 130;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected String c(int i1, int j1)
    {
        e ae1[];
        for (ae1 = s(i1); ae1 == null || ae1.length == 0 || j1 >= ae1.length || ae1[j1] == null;)
        {
            return null;
        }

        return ae1[j1].d;
    }

    public void c(int i1, String s1)
    {
        if (G())
        {
            bp.a(new bf(i1, s1));
        }
    }

    protected void c(int i1, int ai1[])
    {
        e ae1[] = s(i1);
        e ae2[] = new e[ai1.length];
        if (ae1 != null && ae1.length > 0)
        {
            int k1 = ai1.length;
            int l1 = ae1.length;
            int j1 = 0;
            while (j1 < k1) 
            {
                int i2 = ai1[j1];
                if (i2 < l1)
                {
                    ae2[j1] = ae1[i2];
                }
                j1++;
            }
            a(i1, ae2);
        }
    }

    protected void c(int i1, e ae1[])
    {
        a(i1, ae1, bJ, bK);
    }

    public void c(String s1, int i1)
    {
        if (G())
        {
            bp.a(new cb(p.dm.o.a(s1), i1));
        }
    }

    public void c(String s1, String s2)
    {
        if (G())
        {
            bp.a(new bu(p.dm.l.a(s1), s2));
        }
    }

    protected void c(p.dm.b b1)
    {
        synchronized (br)
        {
            bo = b1;
            if (bp == null)
            {
                bp = p.dq.c.a();
            }
            if (bD != null)
            {
                bD.a(bo.e(), bo.f(), bp);
            }
            if (!bp.b())
            {
                bp.a(this);
                bp.j();
            }
            c(true);
        }
        h();
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void c(boolean flag)
    {
        c = flag;
    }

    public void c(byte abyte0[])
    {
        if (G())
        {
            bp.a(new p.dn.e(true, abyte0));
        }
    }

    protected boolean c(p.dn.a a1)
    {
        if (bL == null)
        {
            return false;
        } else
        {
            return bL.equals(a1.getClass());
        }
    }

    public void d(String s1)
    {
        m((new StringBuilder()).append("PANDORALINK ").append(s1).toString());
    }

    public void d(String s1, int i1)
    {
        d("Image fetch request done, sending PNDR_UPDATE_TRACK_ALBUM_ART.");
        if (G())
        {
            bp.a(new cg(p.dm.l.a(s1), i1));
        }
    }

    public void d(boolean flag)
    {
        bM = flag;
    }

    public void e(String s1)
    {
        if (G())
        {
            bp.a(new bh(p.dm.o.a(s1)));
        }
    }

    public void e(String s1, int i1)
    {
        if (G())
        {
            bp.a(new ck(p.dm.l.a(s1), i1), true);
        }
    }

    public void e(boolean flag)
    {
        synchronized (g)
        {
            h = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(int i1)
    {
        if (bA == i1) goto _L2; else goto _L1
_L1:
        bA = i1;
        if (bA != 1) goto _L4; else goto _L3
_L3:
        F();
_L6:
        o(bA);
_L2:
        return;
_L4:
        if (bA == 2)
        {
            H();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void f(String s1)
    {
        if (G())
        {
            bp.a(new be(s1));
        }
    }

    public void f(String s1, int i1)
    {
        if (G())
        {
            bp.a(new cl(p.dm.l.a(s1), i1));
        }
    }

    public void g(String s1)
    {
        if (G())
        {
            bp.a(new ca(p.dm.o.a(s1)));
        }
    }

    public void g(String s1, int i1)
    {
        if (G())
        {
            bp.a(new cm(p.dm.l.a(s1), i1));
        }
    }

    public void h()
    {
    }

    public void h(String s1)
    {
        if (G())
        {
            bp.a(new cc(p.dm.o.a(s1)));
        }
    }

    public void i(int i1)
    {
        if (G())
        {
            bp.a(new bj(i1));
        }
    }

    public void i(String s1)
    {
        if (!G())
        {
            return;
        }
        int i1 = 0;
        if (!s1.equals("0"))
        {
            i1 = p.dm.l.a(s1);
        }
        bp.a(new cf(i1));
        if (by != null && by.intValue() != i1)
        {
            bv.remove(by);
            bp.a(p/dn/bp);
        }
        by = new Integer(i1);
    }

    public void j()
    {
        a(((p.dn.c) (null)));
        if (!J())
        {
            return;
        }
        w();
        synchronized (br)
        {
            c(false);
            if (bp != null)
            {
                bp.k();
                bp = null;
            }
            if (bo != null)
            {
                bo.g();
                bo = null;
            }
            U();
        }
        k("Link Disconnected, no longer connected to accessory");
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void j(int i1)
    {
        if (G())
        {
            bp.a(new bm(i1));
        }
    }

    public void j(String s1)
    {
        if (!bz)
        {
            bz = true;
            if (G() && g(3) && s1 != null && !s1.equals("0"))
            {
                int i1 = p.dm.l.a(s1);
                bp.a(new cj(i1));
                return;
            }
        }
    }

    public void k()
    {
    }

    public void k(int i1)
    {
        if (G())
        {
            bp.a(new az(i1));
        }
    }

    public void k(String s1)
    {
        l((new StringBuilder()).append("PANDORALINK ").append(s1).toString());
    }

    public void l()
    {
    }

    public void l(int i1)
    {
        if (G())
        {
            int j1 = i1;
            if (bn == 1)
            {
                j1 = i1;
                if (p(i1))
                {
                    j1 = 4;
                }
            }
            bp.a(new bn(j1));
        }
    }

    public void m(int i1)
    {
        if (G())
        {
            bp.a(new by(i1));
        }
    }

    public void n(int i1)
    {
        if (G())
        {
            bp.a(new cd(i1));
        }
    }

    public void o(int i1)
    {
        if (G() || W())
        {
            int j1 = i1;
            if (bn == 1)
            {
                j1 = i1;
                if (p(i1))
                {
                    j1 = 4;
                }
            }
            bp.a(new ce(j1));
        }
    }

    public abstract boolean o();

    public abstract boolean p()
        throws p.dm.n;

    public boolean p(int i1)
    {
        switch (i1)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            return false;

        case 4: // '\004'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return true;
        }
    }

    public String q(int i1)
    {
        switch (i1)
        {
        default:
            return "Sorry, an error occurred.";

        case 0: // '\0'
            return "Sorry, our music licenses force us to limit the number of tracks you may skip.";

        case 1: // '\001'
            return "Sorry, you cannot create more than 100 stations.";

        case 2: // '\002'
            return "Unable to save your thumb rating.";

        case 8: // '\b'
            return "Unable to explain why this track is playing.";

        case 3: // '\003'
            return "Unable to delete your station.";

        case 4: // '\004'
            return "Unable to search for music.";

        case 5: // '\005'
            return "Unable to create your station.";

        case 6: // '\006'
            return "Unable to save your bookmark.";

        case 7: // '\007'
            return "Sorry, Pandora is conducting system maintenance and is unable to fulfill your request.";

        case 9: // '\t'
            return "Pandora session has already been started.";

        case 10: // '\n'
            return "Pandora has no active session.";
        }
    }

    public void r()
    {
        d("onInterceptorFailedToConnect");
        bO = null;
    }

    protected void r(int i1)
    {
        a(i1, bH, bI);
        a(i1, bJ, bK);
    }

    public void s()
    {
        d("onInterceptorConnected - all 4 interceptor ports connected!!");
        e(true);
        if (bp != null && bp.b())
        {
            d("onInterceptorConnected - calling parser.onRefreshStreams!");
            bp.m();
        }
        bO = null;
    }

    protected e[] s(int i1)
    {
        if (i1 == bJ[0])
        {
            return (e[])(e[])bK.elementAt(0);
        }
        if (i1 == bJ[1])
        {
            return (e[])(e[])bK.elementAt(1);
        }
        if (i1 == bH[0])
        {
            return (e[])(e[])bI.elementAt(0);
        }
        if (i1 == bH[1])
        {
            return (e[])(e[])bI.elementAt(1);
        } else
        {
            return (e[])null;
        }
    }

    public void t(int i1)
    {
        d((new StringBuilder()).append("onInterceptorPortFailedToConnect(").append(i1).append(")").toString());
        if (bO == null)
        {
            r();
            return;
        } else
        {
            bO.a(i1);
            return;
        }
    }

    public abstract void u();

    public abstract void v();

    public abstract void w();

    public abstract void x();

    public abstract void y();

}
