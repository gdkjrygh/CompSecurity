// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cz;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import p.al.f;
import p.an.k;
import p.cx.c;
import p.dn.bc;
import p.l.b;
import p.l.d;
import p.l.g;
import p.l.j;

public class p.cz.a extends Thread
{
    private static class a
    {

        public final int a;
        public final int b;
        public int c;
        public String d;
        public p.l.a e;

        public String toString()
        {
            return (new StringBuilder()).append("GenreStationArt: categoryIndex=").append(a).append(", stationIndex=").append(b).append(", dataLength=").append(c).append(", artUrl=").append(d).toString();
        }

        public a(int k, int l, int i1, String s, p.l.a a1)
        {
            a = k;
            b = l;
            c = i1;
            d = s;
            e = a1;
        }
    }

    private class b
        implements f
    {

        final p.cz.a a;
        private final String b;

        public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
        {
            return a(exception, (String)obj, k, flag);
        }

        public boolean a(Exception exception, String s, k k, boolean flag)
        {
            p.cz.a.a((new StringBuilder()).append("Failed to get genre station art for stationToken=").append(b).toString(), exception);
            return false;
        }

        public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
        {
            return a((byte[])obj, (String)obj1, k, flag, flag1);
        }

        public boolean a(byte abyte0[], String s, k k, boolean flag, boolean flag1)
        {
            p.cz.a.a((new StringBuilder()).append("Got station art for statinToken=").append(b).append(", placing in ready queue to send segments. ").append("(dataLength=").append(abyte0.length).append(")").toString());
            s = (a)a.g.get(b);
            ((a) (s)).e.a(null);
            s.c = abyte0.length;
            a.a(s);
            return false;
        }

        public b(String s)
        {
            a = p.cz.a.this;
            super();
            b = s;
        }
    }


    protected static int h;
    private static Object i = new Object();
    private static volatile p.cz.a j;
    protected c a;
    protected p.cw.c b;
    protected boolean c;
    protected Object d;
    protected Vector e;
    protected Thread f;
    protected HashMap g;

    private p.cz.a(p.cw.c c1)
    {
        c = false;
        d = new Object();
        b = c1;
        a = p.cx.c.a();
        e = new Vector();
        g = new HashMap();
        c1.b(this);
    }

