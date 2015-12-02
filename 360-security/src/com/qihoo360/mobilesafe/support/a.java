// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.SecurityUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.a.b;
import com.qihoo360.mobilesafe.support.a.c;
import com.qihoo360.mobilesafe.support.a.d;
import com.qihoo360.mobilesafe.support.a.f;
import com.qihoo360.mobilesafe.support.a.g;
import com.qihoo360.mobilesafe.support.a.h;
import com.qihoo360.mobilesafe.support.a.i;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class a
{

    public static String a = "com.qihoo.msafe.service.ROOTSERVICE";
    public static String b = "com.qihoo360.rootserver_msafe";
    public static String c = "rt_server_aborad";
    static c d = null;
    private static boolean e = false;
    private static String f = null;
    private static String g = null;
    private static String h = null;

    public a()
    {
    }

    public static int a(b b1, String s, List list, List list1, long l)
    {
        if (b1 == null)
        {
            return -1;
        }
        int j;
        try
        {
            j = b1.b(s, list, list1, l);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return -1;
        }
        return j;
    }

    public static f a(Context context, Object aobj[])
        throws Exception
    {
        if (Thread.currentThread().getId() == 1L)
        {
            throw new Exception("this method can't be called in ui thread");
        }
        if (context != null && aobj != null && aobj.length >= 2) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        i j;
        ServiceConnection serviceconnection;
        j = new i();
        serviceconnection = new ServiceConnection(aobj, j) {

            private final Object a[];
            private final i b;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                componentname = com.qihoo360.mobilesafe.support.a.b.a.a(ibinder);
                ibinder = new f();
                ibinder.a(componentname);
                a[0] = ibinder;
                synchronized (b)
                {
                    b.a();
                }
                return;
                ibinder;
                componentname;
                JVM INSTR monitorexit ;
                throw ibinder;
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                a = aobj;
                b = j;
                super();
            }
        };
        context.bindService(new Intent(a), serviceconnection, 1);
        j;
        JVM INSTR monitorenter ;
        j.a(60000);
        j;
        JVM INSTR monitorexit ;
        aobj[1] = serviceconnection;
        if (aobj[0] == null) goto _L1; else goto _L3
_L3:
        return (f)aobj[0];
        context;
        j;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String a(Context context, String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = context.getFileStreamPath(s);
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
            }
            Utils.resetFile(context, s, false);
            obj = ((File) (obj)).getAbsolutePath();
        }
        return ((String) (obj));
    }

    public static String a(String s)
    {
        return com.qihoo360.mobilesafe.support.a.h.b(s);
    }

    public static void a(Context context, boolean flag)
    {
        SharedPref.a(context, "root_enable", flag);
    }

    public static void a(b b1, String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        a1.a(2, false, null);
_L1:
        return;
        try
        {
            b1.b(s, list, list1, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1) { }
        if (a1 != null)
        {
            try
            {
                a1.a(2, false, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                return;
            }
        }
          goto _L1
        b1;
    }

    static void a(boolean flag)
    {
        e = flag;
    }

    public static boolean a()
    {
        return false;
    }

    public static boolean a(Context context)
    {
        return SharedPref.b(context, "root_enable", true);
    }

    public static boolean a(Context context, ServiceConnection serviceconnection)
    {
        if (context == null || serviceconnection == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = context.bindService(new Intent(a), serviceconnection, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public static byte[] a(b b1, String s, List list, long l)
    {
        String s1 = com.qihoo360.mobilesafe.support.a.h.a(s);
        if (s1 != null)
        {
            return b(b1, s1, list, null, l);
        } else
        {
            return b(b1, s, list, null, l);
        }
    }

    public static int b(b b1, String s, List list, long l)
    {
        String s1 = com.qihoo360.mobilesafe.support.a.h.a(s);
        ArrayList arraylist = new ArrayList();
        arraylist.add((new StringBuilder("LD_LIBRARY_PATH=")).append(System.getenv("LD_LIBRARY_PATH")).toString());
        if (s1 != null)
        {
            return a(b1, s1, list, arraylist, l);
        } else
        {
            return a(b1, s, list, arraylist, l);
        }
    }

    public static void b(Context context)
    {
        if (!c(context) && !e)
        {
            (new Thread(context) {

                private final Context a;

                public void run()
                {
                    Object aobj[];
                    a.a(true);
                    aobj = new Object[2];
                    f f1 = a.a(a, aobj);
                    if (f1 != null)
                    {
                        try
                        {
                            f1.a(20000L);
                        }
                        catch (Exception exception) { }
                    }
                    b(a, aobj);
                    a.a(false);
                    return;
                }

            
            {
                a = context;
                super();
            }
            }).start();
        }
    }

    public static void b(Context context, Object aobj[])
    {
        while (context == null || aobj == null || aobj.length < 2 || aobj[1] == null || !(aobj[1] instanceof ServiceConnection)) 
        {
            return;
        }
        try
        {
            context.unbindService((ServiceConnection)aobj[1]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static boolean b(Context context, ServiceConnection serviceconnection)
    {
        if (context == null || serviceconnection == null)
        {
            return false;
        }
        try
        {
            context.unbindService(serviceconnection);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static byte[] b(b b1, String s, List list, List list1, long l)
    {
        if (b1 == null)
        {
            return null;
        }
        try
        {
            b1 = b1.c(s, list, list1, l);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return null;
        }
        return b1;
    }

    public static boolean c(Context context)
    {
        if (context == null)
        {
            return false;
        }
        com/qihoo360/mobilesafe/support/a;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = d(context);
        }
        com/qihoo360/mobilesafe/support/a;
        JVM INSTR monitorexit ;
        return d.e();
        context;
        com/qihoo360/mobilesafe/support/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static c d(Context context)
    {
        if (com.qihoo360.mobilesafe.support.a.h.d(context) || "x86".equals(com.qihoo360.mobilesafe.support.a.h.b()))
        {
            return new d(context);
        } else
        {
            return new g(context);
        }
    }

    public static String e(Context context)
    {
        if (f == null)
        {
            File file = context.getFileStreamPath("rt.jar");
            if (file != null)
            {
                if (!file.exists() || !file.isFile())
                {
                    Utils.resetFile(context, "rt.jar", false);
                }
                f = file.getAbsolutePath();
            }
        }
        return f;
    }

    public static String f(Context context)
    {
        InputStream inputstream = null;
        if (g != null) goto _L2; else goto _L1
_L1:
        File file = new File(context.getFilesDir(), "rt2.jar");
        Object obj = context.getAssets().open("rt2.jar");
        inputstream = ((InputStream) (obj));
        boolean flag2;
        obj = SecurityUtil.getMD5(inputstream);
        flag2 = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag2)
        {
            boolean flag;
            boolean flag1;
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
            }
            return null;
        }
        flag1 = true;
        flag = flag1;
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        if (!((String) (obj)).equals(SecurityUtil.getFileMD5(file.getAbsolutePath()))) goto _L6; else goto _L5
_L5:
        flag = false;
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        FileUtil.copyAssetToFile(context, "rt2.jar", file, false);
        g = file.getAbsolutePath();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
_L2:
        return g;
_L6:
        file.delete();
        flag = flag1;
          goto _L4
        context;
_L9:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
          goto _L2
        context;
        inputstream = null;
_L8:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (Exception exception) { }
        }
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        context;
          goto _L9
    }

}
