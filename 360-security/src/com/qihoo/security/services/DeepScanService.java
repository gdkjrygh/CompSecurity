// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.b.c;
import com.qihoo.security.env.QVSEnv;
import com.qihoo360.common.utils.NativeLoader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.services:
//            DeepScanItem, IDeepScan, d, c

public class DeepScanService extends Service
{
    private class a extends Handler
    {

        final WeakReference a;
        final DeepScanService b;

        public void handleMessage(Message message)
        {
            DeepScanService deepscanservice = (DeepScanService)a.get();
            if (deepscanservice != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (message.what)
            {
            default:
                return;

            case 4: // '\004'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                if (DeepScanService.a)
                {
                    if (b.d.e != null)
                    {
                        b.d.e.c();
                    }
                    System.exit(0);
                    return;
                }
                break;

            case 2: // '\002'
                deepscanservice.d.e.a();
                return;

            case 3: // '\003'
                deepscanservice.d.c();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (b.d.e == null) goto _L1; else goto _L4
_L4:
            b.d.e.b();
            return;
        }

        public a(DeepScanService deepscanservice1)
        {
            b = DeepScanService.this;
            super();
            a = new WeakReference(deepscanservice1);
        }
    }


    public static final String TAG = "DeepScanService";
    static boolean a = false;
    final IDeepScan.a b = new IDeepScan.a() {

        final DeepScanService a;

        public int a()
            throws RemoteException
        {
            return 0x13351f2;
        }

        public int a(String s, boolean flag)
            throws RemoteException
        {
            QVSEnv.bEvalMode = flag;
            a.d.a(QVSEnv.bEvalMode);
            return a.d.c(s);
        }

        public int a(List list)
            throws RemoteException
        {
            return 0x80004001;
        }

        public int a(List list, boolean flag)
            throws RemoteException
        {
            QVSEnv.bEvalMode = flag;
            a.d.a(QVSEnv.bEvalMode);
            return a.d.a(list);
        }

        public String a(String s)
            throws RemoteException
        {
            if (TextUtils.isEmpty(s))
            {
                return null;
            } else
            {
                return a.d.a(s);
            }
        }

        public String a(String s, String s1)
            throws RemoteException
        {
            if (TextUtils.isEmpty(s))
            {
                return null;
            } else
            {
                return a.d.a(s, s1);
            }
        }

        public boolean a(com.qihoo.security.services.c c1)
            throws RemoteException
        {
            return a.d.a(c1);
        }

        public int b()
        {
            return a.d.a();
        }

        public int b(String s, String s1)
            throws RemoteException
        {
            a.d.b(s, s1);
            return 0;
        }

        public int b(String s, boolean flag)
            throws RemoteException
        {
            QVSEnv.bEvalMode = flag;
            a.d.a(QVSEnv.bEvalMode);
            return a.d.d(s);
        }

        public void b(com.qihoo.security.services.c c1)
            throws RemoteException
        {
            a.d.b(c1);
        }

        public int c()
        {
            if (a.c.hasMessages(3))
            {
                a.c.removeMessages(3);
            }
            return a.d.b();
        }

        public int d()
        {
            return a.d.d();
        }

        public int e()
        {
            return a.d.e();
        }

        public int f()
        {
            return a.d.f();
        }

        public int g()
            throws RemoteException
        {
            a.d.g();
            return 0;
        }

            
            {
                a = DeepScanService.this;
                super();
            }
    };
    final a c = new a(this);
    final c d;

    public DeepScanService()
    {
        d = new c(this, c);
    }

    public static void scanAll(IDeepScan ideepscan, boolean flag)
    {
        if (ideepscan == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        QVSEnv.bEvalMode = flag;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new DeepScanItem(4, null));
        arraylist.add(new DeepScanItem(3, null));
        ideepscan.a(arraylist, flag);
        return;
        ideepscan;
    }

    public static void scanInstalledApps(IDeepScan ideepscan, boolean flag)
    {
        if (ideepscan == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        QVSEnv.bEvalMode = flag;
        DeepScanItem deepscanitem = new DeepScanItem(3, null);
        ArrayList arraylist = new ArrayList();
        arraylist.add(deepscanitem);
        ideepscan.a(arraylist, flag);
        return;
        ideepscan;
    }

    public static void scanPackage(IDeepScan ideepscan, String s, boolean flag)
    {
        if (ideepscan == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        QVSEnv.bEvalMode = flag;
        ideepscan.a(s, flag);
        return;
        ideepscan;
    }

    public static void scanPackageList(IDeepScan ideepscan, List list, boolean flag)
    {
        if (ideepscan == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        QVSEnv.bEvalMode = flag;
        list = list.iterator();
_L2:
        if (!list.hasNext())
        {
            return;
        }
        ideepscan.a((String)list.next(), flag);
        if (true) goto _L2; else goto _L1
_L1:
        ideepscan;
    }

    public static void scanPath(IDeepScan ideepscan, String s, boolean flag)
    {
        if (ideepscan == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        QVSEnv.bEvalMode = flag;
        s = new DeepScanItem(4, s);
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        ideepscan.a(arraylist, flag);
        return;
        ideepscan;
    }

    public IBinder onBind(Intent intent)
    {
        a = false;
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        d.e = new d(getApplicationContext(), c);
        NativeLoader.load(this, "cloudscan-jni-1.0.5.2002");
    }

    public void onDestroy()
    {
        super.onDestroy();
        a = true;
        c.sendEmptyMessageDelayed(1, 6000L);
    }

}
