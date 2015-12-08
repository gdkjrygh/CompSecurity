// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public final class YT
{
    static final class a extends Handler
    {

        private final YT a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 12: default 68
        //                       1 84
        //                       2 102
        //                       3 68
        //                       4 599
        //                       5 661
        //                       6 678
        //                       7 695
        //                       8 68
        //                       9 763
        //                       10 780
        //                       11 210
        //                       12 461;
               goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11
_L8:
            break MISSING_BLOCK_LABEL_763;
_L9:
            break MISSING_BLOCK_LABEL_780;
_L1:
            Zf.a.post(new Runnable(message) {

                private Message a;

                public final void run()
                {
                    throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
                }

            
            {
                a = message;
                super();
            }
            });
_L12:
            return;
_L2:
            message = (YL)message.obj;
            a.a(message, true);
            return;
_L3:
            message = (YL)message.obj;
            YT yt = a;
            String s = ((YL) (message)).e;
            YN yn = (YN)yt.e.get(s);
            if (yn != null)
            {
                yn.a(message);
                if (yn.a())
                {
                    yt.e.remove(s);
                }
            }
            if (yt.h.contains(((YL) (message)).f))
            {
                yt.g.remove(message.c());
            }
            yt.f.remove(message.c());
            return;
_L10:
            message = ((Message) (message.obj));
            YT yt1 = a;
            if (yt1.h.add(message))
            {
                Iterator iterator = yt1.e.values().iterator();
                while (iterator.hasNext()) 
                {
                    YN yn1 = (YN)iterator.next();
                    Object obj2 = yn1.b;
                    YL yl = yn1.h;
                    obj2 = yn1.i;
                    int i1;
                    if (obj2 != null && !((List) (obj2)).isEmpty())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (yl != null || i1 != 0)
                    {
                        if (yl != null && yl.f.equals(message))
                        {
                            yn1.a(yl);
                            yt1.g.put(yl.c(), yl);
                        }
                        if (i1 != 0)
                        {
                            for (i1 = ((List) (obj2)).size() - 1; i1 >= 0; i1--)
                            {
                                YL yl1 = (YL)((List) (obj2)).get(i1);
                                if (yl1.f.equals(message))
                                {
                                    yn1.a(yl1);
                                    yt1.g.put(yl1.c(), yl1);
                                }
                            }

                        }
                        if (yn1.a())
                        {
                            iterator.remove();
                        }
                    }
                }
            }
            if (true) goto _L12; else goto _L11
_L11:
            Object obj1;
            YT yt3;
            obj1 = message.obj;
            yt3 = a;
            if (!yt3.h.remove(obj1)) goto _L12; else goto _L13
_L13:
            message = null;
            Iterator iterator1 = yt3.g.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                YL yl2 = (YL)iterator1.next();
                if (yl2.f.equals(obj1))
                {
                    Object obj = message;
                    if (message == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(yl2);
                    iterator1.remove();
                    message = ((Message) (obj));
                }
            } while (true);
            if (message == null) goto _L12; else goto _L14
_L14:
            yt3.j.sendMessage(yt3.j.obtainMessage(13, message));
            return;
_L4:
            message = (YN)message.obj;
            YT yt2 = a;
            if (Zb.b(0))
            {
                yt2.k.a(((YN) (message)).c, ((YN) (message)).j);
            }
            yt2.e.remove(((YN) (message)).c);
            yt2.e(message);
            message = ((YN) (message)).b;
            return;
_L5:
            message = (YN)message.obj;
            a.c(message);
            return;
_L6:
            message = (YN)message.obj;
            a.d(message);
            return;
_L7:
            ArrayList arraylist;
            message = a;
            arraylist = new ArrayList(((YT) (message)).l);
            ((YT) (message)).l.clear();
            ((YT) (message)).j.sendMessage(((YT) (message)).j.obtainMessage(8, arraylist));
            if (arraylist.isEmpty()) goto _L12; else goto _L15
_L15:
            message = ((YN)arraylist.get(0)).b;
            return;
            message = (NetworkInfo)message.obj;
            a.a(message);
            return;
            int j1 = message.arg1;
            return;
        }

        public a(Looper looper, YT yt)
        {
            super(looper);
            a = yt;
        }
    }

    public static final class b extends HandlerThread
    {

        b()
        {
            super("Picasso-Dispatcher", 10);
        }
    }

    static final class c extends BroadcastReceiver
    {

        final YT a;

        public final void onReceive(Context context, Intent intent)
        {
            if (intent != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            String s;
            s = intent.getAction();
            if (!"android.intent.action.AIRPLANE_MODE".equals(s))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!intent.hasExtra("state")) goto _L1; else goto _L3
_L3:
            context = a;
            boolean flag = intent.getBooleanExtra("state", false);
            intent = ((YT) (context)).i;
            context = ((YT) (context)).i;
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            intent.sendMessage(context.obtainMessage(10, i1, 0));
            return;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(s)) goto _L1; else goto _L4
_L4:
            intent = (ConnectivityManager)Zp.a(context, "connectivity");
            context = a;
            intent = intent.getActiveNetworkInfo();
            ((YT) (context)).i.sendMessage(((YT) (context)).i.obtainMessage(9, intent));
            return;
        }

        c(YT yt)
        {
            a = yt;
        }
    }


    public final b a = new b();
    final Context b;
    public final ExecutorService c;
    public final YU d;
    final Map e = new LinkedHashMap();
    final Map f = new WeakHashMap();
    final Map g = new WeakHashMap();
    final Set h = new HashSet();
    final Handler i;
    final Handler j;
    final YO k;
    final List l = new ArrayList(4);
    final c m = new c(this);
    private Zm n;
    private boolean o;

    YT(Context context, ExecutorService executorservice, Handler handler, YU yu, YO yo, Zm zm)
    {
        a.start();
        Zp.a(a.getLooper());
        b = context;
        c = executorservice;
        i = new a(a.getLooper(), this);
        d = yu;
        j = handler;
        k = yo;
        n = zm;
        Zp.d(b);
        o = Zp.b(context, "android.permission.ACCESS_NETWORK_STATE");
        context = m;
        executorservice = new IntentFilter();
        executorservice.addAction("android.intent.action.AIRPLANE_MODE");
        if (((c) (context)).a.o)
        {
            executorservice.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((c) (context)).a.b.registerReceiver(context, executorservice);
    }

    private void a(YL yl)
    {
        Object obj = yl.c();
        if (obj != null)
        {
            yl.g = true;
            f.put(obj, yl);
        }
    }

    private void f(YN yn)
    {
        YL yl = yn.h;
        if (yl != null)
        {
            a(yl);
        }
        yn = yn.i;
        if (yn != null)
        {
            int j1 = yn.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                a((YL)yn.get(i1));
            }

        }
    }

    final void a(YL yl, boolean flag)
    {
        if (!h.contains(yl.f)) goto _L2; else goto _L1
_L1:
        g.put(yl.c(), yl);
_L4:
        return;
_L2:
        YN yn = (YN)e.get(yl.e);
        if (yn == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Zf zf = yn.b;
        if (yn.h == null)
        {
            yn.h = yl;
            return;
        }
        if (yn.i == null)
        {
            yn.i = new ArrayList(3);
        }
        yn.i.add(yl);
        int i1 = yl.b.i;
        if (i1 - 1 > yn.o - 1)
        {
            yn.o = i1;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (c.isShutdown()) goto _L4; else goto _L3
_L3:
        YN yn1 = YN.a(yl.a, this, k, n, yl);
        yn1.k = c.submit(yn1);
        e.put(yl.e, yn1);
        if (flag)
        {
            f.remove(yl.c());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    final void a(YN yn)
    {
        i.sendMessageDelayed(i.obtainMessage(5, yn), 500L);
    }

    final void a(NetworkInfo networkinfo)
    {
        if (!(c instanceof Zh)) goto _L2; else goto _L1
_L1:
        Object obj = (Zh)c;
        if (networkinfo != null && networkinfo.isConnectedOrConnecting()) goto _L4; else goto _L3
_L3:
        ((Zh) (obj)).a(3);
_L2:
        if (networkinfo != null && networkinfo.isConnected() && !f.isEmpty())
        {
            for (networkinfo = f.values().iterator(); networkinfo.hasNext(); a(((YL) (obj)), false))
            {
                obj = (YL)networkinfo.next();
                networkinfo.remove();
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        switch (networkinfo.getType())
        {
        default:
            ((Zh) (obj)).a(3);
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            ((Zh) (obj)).a(4);
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            switch (networkinfo.getSubtype())
            {
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            default:
                ((Zh) (obj)).a(3);
                break;

            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                ((Zh) (obj)).a(3);
                break;

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 12: // '\f'
                ((Zh) (obj)).a(2);
                break;

            case 1: // '\001'
            case 2: // '\002'
                ((Zh) (obj)).a(1);
                break;
            }
            break;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void b(YN yn)
    {
        i.sendMessage(i.obtainMessage(6, yn));
    }

    final void c(YN yn)
    {
        boolean flag2 = true;
        if (!yn.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c.isShutdown())
        {
            d(yn);
            return;
        }
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if (o)
        {
            obj = ((ConnectivityManager)Zp.a(b, "connectivity")).getActiveNetworkInfo();
        } else
        {
            obj = null;
        }
        if (obj != null && ((NetworkInfo) (obj)).isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (yn.n > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag3 = false;
        } else
        {
            yn.n = yn.n - 1;
            flag3 = yn.g.a(((NetworkInfo) (obj)));
        }
        flag4 = yn.g.b();
        if (flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o && flag4)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        d(yn);
        if (flag)
        {
            f(yn);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!o || flag)
        {
            obj = yn.b;
            if (yn.m instanceof Zd.a)
            {
                yn.f = yn.f | Zc.a.c;
            }
            yn.k = c.submit(yn);
            return;
        }
        d(yn);
        if (flag4)
        {
            f(yn);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void d(YN yn)
    {
        Zf zf = yn.b;
        e.remove(yn.c);
        e(yn);
    }

    final void e(YN yn)
    {
        if (!yn.b())
        {
            l.add(yn);
            if (!i.hasMessages(7))
            {
                i.sendEmptyMessageDelayed(7, 200L);
                return;
            }
        }
    }

    // Unreferenced inner class YT$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private YT a;

        public final void run()
        {
            c c1 = a.m;
            c1.a.b.unregisterReceiver(c1);
        }

            public 
            {
                a = YT.this;
                super();
            }
    }

}
