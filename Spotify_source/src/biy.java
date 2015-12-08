// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

public final class biy extends biw
    implements bqw, bqx
{

    private Context a;
    private AdRequestInfoParcel b;
    private final biu c;
    private final Object d = new Object();
    private biz e;
    private boolean f;

    public biy(Context context, AdRequestInfoParcel adrequestinfoparcel, biu biu)
    {
        super(adrequestinfoparcel, biu);
        a = context;
        b = adrequestinfoparcel;
        c = biu;
        biu = cbb.p;
        int i;
        if (((Boolean)bkv.n().a(biu)).booleanValue())
        {
            f = true;
            biu = bkv.p().a();
        } else
        {
            biu = context.getMainLooper();
        }
        i = adrequestinfoparcel.k.d;
        e = new biz(context, biu, this, this);
        e.n();
    }

    public final void a(int i)
    {
        bka.a("Disconnected from remote ad request service.");
    }

    public final void a(Bundle bundle)
    {
        e();
    }

    public final void a(ConnectionResult connectionresult)
    {
        bka.a("Cannot connect to remote service, fallback to local instance.");
        (new bix(a, b, c)).e();
        connectionresult = new Bundle();
        connectionresult.putString("action", "gms_connection_failed_fallback_to_local");
        bkv.e();
        cjj.b(a, b.k.b, "gmob-apps", connectionresult, true);
    }

    public final bje d()
    {
        obj;
        JVM INSTR monitorenter ;
        bje bje;
        synchronized (d)
        {
            bje = e.g_();
        }
        return bje;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void e_()
    {
        boolean flag = false;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        ckb ckb1;
        if (e.k() || e.o())
        {
            e.c();
        }
        Binder.flushPendingCommands();
        if (!f)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        ckb1 = bkv.p();
        Object obj1 = ckb1.c;
        obj1;
        JVM INSTR monitorenter ;
        if (ckb1.b > 0)
        {
            flag = true;
        }
        int i;
        btl.b(flag, "Invalid state: release() called more times than expected.");
        i = ckb1.b - 1;
        ckb1.b = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ckb1.a.post(new ckb._cls1(ckb1));
        obj1;
        JVM INSTR monitorexit ;
        f = false;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
