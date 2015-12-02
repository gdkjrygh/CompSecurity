// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateDownloadUIService, c

public class MobileConnectWarningDialog extends AbsDialogActivity
{

    private boolean c;
    private boolean d;
    private int e;

    public MobileConnectWarningDialog()
    {
    }

    static Context a(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.a;
    }

    static boolean b(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.c;
    }

    static boolean c(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.d;
    }

    static int d(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.e;
    }

    static Context e(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.a;
    }

    static Context f(MobileConnectWarningDialog mobileconnectwarningdialog)
    {
        return mobileconnectwarningdialog.a;
    }

    protected View a()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setDialogTitle(0x7f0c017f);
        setDialogMessage(0x7f0c01bb);
        setButtonText(new int[] {
            0x7f0c01cd, 0x7f0c014f
        });
        c = getIntent().getBooleanExtra("uiforce", false);
        d = getIntent().getBooleanExtra("ispatch", false);
        e = getIntent().getIntExtra("type", 0);
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final MobileConnectWarningDialog a;

                public void onClick(View view)
                {
                    view = new Intent(com.qihoo.security.v5.MobileConnectWarningDialog.a(a), com/qihoo/security/v5/UpdateDownloadUIService);
                    view.putExtra("uiforce", MobileConnectWarningDialog.b(a));
                    view.putExtra("ispatch", MobileConnectWarningDialog.c(a));
                    view.putExtra("type", MobileConnectWarningDialog.d(a));
                    a.startService(view);
                    a.finish();
                }

            
            {
                a = MobileConnectWarningDialog.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final MobileConnectWarningDialog a;

                public void onClick(View view)
                {
                    com.qihoo.security.v5.c.a(MobileConnectWarningDialog.e(a));
                    if (MobileConnectWarningDialog.b(a))
                    {
                        com.qihoo360.mobilesafe.b.a.e(MobileConnectWarningDialog.f(a));
                    }
                    a.finish();
                }

            
            {
                a = MobileConnectWarningDialog.this;
                super();
            }
            }
        });
    }
}
