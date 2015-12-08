// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
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

public final class gvi
{

    public final Downloader a;
    final Map b = new LinkedHashMap();
    final Map c = new WeakHashMap();
    final Map d = new WeakHashMap();
    final Set e = new HashSet();
    public final Handler f;
    final Handler g;
    final gvd h;
    final List i = new ArrayList(4);
    private gvk j;
    private Context k;
    private ExecutorService l;
    private gwf m;
    private gvl n;
    private boolean o;

    public gvi(Context context, ExecutorService executorservice, Handler handler, Downloader downloader, gvd gvd, gwf gwf)
    {
        j = new gvk();
        j.start();
        gwm.a(j.getLooper());
        k = context;
        l = executorservice;
        f = new gvj(j.getLooper(), this);
        a = downloader;
        g = handler;
        h = gvd;
        m = gwf;
        gwm.d(k);
        o = gwm.b(context, "android.permission.ACCESS_NETWORK_STATE");
        n = new gvl(this);
        context = n;
        executorservice = new IntentFilter();
        executorservice.addAction("android.intent.action.AIRPLANE_MODE");
        if (((gvl) (context)).a.o)
        {
            executorservice.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((gvl) (context)).a.k.registerReceiver(context, executorservice);
    }

    private void a(guz guz1)
    {
        Object obj = guz1.c();
        if (obj != null)
        {
            guz1.i = true;
            c.put(obj, guz1);
        }
    }

    static void a(List list)
    {
        while (list.isEmpty() || !((gvc)list.get(0)).b.h) 
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        gvc gvc1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(gwm.a(gvc1)))
        {
            gvc1 = (gvc)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        gwm.a("Dispatcher", "delivered", stringbuilder.toString());
    }

    private void e(gvc gvc1)
    {
        guz guz1 = gvc1.h;
        if (guz1 != null)
        {
            a(guz1);
        }
        gvc1 = gvc1.i;
        if (gvc1 != null)
        {
            int j1 = gvc1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                a((guz)gvc1.get(i1));
            }

        }
    }

