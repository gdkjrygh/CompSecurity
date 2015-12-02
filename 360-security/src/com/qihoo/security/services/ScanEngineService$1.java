// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.a.d;
import com.qihoo.security.engine.f.a;
import com.qihoo.security.env.QVSEnv;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.services:
//            ScanEngineService, a, ScanResult, b

class a extends a
{

    final ScanEngineService a;

    public int a(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int a(int k, int l, String s)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k, l, s);
        } else
        {
            return 0x80004001;
        }
    }

    public int a(int k, ScanResult scanresult)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k, scanresult);
        } else
        {
            return 0x80004001;
        }
    }

    public int a(int k, ScanResult scanresult, b b1)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k, scanresult, b1);
        } else
        {
            return 0x80004001;
        }
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k, s, s1);
        } else
        {
            return 0x80004001;
        }
    }

    public int a(int k, List list)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.a(k, list);
        } else
        {
            return 0x80004001;
        }
    }

    public String a(String s)
        throws RemoteException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("upload", ScanEngineService.c.get());
            jsonobject1.put("download", com.qihoo.security.services.ScanEngineService.d.get());
            jsonobject.put("network", jsonobject1);
        }
        catch (JSONException jsonexception) { }
        if ("network".equals(s))
        {
            return jsonobject1.toString();
        } else
        {
            return jsonobject.toString();
        }
    }

    public void a(ScanResult scanresult)
        throws RemoteException
    {
        if (scanresult.fileInfo.apkInfo != null)
        {
            scanresult.fileInfo.apkInfo.closeClassesDex();
        }
    }

    public void a(boolean flag)
        throws RemoteException
    {
        QVSEnv.bEvalMode = flag;
    }

    public int b(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.b(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int b(int k, ScanResult scanresult)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.b(k, scanresult);
        } else
        {
            return 0x80004001;
        }
    }

    public int c(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.c(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int d(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.d(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int e(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.e(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int f(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.f(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int g(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.g(k);
        } else
        {
            return 0x80004001;
        }
    }

    public int h(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.h(k);
        } else
        {
            return 0x80004001;
        }
    }

    public String i(int k)
        throws RemoteException
    {
        com.qihoo.security.services.a a1 = (com.qihoo.security.services.a)a.b.get(k);
        if (a1 != null)
        {
            return a1.i(k);
        } else
        {
            return null;
        }
    }

    public IBinder j(int k)
        throws RemoteException
    {
        IBinder ibinder = null;
        k;
        JVM INSTR tableswitch 6 8: default 28
    //                   6 43
    //                   7 28
    //                   8 58;
           goto _L1 _L2 _L1 _L3
_L1:
        Object obj = null;
_L5:
        if (obj != null)
        {
            ibinder = ((com.qihoo.security.services.a) (obj)).asBinder();
        }
        return ibinder;
_L2:
        obj = new d(a);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new a(a);
        if (true) goto _L5; else goto _L4
_L4:
    }

    (ScanEngineService scanengineservice)
    {
        a = scanengineservice;
        super();
    }
}
