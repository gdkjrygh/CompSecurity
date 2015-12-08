// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.skype.android.SkypeDialogFragment;

// Referenced classes of package com.skype.android.app.calling:
//            TurnOffAirplaneModeDialog, ConnectionRequiredDialog

public class ConnectionDialogTransparentHostActivity extends ActionBarActivity
    implements android.content.DialogInterface.OnDismissListener
{

    public static final String EXTRA_AIRPLANE_MODE = "EXTRA_AIRPLANE_MODE";
    public static final String EXTRA_DIALOG_MESSAGE = "EXTRA_DIALOG_MESSAGE";
    public static final String EXTRA_DIALOG_TITLE = "EXTRA_DIALOG_TITLE";

    public ConnectionDialogTransparentHostActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            boolean flag = getIntent().getBooleanExtra("EXTRA_AIRPLANE_MODE", false);
            int i = getIntent().getIntExtra("EXTRA_DIALOG_TITLE", 0x7f080260);
            int j = getIntent().getIntExtra("EXTRA_DIALOG_MESSAGE", 0x7f0803fc);
            if (flag)
            {
                bundle = TurnOffAirplaneModeDialog.create(getString(i), getString(j), getString(0x7f080128), getString(0x7f080188));
            } else
            {
                bundle = ConnectionRequiredDialog.create(getString(i), getString(j), getString(0x7f080128), getString(0x7f080188));
            }
            bundle.show(getSupportFragmentManager());
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        finish();
        overridePendingTransition(0, 0);
    }
}
