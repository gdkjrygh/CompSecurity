// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.AdPluginInfo;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.cloudscan.CacheQuery;
import com.qihoo.security.engine.cloudscan.NetQuery;
import com.qihoo.security.engine.cloudscan.QueryItem;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import com.qihoo.security.services.b;
import com.qihoo360.common.utils.SysInfo;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.engine.a:
//            f, e

public class d extends com.qihoo.security.services.a.a
    implements a
{

    private static final String d = com/qihoo/security/engine/a/d.getSimpleName();
    final Context a;
    volatile int b;
    boolean c;
    private String e;
    private CacheQuery f;
    private NetQuery g;
    private f h;

    public d(Context context)
    {
        b = 0;
        e = null;
        f = null;
        g = null;
        c = false;
        a = context;
    }

    public int a(int k)
        throws RemoteException
    {
        return 0;
    }

    public int a(int k, int l, String s)
        throws RemoteException
    {
        return 0;
    }

    public int a(int k, ScanResult scanresult)
        throws RemoteException
    {
        if (scanresult.fileInfo.apkInfo != null) goto _L2; else goto _L1
_L1:
        return 1;
_L2:
        scanresult.state = 11;
        if (!scanresult.fileInfo.apkInfo.isInstalled)
        {
            return 0;
        }
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (scanresult.fileInfo.adPluginInfo.AdPlugins != null)
        {
            com.qihoo.security.engine.AdPluginInfo.AdPlugin aadplugin[] = scanresult.fileInfo.adPluginInfo.AdPlugins;
            int l = aadplugin.length;
            k = 0;
            do
            {
                if (k >= l)
                {
                    return 0;
                }
                com.qihoo.security.engine.AdPluginInfo.AdPlugin adplugin = aadplugin[k];
                AdPluginInfo adplugininfo = scanresult.fileInfo.adPluginInfo;
                int j1 = adplugininfo.AdAllType;
                adplugininfo.AdAllType = adplugin.type | j1;
                k++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        QueryItem queryitem = new QueryItem(scanresult.fileInfo, 1, 0L);
        if (f == null)
        {
            f = new CacheQuery(a);
            f.Create(e, 0L);
        }
        if (f.Query(new QueryItem[] {
    queryitem
}) != -1)
        {
            com.qihoo.security.engine.AdPluginInfo.AdPlugin aadplugin1[] = scanresult.fileInfo.adPluginInfo.AdPlugins;
            int i1 = aadplugin1.length;
            k = 0;
            do
            {
                if (k >= i1)
                {
                    return 0;
                }
                com.qihoo.security.engine.AdPluginInfo.AdPlugin adplugin1 = aadplugin1[k];
                AdPluginInfo adplugininfo1 = scanresult.fileInfo.adPluginInfo;
                int k1 = adplugininfo1.AdAllType;
                adplugininfo1.AdAllType = adplugin1.type | k1;
                k++;
            } while (true);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int a(int k, ScanResult scanresult, b b1)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        if ("workmode".equals(s))
        {
            if ("ds".equals(s1))
            {
                c = true;
                if (h != null)
                {
                    h.a();
                }
                return 0;
            } else
            {
                c = false;
                return 0;
            }
        }
        if (g != null)
        {
            g.SetOption(s, s1);
            return 0;
        } else
        {
            return 0x80004005;
        }
    }

    public int a(int k, List list)
        throws RemoteException
    {
        list = list.iterator();
        do
        {
            ScanResult scanresult;
            do
            {
                if (!list.hasNext())
                {
                    return 0;
                }
                scanresult = (ScanResult)list.next();
            } while (scanresult.fileInfo.apkInfo == null);
            if (scanresult.fileInfo.adPluginInfo.AdPlugins == null);
            Object obj = scanresult.fileInfo.apkInfo.openClassesDex(true);
            obj = h.a(scanresult.fileInfo.apkInfo.packageName, ((com.qihoo.security.engine.ClassesDexInfo) (obj)));
            if (obj != null && ((e) (obj)).a())
            {
                ((e) (obj)).a(scanresult.fileInfo.adPluginInfo);
            }
            scanresult.fileInfo.apkInfo.closeClassesDex();
        } while (true);
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

    public int b(int k)
        throws RemoteException
    {
        return 0;
    }

    public int b(int k, ScanResult scanresult)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int c(int k)
        throws RemoteException
    {
        e = a.getFileStreamPath("cloud.cache").getAbsolutePath();
        if (b != 0)
        {
            return 0x8000ffff;
        }
        if (h == null)
        {
            h = new f(a);
            h.b();
        }
        String s = SysInfo.getIMEI(a);
        if (!TextUtils.isEmpty(s))
        {
            CacheQuery.SetGlobalOption("0", s);
        } else
        {
            CacheQuery.SetGlobalOption("0", "0123456789");
        }
        if (g == null)
        {
            g = new NetQuery(a);
            g.SetOption("202", e);
        }
        b = 1;
        return 0;
    }

    public int d(int k)
        throws RemoteException
    {
        h = null;
        b = 0;
        if (f != null)
        {
            f.Destroy();
            f = null;
        }
        if (g != null)
        {
            g.Destroy();
            g = null;
        }
        return 0;
    }

    public int e(int k)
        throws RemoteException
    {
        if (b == 3)
        {
            b = 1;
        }
        return 0;
    }

    public int f(int k)
        throws RemoteException
    {
        b = 3;
        if (g != null)
        {
            g.Cancel();
        }
        return 0;
    }

    public int g(int k)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int h(int k)
        throws RemoteException
    {
        return b;
    }

    public String i(int k)
        throws RemoteException
    {
        return "ADSCAN";
    }

    public IBinder j(int k)
        throws RemoteException
    {
        return null;
    }

}
