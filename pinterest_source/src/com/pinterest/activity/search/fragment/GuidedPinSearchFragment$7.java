// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinSearchFragment

class <init> extends com.pinterest.api.remote.sponseHandler
{

    final GuidedPinSearchFragment this$0;

    public void onSuccess(Interest interest)
    {
        if (interest != null)
        {
            if (ModelHelper.isValid(interest.getUid()) && interest.getPinnerCount().intValue() > 0)
            {
                GuidedPinSearchFragment.access$302(GuidedPinSearchFragment.this, interest);
            } else
            {
                GuidedPinSearchFragment.access$302(GuidedPinSearchFragment.this, null);
            }
        }
        GuidedPinSearchFragment.access$1100(GuidedPinSearchFragment.this);
    }

    (boolean flag)
    {
        this$0 = GuidedPinSearchFragment.this;
        super(flag);
    }
}
