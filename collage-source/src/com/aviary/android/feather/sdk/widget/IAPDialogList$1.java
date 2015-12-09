// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            IAPDialogList, f

class a extends BroadcastReceiver
{

    final IAPDialogList a;

    public void onReceive(Context context, Intent intent)
    {
        IAPDialogList.a.a("downloadMissingPacksCompletedReceiver");
        int i;
        if (context != null && intent != null)
        {
            context = intent.getStringExtra("packType");
            i = intent.getIntExtra("error", 0);
            break MISSING_BLOCK_LABEL_33;
        }
        do
        {
            return;
        } while (!a.c() || context == null || IAPDialogList.a(a) == null || IAPDialogList.a(a).a() == null || !context.equals(IAPDialogList.a(a).a().a()));
        a.a(i, IAPDialogList.b(a).c);
    }

    (IAPDialogList iapdialoglist)
    {
        a = iapdialoglist;
        super();
    }
}
