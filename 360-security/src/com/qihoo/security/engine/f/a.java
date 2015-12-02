// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.HipsActionRevise;
import com.qihoo.security.engine.cloudscan.CacheQuery;
import com.qihoo.security.engine.cloudscan.NetQuery;
import com.qihoo.security.engine.cloudscan.QueryItem;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.e.b;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.SysInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a extends com.qihoo.security.services.a
    implements com.qihoo.security.services.a
{

    private static final String b = com/qihoo/security/engine/f/a.getSimpleName();
    volatile int a;
    private final Context c;
    private CacheQuery d;
    private NetQuery e;
    private boolean f;
    private boolean g;
    private int h;
    private String i;

    public a(Context context)
    {
        d = null;
        e = null;
        a = 0;
        f = false;
        g = false;
        h = 500;
        i = null;
        c = context;
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
        FileInfo fileinfo = scanresult.fileInfo;
        fileinfo.queryFlags = fileinfo.queryFlags | 1L;
        return d.Query(new QueryItem[] {
            new QueryItem(scanresult.fileInfo, 1, 0L)
        }) != 1 ? 0x80004005 : 0;
    }

    public int a(int k, ScanResult scanresult, com.qihoo.security.services.b b1)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        if (e != null)
        {
            if ("2".equals(s))
            {
                e.SetOption(s, s1);
            } else
            if ("11".equals(s))
            {
                e.SetOption(s, s1);
            }
        }
        if ("nq".equals(s))
        {
            if ("1".equals(s1))
            {
                g = true;
            } else
            {
                g = false;
            }
        }
        if ("nqto".equals(s))
        {
            h = Integer.getInteger(s1).intValue();
        }
        return 0;
    }

    public int a(int k, List list)
        throws RemoteException
    {
        int l;
        k = list.size();
        if (!g)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (e == null)
        {
            e = new NetQuery(c);
        }
        l = 0;
_L5:
        Object aobj[];
        int i1;
        if (k <= 0)
        {
            return 0;
        }
        int j1;
        if (k > 20)
        {
            i1 = 20;
        } else
        {
            i1 = k;
        }
        aobj = new QueryItem[i1];
        i1 = 0;
_L6:
        if (i1 < 20 && i1 < k) goto _L2; else goto _L1
_L1:
        if (e.Query(((QueryItem []) (aobj)), h) == -1) goto _L4; else goto _L3
_L3:
        j1 = aobj.length;
        i1 = 0;
_L7:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_169;
        }
_L4:
        k -= 20;
        l++;
          goto _L5
_L2:
        aobj[i1] = new QueryItem(((ScanResult)list.get(l * 20 + i1)).fileInfo, 1, 1L);
        i1++;
          goto _L6
        QueryItem queryitem = aobj[i1];
        if (queryitem.a.hipsActionRevise != null)
        {
            if (queryitem.a.hipsActionRevise.length <= 0);
        }
        i1++;
          goto _L7
        long al[];
        String as[];
        as = new String[k];
        aobj = new long[k];
        al = new long[k];
        k = 0;
_L13:
        if (k < list.size()) goto _L9; else goto _L8
_L8:
        if (d.QueryPrivacy(as, ((long []) (aobj)), al) <= 0) goto _L11; else goto _L10
_L10:
        k = 0;
_L16:
        if (k < list.size()) goto _L12; else goto _L11
_L11:
        return 0;
_L9:
        as[k] = ((ScanResult)list.get(k)).fileInfo.apkInfo.packageName;
        aobj[k] = 0x7fffffffffffffffL;
        al[k] = 0x7fffffffffffffffL;
        k++;
          goto _L13
_L12:
        if (aobj[k] != 0L || al[k] != 0L) goto _L15; else goto _L14
_L14:
        k++;
          goto _L16
_L15:
        ArrayList arraylist;
        long l1;
        long l2;
        arraylist = new ArrayList();
        l1 = aobj[k];
        l2 = al[k];
        l = 0;
_L17:
label0:
        {
            if (l < 32)
            {
                break label0;
            }
            HipsActionRevise ahipsactionrevise[] = new HipsActionRevise[arraylist.size()];
            ((ScanResult)list.get(k)).fileInfo.hipsActionRevise = (HipsActionRevise[])arraylist.toArray(ahipsactionrevise);
        }
          goto _L14
        if (((long)(1 << l) & l1) != 0L)
        {
            HipsActionRevise hipsactionrevise = new HipsActionRevise();
            hipsactionrevise.value = l;
            hipsactionrevise.level = 1;
            arraylist.add(hipsactionrevise);
        } else
        if (((long)(1 << l) & l2) != 0L)
        {
            HipsActionRevise hipsactionrevise1 = new HipsActionRevise();
            hipsactionrevise1.value = l;
            hipsactionrevise1.level = 2;
            arraylist.add(hipsactionrevise1);
        }
        l++;
          goto _L17
    }

    public String a(String s)
        throws RemoteException
    {
        return null;
    }

    public void a(ScanResult scanresult)
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
        int l = 0;
        i = c.getFileStreamPath("cloud.cache").getAbsolutePath();
        if (a != 0)
        {
            l = 0x8000ffff;
        } else
        {
            String s = SysInfo.getIMEI(c);
            if (!TextUtils.isEmpty(s))
            {
                CacheQuery.SetGlobalOption("0", s);
            } else
            {
                CacheQuery.SetGlobalOption("0", "0123456789");
            }
            k = l;
            if (d == null)
            {
                d = new CacheQuery(c);
                if (d.Create(i, 0L))
                {
                    File file = c.getFileStreamPath("privacy.sign");
                    if (FileUtil.getAssetTimestamp(c, "privacy.sign") > FileUtil.getFileTimestamp(c, "privacy.sign"))
                    {
                        FileUtil.copyAssetToFile(c, "privacy.sign", file, true);
                    }
                    k = l;
                    if (d.ImportPrivacyData(file.getAbsolutePath(), 0) > CacheQuery.CQERR_OK);
                } else
                {
                    k = 0x80004005;
                }
            }
            l = k;
            if (e == null)
            {
                e = new NetQuery(c);
                e.SetOption("1", s);
                e.SetOption("5", Build.MANUFACTURER);
                e.SetOption("6", Build.MODEL);
                e.SetOption("7", android.os.Build.VERSION.SDK);
                e.SetOption("8", (new StringBuilder(String.valueOf(android.os.Build.VERSION.RELEASE))).append("||").append(Build.FINGERPRINT).toString());
                try
                {
                    e.SetOption("10", c.getResources().getConfiguration().locale.toString());
                }
                catch (Throwable throwable)
                {
                    e.SetOption("10", Locale.getDefault().toString());
                }
                e.SetOption("9", String.valueOf(com.qihoo360.common.e.b.c(c)));
                e.SetOption("205", "0");
                return k;
            }
        }
        return l;
    }

    public int d(int k)
        throws RemoteException
    {
        f = false;
        i = null;
        if (d != null)
        {
            d.Destroy();
            d = null;
        }
        return 0;
    }

    public int e(int k)
        throws RemoteException
    {
        if (a == 3)
        {
            a = 1;
        }
        return 0;
    }

    public int f(int k)
        throws RemoteException
    {
        a = 3;
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
        return a;
    }

    public String i(int k)
        throws RemoteException
    {
        return "Hips";
    }

    public IBinder j(int k)
        throws RemoteException
    {
        return null;
    }

}
