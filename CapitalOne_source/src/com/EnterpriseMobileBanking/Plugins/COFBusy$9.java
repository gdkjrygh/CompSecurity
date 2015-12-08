// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.widget.ImageButton;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            COFBusy

class this._cls0
    implements Runnable
{

    final COFBusy this$0;

    public void run()
    {
        if (COFBusy.access$300(COFBusy.this) != null)
        {
            COFBusy.access$400(COFBusy.this).setVisibility(0);
        }
    }

    ()
    {
        this$0 = COFBusy.this;
        super();
    }
}
