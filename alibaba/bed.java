// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class bed
{

    private static final bed a;
    private final int b;
    private final long c;
    private final LinkedList d = new LinkedList();
    private final ExecutorService e;
    private final Callable f = new Callable() {

        final bed a;

        public Void a()
            throws Exception
        {
            Object obj1;
            int j;
            obj1 = new ArrayList(2);
            j = 0;
            Object obj = a;
            obj;
            JVM INSTR monitorenter ;
            ListIterator listiterator = bed.a(a).listIterator(bed.a(a).size());
_L5:
            if (!listiterator.hasPrevious()) goto _L2; else goto _L1
_L1:
            bec bec1 = (bec)listiterator.previous();
            if (bec1.c() || bec1.g() && !bec1.a(bed.b(a))) goto _L4; else goto _L3
_L3:
            bdz.a("SPDU_ConnectionPool", (new StringBuilder()).append("[connectionCleanupCallable] - isTryingConnect? isAlive? isExpired?  : ").append(bec1.c()).append(" ").append(bec1.g()).append(" ").append(bec1.a(bed.b(a))).toString());
            listiterator.remove();
            ((List) (obj1)).add(bec1);
            if (((List) (obj1)).size() != 2) goto _L5; else goto _L2
_L2:
            listiterator = bed.a(a).listIterator(bed.a(a).size());
_L6:
            do
            {
                if (!listiterator.hasPrevious() || j <= bed.c(a))
                {
                    break MISSING_BLOCK_LABEL_327;
                }
                bec1 = (bec)listiterator.previous();
            } while (!bec1.j());
            bdz.a("SPDU_ConnectionPool", (new StringBuilder()).append("[connectionCleanupCallable] - size exceed maxIdleNum, size: ").append(bed.a(a).size()).append(" max: ").append(bed.c(a)).toString());
            ((List) (obj1)).add(bec1);
            listiterator.remove();
            j--;
              goto _L6
_L4:
            if (!bec1.j()) goto _L5; else goto _L7
_L7:
            j++;
              goto _L5
            obj;
            JVM INSTR monitorexit ;
            for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); bey.a(((java.io.Closeable) (obj1))))
            {
                obj1 = (bec)((Iterator) (obj)).next();
                bdq.a.a(new bdw(this, ((bec) (obj1)).e().c(), ((bec) (obj1)).p()));
            }

            break MISSING_BLOCK_LABEL_392;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            return null;
        }

        public Object call()
            throws Exception
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

            
            {
                a = bed.this;
                super();
            }
    };

    public bed(int i, long l)
    {
        e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), bey.b("OkHttp ConnectionPool"));
        b = i;
        c = l * 1000L * 1000L;
    }

    public static bed a()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static LinkedList a(bed bed1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static long b(bed bed1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static int c(bed bed1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public bec a(beb beb1, bfp bfp1, String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        long l = bdz.b();
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        ListIterator listiterator = d.listIterator(d.size());
_L7:
        if (!listiterator.hasPrevious()) goto _L2; else goto _L1
_L1:
        bec bec1 = (bec)listiterator.previous();
        SocketException socketexception;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (!bec1.e().a().equals(beb1))
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        flag2 = flag;
        flag3 = flag1;
        if (flag4) goto _L4; else goto _L3
_L3:
        if (!bec1.c() && !bec1.g())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag;
        flag3 = flag1;
        if (flag1) goto _L4; else goto _L5
_L5:
        if (System.nanoTime() - bec1.k() >= c && !bec1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L6
_L4:
        bdz.a("SPDU_ConnectionPool", (new StringBuilder()).append("[reserve] - cannot reuse, AddressDiff: ").append(flag4).append(" NotAlive: ").append(flag3).append(" IdleTimeTooLong: ").append(flag2).toString());
        flag1 = flag3;
        flag = flag2;
          goto _L7
_L14:
        listiterator.remove();
        flag2 = beb1.c().e();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        bew.a().a(bec1.f());
        bec1.o();
        bdq.a.a(new bdt(this, true, bec1.f(), bec1.e()));
        bdz.a("SPDU_ConnectionPool", "[reserve] - found a recycled connection !");
_L12:
        if (bec1 == null) goto _L9; else goto _L8
_L8:
        bfp1 = bec1;
        if (!beb1.c().e())
        {
            break MISSING_BLOCK_LABEL_300;
        }
        d.addFirst(bec1);
        bfp1 = bec1;
_L11:
        e.submit(f);
        bdz.a("SPDU_ConnectionPool", "[reserve] - cost: ", l);
        this;
        JVM INSTR monitorexit ;
        return bfp1;
        socketexception;
        bey.a(bec1);
        bdz.a("SPDU_ConnectionPool", "[reserve] -  unable to tagSocket");
          goto _L7
        beb1;
        throw beb1;
_L9:
        s = bfp1.b(s);
        s.a(true);
        bfp1 = s;
        if (!beb1.c().e()) goto _L11; else goto _L10
_L10:
        d.addFirst(s);
        bfp1 = s;
          goto _L11
_L2:
        bec1 = null;
          goto _L12
_L6:
        if (!flag) goto _L14; else goto _L13
_L13:
        flag2 = flag;
        flag3 = flag1;
          goto _L4
    }

    public void a(bec bec1)
    {
        bdz.a("SPDU_ConnectionPool", "[ConnectionPool.recycle]");
        if (bec1.l())
        {
            return;
        }
        bdz.b("SPDU_ConnectionPool", "[recycle] - Connection is under http mode");
        if (!bec1.g())
        {
            bey.a(bec1);
            return;
        }
        try
        {
            bew.a().b(bec1.f());
        }
        catch (SocketException socketexception)
        {
            bew.a().a((new StringBuilder()).append("Unable to untagSocket(): ").append(socketexception).toString());
            bey.a(bec1);
            return;
        }
        this;
        JVM INSTR monitorenter ;
        d.addFirst(bec1);
        bec1.i();
        this;
        JVM INSTR monitorexit ;
        e.submit(f);
        return;
        bec1;
        this;
        JVM INSTR monitorexit ;
        throw bec1;
    }

    public void b()
    {
        bdz.a("SPDU_ConnectionPool", "[evictAll] - ");
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList(d);
        d.clear();
        this;
        JVM INSTR monitorexit ;
        bec bec1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); bey.a(bec1))
        {
            bec1 = (bec)((Iterator) (obj)).next();
            bdq.a.a(new bdw(this, bec1.e().c(), bec1.p()));
        }

        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        String s = System.getProperty("http.keepAliveDuration");
        String s1 = System.getProperty("http.maxConnections");
        long l;
        if (s != null)
        {
            l = Long.parseLong(s);
        } else
        {
            l = 0x493e0L;
        }
        if (s1 != null)
        {
            a = new bed(Integer.parseInt(s1), l);
            bdz.a("SPDU_ConnectionPool", (new StringBuilder()).append("systemDefault = new ConnectionPool(").append(String.valueOf(Integer.parseInt(s1))).append(", ").append(String.valueOf(l)).append("ms);").toString());
        } else
        {
            a = new bed(5, l);
            bdz.a("SPDU_ConnectionPool", (new StringBuilder()).append("systemDefault = new ConnectionPool(5, ").append(String.valueOf(l)).append("ms);").toString());
        }
    }
}
