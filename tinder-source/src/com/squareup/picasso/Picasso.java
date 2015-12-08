// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.picasso:
//            u, f, MediaStoreRequestHandler, g, 
//            b, k, NetworkRequestHandler, i, 
//            s, a, r, ab, 
//            d, v, h, m, 
//            q, Downloader, c, MemoryPolicy

public class Picasso
{
    public static final class LoadedFrom extends Enum
    {

        public static final LoadedFrom a;
        public static final LoadedFrom b;
        public static final LoadedFrom c;
        private static final LoadedFrom e[];
        final int d;

        public static LoadedFrom valueOf(String s1)
        {
            return (LoadedFrom)Enum.valueOf(com/squareup/picasso/Picasso$LoadedFrom, s1);
        }

        public static LoadedFrom[] values()
        {
            return (LoadedFrom[])e.clone();
        }

        static 
        {
            a = new LoadedFrom("MEMORY", 0, 0xff00ff00);
            b = new LoadedFrom("DISK", 1, 0xff0000ff);
            c = new LoadedFrom("NETWORK", 2, 0xffff0000);
            e = (new LoadedFrom[] {
                a, b, c
            });
        }

        private LoadedFrom(String s1, int i1, int j1)
        {
            super(s1, i1);
            d = j1;
        }
    }

    public static final class Priority extends Enum
    {

        public static final Priority a;
        public static final Priority b;
        public static final Priority c;
        private static final Priority d[];

        public static Priority valueOf(String s1)
        {
            return (Priority)Enum.valueOf(com/squareup/picasso/Picasso$Priority, s1);
        }

        public static Priority[] values()
        {
            return (Priority[])d.clone();
        }

        static 
        {
            a = new Priority("LOW", 0);
            b = new Priority("NORMAL", 1);
            c = new Priority("HIGH", 2);
            d = (new Priority[] {
                a, b, c
            });
        }

