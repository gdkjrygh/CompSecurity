// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.ui.result.view.AdvLoadingActivity;
import com.qihoo360.mobilesafe.share.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.result:
//            e, AdvData

public class a
{

    public static a a = null;
    private final Context b = SecurityApplication.a();

    private a()
    {
    }

    public static a a()
    {
        com/qihoo/security/ui/result/a;
        JVM INSTR monitorenter ;
        a a1;
        if (a == null)
        {
            a = new a();
        }
        a1 = a;
        com/qihoo/security/ui/result/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private static String a(String s, Intent intent, Context context)
    {
        String s1 = "";
        context = context.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
        intent = s1;
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)context.next();
            if (resolveinfo.activityInfo.packageName.equalsIgnoreCase(s))
            {
                intent = resolveinfo.activityInfo.name;
            }
        } while (true);
        return intent;
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            (new e(context, s, s1, s2)).a();
        }
    }

    public void a(AdvData advdata)
    {
        if (advdata == null)
        {
            return;
        }
        try
        {
            if (1 == advdata.openType)
            {
                b(advdata);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdvData advdata)
        {
            return;
        }
        if (2 == advdata.openType)
        {
            com.qihoo.security.support.a.a(b, advdata.pkg, advdata.openUrl);
            return;
        }
        com.qihoo.security.support.a.b(b, advdata.pkg, advdata.openUrl);
        return;
    }

    public void a(String s, boolean flag)
    {
        String s1;
        Intent intent;
        s1 = d.b("sp_name_adv_referrer", s, "");
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        intent = new Intent("com.android.vending.INSTALL_REFERRER");
        String s2 = a(s, intent, b);
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        intent.setClassName(s, s2);
_L1:
        intent.putExtra("referrer", s1);
        b.sendBroadcast(intent);
        if (flag)
        {
            try
            {
                d.a("sp_name_adv_referrer", s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        break MISSING_BLOCK_LABEL_96;
        intent.setPackage(s);
          goto _L1
    }

    public boolean a(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        Object obj;
        boolean flag2;
        try
        {
            if (TextUtils.isEmpty(s))
            {
                break MISSING_BLOCK_LABEL_71;
            }
            obj = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s = ((Uri) (obj)).getScheme();
        obj = ((Uri) (obj)).getHost();
        if ("market".equals(s) || "play.google.com".equals(obj))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        flag2 = "market.android.com".equals(obj);
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        flag = true;
        return flag;
    }

    public void b(AdvData advdata)
    {
        String s = com.qihoo.security.ui.result.card.a.a.a().a("advcard", "parsetype");
        if ("1".equals(s))
        {
            com.qihoo.security.support.a.b(b, advdata.pkg, advdata.openUrl);
            return;
        }
        if ("2".equals(s))
        {
            Intent intent = new Intent(b, com/qihoo/security/ui/result/view/AdvLoadingActivity);
            intent.putExtra("adv_data", advdata);
            intent.addFlags(0x10000000);
            b.startActivity(intent);
            return;
        } else
        {
            a().c(advdata);
            return;
        }
    }

    public void c(AdvData advdata)
    {
        com.qihoo.security.support.a.a(b, advdata.pkg);
        a(b, advdata.openUrl, advdata.adid, advdata.pkg);
    }

}
