// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig;
import com.spotify.mobile.android.ui.activity.upsell.ShowUpsellAction;
import com.spotify.mobile.android.ui.activity.upsell.UpsellService;
import java.lang.ref.WeakReference;

public final class frg extends BroadcastReceiver
{

    private final WeakReference a;

    public frg(UpsellService upsellservice)
    {
        a = new WeakReference(upsellservice);
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s;
        s = intent.getAction();
        context = (UpsellService)a.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 64
    //                   -112756061: 123
    //                   593581039: 108
    //                   910162665: 93;
           goto _L3 _L4 _L5 _L6
_L3:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            intent = intent.getSerializableExtra("payload");
            if (intent instanceof DynamicUpsellConfig)
            {
                UpsellService.a(context, (DynamicUpsellConfig)intent);
                return;
            }
            break;

        case 1: // '\001'
            UpsellService.a(context, ShowUpsellAction.a(intent), intent.getIntExtra("show_upsell_context_hash", 0), intent.getExtras().getString("source_class_name", "unknown source"));
            return;

        case 2: // '\002'
            UpsellService.a(context, ShowUpsellAction.a(intent), intent.getIntExtra("show_upsell_context_hash", 0), intent.getIntExtra("show_upsell_request_code", 0), intent.getIntExtra("show_upsell_fragment_hash", 0), intent.getExtras().getString("source_class_name", "unknown source"));
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (s.equals("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.INTENT_CONFIG_REFRESH_BROADCAST"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s.equals("show_upsell"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s.equals("show_upsell_for_result"))
        {
            byte0 = 2;
        }
          goto _L3
    }
}
