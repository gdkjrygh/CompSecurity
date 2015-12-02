// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsAdvancedActivity

class a
    implements com.qihoo.security.v5.tivity._cls1
{

    final SettingsAdvancedActivity a;
    private boolean b;

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        long l = bundle.getLong("current", 0L);
        long l1 = bundle.getLong("total", 0L);
        float f2 = 0.0F;
        float f1 = f2;
        if (l1 > 0L)
        {
            f1 = f2;
            if (l <= l1)
            {
                f1 = (float)l / (float)l1;
            }
        }
        SettingsAdvancedActivity.a(a).setProgress(f1);
        com.qihoo.security.ui.settings.SettingsAdvancedActivity.b(a).setLocalText(Utils.getHumanReadableSizeNoFraction(l));
        SettingsAdvancedActivity.c(a).setLocalText(Utils.getHumanReadableSizeNoFraction(l1));
        com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonText(new int[] {
            0x7f0c014f
        });
        com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.lickListener[] {
            new android.view.View.OnClickListener() {

                final SettingsAdvancedActivity._cls1 a;

                public void onClick(View view)
                {
                    AveDBUpdateService.a();
                    Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                }

            
            {
                a = SettingsAdvancedActivity._cls1.this;
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
    //                   -1 143;
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
        com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.lickListener[] {
            new android.view.View.OnClickListener() {

                final SettingsAdvancedActivity._cls1 a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                }

            
            {
                a = SettingsAdvancedActivity._cls1.this;
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
        com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a).setButtonOnClickListener(new android.view.lickListener[] {
            new android.view.View.OnClickListener() {

                final SettingsAdvancedActivity._cls1 a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(com.qihoo.security.ui.settings.SettingsAdvancedActivity.d(a.a));
                }

            
            {
                a = SettingsAdvancedActivity._cls1.this;
                super();
            }
            }
        });
    }

    _cls3.a(SettingsAdvancedActivity settingsadvancedactivity)
    {
        a = settingsadvancedactivity;
        super();
    }
}
