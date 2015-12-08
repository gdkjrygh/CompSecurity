// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi:
//            RateDialog

class this._cls0
    implements android.view.istener
{

    final RateDialog this$0;

    public void onClick(View view)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=air.com.nbcuni.com.nbcsports.liveextra")));
        dismiss();
    }

    ()
    {
        this$0 = RateDialog.this;
        super();
    }
}
