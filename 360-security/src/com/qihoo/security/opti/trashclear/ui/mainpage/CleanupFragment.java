// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.o;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.enginehelper.clean.CleanScanType;
import com.qihoo.security.enginehelper.clean.CleanTrashType;
import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.widget.RadarProgressBar;
import com.qihoo.security.opti.trashclear.d;
import com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity;
import com.qihoo.security.opti.trashclear.ui.wave.WaveTextView;
import com.qihoo.security.opti.trashclear.ui.wave.WaveView;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.ScanButtonTopView;
import com.qihoo.security.ui.b.c;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.main.BaseHomeFragment;
import com.qihoo.security.ui.result.view.CleanResultFragment;
import com.qihoo.security.widget.CircleProgress;
import com.qihoo.security.widget.RevealPanel;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            BottomInfoView, a

public class CleanupFragment extends BaseHomeFragment
{
    private static abstract class a
    {

        public void a()
        {
        }

        public abstract void a(long l1, long l2);

        private a()
        {
        }

    }

    private static class b extends Thread
    {

        private Queue a;
        private long b;
        private long c;
        private boolean d;
        private boolean e;
        private final a f;
        private long g;
        private int h;
        private long i;
        private int j;

        public void a()
        {
            start();
        }

        public void a(long l1)
        {
            c = l1;
            if (c < b)
            {
                c = b;
            }
            LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
            if (c - b >= i)
            {
                for (int i1 = 1; i1 <= h; i1++)
                {
                    linkedblockingqueue.add(Long.valueOf(b + ((c - b) * (long)i1) / (long)h));
                }

            } else
            {
                linkedblockingqueue.add(Long.valueOf(c));
            }
            a = linkedblockingqueue;
        }

        public void b()
        {
            d = true;
        }

        public void c()
        {
            e = true;
        }

        public void d()
        {
            if (j == 2)
            {
                g = 50L;
                h = 20;
                return;
            }
            if (j == 1)
            {
                g = 200L;
                h = 5;
                i = 0L;
                return;
            } else
            {
                g = 200L;
                h = 5;
                i = 0L;
                return;
            }
        }

