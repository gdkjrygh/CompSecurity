// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.adapter:
//            PeopleListAdapter

class this._cls0
    implements android.widget.ickListener
{

    final PeopleListAdapter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (User)adapterview.getItemAtPosition(i);
        if (adapterview == null)
        {
            return;
        } else
        {
            adapterview = adapterview.getUid();
            Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, adapterview);
            Events.post(new Navigation(Location.USER, adapterview));
            return;
        }
    }

    ()
    {
        this$0 = PeopleListAdapter.this;
        super();
    }
}
