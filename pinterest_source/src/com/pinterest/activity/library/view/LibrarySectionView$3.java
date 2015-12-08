// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibrarySectionView

class this._cls0
    implements android.widget.ckListener
{

    final LibrarySectionView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (LibrarySectionView.access$000(LibrarySectionView.this) == null)
        {
            return;
        }
        view = "";
        InterestsFeed interestsfeed = LibrarySectionView.access$000(LibrarySectionView.this).getInterestsFeed();
        adapterview = view;
        if (interestsfeed != null)
        {
            adapterview = view;
            if (interestsfeed.get(i) != null)
            {
                adapterview = ((Interest)interestsfeed.get(i)).getName();
            }
        }
        view = new HashMap();
        view.put("library_topic_name", adapterview);
        adapterview = null;
        if (!LibrarySectionView.access$000(LibrarySectionView.this).getType().equals("pins")) goto _L2; else goto _L1
_L1:
        adapterview = new Navigation(Location.USER_LIBRARY_PINS, LibrarySectionView.access$100(LibrarySectionView.this));
        adapterview.putExtra("com.pinterest.EXTRA_FEED", LibrarySectionView.access$000(LibrarySectionView.this).getInterestsFeed());
        adapterview.putExtra("com.pinterest.EXTRA_TOPIC_INDEX", Integer.valueOf(i));
        Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, ComponentType.LIBRARY_PROFILE_ALL_PINS, view);
_L4:
        Events.post(adapterview);
        return;
_L2:
        if (LibrarySectionView.access$000(LibrarySectionView.this).getType().equals("board"))
        {
            LibrarySectionView.access$000(LibrarySectionView.this).getBoard().setInterestList(LibrarySectionView.access$000(LibrarySectionView.this).getInterestsFeed().getItems());
            adapterview = new Navigation(Location.BOARD, LibrarySectionView.access$000(LibrarySectionView.this).getBoard());
            adapterview.putExtra("com.pinterest.EXTRA_FEED", LibrarySectionView.access$000(LibrarySectionView.this).getInterestsFeed());
            adapterview.putExtra("com.pinterest.EXTRA_TOPIC_INDEX", Integer.valueOf(i));
            Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, ComponentType.LIBRARY_PROFILE_BOARD, view);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = LibrarySectionView.this;
        super();
    }
}
