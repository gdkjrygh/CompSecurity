// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.consumables;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell.consumables:
//            ConsumablePurchaseFailedActivity, ConfirmConsumablePurchaseActivity

final class a
    implements Runnable
{

    private sh a;

    public final void run()
    {
        Intent intent = new Intent(a.a, com/spotify/mobile/android/ui/activity/upsell/consumables/ConsumablePurchaseFailedActivity);
        a.a.startActivity(intent);
        a.a.finish();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/ui/activity/upsell/consumables/ConfirmConsumablePurchaseActivity$2

/* anonymous class */
    final class ConfirmConsumablePurchaseActivity._cls2
        implements android.view.View.OnClickListener
    {

        final ConfirmConsumablePurchaseActivity a;

        public final void onClick(View view)
        {
            ConfirmConsumablePurchaseActivity.b(a);
            (new Handler()).postDelayed(new ConfirmConsumablePurchaseActivity._cls2._cls1(this), ConfirmConsumablePurchaseActivity.f());
        }

            
            {
                a = confirmconsumablepurchaseactivity;
                super();
            }
    }

}
