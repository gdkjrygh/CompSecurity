// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

class this._cls0
    implements android.support.v4.widget.hListener
{

    final CommerceSettingsFragment this$0;

    public void onRefresh()
    {
        Pinalytics.a(EventType.PULL_TO_REFRESH, null);
        CommerceSettingsFragment.access$000(CommerceSettingsFragment.this);
    }

    ner()
    {
        this$0 = CommerceSettingsFragment.this;
        super();
    }
}
