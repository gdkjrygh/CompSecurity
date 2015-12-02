// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class com.qihoo.security.ui.b.b
{
    static final class a
        implements Printer, android.view.ViewTreeObserver.OnPreDrawListener
    {

        final int a;
        long b;
        long c;
        int d;
        WeakReference e;
        final boolean f = com.qihoo.security.ui.b.b.c().b();
        List g;
        boolean h;
        a i;

        public int a()
        {
            long l1 = c - b;
            if (l1 <= 0L)
            {
                return -1;
            }
            if (d <= 0)
            {
                return 0;
            } else
            {
                return (int)(((float)d * 1E+09F) / (float)l1);
            }
        }

        final void a(ViewTreeObserver viewtreeobserver)
        {
            e = new WeakReference(viewtreeobserver);
            viewtreeobserver.addOnPreDrawListener(this);
            if (f)
            {
                g = new ArrayList();
                Looper.getMainLooper().setMessageLogging(this);
            }
            b = System.nanoTime();
        }

        final void b()
        {
            c = System.nanoTime();
            h = true;
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)e.get();
            if (viewtreeobserver != null)
            {
                viewtreeobserver.removeOnPreDrawListener(this);
            }
            if (f)
            {
                Looper.getMainLooper().setMessageLogging(null);
            }
        }

        public boolean onPreDraw()
        {
            d = d + 1;
            if (i != null)
            {
                i.c = System.nanoTime();
            }
            return true;
        }

        public void println(String s)
        {
            if (!h)
            {
                if (s.startsWith(">>>>> Dispatching to Handler "))
                {
                    i = new a();
                    i.d = s;
                    i.a = System.nanoTime();
                    g.add(i);
                    return;
                }
                if (s.startsWith("<<<<< Finished to ") && i != null)
                {
                    i.b = System.nanoTime();
                    return;
                }
            }
        }

        a(int i1)
        {
            a = i1;
        }
    }

    static class a.a
    {

        long a;
        long b;
        long c;
        String d;

        a.a()
        {
        }
    }

    public static interface b
    {

        public abstract int a();
    }

    static class c
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        int a;
        long b;
        long c;
        SparseArray d;
        WeakReference e;
        WeakReference f;

        public void a()
        {
            c = System.nanoTime();
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)f.get();
            if (viewtreeobserver != null)
            {
                viewtreeobserver.removeOnPreDrawListener(this);
            }
        }

        public void a(ViewTreeObserver viewtreeobserver)
        {
            f = new WeakReference(viewtreeobserver);
            viewtreeobserver.addOnPreDrawListener(this);
            d = new SparseArray();
            b = System.nanoTime();
        }

        public boolean onPreDraw()
        {
            b b1 = (b)e.get();
            if (b1 != null)
            {
                com.qihoo.security.ui.b.b.a(com.qihoo.security.ui.b.b.c(), a, b1.a());
            } else
            {
                com.qihoo.security.ui.b.b.a(com.qihoo.security.ui.b.b.c(), a);
            }
            return true;
        }

        c(int i1, b b1)
        {
            a = i1;
            e = new WeakReference(b1);
        }
    }


    private static final SparseArray a;
    private static final SparseArray b;
    private static final SparseArray c;
    private static final SparseIntArray d;
    private static final SparseArray e;
    private static final int f = "<<<<< Finished to ".length();
    private static com.qihoo.security.ui.b.b g = new com.qihoo.security.ui.b.b();
    private int h;
    private int i;
    private final boolean j;
    private SparseArray k;
    private SparseArray l;
    private Handler m;
    private final Random n = new Random(System.currentTimeMillis());

    private com.qihoo.security.ui.b.b()
    {
        boolean flag = true;
        super();
        h = -1;
        k = new SparseArray();
        l = new SparseArray();
        if (n.nextInt(200) >= 1)
        {
            flag = false;
        }
        j = flag;
        if (j)
        {
            HandlerThread handlerthread = new HandlerThread("FrameCounter", 10);
            handlerthread.start();
            m = new Handler(handlerthread.getLooper()) {

                final com.qihoo.security.ui.b.b a;

                public void handleMessage(Message message)
                {
                    switch (message.what)
                    {
                    default:
                        return;

                    case 0: // '\0'
                        com.qihoo.security.ui.b.b.a(a, message.arg1, message.arg2, (a)message.obj);
                        return;

                    case 1: // '\001'
                        com.qihoo.security.ui.b.b.a(a, (c)message.obj);
                        return;

                    case 2: // '\002'
                        com.qihoo.security.ui.b.b.b(a, message.arg1, message.arg2, (a)message.obj);
                        break;
                    }
                }

            
            {
                a = com.qihoo.security.ui.b.b.this;
                super(looper);
            }
            };
        }
    }

    private static String a(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() >= f) goto _L3; else goto _L2
