// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.net.Uri;
import android.view.View;

// Referenced classes of package com.soundcloud.android.profile:
//            UserDetailsView

class val.websiteUrl
    implements android.view.er
{

    final UserDetailsView this$0;
    final String val$websiteUrl;

    public void onClick(View view)
    {
        if (UserDetailsView.access$000(UserDetailsView.this) != null)
        {
            UserDetailsView.access$000(UserDetailsView.this).onViewUri(Uri.parse(val$websiteUrl));
        }
    }

    erDetailsListener()
    {
        this$0 = final_userdetailsview;
        val$websiteUrl = String.this;
        super();
    }
}
