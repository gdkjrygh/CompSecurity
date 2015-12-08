// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.TopicAnnotationCell;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryAllPinsFragment

class this._cls0
    implements android.widget.stener
{

    final LibraryAllPinsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (LibraryAllPinsFragment.access$100(LibraryAllPinsFragment.this) != null && view != null && (view instanceof TopicAnnotationCell))
        {
            LibraryAllPinsFragment.access$300(LibraryAllPinsFragment.this, i);
            adapterview = LibraryAllPinsFragment.access$400(LibraryAllPinsFragment.this);
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
            if (EducationHelper.e())
            {
                Events.post(new EducationEvent(com.pinterest.activity.task.education.event.SS));
                return;
            }
        }
    }

    ()
    {
        this$0 = LibraryAllPinsFragment.this;
        super();
    }
}
