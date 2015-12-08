// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.google.android.m4b.maps.a.c;
import com.google.android.m4b.maps.a.f;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.g;
import com.google.android.m4b.maps.ay.h;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.r;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.ay.z;
import com.google.android.m4b.maps.g.d;
import com.google.android.m4b.maps.y.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bg

public class bt extends BroadcastReceiver
{
    static final class a extends com.google.android.m4b.maps.ay.a
    {

        private final Handler a;
        private final Handler b;

        public final void a(int i1, String s)
        {
        }

        public final void a(t t)
        {
            Message.obtain(a, 0, t).sendToTarget();
        }

        public final void b(t t)
        {
            Message.obtain(b, 0, t).sendToTarget();
        }

        private a()
        {
            a = new _cls1(this, Looper.getMainLooper());
            b = new _cls2(this, Looper.getMainLooper());
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void a();
    }


    private static final String b = com/google/android/m4b/maps/cg/bt.getSimpleName();
    public final String a;
    private final Context c;
    private final bg d;
    private final Set e;
    private l f;
    private boolean g;
    private m h;
    private final String i;
    private com.google.android.m4b.maps.ay.l j;
    private com.google.android.m4b.maps.am.f.a k;
    private final h l;

    public bt(Context context, bg bg1, String s, com.google.android.m4b.maps.ay.l l1, com.google.android.m4b.maps.am.f.a a1)
    {
        this(context, bg1, s, l1, a1, com.google.android.m4b.maps.ay.h.a());
    }

    private bt(Context context, bg bg1, String s, com.google.android.m4b.maps.ay.l l1, com.google.android.m4b.maps.am.f.a a1, h h1)
    {
        e = new HashSet();
        c = context;
        d = bg1;
        i = s;
        j = l1;
        k = a1;
        bg1 = new StringBuilder(String.format("Mozilla/5.0 (%s; U; %s; %s; ) AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0; GmmClient:%s/%s/%s/%s/%s/%s", new Object[] {
            "Android", android.os.Build.VERSION.SDK, w.h.a.toString(), "android", s, "2.17.0", "Mobile", w.c(), com.google.android.m4b.maps.ay.g.b(context)
        }));
        bg1.append(String.format("/%s/%s/%s", new Object[] {
            "", String.valueOf(w.a(context, s).versionCode), "6.18.0"
        }));
        a = bg1.toString();
        l = h1;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (g)
        {
            c.unregisterReceiver(this);
            g = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final m a()
    {
        int i1 = 1;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        String s;
        bg bg1;
        r r1;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        obj1 = c;
        s = i;
        bg1 = d;
        obj = j;
        r1 = new r();
        r1.a.a(4, true);
        String s1 = com.google.android.m4b.maps.ay.g.a(((Context) (obj1)));
        r1.a.b(19, s1);
        r1.a.a(29, false);
        if (w.d > 200)
        {
            i1 = 3;
        }
        r1.a.a(22, i1);
        r1.a.b(40, "6.18.0");
        i1 = bg1.c;
        r1.a.a(47, i1);
        r1.a.b(5, s);
        com.google.android.m4b.maps.g.d.a();
        i1 = com.google.android.m4b.maps.g.d.a(((Context) (obj1)));
        r1.a.a(48, i1);
        i1 = w.a(((Context) (obj1)), s).versionCode;
        r1.a.b(39, String.valueOf(i1));
        r1.a.a(45, true);
        obj1 = m.a(((Context) (obj1)), w.c(), "2.17.0", r1, b());
        ((m) (obj1)).a(new a((byte)0));
        obj1.d = true;
        obj1.k = ((com.google.android.m4b.maps.ay.l) (obj));
        h = ((m) (obj1));
        obj = h;
        this;
        JVM INSTR monitorexit ;
        return ((m) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.y.j.a(b1, "Listener is null.");
        e.add(b1);
        if (!g)
        {
            g = true;
            c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public final boolean a(boolean flag)
    {
        if (c.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0)
        {
            return flag;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    public final l b()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L2; else goto _L1
_L1:
        l l1;
        f = com.google.android.m4b.maps.ay.h.a(c, k, "com.google.android.gms", com.google.android.m4b.maps.cz.a.a(c));
        l1 = f;
        if (l1.i != null)
        {
            c c1 = l1.i;
            c1.a = true;
            c1.interrupt();
        }
          goto _L3
_L9:
        int i1;
        if (i1 >= l1.h.length) goto _L5; else goto _L4
_L4:
        if (l1.h[i1] != null)
        {
            f f1 = l1.h[i1];
            f1.a = true;
            f1.interrupt();
        }
          goto _L6
_L5:
        l1.i = new c(l1.c, l1.d, l1.e, l1.g);
        l1.i.start();
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 >= l1.h.length)
        {
            break; /* Loop/switch isn't completed */
        }
        f f2 = new f(l1.d, l1.f, l1.e, l1.g);
        l1.h[i1] = f2;
        f2.start();
        i1++;
        if (true) goto _L7; else goto _L2
_L2:
        l1 = f;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
_L3:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!a(true))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        context = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        context = bo.a(e);
        e.clear();
        c();
        this;
        JVM INSTR monitorexit ;
        if (context != null)
        {
            for (context = context.iterator(); context.hasNext(); ((b)context.next()).a()) { }
        }
        break MISSING_BLOCK_LABEL_93;
        context;
        c();
        throw context;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }


    // Unreferenced inner class com/google/android/m4b/maps/cg/bt$a$1

/* anonymous class */
    final class a._cls1 extends Handler
    {

        private a a;

        public final void handleMessage(Message message)
        {
            ((t)message.obj).b();
        }

            
            {
                a = a1;
                super(looper);
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/cg/bt$a$2

/* anonymous class */
    final class a._cls2 extends Handler
    {

        private a a;

        public final void handleMessage(Message message)
        {
            ((t)message.obj).a();
        }

            
            {
                a = a1;
                super(looper);
            }
    }

}
