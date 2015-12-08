// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.user.view.UserAboutSitesView;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserAboutFragment

class this._cls0
    implements com.pinterest.base.ber
{

    final UserAboutFragment this$0;

    public void onEventMainThread(com.pinterest.base.nectEvent nectevent)
    {
        if (nectevent.getNetwork() == com.pinterest.base.OOK)
        {
            UserAboutFragment.access$000(UserAboutFragment.this).setFacebookUrl(null);
            _sitesVw.updateSites(UserAboutFragment.access$000(UserAboutFragment.this));
        }
    }

    ()
    {
        this$0 = UserAboutFragment.this;
        super();
    }
}
