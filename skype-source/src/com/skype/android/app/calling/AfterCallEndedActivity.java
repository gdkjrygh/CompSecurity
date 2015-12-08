// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.account.BuyCreditDialog;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants

public class AfterCallEndedActivity extends SkypeActivity
    implements CallConstants
{

    private android.content.DialogInterface.OnDismissListener dismissListener;

    public AfterCallEndedActivity()
    {
        dismissListener = new android.content.DialogInterface.OnDismissListener() {

            final AfterCallEndedActivity this$0;

            public final void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = AfterCallEndedActivity.this;
                super();
            }
        };
    }

    private void showFragment(Bundle bundle)
    {
        if (bundle.getBoolean("extraCallEndedNoSkypeCredit", false))
        {
            bundle = new BuyCreditDialog();
            bundle.setOnDismissListener(dismissListener);
            bundle.show(getSupportFragmentManager());
            return;
        }
        if (bundle.getBoolean("extraCallEndedInvalidNumber", false))
        {
            bundle = InfoDialogFragment.create(getString(0x7f080252), getString(0x7f0803e1), getString(0x7f0802f6));
            bundle.setOnDismissListener(dismissListener);
            bundle.show(getSupportFragmentManager());
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        showFragment(getIntent().getExtras());
    }
}
