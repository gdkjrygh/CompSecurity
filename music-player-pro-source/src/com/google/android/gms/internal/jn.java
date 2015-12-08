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

public final class jn
    implements android.os.Handler.Callback
{
    final class a
    {

        private final String Ng;
        private final a Nh = new a(this);
        private final HashSet Ni = new HashSet();
        private boolean Nj;
        private IBinder Nk;
        private ComponentName Nl;
        final jn Nm;
        private int mState;

        static int a(a a1, int i)
        {
            a1.mState = i;
            return i;
        }

        static ComponentName a(a a1, ComponentName componentname)
        {
            a1.Nl = componentname;
            return componentname;
        }

        static IBinder a(a a1, IBinder ibinder)
        {
            a1.Nk = ibinder;
            return ibinder;
        }

        static HashSet a(a a1)
        {
            return a1.Ni;
        }

        public void a(jl.f f)
        {
            Ni.add(f);
        }

        public void b(jl.f f)
        {
            Ni.remove(f);
        }

        public boolean c(jl.f f)
        {
            return Ni.contains(f);
        }

        public IBinder getBinder()
        {
            return Nk;
        }

        public ComponentName getComponentName()
        {
            return Nl;
        }

        public int getState()
        {
            return mState;
        }

        public void hA()
        {
            Intent intent = (new Intent(Ng)).setPackage("com.google.android.gms");
            Nj = jn.b(Nm).bindService(intent, Nh, 129);
            if (Nj)
            {
                mState = 3;
                return;
            } else
            {
                jn.b(Nm).unbindService(Nh);
                return;
            }
        }

        public void hB()
        {
            jn.b(Nm).unbindService(Nh);
            Nj = false;
            mState = 2;
        }

        public String hC()
        {
            return Ng;
        }

        public boolean hD()
        {
            return Ni.isEmpty();
        }

        public boolean isBound()
        {
            return Nj;
        }

        public a(String s)
        {
            Nm = jn.this;
            super();
            Ng = s;
            mState = 2;
        }
    }

    public class a.a
        implements ServiceConnection
    {

        final a Nn;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = jn.a(Nn.Nm);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Nn, ibinder);
            a.a(Nn, componentname);
            for (Iterator iterator = a.a(Nn).iterator(); iterator.hasNext(); ((jl.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Nn, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = jn.a(Nn.Nm);
            hashmap;
            JVM INSTR monitorenter ;
            a.a(Nn, null);
            a.a(Nn, componentname);
            for (Iterator iterator = a.a(Nn).iterator(); iterator.hasNext(); ((jl.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.a(Nn, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a.a(a a1)
        {
            Nn = a1;
            super();
        }
    }


    private static final Object Nd = new Object();
    private static jn Ne;
    private final HashMap Nf = new HashMap();
    private final Handler mHandler;
    private final Context mO;

    private jn(Context context)
    {
        mHandler = new Handler(context.getMainLooper(), this);
        mO = context.getApplicationContext();
    }

    public static jn J(Context context)
    {
        synchronized (Nd)
        {
            if (Ne == null)
            {
                Ne = new jn(context.getApplicationContext());
            }
        }
        return Ne;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(jn jn1)
    {
        return jn1.Nf;
    }

    static Context b(jn jn1)
    {
        return jn1.mO;
    }

    public boolean a(String s, jl.f f)
    {
        HashMap hashmap = Nf;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Nf.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        a1.hA();
        Nf.put(s, a1);
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
        break MISSING_BLOCK_LABEL_118;
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
        a1.hA();
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, jl.f f)
    {
        HashMap hashmap = Nf;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)Nf.get(s);
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
        if (a1.hD())
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
        synchronized (Nf)
        {
            if (a1.hD())
            {
                a1.hB();
                Nf.remove(a1.hC());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
