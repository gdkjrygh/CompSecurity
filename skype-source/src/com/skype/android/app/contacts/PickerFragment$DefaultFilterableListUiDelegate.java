// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.skype.ObjectInterface;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

protected class this._cls0
    implements this._cls0
{

    final PickerFragment this$0;

    public void onItemClicked(boolean flag, ObjectInterface objectinterface)
    {
        PickerFragment.access$800(PickerFragment.this, flag, objectinterface);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        PickerFragment.access$300(PickerFragment.this);
        PickerFragment.access$400(PickerFragment.this);
        PickerFragment.access$500(PickerFragment.this);
        PickerFragment.access$600(PickerFragment.this);
        PickerFragment.access$700(PickerFragment.this, bundle);
    }

    public void saveInstanceState(Bundle bundle)
    {
        android.view.bleListUiDelegate blelistuidelegate = participantsScrollView.getLayoutParams();
        blelistuidelegate.rollView = -2;
        participantsScrollView.setLayoutParams(blelistuidelegate);
        bundle.putInt("STATE_SCROLL_VIEW_HEIGHT", participantsScrollView.getHeight());
    }

    protected ()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
