// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.ui;

import android.content.DialogInterface;

// Referenced classes of package com.worklight.wlclient.ui:
//            UIActivity

class val.downloadLink
    implements android.content.ce.OnClickListener
{

    final UIActivity this$0;
    final String val$downloadLink;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        UIActivity.access$000(UIActivity.this, val$downloadLink);
        finish();
    }

    Listener()
    {
        this$0 = final_uiactivity;
        val$downloadLink = String.this;
        super();
    }
}
