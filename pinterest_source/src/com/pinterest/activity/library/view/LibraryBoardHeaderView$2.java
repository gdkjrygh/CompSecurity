// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.TopicAnnotationCell;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardHeaderView

class this._cls0
    implements android.widget.stener
{

    final LibraryBoardHeaderView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (LibraryBoardHeaderView.access$100(LibraryBoardHeaderView.this) == null || view == null || !(view instanceof TopicAnnotationCell) || LibraryBoardHeaderView.access$200(LibraryBoardHeaderView.this) == null)
        {
            return;
        }
        adapterview = LibraryBoardHeaderView.this;
        int j = i;
        if (LibraryBoardHeaderView.access$000(LibraryBoardHeaderView.this) == i)
        {
            j = -1;
        }
        LibraryBoardHeaderView.access$002(adapterview, j);
        adapterview = LibraryBoardHeaderView.access$300(LibraryBoardHeaderView.this);
        if (adapterview == null)
        {
            adapterview = "";
        } else
        {
            adapterview = adapterview.getName();
        }
        view = new HashMap();
        view.put("library_topic_name", adapterview);
        Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, view);
        LibraryBoardHeaderView.access$400(LibraryBoardHeaderView.this, true);
    }

    ()
    {
        this$0 = LibraryBoardHeaderView.this;
        super();
    }
}
