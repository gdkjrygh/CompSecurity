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

public final class df
    implements android.os.Handler.Callback
{
    final class a
    {

        private final String kY;
        private final a kZ = new a(this);
        private final HashSet la = new HashSet();
        private boolean lb;
        private IBinder lc;
        private ComponentName ld;
        final df le;
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.ld = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.lc = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.la;
        }

        public void a(de.e e)
        {
            la.add(e);
        }

        public void b(de.e e)
        {
            la.remove(e);
        }

        public a bg()
        {
            return kZ;
        }

        public String bh()
        {
            return kY;
        }

        public boolean bi()
        {
            return la.isEmpty();
        }

        public boolean c(de.e e)
        {
            return la.contains(e);
        }

        public IBinder getBinder()
        {
            return lc;
        }

        public ComponentName getComponentName()
        {
            return ld;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return lb;
        }

        public void l(boolean flag)
        {
            lb = flag;
        }

        public a(String s1)
        {
            le = df.this;
            super();
            kY = s1;
            mState = 0;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a lf;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = df.a(lf.le);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(lf, ibinder);
            a.a(lf, componentname);
            for (Iterator iterator = a.a(lf).iterator(); iterator.hasNext(); ((de.e)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(lf, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = df.a(lf.le);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(lf, null);
            a.a(lf, componentname);
            for (Iterator iterator = a.a(lf).iterator(); iterator.hasNext(); ((de.e)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(lf, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            lf = a1;
            super();
        }
    }


    private static final Object kU = new Object();
    private static df kV;
    private final Context kW;
    private final HashMap kX = new HashMap();
    private final Handler mHandler;

    private df(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        kW = context.getApplicationContext();
    }

    static HashMap a(df df1)
    {
        return df1.kX;
    }

    public static df s(Context context)
    {
        synchronized (kU)
        {
            if (kV == null)
            {
                kV = new df(context.getApplicationContext());
            }
        }
        return kV;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean a(String s1, de.e e)
    {
        HashMap hashmap = kX;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)kX.get(s1);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s1);
        a1.a(e);
        e = (new Intent(s1)).setPackage("com.google.android.gms");
        a1.l(kW.bindService(e, a1.bg(), 129));
        kX.put(s1, a1);
        s1 = a1;
_L7:
        boolean flag = s1.isBound();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        mHandler.removeMessages(0, a1);
        if (a1.c(e))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=").append(s1).toString());
        }
        break MISSING_BLOCK_LABEL_147;
        s1;
        hashmap;
        JVM INSTR monitorexit ;
        throw s1;
        a1.a(e);
        a1.getState();
        JVM INSTR tableswitch 1 2: default 235
    //                   1 180
    //                   2 197;
           goto _L3 _L4 _L5
_L4:
        e.onServiceConnected(a1.getComponentName(), a1.getBinder());
        s1 = a1;
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = (new Intent(s1)).setPackage("com.google.android.gms");
        a1.l(kW.bindService(s1, a1.bg(), 129));
        s1 = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s1, de.e e)
    {
        HashMap hashmap = kX;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)kX.get(s1);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service action: ").append(s1).toString());
        s1;
        hashmap;
        JVM INSTR monitorexit ;
        throw s1;
        if (!a1.c(e))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=").append(s1).toString());
        }
        a1.b(e);
        if (a1.bi())
        {
            s1 = mHandler.obtainMessage(0, a1);
            mHandler.sendMessageDelayed(s1, 5000L);
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
        synchronized (kX)
        {
            if (a1.bi())
            {
                kW.unbindService(a1.bg());
                kX.remove(a1.bh());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
