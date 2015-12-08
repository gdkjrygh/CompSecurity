// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class val.dialog
    implements android.view.
{

    final MainBookActivity this$0;
    private final AlertDialog val$dialog;
    private final android.content.itor val$editor;

    public void onClick(View view)
    {
        val$editor.commit();
        val$dialog.dismiss();
    }

    ()
    {
        this$0 = final_mainbookactivity;
        val$editor = itor;
        val$dialog = AlertDialog.this;
        super();
    }
}
