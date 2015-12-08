// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialPickerFragment

class this._cls0
    implements NUXNextFragmentListener
{

    final NUXSocialPickerFragment this$0;

    public void nextFragment()
    {
        onNextButtonClicked();
    }

    public void skipFragment()
    {
        NUXSocialPickerFragment.access$200(NUXSocialPickerFragment.this);
    }

    ()
    {
        this$0 = NUXSocialPickerFragment.this;
        super();
    }
}
