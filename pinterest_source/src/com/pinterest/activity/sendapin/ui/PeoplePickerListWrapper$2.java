// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import com.pinterest.activity.sendapin.adapter.SendPinAdapter;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper, SendPinListView

class this._cls0
    implements android.view.ayoutListener
{

    final PeoplePickerListWrapper this$0;

    public void onGlobalLayout()
    {
        if (PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).onScreenHeightChanged(getMeasuredHeight()))
        {
            PeoplePickerListWrapper.access$200(PeoplePickerListWrapper.this).restoreTranslation();
        }
    }

    ()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
