// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.DialogInterface;
import android.widget.ImageButton;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            COFBusy

class this._cls0
    implements android.content.rface.OnShowListener
{

    final COFBusy this$0;

    public void onShow(DialogInterface dialoginterface)
    {
        COFBusy.access$400(COFBusy.this).setVisibility(4);
    }

    ()
    {
        this$0 = COFBusy.this;
        super();
    }
}