        public void run()
        {
            Long long1 = null;
_L2:
            if (d)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            if (a != null)
            {
                long1 = (Long)a.poll();
            }
            if (long1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            b = long1.longValue();
            if (f != null)
            {
                f.a(long1.longValue(), g);
            }
_L4:
            try
            {
                Thread.sleep(g);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            if (true) goto _L2; else goto _L1
_L1:
            if (!e) goto _L4; else goto _L3
_L3:
            if (f != null)
            {
                f.a();
            }
        }

        public b(a a1, int i1)
        {
            f = a1;
            j = i1;
            if (i1 == 2)
            {
                g = 50L;
                h = 60;
                return;
            }
            if (i1 == 1)
            {
                g = 200L;
                h = 15;
                i = 0L;
                return;
            } else
            {
                g = 200L;
                h = 15;
                i = 0L;
                return;
            }
        }
    }

    private static class c extends Thread
    {

        private boolean a;
        private final f b;
        private long c;
        private long d;
        private long e;

        public void a()
        {
            a = false;
            start();
        }

        public void a(long l1)
        {
            c = l1;
        }

        public void b()
        {
            a = true;
            com.qihoo.security.support.b.a(18315, String.valueOf(d), String.valueOf(e), String.valueOf(0));
        }

        public void run()
        {
            int i1 = 0;
            do
            {
                if (a)
                {
                    break;
                }
                int j1;
                try
                {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
                j1 = i1 + 1;
                if (j1 == 1 || j1 == 2 || j1 == 3 || j1 == 5)
                {
                    i1 = j1;
                    if (j1 != 1)
                    {
                        if (j1 == 2)
                        {
                            if (!SharedPref.b(SecurityApplication.a(), "sp_key_has_clear_memory", false))
                            {
                                ProcessClearService.e();
                            }
                            d = c;
                            i1 = j1;
                            if (b != null)
                            {
                                b.a(c);
                                i1 = j1;
                            }
                        } else
                        {
                            i1 = j1;
                            if (j1 == 5)
                            {
                                if (!SharedPref.b(SecurityApplication.a(), "sp_key_has_clear_memory", false))
                                {
                                    ProcessClearService.e();
                                }
                                e = c;
                                i1 = j1;
                                if (b != null)
                                {
                                    b.a(c);
                                    i1 = j1;
                                }
                            }
                        }
                    }
                } else
                {
                    i1 = j1;
                    if (j1 == 10)
                    {
                        com.qihoo.security.support.b.a(18315, String.valueOf(d), String.valueOf(e), String.valueOf(c));
                        if (b != null)
                        {
                            b.a(c);
                            b.a();
                        }
                        a = true;
                        i1 = j1;
                    }
                }
            } while (true);
        }

        public c(f f1)
        {
            d = 0L;
            e = 0L;
            b = f1;
        }
    }

    private static interface d
    {

        public abstract void a();

        public abstract void a(int i1, int j1);
    }

    private static class e extends Thread
    {

        private static final SparseArray c;
        private static final List d;
        private final d a;
        private boolean b;

        public void a()
        {
            b = true;
        }

        public boolean b()
        {
            return b;
        }

        public void c()
        {
            if (a != null)
            {
                a.a(0, 0);
            }
            start();
        }

        public void d()
        {
            if (a != null)
            {
                a.a();
            }
        }

        public void run()
        {
            int k1 = 0;
            int j1 = 0;
            do
            {
                if (b || k1 == d.size())
                {
                    return;
                }
                int l1 = ((Integer)d.get(k1)).intValue();
                i i1 = (i)c.get(l1);
                if (com.qihoo.security.opti.trashclear.ui.mainpage.i.a(i1) == j1)
                {
                    if (a != null)
                    {
                        a.a(l1, com.qihoo.security.opti.trashclear.ui.mainpage.i.b(i1) * 1000);
                    }
                    k1++;
                    j1 = 0;
                }
                try
                {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
                j1++;
            } while (true);
        }

        static 
        {
            c = new SparseArray(7);
            d = new ArrayList();
            c.put(Integer.valueOf(50).intValue(), new i(0, 10));
            c.put(Integer.valueOf(90).intValue(), new i(10, 80));
            c.put(Integer.valueOf(99).intValue(), new i(80, 1024));
            d.add(Integer.valueOf(50));
            d.add(Integer.valueOf(90));
            d.add(Integer.valueOf(99));
        }

        public e(d d1)
        {
            a = d1;
        }
    }

    private static interface f
    {

        public abstract void a();

        public abstract void a(long l1);
    }

    private static class g extends Thread
    {

        private boolean a;
        private final h b;
        private final String c[];

        public void a()
        {
            start();
        }

        public void b()
        {
            a = true;
        }

        public void run()
        {
            int j1;
            if (c == null)
            {
                j1 = 0;
            } else
            {
                j1 = c.length;
            }
            if (j1 > 0)
            {
                int i1 = 0;
                while (!a) 
                {
                    if (b != null)
                    {
                        b.a(c[i1]);
                    }
                    int k1 = i1 + 1;
                    i1 = k1;
                    if (k1 == j1)
                    {
                        i1 = 0;
                    }
                    try
                    {
                        Thread.sleep(600L);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                }
            }
        }

        public g(h h1, String as1[])
        {
            b = h1;
            if (as1 == null)
            {
                h1 = null;
            } else
            {
                h1 = (String[])as1.clone();
            }
            c = h1;
        }
    }

    private static interface h
    {

        public abstract void a(String s1);
    }

    private static class i
    {

        private final int a;
        private final int b;

        static int a(i i1)
        {
            return i1.a;
        }

        static int b(i i1)
        {
            return i1.b;
        }

        public i(int i1, int j1)
        {
            a = i1;
            b = j1;
        }
    }

    private class j extends com.nineoldandroids.a.b
    {

        final CleanupFragment a;
        private boolean b;

        public void a(boolean flag)
        {
            b = flag;
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            CleanupFragment.j(a).a(true);
            if (b)
            {
                if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a, com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, 0L);
                    return;
                } else
                {
                    CleanupFragment.ad(a);
                    return;
                }
            } else
            {
                CleanupFragment.ad(a);
                return;
            }
        }

        private j()
        {
            a = CleanupFragment.this;
            super();
        }

    }

    private static class k extends Handler
    {

        private final WeakReference a;
        private boolean b;

        public void a()
        {
            b = true;
        }

        public void handleMessage(Message message)
        {
            if (!b && a != null)
            {
                CleanupFragment cleanupfragment = (CleanupFragment)a.get();
                if (cleanupfragment != null)
                {
                    switch (message.what)
                    {
                    default:
                        return;

                    case 1: // '\001'
                        CleanupFragment.ab(cleanupfragment);
                        return;

                    case 2: // '\002'
                        CleanupFragment.ac(cleanupfragment);
                        return;

                    case 3: // '\003'
                        CleanupFragment.e(cleanupfragment, message.arg1);
                        break;
                    }
                    return;
                }
            }
        }

        public k(CleanupFragment cleanupfragment)
        {
            a = new WeakReference(cleanupfragment);
        }
    }

    public static class l
    {

        private final Context a;

        public Context a()
        {
            return a;
        }

        public l(Context context)
        {
            a = context;
        }
    }


    private View A;
    private Context B;
    private Activity C;
    private com.qihoo.security.enginehelper.clean.a D;
    private boolean E;
    private boolean F;
    private final byte G[] = new byte[0];
    private boolean H;
    private boolean I;
    private ScaleAnimation J;
    private ScaleAnimation K;
    private LocaleTextView L;
    private LocaleTextView M;
    private LocaleTextView N;
    private View O;
    private k P;
    private k Q;
    private boolean R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z[];
    BottomInfoView a;
    private final com.qihoo.security.enginehelper.clean.a.b aA = new com.qihoo.security.enginehelper.clean.a.b() {

        final CleanupFragment a;
        private boolean b;
        private final byte c[] = new byte[0];

        private void a(com.qihoo.security.opti.trashclear.d d1)
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, d1);
            long l1 = d1.k.b();
            long l2 = d1.k.c();
            long l3 = d1.k.c;
            long l4 = d1.k.e();
            int i1 = (com.qihoo.security.opti.trashclear.ui.mainpage.a.a(l4) * 1000) / 100;
            if (d1.c)
            {
                synchronized (c)
                {
                    if (CleanupFragment.g(a) != null)
                    {
                        CleanupFragment.g(a).a();
                        CleanupFragment.g(a).d();
                    }
                }
                if (CleanupFragment.u(a) != null)
                {
                    CleanupFragment.u(a).d();
                }
                if (CleanupFragment.v(a) != null)
                {
                    CleanupFragment.v(a).d();
                }
                if (CleanupFragment.w(a) != null)
                {
                    CleanupFragment.w(a).d();
                }
                if (CleanupFragment.x(a) != null)
                {
                    CleanupFragment.x(a).d();
                }
                if (CleanupFragment.y(a) != null)
                {
                    CleanupFragment.y(a).d();
                }
            }
            if (CleanupFragment.u(a) != null)
            {
                CleanupFragment.u(a).a(l4);
            }
            if (CleanupFragment.v(a) != null)
            {
                CleanupFragment.v(a).a(l1);
            }
            if (CleanupFragment.w(a) != null)
            {
                CleanupFragment.w(a).a(l2);
            }
            if (CleanupFragment.x(a) != null)
            {
                CleanupFragment.x(a).a(l3);
            }
            if (CleanupFragment.y(a) != null)
            {
                CleanupFragment.y(a).a(i1);
            }
            return;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static void a(_cls20 _pcls20, com.qihoo.security.opti.trashclear.d d1)
        {
            _pcls20.a(d1);
        }

        static boolean a(_cls20 _pcls20, boolean flag)
        {
            _pcls20.b = flag;
            return flag;
        }

        static byte[] a(_cls20 _pcls20)
        {
            return _pcls20.c;
        }

        static boolean b(_cls20 _pcls20)
        {
            return _pcls20.b;
        }

        public void a()
        {
            b = false;
            if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a) || !a.isAdded())
            {
                return;
            }
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a, new b(new a(this) {

                final _cls20 a;

                public void a(long l1, long l2)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        String as1[] = com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(SecurityApplication.a(), l1), CleanupFragment.z(a.a));
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, as1) {

                            final String a[];
                            final _cls1 b;

                            public void run()
                            {
label0:
                                {
                                    synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(b.a))
                                    {
                                        if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a.a) && b.a.a.isAdded())
                                        {
                                            break label0;
                                        }
                                    }
                                    return;
                                }
                                if (!com.qihoo.security.opti.trashclear.ui.mainpage._cls20.b(b.a))
                                {
                                    break MISSING_BLOCK_LABEL_69;
                                }
                                abyte0;
                                JVM INSTR monitorexit ;
                                return;
                                exception;
                                abyte0;
                                JVM INSTR monitorexit ;
                                throw exception;
                                CleanupFragment.A(b.a.a).setText(a[0]);
                                CleanupFragment.B(b.a.a).setText(a[1]);
                                abyte0;
                                JVM INSTR monitorexit ;
                            }

            
            {
                b = _pcls1;
                a = as1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            }, 1));
            CleanupFragment.u(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, new b(new a(this) {

                final _cls20 a;

                public void a(long l1, long l2)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        String s1 = com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(SecurityApplication.a(), l1);
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, l1, s1) {

                            final long a;
                            final String b;
                            final _cls2 c;

                            public void run()
                            {
                                if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                                {
                                    return;
                                }
                                synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(c.a))
                                {
                                    if (!com.qihoo.security.opti.trashclear.ui.mainpage._cls20.b(c.a))
                                    {
                                        break MISSING_BLOCK_LABEL_67;
                                    }
                                }
                                return;
                                exception;
                                abyte0;
                                JVM INSTR monitorexit ;
                                throw exception;
                                synchronized (CleanupFragment.C(c.a.a))
                                {
                                    CleanupFragment.C(c.a.a).setTag(Long.valueOf(a));
                                    CleanupFragment.C(c.a.a).setTitle(b);
                                    if (a > 0L)
                                    {
                                        CleanupFragment.C(c.a.a).setTitleColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.C(c.a.a).setColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.C(c.a.a).setSummaryColor(CleanupFragment.D(c.a.a));
                                    }
                                }
                                abyte0;
                                JVM INSTR monitorexit ;
                                return;
                                exception1;
                                revealpanel;
                                JVM INSTR monitorexit ;
                                throw exception1;
                            }

            
            {
                c = _pcls2;
                a = l1;
                b = s1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            }, 1));
            CleanupFragment.v(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a, new b(new a(this) {

                final _cls20 a;

                public void a(long l1, long l2)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        String s1 = com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(SecurityApplication.a(), l1);
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, l1, s1) {

                            final long a;
                            final String b;
                            final _cls3 c;

                            public void run()
                            {
                                if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                                {
                                    return;
                                }
                                synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(c.a))
                                {
                                    if (!com.qihoo.security.opti.trashclear.ui.mainpage._cls20.b(c.a))
                                    {
                                        break MISSING_BLOCK_LABEL_67;
                                    }
                                }
                                return;
                                exception;
                                abyte0;
                                JVM INSTR monitorexit ;
                                throw exception;
                                synchronized (CleanupFragment.E(c.a.a))
                                {
                                    CleanupFragment.E(c.a.a).setTag(Long.valueOf(a));
                                    CleanupFragment.E(c.a.a).setTitle(b);
                                    if (a > 0L)
                                    {
                                        CleanupFragment.E(c.a.a).setTitleColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.E(c.a.a).setColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.E(c.a.a).setSummaryColor(CleanupFragment.D(c.a.a));
                                    }
                                }
                                abyte0;
                                JVM INSTR monitorexit ;
                                return;
                                exception1;
                                revealpanel;
                                JVM INSTR monitorexit ;
                                throw exception1;
                            }

            
            {
                c = _pcls3;
                a = l1;
                b = s1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            }, 1));
            CleanupFragment.w(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, new b(new a(this) {

                final _cls20 a;

                public void a(long l1, long l2)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        String s1 = com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(SecurityApplication.a(), l1);
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, l1, s1) {

                            final long a;
                            final String b;
                            final _cls4 c;

                            public void run()
                            {
                                if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                                {
                                    return;
                                }
                                synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(c.a))
                                {
                                    if (!com.qihoo.security.opti.trashclear.ui.mainpage._cls20.b(c.a))
                                    {
                                        break MISSING_BLOCK_LABEL_67;
                                    }
                                }
                                return;
                                exception;
                                abyte0;
                                JVM INSTR monitorexit ;
                                throw exception;
                                synchronized (CleanupFragment.F(c.a.a))
                                {
                                    CleanupFragment.F(c.a.a).setTag(Long.valueOf(a));
                                    CleanupFragment.F(c.a.a).setTitle(b);
                                    if (a > 0L)
                                    {
                                        CleanupFragment.F(c.a.a).setTitleColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.F(c.a.a).setColor(CleanupFragment.D(c.a.a));
                                        CleanupFragment.F(c.a.a).setSummaryColor(CleanupFragment.D(c.a.a));
                                    }
                                }
                                abyte0;
                                JVM INSTR monitorexit ;
                                return;
                                exception1;
                                revealpanel;
                                JVM INSTR monitorexit ;
                                throw exception1;
                            }

            
            {
                c = _pcls4;
                a = l1;
                b = s1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            }, 1));
            CleanupFragment.x(a).a();
            CleanupFragment.e(a, new b(new a(this) {

                final _cls20 a;

                public void a()
                {
                    if (CleanupFragment.H(a.a) != null)
                    {
                        CleanupFragment.H(a.a).b();
                    }
                    if (CleanupFragment.g(a.a) != null)
                    {
                        CleanupFragment.g(a.a).a();
                    }
                    synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(a))
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(a, true);
                        CleanupFragment.G(a.a).a(true);
                    }
                    if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a))
                    {
                        if (a.a.isAdded());
                    }
                    return;
                    exception;
                    abyte0;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                public void a(long l1, long l2)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        int i1 = (int)l1;
                        com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus = com.qihoo.security.opti.trashclear.ui.mainpage.a.a((i1 * 100) / 1000);
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, i1, examstatus) {

                            final int a;
                            final com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus b;
                            final _cls5 c;

                            public void run()
                            {
                                if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                                {
                                    return;
                                }
                                synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(c.a))
                                {
                                    if (!com.qihoo.security.opti.trashclear.ui.mainpage._cls20.b(c.a))
                                    {
                                        break MISSING_BLOCK_LABEL_67;
                                    }
                                }
                                return;
                                exception;
                                abyte0;
                                JVM INSTR monitorexit ;
                                throw exception;
                                CleanupFragment.G(c.a.a).setProgress(a);
                                c.a.a.a(b, true);
                                abyte0;
                                JVM INSTR monitorexit ;
                            }

            
            {
                c = _pcls5;
                a = i1;
                b = examstatus;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            }, 2));
            CleanupFragment.y(a).a();
            if (!SharedPref.b(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(a), "sp_key_has_clear_memory", false))
            {
                ProcessClearService.d();
            }
            com.qihoo.security.opti.trashclear.d d1 = new com.qihoo.security.opti.trashclear.d();
            d1.k.n = CleanupFragment.I(a);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, d1) {

                final com.qihoo.security.opti.trashclear.d a;
                final _cls20 b;

                public void run()
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a) || !b.a.isAdded())
                    {
                        CleanupFragment.J(b.a);
                        return;
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(b, a);
                        return;
                    }
                }

            
            {
                b = _pcls20;
                a = d1;
                super();
            }
            });
        }

        public void a(int i1, Map map)
        {
            map = com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a, com.qihoo.security.opti.trashclear.e.a(i1, map));
            ((com.qihoo.security.opti.trashclear.d) (map)).k.n = CleanupFragment.I(a);
            if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a) || !a.isAdded())
            {
                CleanupFragment.J(a);
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, map) {

                    final com.qihoo.security.opti.trashclear.d a;
                    final _cls20 b;

                    public void run()
                    {
                        if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a) || !b.a.isAdded())
                        {
                            CleanupFragment.J(b.a);
                            return;
                        } else
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(b, a);
                            return;
                        }
                    }

            
            {
                b = _pcls20;
                a = d1;
                super();
            }
                });
                return;
            }
        }

        public void a(Map map)
        {
        }

        public void b()
        {
            synchronized (CleanupFragment.q(a))
            {
                CleanupFragment.e(a, false);
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b(int i1, Map map)
        {
            map = com.qihoo.security.opti.trashclear.e.a(i1, map);
            ((com.qihoo.security.opti.trashclear.d) (map)).k.n = CleanupFragment.I(a);
            map.c = true;
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, map);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, map) {

                final com.qihoo.security.opti.trashclear.d a;
                final _cls20 b;

                public void run()
                {
                    if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a) && b.a.isAdded())
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage._cls20.a(b, a);
                    }
                    CleanupFragment.J(b.a);
                }

            
            {
                b = _pcls20;
                a = d1;
                super();
            }
            });
            CleanupFragment.K(a);
            long l1 = System.currentTimeMillis();
            if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a))
            {
                return;
            }
            com.qihoo.security.support.b.b(18012, ((com.qihoo.security.opti.trashclear.d) (map)).j.e());
            if (!SharedPref.b(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(a), "sp_key_has_clear_memory", false) && CleanupFragment.I(a) > 0L)
            {
                com.qihoo.security.support.b.a(18013, String.valueOf(((com.qihoo.security.opti.trashclear.d) (map)).k.e()), String.valueOf(CleanupFragment.I(a)));
            } else
            {
                com.qihoo.security.support.b.b(18013, ((com.qihoo.security.opti.trashclear.d) (map)).k.e());
            }
            com.qihoo.security.support.b.c(18316, (int)(l1 - CleanupFragment.L(a)));
        }

        public void c()
        {
            if (CleanupFragment.H(a) != null)
            {
                CleanupFragment.H(a).b();
            }
            if (CleanupFragment.g(a) != null)
            {
                CleanupFragment.g(a).a();
            }
            CleanupFragment.J(a);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this) {

                final _cls20 a;

                public void run()
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, true);
                        return;
                    }
                }

            
            {
                a = _pcls20;
                super();
            }
            });
            CleanupFragment.K(a);
            synchronized (CleanupFragment.q(a))
            {
                CleanupFragment.e(a, false);
                b = true;
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final com.qihoo.security.alasticbutton.a aB = new com.qihoo.security.alasticbutton.a() {

        final CleanupFragment a;

        public void a()
        {
        }

        public void b()
        {
            CleanupFragment.j(a).b(true);
        }

        public void d()
        {
            super.d();
            com.qihoo.security.ui.b.b.a();
        }

        public void f()
        {
            CleanupFragment.M(a);
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private g aa;
    private e ab;
    private b ac;
    private b ad;
    private b ae;
    private b af;
    private b ag;
    private com.qihoo.security.opti.trashclear.d ah;
    private long ai;
    private android.os.PowerManager.WakeLock aj;
    private boolean ak;
    private int al;
    private com.qihoo.security.ui.main.b am;
    private final j an = new j();
    private com.qihoo.security.opti.trashclear.d ao;
    private long ap;
    private long aq;
    private boolean ar;
    private boolean as;
    private final com.qihoo.security.malware.widget.RadarProgressBar.a at = new com.qihoo.security.malware.widget.RadarProgressBar.a() {

        final CleanupFragment a;

        public void a()
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this) {

                final _cls1 a;

                public void run()
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a) || !a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, false);
                        return;
                    }
                }

            
            {
                a = _pcls1;
                super();
            }
            });
        }

        public void a(float f1)
        {
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final BroadcastReceiver au = new BroadcastReceiver() {

        final CleanupFragment a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                if ("action_get_data_size".equals(intent.getAction()))
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a))
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a, intent.getLongExtra("size", 0L));
                    }
                } else
                if ("action_get_pre_data_size".equals(intent.getAction()) && com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, intent.getLongExtra("size", 0L));
                    return;
                }
            }
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final com.qihoo.security.ui.main.c.a av = new com.qihoo.security.ui.main.c.a() {

        final CleanupFragment a;

        public void a(int i1)
        {
            if (!a.a(a) || !a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, i1) {

                    final int a;
                    final _cls15 b;

                    public void run()
                    {
                        if (b.a.isAdded() && b.a.a(b.a))
                        {
                            if (CleanupFragment.e(b.a) == 0)
                            {
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a, a);
                                return;
                            }
                            if (CleanupFragment.e(b.a) == 2)
                            {
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(b.a, a);
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a, a);
                                return;
                            }
                        }
                    }

            
            {
                b = _pcls15;
                a = i1;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final h aw = new h() {

        final CleanupFragment a;

        public void a(String s1)
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, s1) {

                    final String a;
                    final _cls16 b;

                    public void run()
                    {
                        if (!b.a.isAdded())
                        {
                            return;
                        } else
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.f(b.a).setText(a);
                            return;
                        }
                    }

            
            {
                b = _pcls16;
                a = s1;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final d ax = new d() {

        final CleanupFragment a;

        public void a()
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this) {

                    final _cls17 a;

                    public void run()
                    {
                        if (!a.a.isAdded())
                        {
                            return;
                        } else
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.h(a.a).a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.h(a.a).getProgress(), 360F, 1000, CleanupFragment.i(a.a));
                            return;
                        }
                    }

            
            {
                a = _pcls17;
                super();
            }
                });
                return;
            }
        }

        public void a(int i1, int j1)
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, i1, j1) {

                    final int a;
                    final int b;
                    final _cls17 c;

                    public void run()
                    {
                        if (!c.a.isAdded() || CleanupFragment.g(c.a) == null || CleanupFragment.g(c.a).b())
                        {
                            return;
                        } else
                        {
                            float f1 = (float)a / 100F;
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.h(c.a).a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.h(c.a).getProgress(), f1 * 360F, b, null);
                            return;
                        }
                    }

            
            {
                c = _pcls17;
                a = i1;
                b = j1;
                super();
            }
                });
                return;
            }
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final android.view.View.OnClickListener ay = new android.view.View.OnClickListener() {

        final CleanupFragment a;

        public void onClick(View view)
        {
            com.qihoo.security.ui.b.b.a(10);
            com.qihoo.security.ui.result.f.a().a(3);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, 1);
            com.qihoo.security.support.b.c(18001);
            CleanupFragment.j(a).b();
            a.c_();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, true);
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private final com.qihoo.security.enginehelper.clean.a.b az = new com.qihoo.security.enginehelper.clean.a.b() {

        final CleanupFragment a;
        private c b;
        private boolean c;
        private final byte d[] = new byte[0];

        static boolean a(_cls19 _pcls19)
        {
            return _pcls19.c;
        }

        static boolean a(_cls19 _pcls19, boolean flag)
        {
            _pcls19.c = flag;
            return flag;
        }

        static byte[] b(_cls19 _pcls19)
        {
            return _pcls19.d;
        }

        static c c(_cls19 _pcls19)
        {
            return _pcls19.b;
        }

        public void a()
        {
            c = false;
            b = new c(new f(this) {

                final _cls19 a;

                public void a()
                {
                    synchronized (CleanupFragment.q(a.a))
                    {
                        if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a.a) && !CleanupFragment.r(a.a) && !com.qihoo.security.opti.trashclear.ui.mainpage._cls19.a(a))
                        {
                            CleanupFragment.s(a.a);
                        }
                    }
                    return;
                    exception;
                    abyte0;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                public void a(long l1)
                {
                    if (!a.a.isAdded())
                    {
                        return;
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(this, l1) {

                            final long a;
                            final _cls1 b;

                            public void run()
                            {
label0:
                                {
                                    {
                                        SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b.a.a), "clear_default_pre_last_data", a);
                                        while (!b.a.a.isAdded() || CleanupFragment.e(b.a.a) != 0 || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a.a)) 
                                        {
                                            return;
                                        }
                                        if (a <= 0L || a > 0x1400000L)
                                        {
                                            break label0;
                                        }
                                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a.a, true);
                                        Object obj;
                                        if (CleanupFragment.l(b.a.a).getVisibility() == 0)
                                        {
                                            obj = CleanupFragment.l(b.a.a);
                                        } else
                                        {
                                            obj = null;
                                        }
                                        CleanupFragment.n(b.a.a).a(((View) (obj)), null, CleanupFragment.m(b.a.a), null);
                                        CleanupFragment.m(b.a.a).setLocalText(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.o(b.a.a).a(0x7f0c0057));
                                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a.a, CleanupFragment.m(b.a.a).getText().toString());
                                        SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b.a.a), "sp_key_clear_show_prescan", true);
                                    }
                                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a.a, a);
                                    return;
                                }
                                if (a > 0x1400000L)
                                {
                                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a.a, true);
                                    if (CleanupFragment.l(b.a.a).getVisibility() == 0)
                                    {
                                        obj = CleanupFragment.l(b.a.a);
                                    } else
                                    {
                                        obj = null;
                                    }
                                    CleanupFragment.n(b.a.a).a(((View) (obj)), null, CleanupFragment.m(b.a.a), null);
                                    obj = (new StringBuilder()).append(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(SecurityApplication.a(), a)).append("+ ").toString();
                                    CleanupFragment.m(b.a.a).setLocalText(CleanupFragment.p(b.a.a).a(0x7f0c0056, new Object[] {
                                        obj
                                    }));
                                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(b.a.a, CleanupFragment.m(b.a.a).getText().toString());
                                    SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b.a.a), "sp_key_clear_show_prescan", true);
                                } else
                                {
                                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a.a, false);
                                    if (CleanupFragment.l(b.a.a).getVisibility() != 0)
                                    {
                                        obj = CleanupFragment.l(b.a.a);
                                    } else
                                    {
                                        obj = null;
                                    }
                                    if (CleanupFragment.m(b.a.a).getVisibility() == 0)
                                    {
                                        CleanupFragment.n(b.a.a).a(CleanupFragment.m(b.a.a), null, ((View) (obj)), null);
                                    }
                                }
                                if (false)
                                {
                                } else
                                {
                                    break MISSING_BLOCK_LABEL_258;
                                }
                            }

            
            {
                b = _pcls1;
                a = l1;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = _pcls19;
                super();
            }
            });
            b.a();
        }

        public void a(int i1, Map map)
        {
            for (map = com.qihoo.security.opti.trashclear.e.a(i1, map); CleanupFragment.r(a) || !a.isAdded() || b == null;)
            {
                return;
            }

            b.a(((com.qihoo.security.opti.trashclear.d) (map)).k.f() + CleanupFragment.t(a));
        }

        public void a(Map map)
        {
        }

        public void b()
        {
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, false);
                c = true;
            }
            if (b != null)
            {
                b.b();
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b(int i1, Map map)
        {
            map = com.qihoo.security.opti.trashclear.e.a(i1, map);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a, map);
            if (CleanupFragment.r(a) || !a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, map) {

                    final com.qihoo.security.opti.trashclear.d a;
                    final _cls19 b;

                    public void run()
                    {
                        while (CleanupFragment.r(b.a) || !b.a.isAdded() || CleanupFragment.e(b.a) != 0 || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a)) 
                        {
                            return;
                        }
                        synchronized (com.qihoo.security.opti.trashclear.ui.mainpage._cls19.b(b))
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage._cls19.a(b, true);
                            if (com.qihoo.security.opti.trashclear.ui.mainpage._cls19.c(b) != null)
                            {
                                com.qihoo.security.opti.trashclear.ui.mainpage._cls19.c(b).a(a.k.f() + CleanupFragment.t(b.a));
                            }
                            if (com.qihoo.security.opti.trashclear.ui.mainpage._cls19.c(b) != null)
                            {
                                com.qihoo.security.opti.trashclear.ui.mainpage._cls19.c(b).b();
                            }
                        }
                        return;
                        exception;
                        abyte0;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                b = _pcls19;
                a = d1;
                super();
            }
                });
                return;
            }
        }

        public void c()
        {
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, false);
                c = true;
            }
            if (b != null)
            {
                b.b();
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                a = CleanupFragment.this;
                super();
            }
    };
    private int k;
    private String l;
    private com.qihoo.security.ui.b.a.f m;
    private View n;
    private CircleProgress o;
    private ElasticImageButton p;
    private ScanButtonTopView q;
    private View r;
    private RadarProgressBar s;
    private WaveView t;
    private WaveTextView u;
    private WaveTextView v;
    private WaveTextView w;
    private RevealPanel x;
    private RevealPanel y;
    private RevealPanel z;

    public CleanupFragment()
    {
        k = 0;
        ai = 0L;
        ar = false;
        as = false;
    }

    static WaveTextView A(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.u;
    }

    private void A()
    {
        F();
        if (aa != null)
        {
            aa.b();
        }
        if (ab != null)
        {
            ab.a();
        }
        byte abyte0[] = G;
        abyte0;
        JVM INSTR monitorenter ;
        long l2;
        long l3;
        F = true;
        d();
        if (k == 2)
        {
            a(true);
        }
        if (!E || D == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        l2 = System.currentTimeMillis();
        l3 = ai;
        if (ao != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        long l1 = 0L;
_L2:
        com.qihoo.security.support.b.a(18318, "0", String.valueOf(l2 - l3), String.valueOf(l1));
        D.c();
        E = false;
        abyte0;
        JVM INSTR monitorexit ;
        return;
        l1 = ao.k.e();
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static WaveTextView B(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.v;
    }

    private void B()
    {
        if (Q != null)
        {
            Q.a();
            Q.removeMessages(2);
        }
        synchronized (G)
        {
            I = true;
            if (H && D != null)
            {
                D.c();
                H = false;
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static RevealPanel C(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.x;
    }

    private void C()
    {
        if (k == 5 || k == 6)
        {
            P = new k(this);
            P.sendEmptyMessageDelayed(1, 500L);
        }
    }

    static int D(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.al;
    }

    private void D()
    {
        if (isAdded())
        {
            if (k == 5)
            {
                k = 4;
                a(false, false, null);
                return;
            }
            if (k == 6)
            {
                k = 3;
                Intent intent = new Intent(B, com/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity);
                Bundle bundle = ClearListActivity.a(false, g(), false);
                bundle.putLong("memorySize", ap);
                intent.putExtras(bundle);
                startActivityForResult(intent, 11);
                return;
            }
        }
    }

    static RevealPanel E(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.y;
    }

    private void E()
    {
        F();
        aj.acquire();
    }

    static RevealPanel F(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.z;
    }

    private void F()
    {
        aj.setReferenceCounted(false);
        aj.release();
    }

    static WaveView G(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.t;
    }

    private void G()
    {
        a(350L);
    }

    static g H(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.aa;
    }

    private void H()
    {
        if (aa != null)
        {
            aa.b();
        }
        if (ab != null)
        {
            ab.a();
        }
        d();
    }

    static long I(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ap;
    }

    private void I()
    {
        F();
        h.sendMessageDelayed(h.obtainMessage(1), 1000L);
        byte abyte0[] = G;
        abyte0;
        JVM INSTR monitorenter ;
        long l2;
        long l3;
        F = true;
        if (ab != null)
        {
            ab.a();
            ab.d();
        }
        if (!E || D == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        l2 = System.currentTimeMillis();
        l3 = ai;
        if (ao != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        long l1 = 0L;
_L2:
        com.qihoo.security.support.b.a(18318, "1", String.valueOf(l2 - l3), String.valueOf(l1));
        D.c();
        E = false;
        abyte0;
        JVM INSTR monitorexit ;
        return;
        l1 = ao.k.e();
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void J(CleanupFragment cleanupfragment)
    {
        cleanupfragment.d();
    }

    static void K(CleanupFragment cleanupfragment)
    {
        cleanupfragment.F();
    }

    static long L(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ai;
    }

    static void M(CleanupFragment cleanupfragment)
    {
        cleanupfragment.t();
    }

    static com.qihoo.security.enginehelper.clean.a.b N(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.az;
    }

    static com.qihoo.security.enginehelper.clean.a O(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.D;
    }

    static com.qihoo.security.locale.d P(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.f;
    }

    static com.qihoo.security.locale.d Q(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.f;
    }

    static View R(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.n;
    }

    static com.qihoo.security.locale.d S(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.f;
    }

    static View T(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.A;
    }

    static void U(CleanupFragment cleanupfragment)
    {
        cleanupfragment.v();
    }

    static h V(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.aw;
    }

    static String[] W(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.Z;
    }

    static String X(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.S;
    }

    static View Y(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.r;
    }

    static void Z(CleanupFragment cleanupfragment)
    {
        cleanupfragment.s();
    }

    private int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return getResources().getColor(0x7f080058);
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return getResources().getColor(0x7f080057);
        } else
        {
            return getResources().getColor(0x7f080056);
        }
    }

    static long a(CleanupFragment cleanupfragment, long l1)
    {
        cleanupfragment.ap = l1;
        return l1;
    }

    static b a(CleanupFragment cleanupfragment, b b1)
    {
        cleanupfragment.ac = b1;
        return b1;
    }

    static g a(CleanupFragment cleanupfragment, g g1)
    {
        cleanupfragment.aa = g1;
        return g1;
    }

    static String a(Context context, long l1)
    {
        return b(context, l1);
    }

    private void a(int i1)
    {
        t.setAboveWaveColor(0xffffff & i1 | 0x66000000);
        t.setBelowWaveColor(i1);
        u.setTextColor(i1);
        v.setTextColor(i1);
        w.setTextColor(i1);
        s.setColor(i1);
        M.setTextColor(i1);
        RevealPanel revealpanel = x;
        revealpanel;
        JVM INSTR monitorenter ;
        if (!(x.getTag() instanceof Number) || ((Long)x.getTag()).longValue() != 0L) goto _L2; else goto _L1
_L1:
        int j1 = getResources().getColor(0x7f080056);
_L5:
        x.setTitleColor(j1);
        x.setColor(j1);
        x.setSummaryColor(j1);
        revealpanel = y;
        revealpanel;
        JVM INSTR monitorenter ;
        if (!(y.getTag() instanceof Number) || ((Long)y.getTag()).longValue() != 0L) goto _L4; else goto _L3
_L3:
        j1 = getResources().getColor(0x7f080056);
_L6:
        y.setTitleColor(j1);
        y.setColor(j1);
        y.setSummaryColor(j1);
        revealpanel = z;
        revealpanel;
        JVM INSTR monitorenter ;
        j1 = i1;
        if (!(z.getTag() instanceof Number))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        j1 = i1;
        if (((Long)z.getTag()).longValue() == 0L)
        {
            j1 = getResources().getColor(0x7f080056);
        }
        z.setTitleColor(j1);
        z.setColor(j1);
        z.setSummaryColor(j1);
        revealpanel;
        JVM INSTR monitorexit ;
        return;
_L2:
        j1 = i1;
          goto _L5
        Exception exception;
        exception;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        j1 = i1;
          goto _L6
        exception;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception;
          goto _L5
    }

    private void a(long l1)
    {
        A.setVisibility(4);
        a.setVisibility(0);
        com.nineoldandroids.a.k k1 = com.nineoldandroids.a.k.a(a, "translationY", new float[] {
            (float)a.getHeight(), 0.0F
        });
        k1.d(l1);
        k1.a(new AccelerateInterpolator());
        k1.a(new com.nineoldandroids.a.b() {

            final CleanupFragment a;

            public void b(com.nineoldandroids.a.a a1)
            {
                a.a.clearAnimation();
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        k1.a();
    }

    private void a(long l1, com.nineoldandroids.a.b b1)
    {
        com.nineoldandroids.a.k k1 = com.nineoldandroids.a.k.a(a, "translationY", new float[] {
            0.0F, (float)a.getHeight()
        });
        k1.d(l1);
        k1.a(new AccelerateInterpolator());
        k1.a(new com.nineoldandroids.a.b(b1) {

            final com.nineoldandroids.a.b a;
            final CleanupFragment b;

            public void b(com.nineoldandroids.a.a a1)
            {
                b.a.setVisibility(4);
                b.a.clearAnimation();
                if (a != null)
                {
                    a.b(a1);
                }
            }

            
            {
                b = CleanupFragment.this;
                a = b1;
                super();
            }
        });
        k1.a();
    }

    private void a(com.nineoldandroids.a.b b1)
    {
        a(350L, b1);
    }

    private void a(com.qihoo.security.opti.trashclear.d d1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l1 = d1.k.b();
        long l2 = d1.k.c();
        if (aq > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, aq, false));
            stringbuilder.append(";");
        }
        if (l1 > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, l1, false));
            stringbuilder.append(";");
        }
        if (l2 > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, l2, false));
        }
        long l3 = aq;
        d1 = com.qihoo.security.opti.b.d.a(B, l1 + l3 + l2);
        SharedPref.a(B, "sp_key_clear_prescan_count", stringbuilder.toString());
        SharedPref.a(B, "sp_key_clear_prescan_total_count", d1);
    }

    static void a(CleanupFragment cleanupfragment, int i1)
    {
        cleanupfragment.d(i1);
    }

    static void a(CleanupFragment cleanupfragment, com.qihoo.security.opti.trashclear.d d1)
    {
        cleanupfragment.a(d1);
    }

    static void a(CleanupFragment cleanupfragment, String s1)
    {
        cleanupfragment.b(s1);
    }

    static void a(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.a(flag);
    }

    private void a(boolean flag)
    {
        com.qihoo.security.ui.b.b.b(10);
        com.qihoo.security.ui.b.b.a();
        if (ah == null || ah.k.e() == 0L)
        {
            if (flag)
            {
                w();
                return;
            }
            if (isResumed() || flag)
            {
                k = 4;
                a(false, flag, null);
                return;
            } else
            {
                k = 5;
                return;
            }
        }
        if (isResumed() || flag)
        {
            k = 3;
            Intent intent = new Intent(B, com/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity);
            Bundle bundle = ClearListActivity.a(false, g(), flag);
            bundle.putLong("memorySize", ap);
            intent.putExtras(bundle);
            startActivityForResult(intent, 11);
            return;
        } else
        {
            k = 6;
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        com.qihoo.security.support.b.b(18319);
        a(g(), false);
        a_(f.a(0x7f0c01d3));
        k = 0;
        x();
        if (flag)
        {
            an.a(flag1);
            b(an, flag);
            return;
        }
        p.a(flag);
        b(((com.nineoldandroids.a.a.a) (null)), flag);
        if (flag1)
        {
            if (c(com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean))
            {
                a(0L);
                return;
            } else
            {
                G();
                return;
            }
        } else
        {
            G();
            return;
        }
    }

    private void a(boolean flag, boolean flag1, String s1)
    {
        O.setVisibility(8);
        Object obj = new com.qihoo.security.ui.result.view.CleanResultFragment.CleanData();
        obj.isDeepClean = flag;
        ar = flag;
        obj.cleanSize = s1;
        obj.isCancel = flag1;
        s1 = CleanResultFragment.a(((com.qihoo.security.ui.result.view.CleanResultFragment.CleanData) (obj)));
        obj = getActivity().e().a();
        ((android.support.v4.app.h) (obj)).a(0x7f0b0073, s1);
        ((android.support.v4.app.h) (obj)).a("clean_result_fragment");
        ((android.support.v4.app.h) (obj)).b();
    }

    static boolean a(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.F;
    }

    static boolean a(CleanupFragment cleanupfragment, com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        return cleanupfragment.c(recommendtype);
    }

    static String[] a(String s1, String s2)
    {
        return b(s1, s2);
    }

    static void aa(CleanupFragment cleanupfragment)
    {
        cleanupfragment.z();
    }

    static void ab(CleanupFragment cleanupfragment)
    {
        cleanupfragment.D();
    }

    static void ac(CleanupFragment cleanupfragment)
    {
        cleanupfragment.p();
    }

    static void ad(CleanupFragment cleanupfragment)
    {
        cleanupfragment.G();
    }

    static int b(CleanupFragment cleanupfragment, int i1)
    {
        cleanupfragment.al = i1;
        return i1;
    }

    static long b(CleanupFragment cleanupfragment, long l1)
    {
        cleanupfragment.aq = l1;
        return l1;
    }

    static Activity b(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.C;
    }

    static com.qihoo.security.opti.trashclear.d b(CleanupFragment cleanupfragment, com.qihoo.security.opti.trashclear.d d1)
    {
        cleanupfragment.ah = d1;
        return d1;
    }

    static b b(CleanupFragment cleanupfragment, b b1)
    {
        cleanupfragment.ad = b1;
        return b1;
    }

    private static String b(Context context, long l1)
    {
        return com.qihoo.security.opti.b.d.a(context, l1, false);
    }

    private void b(long l1)
    {
        if (l1 <= 0x3200000L)
        {
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, true);
            return;
        }
        if (l1 <= 0xc800000L)
        {
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
            return;
        } else
        {
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
            return;
        }
    }

    private void b(com.qihoo.security.opti.trashclear.d d1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l1 = d1.l.b();
        long l2 = d1.l.c();
        long l3 = d1.l.d();
        if (l1 > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, l1, false));
            stringbuilder.append(";");
        }
        if (l2 > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, l2, false));
            stringbuilder.append(";");
        }
        if (l3 > 0L)
        {
            stringbuilder.append(com.qihoo.security.opti.b.d.a(B, l3, false));
        }
        SharedPref.a(B, "sp_key_clear_scan_count", stringbuilder.toString());
    }

    private void b(String s1)
    {
        String s2 = (new StringBuilder()).append("RecommendType.").append(com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean.name()).toString();
        RecommendHelper.a().a(s2, s1);
    }

    private void b(boolean flag)
    {
        b(true, flag);
    }

    private void b(boolean flag, boolean flag1)
    {
        if (O != null && O.getVisibility() != 0 && getActivity() != null && !getActivity().isFinishing())
        {
            O.setVisibility(0);
            android.support.v4.app.f f1 = getActivity().e();
            a(f1);
            f1.b("clean_result_fragment", 1);
            a(flag, flag1);
        }
    }

    static boolean b(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.R = flag;
        return flag;
    }

    private static String[] b(String s1, String s2)
    {
        String as1[] = new String[2];
        as1[0] = "0";
        as1[1] = s2;
        if (s1 != null)
        {
            s2 = s1.replaceAll("[a-z]*[A-Z]*+", "");
            s1 = s1.replaceAll("\\d*\\.*+", "");
            if (!TextUtils.isEmpty(s2))
            {
                as1[0] = s2;
                as1[1] = s1;
            }
        }
        return as1;
    }

    static com.qihoo.security.opti.trashclear.d c(CleanupFragment cleanupfragment, com.qihoo.security.opti.trashclear.d d1)
    {
        cleanupfragment.ao = d1;
        return d1;
    }

    static b c(CleanupFragment cleanupfragment, b b1)
    {
        cleanupfragment.ae = b1;
        return b1;
    }

    private String c(int i1)
    {
        return com.qihoo.security.locale.d.a().a(i1);
    }

    static void c(CleanupFragment cleanupfragment, int i1)
    {
        cleanupfragment.a(i1);
    }

    static void c(CleanupFragment cleanupfragment, long l1)
    {
        cleanupfragment.b(l1);
    }

    static boolean c(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.E;
    }

    static boolean c(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.ak = flag;
        return flag;
    }

    static int d(CleanupFragment cleanupfragment, int i1)
    {
        cleanupfragment.k = i1;
        return i1;
    }

    static b d(CleanupFragment cleanupfragment, b b1)
    {
        cleanupfragment.af = b1;
        return b1;
    }

    private void d()
    {
label0:
        {
            h.removeMessages(0);
            if (ac != null)
            {
                if (F || !isAdded())
                {
                    ac.b();
                } else
                {
                    ac.c();
                }
            }
            if (ad != null)
            {
                if (F || !isAdded())
                {
                    ad.b();
                } else
                {
                    ad.c();
                }
            }
            if (ae != null)
            {
                if (F || !isAdded())
                {
                    ae.b();
                } else
                {
                    ae.c();
                }
            }
            if (af != null)
            {
                if (F || !isAdded())
                {
                    af.b();
                } else
                {
                    af.c();
                }
            }
            if (ag != null)
            {
                if (!F && isAdded())
                {
                    break label0;
                }
                ag.b();
            }
            return;
        }
        ag.c();
    }

    private void d(int i1)
    {
        q.setColor(i1);
        o.setCricleProgressColor(i1);
        x.setColor(i1);
        y.setColor(i1);
        z.setColor(i1);
        L.setTextColor(i1);
        N.setTextColor(i1);
    }

    static void d(CleanupFragment cleanupfragment, long l1)
    {
        cleanupfragment.a(l1);
    }

    static void d(CleanupFragment cleanupfragment, com.qihoo.security.opti.trashclear.d d1)
    {
        cleanupfragment.b(d1);
    }

    static boolean d(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.H;
    }

    static boolean d(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.H = flag;
        return flag;
    }

    static int e(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.k;
    }

    static b e(CleanupFragment cleanupfragment, b b1)
    {
        cleanupfragment.ag = b1;
        return b1;
    }

    private void e(int i1)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            o.setRealProgress(i1);
            return;
        }
    }

    static void e(CleanupFragment cleanupfragment, int i1)
    {
        cleanupfragment.e(i1);
    }

    static boolean e(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.E = flag;
        return flag;
    }

    static LocaleTextView f(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.M;
    }

    static boolean f(CleanupFragment cleanupfragment, boolean flag)
    {
        cleanupfragment.I = flag;
        return flag;
    }

    static e g(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ab;
    }

    static RadarProgressBar h(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.s;
    }

    static com.qihoo.security.malware.widget.RadarProgressBar.a i(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.at;
    }

    static ElasticImageButton j(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.p;
    }

    static Context k(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.B;
    }

    static LocaleTextView l(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.L;
    }

    private void l()
    {
        A = m.a(0x7f0b00bd);
        x = (RevealPanel)m.a(0x7f0b00be);
        y = (RevealPanel)m.a(0x7f0b00bf);
        z = (RevealPanel)m.a(0x7f0b00c0);
        n = m.a(0x7f0b00b3);
        o = (CircleProgress)m.a(0x7f0b00b4);
        p = (ElasticImageButton)m.a(0x7f0b00b5);
        r = m.a(0x7f0b00b6);
        s = (RadarProgressBar)m.a(0x7f0b00c3);
        t = (WaveView)m.a(0x7f0b00c4);
        u = (WaveTextView)m.a(0x7f0b00c5);
        v = (WaveTextView)m.a(0x7f0b00c6);
        w = (WaveTextView)m.a(0x7f0b00c7);
        L = (LocaleTextView)m.a(0x7f0b00b8);
        M = (LocaleTextView)m.a(0x7f0b00b9);
        N = (LocaleTextView)m.a(0x7f0b00ba);
        O = m.a(0x7f0b00b1);
        a = (BottomInfoView)m.a(0x7f0b00bc);
    }

    static LocaleTextView m(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.N;
    }

    private void m()
    {
        C = getActivity();
        B = SecurityApplication.a();
        D = com.qihoo.security.enginehelper.clean.a.a(B);
        D.e();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("action_get_data_size");
        intentfilter.addAction("action_get_pre_data_size");
        C.registerReceiver(au, intentfilter);
        am = new com.qihoo.security.ui.main.b(B);
        S = f.a(0x7f0c0123);
        W = f.a(0x7f0c01ee);
        X = f.a(0x7f0c01ed);
        Y = f.a(0x7f0c01ec);
        T = (new StringBuilder()).append(S).append(W).toString();
        U = (new StringBuilder()).append(S).append(X).toString();
        V = (new StringBuilder()).append(S).append(Y).toString();
        Z = (new String[] {
            T, U, V
        });
        l = f.a(0x7f0c01e7);
        J = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        J.setDuration(350L);
        J.setInterpolator(com.qihoo.security.ui.b.c.a);
        K = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        K.setDuration(350L);
        K.setInterpolator(com.qihoo.security.ui.b.c.b);
        aj = ((PowerManager)getActivity().getSystemService("power")).newWakeLock(0x2000000a, "");
    }

    static com.qihoo.security.ui.main.b n(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.am;
    }

    private void n()
    {
        u.a(t);
        v.a(t);
        w.a(t);
        u.setRevertColor(-1);
        v.setRevertColor(-1);
        w.setRevertColor(-1);
        p.setTopView(q);
        p.setButtonAnimatorListener(aB);
        p.setOnClickListener(ay);
        x.setClickable(false);
        y.setClickable(false);
        z.setClickable(false);
        com.qihoo.security.ui.b.a a1 = com.qihoo.security.ui.b.a.a();
        x.setIcon(a1.a(0x7f02009b));
        y.setIcon(a1.a(0x7f020099));
        z.setIcon(a1.a(0x7f02009c));
        x.setSummary(0x7f0c003d);
        y.setSummary(0x7f0c003e);
        z.setSummary(0x7f0c0222);
        int i1 = getResources().getColor(0x7f080041);
        x.setSummaryColor(i1);
        y.setSummaryColor(i1);
        z.setSummaryColor(i1);
        x.setCallback(new com.qihoo.security.widget.RevealRippleLayout.b() {

            final CleanupFragment a;

            public boolean a(int j1, boolean flag)
            {
                if (j1 >= 30)
                {
                    if (!flag);
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        y.setCallback(new com.qihoo.security.widget.RevealRippleLayout.b() {

            final CleanupFragment a;

            public boolean a(int j1, boolean flag)
            {
                if (j1 >= 30)
                {
                    if (!flag);
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        z.setCallback(new com.qihoo.security.widget.RevealRippleLayout.b() {

            final CleanupFragment a;

            public void a()
            {
            }

            public boolean a(int j1, boolean flag)
            {
                return j1 < 30;
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        d(getResources().getColor(0x7f080056));
        a(av);
    }

    static com.qihoo.security.locale.d o(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.f;
    }

    private void o()
    {
        String s1;
        if (!SharedPref.a("last_trash_scan_time_complete"))
        {
            s1 = c(0x7f0c0051);
        } else
        {
            long l1 = SharedPref.b(B, "last_trash_scan_time_complete", 0L);
            int i1 = (int)(System.currentTimeMillis() / 0x5265c00L - l1 / 0x5265c00L);
            if (i1 > 365)
            {
                s1 = c(0x7f0c0051);
            } else
            {
                long l2 = SharedPref.e(B);
                long l4 = com.qihoo.security.opti.b.d.b(B) - l2;
                if ((float)l4 > 1.048576E+08F && l2 > 0L)
                {
                    s1 = com.qihoo.security.locale.d.a().a(0x7f0c0053, new Object[] {
                        b(B, l4)
                    });
                } else
                if (i1 > 3)
                {
                    s1 = com.qihoo.security.locale.d.a().a(0x7f0c0052);
                } else
                {
                    long l3 = SharedPref.d(B);
                    if (l3 == 0L)
                    {
                        s1 = com.qihoo.security.locale.d.a().a(0x7f0c0051);
                    } else
                    {
                        s1 = com.qihoo.security.locale.d.a().a(0x7f0c0054, new Object[] {
                            b(B, l3)
                        });
                    }
                }
            }
        }
        L.setLocalText(s1);
        if (L.getVisibility() == 0)
        {
            b(s1);
            SharedPref.a(B, "sp_key_clear_show_prescan", false);
        }
    }

    static com.qihoo.security.locale.d p(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.f;
    }

    private void p()
    {
        (new Thread() {

            final CleanupFragment a;

            public void run()
            {
_L2:
                return;
                if (!a.isAdded() || CleanupFragment.e(a) != 0 || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a) || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a)) goto _L2; else goto _L1
_L1:
                ArrayList arraylist;
                if (!com.qihoo.security.opti.trashclear.b.a().d())
                {
                    continue; /* Loop/switch isn't completed */
                }
                System.currentTimeMillis();
                arraylist = com.qihoo.security.opti.trashclear.b.a().c();
                if (!a.isAdded()) goto _L2; else goto _L3
_L3:
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this, arraylist) {

                    final ArrayList a;
                    final _cls5 b;

                    public void run()
                    {
label0:
                        {
                            synchronized (CleanupFragment.q(b.a))
                            {
                                if (b.a.isAdded())
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        if (CleanupFragment.e(b.a) == 0 && !com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(b.a) && !com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(b.a))
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(b.a, true);
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.f(b.a, false);
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(b.a, 0L);
                            if (!SharedPref.b(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b.a), "sp_key_has_clear_memory", false))
                            {
                                ProcessClearService.e();
                            }
                            CleanupFragment.O(b.a).a(CleanupFragment.N(b.a));
                            CleanupFragment.O(b.a).a(CleanScanType.PREPOSE);
                            CleanupFragment.O(b.a).a(new CleanTrashType[] {
                                CleanTrashType.SYSTEM, CleanTrashType.CACHE
                            });
                            CleanupFragment.O(b.a).a(a);
                            CleanupFragment.O(b.a).b();
                            com.qihoo.security.opti.trashclear.b.a().g();
                            SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b.a), "clear_default_pre_last_time", System.currentTimeMillis());
                        }
                        abyte0;
                        JVM INSTR monitorexit ;
                        return;
                        exception;
                        abyte0;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                b = _pcls5;
                a = arraylist;
                super();
            }
                });
                return;
                if (com.qihoo.security.opti.trashclear.b.a().e() || !com.qihoo.security.opti.trashclear.b.a().f() || com.qihoo.security.opti.trashclear.b.a().h() < 3) goto _L2; else goto _L4
_L4:
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(this) {

                    final _cls5 a;

                    public void run()
                    {
label0:
                        {
                            {
                                while (!a.a.isAdded() || CleanupFragment.e(a.a) != 0 || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a.a) || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a.a)) 
                                {
                                    return;
                                }
                                long l1 = SharedPref.b(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(a.a), "clear_default_pre_last_data", 0L);
                                if (l1 <= 0L || l1 > 0x1400000L)
                                {
                                    break label0;
                                }
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a.a, true);
                                Object obj;
                                if (CleanupFragment.l(a.a).getVisibility() == 0)
                                {
                                    obj = CleanupFragment.l(a.a);
                                } else
                                {
                                    obj = null;
                                }
                                CleanupFragment.n(a.a).a(((View) (obj)), null, CleanupFragment.m(a.a), null);
                                CleanupFragment.m(a.a).setLocalText(CleanupFragment.P(a.a).a(0x7f0c0057));
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, CleanupFragment.m(a.a).getText().toString());
                                SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(a.a), "sp_key_clear_show_prescan", true);
                            }
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a.a, l1);
                            return;
                        }
                        if (l1 > 0x1400000L)
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a.a, true);
                            if (CleanupFragment.l(a.a).getVisibility() == 0)
                            {
                                obj = CleanupFragment.l(a.a);
                            } else
                            {
                                obj = null;
                            }
                            CleanupFragment.n(a.a).a(((View) (obj)), null, CleanupFragment.m(a.a), null);
                            obj = (new StringBuilder()).append(com.qihoo.security.opti.b.d.a(SecurityApplication.a(), l1, true)).append("+ ").toString();
                            CleanupFragment.m(a.a).setLocalText(CleanupFragment.Q(a.a).a(0x7f0c0056, new Object[] {
                                obj
                            }));
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, CleanupFragment.m(a.a).getText().toString());
                            SharedPref.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(a.a), "sp_key_clear_show_prescan", true);
                        } else
                        {
                            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.c(a.a, false);
                            if (CleanupFragment.l(a.a).getVisibility() != 0)
                            {
                                obj = CleanupFragment.l(a.a);
                            } else
                            {
                                obj = null;
                            }
                            if (CleanupFragment.m(a.a).getVisibility() == 0)
                            {
                                CleanupFragment.n(a.a).a(CleanupFragment.m(a.a), null, ((View) (obj)), null);
                            }
                        }
                        if (false)
                        {
                        } else
                        {
                            break MISSING_BLOCK_LABEL_221;
                        }
                    }

            
            {
                a = _pcls5;
                super();
            }
                });
                return;
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        }).start();
    }

    private void q()
    {
        int i1 = getResources().getColor(0x7f080056);
        t.setProgress(0);
        t.setAboveWaveColor(0xffffff & i1 | 0x66000000);
        t.setBelowWaveColor(i1);
        u.setTextColor(i1);
        v.setTextColor(i1);
        w.setTextColor(i1);
        u.setText("0");
        v.setText(l);
        s.setColor(i1);
    }

    static byte[] q(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.G;
    }

    private void r()
    {
        synchronized (x)
        {
            x.setTag(Long.valueOf(0L));
            x.setTitle((new StringBuilder()).append("0").append(l).toString());
        }
        synchronized (y)
        {
            y.setTag(Long.valueOf(0L));
            y.setTitle((new StringBuilder()).append("0").append(l).toString());
        }
        synchronized (z)
        {
            z.setTag(Long.valueOf(0L));
            z.setTitle((new StringBuilder()).append("0").append(l).toString());
        }
        int i1 = getResources().getColor(0x7f080056);
        x.setTitleColor(i1);
        x.setColor(i1);
        x.setSummaryColor(i1);
        y.setTitleColor(i1);
        y.setColor(i1);
        y.setSummaryColor(i1);
        z.setTitleColor(i1);
        z.setColor(i1);
        z.setSummaryColor(i1);
        return;
        exception;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    static boolean r(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.I;
    }

    private void s()
    {
        M.setTextColor(getResources().getColor(0x7f080056));
        r();
        q();
    }

    static void s(CleanupFragment cleanupfragment)
    {
        cleanupfragment.B();
    }

    static long t(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.aq;
    }

    private void t()
    {
        com.qihoo.utils.notice.a.a().b(4103);
        com.qihoo.utils.notice.a.a().b(4110);
        al = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            B.stopService(new Intent(B, com/qihoo/security/service/SecurityService));
        }
        Intent intent = new Intent(B, com/qihoo/security/service/SecurityService);
        intent.setAction("com.qihoo.security.clean.scan.status");
        intent.putExtra("hasScan", true);
        B.startService(intent);
        ak = false;
        if (H)
        {
            B();
        }
        u();
    }

    static b u(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ac;
    }

    private void u()
    {
        RecommendHelper.a().d(null);
        RecommendHelper.a().b(com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean);
        n.setAnimation(J);
        J.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CleanupFragment a;

            public void onAnimationEnd(Animation animation)
            {
                CleanupFragment.R(a).setVisibility(4);
                com.qihoo.security.ui.b.b.c(4);
                a.a(new com.nineoldandroids.a.b(this) {

                    final _cls7 a;

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        a.a.a_(CleanupFragment.S(a.a).a(0x7f0c00a9));
                        CleanupFragment.T(a.a).setVisibility(0);
                        CleanupFragment.C(a.a).e();
                        CleanupFragment.F(a.a).e();
                        CleanupFragment.E(a.a).e();
                        CleanupFragment.U(a.a);
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.f(a.a).setVisibility(0);
                        a1 = new com.nineoldandroids.a.b(this) {

                            final _cls1 a;

                            public void b(com.nineoldandroids.a.a a1)
                            {
                                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a.a, new g(CleanupFragment.V(a.a.a), CleanupFragment.W(a.a.a)));
                                CleanupFragment.H(a.a.a).a();
                            }

            
            {
                a = _pcls1;
                super();
            }
                        };
                        com.nineoldandroids.a.k k1 = com.nineoldandroids.a.k.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.f(a.a), "alpha", new float[] {
                            0.0F, 1.0F
                        });
                        k1.c(350L).a(a1);
                        k1.a();
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.f(a.a).setText(CleanupFragment.X(a.a));
                    }

            
            {
                a = _pcls7;
                super();
            }
                }, true);
                a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                com.qihoo.security.ui.b.b.a(4, CleanupFragment.R(a));
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        J.start();
        Object obj;
        com.nineoldandroids.a.b b1;
        if (L.getVisibility() == 0)
        {
            obj = L;
        } else
        {
            obj = N;
        }
        b1 = new com.nineoldandroids.a.b(((View) (obj))) {

            final View a;
            final CleanupFragment b;

            public void b(com.nineoldandroids.a.a a1)
            {
                a.setVisibility(4);
            }

            
            {
                b = CleanupFragment.this;
                a = view;
                super();
            }
        };
        obj = com.nineoldandroids.a.k.a(obj, "alpha", new float[] {
            0.0F
        });
        ((com.nineoldandroids.a.k) (obj)).c(350L).a(b1);
        ((com.nineoldandroids.a.k) (obj)).a();
        if (b == null || !b.a())
        {
            a(((com.nineoldandroids.a.b) (null)));
        } else
        {
            a(0L, ((com.nineoldandroids.a.b) (null)));
        }
        a(com.qihoo.security.ui.main.FragmentsObservable.Action.HideRecmdClean);
    }

    static b v(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ad;
    }

    private void v()
    {
        r.setAnimation(K);
        K.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CleanupFragment a;

            public void onAnimationEnd(Animation animation)
            {
                com.qihoo.security.ui.b.b.c(5);
                CleanupFragment.Y(a).setVisibility(0);
                CleanupFragment.aa(a);
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, false);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                com.qihoo.security.ui.b.b.a(5, CleanupFragment.Y(a));
                CleanupFragment.Z(a);
                CleanupFragment.G(a).a(false);
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.h(a).b();
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
        K.start();
    }

    static b w(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ae;
    }

    private void w()
    {
        a(true, false);
    }

    static b x(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.af;
    }

    private void x()
    {
        A.setVisibility(4);
        x.a(false);
        y.a(false);
        z.a(false);
        am.a(M, null, 0L, null, null, 0L);
        if (ak)
        {
            am.a(null, null, N, null);
        } else
        {
            am.a(null, null, L, null);
        }
        if (aa != null)
        {
            aa.b();
        }
        r.setVisibility(4);
        t.a(true);
        t.a();
        n.setVisibility(0);
        x.setSummary(0x7f0c003d);
        x.setSummaryColor(getResources().getColor(0x7f080041));
        y.setSummary(0x7f0c003e);
        y.setSummaryColor(getResources().getColor(0x7f080041));
        z.setSummary(0x7f0c0222);
        z.setSummaryColor(getResources().getColor(0x7f080041));
        y();
        o();
    }

    static b y(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.ag;
    }

    private void y()
    {
        this;
        JVM INSTR monitorenter ;
        if (k != 0) goto _L2; else goto _L1
_L1:
        boolean flag = R;
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        (new Thread(new k(this)) {

            final k a;
            final CleanupFragment b;

            public void run()
            {
                int i1 = 2;
                int j1 = com.qihoo.security.opti.b.d.a(com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.k(b));
                if (j1 >= 2)
                {
                    i1 = j1;
                }
                a.sendMessage(Message.obtain(a, 3, i1, 0));
            }

            
            {
                b = CleanupFragment.this;
                a = k1;
                super();
            }
        }).start();
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    static String z(CleanupFragment cleanupfragment)
    {
        return cleanupfragment.l;
    }

    private void z()
    {
        E();
        com.qihoo.security.ui.b.b.a(10, s, s);
        ai = System.currentTimeMillis();
        k = 2;
        if (ab != null)
        {
            ab.a();
        }
        ab = new e(ax);
        ab.c();
        if (h.hasMessages(0))
        {
            h.removeMessages(0);
        }
        h.sendMessageDelayed(h.obtainMessage(0), 60000L);
        synchronized (G)
        {
            ao = null;
            ah = null;
            F = false;
            E = true;
            ap = 0L;
            D.a(CleanScanType.FULL);
            D.a(null);
            D.a(null);
            D.a(aA);
            D.b();
            SharedPref.a(getActivity(), "last_trash_scan_time_complete", System.currentTimeMillis());
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        super.a();
        C.runOnUiThread(new Runnable() {

            final CleanupFragment a;

            public void run()
            {
                a.a(a.g(), false);
            }

            
            {
                a = CleanupFragment.this;
                super();
            }
        });
    }

    protected void a(Intent intent)
    {
        super.a(intent);
        if (("com.qihoo.security.notify.ACTION_CLEAN".equals(intent.getAction()) || "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP".equals(intent.getAction())) && p != null)
        {
            p.performClick();
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null && bundle.getBoolean("do_scan", false))
        {
            bundle.putBoolean("do_scan", false);
            if (k == 0)
            {
                a(false, false);
            } else
            if (k != 2)
            {
                if (k == 3)
                {
                    a(false, false);
                    return;
                }
                if (k == 4)
                {
                    b(false);
                    return;
                }
            }
        }
    }

    protected void a(Message message)
    {
        super.a(message);
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            I();
            return;

        case 1: // '\001'
            H();
            break;
        }
        a(true);
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        static class _cls14
        {

            static final int a[];

            static 
            {
                a = new int[FragmentAction.values().length];
                try
                {
                    a[FragmentAction.CLEAN_ACTION_UPDATE_COLOR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_DRAWER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.opti.trashclear.ui.mainpage._cls14.a[fragmentaction.ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 49
    //                   2 69
    //                   3 75
    //                   4 119
    //                   5 48;
           goto _L1 _L2 _L3 _L4 _L5 _L1
_L1:
        return;
_L2:
        if (bundle != null)
        {
            a((com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus)bundle.getSerializable("color"), false);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        b(true);
        return;
_L4:
        if (bundle != null && bundle.getBoolean("deepClean", false))
        {
            fragmentaction = new Intent(B, com/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity);
            fragmentaction.putExtras(bundle);
            startActivityForResult(fragmentaction, 11);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        b(false, false);
        return;
    }

    public boolean b()
    {
        while (k == 5 || k == 6 || R) 
        {
            return true;
        }
        if (E)
        {
            A();
            return true;
        }
        if (k == 4)
        {
            if (!ar)
            {
                com.qihoo.security.support.b.a(18313, 0L);
            } else
            {
                com.qihoo.security.support.b.a(18533, 0L);
            }
            b(true);
            return true;
        } else
        {
            return super.b();
        }
    }

    public void c()
    {
        if (k != 5 && k != 6 && !R)
        {
            if (E)
            {
                A();
                return;
            }
            if (k == 4)
            {
                if (!ar)
                {
                    com.qihoo.security.support.b.a(18313, 1L);
                } else
                {
                    com.qihoo.security.support.b.a(18533, 1L);
                }
                b(true);
                return;
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        m();
        l();
        n();
        a(false, false);
        bundle = getArguments();
        if (bundle != null && bundle.getBoolean("do_scan", false))
        {
            bundle.putBoolean("do_scan", false);
        }
        if (as)
        {
            as = false;
            bundle = getActivity().getIntent();
            if (("com.qihoo.security.notify.ACTION_CLEAN".equals(bundle.getAction()) || "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP".equals(bundle.getAction())) && p != null)
            {
                p.performClick();
            }
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
label0:
        {
label1:
            {
                {
                    boolean flag = false;
                    super.onActivityResult(i1, j1, intent);
                    if (i1 != 11)
                    {
                        break label0;
                    }
                    if (j1 != -1)
                    {
                        break label1;
                    }
                    Object obj = null;
                    long l1;
                    boolean flag1;
                    if (intent != null)
                    {
                        flag1 = intent.getBooleanExtra("isDeep", false);
                        flag = intent.getBooleanExtra("isCancel", false);
                        l1 = (long)intent.getFloatExtra("cleanSize", 0.0F);
                    } else
                    {
                        l1 = 0L;
                        flag1 = false;
                    }
                    intent = obj;
                    if (l1 > 0L)
                    {
                        SharedPref.a(B, "clean_trash_number", l1);
                        intent = b(B, l1);
                    }
                    k = 4;
                    a(flag1, flag, intent);
                }
                return;
            }
            if (intent != null)
            {
                flag = intent.getBooleanExtra("isDeep", false);
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                w();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 12)
        {
            b(false, false);
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_105;
_L1:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getIntent().getAction();
        if ("com.qihoo.security.notify.ACTION_CLEAN".equals(bundle) || "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP".equals(bundle))
        {
            as = getActivity().getIntent().getBooleanExtra("from_notify", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        q = new ScanButtonTopView(getActivity());
        q.setText(f.a(0x7f0c0104));
        q.setIcon(com.qihoo.security.ui.b.a.a().a(0x7f02009a));
        m = com.qihoo.security.ui.b.a.a().b(0x7f030033);
        if (m == null)
        {
            m = new com.qihoo.security.ui.b.a.f();
            m.b = layoutinflater.inflate(0x7f030033, viewgroup, false);
        }
        return m.b;
    }

    public void onDestroy()
    {
        super.onDestroy();
        t.a(true);
        synchronized (G)
        {
            if (D != null)
            {
                if (H)
                {
                    B();
                }
                if (E)
                {
                    A();
                }
                D.f();
            }
        }
        C.unregisterReceiver(au);
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onResume()
    {
        super.onResume();
        y();
        o();
        if (SharedPref.b(B, "clear_default_pre_is_need_run", false))
        {
            Q = new k(this);
            Q.sendEmptyMessageDelayed(2, 100L);
            SharedPref.a(B, "clear_default_pre_is_need_run", false);
        }
        C();
        if (a != null)
        {
            a.a();
            a.b();
        }
    }
}
