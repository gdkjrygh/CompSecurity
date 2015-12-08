// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.fitbit.util.al;
import com.fitbit.util.bn;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.fitbit.util.format:
//            AlarmTimeFormat

public final class d
{

    static final Object A = new Object();
    static final Object B = new Object();
    static final Object C = new Object();
    static final Object D = new Object();
    static final Object E = new Object();
    static final Object F = new Object();
    static final Object G = new Object();
    static final Object H = new Object();
    static final Object I = new Object();
    static final Object J = new Object();
    static final Object K = new Object();
    static DateFormat L;
    static final Object M = new Object();
    static final Object N = new Object();
    static final Object O = new Object();
    static final Object P = new Object();
    static final Object Q = new Object();
    static final Object R = new Object();
    static final Object S = new Object();
    static final Object T = new Object();
    static final Object U = new Object();
    static final Object V = new Object();
    static final Object W = new Object();
    private static final ReadWriteLock X = new ReentrantReadWriteLock();
    private static DecimalFormat Y;
    private static DateFormat Z;
    static final DecimalFormat a = new DecimalFormat("00");
    private static DateFormat aA;
    private static DateFormat aB;
    private static DateFormat aC;
    private static DateFormat aD;
    private static DateFormat aE;
    private static DateFormat aF;
    private static DateFormat aG;
    private static DateFormat aa;
    private static DateFormat ab;
    private static DateFormat ac;
    private static DateFormat ad;
    private static DateFormat ae;
    private static DateFormat af;
    private static DateFormat ag;
    private static DateFormat ah;
    private static DateFormat ai;
    private static DateFormat aj;
    private static DateFormat ak;
    private static DateFormat al;
    private static DateFormat am;
    private static DateFormat an;
    private static DateFormat ao;
    private static DateFormat ap;
    private static NumberFormat aq;
    private static DateFormat ar;
    private static DateFormat as;
    private static DateFormat at;
    private static DateFormat au;
    private static DateFormat av;
    private static DateFormat aw;
    private static DateFormat ax;
    private static DateFormat ay;
    private static DateFormat az;
    static final DecimalFormat b = new DecimalFormat("##");
    static final SimpleDateFormat c;
    static final SimpleDateFormat d;
    static final SimpleDateFormat e;
    static final SimpleDateFormat f;
    static final SimpleDateFormat g;
    static final SimpleDateFormat h;
    static final SimpleDateFormat i;
    static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd");
    static final SimpleDateFormat k;
    static final SimpleDateFormat l;
    static final SimpleDateFormat m = new SimpleDateFormat("h");
    static final SimpleDateFormat n = new SimpleDateFormat("H");
    static final SimpleDateFormat o = new SimpleDateFormat("dd/mm/yyyy");
    static final AlarmTimeFormat p = new AlarmTimeFormat();
    static final Object q = new Object();
    static final Object r = new Object();
    static final Object s = new Object();
    static final Object t = new Object();
    static final Object u = new Object();
    static final Object v = new Object();
    static final Object w = new Object();
    static final Object x = new Object();
    static final Object y = new Object();
    static final Object z = new Object();

    public d()
    {
    }

    static DateFormat A(Context context)
    {
        j();
        if (aF == null)
        {
            aF = new SimpleDateFormat(context.getString(0x7f0804cd), com.fitbit.util.al.a());
            aF.setTimeZone(bn.a());
        }
        return aF;
    }

    static DateFormat B(Context context)
    {
        j();
        if (aG == null)
        {
            aG = new SimpleDateFormat(context.getString(0x7f0804ce), com.fitbit.util.al.a());
            aG.setTimeZone(bn.a());
        }
        return aG;
    }

