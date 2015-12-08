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

public final class hd
    implements android.os.Handler.Callback
{
    final class a
    {

        private final HashSet GA = new HashSet();
        private boolean GB;
        private IBinder GC;
        private ComponentName GD;
        final hd GE;
        private final String Gy;
        private final a Gz = new a(this);
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.GD = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.GC = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.GA;
        }

        public void B(boolean flag)
        {
            GB = flag;
        }

        public void a(hb.f f)
        {
            GA.add(f);
        }

        public void b(hb.f f)
        {
            GA.remove(f);
        }

        public boolean c(hb.f f)
        {
            return GA.contains(f);
        }

        public a fx()
        {
            return Gz;
        }

        public String fy()
        {
            return Gy;
        }

        public boolean fz()
        {
            return GA.isEmpty();
        }

        public IBinder getBinder()
        {
            return GC;
        }

        public ComponentName getComponentName()
        {
            return GD;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return GB;
        }

        public a(String s)
        {
            GE = hd.this;
            super();
            Gy = s;
            mState = 0;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a GF;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = hd.a(GF.GE);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(GF, ibinder);
            a.a(GF, componentname);
            for (Iterator iterator = a.a(GF).iterator(); iterator.hasNext(); ((hb.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(GF, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = hd.a(GF.GE);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(GF, null);
            a.a(GF, componentname);
            for (Iterator iterator = a.a(GF).iterator(); iterator.hasNext(); ((hb.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(GF, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            GF = a1;
            super();
        }
    }


    private static final Object Gv = new Object();
    private static hd Gw;
    private final HashMap Gx = new HashMap();
    private final Context lz;
    private final Handler mHandler;

    private hd(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        lz = context.getApplicationContext();
    }

    public static hd E(Context context)
    {
        synchronized (Gv)
        {
            if (Gw == null)
            {
                Gw = new hd(context.getApplicationContext());
            }
        }
        return Gw;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(hd hd1)
    {
        return hd1.Gx;
    }

    public boolean a(String s, hb.f f)
    {
        HashMap hashmap = Gx;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Gx.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        f = (new Intent(s)).setPackage("com.google.android.gms");
        a1.B(lz.bindService(f, a1.fx(), 129));
        Gx.put(s, a1);
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
        a1.B(lz.bindService(s, a1.fx(), 129));
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, hb.f f)
    {
        HashMap hashmap = Gx;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Gx.get(s);
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
        if (a1.fz())
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
        synchronized (Gx)
        {
            if (a1.fz())
            {
                lz.unbindService(a1.fx());
                Gx.remove(a1.fy());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
