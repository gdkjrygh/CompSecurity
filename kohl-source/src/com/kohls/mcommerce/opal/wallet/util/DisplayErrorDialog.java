// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class DisplayErrorDialog extends Activity
{

    public DisplayErrorDialog()
    {
    }

    private void displayDialog(CharSequence charsequence)
    {
        charsequence = (new android.app.AlertDialog.Builder(this)).setTitle("Kohl's").setMessage(charsequence).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final DisplayErrorDialog this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                finish();
            }

            
            {
                this$0 = DisplayErrorDialog.this;
                super();
            }
        }).create();
        charsequence.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final DisplayErrorDialog this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = DisplayErrorDialog.this;
                super();
            }
        });
        charsequence.show();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        displayDialog(getIntent().getCharSequenceExtra("ServerError"));
    }
}
