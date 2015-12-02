// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.dialog.b;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.v5.AveDBUpdateService;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo.security.widget.ProgressView;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.io.IOException;

public class SettingsAdvancedActivity extends BaseActivity
{

    private b A;
    private b B;
    private b C;
    private View D;
    private View E;
    private View F;
    private LocaleTextView G;
    private LocaleTextView H;
    private LocaleTextView I;
    private LocaleTextView J;
    private ProgressView K;
    private final com.qihoo.security.v5.AveDBUpdateService.a L = new com.qihoo.security.v5.AveDBUpdateService.a() {

        final SettingsAdvancedActivity a;
        private boolean b;

        public void a(Bundle bundle)
        {
            if (bundle == null)
            {
                return;
            }
            long l1 = bundle.getLong("current", 0L);
            long l2 = bundle.getLong("total", 0L);
            float f2 = 0.0F;
            float f1 = f2;
            if (l2 > 0L)
            {
                f1 = f2;
                if (l1 <= l2)
                {
                    f1 = (float)l1 / (float)l2;
                }
            }
            SettingsAdvancedActivity.a(a).setProgress(f1);
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.b(a).setLocalText(Utils.getHumanReadableSizeNoFraction(l1));
            SettingsAdvancedActivity.c(a).setLocalText(Utils.getHumanReadableSizeNoFraction(l2));
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonText(new int[] {
                0x7f0c014f
            });
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener(this) {

                    final _cls1 a;

                    public void onClick(View view)
                    {
                        AveDBUpdateService.a();
                        Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                    }

            
            {
                a = _pcls1;
                super();
            }
                }
            });
        }

        public void b(Bundle bundle)
        {
            b = false;
        }

        public void c(Bundle bundle)
        {
            if (bundle == null)
            {
                SettingsAdvancedActivity.e(a).setLocalText(0x7f0c01b4);
                return;
            }
            bundle.getInt("errorResult");
            JVM INSTR tableswitch -1 -1: default 40
        //                       -1 143;
               goto _L1 _L2
_L1:
            SettingsAdvancedActivity.e(a).setLocalText(0x7f0c01b4);
_L4:
            SettingsAdvancedActivity.f(a).setVisibility(8);
            SettingsAdvancedActivity.g(a).setVisibility(8);
            SettingsAdvancedActivity.h(a).setVisibility(0);
            SettingsAdvancedActivity.i(a).setVisibility(8);
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonText(new int[] {
                0x7f0c014e
            });
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener(this) {

                    final _cls1 a;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                    }

            
            {
                a = _pcls1;
                super();
            }
                }
            });
            return;
