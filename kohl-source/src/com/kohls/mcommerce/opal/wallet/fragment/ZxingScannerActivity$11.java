// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity

class val.editText
    implements android.content.istener
{

    final ZxingScannerActivity this$0;
    final String val$barCode;
    final EditText val$editText;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        (new kupBarcodeAsyncTask(ZxingScannerActivity.this)).execute(new String[] {
            val$barCode, val$editText.getText().toString()
        });
    }

    kupBarcodeAsyncTask()
    {
        this$0 = final_zxingscanneractivity;
        val$barCode = s;
        val$editText = EditText.this;
        super();
    }
}
