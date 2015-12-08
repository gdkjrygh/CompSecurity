// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;

import android.widget.TextView;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import java.util.ArrayList;
import java.util.Iterator;

public class NUXCoreConceptsTitleResizeHelper
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private float _smallestTitleTextSize;
    private ArrayList _titleViews;

    public NUXCoreConceptsTitleResizeHelper()
    {
        _eventsSubscriber = new _cls1();
        _smallestTitleTextSize = Resources.dimension(0x7f0a00f4);
        _titleViews = new ArrayList();
        Events.register(_eventsSubscriber, com/pinterest/activity/nux/NUXCoreConceptsTitleResizeHelper$NUXCoreConceptsTitleSizeChangedEvent, new Class[] {
            com/pinterest/activity/nux/NUXCoreConceptsTitleResizeHelper$NUXCoreConceptsLayoutDoneEvent
        });
    }

    public void matchAllTitleSizes()
    {
        for (Iterator iterator = _titleViews.iterator(); iterator.hasNext(); ((TextView)iterator.next()).setTextSize(Device.pixelsToDp(_smallestTitleTextSize))) { }
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/nux/NUXCoreConceptsTitleResizeHelper$NUXCoreConceptsTitleSizeChangedEvent, com/pinterest/activity/nux/NUXCoreConceptsTitleResizeHelper$NUXCoreConceptsLayoutDoneEvent
        });
    }



/*
    static float access$002(NUXCoreConceptsTitleResizeHelper nuxcoreconceptstitleresizehelper, float f)
    {
        nuxcoreconceptstitleresizehelper._smallestTitleTextSize = f;
        return f;
    }

*/


    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final NUXCoreConceptsTitleResizeHelper this$0;

        public void onEventMainThread(NUXCoreConceptsLayoutDoneEvent nuxcoreconceptslayoutdoneevent)
        {
            _titleViews.add(nuxcoreconceptslayoutdoneevent.titleView);
        }

        public void onEventMainThread(NUXCoreConceptsTitleSizeChangedEvent nuxcoreconceptstitlesizechangedevent)
        {
            float f = nuxcoreconceptstitlesizechangedevent.newTitleTextSize;
            _smallestTitleTextSize = Math.min(f, _smallestTitleTextSize);
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsTitleResizeHelper.this;
            super();
        }

        private class NUXCoreConceptsLayoutDoneEvent
        {

            public final TextView titleView;

            public NUXCoreConceptsLayoutDoneEvent(TextView textview)
            {
                titleView = textview;
            }
        }


        private class NUXCoreConceptsTitleSizeChangedEvent
        {

            public final float newTitleTextSize;

            public NUXCoreConceptsTitleSizeChangedEvent(float f)
            {
                newTitleTextSize = f;
            }
        }

    }

}