    public static void a()
    {
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            public void run()
            {
                p.cz.a.a(false);
            }

        });
    }

    public static void a(int k, int l, int i1, int j1)
    {
        a((new StringBuilder()).append("requestGenreStationArt instance=").append(j).toString());
        synchronized (i)
        {
            if (j != null)
            {
                a("calling stopWorker()");
                a(true);
            }
            a("instantiating a new worker");
            j = new p.cz.a(p.cw.c.z);
            a("launching genre data load ");
            h = j1;
            j.a(k, l, i1);
            a("launching startWorker");
            j.start();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(String s)
    {
        p.df.a.a("PandoraLink", (new StringBuilder()).append("[ReturnGenreStationArtWorker] ").append(s).toString());
    }

    public static void a(String s, Throwable throwable)
    {
        p.df.a.a("PandoraLink", (new StringBuilder()).append("[ReturnGenreStationArtWorker] ").append(s).toString(), throwable);
    }

    static void a(p.cz.a a1)
    {
        a1.f();
    }

    public static void a(boolean flag)
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        a("stop worker thread");
        j.e();
        if (j.a != null && j.a.bp != null)
        {
            j.a.bp.a(p/dn/bc);
        }
        p.cw.c.z.c(j);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        p.cz.a a1 = j;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Exception exception;
        try
        {
            a("wait for the worker thread to complete");
            j.join(1000L);
        }
        catch (Exception exception1) { }
        j.f = null;
        j.a = null;
        j = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
        p.l.a a2;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); a2.a(p.an.g.a(a.bu, a.bu)))
        {
            String s = (String)iterator.next();
            a a1 = (a)g.get(s);
            a((new StringBuilder()).append("Fetching station art for stationId=").append(a1.b).toString());
            a2 = p.l.g.b(b.s()).a(a1.d).h().g().a().a(com.pandora.radio.art.b.a(a.bs)).a(true).a(p.s.b.a);
            a1.e = a2;
            a2.a(new b(s));
        }

    }

    private boolean g()
        throws InterruptedException
    {
        do
        {
            if (a == null || a.bp == null)
            {
                return false;
            }
            if (a.bp.f())
            {
                return true;
            }
            Thread.sleep(300L);
        } while (!d());
        return false;
    }

    public void a(int k, int l, int i1)
    {
        f = new Thread((new StringBuilder()).append(super.getName()).append("$loadGenreData").toString(), k, l, i1) {

            final int a;
            final int b;
            final int c;
            final p.cz.a d;

            public void run()
            {
                p.cz.a.a("loadGenreData thread");
                Object obj = d.a.f();
                p.cz.a.a((new StringBuilder()).append("genreList size:").append(((List) (obj)).size()).toString());
                if (a > ((List) (obj)).size())
                {
                    p.cz.a.a((new StringBuilder()).append("loadGenreData categoryIndex out of range ").append(a).toString());
                    p.cz.a.a();
                    return;
                }
                obj = ((com.pandora.radio.data.j)((List) (obj)).get(a)).d();
                p.cz.a.a((new StringBuilder()).append("category stations size=").append(((ArrayList) (obj)).size()).toString());
                if (b >= ((ArrayList) (obj)).size())
                {
                    p.cz.a.a((new StringBuilder()).append("loadGenreData stationIndex out of range ").append(b).toString());
                    p.cz.a.a();
                    return;
                }
                int k1 = Math.min(((ArrayList) (obj)).size() - b, c);
                p.cz.a.a((new StringBuilder()).append("returning count=").append(k1).toString());
                p.cz.a.a("populate requestList");
                int l1 = b;
                for (int j1 = b; j1 < k1 + l1; j1++)
                {
                    com.pandora.radio.data.j.a a1 = (com.pandora.radio.data.j.a)((ArrayList) (obj)).get(j1);
                    String s = a1.d();
                    d.g.put(a1.c(), new a(a, j1, 0, s, null));
                }

                (new Handler(d.b.s().getMainLooper())).post(new Runnable(this) {

                    final _cls2 a;

                    public void run()
                    {
                        p.cz.a.a(a.d);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                d = p.cz.a.this;
                a = k;
                b = l;
                c = i1;
                super(s);
            }
        };
        f.start();
    }

    protected void a(a a1)
    {
label0:
        {
            synchronized (d)
            {
                if (e != null)
                {
                    break label0;
                }
            }
            return;
        }
        a((new StringBuilder()).append("queueArt ").append(a1).toString());
        e.addElement(a1);
        d.notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    protected a b()
        throws InterruptedException
    {
label0:
        {
            synchronized (d)
            {
                if (e != null && !d())
                {
                    break label0;
                }
            }
            return null;
        }
        if (e.isEmpty())
        {
            d.wait();
        }
        if (!d())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a a1;
        a("getNextGenreStationArt");
        a1 = (a)e.firstElement();
        e.removeElementAt(0);
        a((new StringBuilder()).append("worker processing art ").append(a1).toString());
        obj;
        JVM INSTR monitorexit ;
        return a1;
    }

    public void c()
    {
        synchronized (d)
        {
            if (e != null)
            {
                e.removeAllElements();
                e = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public boolean d()
    {
        boolean flag;
        synchronized (d)
        {
            flag = c;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
    {
        synchronized (d)
        {
            a("cancelWork");
            c = true;
            j.interrupt();
            d.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        int k;
        a("start worker thread");
        k = 0;
_L2:
        boolean flag = d();
        if (flag)
        {
            c();
            a("THREAD STOPPED");
            return;
        }
        if (g == null || g.size() <= 0 || k < g.size())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        a((new StringBuilder()).append("worker requestList=").append(g).append(" counter=").append(k).toString());
        c();
        a("THREAD STOPPED");
        return;
        a a1 = b();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!g()) goto _L2; else goto _L3
_L3:
        a("worker returnGenreStationArt");
        byte abyte0[] = (byte[])(byte[])a1.e.c(a.bu, a.bu).get();
        a.a(a1.a, a1.b, abyte0, h);
        k++;
          goto _L2
        Object obj;
        obj;
        a("main thread interrupted!");
        c();
        a("THREAD STOPPED");
        return;
        obj;
        a((new StringBuilder()).append("worker EXCEPTION ").append(((Exception) (obj)).getMessage()).toString());
        ((Exception) (obj)).printStackTrace();
        c();
        a("THREAD STOPPED");
        return;
        obj;
        c();
        a("THREAD STOPPED");
        throw obj;
    }

}
