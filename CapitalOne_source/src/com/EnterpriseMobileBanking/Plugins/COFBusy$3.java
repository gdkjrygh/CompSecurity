// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.DialogInterface;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            COFBusy, BusyIndicatorCallback

class this._cls0
    implements android.content.rface.OnDismissListener
{

    final COFBusy this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        Log.d("COFBusy", "Cancelled dialog...");
        COFBusy.access$102(COFBusy.this, true);
        if (COFBusy.access$200(COFBusy.this) != null)
        {
            COFBusy.access$200(COFBusy.this).callbackCall();
        }
    }

    torCallback()
    {
        this$0 = COFBusy.this;
        super();
    }
}
