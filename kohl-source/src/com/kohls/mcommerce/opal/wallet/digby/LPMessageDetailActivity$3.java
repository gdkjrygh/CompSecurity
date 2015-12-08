// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.digby:
//            LPMessageDetailActivity

class val.editText
    implements android.content.tener
{

    final LPMessageDetailActivity this$0;
    final String val$barCode;
    final EditText val$editText;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        (new okupBarcodeAsyncTask(LPMessageDetailActivity.this)).execute(new String[] {
            val$barCode, val$editText.getText().toString()
        });
    }

    okupBarcodeAsyncTask()
    {
        this$0 = final_lpmessagedetailactivity;
        val$barCode = s;
        val$editText = EditText.this;
        super();
    }
}
