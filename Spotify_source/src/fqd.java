// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService;

public final class fqd extends BroadcastReceiver
{

    private final DynamicUpsellDataStoreControlService a;

    public fqd(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice)
    {
        a = dynamicupselldatastorecontrolservice;
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = intent.getSerializableExtra("action");
        if (!(context instanceof com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.Operation)) goto _L2; else goto _L1
_L1:
        context = (com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.Operation)context;
        com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService._cls2.a[context.ordinal()];
        JVM INSTR tableswitch 1 1: default 44
    //                   1 45;
           goto _L2 _L3
_L2:
        return;
_L3:
        context = (com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup)intent.getSerializableExtra("reason");
        DynamicUpsellDataStoreControlService.a(a, context);
        return;
    }
}
