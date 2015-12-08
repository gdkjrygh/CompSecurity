// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            BalanceHeader

final class this._cls0
    implements android.content.er.GooglePlusPhotoDialog._cls1
{

    final artActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/"));
        artActivity(dialoginterface);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
