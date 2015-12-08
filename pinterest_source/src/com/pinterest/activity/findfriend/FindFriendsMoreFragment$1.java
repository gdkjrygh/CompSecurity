// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.view.View;
import com.pinterest.activity.findfriend.util.InviteUtil;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsMoreFragment

class val.apiTag
    implements android.view.riendsMoreFragment._cls1
{

    final FindFriendsMoreFragment this$0;
    final String val$apiTag;

    public void onClick(View view)
    {
        _smsBtn.disableUntilAfter(500);
        InviteUtil.inviteUserSMS(getActivity(), "", "", val$apiTag);
    }

    A()
    {
        this$0 = final_findfriendsmorefragment;
        val$apiTag = String.this;
        super();
    }
}
