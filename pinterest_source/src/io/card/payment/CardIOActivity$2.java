// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Window;

// Referenced classes of package io.card.payment:
//            CardIOActivity, DataEntryActivity, Util, OverlayView

class val.origIntent
    implements Runnable
{

    final CardIOActivity this$0;
    final Intent val$origIntent;

    public void run()
    {
        Log.d(CardIOActivity.access$100(), "post(Runnable)");
        getWindow().clearFlags(1024);
        getWindow().addFlags(512);
        Intent intent = new Intent(CardIOActivity.this, io/card/payment/DataEntryActivity);
        Util.writeCapturedCardImageIfNecessary(val$origIntent, intent, CardIOActivity.access$200(CardIOActivity.this));
        if (CardIOActivity.access$200(CardIOActivity.this) != null)
        {
            CardIOActivity.access$200(CardIOActivity.this).markupCard();
            if (CardIOActivity.markedCardImage != null && !CardIOActivity.markedCardImage.isRecycled())
            {
                CardIOActivity.markedCardImage.recycle();
            }
            CardIOActivity.markedCardImage = CardIOActivity.access$200(CardIOActivity.this).getCardImage();
        }
        if (CardIOActivity.access$300(CardIOActivity.this) != null)
        {
            intent.putExtra("io.card.payment.scanResult", CardIOActivity.access$300(CardIOActivity.this));
            CardIOActivity.access$302(CardIOActivity.this, null);
        } else
        {
            intent.putExtra("io.card.payment.manualEntryScanResult", true);
        }
        intent.putExtras(getIntent());
        intent.addFlags(0x40810000);
        startActivityForResult(intent, 10);
    }

    ()
    {
        this$0 = final_cardioactivity;
        val$origIntent = Intent.this;
        super();
    }
}
