// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.components;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.kohls.mcommerce.opal.common.ui.components:
//            UpgradeDialog

class this._cls0
    implements android.content.OnKeyListener
{

    final UpgradeDialog this$0;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (UpgradeDialog.access$400(UpgradeDialog.this))
        {
            return true;
        }
        if (i == 4)
        {
            UpgradeDialog.access$300(UpgradeDialog.this);
        }
        return false;
    }

    ()
    {
        this$0 = UpgradeDialog.this;
        super();
    }
}
