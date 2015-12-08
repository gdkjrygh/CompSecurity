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
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            nl, nj, nh, pn, 
//            nm, ni

public class no extends e
{

    private final String BZ;
    private final nl akW;
    private final nj akX = new nj();
    private boolean akY;
    private final Object mw = new Object();

    public no(Context context, nl nl1)
    {
        super(context, nl1, nl1, new String[0]);
        BZ = context.getPackageName();
        akW = (nl)o.i(nl1);
        akW.a(this);
        akY = true;
    }

    private void c(nm nm1, ni ni)
    {
        akX.a(nm1, ni);
    }

    private void d(nm nm1, ni ni)
    {
        try
        {
            mY();
            ((nh)gS()).a(BZ, nm1, ni);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            c(nm1, ni);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        }
        c(nm1, ni);
    }

    private void mY()
    {
        Object obj;
        ArrayList arraylist;
        nj.a a1;
        Iterator iterator;
        boolean flag;
        if (!akY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.a.I(flag);
        if (akX.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = akX.mW().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        a1 = (nj.a)iterator.next();
        if (a1.akO == null) goto _L4; else goto _L3
_L3:
        ((nh)gS()).a(BZ, a1.akM, pn.f(a1.akO));
          goto _L5
_L2:
        return;
_L4:
label0:
        {
            if (!a1.akM.equals(obj))
            {
                break label0;
            }
            arraylist.add(a1.akN);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((nh)gS()).a(BZ, ((nm) (obj)), arraylist);
            arraylist.clear();
        }
        obj = a1.akM;
        arraylist.add(a1.akN);
          goto _L5
        try
        {
            if (!arraylist.isEmpty())
            {
                ((nh)gS()).a(BZ, ((nm) (obj)), arraylist);
            }
            akX.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
          goto _L2
    }

    void S(boolean flag)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = akY;
        akY = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!akY)
        {
            mY();
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

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        l1.f(e1, 0x5e2978, getContext().getPackageName(), bundle);
    }

    public void b(nm nm1, ni ni)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (!akY)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c(nm1, ni);
_L2:
        return;
        d(nm1, ni);
        if (true) goto _L2; else goto _L1
_L1:
        nm1;
        obj;
        JVM INSTR monitorexit ;
        throw nm1;
    }

    protected nh bD(IBinder ibinder)
    {
        return nh.a.bC(ibinder);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return bD(ibinder);
    }

    public void start()
    {
label0:
        {
            synchronized (mw)
            {
                if (!isConnecting() && !isConnected())
                {
                    break label0;
                }
            }
            return;
        }
        akW.R(true);
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
        synchronized (mw)
        {
            akW.R(false);
            disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
