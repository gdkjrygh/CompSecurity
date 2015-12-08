// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class he
    implements android.os.Handler.Callback
{
    final class a
    {

        private ComponentName GA;
        final he GB;
        private final String Gv;
        private final a Gw = new a(this);
        private final HashSet Gx = new HashSet();
        private boolean Gy;
        private IBinder Gz;
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.GA = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.Gz = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.Gx;
        }

        public void B(boolean flag)
        {
            Gy = flag;
        }

        public void a(hc.f f)
        {
            Gx.add(f);
        }

        public void b(hc.f f)
        {
            Gx.remove(f);
        }

        public boolean c(hc.f f)
        {
            return Gx.contains(f);
        }

        public a fs()
        {
            return Gw;
        }

        public String ft()
        {
            return Gv;
        }

        public boolean fu()
        {
            return Gx.isEmpty();
        }

        public IBinder getBinder()
        {
            return Gz;
        }

        public ComponentName getComponentName()
        {
            return GA;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return Gy;
        }

        public a(String s)
        {
            GB = he.this;
            super();
            Gv = s;
            mState = 0;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a GC;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = he.a(GC.GB);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(GC, ibinder);
            a.a(GC, componentname);
            for (Iterator iterator = a.a(GC).iterator(); iterator.hasNext(); ((hc.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(GC, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = he.a(GC.GB);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(GC, null);
            a.a(GC, componentname);
            for (Iterator iterator = a.a(GC).iterator(); iterator.hasNext(); ((hc.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(GC, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            GC = a1;
            super();
        }
    }


    private static final Object Gs = new Object();
    private static he Gt;
    private final HashMap Gu = new HashMap();
    private final Context lx;
    private final Handler mHandler;

    private he(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        lx = context.getApplicationContext();
    }

    public static he B(Context context)
    {
        synchronized (Gs)
        {
            if (Gt == null)
            {
                Gt = new he(context.getApplicationContext());
            }
        }
        return Gt;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(he he1)
    {
        return he1.Gu;
    }

    public boolean a(String s, hc.f f)
    {
        HashMap hashmap = Gu;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Gu.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        f = (new Intent(s)).setPackage("com.google.android.gms");
        a1.B(lx.bindService(f, a1.fs(), 129));
        Gu.put(s, a1);
        s = a1;
_L7:
        boolean flag = s.isBound();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        mHandler.removeMessages(0, a1);
        if (a1.c(f))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=").append(s).toString());
        }
        break MISSING_BLOCK_LABEL_147;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        a1.a(f);
        a1.getState();
        JVM INSTR tableswitch 1 2: default 235
    //                   1 180
    //                   2 197;
           goto _L3 _L4 _L5
_L4:
        f.onServiceConnected(a1.getComponentName(), a1.getBinder());
        s = a1;
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new Intent(s)).setPackage("com.google.android.gms");
        a1.B(lx.bindService(s, a1.fs(), 129));
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, hc.f f)
    {
        HashMap hashmap = Gu;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Gu.get(s);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service action: ").append(s).toString());
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        if (!a1.c(f))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=").append(s).toString());
        }
        a1.b(f);
        if (a1.fu())
        {
            s = mHandler.obtainMessage(0, a1);
            mHandler.sendMessageDelayed(s, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public boolean handleMessage(Message message)
    {
        a a1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            a1 = (a)message.obj;
            break;
        }
        synchronized (Gu)
        {
            if (a1.fu())
            {
                lx.unbindService(a1.fs());
                Gu.remove(a1.ft());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
