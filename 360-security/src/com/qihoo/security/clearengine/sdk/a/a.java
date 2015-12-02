// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.qihoo.security.clearengine.d.c;
import com.qihoo.security.clearengine.sdk.ApkScanService;
import com.qihoo360.mobilesafe.opti.i.plugins.ApkInfo;
import com.qihoo360.mobilesafe.opti.i.plugins.IApkScanProcess;
import com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class com.qihoo.security.clearengine.sdk.a.a
    implements IApkScanProcess
{
    private class a
    {

        public String a;
        public long b;
        final com.qihoo.security.clearengine.sdk.a.a c;

        private a()
        {
            c = com.qihoo.security.clearengine.sdk.a.a.this;
            super();
        }

        a(a a2)
        {
            this();
        }
    }


    private static final String a = com/qihoo/security/clearengine/sdk/a/a.getSimpleName();
    private final Context b;
    private IApkScanService c;
    private final Map d = new HashMap();
    private final ServiceConnection e = new ServiceConnection() {

        final com.qihoo.security.clearengine.sdk.a.a a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.clearengine.sdk.a.a.a(a, com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService.Stub.asInterface(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.clearengine.sdk.a.a.a(a, null);
        }

            
            {
                a = com.qihoo.security.clearengine.sdk.a.a.this;
                super();
            }
    };

    public com.qihoo.security.clearengine.sdk.a.a(Context context)
    {
        b = context;
        a();
    }

    private void a()
    {
        String s = (new StringBuilder(String.valueOf(b.getFilesDir().getAbsolutePath()))).append(File.separator).append("o_c_s_h_df").toString();
        b(s);
        String s1 = com.qihoo.security.clearengine.d.c.a(b, "clear_apkpath_filter", "null");
        if (!s1.equals("null"))
        {
            File file = new File(s1);
            if (file.exists() && (a)d.get(s1) != null)
            {
                a a1 = new a(null);
                a1.a = s1;
                a1.b = file.lastModified();
                d.put(s1, a1);
                a(s);
            }
            com.qihoo.security.clearengine.d.c.b(b, "clear_apkpath_filter", "null");
        }
    }

    static void a(com.qihoo.security.clearengine.sdk.a.a a1, IApkScanService iapkscanservice)
    {
        a1.c = iapkscanservice;
    }

    private void b()
    {
        com.qihoo.security.clearengine.sdk.c.a(b, com/qihoo/security/clearengine/sdk/ApkScanService, "ACTION_CLEAR_SERVICE", e, 1);
    }

    private void c()
    {
        b();
        int i = 0;
        int j;
        do
        {
            if (c != null)
            {
                return;
            }
            SystemClock.sleep(100L);
            j = i + 100;
            i = j;
        } while (j <= 10000);
    }

    private boolean c(String s)
    {
        a a1 = (a)d.get(s);
        if (a1 != null)
        {
            s = new File(s);
            if (s.exists() && a1.b == s.lastModified())
            {
                return false;
            }
        }
        return true;
    }

    private void d(String s)
    {
        File file = new File(s);
        if (file.exists())
        {
            a a1 = new a(null);
            a1.a = s;
            a1.b = file.lastModified();
            d.put(s, a1);
            a((new StringBuilder(String.valueOf(b.getFilesDir().getAbsolutePath()))).append(File.separator).append("o_c_s_h_df").toString());
        }
    }

    public void a(String s)
    {
        if (d != null && d.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = new BufferedWriter(new FileWriter(new File(s), true));
        s = ((String) (obj));
        Iterator iterator = d.entrySet().iterator();
_L3:
        s = ((String) (obj));
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        s = ((String) (obj));
        ((BufferedWriter) (obj)).flush();
        if (obj != null)
        {
            try
            {
                ((BufferedWriter) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
          goto _L1
        s = ((String) (obj));
        a a1 = (a)((java.util.Map.Entry)iterator.next()).getValue();
        s = ((String) (obj));
        ((BufferedWriter) (obj)).write((new StringBuilder(String.valueOf(a1.a))).append("|").append(a1.b).append("\n").toString());
          goto _L3
        Exception exception;
        exception;
_L7:
        s = ((String) (obj));
        exception.printStackTrace();
        if (obj == null) goto _L1; else goto _L4
_L4:
        try
        {
            ((BufferedWriter) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        obj;
        s = null;
_L6:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        obj = null;
          goto _L7
    }

    public void b(String s)
    {
        Object obj;
        obj = null;
        s = new File(s);
        if (s.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        s = new BufferedReader(new FileReader(s), 1024);
_L6:
        boolean flag;
        obj = s.readLine();
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (!flag) goto _L4; else goto _L3
_L3:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
_L7:
        if (d.size() <= 50) goto _L1; else goto _L5
_L5:
        d.clear();
        return;
_L4:
        obj = ((String) (obj)).split("\\|");
        if (obj.length == 2 && (a)d.get(obj[0]) == null)
        {
            a a1 = new a(null);
            a1.a = obj[0];
            a1.b = Long.parseLong(obj[1]);
            d.put(obj[0], a1);
        }
          goto _L6
        obj;
_L10:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        obj;
        s = null;
_L9:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw obj;
        obj;
        if (true) goto _L9; else goto _L8
_L8:
        s;
        s = ((String) (obj));
          goto _L10
    }

    public int create()
    {
        if (c == null)
        {
            b();
        } else
        {
            try
            {
                c.create();
            }
            catch (Exception exception) { }
        }
        return 1;
    }

    public int destroy()
    {
        if (c != null)
        {
            try
            {
                c.destroy();
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
            }
        }
        com.qihoo.security.clearengine.sdk.c.a(a, b, e);
        c = null;
        return 1;
    }

    public ApkInfo scanApk(String s)
    {
        this;
        JVM INSTR monitorenter ;
        ApkInfo apkinfo1 = null;
        if (c == null)
        {
            c();
        }
        com.qihoo.security.clearengine.d.c.b(b, "clear_apkpath_filter", s);
        if (c == null) goto _L2; else goto _L1
_L1:
        boolean flag = c(s);
        ApkInfo apkinfo;
        apkinfo = apkinfo1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        apkinfo = c.scanApk(s);
_L5:
        apkinfo1 = apkinfo;
        if (apkinfo != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        apkinfo1 = new ApkInfo();
        apkinfo1.path = s;
        s = new File(apkinfo1.path);
        apkinfo1.size = s.length();
        apkinfo1.modifyTime = s.lastModified();
        apkinfo1.desc = s.getName();
        apkinfo1.dataType = 2;
_L3:
        com.qihoo.security.clearengine.d.c.b(b, "clear_apkpath_filter", "null");
        this;
        JVM INSTR monitorexit ;
        return apkinfo1;
        Object obj;
        obj;
        SystemClock.sleep(1000L);
        d(s);
        c();
        obj = apkinfo1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L2:
        apkinfo1 = ApkScanService.a(b, s);
          goto _L3
        obj;
        obj = apkinfo1;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
