// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsSlidingMenuAdapter

class this._cls0
    implements android.view..KidsSlidingMenuAdapter._cls1
{

    final KidsSlidingMenuAdapter this$0;

    public void onClick(View view)
    {
        KidsSlidingMenuAdapter.access$100(KidsSlidingMenuAdapter.this).startActivity(KidsUtils.createExitKidsIntent(KidsSlidingMenuAdapter.access$000(KidsSlidingMenuAdapter.this), com.netflix.mediaclient.servicemgr.ndName.slidingMenuKidsExit));
    }

    me()
    {
        this$0 = KidsSlidingMenuAdapter.this;
        super();
    }
}
