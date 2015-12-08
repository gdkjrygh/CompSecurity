// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.widget.TextView;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

class > extends com.pinterest.api.remote.._cls5
{

    final HomefeedBuilderFragment this$0;

    public void onSuccess(User user)
    {
        super.Success(user);
        if (user == null || HomefeedBuilderFragment.access$900(HomefeedBuilderFragment.this) == null)
        {
            return;
        }
        HomefeedBuilderFragment homefeedbuilderfragment = HomefeedBuilderFragment.this;
        int i;
        if (user.getInterestFollowingCount() == null)
        {
            i = 0;
        } else
        {
            i = user.getInterestFollowingCount().intValue();
        }
        HomefeedBuilderFragment.access$1002(homefeedbuilderfragment, i);
        HomefeedBuilderFragment.access$900(HomefeedBuilderFragment.this).setText(String.valueOf(HomefeedBuilderFragment.access$1000(HomefeedBuilderFragment.this)));
    }

    (boolean flag)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(flag);
    }
}
