// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Random;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            Positionable

public class LayoutCostMeter
{
    public static interface Report
    {

        public abstract void a(String s, Enum aenum[], long al[], Enum aenum1[], int ai[]);
    }

    public static final class Response extends Enum
    {

        public static final Response a;
        public static final Response b;
        public static final Response c;
        public static final Response d;
        private static final Response e[];

        public static Response valueOf(String s)
        {
            return (Response)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Response, s);
        }

        public static Response[] values()
        {
            return (Response[])e.clone();
        }

        static 
        {
            a = new Response("ATTACH", 0);
            b = new Response("DETACH", 1);
            c = new Response("LAYOUT", 2);
            d = new Response("RENDER", 3);
            e = (new Response[] {
                a, b, c, d
            });
        }

        private Response(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Session
    {

        private static final Response k;
        private static final Response l;
        final View a;
        final Positionable b;
        final Strategy c;
        final int d;
        final EnumSet e;
        final EnumSet f;
        final int g[];
        final long h[];
        int i;
        boolean j;
        private c m[];
        private String n;
        private Trace o;
        private Report p;

        private void b()
        {
            if (m == null)
            {
                throw new IllegalStateException("already detached");
            }
            c ac[] = m;
            int j1 = ac.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ac[i1].b(a);
            }

            m = null;
            j = true;
        }

        private void c()
        {
            Arrays.fill(g, 0);
            o.a(n);
            a aa[] = a.values();
            int j1 = aa.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                a a1 = aa[i1];
                h[a1.ordinal()] = -a1.a();
            }

        }

        private void d()
        {
            if (i < d)
            {
                i = i + 1;
                f.addAll(e);
                float f1 = c.a(i, d);
                b.a(f1);
                return;
            }
            a aa[] = a.values();
            int j1 = aa.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                a a1 = aa[i1];
                long al[] = h;
                int k1 = a1.ordinal();
                al[k1] = al[k1] + a1.a();
            }

