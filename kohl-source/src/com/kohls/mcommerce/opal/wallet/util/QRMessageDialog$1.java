// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            QRMessageDialog

class this._cls0
    implements android.content.ClickListener
{

    final QRMessageDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = QRMessageDialog.this;
        super();
    }
}
