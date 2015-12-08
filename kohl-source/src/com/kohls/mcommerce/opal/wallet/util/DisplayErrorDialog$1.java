// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            DisplayErrorDialog

class this._cls0
    implements android.content.ckListener
{

    final DisplayErrorDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        finish();
    }

    ()
    {
        this$0 = DisplayErrorDialog.this;
        super();
    }
}
