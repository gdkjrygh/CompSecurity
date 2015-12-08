// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter, HomeActivity

class this._cls0
    implements android.view.idingMenuAdapter._cls2
{

    final SlidingMenuAdapter this$0;

    public void onClick(View view)
    {
        view = HomeActivity.createStartIntent(activity);
        view.addFlags(0x4000000);
        activity.startActivity(view);
        SlidingMenuAdapter.access$000(SlidingMenuAdapter.this).closeDrawers();
    }

    ity()
    {
        this$0 = SlidingMenuAdapter.this;
        super();
    }
}
