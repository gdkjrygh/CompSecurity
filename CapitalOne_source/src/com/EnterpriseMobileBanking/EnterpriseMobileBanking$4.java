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
        Log.d(EnterpriseMobileBanking.access$100(), "User selected to close the application rather than disabling the required developer option.");
        dialoginterface = new Intent("android.intent.action.MAIN");
        dialoginterface.addCategory("android.intent.category.HOME");
        dialoginterface.setFlags(0x4000000);
        startActivity(dialoginterface);
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