_L5:
        return (new StringBuilder()).append("!").append(s).toString();
_L3:
        s = s.substring(">>>>> Dispatching to Handler ".length()).replaceAll("[\\{@]{1}[0-9a-z]+\\}?", "").replaceAll("[\\(\\):]", "");
        return s;
        s;
        return (new StringBuilder()).append("!!").append(s.getMessage()).toString();
_L2:
        if (s == null)
        {
            return "null";
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a()
    {
        g.d();
    }

    public static void a(int i1)
    {
        if (i1 < 0)
        {
            return;
        } else
        {
            g.d(i1);
            return;
        }
    }

    private void a(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        c c1 = (c)l.get(i1);
        if (c1 != null)
        {
            SparseArray sparsearray1 = c1.d;
            SparseArray sparsearray = sparsearray1;
            if (sparsearray1 == null)
            {
                sparsearray = new SparseArray();
                c1.d = sparsearray;
            }
            if ((Long)sparsearray.get(j1) == null)
            {
                sparsearray.put(j1, Long.valueOf(System.nanoTime()));
                return;
            }
        }
        break MISSING_BLOCK_LABEL_89;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(int i1, int j1, a a1)
    {
        long l1;
        long l2;
        long l3;
        long l4;
        long l6;
        long l9;
        String s;
        Object obj;
        a.a a2;
        try
        {
            obj = a1.g;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            com.qihoo.security.support.b.a(19100, (new StringBuilder()).append("exc:").append(a1).toString(), "");
            return;
        }
        if (obj == null)
        {
            return;
        }
        l2 = 0x7fffffffffffffffL;
        l1 = 0L;
        l3 = 0L;
        l9 = 0L;
        s = "";
        obj = ((List) (obj)).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        a2 = (a.a)((Iterator) (obj)).next();
        if (a2.b <= 0L) goto _L4; else goto _L3
_L3:
        l6 = a2.b - a2.a;
        if (a2.c <= 0L) goto _L6; else goto _L5
_L5:
        l4 = l1;
        long l7;
        long l8;
        if (l6 > l1)
        {
            l4 = l6;
        }
        l8 = l3;
        l7 = l4;
          goto _L7
_L6:
        l3 += l6;
        l8 = l3;
        l7 = l1;
        if (l6 <= l9) goto _L9; else goto _L8
_L8:
        s = a2.d;
        l4 = l1;
        l7 = l2;
        l9 = l6;
        l1 = l3;
        l2 = l4;
        l3 = l7;
          goto _L10
_L12:
        obj = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = s;
        if (s.length() > 0)
        {
            obj = a(s);
        }
        com.qihoo.security.support.b.a(19100, String.format("%d:%d,fps:%d,dur:%d,min:%d,max:%d,Max:%d,%s,Total:%d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(a1.a), Integer.valueOf(j1), Long.valueOf((a1.c - a1.b) / 0xf4240L), Long.valueOf(l2 / 0xf4240L), Long.valueOf(l1 / 0xf4240L), Long.valueOf(l9 / 0xf4240L), obj, Long.valueOf(l3 / 0xf4240L)
        }), "");
        return;
_L9:
        l1 = l8;
        l3 = l2;
        l2 = l7;
          goto _L10
_L13:
        return;
_L7:
        if (l6 >= l2) goto _L9; else goto _L11
_L11:
        l2 = l4;
        l1 = l3;
        l3 = l6;
_L10:
        long l5 = l3;
        l3 = l1;
        l1 = l2;
        l2 = l5;
          goto _L4
_L2:
        if (l2 == 0x7fffffffffffffffL || l3 == 0L || l1 == 0L && l9 == 0L) goto _L13; else goto _L12
    }

    public static void a(int i1, View view)
    {
        g.b(i1, view);
    }

    public static void a(int i1, View view, b b1)
    {
        g.b(i1, view, b1);
    }

    private void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        a a1 = (a)k.get(i1);
        k.remove(i1);
        Exception exception;
        if (a1 != null)
        {
            a1.b();
            i1 = a1.a();
            if (j && i1 < 30)
            {
                Message message = m.obtainMessage(2, h, i1, a1);
                long l1 = n.nextInt(5000) + 500;
                m.sendMessageDelayed(message, l1);
            }
            a(a1, i1);
            return;
        } else
        {
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(a a1, int i1)
    {
        int j1 = b(h, a1.a);
        j1 = d.indexOfKey(j1);
        if (j1 >= 0 && i1 != -1)
        {
            com.qihoo.security.support.b.b(d.valueAt(j1), i1);
        }
    }

    private void a(c c1)
    {
        int i1 = i;
        i = i1 + 1;
        b(String.format("    >>progress data for %d:%s", new Object[] {
            Integer.valueOf(i1), b.get(c1.a)
        }));
        c1 = c1.d;
        ArrayList arraylist = new ArrayList();
        int j2 = c1.size();
        if (j2 > 0)
        {
            for (int j1 = 0; j1 < j2; j1++)
            {
                arraylist.add(Integer.valueOf(c1.keyAt(j1)));
            }

            Collections.sort(arraylist);
            int k2 = ((Integer)arraylist.get(0)).intValue();
            int l2 = ((Integer)arraylist.get(j2 - 1)).intValue();
            int l1 = 0;
            int k1 = 0;
            for (; l1 < j2; l1++)
            {
                int i2 = ((Integer)arraylist.get(l1)).intValue();
                if (l1 <= 0)
                {
                    continue;
                }
                i2 -= ((Integer)arraylist.get(l1 - 1)).intValue();
                if (i2 > k1)
                {
                    k1 = i2;
                }
            }

            b(String.format("    progress start:%d, end:%d, density: %.2f, max step: %d", new Object[] {
                Integer.valueOf(k2), Integer.valueOf(l2), Float.valueOf((float)(j2 * 100) / (float)((l2 - k2) + 1)), Integer.valueOf(k1)
            }));
        }
    }

    static void a(com.qihoo.security.ui.b.b b1, int i1)
    {
        b1.e(i1);
    }

    static void a(com.qihoo.security.ui.b.b b1, int i1, int j1)
    {
        b1.a(i1, j1);
    }

    static void a(com.qihoo.security.ui.b.b b1, int i1, int j1, a a1)
    {
        b1.b(i1, j1, a1);
    }

    static void a(com.qihoo.security.ui.b.b b1, c c1)
    {
        b1.a(c1);
    }

    private static int b(int i1, int j1)
    {
        return i1 << 16 | j1;
    }

    public static void b(int i1)
    {
        g.e(i1);
    }

    private void b(int i1, int j1, a a1)
    {
    }

    private void b(int i1, View view)
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        if (view != null)
        {
            view = view.getViewTreeObserver();
            if (view != null && (a)k.get(i1) == null)
            {
                a a1 = new a(i1);
                k.put(i1, a1);
                a1.a(view);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_70;
        view;
        this;
        JVM INSTR monitorexit ;
        throw view;
    }

    private void b(int i1, View view, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        if (b1 != null && view != null)
        {
            view = view.getViewTreeObserver();
            if (view != null && (c)l.get(i1) == null)
            {
                b1 = new c(i1, b1);
                l.put(i1, b1);
                b1.a(view);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_75;
        view;
        this;
        JVM INSTR monitorexit ;
        throw view;
    }

    static void b(com.qihoo.security.ui.b.b b1, int i1, int j1, a a1)
    {
        b1.a(i1, j1, a1);
    }

    private void b(String s)
    {
    }

    static com.qihoo.security.ui.b.b c()
    {
        return g;
    }

    public static void c(int i1)
    {
        g.a(i1, true);
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            b((new StringBuilder()).append("end : ").append((String)a.get(h)).toString());
        }
        k.clear();
        l.clear();
        h = -1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        h = i1;
        k.clear();
        i = 1;
        b((new StringBuilder()).append("anim for ").append((String)a.get(i1)).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (h >= 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        c c1 = (c)l.get(i1);
        Exception exception;
        if (c1 != null)
        {
            l.remove(i1);
            c1.a();
            return;
        } else
        {
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b()
    {
        return j;
    }

    static 
    {
        a = new SparseArray();
        b = new SparseArray();
        c = new SparseArray();
        d = new SparseIntArray();
        e = new SparseArray();
        a.put(0, "\u52A0\u901F");
        e.put(0, "pt_fr_boost");
        a.put(10, "\u6E05\u7406:\u626B\u63CF");
        a.put(11, "\u6E05\u7406\u7ED3\u675F");
        e.put(10, "pt_fr_clean");
        e.put(11, "pt_fr_clean");
        a.put(12, "\u6E05\u7406\u7ED3\u675F->\u8FD4\u56DE\u4E3B\u754C\u9762");
        a.put(20, "\u6740\u6BD2:\u626B\u63CF");
        a.put(21, "\u6740\u6BD2\u7ED3\u675F");
        e.put(20, "pt_fr_av");
        e.put(21, "pt_fr_av");
        a.put(22, "\u6740\u6BD2\u7ED3\u675F->\u8FD4\u56DE\u4E3B\u754C\u9762");
        b.put(1, "\u6309\u94AE\u9690\u85CF(\u9010\u6E10\u7F29\u5C0F)");
        b.put(2, "\u6309\u94AE\u663E\u793A(\u9010\u6E10\u653E\u5927)");
        b.put(0, "\u6309\u94AE\u8DF3\u52A8");
        b.put(4, "\u8868\u76D8\u9690\u85CF(\u9010\u6E10\u7F29\u5C0F)");
        b.put(5, "\u8868\u76D8\u663E\u793A(\u9010\u6E10\u653E\u5927)");
        b.put(3, "\u8868\u76D8\u56DE\u6446\u5230\u6700\u5C0F");
        b.put(14, "\u8868\u76D8\u6446\u5230\u6700\u5927");
        b.put(6, "Tab\u6D88\u5931(\u9010\u6E10\u4E0A\u79FB)");
        b.put(7, "Tab\u663E\u793A(\u9010\u6E10\u4E0B\u79FB)");
        b.put(9, "\u706B\u7BAD\u52A8\u753B");
        b.put(10, "\u6E05\u7406\u626B\u63CF\u8FDB\u5EA6");
        b.put(11, "\u72B6\u6001\u9690\u85CF(\u900F\u660E\u5EA6)");
        b.put(12, "\u6740\u6BD2\u626B\u63CF\u8FDB\u5EA6");
        b.put(13, "\u6740\u6BD2\u626B\u63CF\u96F7\u8FBE");
        c.put(1, "btn_scale_down");
        c.put(2, "btn_scale_up");
        c.put(0, "btn_bump");
        c.put(4, "dialer_scale_down");
        c.put(5, "dialer_scale_up");
        c.put(3, "dialer_2_0");
        c.put(14, "dailer_2_100");
        c.put(6, "tab_trans_up");
        c.put(7, "tab_trans_down");
        c.put(9, "rocket_fire");
        d.put(b(0, 1), 11324);
        d.put(b(0, 0), 11323);
        d.put(b(0, 4), 11326);
        d.put(b(0, 3), 11325);
        d.put(b(0, 6), 11327);
        d.put(b(0, 14), 11329);
        d.put(b(0, 9), 11328);
        d.put(b(10, 0), 18520);
        d.put(b(10, 1), 18521);
        d.put(b(10, 4), 18522);
        d.put(b(10, 6), 18523);
        d.put(b(10, 5), 18524);
        d.put(b(12, 0), 18525);
        d.put(b(12, 1), 18526);
        d.put(b(12, 7), 18527);
        d.put(b(12, 2), 18528);
        d.put(b(20, 0), 14520);
        d.put(b(20, 1), 14521);
        d.put(b(20, 6), 14522);
        d.put(b(22, 0), 14523);
        d.put(b(22, 1), 14524);
        d.put(b(22, 7), 14525);
        d.put(b(22, 2), 14526);
    }
}
