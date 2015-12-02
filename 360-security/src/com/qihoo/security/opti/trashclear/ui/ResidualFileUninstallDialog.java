// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo.security.opti.trashclear.service.ResidualFileInfo;
import com.qihoo.security.opti.trashclear.service.d;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.service.a;
import com.qihoo.security.v5.UpdatedDialog;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ResidualFileUninstallDialog extends AbsDialogActivity
{

    private Context c;
    private d d;
    private boolean e;
    private a f;
    private boolean g;
    private List h;
    private ResidualFileInfo i;
    private long j;
    private String k;
    private final ServiceConnection l = new ServiceConnection() {

        final ResidualFileUninstallDialog a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a, com.qihoo.security.opti.trashclear.service.d.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a, null);
        }

            
            {
                a = ResidualFileUninstallDialog.this;
                super();
            }
    };
    private final ServiceConnection m = new ServiceConnection() {

        final ResidualFileUninstallDialog a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a, com.qihoo.security.service.a.a.a(ibinder));
            if (ResidualFileUninstallDialog.c(a) == null)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            ResidualFileUninstallDialog.c(a).a(com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.d(a));
            return;
            componentname;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a, null);
        }

            
            {
                a = ResidualFileUninstallDialog.this;
                super();
            }
    };
    private final com.qihoo.security.service.c.a n = new com.qihoo.security.service.c.a() {

        final ResidualFileUninstallDialog a;

        public void a(boolean flag, boolean flag1, boolean flag2, String s)
            throws RemoteException
        {
            if (flag)
            {
                a.finish();
            }
        }

            
            {
                a = ResidualFileUninstallDialog.this;
                super();
            }
    };

    public ResidualFileUninstallDialog()
    {
        e = false;
        g = true;
        j = 0L;
        k = "";
    }

    static d a(ResidualFileUninstallDialog residualfileuninstalldialog)
    {
        return residualfileuninstalldialog.d;
    }

    static d a(ResidualFileUninstallDialog residualfileuninstalldialog, d d1)
    {
        residualfileuninstalldialog.d = d1;
        return d1;
    }

    static a a(ResidualFileUninstallDialog residualfileuninstalldialog, a a1)
    {
        residualfileuninstalldialog.f = a1;
        return a1;
    }

    static boolean a(ResidualFileUninstallDialog residualfileuninstalldialog, boolean flag)
    {
        residualfileuninstalldialog.e = flag;
        return flag;
    }

    static List b(ResidualFileUninstallDialog residualfileuninstalldialog)
    {
        return residualfileuninstalldialog.h;
    }

    static a c(ResidualFileUninstallDialog residualfileuninstalldialog)
    {
        return residualfileuninstalldialog.f;
    }

    private void c()
    {
        a(0x7f0200cf);
        setDialogTitle(0x7f0c01d3);
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final ResidualFileUninstallDialog a;

                public void onClick(View view)
                {
                    if (com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a) != null)
                    {
                        try
                        {
                            com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a).a(ResidualFileUninstallDialog.b(a));
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view) { }
                    }
                    com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog.a(a, true);
                    a.finish();
                }

            
            {
                a = ResidualFileUninstallDialog.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final ResidualFileUninstallDialog a;

                public void onClick(View view)
                {
                    a.finish();
                }

            
            {
                a = ResidualFileUninstallDialog.this;
                super();
            }
            }
        });
    }

    static com.qihoo.security.service.c.a d(ResidualFileUninstallDialog residualfileuninstalldialog)
    {
        return residualfileuninstalldialog.n;
    }

    private void d()
    {
        Utils.bindService(c, com/qihoo/security/service/SecurityService, "com.qihoo.security.ACTION_SERVICE_RESIDUAL_FILE", l, 1);
        Utils.bindService(c, com/qihoo/security/service/SecurityService, "com.qihoo.security.service.INTERNAL_CONTROL", m, 1);
    }

    private void e()
    {
        String s = SharedPref.b(c, "skfutv");
        if (s != null && Utils.compareVersion(s, "1.0.8.3742") > 0)
        {
            Bundle bundle = r.a((new File(getFilesDir(), "v3/saved/info")).getAbsolutePath());
            if (bundle != null && "1".equals(bundle.getString("force")))
            {
                bundle.putBoolean("uiforce", true);
                Intent intent = new Intent(c, com/qihoo/security/v5/UpdatedDialog);
                intent.addFlags(0x10000000);
                intent.putExtras(bundle);
                c.startActivity(intent);
                finish();
            }
        }
    }

    protected View a()
    {
        return null;
    }

    public void finish()
    {
        if (!e && d != null)
        {
            try
            {
                d.a();
            }
            catch (Exception exception) { }
        }
        super.finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = getApplicationContext();
        e();
        h = new ArrayList();
        if (getIntent() == null)
        {
            return;
        } else
        {
            c();
            d();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        try
        {
            if (f != null)
            {
                f.b(n);
            }
        }
        catch (Exception exception) { }
        Utils.unbindService("ResidualFileUninstallDialog", c, l);
        Utils.unbindService("ResidualFileUninstallDialog", c, m);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        g = true;
        setIntent(intent);
    }

    protected void onResume()
    {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null)
        {
            if (g)
            {
                g = false;
                i = (ResidualFileInfo)intent.getParcelableExtra("uninstalled_app_info");
                if (i != null && i.fileSize > 0L)
                {
                    h.add(i);
                    if (h.size() == 1)
                    {
                        k = i.appName;
                    } else
                    {
                        k = "";
                    }
                    j = j + i.fileSize;
                }
            }
            if (j <= 0L)
            {
                finish();
            } else
            if (TextUtils.isEmpty(k))
            {
                setDialogMessage(r.a(c, 0x7f0c0227, 0x7f080031, new String[] {
                    Utils.getHumanReadableSizeMore(j)
                }));
            } else
            {
                setDialogMessage(r.a(c, 0x7f0c0226, 0x7f080031, new String[] {
                    k, Utils.getHumanReadableSizeMore(j)
                }));
            }
        }
        setButtonText(new int[] {
            0x7f0c014e, 0x7f0c014f
        });
    }
}
