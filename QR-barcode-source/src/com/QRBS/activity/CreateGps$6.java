// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.QRBS.activity:
//            CreateGps

class this._cls0
    implements android.content.ace.OnClickListener
{

    final CreateGps this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        startActivity(dialoginterface);
    }

    e()
    {
        this$0 = CreateGps.this;
        super();
    }
}