            o.a();
            b();
            p.a(n, a.values(), h, Response.values(), g);
        }

        final void a()
        {
            c();
            d();
        }

        final void a(Response response)
        {
            if (response != k) goto _L2; else goto _L1
_L1:
            c();
_L4:
            int ai[] = g;
            int i1 = response.ordinal();
            ai[i1] = ai[i1] + 1;
            if (f.remove(response) && f.isEmpty())
            {
                d();
            }
            return;
_L2:
            if (response == l)
            {
                o.b();
                b();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final transient void a(c ac[])
        {
            if (m != null)
            {
                throw new IllegalStateException("already attached");
            }
            m = ac;
            int j1 = ac.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ac[i1].a(a);
            }

        }

        static 
        {
            k = Response.a;
            l = Response.b;
        }

        public transient Session(View view, Strategy strategy, Response aresponse[])
        {
            this(view, (Positionable)view, strategy, Trace.a, aresponse);
        }

        private transient Session(View view, Positionable positionable, Strategy strategy, Trace trace, Response aresponse[])
        {
            j = false;
            p = new b();
            a = view;
            b = positionable;
            c = strategy;
            d = 100;
            o = trace;
            e = EnumSet.of(aresponse[0], aresponse);
            f = EnumSet.noneOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Response);
            g = new int[Response.values().length];
            h = new long[a.values().length];
            n = a.getContext().getResources().getResourceEntryName(a.getId());
        }
    }

    public static abstract class Strategy extends Enum
    {

        public static final Strategy a;
        public static final Strategy b;
        public static final Strategy c;
        public static final Strategy d;
        private static final Strategy e[];

        public static Strategy valueOf(String s)
        {
            return (Strategy)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Strategy, s);
        }

        public static Strategy[] values()
        {
            return (Strategy[])e.clone();
        }

        abstract float a(int i, int j);

        static 
        {
            a = new Strategy("LINEAR") {

                final float a(int i, int j)
                {
                    return (1.0F * (float)i) / (float)j;
                }

            };
            b = new Strategy("REVERSE") {

                final float a(int i, int j)
                {
                    return (1.0F * (float)(j - i - 1)) / (float)j;
                }

            };
            c = new Strategy("BUTTERFLY") {

                final float a(int i, int j)
                {
                    Strategy strategy;
                    if (i % 2 == 0)
                    {
                        strategy = b;
                    } else
                    {
                        strategy = a;
                    }
                    return strategy.a(i, j * 2);
                }

            };
            d = new Strategy("RANDOM") {

                final Random e = new Random(0L);

                final float a(int i, int j)
                {
                    return e.nextFloat();
                }

            };
            e = (new Strategy[] {
                a, b, c, d
            });
        }

        private Strategy(String s, int i)
        {
            super(s, i);
        }

        Strategy(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    public static abstract class Trace extends Enum
    {

        public static final Trace a;
        public static final Trace b;
        public static final Trace c;
        private static final Trace d[];

        public static Trace valueOf(String s)
        {
            return (Trace)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Trace, s);
        }

        public static Trace[] values()
        {
            return (Trace[])d.clone();
        }

        public abstract void a();

        public abstract void a(String s);

        public abstract void b();

        static 
        {
            a = new Trace("NONE") {

                public final void a()
                {
                }

                public final void a(String s)
                {
                }

                public final void b()
                {
                }

            };
            b = new Trace("INSTRUMENT") {

                public final void a()
                {
                    Debug.stopMethodTracing();
                }

                public final void a(String s)
                {
                    Debug.startMethodTracing(s);
                }

                public final void b()
                {
                    Debug.stopMethodTracing();
                }

            };
            c = new Trace("SAMPLE") {

                public final void a()
                {
                    Debug.stopMethodTracing();
                }

                public final void a(String s)
                {
                    Debug.startMethodTracingSampling(s, 0x1000000, 100);
                }

                public final void b()
                {
                    Debug.stopMethodTracing();
                }

            };
            d = (new Trace[] {
                a, b, c
            });
        }

        private Trace(String s, int i)
        {
            super(s, i);
        }

        Trace(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    static abstract class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        public abstract long a();

        static 
        {
            a = new a("THREAD") {

                public final long a()
                {
                    return SystemClock.currentThreadTimeMillis();
                }

            };
            b = new a("PROCESS") {

                public final long a()
                {
                    return Process.getElapsedCpuTime();
                }

            };
            c = new a("UPTIME") {

                public final long a()
                {
                    return SystemClock.uptimeMillis();
                }

            };
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    static final class b
        implements Report
    {

        private static void a(PrintWriter printwriter, Object obj)
        {
            printwriter.print("\"");
            printwriter.print(obj);
            printwriter.print("\"");
        }

        private static void a(PrintWriter printwriter, String s, Number number)
        {
            a(printwriter, s);
            printwriter.print(", ");
            a(printwriter, number);
            printwriter.println();
        }

        public final void a(String s, Enum aenum[], long al[], Enum aenum1[], int ai[])
        {
            Enum enum;
            int i;
            int j;
            try
            {
                s = new PrintWriter(new FileWriter(new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(s).append(".csv").toString())));
                j = aenum.length;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
            i = 0;
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            enum = aenum[i];
            a(((PrintWriter) (s)), enum.name(), ((Number) (Long.valueOf(al[enum.ordinal()]))));
            i++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_51;
_L1:
            j = aenum1.length;
            i = 0;
_L4:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            aenum = aenum1[i];
            a(((PrintWriter) (s)), aenum.name(), ((Number) (Integer.valueOf(ai[aenum.ordinal()]))));
            i++;
            if (true) goto _L4; else goto _L3
_L3:
            s.flush();
            s.close();
            return;
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract void a(View view);

        public abstract void b(View view);
    }

    static final class d
        implements android.view.View.OnLayoutChangeListener, c
    {

        final Handler a;

        public final void a(View view)
        {
            view.addOnLayoutChangeListener(this);
        }

        public final void b(View view)
        {
            view.removeOnLayoutChangeListener(this);
        }

        public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            a.obtainMessage(view.getId(), Response.c).sendToTarget();
        }

        public d(Handler handler)
        {
            a = handler;
        }
    }

    static final class e extends Drawable
        implements c
    {

        final Handler a;
        Drawable b;
        private int c;

        public final void a(View view)
        {
            if (b != null)
            {
                throw new IllegalStateException("already attached");
            } else
            {
                c = view.getId();
                b = view.getBackground();
                LayoutCostMeter.a(view, this);
                return;
            }
        }

        public final void b(View view)
        {
            if (view.getBackground() != this)
            {
                throw new IllegalStateException("already detached");
            } else
            {
                LayoutCostMeter.a(view, b);
                b = null;
                return;
            }
        }

        public final void draw(Canvas canvas)
        {
            a.obtainMessage(c, Response.d).sendToTarget();
        }

        public final int getOpacity()
        {
            return 0;
        }

        public final void setAlpha(int i)
        {
        }

        public final void setColorFilter(ColorFilter colorfilter)
        {
        }

        public e(Handler handler)
        {
            a = handler;
        }
    }

    static final class f
        implements android.view.View.OnAttachStateChangeListener, c
    {

        final Handler a;

        public final void a(View view)
        {
            view.addOnAttachStateChangeListener(this);
        }

        public final void b(View view)
        {
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewAttachedToWindow(View view)
        {
            a.obtainMessage(view.getId(), Response.a).sendToTarget();
        }

        public final void onViewDetachedFromWindow(View view)
        {
            a.obtainMessage(view.getId(), Response.b).sendToTarget();
        }

        f(Handler handler)
        {
            a = handler;
        }
    }


    final SparseArray a = new SparseArray();
    private final Handler b = new Handler(new android.os.Handler.Callback() {

        final LayoutCostMeter a;

        public final boolean handleMessage(Message message)
        {
            int i = message.what;
            message = (Response)message.obj;
            ((Session)a.a.get(i)).a(message);
            return true;
        }

            
            {
                a = LayoutCostMeter.this;
                super();
            }
    });
    private final f c;
    private final d d;
    private final e e;
    private final c f[];

    public LayoutCostMeter()
    {
        d = new d(b);
        e = new e(b);
        c = new f(b);
        f = (new c[] {
            d, e, c
        });
    }

    static void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public final void a(Session session)
    {
        int i = session.a.getId();
        Session session1 = (Session)a.get(i);
        boolean flag;
        if (session1 != null && !session1.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            throw new IllegalStateException();
        } else
        {
            a.put(i, session);
            session.a(f);
            session.a();
            return;
        }
    }
}
