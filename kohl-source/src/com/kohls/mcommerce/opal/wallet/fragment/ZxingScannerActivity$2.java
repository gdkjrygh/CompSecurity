// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity

class this._cls0
    implements android.content.Listener
{

    final ZxingScannerActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        finish();
    }

    ()
    {
        this$0 = ZxingScannerActivity.this;
        super();
    }
}
