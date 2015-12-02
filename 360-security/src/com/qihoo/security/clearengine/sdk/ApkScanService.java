// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo360.mobilesafe.opti.i.plugins.ApkInfo;
import java.io.File;
import java.lang.reflect.Method;

public class ApkScanService extends Service
{

    private Context a;
    private final com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService.Stub b = new com.qihoo360.mobilesafe.opti.i.plugins.IApkScanService.Stub() {

        final ApkScanService a;
        private final Object b = new Object();
        private int c;

        public int create()
        {
            synchronized (b)
            {
                c = c + 1;
            }
            return 0;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public int destroy()
        {
            synchronized (b)
            {
                c = c - 1;
                if (c == 0)
                {
                    ApkScanService.b(a);
                }
            }
            return 0;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public ApkInfo scanApk(String s)
            throws RemoteException
        {
            return ApkScanService.a(ApkScanService.a(a), s);
        }

            
            {
                a = ApkScanService.this;
                super();
                c = 0;
            }
    };

    public ApkScanService()
    {
    }

    static Context a(ApkScanService apkscanservice)
    {
        return apkscanservice.a;
    }

    public static ApkInfo a(Context context, String s)
    {
        ApkInfo apkinfo;
        PackageManager packagemanager;
        boolean flag1;
        flag1 = false;
        apkinfo = new ApkInfo();
        apkinfo.path = s;
        s = new File(apkinfo.path);
        apkinfo.size = s.length();
        apkinfo.desc = s.getName();
        apkinfo.modifyTime = s.lastModified();
        packagemanager = context.getPackageManager();
        s = null;
        PackageInfo packageinfo = packagemanager.getPackageArchiveInfo(apkinfo.path, 4096);
        s = packageinfo;
_L7:
        boolean flag = flag1;
        if (s == null) goto _L2; else goto _L1
_L1:
        apkinfo.apkVersionName = ((PackageInfo) (s)).versionName;
        apkinfo.apkVersionCode = ((PackageInfo) (s)).versionCode;
        apkinfo.packageName = ((PackageInfo) (s)).packageName;
        apkinfo.apkIconID = ((PackageInfo) (s)).applicationInfo.icon;
        if (((PackageInfo) (s)).applicationInfo.labelRes != 0) goto _L4; else goto _L3
_L3:
        apkinfo.desc = String.valueOf(packagemanager.getApplicationLabel(((PackageInfo) (s)).applicationInfo));
_L5:
        flag = true;
_L2:
        if (!flag)
        {
            apkinfo.dataType = 2;
        }
        return apkinfo;
_L4:
        context = b(context, apkinfo.path);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        apkinfo.desc = context.getString(((PackageInfo) (s)).applicationInfo.labelRes);
        if (!TextUtils.isEmpty(apkinfo.desc))
        {
            apkinfo.desc = apkinfo.desc.trim();
        }
          goto _L5
        context;
        flag = flag1;
          goto _L2
        Throwable throwable;
        throwable;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a()
    {
        (new Handler()).postDelayed(new Runnable() {

            final ApkScanService a;

            public void run()
            {
                Process.killProcess(Process.myPid());
            }

            
            {
                a = ApkScanService.this;
                super();
            }
        }, 100L);
    }

    public static Resources b(Context context, String s)
    {
        try
        {
            Class class1 = Class.forName("android.content.res.AssetManager");
            Object obj = class1.newInstance();
            class1.getMethod("addAssetPath", new Class[] {
                java/lang/String
            }).invoke(obj, new Object[] {
                s
            });
            context = context.getResources();
            context = new Resources((AssetManager)obj, context.getDisplayMetrics(), context.getConfiguration());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    static void b(ApkScanService apkscanservice)
    {
        apkscanservice.a();
    }

    public IBinder onBind(Intent intent)
    {
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        a = getApplicationContext();
    }

    public void onDestroy()
    {
        super.onDestroy();
        a();
    }
}
