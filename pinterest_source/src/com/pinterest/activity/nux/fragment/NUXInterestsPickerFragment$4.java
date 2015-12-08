// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.nux.adapter.NUXInterestGridAdapter;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.activity.nux.view.NUXProgressIndicatorView;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXInterestsPickerFragment

class this._cls0
    implements NUXNextFragmentListener
{

    final NUXInterestsPickerFragment this$0;

    public void nextFragment()
    {
        ((NUXActivity)getActivity()).submitInterests(((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$2500(NUXInterestsPickerFragment.this)).getCheckedInterests());
        goToNextFragment();
    }

    public void skipFragment()
    {
        ((NUXInterestGridAdapter)NUXInterestsPickerFragment.access$2600(NUXInterestsPickerFragment.this)).clearInterests();
        for (int i = 0; i < NUXProgressIndicatorView.INTERESTS_STEP; i++)
        {
            Events.post(new com.pinterest.activity.nux.Event(-1, com.pinterest.activity.nux.Event.EventType.INTEREST));
        }

        goToNextFragment();
    }

    ntType()
    {
        this$0 = NUXInterestsPickerFragment.this;
        super();
    }
}
