// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.DialogInterface;
import android.content.Intent;
import com.pandora.android.iap.b;
import com.pandora.android.iap.c;
import com.pandora.android.iap.d;
import com.pandora.android.util.s;
import p.cc.e;

// Referenced classes of package com.pandora.android.activity:
//            PandoraDialogActivity

class a
    implements android.content.tener
{

    final a a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (s.m())
        {
            com.pandora.android.iap..b().e().a(a(a).getStringExtra("AMAZON_PURCHASE_USER"), a(a).getStringExtra("AMAZON_PURCHASE_TOKEN"), a(a).getStringExtra("AMAZON_PURCHASE_SKU"));
        } else
        {
            e e1 = new e(null, a(a).getStringExtra("GOOGLEPLAY_PURCHASE_TOKEN"), a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ORDER_ID"), a(a).getStringExtra("GOOGLEPLAY_PURCHASE_ITEM"), null);
            com.pandora.android.iap..b._cls1.a().d().b(e1);
        }
        dialoginterface.cancel();
    }

    ( )
    {
        a = ;
        super();
    }
}
