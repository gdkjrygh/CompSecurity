// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0
    implements android.view.er
{

    final LibraryFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SEARCH_BUTTON, ComponentType.NAVIGATION);
        view = new Navigation(Location.SEARCH);
        view.putExtra("com.pinterest.EXTRA_SEARCH_MODE", "VALUE_SEARCH_LIBRARY");
        Events.post(view);
    }

    ()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
