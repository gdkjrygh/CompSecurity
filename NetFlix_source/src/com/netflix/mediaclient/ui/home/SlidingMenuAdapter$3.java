// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter

class this._cls0
    implements android.view.idingMenuAdapter._cls3
{

    final SlidingMenuAdapter this$0;

    public void onClick(View view)
    {
        activity.startActivity(ProfileSelectionActivity.createStartIntent(activity));
    }

    ity()
    {
        this$0 = SlidingMenuAdapter.this;
        super();
    }
}
