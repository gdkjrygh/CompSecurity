// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;

public final class ErrorDialogActivity extends Activity
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
{

    private int mResultCode;

    public ErrorDialogActivity()
    {
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        setResult(0);
        finish();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        setResult(mResultCode);
        finish();
    }

    public final Dialog onCreateDialog(int i, Bundle bundle)
    {
        boolean flag3;
        boolean flag4;
        flag4 = false;
        flag3 = false;
        if (i != 1) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int j;
        i = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE", 0);
        s = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE_STR");
        j = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE", 0);
        s1 = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR");
        mResultCode = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
        bundle = (new android.app.AlertDialog.Builder(this)).setNeutralButton(0x104000a, this).setOnCancelListener(this);
        if (i == 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        bundle.setTitle(i);
_L9:
        if (j == 0) goto _L6; else goto _L5
_L5:
        flag = flag3;
        if (s1 == null)
        {
            flag = true;
        }
        Asserts.checkState(flag);
        bundle.setMessage(j);
_L7:
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
_L4:
        if (s != null)
        {
            boolean flag1;
            if (i == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            bundle.setTitle(s);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s1 != null)
        {
            boolean flag2 = flag4;
            if (j == 0)
            {
                flag2 = true;
            }
            Asserts.checkState(flag2);
            bundle.setMessage(s1);
        }
        if (true) goto _L7; else goto _L2
_L2:
        return null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final void onPause()
    {
        super.onPause();
        removeDialog(1);
    }

    protected final void onResume()
    {
        super.onResume();
        showDialog(1, getIntent().getExtras());
    }
}
