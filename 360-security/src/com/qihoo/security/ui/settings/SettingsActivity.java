// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.content.g;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity;
import com.qihoo.security.quc.AccountLog;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.VirusIgnoreListActivity;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity;
import com.qihoo.security.v5.UpdateHelper;
import com.qihoo.security.v5.a;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo.utils.notice.c;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.settings:
//            LocaleSettingActivity, AboutUsActivity, SettingsAdvancedActivity

public class SettingsActivity extends BaseActivity
    implements android.view.View.OnClickListener
{

    private CheckBoxPreference A;
    private CheckBoxPreference B;
    private CheckBoxPreference C;
    private CheckBoxPreference D;
    private CheckBoxPreference E;
    private CheckBoxPreference F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private com.qihoo.security.floatview.a.b N;
    private boolean O;
    private TextView P;
    private final Handler Q = new Handler() {

        final SettingsActivity a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
        }

            
            {
                a = SettingsActivity.this;
                super();
            }
    };
    private com.qihoo.security.service.a R;
    private final ServiceConnection S = new ServiceConnection() {

        final SettingsActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.ui.settings.SettingsActivity.a(a, com.qihoo.security.service.a.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.ui.settings.SettingsActivity.a(a, null);
        }

            
            {
                a = SettingsActivity.this;
                super();
            }
    };
    private final ServiceConnection T = new ServiceConnection() {

        final SettingsActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.ui.settings.SettingsActivity.a(a, com.qihoo.security.floatview.a.b.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.ui.settings.SettingsActivity.a(a, null);
        }

            
            {
                a = SettingsActivity.this;
                super();
            }
    };
    private final BroadcastReceiver U = new BroadcastReceiver() {

        final SettingsActivity a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                if ("com.qihoo.security.FINISH_MAIN_SCREEN".equals(context) || "com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context))
                {
                    a.finish();
                    return;
                }
                if ("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion".equals(context))
                {
                    SettingsActivity.k(a);
                    return;
                }
                if ("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint".equals(context))
                {
                    SettingsActivity.k(a);
                    return;
                }
            }
        }

            
            {
                a = SettingsActivity.this;
                super();
            }
    };
    CheckBoxPreference y;
    private CheckBoxPreference z;

    public SettingsActivity()
    {
        O = false;
        R = null;
    }

    static com.qihoo.security.floatview.a.b a(SettingsActivity settingsactivity, com.qihoo.security.floatview.a.b b1)
    {
        settingsactivity.N = b1;
        return b1;
    }

    static com.qihoo.security.service.a a(SettingsActivity settingsactivity, com.qihoo.security.service.a a1)
    {
        settingsactivity.R = a1;
        return a1;
    }

    static void a(SettingsActivity settingsactivity)
    {
        settingsactivity.u();
    }

    static boolean a(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.G = flag;
        return flag;
    }

    static boolean b(SettingsActivity settingsactivity)
    {
        return settingsactivity.G;
    }

    static boolean b(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.H = flag;
        return flag;
    }

    static com.qihoo.security.floatview.a.b c(SettingsActivity settingsactivity)
    {
        return settingsactivity.N;
    }

    static boolean c(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.I = flag;
        return flag;
    }

    static boolean d(SettingsActivity settingsactivity)
    {
        return settingsactivity.H;
    }

    static boolean d(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.J = flag;
        return flag;
    }

    static com.qihoo.security.service.a e(SettingsActivity settingsactivity)
    {
        return settingsactivity.R;
    }

    static boolean e(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.K = flag;
        return flag;
    }

    static boolean f(SettingsActivity settingsactivity)
    {
        return settingsactivity.I;
    }

    static boolean f(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.L = flag;
        return flag;
    }

    static boolean g(SettingsActivity settingsactivity)
    {
        return settingsactivity.J;
    }

    static boolean g(SettingsActivity settingsactivity, boolean flag)
    {
        settingsactivity.M = flag;
        return flag;
    }

    static boolean h(SettingsActivity settingsactivity)
    {
        return settingsactivity.K;
    }

    static boolean i(SettingsActivity settingsactivity)
    {
        return settingsactivity.L;
    }

    static boolean j(SettingsActivity settingsactivity)
    {
        return settingsactivity.M;
    }

    static void k(SettingsActivity settingsactivity)
    {
        settingsactivity.p();
    }

    private void o()
    {
        z = (CheckBoxPreference)findViewById(0x7f0b01cc);
        A = (CheckBoxPreference)findViewById(0x7f0b01cd);
        findViewById(0x7f0b01ce).setOnClickListener(this);
        findViewById(0x7f0b01d5).setOnClickListener(this);
        B = (CheckBoxPreference)findViewById(0x7f0b00d3);
        C = (CheckBoxPreference)findViewById(0x7f0b00d7);
        findViewById(0x7f0b00d8).setOnClickListener(this);
        findViewById(0x7f0b01cf).setOnClickListener(this);
        findViewById(0x7f0b01d1).setOnClickListener(this);
        y = (CheckBoxPreference)findViewById(0x7f0b01d2);
        y.setOnClickListener(this);
        Object obj = String.format(o.a(0x7f0c01b5), new Object[] {
            SharedPref.b(p)
        });
        y.setSummary(((String) (obj)));
        obj = (CheckBoxPreference)findViewById(0x7f0b01d3);
        ((CheckBoxPreference) (obj)).setOnClickListener(this);
        P = (TextView)((CheckBoxPreference) (obj)).findViewById(0x7f0b01b7);
        p();
        findViewById(0x7f0b01d2).setOnClickListener(this);
        D = (CheckBoxPreference)findViewById(0x7f0b018b);
        E = (CheckBoxPreference)findViewById(0x7f0b01d0);
        F = (CheckBoxPreference)findViewById(0x7f0b01d4);
        findViewById(0x7f0b01d6).setOnClickListener(this);
    }

    private void p()
    {
        if (P == null)
        {
            return;
        }
        O = com.qihoo.security.v5.a.b(this);
        if (O)
        {
            BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f020097);
            bitmapdrawable.setBounds(0, 0, bitmapdrawable.getIntrinsicWidth(), bitmapdrawable.getIntrinsicHeight());
            P.setCompoundDrawables(null, null, bitmapdrawable, null);
            return;
        } else
        {
            P.setCompoundDrawables(null, null, null, null);
            return;
        }
    }

    private void q()
    {
        G = SharedPref.b(p, "fv_enabled", com.qihoo.security.floatview.a.a.e());
        H = SharedPref.b(p, "notification", true);
        I = SharedPref.b(p, "remind_trash_swtich", true);
        J = SharedPref.b(p, "remind_uninstallReminder_swtich", true);
        K = SharedPref.b(p, "setting_auto_start", true);
        L = SharedPref.b(p, "setting_app_security_alert", true);
        M = SharedPref.b(p, "user_ex", true);
    }

    private void r()
    {
        z.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.qihoo.security.ui.settings.SettingsActivity.b(a) != flag)
                {
                    com.qihoo.security.ui.settings.SettingsActivity.a(a, flag);
                    if (flag)
                    {
                        com.qihoo.security.support.b.c(19001);
                    }
                    if (com.qihoo.security.ui.settings.SettingsActivity.c(a) != null)
                    {
                        try
                        {
                            com.qihoo.security.ui.settings.SettingsActivity.c(a).a(flag);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (CompoundButton compoundbutton)
                        {
                            return;
                        }
                    }
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        if (com.qihoo360.mobilesafe.b.i.a())
        {
            A.setVisibility(8);
            z.setVisibility(8);
        } else
        {
            A.setVisibility(0);
            z.setVisibility(0);
        }
        A.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.qihoo.security.ui.settings.SettingsActivity.d(a) != flag)
                {
                    com.qihoo.security.ui.settings.SettingsActivity.b(a, flag);
                    if (!flag)
                    {
                        com.qihoo.security.support.b.c(19002);
                    }
                    SharedPref.a(a.p, "notification", flag);
                    if (SettingsActivity.e(a) != null)
                    {
                        try
                        {
                            SettingsActivity.e(a).a(flag);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (CompoundButton compoundbutton)
                        {
                            return;
                        }
                    }
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        B.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.qihoo.security.ui.settings.SettingsActivity.f(a) == flag)
                {
                    return;
                } else
                {
                    com.qihoo.security.ui.settings.SettingsActivity.c(a, flag);
                    SharedPref.a(a.p, "remind_trash_swtich", flag);
                    com.qihoo.security.support.b.c(19004);
                    return;
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        C.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.qihoo.security.ui.settings.SettingsActivity.g(a) == flag)
                {
                    return;
                } else
                {
                    com.qihoo.security.ui.settings.SettingsActivity.d(a, flag);
                    SharedPref.a(a.p, "remind_uninstallReminder_swtich", flag);
                    com.qihoo.security.support.b.c(19005);
                    return;
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        D.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (SettingsActivity.h(a) != flag)
                {
                    SettingsActivity.e(a, flag);
                    SharedPref.a(a.p, "setting_auto_start", flag);
                    com.qihoo.security.support.b.c(19009);
                    if (flag)
                    {
                        com.qihoo.security.support.b.c(14019);
                    }
                    if (!SharedPref.a("malware_find_issue_time"))
                    {
                        SharedPref.a(a.p, "malware_find_issue_time", 0L);
                        return;
                    }
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        E.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.qihoo.security.ui.settings.SettingsActivity.i(a) == flag)
                {
                    return;
                }
                com.qihoo.security.ui.settings.SettingsActivity.f(a, flag);
                SharedPref.a(a.p, "setting_app_security_alert", flag);
                if (flag)
                {
                    com.qihoo.security.support.b.c(20031);
                    return;
                } else
                {
                    com.qihoo.utils.notice.c.c();
                    com.qihoo.security.support.b.c(20032);
                    return;
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
        F.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (SettingsActivity.j(a) == flag)
                {
                    return;
                } else
                {
                    com.qihoo.security.ui.settings.SettingsActivity.g(a, flag);
                    SharedPref.a(a.p, "user_ex", flag);
                    return;
                }
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        });
    }

    private void s()
    {
        Utils.bindService(p, com/qihoo/security/service/SecurityService, "com.qihoo.security.service.INTERNAL_CONTROL", S, 1);
        Utils.bindService(p, com/qihoo/security/service/SecurityService, "com.qihoo.security.floatview.SERVICER", T, 1);
    }

    private void t()
    {
        g g1 = android.support.v4.content.g.a(p);
        IntentFilter intentfilter = new IntentFilter("com.qihoo.security.FINISH_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.REBOOT_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion");
        intentfilter.addAction("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint");
        g1.a(U, intentfilter);
    }

    private void u()
    {
        C.a();
        B.a();
    }

    private void v()
    {
        z.a(G);
        A.a(H);
        B.a(I);
        C.a(J);
        D.a(K);
        E.a(L);
        F.a(M);
        Q.sendMessageDelayed(Q.obtainMessage(3), 200L);
        String s1 = String.format(o.a(0x7f0c01b5), new Object[] {
            SharedPref.b(p)
        });
        y.setSummary(s1);
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        static class _cls5
        {

            static final int a[] = new int[FragmentAction.values().length];

        }

        int l = com.qihoo.security.ui.settings._cls5.a[fragmentaction.ordinal()];
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && intent.getIntExtra("from", 0) == 2)
        {
            com.qihoo360.mobilesafe.b.r.a(this, com/qihoo/security/ui/settings/SettingsActivity.getName(), false);
        }
        super.finish();
    }

    protected String i()
    {
        return "set";
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c0160));
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(0x7f040007, 0x7f040009);
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 10: default 96
    //                   2131427539: 96
    //                   2131427543: 96
    //                   2131427544: 131
    //                   2131427790: 97
    //                   2131427791: 147
    //                   2131427793: 163
    //                   2131427794: 204
    //                   2131427795: 218
    //                   2131427797: 243
    //                   2131427798: 179;
           goto _L1 _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L3:
        startActivity(new Intent(p, com/qihoo/security/ui/settings/LocaleSettingActivity));
        com.qihoo.utils.notice.a.a().b(317);
        com.qihoo.security.support.b.c(19003);
        return;
