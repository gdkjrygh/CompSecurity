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

public final class fh
    implements android.os.Handler.Callback
{
    final class a
    {

        private boolean DA;
        private IBinder DB;
        private ComponentName DC;
        final fh DD;
        private final String Dx;
        private final a Dy = new a(this);
        private final HashSet Dz = new HashSet();
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.DC = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.DB = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.Dz;
        }

        public void a(ff.f f)
        {
            Dz.add(f);
        }

        public void b(ff.f f)
        {
            Dz.remove(f);
        }

        public boolean c(ff.f f)
        {
            return Dz.contains(f);
        }

        public a eP()
        {
            return Dy;
        }

        public String eQ()
        {
            return Dx;
        }

        public boolean eR()
        {
            return Dz.isEmpty();
        }

        public IBinder getBinder()
        {
            return DB;
        }

        public ComponentName getComponentName()
        {
            return DC;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return DA;
        }

        public void y(boolean flag)
        {
            DA = flag;
        }

        public a(String s)
        {
            DD = fh.this;
            super();
            Dx = s;
            mState = 0;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a DE;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = fh.a(DE.DD);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(DE, ibinder);
            a.a(DE, componentname);
            for (Iterator iterator = a.a(DE).iterator(); iterator.hasNext(); ((ff.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(DE, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = fh.a(DE.DD);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(DE, null);
            a.a(DE, componentname);
            for (Iterator iterator = a.a(DE).iterator(); iterator.hasNext(); ((ff.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(DE, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            DE = a1;
            super();
        }
    }


    private static final Object Du = new Object();
    private static fh Dv;
    private final HashMap Dw = new HashMap();
    private final Context lp;
    private final Handler mHandler;

    private fh(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        lp = context.getApplicationContext();
    }

    static HashMap a(fh fh1)
    {
        return fh1.Dw;
    }

    public static fh x(Context context)
    {
        synchronized (Du)
        {
            if (Dv == null)
            {
                Dv = new fh(context.getApplicationContext());
            }
        }
        return Dv;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean a(String s, ff.f f)
    {
        HashMap hashmap = Dw;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Dw.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        f = (new Intent(s)).setPackage("com.google.android.gms");
        a1.y(lp.bindService(f, a1.eP(), 129));
        Dw.put(s, a1);
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
        a1.y(lp.bindService(s, a1.eP(), 129));
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, ff.f f)
    {
        HashMap hashmap = Dw;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Dw.get(s);
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
        if (a1.eR())
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
        synchronized (Dw)
        {
            if (a1.eR())
            {
                lp.unbindService(a1.eP());
                Dw.remove(a1.eQ());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
