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

public final class kd
    implements android.os.Handler.Callback
{
    final class a
    {

        private final String Wj;
        private final a Wk = new a(this);
        private final HashSet Wl = new HashSet();
        private boolean Wm;
        private IBinder Wn;
        private ComponentName Wo;
        final kd Wp;
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.Wo = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.Wn = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.Wl;
        }

        public final void a(kb.f f)
        {
            Wl.add(f);
        }

        public final void b(kb.f f)
        {
            Wl.remove(f);
        }

        public final boolean c(kb.f f)
        {
            return Wl.contains(f);
        }

        public final IBinder getBinder()
        {
            return Wn;
        }

        public final ComponentName getComponentName()
        {
            return Wo;
        }

        public final int getState()
        {
            return mState;
        }

        public final void iT()
        {
            Intent intent = (new Intent(Wj)).setPackage("com.google.android.gms");
            Wm = kd.b(Wp).bindService(intent, Wk, 129);
            if (Wm)
            {
                mState = 3;
                return;
            } else
            {
                kd.b(Wp).unbindService(Wk);
                return;
            }
        }

        public final void iU()
        {
            kd.b(Wp).unbindService(Wk);
            Wm = false;
            mState = 2;
        }

        public final String iV()
        {
            return Wj;
        }

        public final boolean iW()
        {
            return Wl.isEmpty();
        }

        public final boolean isBound()
        {
            return Wm;
        }

        public a(String s)
        {
            Wp = kd.this;
            super();
            Wj = s;
            mState = 2;
        }
    }

    public final class a.a
        implements ServiceConnection
    {

        final a Wq;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = kd.a(Wq.Wp);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Wq, ibinder);
            a.a(Wq, componentname);
            for (Iterator iterator = a.a(Wq).iterator(); iterator.hasNext(); ((kb.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Wq, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = kd.a(Wq.Wp);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Wq, null);
            a.a(Wq, componentname);
            for (Iterator iterator = a.a(Wq).iterator(); iterator.hasNext(); ((kb.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Wq, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            Wq = a1;
            super();
        }
    }


    private static final Object Wg = new Object();
    private static kd Wh;
    private final HashMap Wi = new HashMap();
    private final Handler mHandler;
    private final Context mR;

    private kd(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        mR = context.getApplicationContext();
    }

    public static kd L(Context context)
    {
        synchronized (Wg)
        {
            if (Wh == null)
            {
                Wh = new kd(context.getApplicationContext());
            }
        }
        return Wh;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(kd kd1)
    {
        return kd1.Wi;
    }

    static Context b(kd kd1)
    {
        return kd1.mR;
    }

    public final boolean a(String s, kb.f f)
    {
        HashMap hashmap = Wi;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Wi.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        a1.iT();
        Wi.put(s, a1);
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
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_115;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        a1.a(f);
        a1.getState();
        JVM INSTR tableswitch 1 2: default 174
    //                   1 148
    //                   2 165;
           goto _L3 _L4 _L5
_L4:
        f.onServiceConnected(a1.getComponentName(), a1.getBinder());
        s = a1;
        continue; /* Loop/switch isn't completed */
_L5:
        a1.iT();
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(String s, kb.f f)
    {
        HashMap hashmap = Wi;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Wi.get(s);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service action: ")).append(s).toString());
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        if (!a1.c(f))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=")).append(s).toString());
        }
        a1.b(f);
        if (a1.iW())
        {
            s = mHandler.obtainMessage(0, a1);
            mHandler.sendMessageDelayed(s, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final boolean handleMessage(Message message)
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
        synchronized (Wi)
        {
            if (a1.iW())
            {
                a1.iU();
                Wi.remove(a1.iV());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
