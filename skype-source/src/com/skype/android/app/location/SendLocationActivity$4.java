// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.location.Location;
import android.view.View;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.LatLng;
import com.skype.Conversation;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

final class this._cls0
    implements android.view.ocationActivity._cls4
{

    final SendLocationActivity this$0;

    public final void onClick(View view)
    {
        if (SendLocationActivity.access$700(SendLocationActivity.this, SendLocationActivity.access$600(SendLocationActivity.this)))
        {
            view = SendLocationActivity.access$600(SendLocationActivity.this).getLatLng();
            float f = 0.0F;
            if (SendLocationActivity.access$400(SendLocationActivity.this))
            {
                f = SendLocationActivity.access$100(SendLocationActivity.this).e().getAccuracy() * 10F;
            }
            SendLocationActivity.access$1000(SendLocationActivity.this).postLocationMessage((int)(((LatLng) (view)).a * 1000000D), (int)(((LatLng) (view)).b * 1000000D), 0, (int)f, 0, 0, 0, (int)(System.currentTimeMillis() / 1000L), SendLocationActivity.access$800(SendLocationActivity.this, SendLocationActivity.access$600(SendLocationActivity.this), 1), "", SendLocationActivity.access$900(SendLocationActivity.this, SendLocationActivity.access$600(SendLocationActivity.this)));
            view = new SkypeTelemetryEvent(KpiEvent.b);
            view.put(KpiAttributeName.l, KpiAttributeValue.d);
            analytics.a(view);
            finish();
        }
    }

    dressRetrieverResult()
    {
        this$0 = SendLocationActivity.this;
        super();
    }
}
