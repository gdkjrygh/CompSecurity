// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareFragment

class this._cls0
    implements emClickListener
{

    final SendShareFragment this$0;

    public void onItemClick(TypeAheadItem typeaheaditem, int i)
    {
        if (typeaheaditem.getItemType() == com.pinterest.activity.search.model.pe.SEARCH_PLACEHOLDER)
        {
            SendShareFragment.access$400(SendShareFragment.this);
            return;
        } else
        {
            Events.post(new SendEvent(typeaheaditem));
            Pinalytics.a(ElementType.SUGGESTED_CONTACT_LIST_ITEM, ComponentType.SEND_SHARE, String.valueOf(i));
            return;
        }
    }

    mType()
    {
        this$0 = SendShareFragment.this;
        super();
    }
}
