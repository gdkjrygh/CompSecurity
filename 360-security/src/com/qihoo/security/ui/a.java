// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.qihoo.security.appbox.ui.AppBoxActivity;
import com.qihoo.security.gamebooster.GameBoosterActivity;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.security.ui.settings.LocaleSettingActivity;
import com.qihoo360.mobilesafe.b.k;
import java.util.Locale;

public class a
{

    public static void a(Context context)
    {
        Intent intent = new Intent(context, com/qihoo/security/gamebooster/GameBoosterActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("from", 0);
        context.startActivity(intent);
    }

    public static void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/qihoo/security/appbox/ui/AppBoxActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("current_red_point_is_showing", flag);
        context.startActivity(intent);
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/qihoo/security/ui/main/HomeActivity);
        intent.setFlags(0x14000000);
        intent.putExtra("fragment_index", 1);
        intent.putExtra("do_scan", true);
        context.startActivity(intent);
    }

    public static void c(Context context)
    {
        Intent intent = new Intent(context, com/qihoo/security/ui/main/HomeActivity);
        intent.setFlags(0x14000000);
        intent.putExtra("fragment_index", 2);
        intent.putExtra("set_intent", true);
        intent.putExtra("custom_action", 1);
        context.startActivity(intent);
    }

    public static void d(Context context)
    {
        Intent intent = new Intent(context, com/qihoo/security/ui/main/HomeActivity);
        intent.setFlags(0x14000000);
        intent.putExtra("fragment_index", 2);
        intent.putExtra("set_intent", true);
        intent.putExtra("custom_action", 2);
        context.startActivity(intent);
    }

    public static void e(Context context)
    {
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "market://details?id=%s", new Object[] {
                "com.qihoo.security.lite"
            })));
            intent.addFlags(0x10000000);
            intent.setPackage("com.android.vending");
            context.startActivity(intent);
            (new Handler()).postDelayed(new Runnable(context) {

                final Context a;

                public void run()
                {
                    k.a().a(a, 0x7f0c00c7, 0x7f0c00c8);
                }

            
            {
                a = context;
                super();
            }
            }, 3000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void f(Context context)
    {
        Intent intent = new Intent(context, com/qihoo/security/ui/settings/LocaleSettingActivity);
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }
}
