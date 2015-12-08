// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import com.pandora.android.provider.b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import p.an.g;
import p.ax.a;
import p.bd.l;
import p.bg.ab;
import p.bg.ae;
import p.bg.af;
import p.bg.ag;
import p.bg.ai;
import p.bg.aj;
import p.bg.ak;
import p.bg.ao;
import p.bg.aq;
import p.bg.at;
import p.bg.au;
import p.bg.aw;
import p.bg.bd;
import p.bg.be;
import p.bg.bg;
import p.bg.bh;
import p.bg.bi;
import p.bg.bk;
import p.bg.bl;
import p.bg.bn;
import p.bg.bp;
import p.bg.bq;
import p.bg.br;
import p.bg.bs;
import p.bg.bv;
import p.bg.bx;
import p.bg.by;
import p.bg.bz;
import p.bg.cd;
import p.bg.k;
import p.bg.p;
import p.bg.z;
import p.bh.aa;
import p.bh.f;
import p.bh.h;
import p.bh.o;
import p.bh.s;
import p.bh.t;
import p.bh.u;
import p.bh.w;
import p.cv.e;
import p.dm.m;
import p.dm.n;
import p.dn.bw;
import p.l.d;
import p.l.i;
import p.l.j;

// Referenced classes of package p.ct:
//            d, a

public abstract class p.ct.c extends p.ct.d
{
    protected class a extends Thread
    {

        final p.ct.c a;
        private Object b;
        private Vector c;
        private int d;
        private int e;

        private void c()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            if (d == 0)
            {
                break MISSING_BLOCK_LABEL_78;
            }
_L1:
            int i1;
            int j1;
            if (c.isEmpty() || e < 0)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            i1 = e;
            j1 = Math.min(5, c.size());
            Exception exception;
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            p.bd.e e1;
            try
            {
                a.g("sendNextAddCommandChunk - waiting...");
                b.wait();
            }
            catch (InterruptedException interruptedexception) { }
            finally { }
              goto _L1
            i1 = 0;
_L3:
            if (i1 >= 5)
            {
                break MISSING_BLOCK_LABEL_180;
            }
            if (!c.isEmpty())
            {
                e1 = (p.bd.e)c.elementAt(0);
                c.removeElementAt(0);
                a.c.a(e1);
                d = d + 1;
                a.g((new StringBuilder()).append("addCommand sent command= ").append(e1.toString()).append(" ctr=").append(d).toString());
            }
            break MISSING_BLOCK_LABEL_193;
            e = 0;
            obj;
            JVM INSTR monitorexit ;
            return;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            i1++;
            if (true) goto _L3; else goto _L2
_L2:
        }

