// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Intent;
import android.view.View;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePromotionActivity

final class this._cls0
    implements android.view.onActivity._cls2
{

    final VideoMessagePromotionActivity this$0;

    public final void onClick(View view)
    {
        analytics.c(AnalyticsEvent.J);
        view = new Intent();
        setResult(0, view);
        finish();
    }

    ()
    {
        this$0 = VideoMessagePromotionActivity.this;
        super();
    }
}
