// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            AccountActivity

class this._cls0
    implements android.content.ClickListener
{

    final AccountActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startScan(1002);
        }
    }

    ()
    {
        this$0 = AccountActivity.this;
        super();
    }
}
