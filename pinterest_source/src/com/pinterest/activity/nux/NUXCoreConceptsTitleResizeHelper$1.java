// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;

import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.nux:
//            NUXCoreConceptsTitleResizeHelper

class this._cls0
    implements com.pinterest.base.elper._cls1
{

    final NUXCoreConceptsTitleResizeHelper this$0;

    public void onEventMainThread(XCoreConceptsLayoutDoneEvent xcoreconceptslayoutdoneevent)
    {
        NUXCoreConceptsTitleResizeHelper.access$100(NUXCoreConceptsTitleResizeHelper.this).add(xcoreconceptslayoutdoneevent.titleView);
    }

    public void onEventMainThread(XCoreConceptsTitleSizeChangedEvent xcoreconceptstitlesizechangedevent)
    {
        float f = xcoreconceptstitlesizechangedevent.newTitleTextSize;
        NUXCoreConceptsTitleResizeHelper.access$002(NUXCoreConceptsTitleResizeHelper.this, Math.min(f, NUXCoreConceptsTitleResizeHelper.access$000(NUXCoreConceptsTitleResizeHelper.this)));
    }

    XCoreConceptsTitleSizeChangedEvent()
    {
        this$0 = NUXCoreConceptsTitleResizeHelper.this;
        super();
    }
}
