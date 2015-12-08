// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;

import CR;
import CT;
import CU;
import CV;
import CW;
import CX;
import CY;
import CZ;
import Da;
import Db;
import Dc;
import Dd;
import De;
import Df;
import Dg;
import Dh;
import Di;
import Dj;
import Dk;
import Dm;
import Dn;
import Eg;
import Eh;
import Ei;
import LB;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.snapchat.android.Timber;
import com.snapchat.android.operation.FindFriendsOperation;
import com.snapchat.android.operation.ScannableOperation;
import com.snapchat.android.operation.identity.UpdateVerifiedDeviceOperation;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import lO;

public class SnapchatService extends Service
{
    final class a
        implements Runnable
    {

        private final CU a;
        private SnapchatService b;

        public final void run()
        {
            CU cu;
            Object obj;
            a.postProcess(SnapchatService.a(b));
            obj = SnapchatService.c(b);
            cu = a;
            SparseArray sparsearray = ((Ei) (obj)).d;
            sparsearray;
            JVM INSTR monitorenter ;
            obj = (HashSet)((Ei) (obj)).d.get(Ei.b(cu));
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Eh)((Iterator) (obj)).next()).a(cu)) { }
            break MISSING_BLOCK_LABEL_92;
            Exception exception;
            exception;
            sparsearray;
            JVM INSTR monitorexit ;
            throw exception;
            sparsearray;
            JVM INSTR monitorexit ;
            SnapchatService.a(b, a);
            return;
        }

        public a(CU cu)
        {
            b = SnapchatService.this;
            super();
            a = cu;
        }
    }

    final class b
        implements Runnable
    {

        private final CU a;
        private SnapchatService b;

        public final void run()
        {
            lO lo;
            try
            {
                a.process(SnapchatService.a(b));
                SnapchatService.a().post(b. new a(a));
                return;
            }
            catch (Exception exception)
            {
                lo = new lO(a.toString(), exception);
            }
            Timber.e("SnapchatService", (new StringBuilder("ProcessRunnable halted ")).append(lo).toString(), new Object[0]);
            if (ReleaseManager.f())
            {
                SnapchatService.a().post(new Runnable(lo) {

                    private RuntimeException a;

                    public final void run()
                    {
                        throw a;
                    }

            
            {
                a = runtimeexception;
                super();
            }
                });
            }
            SnapchatService.b(b).a(lo);
        }

        public b(CU cu)
        {
            b = SnapchatService.this;
            super();
            a = cu;
        }
    }

    static final class c
        implements ThreadFactory
    {

        public final Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setName((new StringBuilder("Worker:")).append(System.currentTimeMillis() % 0x186a0L).toString());
            runnable.setPriority(1);
            return runnable;
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }


    private static Handler g;
    private Context a;
    private ThreadFactory b;
    private ExecutorService c;
    private ArrayList d;
    private Ei e;
    private final LB f;
    private long h;
    private final Runnable i;

    public SnapchatService()
    {
        this(new LB());
    }

    protected SnapchatService(LB lb)
    {
        b = new c((byte)0);
        i = new Runnable() {

            private SnapchatService a;

            public final void run()
            {
                Timber.c("SnapchatService", (new StringBuilder("mStopRunnable mFutureList.size()=")).append(SnapchatService.d(a).size()).append(" hasPendingIntents=").append(SnapchatService.c(a).d()).toString(), new Object[0]);
                if (SnapchatService.d(a).isEmpty() && !SnapchatService.c(a).d())
                {
                    Timber.c("SnapchatService", "Stop service which lived for %d ms", new Object[] {
                        Long.valueOf(SystemClock.elapsedRealtime() - SnapchatService.e(a))
                    });
                    a.stopSelf();
                }
            }

            
            {
                a = SnapchatService.this;
                super();
            }
        };
        f = lb;
    }

    static Context a(SnapchatService snapchatservice)
    {
        return snapchatservice.a;
    }

    static Handler a()
    {
        return g;
    }

    private void a(Intent intent)
    {
        Timber.c("SnapchatService", (new StringBuilder("finalizeRequest ")).append(intent).toString(), new Object[0]);
        if (Ei.a(intent))
        {
            Object obj = Integer.valueOf(Ei.b(intent));
            Timber.c("SnapchatService", (new StringBuilder("finalizeRequest - requestId ")).append(obj).toString(), new Object[0]);
            Ei ei = e;
            int j = ((Integer) (obj)).intValue();
            ei.a.remove(Integer.valueOf(j));
            obj = e;
            if (intent != null)
            {
                int k;
                int l;
                if (intent != null && intent.getBooleanExtra("from_pool", false))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0)
                {
                    ((Ei) (obj)).b.a(intent);
                }
            }
        }
        for (k = 0; k < d.size(); k = l + 1)
        {
            l = k;
            if (((Future)d.get(k)).isDone())
            {
                Timber.c("SnapchatService", (new StringBuilder("Removed one future - mFutureList.size()=")).append(d.size()).toString(), new Object[0]);
                d.remove(k);
                l = k - 1;
            }
        }

        Timber.c("SnapchatService", (new StringBuilder("finalizeRequest mStopRunnable futureList.size()==")).append(d.size()).append(" hasPendingIntents=").append(e.d()).toString(), new Object[0]);
        if (d.isEmpty() && !e.d())
        {
            Timber.c("SnapchatService", "Will stop service in 5 seconds", new Object[0]);
            g.removeCallbacks(i);
            g.postDelayed(i, 5000L);
        }
    }

    static void a(SnapchatService snapchatservice, CU cu)
    {
        Timber.c("SnapchatService", (new StringBuilder("finalizeRequest ")).append(cu).toString(), new Object[0]);
        snapchatservice.a(cu.getIntent());
    }

    static LB b(SnapchatService snapchatservice)
    {
        return snapchatservice.f;
    }

    static Ei c(SnapchatService snapchatservice)
    {
        return snapchatservice.e;
    }

    static ArrayList d(SnapchatService snapchatservice)
    {
        return snapchatservice.d;
    }

    static long e(SnapchatService snapchatservice)
    {
        return snapchatservice.h;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        a = getApplicationContext();
        h = SystemClock.elapsedRealtime();
        if (g == null)
        {
            g = new Handler(Looper.getMainLooper());
        }
        c = Executors.newCachedThreadPool(b);
        d = new ArrayList();
        e = Ei.a();
    }

    public void onDestroy()
    {
        super.onDestroy();
        Timber.c("SnapchatService", "onDestroy()", new Object[0]);
        c.shutdown();
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        Timber.c("SnapchatService", (new StringBuilder("onStartCommand ")).append(intent).toString(), new Object[0]);
        if (intent != null)
        {
            Timber.c("SnapchatService", (new StringBuilder("onStartCommand with op code ")).append(intent.getIntExtra("op_code", -1)).toString(), new Object[0]);
        }
        g.removeCallbacks(i);
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent.getIntExtra("op_code", -1);
        JVM INSTR tableswitch 1000 1034: default 236
    //                   1000 277
    //                   1001 290
    //                   1002 303
    //                   1003 236
    //                   1004 316
    //                   1005 329
    //                   1006 236
    //                   1007 236
    //                   1008 236
    //                   1009 236
    //                   1010 342
    //                   1011 236
    //                   1012 355
    //                   1013 236
    //                   1014 236
    //                   1015 368
    //                   1016 382
    //                   1017 395
    //                   1018 408
    //                   1019 236
    //                   1020 421
    //                   1021 434
    //                   1022 447
    //                   1023 460
    //                   1024 473
    //                   1025 486
    //                   1026 236
    //                   1027 236
    //                   1028 499
    //                   1029 512
    //                   1030 236
    //                   1031 525
    //                   1032 538
    //                   1033 552
    //                   1034 565;
           goto _L2 _L3 _L4 _L5 _L2 _L6 _L7 _L2 _L2 _L2 _L2 _L8 _L2 _L9 _L2 _L2 _L10 _L11 _L12 _L13 _L2 _L14 _L15 _L16 _L17 _L18 _L19 _L2 _L2 _L20 _L21 _L2 _L22 _L23 _L24 _L25
_L25:
        break MISSING_BLOCK_LABEL_565;
_L2:
        Object obj = null;
_L26:
        if (obj == null)
        {
            Timber.e("SnapchatService", (new StringBuilder("Failed to create a service operation from ")).append(intent).toString(), new Object[0]);
            a(intent);
            return 2;
        } else
        {
            d.add(c.submit(new b(((CU) (obj)))));
            Timber.c("SnapchatService", "The new operation %s has been submitted. mFutureList.size()=%d", new Object[] {
                obj, Integer.valueOf(d.size())
            });
            return 2;
        }
_L3:
        obj = new CT(intent);
          goto _L26
_L4:
        obj = new CR(intent);
          goto _L26
_L5:
        obj = new FindFriendsOperation(intent);
          goto _L26
_L6:
        obj = new CV(intent);
          goto _L26
_L7:
        obj = new CY(intent);
          goto _L26
_L8:
        obj = new CW(intent);
          goto _L26
_L9:
        obj = new Dj(intent);
          goto _L26
_L10:
        obj = new CZ(intent, (byte)0);
          goto _L26
_L11:
        obj = new Dh(intent);
          goto _L26
_L12:
        obj = new Da(intent);
          goto _L26
_L13:
        obj = new Dg(intent);
          goto _L26
_L14:
        obj = new Dk(intent);
          goto _L26
_L15:
        obj = new Di(intent);
          goto _L26
_L16:
        obj = new Dn(intent);
          goto _L26
_L17:
        obj = new Df(intent);
          goto _L26
_L18:
        obj = new Dm(intent);
          goto _L26
_L19:
        obj = new De(intent);
          goto _L26
_L20:
        obj = new Dd(intent);
          goto _L26
_L21:
        obj = new Db(intent);
          goto _L26
_L22:
        obj = new Dc(intent);
          goto _L26
_L23:
        obj = new UpdateVerifiedDeviceOperation(intent, (byte)0);
          goto _L26
_L24:
        obj = new CX(intent);
          goto _L26
        obj = new ScannableOperation(intent);
          goto _L26
    }
}
