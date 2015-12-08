// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.view.View;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.localytics.android.LocalyticsAmpSession;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            MoreActivity

class this._cls0
    implements android.view.tener
{

    final MoreActivity this$0;

    public void onClick(View view)
    {
        MoreActivity.access$100(MoreActivity.this).open();
        MoreActivity.access$100(MoreActivity.this).tagScreen("HH:Feedback");
        MoreActivity.access$100(MoreActivity.this).upload();
        MoreActivity.access$100(MoreActivity.this).tagEvent("detail:share");
        MoreActivity.access$200(MoreActivity.this).showFeedback();
    }

    on()
    {
        this$0 = MoreActivity.this;
        super();
    }
}
