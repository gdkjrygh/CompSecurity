// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

class this._cls0
    implements android.content.OnClickListener
{

    final ResultHandler this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        launchIntent(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.shopper&referrer=utm_source%3Dbarcodescanner%26utm_medium%3Dapps%26utm_campaign%3Dscan")));
    }

    ()
    {
        this$0 = ResultHandler.this;
        super();
    }
}
