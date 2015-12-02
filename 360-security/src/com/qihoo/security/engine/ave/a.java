// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.cloudscan.SampleDetector;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.b;
import com.qihoo360.common.utils.FileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.engine.ave:
//            b, AveScanner, AveExtraScanner

public class a
    implements com.qihoo.security.services.a
{

    public static final byte a[] = {
        -36, 109, -67, 110, 73, 104, 42, 87, -88, -72, 
        40, -119, 4, 59, -109, -88
    };
    final Context b;
    final com.qihoo.security.engine.ave.b c;
    final PackageManager d;
    AveScanner e;
    AveExtraScanner f;
    com.qihoo.security.engine.ave.dejavu.a g;
    volatile int h;
    final HashMap i = new HashMap();
    int j;

    public a(Context context)
    {
        e = null;
        f = null;
        g = null;
        h = 0;
        j = 0;
        b = context;
        c = new com.qihoo.security.engine.ave.b(context);
        d = context.getPackageManager();
    }

    private int c(ScanResult scanresult)
    {
        if (e == null)
        {
            e = new AveScanner();
            if (!com.qihoo.security.engine.consts.a.a(e.open(b)));
        }
        if (e == null)
        {
            return 0x80004005;
        }
        if (e.scan(scanresult) == 0)
        {
            scanresult = scanresult.fileInfo.apkInfo;
            if (scanresult != null && ((ApkInfo) (scanresult)).maliceRank > 0)
            {
                scanresult.setExtra("ruleid", String.valueOf(0x1610000 | c.b & 0xffff));
                return 0;
            }
        }
        return 1;
    }

    private int d(ScanResult scanresult)
    {
label0:
        {
            if (f == null)
            {
                f = new AveExtraScanner();
                if (!f.a(b))
                {
                    break label0;
                }
                f.b();
            }
            ApkInfo apkinfo = scanresult.fileInfo.apkInfo;
            if (f.a(scanresult) == 0 && apkinfo != null && apkinfo.maliceRank > 0)
            {
                apkinfo.setExtra("ruleid", String.valueOf(0x9600000 | c.b & 0xffff));
            }
            return 0;
        }
        f = null;
        return 0x80004005;
    }

    public int a(int k)
        throws RemoteException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c.a();
        if (flag)
        {
            k = 0;
        } else
        {
            k = 0x8000ffff;
        }
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    public int a(int k, int l, String s)
        throws RemoteException
    {
        Object obj;
        Object obj1;
        Object obj3;
        File file;
        boolean flag;
        obj1 = null;
        obj3 = null;
        file = null;
        obj = null;
        flag = true;
        if (l != 4) goto _L2; else goto _L1
_L1:
        s = new File(b.getFilesDir(), "avedb.zip");
        if (s.exists()) goto _L4; else goto _L3
_L3:
        k = ((flag) ? 1 : 0);
_L6:
        return k;
_L4:
        k = ((flag) ? 1 : 0);
        if (!s.delete())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (l != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = FileUtil.getFileTimestamp(b, "v_avedb.zip");
        long l5 = FileUtil.getAssetTimestamp(b, "v_avedb.zip");
        if (l5 <= 0L)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        if (l5 >= l1)
        {
            return 0;
        }
        s = b.getFileStreamPath("ave");
        if (s.exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!s.mkdir()) goto _L6; else goto _L5
_L5:
        obj = new File(s, "360ave.def");
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj)).delete()) goto _L6; else goto _L7
_L7:
        obj = new File(s, "360info.def");
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj)).delete()) goto _L6; else goto _L8
_L8:
        l = SampleDetector.OpenDatabase(b.getFileStreamPath("v_avedb.zip").getAbsolutePath(), s.getAbsolutePath(), "360");
        k = l;
        if (l == 0)
        {
            com.qihoo.security.engine.ave.b.a(new File(b.getFilesDir(), "v_avedb.zip.timestamp"), new File(s, "v_avedb.zip.timestamp"));
            (new File(s, "vdb.cache")).delete();
            FileUtil.copyAssetToFile(b, "vdb.cache", new File(s, "vdb.cache"), false);
            return 0;
        }
        continue; /* Loop/switch isn't completed */
        long l2;
        l2 = FileUtil.getFileTimestamp(b, "avedb.zip");
        if (FileUtil.getAssetTimestamp(b, "avedb.zip") >= l2)
        {
            return 0;
        }
        s = b.getFileStreamPath("ave");
        if (s.exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!s.mkdir()) goto _L6; else goto _L9
_L9:
        obj = new File(s, "360ave.def");
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj)).delete()) goto _L6; else goto _L10
_L10:
        obj = new File(s, "360info.def");
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj)).delete()) goto _L6; else goto _L11
_L11:
        l = SampleDetector.OpenDatabase(b.getFileStreamPath("avedb.zip").getAbsolutePath(), s.getAbsolutePath(), "360");
        k = l;
        if (l == 0)
        {
            com.qihoo.security.engine.ave.b.a(new File(s, "v_sig.db.timestamp"), l2);
            (new File(s, "vdb.cache")).delete();
            FileUtil.copyAssetToFile(b, "vdb.cache", new File(s, "vdb.cache"), false);
            return 0;
        }
        if (true) goto _L6; else goto _L12
