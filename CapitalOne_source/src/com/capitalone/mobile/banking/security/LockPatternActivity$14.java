// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

class this._cls0
    implements android.content.Listener
{

    final LockPatternActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse("tel:8667500873"));
        startActivity(dialoginterface);
    }

    ()
    {
        this$0 = LockPatternActivity.this;
        super();
    }
}