    final void a(NetworkInfo networkinfo)
    {
        if (!(l instanceof gvx)) goto _L2; else goto _L1
_L1:
        Object obj = (gvx)l;
        if (networkinfo != null && networkinfo.isConnectedOrConnecting()) goto _L4; else goto _L3
_L3:
        ((gvx) (obj)).a(3);
_L2:
        if (networkinfo != null && networkinfo.isConnected() && !c.isEmpty())
        {
            for (networkinfo = c.values().iterator(); networkinfo.hasNext(); a(((guz) (obj)), false))
            {
                obj = (guz)networkinfo.next();
                networkinfo.remove();
                if (((guz) (obj)).a.h)
                {
                    gwm.a("Dispatcher", "replaying", ((guz) (obj)).b.a());
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        switch (networkinfo.getType())
        {
        default:
            ((gvx) (obj)).a(3);
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            ((gvx) (obj)).a(4);
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
                ((gvx) (obj)).a(3);
                break;

            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                ((gvx) (obj)).a(3);
                break;

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 12: // '\f'
                ((gvx) (obj)).a(2);
                break;

            case 1: // '\001'
            case 2: // '\002'
                ((gvx) (obj)).a(1);
                break;
            }
            break;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void a(guz guz1, boolean flag)
    {
        if (!e.contains(guz1.h)) goto _L2; else goto _L1
_L1:
        d.put(guz1.c(), guz1);
        if (guz1.a.h)
        {
            gwm.a("Dispatcher", "paused", guz1.b.a(), (new StringBuilder("because tag '")).append(guz1.h).append("' is paused").toString());
        }
_L4:
        return;
_L2:
        gvc gvc1 = (gvc)b.get(guz1.g);
        if (gvc1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = gvc1.b.h;
        gvz gvz1 = guz1.b;
        if (gvc1.h == null)
        {
            gvc1.h = guz1;
            if (flag)
            {
                if (gvc1.i == null || gvc1.i.isEmpty())
                {
                    gwm.a("Hunter", "joined", gvz1.a(), "to empty hunter");
                    return;
                } else
                {
                    gwm.a("Hunter", "joined", gvz1.a(), gwm.a(gvc1, "to "));
                    return;
                }
            }
        } else
        {
            if (gvc1.i == null)
            {
                gvc1.i = new ArrayList(3);
            }
            gvc1.i.add(guz1);
            if (flag)
            {
                gwm.a("Hunter", "joined", gvz1.a(), gwm.a(gvc1, "to "));
            }
            guz1 = guz1.b.o;
            if (guz1.ordinal() > gvc1.o.ordinal())
            {
                gvc1.o = guz1;
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!l.isShutdown())
        {
            break; /* Loop/switch isn't completed */
        }
        if (guz1.a.h)
        {
            gwm.a("Dispatcher", "ignored", guz1.b.a(), "because shut down");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        gvc gvc2 = gvc.a(guz1.a, this, h, m, guz1);
        gvc2.k = l.submit(gvc2);
        b.put(guz1.g, gvc2);
        if (flag)
        {
            c.remove(guz1.c());
        }
        if (guz1.a.h)
        {
            gwm.a("Dispatcher", "enqueued", guz1.b.a());
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    final void a(gvc gvc1)
    {
        f.sendMessageDelayed(f.obtainMessage(5, gvc1), 500L);
    }

    final void a(gvc gvc1, boolean flag)
    {
        if (gvc1.b.h)
        {
            String s1 = gwm.a(gvc1);
            StringBuilder stringbuilder = new StringBuilder("for error");
            String s;
            if (flag)
            {
                s = " (will replay)";
            } else
            {
                s = "";
            }
            gwm.a("Dispatcher", "batched", s1, stringbuilder.append(s).toString());
        }
        b.remove(gvc1.c);
        d(gvc1);
    }

    final void a(Object obj)
    {
        if (e.remove(obj))
        {
            ArrayList arraylist = null;
            Iterator iterator = d.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                guz guz1 = (guz)iterator.next();
                if (guz1.h.equals(obj))
                {
                    ArrayList arraylist1 = arraylist;
                    if (arraylist == null)
                    {
                        arraylist1 = new ArrayList();
                    }
                    arraylist1.add(guz1);
                    iterator.remove();
                    arraylist = arraylist1;
                }
            } while (true);
            if (arraylist != null)
            {
                g.sendMessage(g.obtainMessage(13, arraylist));
                return;
            }
        }
    }

    final void b(gvc gvc1)
    {
        f.sendMessage(f.obtainMessage(6, gvc1));
    }

    final void c(gvc gvc1)
    {
        boolean flag3 = true;
        if (!gvc1.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (l.isShutdown())
        {
            a(gvc1, false);
            return;
        }
        NetworkInfo networkinfo;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        if (o)
        {
            networkinfo = ((ConnectivityManager)gwm.a(k, "connectivity")).getActiveNetworkInfo();
        } else
        {
            networkinfo = null;
        }
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gvc1.n > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag2 = false;
        } else
        {
            gvc1.n = gvc1.n - 1;
            flag2 = gvc1.g.a(networkinfo);
        }
        flag4 = gvc1.g.b();
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o && flag4)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        a(gvc1, flag2);
        if (flag2)
        {
            e(gvc1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!o || flag)
        {
            if (gvc1.b.h)
            {
                gwm.a("Dispatcher", "retrying", gwm.a(gvc1));
            }
            if (gvc1.m instanceof com.squareup.picasso.NetworkRequestHandler.ContentLengthException)
            {
                gvc1.f = gvc1.f | NetworkPolicy.a.index;
            }
            gvc1.k = l.submit(gvc1);
            return;
        }
        a(gvc1, flag4);
        if (flag4)
        {
            e(gvc1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    final void d(gvc gvc1)
    {
        if (!gvc1.b())
        {
            i.add(gvc1);
            if (!f.hasMessages(7))
            {
                f.sendEmptyMessageDelayed(7, 200L);
                return;
            }
        }
    }
}
