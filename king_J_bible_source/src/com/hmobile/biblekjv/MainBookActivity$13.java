// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlertDialog;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class val.dialog
    implements android.view.
{

    final MainBookActivity this$0;
    private final AlertDialog val$dialog;
    private final EditText val$edtText;

    public void onClick(View view)
    {
        view = val$edtText.getText().toString();
        if (view.length() > 1)
        {
            signInWithFb(bookname, view, false);
            Reset();
            val$dialog.dismiss();
        }
    }

    ()
    {
        this$0 = final_mainbookactivity;
        val$edtText = edittext;
        val$dialog = AlertDialog.this;
        super();
    }
}
