// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.a;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.appbox.ui.AppBoxActivity;
import com.qihoo.security.locale.c;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.security.ui.settings.LocaleSettingActivity;
import com.qihoo.security.ui.settings.SettingsActivity;
import com.qihoo.security.v5.UpdateService;
import com.qihoo.security.v5.UpdatedDialog;
import com.qihoo360.common.utils.FeatureConfigUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.h;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;

// Referenced classes of package com.qihoo.security.lite:
//            LicenseActivity

public class AppEnterActivity extends BaseActivity
{

    private static final String z = com/qihoo/security/lite/AppEnterActivity.getSimpleName();
    private Context A;
    private Intent B;
    private int C;
    private final Handler D = new Handler() {

        final AppEnterActivity a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                com.qihoo.security.lite.AppEnterActivity.b(a);
                return;

            case 1: // '\001'
                com.qihoo.security.lite.AppEnterActivity.c(a);
                return;

            case 2: // '\002'
                AppEnterActivity.e(a).setClass(AppEnterActivity.d(a), com/qihoo/security/ui/main/HomeActivity);
                break;
            }
            a.startActivity(AppEnterActivity.e(a));
            a.finish();
        }

            
            {
                a = AppEnterActivity.this;
                super();
            }
    };
    long y;

    public AppEnterActivity()
    {
        y = 800L;
    }

    private void a(long l)
    {
        D.postDelayed(new Runnable() {

            final AppEnterActivity a;

            public void run()
            {
                com.qihoo.security.lite.AppEnterActivity.a(a);
            }

            
            {
                a = AppEnterActivity.this;
                super();
            }
        }, l);
    }

    static void a(AppEnterActivity appenteractivity)
    {
        appenteractivity.p();
    }

    static void b(AppEnterActivity appenteractivity)
    {
        appenteractivity.r();
    }

    static void c(AppEnterActivity appenteractivity)
    {
        appenteractivity.s();
    }

    static Context d(AppEnterActivity appenteractivity)
    {
        return appenteractivity.A;
    }

    static Intent e(AppEnterActivity appenteractivity)
    {
        return appenteractivity.B;
    }

    private void o()
    {
        if (com.qihoo.security.locale.c.a(A, "key_app_version"))
        {
            SharedPref.a(A, "key_notice_language_upgrade_show_times", 0);
            SharedPref.a(A, "key_notice_language_upgrade_time", 0L);
            com.qihoo.security.locale.c.b(A, "key_app_version");
        }
    }

    private void p()
    {
        com.qihoo.security.a.c();
        B = new Intent();
        B.addFlags(0x20000);
        boolean flag = SharedPref.b(A, "license", false);
        if (flag)
        {
            if (SharedPref.c(A))
            {
                UpdateService.a();
            } else
            {
                com.qihoo360.mobilesafe.b.a.f(A);
            }
        }
        com.qihoo360.mobilesafe.b.r.a();
        if (flag);
        if (com.qihoo360.mobilesafe.b.r.c(A))
        {
            D.sendEmptyMessageDelayed(1, 800L);
            return;
        }
        switch (C)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        case 8: // '\b'
        default:
            D.sendEmptyMessageDelayed(2, y);
            return;

        case 1: // '\001'
            D.sendEmptyMessageDelayed(2, y);
            return;

        case 2: // '\002'
            t();
            return;

        case 9: // '\t'
            D.sendEmptyMessageDelayed(2, y);
            return;

        case 3: // '\003'
            u();
            return;

        case 6: // '\006'
            v();
            return;
        }
    }

    private void q()
    {
        C = h.a(getIntent(), "from", 0);
        if (C == 2 || C == 3 || C == 5 || C == 8 || C == 6)
        {
            setVisible(false);
            a(0L);
            return;
        }
        com.qihoo.security.ui.b.a.f f = com.qihoo.security.ui.b.a.a().b(0x7f030093);
        if (f == null)
        {
            setContentView(0x7f030093);
        } else
        {
            setContentView(f.b);
        }
        y = 800L;
        findViewById(0x7f0b01de).setVisibility(0);
        findViewById(0x7f0b01e1).setVisibility(0);
        a(300L);
    }

    private void r()
    {
        B.setClass(A, com/qihoo/security/lite/LicenseActivity);
        startActivity(B);
        finish();
        overridePendingTransition(0x10a0002, 0x10a0003);
    }

    private void s()
    {
        SharedPref.a(A, "user_ex", true);
        SharedPref.a(SecurityApplication.a(), "license", true);
        com.qihoo360.mobilesafe.b.a.f(A);
        try
        {
            PackageInfo packageinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            SharedPref.a(SecurityApplication.a(), "guide_ver", packageinfo.versionCode);
        }
        catch (Exception exception) { }
        B.setClass(A, com.qihoo360.mobilesafe.b.r.b());
        startActivity(B);
        finish();
        overridePendingTransition(0x10a0000, 0x10a0001);
    }

    private void t()
    {
        B.setClass(A, com/qihoo/security/ui/settings/SettingsActivity);
        startActivity(B);
        finish();
    }

    private void u()
    {
        B.putExtra("from", 3);
        B.setClass(A, com/qihoo/security/ui/settings/LocaleSettingActivity);
        startActivity(B);
        finish();
        overridePendingTransition(0x10a0002, 0x10a0003);
    }

    private void v()
    {
        if ((new FeatureConfigUtils(A)).isUsingGooglePlay(com.qihoo.security.env.a.a(A)))
        {
            com.qihoo.security.support.b.c(26001);
            B.putExtra("from", 6);
            B.setClass(A, com/qihoo/security/appbox/ui/AppBoxActivity);
            startActivity(B);
            finish();
            overridePendingTransition(0x10a0002, 0x10a0003);
            return;
        } else
        {
            D.sendEmptyMessageDelayed(2, 800L);
            return;
        }
    }

    protected String i()
    {
        return "appe";
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.qihoo360.mobilesafe.b.r.a(A);
    }

    public void onBackPressed()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        A = getApplicationContext();
        long l = SharedPref.b(A, "current_app_start_time", 0L);
        if (l == 0L)
        {
            SharedPref.a(A, "the_last_start_app_time", 0L);
        } else
        {
            SharedPref.a(A, "the_last_start_app_time", l);
        }
        SharedPref.a(A, "current_app_start_time", System.currentTimeMillis());
        if (!SharedPref.b(A, "the_first_start_app_condition", false))
        {
            SharedPref.a(A, "the_first_start_app", true);
            SharedPref.a(A, "the_first_start_app_condition", true);
        } else
        {
            SharedPref.a(A, "the_first_start_app", false);
        }
        bundle = SharedPref.b(A, "skfutv");
        if (bundle != null && Utils.compareVersion(bundle, "1.0.8.3742") > 0)
        {
            bundle = com.qihoo360.mobilesafe.b.r.a((new File(getFilesDir(), "v5/saved/info")).getAbsolutePath());
            if (bundle != null && "1".equals(bundle.getString("force")))
            {
                bundle.putBoolean("uiforce", true);
                Intent intent = new Intent(A, com/qihoo/security/v5/UpdatedDialog);
                intent.addFlags(0x10000000);
                intent.putExtras(bundle);
                A.startActivity(intent);
                finish();
                return;
            }
        }
        q();
        o();
        com.qihoo.utils.notice.c.a(A, false);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

}
