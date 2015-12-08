// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialPickerFragment

class this._cls0
    implements com.pinterest.ui.tab.ckerFragment._cls2
{

    final NUXSocialPickerFragment this$0;

    public void onTabReselected(int i)
    {
        if (i == 0 && !MyUser.isConnectedToFacebook())
        {
            Events.post(new com.pinterest.base.(com.pinterest.base.));
        } else
        if (i == 1 && !MyUser.isConnectedToTwitter())
        {
            Events.post(new com.pinterest.base.(com.pinterest.base.));
            return;
        }
    }

    public void onTabSelected(int i)
    {
        NUXSocialPickerFragment.access$002(NUXSocialPickerFragment.this, false);
        if (i == 0 && !MyUser.isConnectedToFacebook())
        {
            Events.post(new com.pinterest.base.(com.pinterest.base.));
            return;
        }
        if (i == 1 && !MyUser.isConnectedToTwitter())
        {
            Events.post(new com.pinterest.base.(com.pinterest.base.));
            return;
        } else
        {
            selectNewTabView(i);
            return;
        }
    }

    ()
    {
        this$0 = NUXSocialPickerFragment.this;
        super();
    }
}
