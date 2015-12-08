// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.DialogInterface;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            LocationManager

class this._cls0
    implements android.content.CancelListener
{

    final LocationManager this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        notifyPlayServiceFailed();
    }

    ()
    {
        this$0 = LocationManager.this;
        super();
    }
}
