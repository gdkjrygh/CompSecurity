// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jx, ou, os, 
//            oq, je, qw, ov, 
//            jt, or

public class ox extends jl
{

    private final String CS;
    private final ou anm;
    private final os ann = new os();
    private boolean ano;
    private final Object mH = new Object();

    public ox(Context context, ou ou1)
    {
        super(context, ou1, ou1, new String[0]);
        CS = context.getPackageName();
        anm = (ou)jx.i(ou1);
        anm.a(this);
        ano = true;
    }

    private void c(ov ov1, or or1)
    {
        ann.a(ov1, or1);
    }

    private void d(ov ov1, or or1)
    {
        try
        {
            or();
            ((oq)hw()).a(CS, ov1, or1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            c(ov1, or1);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        }
        c(ov1, or1);
    }

    private void or()
    {
        Object obj;
        ArrayList arraylist;
        os.a a1;
        Iterator iterator;
        boolean flag;
        if (!ano)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        je.K(flag);
        if (ann.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = ann.op().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        a1 = (os.a)iterator.next();
        if (a1.and == null) goto _L4; else goto _L3
_L3:
        ((oq)hw()).a(CS, a1.anb, qw.f(a1.and));
          goto _L5
_L2:
        return;
_L4:
label0:
        {
            if (!a1.anb.equals(obj))
            {
                break label0;
            }
            arraylist.add(a1.anc);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((oq)hw()).a(CS, ((ov) (obj)), arraylist);
            arraylist.clear();
        }
        obj = a1.anb;
        arraylist.add(a1.anc);
          goto _L5
        try
        {
            if (!arraylist.isEmpty())
            {
                ((oq)hw()).a(CS, ((ov) (obj)), arraylist);
            }
            ann.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
          goto _L2
    }

    void U(boolean flag)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = ano;
        ano = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!ano)
        {
            or();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        jt1.f(e, 0x648278, getContext().getPackageName(), bundle);
    }

    public void b(ov ov1, or or1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (!ano)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c(ov1, or1);
_L2:
        return;
        d(ov1, or1);
        if (true) goto _L2; else goto _L1
_L1:
        ov1;
        obj;
        JVM INSTR monitorexit ;
        throw ov1;
    }

    protected oq bJ(IBinder ibinder)
    {
        return oq.a.bI(ibinder);
    }

    protected String bK()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    protected IInterface l(IBinder ibinder)
    {
        return bJ(ibinder);
    }

    public void start()
    {
label0:
        {
            synchronized (mH)
            {
                if (!isConnecting() && !isConnected())
                {
                    break label0;
                }
            }
            return;
        }
        anm.T(true);
        connect();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (mH)
        {
            anm.T(false);
            disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
