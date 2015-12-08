// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.view.View;

// Referenced classes of package com.pinterest.ui.notify:
//            PinterestDialog

class tener
    implements android.view.er
{

    final PinterestDialog this$0;
    final android.content.ClickListener val$listener;

    public void onClick(View view)
    {
        if (val$listener != null)
        {
            val$listener.onClick(PinterestDialog.this, 0);
            return;
        } else
        {
            PinterestDialog.access$000(PinterestDialog.this).onClick(PinterestDialog.this, 0);
            return;
        }
    }

    tener()
    {
        this$0 = final_pinterestdialog;
        val$listener = android.content.ClickListener.this;
        super();
    }
}
