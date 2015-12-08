// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.pandora.android.iap.c;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import p.cc.e;

// Referenced classes of package com.pandora.android.activity:
//            PandoraDialogActivity

private class c extends c
{

    final PandoraDialogActivity b;
    private Intent c;

    static Intent a(c c1)
    {
        return c1.c;
    }

    protected AlertDialog a(Activity activity)
    {
        String s = String.format(activity.getString(0x7f080204), new Object[] {
            b.a.d().c()
        });
        return a(this, activity, new android.content.DialogInterface.OnClickListener() {

            final PandoraDialogActivity.b a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (com.pandora.android.util.s.m())
                {
                    com.pandora.android.iap.d.d.a().e().a(PandoraDialogActivity.b.a(a).getStringExtra("AMAZON_PURCHASE_USER"), PandoraDialogActivity.b.a(a).getStringExtra("AMAZON_PURCHASE_TOKEN"), PandoraDialogActivity.b.a(a).getStringExtra("AMAZON_PURCHASE_SKU"));
                } else
                {
                    e e1 = new e(null, PandoraDialogActivity.b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_TOKEN"), PandoraDialogActivity.b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ORDER_ID"), PandoraDialogActivity.b.a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ITEM"), null);
                    com.pandora.android.iap.d.d.a().d().b(e1);
                }
                dialoginterface.cancel();
            }

            
            {
                a = PandoraDialogActivity.b.this;
                super();
            }
        }, 0x7f080201, new android.content.DialogInterface.OnClickListener() {

            final PandoraDialogActivity.b a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                a = PandoraDialogActivity.b.this;
                super();
            }
        }, 0x7f0800c3, true, s);
    }

    public _cls2.a(PandoraDialogActivity pandoradialogactivity, Intent intent)
    {
        b = pandoradialogactivity;
        super(pandoradialogactivity, null);
        c = intent;
    }
}
