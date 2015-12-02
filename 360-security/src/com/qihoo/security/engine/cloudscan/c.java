// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.content.Context;
import android.os.Environment;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import com.qihoo360.common.e.b;
import com.qihoo360.common.utils.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            CloudHttpClient, SampleDetector, NetQuery

public class c
    implements a
{

    final Context a;
    final CloudHttpClient b;
    final String c;
    volatile int d;
    volatile boolean e;
    final HashMap f = new HashMap();

    public c(Context context)
    {
        d = 0;
        e = false;
        a = context;
        b = new CloudHttpClient(context);
        c = a.getFileStreamPath("cloud.cache").getAbsolutePath();
    }

    private boolean a(FileInfo fileinfo)
    {
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        s = fileinfo.filePath;
        flag = flag2;
        if (!"mounted".equals(Environment.getExternalStorageState())) goto _L2; else goto _L1
_L1:
        int k;
        k = com.qihoo360.common.e.b.c(a);
        flag = flag2;
        if (!com.qihoo360.common.e.b.b(a)) goto _L2; else goto _L3
_L3:
        if (fileinfo.fileType != 1 || !fileinfo.apkInfo.isInstalled || !s.endsWith(".zip")) goto _L5; else goto _L4
_L4:
        return flag1;
_L5:
        SampleDetector sampledetector;
        sampledetector = new SampleDetector();
        flag = flag2;
        if (sampledetector.Create(s) != 0) goto _L2; else goto _L6
_L6:
        sampledetector.SetHttpClient(b);
        sampledetector.SetOption("9", String.valueOf(k));
        sampledetector.SetOption("202", c);
        fileinfo.fileType;
        JVM INSTR tableswitch 1 6: default 172
    //                   1 174
    //                   2 172
    //                   3 172
    //                   4 172
    //                   5 327
    //                   6 335;
           goto _L7 _L8 _L7 _L7 _L7 _L9 _L10
_L8:
        break MISSING_BLOCK_LABEL_174;
_L10:
        continue; /* Loop/switch isn't completed */
_L7:
        return false;
_L16:
        Object obj;
        int l;
        obj = NetQuery.COMMON_OPTIONS;
        l = obj.length;
        k = 0;
_L18:
        if (k < l) goto _L12; else goto _L11
_L11:
        obj = new File(Environment.getExternalStorageDirectory(), "360/.Tmp");
        ((File) (obj)).mkdirs();
        sampledetector.SetOption("805", ((File) (obj)).getAbsolutePath());
        obj = (String)f.get("802");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            sampledetector.SetOption("802", ((String) (obj)));
        }
        if (!e && sampledetector.DoDetection() == 0)
        {
            String s1;
            String s2;
            if (fileinfo.fileType == 5)
            {
                try
                {
                    FileUtil.deleteDirectory(com.qihoo.security.engine.c.a.a());
                }
                catch (IOException ioexception) { }
            }
            flag = true;
        } else
        {
            flag = false;
        }
        sampledetector.Destroy();
_L2:
        flag1 = flag;
        if (fileinfo == null) goto _L4; else goto _L13
_L13:
        flag1 = flag;
        if (fileinfo.fileType != 5) goto _L4; else goto _L14
_L14:
        (new File(s)).delete();
        return flag;
_L9:
        if (QVSEnv.bEvalMode) goto _L16; else goto _L15
_L15:
        return false;
        if (!QVSEnv.bEvalMode) goto _L4; else goto _L17
_L17:
        sampledetector.SetOption("804", "7");
        obj = (String)f.get("814");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            sampledetector.SetOption("814", ((String) (obj)));
        }
          goto _L16
_L12:
        s1 = obj[k];
        s2 = (String)f.get(s1);
        if (!TextUtils.isEmpty(s2))
        {
            sampledetector.SetOption(s1, s2);
        }
        k++;
          goto _L18
    }

    public int a(int k)
        throws RemoteException
    {
        File file = new File(Environment.getExternalStorageDirectory(), "360/.Tmp");
        if (file.exists())
        {
            try
            {
                FileUtil.deleteDirectory(file);
            }
            catch (IOException ioexception) { }
        }
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
        return 1;
    }

    public int a(int k, ScanResult scanresult, com.qihoo.security.services.b b1)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        String s2 = s1;
        if (s.equals("11"))
        {
            s2 = com.qihoo.security.env.QVSEnv.a.a(a, s1);
        }
        f.put(s, s2);
        return 0;
    }

    public int a(int k, List list)
        throws RemoteException
    {
        boolean flag;
        d = 2;
        if ("1".equals(f.get("702")))
        {
            k = 0;
        } else
        {
            k = 1;
        }
        e = false;
        list = list.iterator();
        flag = false;
_L5:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        d = 1;
        ScanResult scanresult;
        return !flag ? 0x80004005 : 0;
_L2:
        scanresult = (ScanResult)list.next();
        if (e) goto _L1; else goto _L3
_L3:
        if (k == 0 || !scanresult.fileInfo.filePath.startsWith("/system"))
        {
            flag = a(scanresult.fileInfo) | flag;
        }
        if (true) goto _L5; else goto _L4
_L4:
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
        return 0x80004001;
    }

    public int c(int k)
        throws RemoteException
    {
        d = 1;
        e = false;
        return 0;
    }

    public int d(int k)
        throws RemoteException
    {
        d = 0;
        return 0;
    }

    public int e(int k)
        throws RemoteException
    {
        d = 1;
        e = false;
        return 0;
    }

    public int f(int k)
        throws RemoteException
    {
        e = true;
        b.Cancel();
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
        return d;
    }

    public String i(int k)
        throws RemoteException
    {
        return "Sample";
    }

    public IBinder j(int k)
        throws RemoteException
    {
        return null;
    }
}
