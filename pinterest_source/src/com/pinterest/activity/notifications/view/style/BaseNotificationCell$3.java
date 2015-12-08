// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.BlackClickSpan;

// Referenced classes of package com.pinterest.activity.notifications.view.style:
//            BaseNotificationCell

class val.location extends BlackClickSpan
{

    final BaseNotificationCell this$0;
    final Location val$location;
    final ElementType val$type;
    final String val$uid;

    public void onClick(View view)
    {
        super.onClick(view);
        Pinalytics.a(val$type, ComponentType.NEWS_FEED, val$uid);
        Events.post(new Navigation(val$location, val$uid));
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setTypeface(Typeface.DEFAULT_BOLD);
    }

    ()
    {
        this$0 = final_basenotificationcell;
        val$type = elementtype;
        val$uid = s;
        val$location = Location.this;
        super();
    }
}