        public void a()
        {
            synchronized (b)
            {
                e = e + 1;
                a.g((new StringBuilder()).append("onAddCommandResponse ctr=").append(e).toString());
                b.notifyAll();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean b()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (!c.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj;
            JVM INSTR monitorexit ;
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void run()
        {
            if (a.l)
            {
                a.M();
                for (; b(); c()) { }
                a.l = false;
            } else
            {
                a.a(p.bh.d.c);
                a.a(p.bh.d.b);
                a.a(p.bh.d.a);
                a.g("add the preset buttons");
                int j1 = a.q;
                int i1 = j1 - 1;
                if (j1 > 0)
                {
                    a.a(p.bh.d.g);
                }
                j1 = i1 - 1;
                if (i1 > 0)
                {
                    a.a(p.bh.d.h);
                }
                i1 = j1 - 1;
                if (j1 > 0)
                {
                    a.a(p.bh.d.i);
                }
                j1 = i1 - 1;
                if (i1 > 0)
                {
                    a.a(p.bh.d.j);
                }
                i1 = j1 - 1;
                if (j1 > 0)
                {
                    a.a(p.bh.d.k);
                }
                j1 = i1 - 1;
                if (i1 > 0)
                {
                    a.a(p.bh.d.l);
                }
                i1 = j1 - 1;
                if (j1 > 0)
                {
                    a.a(p.bh.d.m);
                }
                j1 = i1 - 1;
                if (i1 > 0)
                {
                    a.a(p.bh.d.n);
                }
                i1 = j1 - 1;
                if (j1 > 0)
                {
                    a.a(p.bh.d.o);
                }
                if (i1 > 0)
                {
                    a.a(p.bh.d.f);
                }
                a.g("add custom help prompts");
                a.K();
                a.L();
                a.M();
                while (b()) 
                {
                    c();
                }
            }
        }

        protected a()
        {
            a = p.ct.c.this;
            super();
            b = new Object();
            c = new Vector();
            d = 0;
            e = 0;
        }
    }

    protected class b extends Thread
    {

        final p.ct.c a;
        private Object b;
        private Vector c;

        public boolean a()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (!c.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj;
            JVM INSTR monitorexit ;
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b()
        {
            synchronized (b)
            {
                if (!c.isEmpty())
                {
                    c.removeAllElements();
                    b.notifyAll();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void c()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            StringBuffer stringbuffer;
            Vector vector;
            vector = a.q();
            stringbuffer = new StringBuffer("Your Stations, ");
_L1:
            if (vector.isEmpty())
            {
                break MISSING_BLOCK_LABEL_165;
            }
            Exception exception;
            bp bp1;
            Vector vector1;
            by by1;
            for (int i1 = 0; i1 >= 5; i1++)
            {
                break MISSING_BLOCK_LABEL_79;
            }

            if (!vector.isEmpty())
            {
                stringbuffer.append(((c)vector.elementAt(0)).b());
                vector.removeElementAt(0);
                stringbuffer.append(",");
            }
            break MISSING_BLOCK_LABEL_173;
            if (stringbuffer.length() != 0)
            {
                bp1 = new bp();
                vector1 = new Vector();
                by1 = new by();
                by1.a(stringbuffer.toString());
                by1.a(u.a);
                vector1.add(by1);
                bp1.a(vector1);
                c.addElement(bp1);
            }
            stringbuffer = new StringBuffer();
              goto _L1
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void d()
        {
            synchronized (b)
            {
                if (!c.isEmpty())
                {
                    bp bp1 = (bp)c.elementAt(0);
                    c.removeElementAt(0);
                    a.c.a(bp1);
                    b.notifyAll();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void e()
        {
            d();
        }

        public void run()
        {
            a.g("ListStationsThread.run");
            c();
            d();
_L2:
            if (!a())
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            a.g("ListStationsThread moreToProcess so waiting...");
            Exception exception;
            try
            {
                b.wait();
            }
            catch (InterruptedException interruptedexception) { }
            if (true) goto _L2; else goto _L1
_L1:
            break; /* Loop/switch isn't completed */
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            a.g("ListStationsThread DONE");
            a.g = null;
            return;
        }

        protected b()
        {
            a = p.ct.c.this;
            super();
            b = new Object();
            c = new Vector();
        }
    }

    public class c
    {

        final p.ct.c a;
        private String b;
        private String c;

        public String a()
        {
            return b;
        }

        public String b()
        {
            return c;
        }

        public c(String s1, String s2)
        {
            a = p.ct.c.this;
            super();
            c = s1;
            b = s2;
        }
    }

    public class d
    {

        protected String a;
        protected String b;
        protected String c;
        protected String d;
        protected String e;
        protected boolean f;
        protected boolean g;
        protected boolean h;
        protected boolean i;
        protected boolean j;
        protected int k;
        final p.ct.c l;

        public void a(int i1)
        {
            k = i1;
        }

        public void a(boolean flag)
        {
            j = flag;
        }

        public boolean a()
        {
            return j;
        }

        public int b()
        {
            return k;
        }

        public String c()
        {
            return a;
        }

        public String d()
        {
            return b;
        }

        public String e()
        {
            return c;
        }

        public String f()
        {
            return d;
        }

        public String g()
        {
            return e;
        }

        public boolean h()
        {
            return f;
        }

        public boolean i()
        {
            return g;
        }

        public boolean j()
        {
            return h;
        }

        public boolean k()
        {
            return i;
        }

        public d(String s1, String s2, String s3, String s4, boolean flag, boolean flag1, 
                boolean flag2, boolean flag3, int i1, boolean flag4, String s5)
        {
            l = p.ct.c.this;
            super();
            a = s1;
            b = s2;
            c = s3;
            d = s4;
            f = flag;
            g = flag1;
            h = flag2;
            i = flag3;
            k = i1;
            j = flag4;
            e = s5;
        }
    }


    private static int a = 11;
    private Vector A;
    private boolean B;
    private boolean C;
    private m b;
    protected p.cu.a c;
    Hashtable d;
    Hashtable e;
    Vector f;
    protected b g;
    protected a h;
    protected int i;
    protected int j;
    protected boolean k;
    protected boolean l;
    protected ArrayList m;
    protected p.bg.t n;
    protected boolean o;
    protected boolean p;
    protected int q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected int w;
    private d y;
    private c z;

    public p.ct.c()
    {
        d = new Hashtable();
        e = new Hashtable();
        f = new Vector();
        i = 0;
        j = 0;
        k = false;
        l = false;
        n = null;
        o = false;
        p = false;
        q = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        A = new Vector();
        v = false;
        w = 200;
        B = false;
        C = false;
        a();
    }

    private void a()
    {
        try
        {
            e e1 = new e();
            e1.a(this);
            c = new p.cu.a(e1);
            return;
        }
        catch (p.ax.a a1)
        {
            Log.e("AppLink", "There was a problem starting the requester proxy", a1);
        }
    }

    private void a(Integer integer, Vector vector)
    {
        k k1 = new k();
        k1.b(integer);
        k1.a(vector);
        c.b(k1, new p.cv.c() {

            final p.ct.c a;

            public void a(p.bd.g g1)
            {
                p.df.a.a("FordSyncApi", (new StringBuilder()).append("FORD_DBG restigerChoiceSetResponse: success: ").append(g1.d()).append(" result: ").append(g1.e()).toString());
            }

            
            {
                a = p.ct.c.this;
                super();
            }
        });
    }

    private void a(String s1)
    {
        if (s1 == null || A.contains(s1))
        {
            return;
        } else
        {
            A.add(s1);
            return;
        }
    }

    static void a(p.ct.c c1)
    {
        c1.k();
    }

    static void a(p.ct.c c1, String s1)
    {
        c1.a(s1);
    }

    static boolean a(p.ct.c c1, boolean flag)
    {
        c1.C = flag;
        return flag;
    }

    static void b(p.ct.c c1)
    {
        c1.j();
    }

    protected static void c(String s1)
    {
        p.dm.m.l((new StringBuilder()).append("AppLink ").append(s1).toString());
    }

    static void c(p.ct.c c1)
    {
        c1.r();
    }

    private void d()
    {
        if (!c.b())
        {
            return;
        } else
        {
            Log.d("AppLink", "Preparing app icon...");
            C = true;
            aw aw1 = new aw();
            aw1.a("ai_v1");
            aw1.a(h.c);
            aw1.a(Boolean.valueOf(true));
            Bitmap bitmap = BitmapFactory.decodeResource(com.pandora.android.provider.b.a.h().getResources(), 0x7f0201ee);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
            byte abyte0[] = new byte[bytearrayoutputstream.toByteArray().length];
            aw1.a(bytearrayoutputstream.toByteArray());
            c.b(aw1, new p.cv.c() {

                final p.ct.c a;

                public void a(p.bd.g g1)
                {
                    if (g1.d().booleanValue())
                    {
                        p.ct.c.a(a, false);
                        p.ct.c.a(a, "ai_v1");
                        p.ct.c.a(a);
                    }
                }

            
            {
                a = p.ct.c.this;
                super();
            }
            });
            return;
        }
    }

    private void j()
    {
        boolean flag;
        if (A.contains("bi_v2") && A.contains("bi_v1") && A.contains("ai_v1"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
    }

    private void k()
    {
        if (!c.b())
        {
            return;
        }
        Log.d("AppLink", "Applying Pandora icon...");
        u = true;
        if (!A.contains("ai_v1"))
        {
            z();
            return;
        } else
        {
            bd bd1 = new bd();
            bd1.a("ai_v1");
            c.b(bd1, new p.cv.c() {

                final p.ct.c a;

                public void a(p.bd.g g1)
                {
                    a.u = false;
                    if (g1.d().booleanValue())
                    {
                        a.t = true;
                    }
                }

            
            {
                a = p.ct.c.this;
                super();
            }
            });
            return;
        }
    }

    private void r()
    {
        if (ah() != null)
        {
            g g1 = p.an.g.a(0x80000000, 0x80000000);
            p.l.g.b(com.pandora.android.provider.b.a.b().s()).a(ah().g()).h().a(p.s.b.a).a(i.b).a(new p.al.f() {

                final p.ct.c a;

                public boolean a(Bitmap bitmap, String s1, p.an.k k1, boolean flag, boolean flag1)
                {
                    if (bitmap != null && a.ah() != null)
                    {
                        a.a(a.ah().f(), bitmap);
                    }
                    return true;
                }

                public volatile boolean a(Exception exception, Object obj, p.an.k k1, boolean flag)
                {
                    return a(exception, (String)obj, k1, flag);
                }

                public boolean a(Exception exception, String s1, p.an.k k1, boolean flag)
                {
                    exception = BitmapFactory.decodeResource(com.pandora.android.provider.b.a.h().getResources(), 0x7f0200e9);
                    if (exception != null)
                    {
                        a.a(a.ah().f(), exception);
                    }
                    return true;
                }

                public volatile boolean a(Object obj, Object obj1, p.an.k k1, boolean flag, boolean flag1)
                {
                    return a((Bitmap)obj, (String)obj1, k1, flag, flag1);
                }

            
            {
                a = p.ct.c.this;
                super();
            }
            }).a(g1);
        }
    }

    protected void A()
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = h;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h = new a();
        h.start();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void B()
    {
        Log.d("AppLink", "applyAlertSignedOut");
        a("Unable to Play", "Login Required", true);
        p.bg.e e1 = new p.bg.e();
        Object obj = new Vector();
        Object obj1 = new bn();
        ((bn) (obj1)).a(Integer.valueOf(108));
        ((bn) (obj1)).a("Exit");
        ((bn) (obj1)).a(t.a);
        ((bn) (obj1)).a(Boolean.valueOf(true));
        ((Vector) (obj)).add(obj1);
        e1.b(((Vector) (obj)));
        e1.a(Boolean.valueOf(false));
        e1.a("Unable to Play");
        e1.b("Login Required");
        e1.b(new Integer(4000));
        obj = new by();
        ((by) (obj)).a("Pandora is unable to play mmusic at this time because no user is logged in.");
        ((by) (obj)).a(u.a);
        obj1 = new Vector();
        ((Vector) (obj1)).add(obj);
        e1.a(((Vector) (obj1)));
        c.b(e1);
    }

    protected void C()
    {
        Log.d("AppLink", "applyAlertNoStations");
        a("Unable to Play", "No Saved Stations", true);
        p.bg.e e1 = new p.bg.e();
        Object obj = new Vector();
        Object obj1 = new bn();
        ((bn) (obj1)).a(Integer.valueOf(108));
        ((bn) (obj1)).a("Exit");
        ((bn) (obj1)).a(t.a);
        ((bn) (obj1)).a(Boolean.valueOf(true));
        ((Vector) (obj)).add(obj1);
        e1.b(((Vector) (obj)));
        e1.a(Boolean.valueOf(false));
        e1.a("No Saved Stations");
        e1.b(new Integer(4000));
        obj = new by();
        ((by) (obj)).a("Panodra is unable to play music at this time because there are no saved stations.");
        ((by) (obj)).a(u.a);
        obj1 = new Vector();
        ((Vector) (obj1)).add(obj);
        e1.a(((Vector) (obj1)));
        c.b(e1);
    }

    public void D()
    {
        if (c != null)
        {
            c("Clearing album art...");
            bk bk1 = new bk();
            z z1 = new z();
            z1.a(p.bh.k.a);
            z1.a("transparent");
            bk1.a(z1);
            c.a(bk1);
        }
    }

    public void E()
    {
        if (c == null)
        {
            return;
        } else
        {
            bi bi1 = new bi();
            bi1.a(aa.e);
            c.a(bi1);
            return;
        }
    }

    protected void F()
    {
        d(null);
    }

    public boolean G()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c != null)
        {
            flag = flag1;
            if (c.b())
            {
                flag = flag1;
                if (x != null)
                {
                    flag = flag1;
                    if (x != p.bh.i.d)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void H()
    {
        if (c != null)
        {
            try
            {
                c.e();
                return;
            }
            catch (p.ax.a a1)
            {
                Log.e("AppLink", "Problem resetting proxy", a1);
            }
            return;
        } else
        {
            a();
            return;
        }
    }

    public void I()
    {
        Vector vector = J();
        if (vector != null && vector.size() > 0)
        {
            bk bk1 = new bk();
            bk1.a(vector);
            c.b(bk1);
        }
    }

    public Vector J()
    {
        bn bn1;
        z z2;
        boolean flag1 = false;
        Object obj = c.c();
        if (obj == null)
        {
            return null;
        }
        obj = ((p.bg.t) (obj)).a();
        Log.d("AppLink", (new StringBuilder()).append("displayType=").append(obj).toString());
        boolean flag3 = Arrays.asList(new f[] {
            f.h, f.i, f.j
        }).contains(obj);
        boolean flag2 = Arrays.asList(new f[] {
            f.j
        }).contains(obj);
        obj = new Vector();
        bn1 = new bn();
        bn1.a(Integer.valueOf(100));
        if (flag3)
        {
            z z1 = new z();
            z1.a(p.bh.k.a);
            z1.a("4F");
            bn1.a(z1);
            bn1.a(t.b);
        } else
        {
            bn1.a("List");
            bn1.a(t.a);
        }
        ((Vector) (obj)).add(bn1);
        bn1 = new bn();
        bn1.a(Integer.valueOf(101));
        if (flag3)
        {
            z2 = new z();
            z2.a(p.bh.k.a);
            z2.a("14");
            bn1.a(z2);
            bn1.a(t.b);
            if (y().equals("SYNC0003"))
            {
                boolean flag;
                if (ah() != null && ah().b() == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bn1.a(new Boolean(flag));
            }
        } else
        {
            bn1.a("Th.Dn.");
            bn1.a(t.a);
        }
        ((Vector) (obj)).add(bn1);
        bn1 = new bn();
        bn1.a(Integer.valueOf(102));
        if (flag3)
        {
            z2 = new z();
            z2.a(p.bh.k.a);
            z2.a("13");
            bn1.a(z2);
            bn1.a(t.b);
            if (y().equals("SYNC0003"))
            {
                flag = flag1;
                if (ah() != null)
                {
                    flag = flag1;
                    if (ah().b() == 1)
                    {
                        flag = true;
                    }
                }
                bn1.a(new Boolean(flag));
            }
        } else
        {
            bn1.a("Th.Up");
            bn1.a(t.a);
        }
        ((Vector) (obj)).add(bn1);
        if (!flag2) goto _L2; else goto _L1
_L1:
        bn1 = new bn();
        bn1.a(Integer.valueOf(103));
        z2 = new z();
        if (!s) goto _L4; else goto _L3
_L3:
        z2.a(p.bh.k.b);
        if (ah() != null && ah().a())
        {
            z2.a("bi_v2");
            bn1.a(Boolean.valueOf(true));
        } else
        {
            z2.a("bi_v1");
        }
_L6:
        bn1.a(z2);
        bn1.a(t.b);
        ((Vector) (obj)).add(bn1);
_L2:
        if (y().equals("SYNC0003"))
        {
            bn1 = new bn();
            bn1.a(Integer.valueOf(104));
            if (flag2)
            {
                z2 = new z();
                z2.a(p.bh.k.a);
                z2.a("98");
                bn1.a(z2);
                bn1.a(t.b);
            } else
            {
                bn1.a("New");
                bn1.a(t.a);
            }
            ((Vector) (obj)).add(bn1);
        }
        return ((Vector) (obj));
_L4:
        z2.a(p.bh.k.a);
        z2.a("95");
        if (ah() != null)
        {
            bn1.a(Boolean.valueOf(ah().a()));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void K()
    {
        if (c == null)
        {
            return;
        } else
        {
            bg bg1 = new bg();
            Vector vector = new Vector();
            by by1 = new by();
            by1.a("play, followed by the station name, list my stations, thumbs up, thumbs down, bookmark, track info, create station from track or artist, you can also hold the next button to thumbs up the current track or hold the previous button to thumbs down");
            by1.a(u.a);
            vector.add(by1);
            bg1.a(vector);
            bg1.b(vector);
            c.a(bg1);
            return;
        }
    }

    public void L()
    {
        g("addCommands");
        if (y().equals("SYNC0003"))
        {
            a(6, "Track Info", 0, 0, new String[] {
                "Track Info", "Song Info"
            });
            a(9, "Create Station From Current Artist", 0, 1, new String[] {
                "Create Station from Artist"
            });
            a(10, "Create Station From Current Track", 0, 2, new String[] {
                "Create Station from Track", "Create Station from Song"
            });
            a(7, null, 0, 0, new String[] {
                "Bookmark", "Bookmark Song", "Bookmark Track"
            });
            a(4, null, 0, 0, new String[] {
                "Thumbs Up", "Thumb Up"
            });
            a(5, null, 0, 0, new String[] {
                "Thumbs Down", "Thumb Down"
            });
            a(8, null, 0, 0, new String[] {
                "List My Stations"
            });
        } else
        {
            a(7, "Bookmark", 0, 0, new String[] {
                "Bookmark", "Bookmark Song", "Bookmark Track"
            });
            a(4, "Thumbs Up", 0, 1, new String[] {
                "Thumbs Up", "Thumb Up"
            });
            a(5, "Thumbs Down", 0, 2, new String[] {
                "Thumbs Down", "Thumb Down"
            });
            a(6, "Track Info", 0, 3, new String[] {
                "Track Info", "Song Info"
            });
            a(8, "List My Stations", 0, 4, new String[] {
                "List My Stations"
            });
            a(5, "Create Station", new p.cv.c(5) {

                final int a;
                final p.ct.c b;

                public void a(p.bd.g g1)
                {
                    if (g1.d().booleanValue())
                    {
                        p.df.a.a("AppLink", "Adding sub menus");
                        b.a(9, "From Current Artist", a, 0, new String[] {
                            "Create Station from Artist"
                        });
                        b.a(10, "From Current Track", a, 1, new String[] {
                            "Create Station from Track", "Create Station from Song"
                        });
                    }
                }

            
            {
                b = p.ct.c.this;
                a = i1;
                super();
            }
            });
        }
        a(3, null, 0, 0, new String[] {
            "Play"
        });
    }

    protected void M()
    {
        Log.d("AppLink", "applyStationCommands");
        Vector vector = q();
        if (vector != null && vector.size() != 0)
        {
            int i1 = vector.size() - 1;
            while (i1 >= 0) 
            {
                a((c)vector.elementAt(i1));
                i1--;
            }
        }
    }

    protected void N()
    {
        Vector vector = p();
        for (int i1 = 0; i1 < q && i1 < vector.size(); i1++)
        {
            f.add(i1, vector.get(i1));
        }

        if (y().equals("SYNC0003"))
        {
            O();
        }
    }

    public void O()
    {
        c("Setting custom preset labels...");
        if (f.size() == 0)
        {
            return;
        }
        p = false;
        bk bk1 = new bk();
        Vector vector = new Vector();
        int j1 = Math.min(q, f.size());
        for (int i1 = 0; i1 < j1; i1++)
        {
            c c1 = (c)f.get(i1);
            if (c1 != null)
            {
                vector.add(c1.b());
            }
        }

        bk1.b(vector);
        c.a(bk1);
    }

    protected void P()
    {
        d d1 = ah();
        if (d1 != null && d1.h())
        {
            a("Pandora cannot skip an advertisement.", "Cannot skip ad");
            return;
        }
        boolean flag;
        try
        {
            flag = x().p();
        }
        catch (n n1)
        {
            if (n1.getMessage().equals("No current station"))
            {
                F();
                return;
            }
            flag = false;
        }
        if (flag)
        {
            a(ai().b(), "Skipping...", true, false);
            x().a(null);
            a(((d) (null)));
            return;
        } else
        {
            a(((String) (null)), "Skip Limit Reached");
            return;
        }
    }

    protected void Q()
    {
        d d1 = ah();
        if (d1 == null)
        {
            return;
        }
        if (d1.h())
        {
            a("Pandora cannot rate an advertisement.", "Cannot rate ad");
            return;
        }
        if (!d1.k())
        {
            a("Pandora cannot rate this track", "Cannot rate track");
            return;
        } else
        {
            ah().a(1);
            x().a(null);
            I();
            return;
        }
    }

    protected void R()
    {
        d d1;
        boolean flag;
        d1 = ah();
        if (d1 == null)
        {
            return;
        }
        flag = false;
        boolean flag1 = x().p();
        flag = flag1;
_L2:
        g((new StringBuilder()).append("actionThumbDown() > canSkip=").append(flag).toString());
        if (d1.h())
        {
            a("Pandora cannot rate an advertisement.", "Cannot rate ad");
            return;
        }
        break; /* Loop/switch isn't completed */
        n n1;
        n1;
        if (n1.getMessage().equals("No current station"))
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (!d1.k())
        {
            a("Pandora cannot rate this track", "Cannot rate track");
            return;
        }
        if (flag)
        {
            a(((d) (null)));
            e();
        } else
        {
            ah().a(-1);
            I();
        }
        x().a(null);
        return;
    }

    protected void S()
    {
        d d1 = ah();
        if (d1 == null)
        {
            return;
        }
        if (d1.h())
        {
            a("Pandora cannot bookmark an advertisement", "Cannot bookmark ad");
            return;
        }
        if (!d1.j())
        {
            a("Pandora cannot bookmark this track", "Cannot bookmark track");
            return;
        } else
        {
            ah().a(true);
            x().a(null);
            I();
            return;
        }
    }

    protected void T()
    {
        d d1 = ah();
        if (d1 != null && d1.h())
        {
            a("Pandora cannot create a station from an advertisement", "Cannot Create Station From Ad");
            return;
        }
        if (d1 != null && d1.i())
        {
            x().a(null);
            a("Creating Station...", "", true);
            return;
        } else
        {
            a("Sorry, Pandora could not create a station.", "Cannot Create Station");
            return;
        }
    }

    protected void U()
    {
        d d1 = ah();
        if (d1 != null && d1.h())
        {
            a("Pandora cannot create a station from an advertisement", "Cannot Create Station From Ad");
            return;
        }
        if (d1 != null && d1.i())
        {
            x().a(null);
            a("Creating Station...", "", true);
            return;
        } else
        {
            a("Sorry, Pandora could not create a station.", "Cannot Create Station");
            return;
        }
    }

    protected void V()
    {
        g("actionPause");
        r = true;
        if (!x().o())
        {
            aj();
        }
        x().a(null);
    }

    protected void W()
    {
        g("actionPlay");
        r = false;
        x().a(null);
    }

    protected void X()
    {
        if (ah() != null)
        {
            c((new StringBuilder()).append("song info (speak) Playing ").append(ah().c()).toString());
            e((new StringBuilder()).append("Playing, ").append(ah().c()).append(", by, ").append(ah().d()).append(", from the album, ").append(ah().e()).append(", on station, ").append(ai().b()).toString());
        }
    }

    protected void Y()
    {
        g("actionListStations");
        if (y().equals("SYNC0003"))
        {
            b(200);
            return;
        } else
        {
            Z();
            return;
        }
    }

    public void Z()
    {
        if (g != null)
        {
            g.b();
        }
        g = new b();
        g.start();
    }

    public Vector a(List list, int i1, int j1, boolean flag, boolean flag1, int k1)
    {
        Vector vector = new Vector();
        int l1 = i1;
        if (flag)
        {
            Object obj = new p.bg.j();
            Object obj1;
            Vector vector2;
            if (k1 == 201)
            {
                l1 = 401;
            } else
            {
                l1 = 403;
            }
            ((p.bg.j) (obj)).a(Integer.valueOf(l1));
            ((p.bg.j) (obj)).a("PREVIOUS");
            obj1 = new Vector();
            ((Vector) (obj1)).add("PREVIOUS");
            ((p.bg.j) (obj)).a(((Vector) (obj1)));
            vector.add(obj);
            l1 = i1;
        }
        for (; l1 < j1 && l1 < list.size(); l1++)
        {
            obj = (c)list.get(l1);
            obj1 = new p.bg.j();
            ((p.bg.j) (obj1)).a(Integer.valueOf(l1));
            e.put(new Integer(l1), obj);
            ((p.bg.j) (obj1)).a(((c) (obj)).b());
            vector2 = new Vector();
            vector2.add(((c) (obj)).b());
            ((p.bg.j) (obj1)).a(vector2);
            vector.add(obj1);
        }

        if (flag1)
        {
            list = new p.bg.j();
            Vector vector1;
            if (k1 == 201)
            {
                i1 = 402;
            } else
            {
                i1 = 400;
            }
            list.a(Integer.valueOf(i1));
            list.a("NEXT");
            vector1 = new Vector();
            vector1.add("NEXT");
            list.a(vector1);
            vector.add(list);
        }
        return vector;
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(int i1, String s1, int j1, int k1, String as[])
    {
        if (c == null)
        {
            return;
        }
        Vector vector = new Vector();
        if (as != null)
        {
            for (int l1 = 0; l1 < as.length; l1++)
            {
                vector.addElement(as[l1]);
            }

        }
        as = new p.bg.a();
        as.b(new Integer(i1));
        if (s1 != null)
        {
            ab ab1 = new ab();
            ab1.a(s1);
            ab1.a(Integer.valueOf(j1));
            ab1.b(Integer.valueOf(k1));
            as.a(ab1);
        }
        as.a(vector);
        c.a(as);
    }

    public void a(int i1, String s1, p.cv.c c1)
    {
        if (c == null)
        {
            return;
        } else
        {
            p.bg.c c2 = new p.bg.c();
            c2.b(Integer.valueOf(i1));
            c2.a(s1);
            c2.c(Integer.valueOf(i1));
            c.a(c2, c1);
            return;
        }
    }

    public void a(Integer integer)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("sentCommends == null? ");
        boolean flag;
        if (m == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(stringbuilder.append(flag).toString());
        c((new StringBuilder()).append("id = ").append(integer).toString());
        if (m != null && m.contains(integer))
        {
            m.remove(integer);
            h.a();
        }
    }

    public void a(String s1, Bitmap bitmap)
    {
        if (c == null || s1 == null || bitmap == null)
        {
            return;
        } else
        {
            aw aw1 = new aw();
            String s2 = s1.substring(0, 5);
            aw1.a(s2);
            aw1.a(h.c);
            aw1.a(Boolean.valueOf(false));
            aw1.a(a(bitmap));
            c((new StringBuilder()).append("Sending album art with name = ").append(s1).toString());
            c.a(aw1, new p.cv.c(s2) {

                final String a;
                final p.ct.c b;

                public void a(p.bd.g g1)
                {
                    if (g1.d().booleanValue() && a != null && !"".equals(a))
                    {
                        p.ct.c.c((new StringBuilder()).append("Showing album art named ").append(a).toString());
                        g1 = new bk();
                        z z1 = new z();
                        z1.a(a);
                        z1.a(p.bh.k.b);
                        g1.a(z1);
                        b.c.a(g1);
                    }
                }

            
            {
                b = p.ct.c.this;
                a = s1;
                super();
            }
            }, true);
            return;
        }
    }

    public void a(String s1, Exception exception, w w1)
    {
        p.df.a.a("AppLink", (new StringBuilder()).append("onProxyClosed disconnectedReason = ").append(w1).toString());
        p.df.a.a("AppLink", (new StringBuilder()).append("INFO: ").append(s1).toString(), exception);
        s1 = Arrays.asList(new w[] {
            w.q, w.p, w.c, w.d, w.b, w.h, w.i, w.j, w.k, w.n
        });
        exception = Arrays.asList(new w[] {
            w.o, w.r, w.s, w.t
        });
        if (s1.contains(w1))
        {
            i();
        } else
        if (exception.contains(w1))
        {
            H();
            return;
        }
    }

    public void a(String s1, String s2)
    {
        a(s1, s2, ((String) (null)));
    }

    public void a(String s1, String s2, String s3)
    {
        if (c == null)
        {
            return;
        }
        p.bg.e e1 = new p.bg.e();
        e1.a(Boolean.valueOf(false));
        e1.b(new Integer(4000));
        if (s1 != null)
        {
            e1.a(p.bd.l.a(s1));
        }
        if (s2 != null)
        {
            e1.a(s2);
        }
        if (!k && s3 != null)
        {
            e1.b(s3);
        }
        c.b(e1);
    }

    public void a(String s1, String s2, String s3, String s4, boolean flag)
    {
        a(s1, s2, s3, s4, false, flag);
    }

    public void a(String s1, String s2, String s3, String s4, boolean flag, boolean flag1)
    {
        if (c != null && s1 != null)
        {
            bk bk1 = new bk();
            bk1.a(s1);
            bk1.b(s2);
            if (y().equals("SYNC0003"))
            {
                bk1.c(s3);
                bk1.d(s4);
            }
            if (flag1)
            {
                s1 = p.bh.z.a;
            } else
            {
                s1 = p.bh.z.c;
            }
            bk1.a(s1);
            s1 = ai();
            if (s1 != null)
            {
                bk1.d(s1.b());
            }
            if (p)
            {
                O();
            }
            s1 = J();
            if (s1 != null && s1.size() > 0)
            {
                bk1.a(s1);
            }
            c.a(bk1);
            if (flag)
            {
                E();
                return;
            }
        }
    }

    public void a(String s1, String s2, boolean flag)
    {
        a(s1, s2, false, flag);
    }

    public void a(String s1, String s2, boolean flag, boolean flag1)
    {
        a(s1, s2, "", "", flag, flag1);
    }

    public void a(ae ae1)
    {
        if (p.bh.d.p.equals(ae1.c()))
        {
            c((new StringBuilder()).append("onOnButtonEvent > notification.getCustomButtonID() = ").append(ae1.e()).toString());
        }
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[p.bh.d.values().length];
                try
                {
                    a[p.bh.d.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[p.bh.d.g.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[p.bh.d.h.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[p.bh.d.i.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[p.bh.d.j.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[p.bh.d.k.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.bh.d.l.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.bh.d.m.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bh.d.n.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.bh.d.o.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.ct._cls4.a[ae1.c().ordinal()];
        JVM INSTR tableswitch 1 10: default 104
    //                   1 105
    //                   2 105
    //                   3 105
    //                   4 105
    //                   5 105
    //                   6 105
    //                   7 105
    //                   8 105
    //                   9 105
    //                   10 105;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        return;
_L2:
        c c1;
        if (!p.bh.c.a.equals(ae1.d()))
        {
            continue; /* Loop/switch isn't completed */
        }
        c((new StringBuilder()).append("longpress on ").append(ae1.c()).toString());
        c1 = null;
        if (!p.bh.d.g.equals(ae1.c()))
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (c)f.get(0);
_L4:
        if (c1 != null)
        {
            b(c1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (p.bh.d.h.equals(ae1.c()))
        {
            c1 = (c)f.get(1);
        } else
        if (p.bh.d.i.equals(ae1.c()))
        {
            c1 = (c)f.get(2);
        } else
        if (p.bh.d.j.equals(ae1.c()))
        {
            c1 = (c)f.get(3);
        } else
        if (p.bh.d.k.equals(ae1.c()))
        {
            c1 = (c)f.get(4);
        } else
        if (p.bh.d.l.equals(ae1.c()))
        {
            c1 = (c)f.get(5);
        } else
        if (p.bh.d.m.equals(ae1.c()))
        {
            c1 = (c)f.get(6);
        } else
        if (p.bh.d.n.equals(ae1.c()))
        {
            c1 = (c)f.get(7);
        } else
        if (p.bh.d.o.equals(ae1.c()))
        {
            c1 = (c)f.get(8);
        } else
        if (p.bh.d.f.equals(ae1.c()))
        {
            c1 = (c)f.get(9);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(af af1)
    {
        g((new StringBuilder()).append("onOnbuttonPress button pressMode:").append(af1.d()).append(" buttonName:").append(af1.c()).toString());
        if (!af1.c().equals(p.bh.d.p)) goto _L2; else goto _L1
_L1:
        c((new StringBuilder()).append("pressed customButtonName:").append(af1.e()).toString());
        if (af1.e().intValue() != 100) goto _L4; else goto _L3
_L3:
        Y();
_L6:
        return;
_L4:
        if (af1.e().intValue() == 101)
        {
            R();
            return;
        }
        if (af1.e().intValue() == 102)
        {
            Q();
            return;
        }
        if (af1.e().intValue() == 103)
        {
            S();
            return;
        }
        if (af1.e().intValue() == 104)
        {
            ad();
            return;
        }
        if (af1.e().intValue() == 105)
        {
            T();
            return;
        }
        if (af1.e().intValue() != 106) goto _L6; else goto _L5
_L5:
        U();
        return;
_L2:
        if (p.bh.d.a.equals(af1.c()))
        {
            if (x().o())
            {
                V();
                return;
            } else
            {
                W();
                return;
            }
        }
        if (!p.bh.e.a.equals(af1.d()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p.bh.d.b.equals(af1.c()))
        {
            R();
            return;
        }
        if (!p.bh.d.c.equals(af1.c())) goto _L6; else goto _L7
_L7:
        Q();
        return;
        if (!p.bh.e.b.equals(af1.d()) || !p.bh.d.c.equals(af1.c())) goto _L6; else goto _L8
_L8:
        P();
        return;
    }

    public void a(ag ag1)
    {
        g((new StringBuilder()).append("onOnCommand success=").append(ag1.c()).toString());
        ag1 = ag1.c();
        if (ag1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (ag1.intValue())
        {
        default:
            if (d.containsKey(ag1))
            {
                ag1 = (c)d.get(ag1);
                if (ag1 != null)
                {
                    b(ag1);
                    return;
                }
            }
            break;

        case 1: // '\001'
            P();
            return;

        case 2: // '\002'
            V();
            return;

        case 3: // '\003'
            e("You can say play, followed by the station name");
            return;

        case 4: // '\004'
            Q();
            return;

        case 5: // '\005'
            R();
            return;

        case 6: // '\006'
            X();
            return;

        case 7: // '\007'
            S();
            return;

        case 9: // '\t'
            T();
            return;

        case 10: // '\n'
            U();
            return;

        case 8: // '\b'
            Y();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(ai ai1)
    {
        super.a(ai1);
        if (x == p.bh.i.a)
        {
            ac();
            N();
        }
        if (!s)
        {
            z();
        }
        if (!t)
        {
            d();
        }
        if (B)
        {
            B = false;
            c("Sending Pandora icon resource to HU...");
            ai1 = new aw();
            ai1.a("transparent");
            ai1.a(h.c);
            ai1.a(Boolean.valueOf(true));
            c.a(ai1);
        }
    }

    public void a(aj aj1)
    {
    }

    public void a(ak ak1)
    {
    }

    public void a(ao ao)
    {
    }

    public void a(aq aq)
    {
    }

    public void a(au au1)
    {
        Log.d("FordSyncApi", (new StringBuilder()).append("FORD_DBG onPerformInteractionResponse > choiceID = ").append(au1.i()).toString());
        Log.d("FordSyncApi", (new StringBuilder()).append("FORD_DBG onPerformInteractionResponse > response: success: ").append(au1.d()).append(" result: ").append(au1.e()).toString());
        au1 = au1.i();
        if (au1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (au1.intValue() != 400)
        {
            break; /* Loop/switch isn't completed */
        }
        b(201);
_L4:
        au1 = (c)e.get(au1);
        if (au1 != null)
        {
            b(au1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (au1.intValue() == 401)
        {
            b(200);
        } else
        if (au1.intValue() == 402)
        {
            b(202);
        } else
        if (au1.intValue() == 403)
        {
            b(201);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(p.bg.b b1)
    {
        a(new Integer(b1.c().intValue()));
    }

    public void a(be be)
    {
    }

    public void a(bh bh1)
    {
        a(new Integer(bh1.c().intValue()));
    }

    public void a(bl bl1)
    {
        bl1 = new Integer(bl1.c().intValue());
        c((new StringBuilder()).append("id = ").append(bl1).toString());
        a(((Integer) (bl1)));
    }

    public void a(bq bq1)
    {
        g((new StringBuilder()).append("onSpeakResponse success=").append(bq1.d()).toString());
        if (g != null)
        {
            if (!bq1.d().booleanValue())
            {
                g.b();
            } else
            {
                g.e();
            }
        }
        a(new Integer(bq1.c().intValue()));
    }

    public void a(bx bx)
    {
    }

    public void a(p.bg.d d1)
    {
        a(new Integer(d1.c().intValue()));
    }

    public void a(p.bg.l l1)
    {
        boolean flag = l1.d().booleanValue();
        if (l1.e() == s.a)
        {
            if (flag);
        }
    }

    public void a(p.bh.d d1)
    {
        if (c == null)
        {
            return;
        } else
        {
            bs bs1 = new bs();
            bs1.a(d1);
            c.a(bs1);
            return;
        }
    }

    public void a(c c1)
    {
        int i1 = a;
        a = i1 + 1;
        Object obj = c1.b().trim();
        String s1 = ((String) (obj));
        if (((String) (obj)).toLowerCase(Locale.US).endsWith(" radio"))
        {
            s1 = ((String) (obj)).substring(0, c1.b().length() - 6);
        }
        obj = new p.bg.a();
        ((p.bg.a) (obj)).b(Integer.valueOf(i1));
        Vector vector = new Vector();
        vector.add((new StringBuilder()).append("Play Station ").append(s1).toString());
        vector.add((new StringBuilder()).append("Play ").append(s1).toString());
        ((p.bg.a) (obj)).a(vector);
        c.a(((p.bd.e) (obj)), true);
        d.put(new Integer(i1), c1);
    }

    public void a(d d1)
    {
        if (c != null && ah() != null && ah().f() != null)
        {
            p.bg.n n1 = new p.bg.n();
            n1.a(ah().f().substring(0, 5));
            c((new StringBuilder()).append("Deleting album art named ").append(ah().f()).toString());
            c.a(n1);
        }
        y = d1;
    }

    protected void a(m m1)
    {
        b = m1;
    }

    public void a(boolean flag)
    {
        if (c == null || ah() == null)
        {
            return;
        }
        bi bi1 = new bi();
        br br1 = new br();
        br1.a(Integer.valueOf(0));
        br1.b(Integer.valueOf((int)Math.floor(i / 60)));
        br1.c(Integer.valueOf(i % 60));
        bi1.a(br1);
        Object obj;
        if (flag)
        {
            obj = aa.c;
        } else
        {
            obj = aa.a;
        }
        bi1.a(((aa) (obj)));
        if (j > 0)
        {
            c((new StringBuilder()).append("elapsedtime when progress bar is being set = ").append(i).toString());
            obj = new br();
            ((br) (obj)).a(new Integer(0));
            ((br) (obj)).b(new Integer((int)Math.floor(j / 60)));
            ((br) (obj)).c(new Integer(j % 60));
            bi1.b(((br) (obj)));
        }
        c((new StringBuilder()).append("showMediaClockTimer paused=").append(flag).append(" elapsed=").append(br1.a()).append(":").append(br1.b()).append(" mode=").append(bi1.d()).toString());
        c.a(bi1);
    }

    public byte[] a(Bitmap bitmap)
    {
        if (n == null);
        c((new StringBuilder()).append("HU maxWidth=").append(200).toString());
        c((new StringBuilder()).append("HU maxHeight=").append(200).toString());
        float f1;
        ByteArrayOutputStream bytearrayoutputstream;
        if (200 / bitmap.getWidth() > 200 / bitmap.getHeight())
        {
            f1 = (float)200 / (float)bitmap.getWidth();
        } else
        {
            f1 = (float)200 / (float)bitmap.getHeight();
        }
        c((new StringBuilder()).append("album art width=").append(bitmap.getWidth()).toString());
        c((new StringBuilder()).append("album art height=").append(bitmap.getHeight()).toString());
        c((new StringBuilder()).append("album art scale=").append(f1).toString());
        bytearrayoutputstream = new ByteArrayOutputStream();
        Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f1), (int)(f1 * (float)bitmap.getHeight()), true).compress(android.graphics.Bitmap.CompressFormat.PNG, 10, bytearrayoutputstream);
        bitmap = new byte[bytearrayoutputstream.toByteArray().length];
        return bytearrayoutputstream.toByteArray();
    }

    public void aa()
    {
        ab();
        ac();
    }

    public void ab()
    {
        if (!G() || !v)
        {
            return;
        } else
        {
            p p1 = new p();
            p1.b(Integer.valueOf(200));
            c.a(p1);
            p1 = new p();
            p1.b(Integer.valueOf(201));
            c.a(p1);
            p1 = new p();
            p1.b(Integer.valueOf(202));
            c.a(p1);
            e.clear();
            v = false;
            return;
        }
    }

    public void ac()
    {
        if (G() && !v)
        {
            Log.d("AppLink", "prepareSavedStationList");
            Vector vector = q();
            if (vector.size() >= 2)
            {
                if (vector.size() <= 40)
                {
                    a(Integer.valueOf(200), a(vector, 0, vector.size(), false, false, 200));
                } else
                {
                    a(Integer.valueOf(200), a(vector, 0, 39, false, true, 200));
                    if (vector.size() > 78)
                    {
                        a(Integer.valueOf(201), a(vector, 39, 77, true, true, 201));
                        a(Integer.valueOf(202), a(vector, 77, vector.size(), true, false, 202));
                    } else
                    {
                        a(Integer.valueOf(201), a(vector, 39, vector.size(), true, false, 201));
                    }
                }
                v = true;
                return;
            }
        }
    }

    public void ad()
    {
        c("actionCreateStationFromUnknown");
        if (c == null)
        {
            return;
        } else
        {
            p.bg.e e1 = new p.bg.e();
            Vector vector = new Vector();
            bn bn1 = new bn();
            bn1.a(Integer.valueOf(105));
            bn1.a("Artist");
            bn1.a(t.a);
            vector.add(bn1);
            bn1 = new bn();
            bn1.a(Integer.valueOf(106));
            bn1.a("Track");
            bn1.a(t.a);
            vector.add(bn1);
            bn1 = new bn();
            bn1.a(Integer.valueOf(107));
            bn1.a("Close");
            bn1.a(t.a);
            vector.add(bn1);
            e1.b(vector);
            e1.a(Boolean.valueOf(false));
            e1.a("Create station from...");
            e1.b(new Integer(4000));
            c.a(e1);
            return;
        }
    }

    public void ae()
    {
    }

    public void af()
    {
        if (c == null)
        {
            return;
        } else
        {
            c.a(new bz());
            return;
        }
    }

    public void ag()
    {
        if (c != null)
        {
            a("Pandora Loading...", "", true);
        }
    }

    public d ah()
    {
        return y;
    }

    public c ai()
    {
        return z;
    }

    public void aj()
    {
        if (ah() != null)
        {
            a(ai().b(), "Paused", false);
        }
        a(true);
    }

    public bv ak()
    {
        if (c != null)
        {
            return c.d();
        } else
        {
            return null;
        }
    }

    public cd al()
    {
        if (c != null)
        {
            return c.f();
        } else
        {
            return null;
        }
    }

    public void b()
    {
        g("onPauseAudio");
        x().a(null);
    }

    public void b(int i1)
    {
        w = i1;
        p.df.a.a("FordSyncApi", (new StringBuilder()).append("FORD_DBG showStationsChoiceSet page: ").append(i1).toString());
        at at1 = new at();
        at1.a("Pandora Stations");
        at1.a(p.bh.l.a);
        at1.a(o.c);
        Vector vector = new Vector();
        vector.add(Integer.valueOf(i1));
        at1.a(vector);
        at1.b(Integer.valueOf(10000));
        c.a(at1, new p.cv.c() {

            final p.ct.c a;

            public void a(p.bd.g g1)
            {
                p.df.a.a("FordSyncApi", (new StringBuilder()).append("FORD_DBG showStationsChoiceSetResponse: success: ").append(g1.d()).append(" result: ").append(g1.e()).toString());
            }

            
            {
                a = p.ct.c.this;
                super();
            }
        });
    }

    protected void b(c c1)
    {
        if (c1 == null)
        {
            return;
        }
        c((new StringBuilder()).append("change station: ").append(c1.b()).toString());
        if (ai() != null && ai().a().equals(c1.a()))
        {
            a(((String) (null)), ai().b(), "Currently Playing");
        } else
        {
            a(((String) (null)), "Loading Station", c1.b());
            a("Loading...", c1.b(), true);
        }
        x().b(c1.a());
    }

    public void c()
    {
        g("onResumeAudio");
        if (!r)
        {
            x().a(null);
        }
    }

    public void c(c c1)
    {
        z = c1;
    }

    protected void d(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "Unknown Error";
            a("Pandora is unable to play music at this time because of an unkown error.", "Unknown Error");
        }
        a("Unable to Play", s2, true, true);
    }

    protected void e()
    {
label0:
        {
            g("updateDisplayWithCurrentTrack");
            if (c != null)
            {
                if (!f())
                {
                    break label0;
                }
                c("updateDisplayWithCurrentTrack > isInitializing() > showText");
                a("Buffering...", ((String) (null)), false);
            }
            return;
        }
        if (!g())
        {
            c("showing Login Required");
            c("updateDisplayWithCurrentTrack > !userLoggedIn() > showText");
            B();
            return;
        }
        if (!h())
        {
            c("updateDisplayWithCurrentTrack > !hasStations() > showText");
            C();
            return;
        }
        if (ah() == null)
        {
            c("showing Pandora/Station buffering...");
            if (ai() == null)
            {
                c("updateDisplayWithCurrentTrack > getCurrentStation() == null > showText");
                a("Buffering...", ((String) (null)), false);
                return;
            } else
            {
                c("updateDisplayWithCurrentTrack > getCurrentStation() != null > showText");
                a(ai().b(), "Buffering...", true, false);
                return;
            }
        }
        (new Handler(com.pandora.android.provider.b.a.b().s().getMainLooper())).post(new Runnable() {

            final p.ct.c a;

            public void run()
            {
                p.ct.c.c(a);
            }

            
            {
                a = p.ct.c.this;
                super();
            }
        });
        c((new StringBuilder()).append("pandoralinkstatus=").append(x().V()).toString());
        c((new StringBuilder()).append("showing SO: ").append(ah().c()).append("AR: ").append(ah().d()).toString());
        c("updateDisplayWithCurrentTrack > else... > showText");
        if (r)
        {
            a(ai().b(), "Paused", false);
        } else
        if (ah().h())
        {
            a("Advertisement", "", "", ai().b(), true);
        } else
        if (y().equals("SYNC0003"))
        {
            a((new StringBuilder()).append("").append(ah().c()).toString(), (new StringBuilder()).append("by: ").append(ah().d()).toString(), (new StringBuilder()).append("on: ").append(ah().e()).toString(), ai().b(), true);
        } else
        {
            a((new StringBuilder()).append("").append(ah().c()).toString(), (new StringBuilder()).append("by: ").append(ah().d()).toString(), true);
        }
        a(false);
    }

    public void e(String s1)
    {
        if (c == null)
        {
            return;
        } else
        {
            bp bp1 = new bp();
            Vector vector = new Vector();
            by by1 = new by();
            by1.a(s1);
            by1.a(u.a);
            vector.add(by1);
            bp1.a(vector);
            c.a(bp1);
            return;
        }
    }

    public void f(String s1)
    {
        if (c != null && d != null)
        {
            Vector vector = q();
            int j1 = vector.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                c c1 = (c)vector.elementAt(i1);
                if (c1.a().equals(s1))
                {
                    a(c1);
                    return;
                }
                i1++;
            }
        }
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public void i()
    {
        if (c != null)
        {
            p.df.a.c("AppLink", "Resetting state");
            c.a(this);
            x = p.bh.i.d;
            l = false;
            s = false;
            t = false;
            u = false;
            v = false;
            o = false;
            p = true;
            b();
            h = null;
            i = 0;
            k = false;
            r = false;
            if (d != null)
            {
                d.clear();
            }
            if (f != null)
            {
                f.removeAllElements();
            }
            v = false;
            A.clear();
            d.clear();
            e.clear();
            a = 11;
            c.a();
            c = null;
        }
    }

    public void l()
    {
        boolean flag = false;
        c("FordSync Connected");
        if (p.ct.a.a() != null)
        {
            n = c.c();
            if (n != null)
            {
                int i1;
                if (n.b() == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = n.b().intValue();
                }
                q = i1;
                if (q > 0)
                {
                    flag = true;
                }
                o = flag;
                p = o;
                c((new StringBuilder()).append("Count of available custom presets: ").append(q).toString());
            }
        }
        x().a(new bw(true));
    }

    public void o()
    {
        g("onLostConnection");
        i();
    }

    public abstract Vector p();

    public abstract Vector q();

    protected m x()
    {
        return b;
    }

    protected String y()
    {
        bv bv1 = ak();
        if (bv1 != null)
        {
            c((new StringBuilder()).append("AppLinkCore Version = ").append(bv1.a()).toString());
            if (bv1.a().intValue() > 2)
            {
                return "SYNC0003";
            }
            if (bv1.a().intValue() > 1)
            {
                return "SYNC0002";
            }
        }
        return "SYNC0001";
    }

    protected void z()
    {
        if (c != null && c.b())
        {
            Log.d("AppLink", "Preparing app icon...");
            if (!A.contains("ai_v1"))
            {
                aw aw1 = new aw();
                aw1.a("ai_v1");
                aw1.a(h.c);
                aw1.a(Boolean.valueOf(true));
                Bitmap bitmap = BitmapFactory.decodeResource(com.pandora.android.provider.b.a.h().getResources(), 0x7f0201ee);
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
                byte abyte0[] = new byte[bytearrayoutputstream.toByteArray().length];
                aw1.a(bytearrayoutputstream.toByteArray());
                c.b(aw1, new p.cv.c() {

                    final p.ct.c a;

                    public void a(p.bd.g g1)
                    {
                        if (g1.d().booleanValue())
                        {
                            p.ct.c.a(a, "ai_v1");
                            p.ct.c.a(a);
                            p.ct.c.b(a);
                        }
                    }

            
            {
                a = p.ct.c.this;
                super();
            }
                });
            }
            if (!A.contains("bi_v1"))
            {
                aw aw2 = new aw();
                aw2.a("bi_v1");
                aw2.a(h.c);
                aw2.a(Boolean.valueOf(true));
                Bitmap bitmap1 = BitmapFactory.decodeResource(com.pandora.android.provider.b.a.h().getResources(), 0x7f02012a);
                ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
                bitmap1.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream1);
                byte abyte1[] = new byte[bytearrayoutputstream1.toByteArray().length];
                aw2.a(bytearrayoutputstream1.toByteArray());
                c.b(aw2, new p.cv.c() {

                    final p.ct.c a;

                    public void a(p.bd.g g1)
                    {
                        if (g1.d().booleanValue())
                        {
                            p.ct.c.a(a, "bi_v1");
                            p.ct.c.b(a);
                        }
                    }

            
            {
                a = p.ct.c.this;
                super();
            }
                });
            }
            if (!A.contains("bi_v2"))
            {
                aw aw3 = new aw();
                aw3.a("bi_v2");
                aw3.a(h.c);
                aw3.a(Boolean.valueOf(true));
                Bitmap bitmap2 = BitmapFactory.decodeResource(com.pandora.android.provider.b.a.h().getResources(), 0x7f02012b);
                ByteArrayOutputStream bytearrayoutputstream2 = new ByteArrayOutputStream();
                bitmap2.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream2);
                byte abyte2[] = new byte[bytearrayoutputstream2.toByteArray().length];
                aw3.a(bytearrayoutputstream2.toByteArray());
                c.b(aw3, new p.cv.c() {

                    final p.ct.c a;

                    public void a(p.bd.g g1)
                    {
                        if (g1.d().booleanValue())
                        {
                            p.ct.c.a(a, "bi_v2");
                            p.ct.c.b(a);
                        }
                    }

            
            {
                a = p.ct.c.this;
                super();
            }
                });
                return;
            }
        }
    }

}