_L2:
        startActivity(new Intent(this, com/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity));
        return;
_L4:
        startActivity(new Intent(this, com/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity));
        return;
_L5:
        startActivity(new Intent(this, com/qihoo/security/ui/antivirus/VirusIgnoreListActivity));
        return;
_L9:
        startActivity(new Intent(p, com/qihoo/security/ui/settings/AboutUsActivity));
        com.qihoo.security.support.b.c(19010);
        return;
_L6:
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            UpdateHelper.a(this, com.qihoo.security.v5.UpdateHelper.UpdateType.SettingOther);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            UpdateHelper.a(this, com.qihoo.security.v5.UpdateHelper.UpdateType.SettingAPP);
        }
        if (O)
        {
            com.qihoo.security.v5.a.a(this);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        startActivity(new Intent(p, com/qihoo/security/ui/settings/SettingsAdvancedActivity));
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03008e);
        o();
        q();
        com.qihoo360.mobilesafe.b.r.a();
        r();
        s();
        t();
        Q.postDelayed(new Runnable() {

            final SettingsActivity a;

            public void run()
            {
                com.qihoo.security.ui.settings.SettingsActivity.a(a);
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        }, 200L);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Utils.unbindService("SettingsActivity", p, T);
        Utils.unbindService("SettingsActivity", p, S);
        android.support.v4.content.g.a(p).a(U);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        ((ScrollView)findViewById(0x7f0b01cb)).scrollTo(0, 0);
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        v();
    }

    protected void onStart()
    {
        super.onStart();
        AccountLog.a(com.qihoo.security.quc.AccountLog.FUNC_LIST.UI_ENTER_SETTING);
    }

    protected void onStop()
    {
        super.onStop();
    }
}