_L12:
        if (l != 2) goto _L14; else goto _L13
_L13:
        long l3 = FileUtil.getFileTimestamp(b, "heurmod_v2.jar");
        if (FileUtil.getAssetTimestamp(b, "heurmod_v2.jar") >= l3)
        {
            return 0;
        }
        obj3 = b.getFileStreamPath("ave");
        if (((File) (obj3)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj3)).mkdir()) goto _L6; else goto _L15
_L15:
        s = new File(b.getFilesDir(), "heurmod_v2.jar");
        file = new File(((File) (obj3)), "heurmod_v2.jar");
        if (!file.exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!file.delete()) goto _L6; else goto _L16
_L16:
        s = new FileInputStream(s);
        obj = new FileOutputStream(file);
        FileUtil.copyStream(s, ((OutputStream) (obj)));
        ((OutputStream) (obj)).flush();
        long l4;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        com.qihoo.security.engine.ave.b.a(new File(b.getFilesDir(), "heurmod_v2.jar.timestamp"), new File(((File) (obj3)), "heurmod_v2.jar.timestamp"));
        (new File(((File) (obj3)), "vdb.cache")).delete();
        FileUtil.copyAssetToFile(b, "vdb.cache", new File(((File) (obj3)), "vdb.cache"), false);
        return 0;
        s;
        s = null;
_L26:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        k = ((flag) ? 1 : 0);
        if (s == null) goto _L6; else goto _L17
_L17:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 1;
        }
        return 1;
        obj;
        s = null;
_L25:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw obj;
_L14:
        k = ((flag) ? 1 : 0);
        if (l != 3) goto _L6; else goto _L18
_L18:
        l4 = FileUtil.getFileTimestamp(b, "v_sig.db");
        if (FileUtil.getAssetTimestamp(b, "v_sig.db") >= l4)
        {
            return 0;
        }
        obj1 = b.getFileStreamPath("ave");
        if (((File) (obj1)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj1)).mkdir()) goto _L6; else goto _L19
_L19:
        s = new File(b.getFilesDir(), "v_sig.db");
        obj = new File(((File) (obj1)), "v_sig.db");
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((flag) ? 1 : 0);
        if (!((File) (obj)).delete()) goto _L6; else goto _L20
_L20:
        s = new FileInputStream(s);
        obj = new FileOutputStream(((File) (obj)));
        FileUtil.copyStream(s, ((OutputStream) (obj)));
        ((OutputStream) (obj)).flush();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        com.qihoo.security.engine.ave.b.a(new File(b.getFilesDir(), "v_sig.db.timestamp"), new File(((File) (obj1)), "v_sig.db.timestamp"));
        (new File(((File) (obj1)), "vdb.cache")).delete();
        FileUtil.copyAssetToFile(b, "vdb.cache", new File(((File) (obj1)), "vdb.cache"), false);
        return 0;
        s;
        s = null;
        obj = obj3;
_L24:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        k = ((flag) ? 1 : 0);
        if (obj == null) goto _L6; else goto _L21
_L21:
        try
        {
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 1;
        }
        return 1;
        obj;
        s = null;
        obj1 = file;
