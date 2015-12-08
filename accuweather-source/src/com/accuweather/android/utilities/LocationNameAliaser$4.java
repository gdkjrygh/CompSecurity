// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.DialogInterface;

// Referenced classes of package com.accuweather.android.utilities:
//            LocationNameAliaser

class this._cls0
    implements android.content.elListener
{

    final LocationNameAliaser this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = LocationNameAliaser.this;
        super();
    }
}
