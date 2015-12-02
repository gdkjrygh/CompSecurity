// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.appbox.core.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.service.LoadingPermissionDataService;
import com.qihoo.security.service.PackageMonitorService;
import com.qihoo.security.service.e;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;

public class PackageMonitor extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a(String s);

        public abstract void b();

        public abstract void b(String s);
    }


    private static long a = 0L;
    private a b;

    public PackageMonitor()
    {
    }

    public PackageMonitor(a a1)
    {
        b = a1;
    }

    private void a(Context context, Intent intent)
    {
        Uri uri = null;
        String s = null;
        String s1 = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(s1))
        {
            uri = intent.getData();
            if (uri != null)
            {
                s = uri.getEncodedSchemeSpecificPart();
            }
            int i = intent.getIntExtra("android.intent.extra.UID", -1);
            if (i > 0)
            {
                context.startService((new Intent(context, com/qihoo/security/service/LoadingPermissionDataService)).setAction("com.qihoo360.mobilesafe.shield.pkgadd").putExtra("pkgname", s).putExtra("pkguid", i));
            }
        } else
        if ("android.intent.action.PACKAGE_REMOVED".equals(s1) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false))
        {
            Uri uri1 = intent.getData();
            Object obj = uri;
            if (uri1 != null)
            {
                obj = uri1.getEncodedSchemeSpecificPart();
            }
            int j = intent.getIntExtra("android.intent.extra.UID", -1);
            if (j > 0)
            {
                context.startService((new Intent(context, com/qihoo/security/service/LoadingPermissionDataService)).setAction("com.qihoo360.mobilesafe.shield.pkgremoved").putExtra("pkgname", ((String) (obj))).putExtra("pkguid", j));
                return;
            }
        }
    }

    private void a(Context context, String s)
    {
    }

    private boolean b(Context context, String s)
    {
label0:
        {
            context = context.getPackageManager();
            int i;
            try
            {
                context = context.getPackageInfo(s, 0);
                if ((((PackageInfo) (context)).applicationInfo.flags & 1) == 0)
                {
                    break label0;
                }
                i = ((PackageInfo) (context)).applicationInfo.flags;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("PackageMonitor", "", context);
                return false;
            }
            if ((i & 0x80) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public void a(Context context)
    {
        try
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentfilter.setPriority(999);
            intentfilter.addDataScheme("package");
            context.registerReceiver(this, intentfilter);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public void b(Context context)
    {
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        Object obj;
        a(context.getApplicationContext(), intent);
        obj = intent.getAction();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getData().getEncodedSchemeSpecificPart();
        if (!"android.intent.action.PACKAGE_ADDED".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        e.a(context, s);
        com.qihoo.security.appbox.core.a.a(context, s, true);
        SharedPref.a(SecurityApplication.a(), "cloud_scan_executed", false);
        if (SharedPref.b(SecurityApplication.a(), "malware_states_for_home", 0) != 2)
        {
            SharedPref.a(SecurityApplication.a(), "malware_states_for_home", 0);
        }
        if (!SharedPref.b(SecurityApplication.a(), "setting_package_monitor", true) || "com.qihoo.security.lite".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (r.a(context.getPackageManager().getPackageInfo(s, 64).signatures))
            {
                if (s.startsWith("com.qihoo.security.lang"))
                {
                    d.a().c(s);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (b != null)
        {
            b.a(s);
        }
        if (b(context, s) && o.a().equals(context.getPackageName()) && System.currentTimeMillis() - a >= 200L)
        {
            a = System.currentTimeMillis();
            if (!SharedPref.b(context, "malware_is_scanning", false))
            {
                a(context, s);
                intent.setClass(context, com/qihoo/security/service/PackageMonitorService);
                context.startService(intent);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!"android.intent.action.PACKAGE_REMOVED".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        e.b(context, s);
        if (!intent.getBooleanExtra("android.intent.extra.REPLACING", false))
        {
            if (!TextUtils.isEmpty(s))
            {
                c.a(context, s);
            }
            if (b != null)
            {
                b.b(s);
            }
            if (!s.startsWith("com.qihoo.security.lang"));
        }
        if (b != null)
        {
            b.b();
        }
        if (!"com.qihoo.security".equals(s)) goto _L1; else goto _L4
_L4:
        context = com.qihoo.security.app.c.a();
        context.b();
        context.c();
        return;
        if (!"android.intent.action.PACKAGE_REPLACED".equals(obj)) goto _L1; else goto _L5
_L5:
        e.a();
        return;
    }

}
