// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.DialogInterface;

// Referenced classes of package com.worklight.androidgap:
//            WLDroidGap

class this._cls0
    implements android.content.ce.OnClickListener
{

    final WLDroidGap this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        System.exit(0);
    }

    kListener()
    {
        this$0 = WLDroidGap.this;
        super();
    }
}
