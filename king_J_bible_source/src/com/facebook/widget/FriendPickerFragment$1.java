// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            FriendPickerFragment, PickerFragment

class agmentAdapter extends agmentAdapter
{

    final FriendPickerFragment this$0;

    protected int getDefaultPicture()
    {
        return com.facebook.android._profile_default_icon;
    }

    protected volatile int getGraphObjectRowLayoutId(GraphObject graphobject)
    {
        return getGraphObjectRowLayoutId((GraphUser)graphobject);
    }

    protected int getGraphObjectRowLayoutId(GraphUser graphuser)
    {
        return com.facebook.android.icker_list_row;
    }

    agmentAdapter(PickerFragment pickerfragment, Context context)
    {
        this$0 = FriendPickerFragment.this;
        super(pickerfragment, context);
    }
}
