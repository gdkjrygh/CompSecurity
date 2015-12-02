// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.e.b;
import com.qihoo360.common.utils.NativeLoader;
import com.qihoo360.common.utils.SysInfo;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            QueryItem, CacheQuery, NetQuery

public class a
    implements com.qihoo.security.services.a
{

    private static final String c = String.valueOf(387L);
    volatile int a;
    final Context b;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private final HashMap e = new HashMap();
    private CacheQuery f;
    private String g;
    private int h;
    private final AtomicInteger i = new AtomicInteger(0);
    private int j;

    public a(Context context)
    {
        f = null;
        g = null;
        a = 0;
        h = 0;
        j = 5000;
        b = context;
    }

    private int a(QueryItem queryitem, ScanResult scanresult)
    {
        boolean flag = true;
        if (queryitem.a.level < 70 || queryitem.a.level > 79) goto _L2; else goto _L1
_L1:
        scanresult.riskClass = 800;
        scanresult.riskDescription = queryitem.a.softDescription;
        scanresult.fileInfo = queryitem.a;
        scanresult.ruleid = 0x2000000;
        if (TextUtils.isEmpty(scanresult.fileInfo.trojanName))
        {
            scanresult.fileInfo.trojanName = "Trojan.Generic";
        }
_L8:
        int k = 0;
_L4:
        return k;
_L2:
        if (queryitem.a.level >= 60 && queryitem.a.level <= 69)
        {
            scanresult.riskClass = 700;
            scanresult.riskDescription = queryitem.a.softDescription;
            scanresult.fileInfo = queryitem.a;
            scanresult.ruleid = 0x2000000;
            continue; /* Loop/switch isn't completed */
        }
        if (queryitem.a.level >= 50 && queryitem.a.level <= 59)
        {
            scanresult.riskClass = 100;
            scanresult.riskDescription = queryitem.a.softDescription;
            scanresult.fileInfo = queryitem.a;
            scanresult.ruleid = 0x2000000;
            continue; /* Loop/switch isn't completed */
        }
        if (queryitem.a.level < 10 || queryitem.a.level > 29)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        if (!QVSEnv.bEvalMode || scanresult.fileInfo.apkInfo == null)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (scanresult.fileInfo.apkInfo.maliceRank > 0) goto _L4; else goto _L3
_L3:
        scanresult.riskClass = 0;
        scanresult.riskDescription = queryitem.a.softDescription;
        scanresult.fileInfo = queryitem.a;
        scanresult.ruleid = 0x2000000;
        continue; /* Loop/switch isn't completed */
        int l;
        if ((scanresult.fileInfo.queryFlags & 1L) == 1L)
        {
            scanresult.fileInfo = queryitem.a;
            return 0;
        }
        scanresult.fileInfo.shouldUpload = queryitem.a.shouldUpload;
        l = queryitem.a.level;
        if (l >= 40 && l <= 49 && scanresult.fileInfo.level == -1)
        {
            scanresult.fileInfo.level = l;
        }
        k = ((flag) ? 1 : 0);
        if (l < 30) goto _L4; else goto _L5
_L5:
        k = ((flag) ? 1 : 0);
        if (l > 49) goto _L4; else goto _L6
_L6:
        if (scanresult.fileInfo.queryFrom == -1)
        {
            scanresult.fileInfo.queryFrom = 100;
        }
        scanresult.fileInfo.extIniInfo = queryitem.a.extIniInfo;
        scanresult.fileInfo.adPluginInfo = queryitem.a.adPluginInfo;
        scanresult.fileInfo.hipsActionDescription = queryitem.a.hipsActionDescription;
        scanresult.fileInfo.hipsActionRevise = queryitem.a.hipsActionRevise;
        scanresult.fileInfo.hipsPrivilegeDescription = queryitem.a.hipsPrivilegeDescription;
        scanresult.fileInfo.hipsPrivilegeRevise = queryitem.a.hipsPrivilegeRevise;
        scanresult.fileInfo.fileDescription = queryitem.a.fileDescription;
        return 1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(QueryItem queryitem, List list)
    {
        list = list.iterator();
        ScanResult scanresult;
        do
        {
            if (!list.hasNext())
            {
                return;
            }
            scanresult = (ScanResult)list.next();
        } while (queryitem.a.filePath != scanresult.fileInfo.filePath);
        a(queryitem, scanresult);
    }

    private int b(ScanResult scanresult)
    {
        if (f != null)
        {
            QueryItem aqueryitem[] = new QueryItem[1];
            aqueryitem[0] = new QueryItem(scanresult.fileInfo.clone(), 1, 0L);
            if (f.Query(aqueryitem) > 0)
            {
                return a(aqueryitem[0], scanresult);
            }
        }
        return 0x80004005;
    }

    private void b(String s)
    {
        int k;
        try
        {
            k = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        j = k;
    }

    public int a(int k)
        throws RemoteException
    {
        NativeLoader.load(b, "cloudscan-jni-1.0.5.2002");
        return 0;
    }

    public int a(int k, int l, String s)
        throws RemoteException
    {
        boolean flag = true;
        k = ((flag) ? 1 : 0);
        if (l == 1)
        {
            File file = new File(b.getFilesDir(), "cswtb.dat");
            k = ((flag) ? 1 : 0);
            if (file.exists())
            {
                k = ((flag) ? 1 : 0);
                if (file.isFile())
                {
                    k = ((flag) ? 1 : 0);
                    if (file.canRead())
                    {
                        String s1 = SysInfo.getIMEI(b);
                        s = s1;
                        if (s1 == null)
                        {
                            s = "0123456789";
                        }
                        CacheQuery.SetGlobalOption("0", s);
                        s = new CacheQuery(b);
                        s.Create(b.getFileStreamPath("cloud.cache").getAbsolutePath(), 0L);
                        s.Revoke(file.getAbsolutePath());
                        s.Destroy();
                        k = 0;
                    }
                }
            }
        }
        return k;
    }

    public int a(int k, ScanResult scanresult)
        throws RemoteException
    {
        k = 1;
        scanresult.state = 1;
        if (f == null)
        {
            k = 0x80004004;
        } else
        if (!QVSEnv.bEvalMode)
        {
            return b(scanresult);
        }
        return k;
    }

    public int a(int k, ScanResult scanresult, com.qihoo.security.services.b b1)
        throws RemoteException
    {
        return 0;
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        String s2 = s1;
        if (s.equals("11"))
        {
            s2 = com.qihoo.security.env.QVSEnv.a.a(b, s1);
        }
        e.put(s, s2);
        if ("5000".equals(s) && s2 != null)
        {
            b(s2);
        }
        return 0;
    }

    public int a(int k, List list)
        throws RemoteException
    {
        Object obj;
        long l1;
        switch (a)
        {
        default:
            return 0x8000ffff;

        case 3: // '\003'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (list.isEmpty())
        {
            return 0x80070057;
        }
        k = i.get();
        if (!QVSEnv.bEvalMode && k >= 3)
        {
            return 0x80004004;
        }
        l1 = Thread.currentThread().getId();
        obj = (NetQuery)d.get(Long.valueOf(l1));
        if (obj != null) goto _L2; else goto _L1
_L1:
        QueryItem aqueryitem[];
        obj = new NetQuery(b);
        d.put(Long.valueOf(l1), obj);
        if (!TextUtils.isEmpty(g))
        {
            ((NetQuery) (obj)).SetOption("202", g);
        }
        aqueryitem = e.entrySet().iterator();
_L15:
        if (aqueryitem.hasNext()) goto _L4; else goto _L3
_L3:
        if (e.get("210") == null)
        {
            ((NetQuery) (obj)).SetOption("210", c);
        }
_L2:
        Object obj1;
        a = 2;
        ((NetQuery) (obj)).SetOption("9", String.valueOf(com.qihoo360.common.e.b.c(b)));
        aqueryitem = new QueryItem[list.size()];
        obj1 = list.iterator();
        k = 0;
_L11:
        if (((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        if (((NetQuery) (obj)).Query(aqueryitem, j) < 0) goto _L8; else goto _L7
_L7:
        int l;
        i.set(0);
        l = aqueryitem.length;
        k = 0;
_L13:
        if (k < l) goto _L10; else goto _L9
_L9:
        a = 1;
        return 0;
_L4:
        obj1 = (java.util.Map.Entry)aqueryitem.next();
        ((NetQuery) (obj)).SetOption((String)((java.util.Map.Entry) (obj1)).getKey(), ((java.util.Map.Entry) (obj1)).getValue());
        continue; /* Loop/switch isn't completed */
_L6:
        aqueryitem[k] = new QueryItem(((ScanResult)((Iterator) (obj1)).next()).fileInfo.clone(), 1, 0L);
        k++;
          goto _L11
_L10:
        obj = aqueryitem[k];
        if (a == 3) goto _L9; else goto _L12
_L12:
        a(((QueryItem) (obj)), list);
        k++;
          goto _L13
_L8:
        i.incrementAndGet();
        a = 1;
        return 0x80004005;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public String a(String s)
        throws RemoteException
    {
        return null;
    }

    public void a(ScanResult scanresult)
        throws RemoteException
    {
    }

    public void a(boolean flag)
        throws RemoteException
    {
    }

    public IBinder asBinder()
    {
        return null;
    }

    public int b(int k)
        throws RemoteException
    {
        return 0;
    }

    public int b(int k, ScanResult scanresult)
        throws RemoteException
    {
        return 0;
    }

    public int c(int k)
        throws RemoteException
    {
        i.set(0);
        g = b.getFileStreamPath("cloud.cache").getAbsolutePath();
        if (g == null)
        {
            return 1;
        }
        String s = SysInfo.getIMEI(b);
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("0", s);
        } else
        {
            CacheQuery.SetGlobalOption("0", "0123456789");
        }
        s = SysInfo.getCPUSerial();
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("1", s);
        }
        s = SysInfo.getAndroidId(b);
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("3", s);
        }
        s = SysInfo.getSerial();
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("2", s);
        }
        s = SysInfo.getMacAddress(b);
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("4", s);
        }
        f = new CacheQuery(b);
        if (!f.Create(g, 0L))
        {
            a = 4;
        } else
        {
            a = 1;
        }
        return 0;
    }

    public int d(int k)
        throws RemoteException
    {
        Iterator iterator = d.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                a = 0;
                return 0;
            }
            ((NetQuery)((java.util.Map.Entry)iterator.next()).getValue()).Destroy();
            iterator.remove();
        } while (true);
    }

    public int e(int k)
        throws RemoteException
    {
        if (a == 3)
        {
            a = 1;
        }
        i.set(0);
        return 0;
    }

    public int f(int k)
        throws RemoteException
    {
        a = 3;
        Iterator iterator = d.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return 0;
            }
            ((NetQuery)iterator.next()).Cancel();
        } while (true);
    }

    public int g(int k)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int h(int k)
        throws RemoteException
    {
        return a;
    }

    public String i(int k)
        throws RemoteException
    {
        return "CloudScan";
    }

    public IBinder j(int k)
        throws RemoteException
    {
        return null;
    }

}
