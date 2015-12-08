// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.components;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.common.ui.components:
//            UpgradeDialog

class this._cls0
    implements android.content.OnClickListener
{

    final UpgradeDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((Activity)UpgradeDialog.access$200(UpgradeDialog.this)).finish();
    }

    ()
    {
        this$0 = UpgradeDialog.this;
        super();
    }
}
