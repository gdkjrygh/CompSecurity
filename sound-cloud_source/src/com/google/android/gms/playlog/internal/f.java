// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.b.aG;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            d, b, a, PlayLoggerContext, 
//            LogEvent

public final class f extends zzj
{

    public final String a;
    public final d b;
    public final Object c = new Object();
    public boolean d;
    private final b e = new b();

    public f(Context context, Looper looper, d d1, zzf zzf)
    {
        super(context, looper, 24, zzf, d1, d1);
        a = context.getPackageName();
        b = (d)zzx.zzv(d1);
        b.a = this;
        d = true;
    }

    public final void a()
    {
        PlayLoggerContext playloggercontext;
        RemoteException remoteexception;
        ArrayList arraylist;
        Iterator iterator;
        b.a a1;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzb.zzY(flag);
        if (e.a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        arraylist = new ArrayList();
        iterator = e.a.iterator();
        playloggercontext = null;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (b.a)iterator.next();
        if (a1.c != null)
        {
            ((a)zzoA()).a(a, a1.a, aG.a(a1.c));
            continue; /* Loop/switch isn't completed */
        }
        if (a1.a.equals(playloggercontext))
        {
            arraylist.add(a1.b);
            continue; /* Loop/switch isn't completed */
        }
        if (!arraylist.isEmpty())
        {
            ((a)zzoA()).a(a, playloggercontext, arraylist);
            arraylist.clear();
        }
        playloggercontext = a1.a;
        arraylist.add(a1.b);
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (!arraylist.isEmpty())
            {
                ((a)zzoA()).a(a, playloggercontext, arraylist);
            }
            e.a.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception) { }
    }

    public final void a(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        b b1 = e;
        b1.a.add(new b.a(playloggercontext, logevent, (byte)0));
        for (; b1.a.size() > b1.b; b1.a.remove(0)) { }
    }

    final void a(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = d;
        d = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!d)
        {
            a();
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

    protected final IInterface zzV(IBinder ibinder)
    {
        return com.google.android.gms.playlog.internal.a.a.a(ibinder);
    }

    protected final String zzfA()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected final String zzfB()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }
}