_L2:
            SettingsAdvancedActivity.e(a).setLocalText(0x7f0c01b3);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void d(Bundle bundle)
        {
            if (bundle == null)
            {
                return;
            }
            bundle = bundle.getString("data_file_path");
            if (bundle != null)
            {
                File file = new File(a.getFilesDir(), "avedb_e.zip");
                if (file.exists())
                {
                    try
                    {
                        FileUtil.forceDelete(file);
                        FileUtil.copyFile(new File(bundle), file);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        bundle.printStackTrace();
                    }
                }
                FileUtil.setFileTimestamp(a.p, "avedb_e.zip", System.currentTimeMillis() / 1000L);
            }
            b = true;
        }

        public void e(Bundle bundle)
        {
            SettingsAdvancedActivity.a(a).a(0.0F, 0);
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.b(a).setLocalText("");
            SettingsAdvancedActivity.c(a).setLocalText("");
            SettingsAdvancedActivity.f(a).setVisibility(8);
            SettingsAdvancedActivity.h(a).setVisibility(8);
            SettingsAdvancedActivity.g(a).setVisibility(0);
        }

        public void f(Bundle bundle)
        {
            if (bundle == null)
            {
                return;
            }
            SettingsAdvancedActivity.f(a).setVisibility(8);
            SettingsAdvancedActivity.g(a).setVisibility(8);
            bundle = bundle.getString("data_file_version");
            if (!b || TextUtils.isEmpty(bundle))
            {
                SettingsAdvancedActivity.e(a).setLocalText(0x7f0c01b2);
                SettingsAdvancedActivity.i(a).setLocalText("");
                SettingsAdvancedActivity.h(a).setVisibility(0);
                SettingsAdvancedActivity.i(a).setVisibility(8);
            } else
            {
                SharedPref.a(a.p, "key_virus_scan_strict_version", bundle);
                SettingsAdvancedActivity.j(a);
                SettingsAdvancedActivity.k(a).setSummary(a.o.a(0x7f0c01a9, new Object[] {
                    bundle
                }));
                SettingsAdvancedActivity.e(a).setLocalText(0x7f0c01b1);
                SettingsAdvancedActivity.i(a).setLocalText(a.o.a(0x7f0c01b5, new Object[] {
                    bundle
                }));
                SettingsAdvancedActivity.h(a).setVisibility(0);
                SettingsAdvancedActivity.i(a).setVisibility(0);
            }
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonText(new int[] {
                0x7f0c014e
            });
            com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener(this) {

                    final _cls1 a;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                    }

            
            {
                a = _pcls1;
                super();
            }
                }
            });
        }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
    };
    private CheckBoxPreference y;
    private CheckBoxPreference z;

    public SettingsAdvancedActivity()
    {
    }

    static ProgressView a(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.K;
    }

    static LocaleTextView b(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.I;
    }

    static LocaleTextView c(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.J;
    }

    static b d(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.C;
    }

    static LocaleTextView e(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.G;
    }

    static View f(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.F;
    }

    static View g(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.E;
    }

    static View h(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.D;
    }

    static LocaleTextView i(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.H;
    }

    static void j(SettingsAdvancedActivity settingsadvancedactivity)
    {
        settingsadvancedactivity.r();
    }

    static CheckBoxPreference k(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.z;
    }

    static void l(SettingsAdvancedActivity settingsadvancedactivity)
    {
        settingsadvancedactivity.p();
    }

    static void m(SettingsAdvancedActivity settingsadvancedactivity)
    {
        settingsadvancedactivity.q();
    }

    static b n(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.A;
    }

    static CheckBoxPreference o(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.y;
    }

    private void o()
    {
        if (SharedPref.b(p, "key_virus_scan_strict_mode", false))
        {
            y.a(true);
            z.setEnabled(true);
            return;
        } else
        {
            y.a(false);
            z.setEnabled(false);
            return;
        }
    }

    static b p(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.B;
    }

    private void p()
    {
        if (A == null)
        {
            A = new b(this, 0x7f0c01aa, 0x7f0c01ab);
            A.setButtonText(new int[] {
                0x7f0c01ac, 0x7f0c014f
            });
            A.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final SettingsAdvancedActivity a;

                    public void onClick(View view)
                    {
                        SharedPref.a(a.p, "key_virus_scan_strict_mode", true);
                        SettingsAdvancedActivity.j(a);
                        SettingsAdvancedActivity.k(a).setEnabled(true);
                        Utils.dismissDialog(SettingsAdvancedActivity.n(a));
                    }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final SettingsAdvancedActivity a;

                    public void onClick(View view)
                    {
                        SettingsAdvancedActivity.o(a).a(false);
                        SettingsAdvancedActivity.k(a).setEnabled(false);
                        Utils.dismissDialog(SettingsAdvancedActivity.n(a));
                    }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
                }
            });
            A.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final SettingsAdvancedActivity a;

                public void onCancel(DialogInterface dialoginterface)
                {
                    SettingsAdvancedActivity.o(a).a(false);
                    SettingsAdvancedActivity.k(a).setEnabled(false);
                }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
            });
        }
        A.show();
    }

    private void q()
    {
        if (B == null)
        {
            B = new b(this, 0x7f0c01ad, 0x7f0c01ae);
            B.setButtonText(new int[] {
                0x7f0c01af, 0x7f0c014f
            });
            B.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final SettingsAdvancedActivity a;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(SettingsAdvancedActivity.p(a));
                        SettingsAdvancedActivity.q(a);
                        AveDBUpdateService.a(SettingsAdvancedActivity.r(a));
                    }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final SettingsAdvancedActivity a;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(SettingsAdvancedActivity.p(a));
                    }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
                }
            });
        }
        B.show();
    }

    static void q(SettingsAdvancedActivity settingsadvancedactivity)
    {
        settingsadvancedactivity.s();
    }

    static com.qihoo.security.v5.AveDBUpdateService.a r(SettingsAdvancedActivity settingsadvancedactivity)
    {
        return settingsadvancedactivity.L;
    }

    private void r()
    {
        String s1 = SharedPref.b(p, "key_virus_scan_strict_version");
        if (SharedPref.b(p, "key_virus_scan_strict_mode", false))
        {
            if (TextUtils.isEmpty(s1));
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new NullPointerException();
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return;
    }

    private void s()
    {
        if (C == null)
        {
            C = new b(this);
            C.setDialogTitle(0x7f0c01ad);
            C.a(0x7f0300af);
            D = C.findViewById(0x7f0b0247);
            E = C.findViewById(0x7f0b024a);
            F = C.findViewById(0x7f0b024e);
            G = (LocaleTextView)C.findViewById(0x7f0b0248);
            H = (LocaleTextView)C.findViewById(0x7f0b0249);
            I = (LocaleTextView)C.findViewById(0x7f0b024c);
            J = (LocaleTextView)C.findViewById(0x7f0b024d);
            K = (ProgressView)C.findViewById(0x7f0b024b);
            K.setAnimation(false);
        }
        C.setButtonText(new int[] {
            0x7f0c014f
        });
        C.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final SettingsAdvancedActivity a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a));
                }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
            }
        });
        D.setVisibility(8);
        E.setVisibility(8);
        F.setVisibility(0);
        C.show();
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c01a5));
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03008f);
        p = getApplicationContext();
        y = (CheckBoxPreference)findViewById(0x7f0b01d7);
        z = (CheckBoxPreference)findViewById(0x7f0b01d2);
        o();
        y.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsAdvancedActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    SettingsAdvancedActivity.l(a);
                    return;
                } else
                {
                    SharedPref.a(a.p, "key_virus_scan_strict_mode", false);
                    SettingsAdvancedActivity.j(a);
                    SettingsAdvancedActivity.k(a).setEnabled(false);
                    return;
                }
            }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
        });
        z.setOnClickListener(new android.view.View.OnClickListener() {

            final SettingsAdvancedActivity a;

            public void onClick(View view)
            {
                SettingsAdvancedActivity.m(a);
            }

            
            {
                a = SettingsAdvancedActivity.this;
                super();
            }
        });
        String s1 = SharedPref.b(p, "key_virus_scan_strict_version");
        bundle = s1;
        if (TextUtils.isEmpty(s1))
        {
            bundle = "1.0.0";
        }
        z.setSummary(o.a(0x7f0c01a9, new Object[] {
            bundle
        }));
    }
}
