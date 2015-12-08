// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.AlertDialog;
import android.view.View;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            COFBusy, BusyIndicatorCallback

class this._cls0
    implements android.view.ckListener
{

    final COFBusy this$0;

    public void onClick(View view)
    {
        Log.d("COFBusy", "setOnClickListener called...");
        if (COFBusy.access$200(COFBusy.this) != null)
        {
            COFBusy.access$200(COFBusy.this).callbackCall();
        }
        COFBusy.access$300(COFBusy.this).dismiss();
        COFBusy.access$102(COFBusy.this, true);
    }

    torCallback()
    {
        this$0 = COFBusy.this;
        super();
    }
}