    static DateFormat a(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (r)
        {
            if (Z == null)
            {
                Z = new SimpleDateFormat(context.getString(0x7f0803bf), com.fitbit.util.al.a());
            }
        }
        context = Z;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DecimalFormat a()
    {
        j();
        X.readLock().lock();
        synchronized (q)
        {
            if (Y == null)
            {
                Y = (new FormatCollection._cls1()).a();
            }
        }
        obj = Y;
        X.readLock().unlock();
        return ((DecimalFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat b()
    {
        j();
        X.readLock().lock();
        Object obj = y;
        obj;
        JVM INSTR monitorenter ;
        if (ag == null)
        {
            Locale locale = com.fitbit.util.al.a();
            if (!locale.getLanguage().equals(Locale.JAPANESE.getLanguage()))
            {
                break MISSING_BLOCK_LABEL_83;
            }
            ag = new SimpleDateFormat("h:mm:ss a", locale);
        }
_L1:
        obj = ag;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        ag = new SimpleDateFormat("h:mm:ss a", Locale.US);
          goto _L1
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat b(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (s)
        {
            if (aa == null)
            {
                aa = new SimpleDateFormat(context.getString(0x7f0805db), com.fitbit.util.al.a());
            }
        }
        context = aa;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat c()
    {
        j();
        X.readLock().lock();
        synchronized (z)
        {
            if (ah == null)
            {
                ah = new SimpleDateFormat("EE", com.fitbit.util.al.a());
            }
        }
        obj = ah;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat c(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (t)
        {
            if (ab == null)
            {
                ab = new SimpleDateFormat(context.getString(0x7f0805e2), com.fitbit.util.al.a());
            }
        }
        context = ab;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat d()
    {
        j();
        X.readLock().lock();
        synchronized (A)
        {
            if (ai == null)
            {
                ai = new SimpleDateFormat("EEEE", com.fitbit.util.al.a());
            }
        }
        obj = ai;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat d(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (u)
        {
            if (ac == null)
            {
                ac = android.text.format.DateFormat.getTimeFormat(context);
            }
        }
        context = ac;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat e()
    {
        j();
        X.readLock().lock();
        synchronized (B)
        {
            if (aj == null)
            {
                aj = new SimpleDateFormat("E", com.fitbit.util.al.a());
            }
        }
        obj = aj;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat e(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (v)
        {
            if (ad == null)
            {
                Locale locale = com.fitbit.util.al.a();
                ad = new SimpleDateFormat(context.getResources().getString(0x7f0805c7), locale);
            }
        }
        context = ad;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat f()
    {
        j();
        X.readLock().lock();
        synchronized (C)
        {
            if (ak == null)
            {
                ak = new SimpleDateFormat("EEE", com.fitbit.util.al.a());
            }
        }
        obj = ak;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat f(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (w)
        {
            if (ae == null)
            {
                Locale locale = com.fitbit.util.al.a();
                ae = new SimpleDateFormat(context.getResources().getString(0x7f0805cd), locale);
            }
        }
        context = ae;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat g()
    {
        j();
        X.readLock().lock();
        synchronized (E)
        {
            if (am == null)
            {
                am = new SimpleDateFormat("MMM", com.fitbit.util.al.a());
            }
        }
        obj = am;
        X.readLock().unlock();
        return ((DateFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat g(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (x)
        {
            if (af == null)
            {
                Locale locale = com.fitbit.util.al.a();
                af = new SimpleDateFormat(context.getResources().getString(0x7f0805c6), locale);
            }
        }
        context = af;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat h(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (D)
        {
            if (al == null)
            {
                al = new SimpleDateFormat(context.getString(0x7f0805cb), com.fitbit.util.al.a());
            }
        }
        context = al;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static NumberFormat h()
    {
        j();
        X.readLock().lock();
        synchronized (I)
        {
            if (aq == null)
            {
                aq = new DecimalFormat();
                aq.setMaximumFractionDigits(0);
            }
        }
        obj = aq;
        X.readLock().unlock();
        return ((NumberFormat) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        X.readLock().unlock();
        throw exception;
    }

    static DateFormat i(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (F)
        {
            if (an == null)
            {
                an = new SimpleDateFormat(context.getString(0x7f0803b0), com.fitbit.util.al.a());
            }
        }
        context = an;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static void i()
    {
        m();
    }

    static DateFormat j(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (G)
        {
            if (ao == null)
            {
                ao = new SimpleDateFormat(context.getString(0x7f0803af), com.fitbit.util.al.a());
            }
        }
        context = ao;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    private static void j()
    {
        com/fitbit/util/format/d;
        JVM INSTR monitorenter ;
        if (com.fitbit.util.al.c())
        {
            k();
            l();
        }
        com/fitbit/util/format/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static DateFormat k(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (H)
        {
            if (ap == null)
            {
                ap = new SimpleDateFormat(context.getString(0x7f0805ca));
            }
        }
        context = ap;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    private static void k()
    {
        X.writeLock().lock();
        Z = null;
        ae = null;
        af = null;
        ad = null;
        ah = null;
        ai = null;
        aj = null;
        ak = null;
        al = null;
        am = null;
        an = null;
        ao = null;
        ar = null;
        as = null;
        au = null;
        av = null;
        ay = null;
        az = null;
        aw = null;
        ax = null;
        aA = null;
        aB = null;
        aC = null;
        aq = null;
        Y = null;
        aa = null;
        ab = null;
        X.writeLock().unlock();
        return;
        Exception exception;
        exception;
        X.writeLock().unlock();
        throw exception;
    }

    static DateFormat l(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (J)
        {
            if (ar == null)
            {
                ar = new SimpleDateFormat(context.getString(0x7f080290), com.fitbit.util.al.a());
                ar.setTimeZone(bn.b());
            }
        }
        context = ar;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    private static void l()
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            m();
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                public void run()
                {
                    d.i();
                }

            });
        }
        synchronized (K)
        {
            L = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static DateFormat m(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (K)
        {
            if (L == null)
            {
                L = new SimpleDateFormat(context.getString(0x7f080291), com.fitbit.util.al.a());
            }
        }
        context = L;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    private static void m()
    {
        aD = null;
        aE = null;
        aF = null;
        aG = null;
    }

    static DateFormat n(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (M)
        {
            if (as == null)
            {
                as = new SimpleDateFormat(context.getString(0x7f0805c4), com.fitbit.util.al.a());
            }
        }
        context = as;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat o(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (N)
        {
            if (at == null)
            {
                at = new SimpleDateFormat(context.getString(0x7f080608), com.fitbit.util.al.a());
            }
        }
        context = at;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat p(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (O)
        {
            if (au == null)
            {
                au = new SimpleDateFormat(context.getString(0x7f080408), com.fitbit.util.al.a());
            }
        }
        context = au;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat q(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (P)
        {
            if (av == null)
            {
                av = new SimpleDateFormat(context.getString(0x7f0805b7), com.fitbit.util.al.a());
            }
        }
        context = av;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat r(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (Q)
        {
            if (aw == null)
            {
                aw = new SimpleDateFormat(context.getString(0x7f0804e8), com.fitbit.util.al.a());
                aw.setTimeZone(bn.a());
            }
        }
        context = aw;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat s(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (R)
        {
            if (ax == null)
            {
                ax = new SimpleDateFormat(context.getString(0x7f080181), com.fitbit.util.al.a());
                ax.setTimeZone(bn.a());
            }
        }
        context = ax;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat t(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (S)
        {
            if (ay == null)
            {
                ay = new SimpleDateFormat(context.getString(0x7f0805cc), com.fitbit.util.al.a());
                ay.setTimeZone(bn.a());
            }
        }
        context = ay;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat u(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (T)
        {
            if (az == null)
            {
                az = new SimpleDateFormat(context.getString(0x7f0805c8), com.fitbit.util.al.a());
                az.setTimeZone(bn.a());
            }
        }
        context = az;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat v(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (U)
        {
            if (aA == null)
            {
                aA = new SimpleDateFormat(context.getString(0x7f0803be), com.fitbit.util.al.a());
                aA.setTimeZone(bn.a());
            }
        }
        context = aA;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat w(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (V)
        {
            if (aB == null)
            {
                aB = new SimpleDateFormat(context.getString(0x7f080194), com.fitbit.util.al.a());
            }
        }
        context = aB;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    static DateFormat x(Context context)
    {
        j();
        X.readLock().lock();
        synchronized (W)
        {
            if (aC == null)
            {
                aC = new SimpleDateFormat(context.getString(0x7f080622), com.fitbit.util.al.a());
            }
        }
        context = aC;
        X.readLock().unlock();
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        X.readLock().unlock();
        throw context;
    }

    public static DateFormat y(Context context)
    {
        j();
        if (aD == null)
        {
            aD = new SimpleDateFormat(context.getString(0x7f080408), com.fitbit.util.al.a());
        }
        return aD;
    }

    public static DateFormat z(Context context)
    {
        j();
        if (aE == null)
        {
            aE = new SimpleDateFormat(context.getString(0x7f0805b8), com.fitbit.util.al.a());
            aE.setTimeZone(bn.b());
        }
        return aE;
    }

    static 
    {
        c = new SimpleDateFormat("dd MMM yyyy HH:mm:ss Z", Locale.US);
        d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz", Locale.US);
        f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        g = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
        i = new SimpleDateFormat("HH:mm", Locale.US);
        k = new SimpleDateFormat("HH:mm:ss", Locale.US);
        l = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    // Unreferenced inner class com/fitbit/util/format/FormatCollection$1

/* anonymous class */
    static final class FormatCollection._cls1 extends DecimalFormat
    {

        private static final long serialVersionUID = 1L;

        DecimalFormat a()
        {
            setMinimumFractionDigits(0);
            setMaximumFractionDigits(2);
            return this;
        }

    }

}
