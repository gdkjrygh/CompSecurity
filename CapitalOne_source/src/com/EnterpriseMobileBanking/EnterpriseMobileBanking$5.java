// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.DialogInterface;
import android.content.Intent;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0
    implements android.content.tener
{

    final EnterpriseMobileBanking this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.d(EnterpriseMobileBanking.access$100(), "Taking user to developer settings page.");
        dialoginterface = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        dialoginterface.setFlags(0x40000000);
        startActivity(dialoginterface);
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
