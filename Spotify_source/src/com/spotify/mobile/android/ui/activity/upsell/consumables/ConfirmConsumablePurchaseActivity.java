// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.consumables;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import ctz;
import dmz;
import dnr;
import fop;
import fou;
import frh;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell.consumables:
//            ConsumablePeriod, ConsumablePurchaseFailedActivity

public class ConfirmConsumablePurchaseActivity extends fou
{

    public ConfirmConsumablePurchaseActivity()
    {
    }

    public static Intent a(Context context, String s, int i, ConsumablePeriod consumableperiod)
    {
        ctz.a(context);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/upsell/consumables/ConfirmConsumablePurchaseActivity);
        context.putExtra("price", s);
        context.putExtra("amount", i);
        context.putExtra("period", consumableperiod.toString());
        return context;
    }

    static void a(ConfirmConsumablePurchaseActivity confirmconsumablepurchaseactivity)
    {
        confirmconsumablepurchaseactivity.g();
    }

    static void b(ConfirmConsumablePurchaseActivity confirmconsumablepurchaseactivity)
    {
        fop.a(confirmconsumablepurchaseactivity, new dnr("spotify-plus-consumable", "skip-limit-reached", String.valueOf(frh.b(confirmconsumablepurchaseactivity)), "confirm"));
    }

    static long f()
    {
        return (long)(250D + Math.random() * 500D);
    }

    private void g()
    {
        fop.a(this, new dnr("spotify-plus-consumable", "skip-limit-reached", null, "reject"));
    }

    public void onBackPressed()
    {
        g();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        dmz.a(fop);
        DialogLayout dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        bundle = getIntent().getStringExtra("price");
        int i = getIntent().getIntExtra("amount", 1);
        ConsumablePeriod consumableperiod = ConsumablePeriod.valueOf(getIntent().getStringExtra("period"));
        Resources resources = getResources();
        if (i == 1)
        {
            bundle = resources.getString(consumableperiod.mConfirmationOneId, new Object[] {
                bundle
            });
        } else
        {
            bundle = resources.getQuantityString(consumableperiod.mConfirmationId, i, new Object[] {
                Integer.valueOf(i), bundle
            });
        }
        dialoglayout.b(bundle);
        dialoglayout.b(0x7f08059f, new android.view.View.OnClickListener() {

            private ConfirmConsumablePurchaseActivity a;

            public final void onClick(View view)
            {
                ConfirmConsumablePurchaseActivity.a(a);
                a.finish();
            }

            
            {
                a = ConfirmConsumablePurchaseActivity.this;
                super();
            }
        });
        dialoglayout.a(0x7f0805a1, new android.view.View.OnClickListener() {

            final ConfirmConsumablePurchaseActivity a;

            public final void onClick(View view)
            {
                ConfirmConsumablePurchaseActivity.b(a);
                (new Handler()).postDelayed(new Runnable(this) {

                    private _cls2 a;

                    public final void run()
                    {
                        Intent intent = new Intent(a.a, com/spotify/mobile/android/ui/activity/upsell/consumables/ConsumablePurchaseFailedActivity);
                        a.a.startActivity(intent);
                        a.a.finish();
                    }

            
            {
                a = _pcls2;
                super();
            }
                }, ConfirmConsumablePurchaseActivity.f());
            }

            
            {
                a = ConfirmConsumablePurchaseActivity.this;
                super();
            }
        });
        setFinishOnTouchOutside(false);
    }
}