        private Priority(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class a
    {

        public Downloader a;
        public com.squareup.picasso.d b;
        public boolean c;
        private final Context d;
        private ExecutorService e;
        private c f;
        private d g;
        private List h;
        private android.graphics.Bitmap.Config i;
        private boolean j;

        public final Picasso a()
        {
            Context context = d;
            if (a == null)
            {
                a = ab.a(context);
            }
            if (b == null)
            {
                b = new m(context);
            }
            if (e == null)
            {
                e = new q();
            }
            if (g == null)
            {
                g = d.a;
            }
            v v1 = new v(b);
            return new Picasso(context, new i(context, e, Picasso.a, a, b, v1), b, f, g, h, v1, i, j, c);
        }

        public a(Context context)
        {
            if (context == null)
            {
                throw new IllegalArgumentException("Context must not be null.");
            } else
            {
                d = context.getApplicationContext();
                return;
            }
        }
    }

    private static final class b extends Thread
    {

        private final ReferenceQueue a;
        private final Handler b;

        public final void run()
        {
            Process.setThreadPriority(10);
_L1:
            a.a a1;
            Message message;
            try
            {
                a1 = (a.a)a.remove(1000L);
                message = b.obtainMessage();
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
            catch (Exception exception)
            {
                b.post(new Runnable(this, exception) {

                    final Exception a;
                    final b b;

                    public final void run()
                    {
                        throw new RuntimeException(a);
                    }

            
            {
                b = b1;
                a = exception;
                super();
            }
                });
                return;
            }
            if (a1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            message.what = 3;
            message.obj = a1.a;
            b.sendMessage(message);
              goto _L1
            message.recycle();
              goto _L1
        }

        b(ReferenceQueue referencequeue, Handler handler)
        {
            a = referencequeue;
            b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    public static interface c
    {
    }

    public static interface d
    {

        public static final d a = new d() {

            public final r a(r r1)
            {
                return r1;
            }

        };

        public abstract r a(r r1);

    }


    static final Handler a = new Handler(Looper.getMainLooper()) {

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 3: default 40
        //                       3: 278
        //                       8: 67
        //                       13: 324;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(message.what).toString());
_L3:
            message = (List)message.obj;
            int j2 = message.size();
            int k1;
            int i2;
            for (int i1 = 0; i1 < j2; i1++)
            {
                Object obj = (com.squareup.picasso.c)message.get(i1);
                Picasso picasso = ((com.squareup.picasso.c) (obj)).b;
                com.squareup.picasso.a a1 = ((com.squareup.picasso.c) (obj)).k;
                List list1 = ((com.squareup.picasso.c) (obj)).l;
                if (list1 != null && !list1.isEmpty())
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (a1 != null || k1 != 0)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (i2 != 0)
                {
                    Object obj1 = ((com.squareup.picasso.c) (obj)).g.d;
                    obj1 = ((com.squareup.picasso.c) (obj)).p;
                    obj1 = ((com.squareup.picasso.c) (obj)).m;
                    obj = ((com.squareup.picasso.c) (obj)).o;
                    if (a1 != null)
                    {
                        picasso.a(((Bitmap) (obj1)), ((LoadedFrom) (obj)), a1);
                    }
                    if (k1 != 0)
                    {
                        i2 = list1.size();
                        for (k1 = 0; k1 < i2; k1++)
                        {
                            picasso.a(((Bitmap) (obj1)), ((LoadedFrom) (obj)), (com.squareup.picasso.a)list1.get(k1));
                        }

                    }
                }
            }

            break; /* Loop/switch isn't completed */
_L2:
            message = (com.squareup.picasso.a)message.obj;
            if (((com.squareup.picasso.a) (message)).a.n)
            {
                ab.a("Main", "canceled", ((com.squareup.picasso.a) (message)).b.a(), "target got garbage collected");
            }
            Picasso.a(((com.squareup.picasso.a) (message)).a, message.c());
_L6:
            return;
_L4:
            List list = (List)message.obj;
            int l1 = list.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                com.squareup.picasso.a a2 = (com.squareup.picasso.a)list.get(j1);
                Picasso picasso1 = a2.a;
                message = null;
                if (MemoryPolicy.a(a2.e))
                {
                    message = picasso1.b(a2.i);
                }
                if (message != null)
                {
                    picasso1.a(message, LoadedFrom.a, a2);
                    if (picasso1.n)
                    {
                        ab.a("Main", "completed", a2.b.a(), (new StringBuilder("from ")).append(LoadedFrom.a).toString());
                    }
                } else
                {
                    picasso1.a(a2);
                    if (picasso1.n)
                    {
                        ab.a("Main", "resumed", a2.b.a());
                    }
                }
                j1++;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

    };
    static volatile Picasso b = null;
    final d c;
    final List d;
    final Context e;
    final i f;
    final com.squareup.picasso.d g;
    final v h;
    final Map i = new WeakHashMap();
    final Map j = new WeakHashMap();
    final ReferenceQueue k = new ReferenceQueue();
    final android.graphics.Bitmap.Config l;
    boolean m;
    volatile boolean n;
    boolean o;
    private final c p;
    private final b q;

    Picasso(Context context, i i1, com.squareup.picasso.d d1, c c1, d d2, List list, v v1, 
            android.graphics.Bitmap.Config config, boolean flag, boolean flag1)
    {
        e = context;
        f = i1;
        g = d1;
        p = c1;
        c = d2;
        l = config;
        int j1;
        if (list != null)
        {
            j1 = list.size();
        } else
        {
            j1 = 0;
        }
        d1 = new ArrayList(j1 + 7);
        d1.add(new u(context));
        if (list != null)
        {
            d1.addAll(list);
        }
        d1.add(new f(context));
        d1.add(new MediaStoreRequestHandler(context));
        d1.add(new g(context));
        d1.add(new com.squareup.picasso.b(context));
        d1.add(new k(context));
        d1.add(new NetworkRequestHandler(i1.d, v1));
        d = Collections.unmodifiableList(d1);
        h = v1;
        m = flag;
        n = flag1;
        q = new b(k, a);
        q.start();
    }

    public static Picasso a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/squareup/picasso/Picasso;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = (new a(context)).a();
        }
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a(Picasso picasso)
    {
        com/squareup/picasso/Picasso;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            throw new IllegalStateException("Singleton instance already exists.");
        }
        break MISSING_BLOCK_LABEL_25;
        picasso;
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
        throw picasso;
        b = picasso;
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
    }

    static void a(Picasso picasso, Object obj)
    {
        picasso.b(obj);
    }

    public final s a(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        } else
        {
            return new s(this, null, i1);
        }
    }

    public final s a(String s1)
    {
        if (s1 == null)
        {
            return new s(this, null, 0);
        }
        if (s1.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return new s(this, Uri.parse(s1), 0);
        }
    }

    final void a(Bitmap bitmap, LoadedFrom loadedfrom, com.squareup.picasso.a a1)
    {
        if (!a1.l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a1.k)
        {
            i.remove(a1.c());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (loadedfrom == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        a1.a(bitmap, loadedfrom);
        if (n)
        {
            ab.a("Main", "completed", a1.b.a(), (new StringBuilder("from ")).append(loadedfrom).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1.a();
        if (n)
        {
            ab.a("Main", "errored", a1.b.a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void a(com.squareup.picasso.a a1)
    {
        Object obj = a1.c();
        if (obj != null && i.get(obj) != a1)
        {
            b(obj);
            i.put(obj, a1);
        }
        b(a1);
    }

    public final void a(Object obj)
    {
        ab.a();
        ArrayList arraylist = new ArrayList(i.values());
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            com.squareup.picasso.a a1 = (com.squareup.picasso.a)arraylist.get(i1);
            if (a1.j.equals(obj))
            {
                b(a1.c());
            }
        }

    }

    final Bitmap b(String s1)
    {
        s1 = g.a(s1);
        if (s1 != null)
        {
            h.a();
            return s1;
        } else
        {
            h.c.sendEmptyMessage(1);
            return s1;
        }
    }

    final void b(com.squareup.picasso.a a1)
    {
        i i1 = f;
        i1.i.sendMessage(i1.i.obtainMessage(1, a1));
    }

    final void b(Object obj)
    {
        ab.a();
        com.squareup.picasso.a a1 = (com.squareup.picasso.a)i.remove(obj);
        if (a1 != null)
        {
            a1.b();
            i i1 = f;
            i1.i.sendMessage(i1.i.obtainMessage(2, a1));
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (h)j.remove(obj);
            if (obj != null)
            {
                obj.c = null;
                Object obj1 = (ImageView)((h) (obj)).b.get();
                if (obj1 != null)
                {
                    obj1 = ((ImageView) (obj1)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj1)).isAlive())
                    {
                        ((ViewTreeObserver) (obj1)).removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (obj)));
                    }
                }
            }
        }
    }

}
