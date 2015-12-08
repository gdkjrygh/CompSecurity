// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

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

public final class g
    implements android.os.Handler.Callback
{
    final class a
    {

        private final String LV;
        private final a LW = new a(this);
        private final HashSet LX = new HashSet();
        private boolean LY;
        private IBinder LZ;
        private ComponentName Ma;
        final g Mb;
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.Ma = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.LZ = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.LX;
        }

        public void J(boolean flag)
        {
            LY = flag;
        }

        public void a(e.f f)
        {
            LX.add(f);
        }

        public void b(e.f f)
        {
            LX.remove(f);
        }

        public boolean c(e.f f)
        {
            return LX.contains(f);
        }

        public a gW()
        {
            return LW;
        }

        public String gX()
        {
            return LV;
        }

        public boolean gY()
        {
            return LX.isEmpty();
        }

        public IBinder getBinder()
        {
            return LZ;
        }

        public ComponentName getComponentName()
        {
            return Ma;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return LY;
        }

        public a(String s)
        {
            Mb = g.this;
            super();
            LV = s;
            mState = 0;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a Mc;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = g.a(Mc.Mb);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Mc, ibinder);
            a.a(Mc, componentname);
            for (Iterator iterator = a.a(Mc).iterator(); iterator.hasNext(); ((e.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Mc, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = g.a(Mc.Mb);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Mc, null);
            a.a(Mc, componentname);
            for (Iterator iterator = a.a(Mc).iterator(); iterator.hasNext(); ((e.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Mc, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            Mc = a1;
            super();
        }
    }


    private static final Object LS = new Object();
    private static g LT;
    private final HashMap LU = new HashMap();
    private final Context mD;
    private final Handler mHandler;

    private g(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        mD = context.getApplicationContext();
    }

    public static g J(Context context)
    {
        synchronized (LS)
        {
            if (LT == null)
            {
                LT = new g(context.getApplicationContext());
            }
        }
        return LT;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(g g1)
    {
        return g1.LU;
    }

    public boolean a(String s, e.f f)
    {
        HashMap hashmap = LU;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)LU.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        f = (new Intent(s)).setPackage("com.google.android.gms");
        a1.J(mD.bindService(f, a1.gW(), 129));
        LU.put(s, a1);
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
        a1.J(mD.bindService(s, a1.gW(), 129));
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, e.f f)
    {
        HashMap hashmap = LU;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)LU.get(s);
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
        if (a1.gY())
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
        synchronized (LU)
        {
            if (a1.gY())
            {
                mD.unbindService(a1.gW());
                LU.remove(a1.gX());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
