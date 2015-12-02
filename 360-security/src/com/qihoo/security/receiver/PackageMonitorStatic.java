// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.appbox.core.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.service.LoadingPermissionDataService;
import com.qihoo.security.service.PackageMonitorService;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.receiver:
//            BootReceiver

public class PackageMonitorStatic extends BootReceiver
{

    public PackageMonitorStatic()
    {
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
                Log.e("PackageMonitorStatic", "", context);
                return false;
            }
            if ((i & 0x80) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        break MISSING_BLOCK_LABEL_6;
label0:
        while (true) 
        {
            String s;
            do
            {
                do
                {
                    return;
                } while (intent == null || !SharedPref.b(context, "license", false) || SecurityService.a);
                a(context.getApplicationContext(), intent);
                String s1 = intent.getAction();
                if (s1 == null)
                {
                    continue label0;
                }
                s = intent.getData().getEncodedSchemeSpecificPart();
                if (!"android.intent.action.PACKAGE_ADDED".equals(s1))
                {
                    continue label0;
                }
                com.qihoo.security.appbox.core.a.a(context, s, true);
                SharedPref.a(SecurityApplication.a(), "cloud_scan_executed", false);
                if (SharedPref.b(SecurityApplication.a(), "malware_states_for_home", 0) != 2)
                {
                    SharedPref.a(SecurityApplication.a(), "malware_states_for_home", 0);
                }
                if (!SharedPref.b(SecurityApplication.a(), "setting_package_monitor", true) || "com.qihoo.security.lite".equals(s))
                {
                    continue label0;
                }
                try
                {
                    if (!r.a(context.getPackageManager().getPackageInfo(s, 64).signatures))
                    {
                        continue;
                    }
                    if (s.startsWith("com.qihoo.security.lang"))
                    {
                        d.a().c(s);
                        return;
                    }
                    continue label0;
                }
                catch (Exception exception) { }
            } while (!b(context, s));
            String s2 = o.a();
            Log.d("PackageMonitorStatic", (new StringBuilder()).append("processName:").append(s2).append(" context.getPackageName:").append(context.getPackageName()).toString());
            if (s2.equals(context.getPackageName()))
            {
                a(context, s);
                intent.setClass(context, com/qihoo/security/service/PackageMonitorService);
                context.startService(intent);
                return;
            }
        }
    }
}
