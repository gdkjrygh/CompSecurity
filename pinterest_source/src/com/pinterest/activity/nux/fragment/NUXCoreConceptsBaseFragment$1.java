// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsBaseFragment

class this._cls0
    implements me.grantland.widget.Listener
{

    final NUXCoreConceptsBaseFragment this$0;

    public void onTextSizeChange(float f, float f1)
    {
        Events.post(new com.pinterest.activity.nux.er.NUXCoreConceptsTitleSizeChangedEvent(f));
    }

    eConceptsTitleSizeChangedEvent()
    {
        this$0 = NUXCoreConceptsBaseFragment.this;
        super();
    }
}