_L23:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw obj;
        obj;
        obj1 = file;
        continue; /* Loop/switch isn't completed */
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L23; else goto _L22
_L22:
        obj;
        obj = obj3;
          goto _L24
        obj1;
          goto _L24
        obj;
          goto _L25
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
          goto _L25
        obj;
        Object obj2 = null;
        obj = s;
        s = obj2;
          goto _L26
        IOException ioexception;
        ioexception;
        String s1 = s;
        s = ((String) (obj));
        obj = s1;
          goto _L26
    }

    public int a(int k, ScanResult scanresult)
        throws RemoteException
    {
        k = 0;
        scanresult.state = 7;
        ApkInfo apkinfo = scanresult.fileInfo.apkInfo;
        if (apkinfo == null)
        {
            k = 1;
        } else
        {
            if (c.a(scanresult))
            {
                b(scanresult);
                return 0;
            }
            if (g != null && g.a(b, scanresult) > 0)
            {
                apkinfo.setExtra("ruleid", String.valueOf(0x1620000 | c.b & 0xffff));
            } else
            if (!c.c(scanresult));
            if (apkinfo.maliceRank >= 0 && apkinfo.isInstalled)
            {
                i.put(apkinfo.packageName, scanresult);
            }
            b(scanresult);
            if (apkinfo.maliceRank < 0)
            {
                return 1;
            }
        }
        return k;
    }

    public int a(int k, ScanResult scanresult, b b1)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int a(int k, String s, String s1)
        throws RemoteException
    {
        return 0;
    }

    public int a(int k, List list)
        throws RemoteException
    {
        this;
        JVM INSTR monitorenter ;
        k = h;
        k;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 48
    //                   2 48
    //                   3 43;
           goto _L1 _L2 _L2 _L3
_L1:
        k = 0x8000ffff;
_L4:
        this;
        JVM INSTR monitorexit ;
        return k;
_L3:
        k = 1;
          goto _L4
_L2:
        h = 2;
        list = list.iterator();
_L12:
        if (list.hasNext()) goto _L6; else goto _L5
_L5:
        h = 1;
        k = 0;
          goto _L4
_L6:
        ScanResult scanresult = (ScanResult)list.next();
        if (h == 3) goto _L5; else goto _L7
_L7:
        ApkInfo apkinfo = scanresult.fileInfo.apkInfo;
        if (g == null || g.b(b, scanresult) <= 0) goto _L9; else goto _L8
_L8:
        if (apkinfo == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        apkinfo.setExtra("ruleid", String.valueOf(0x1630000 | c.b & 0xffff));
_L18:
        if (apkinfo == null) goto _L11; else goto _L10
_L10:
        if (apkinfo.isInstalled)
        {
            i.put(apkinfo.packageName, scanresult);
        }
_L11:
        if (h != 3)
        {
            b(scanresult);
        }
          goto _L12
        list;
        throw list;
_L9:
        boolean flag1 = QVSEnv.bEvalMode;
        boolean flag = flag1;
        if (c(scanresult) != 0) goto _L14; else goto _L13
_L13:
        k = scanresult.fileInfo.apkInfo.maliceRank;
        flag = flag1;
        if (k >= 1)
        {
            flag = flag1;
            if (k <= 4)
            {
                flag = false;
            }
        }
_L14:
        if (!flag) goto _L16; else goto _L15
_L15:
        d(scanresult);
_L16:
        if (apkinfo == null) goto _L18; else goto _L17
_L17:
        apkinfo.closeClassesDex();
          goto _L18
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
        c.c();
        return 0;
    }

    public int b(int k, ScanResult scanresult)
        throws RemoteException
    {
        return 0x80004001;
    }

    void b(ScanResult scanresult)
    {
        if (scanresult.fileInfo.apkInfo != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        scanresult.fileInfo.apkInfo.maliceRank;
        JVM INSTR tableswitch 0 5: default 60
    //                   0 100
    //                   1 117
    //                   2 155
    //                   3 136
    //                   4 173
    //                   5 197;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_197;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        scanresult.fileInfo.level = 40;
_L11:
        String s = scanresult.fileInfo.apkInfo.getExtra("ruleid");
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                scanresult.ruleid = Integer.parseInt(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ScanResult scanresult)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L10
_L10:
        scanresult.riskClass = 0;
        scanresult.fileInfo.level = 10;
          goto _L11
_L5:
        scanresult.riskClass = 700;
        scanresult.fileInfo.level = 70;
          goto _L11
_L7:
        scanresult.riskClass = 800;
        scanresult.fileInfo.level = 70;
          goto _L11
_L6:
        scanresult.riskClass = 100;
        scanresult.fileInfo.level = 50;
          goto _L11
_L8:
        if (QVSEnv.bEvalMode)
        {
            scanresult.riskClass = 100;
            scanresult.fileInfo.level = 50;
        }
          goto _L11
        if (QVSEnv.bEvalMode)
        {
            scanresult.riskClass = 101;
            scanresult.fileInfo.level = 50;
        }
          goto _L11
    }

    public int c(int k)
        throws RemoteException
    {
        if (!c.d())
        {
            return 0x80004005;
        }
        if (g == null)
        {
            g = new com.qihoo.security.engine.ave.dejavu.a(b);
        }
        if (c.b())
        {
            h = 1;
            return 0;
        } else
        {
            return 0x8000ffff;
        }
    }

    public int d(int k)
        throws RemoteException
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.close();
            e = null;
        }
        if (f != null)
        {
            f.a();
            f = null;
        }
        h = 0;
        this;
        JVM INSTR monitorexit ;
        return 0;
        Exception exception;
        exception;
        throw exception;
    }

    public int e(int k)
        throws RemoteException
    {
        int l = d(k);
        if (com.qihoo.security.engine.consts.a.b(l))
        {
            return l;
        } else
        {
            return c(k);
        }
    }

    public int f(int k)
        throws RemoteException
    {
        h = 3;
        return 0;
    }

    public int g(int k)
        throws RemoteException
    {
        if (!i.isEmpty())
        {
            c.a(i.values());
            i.clear();
        }
        return 0;
    }

    public int h(int k)
        throws RemoteException
    {
        return h;
    }

    public String i(int k)
        throws RemoteException
    {
        return "AVE";
    }

    public IBinder j(int k)
        throws RemoteException
    {
        return null;
    }

}
