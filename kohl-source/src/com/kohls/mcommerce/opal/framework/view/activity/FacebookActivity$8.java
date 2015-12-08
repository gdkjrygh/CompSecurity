// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import com.facebook.widget.PickerFragment;
import com.facebook.widget.PlacePickerFragment;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookActivity

class val.fragment
    implements com.facebook.widget.neButtonClickedListener
{

    final FacebookActivity this$0;
    final PlacePickerFragment val$fragment;

    public void onDoneButtonClicked(PickerFragment pickerfragment)
    {
        FacebookActivity.access$2700(FacebookActivity.this, val$fragment);
    }

    I()
    {
        this$0 = final_facebookactivity;
        val$fragment = PlacePickerFragment.this;
        super();
    }
}
