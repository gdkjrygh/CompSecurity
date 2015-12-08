// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import android.content.DialogInterface;

// Referenced classes of package com.google.zxing.client.android.history:
//            HistoryActivity, HistoryManager

class this._cls0
    implements android.content.ClickListener
{

    final HistoryActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        HistoryActivity.access$0(HistoryActivity.this).clearHistory();
        dialoginterface.dismiss();
        finish();
    }

    ()
    {
        this$0 = HistoryActivity.this;
        super();
    }
}
