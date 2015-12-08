// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.consumables;

import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import fou;
import frh;

public class ConsumablePurchaseFailedActivity extends fou
{

    public ConsumablePurchaseFailedActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        DialogLayout dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        dialoglayout.a(0x7f0801f3);
        dialoglayout.c(0x7f0801f2);
        dialoglayout.b(0x7f0805a1, new android.view.View.OnClickListener() {

            private ConsumablePurchaseFailedActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ConsumablePurchaseFailedActivity.this;
                super();
            }
        });
        if (bundle == null)
        {
            frh.a(this);
        }
    }
}
