// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.app.ActionBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0
    implements Runnable
{

    final NetflixActivity this$0;

    public void run()
    {
_L2:
        return;
        if (!NetflixActivity.access$800(NetflixActivity.this) || destroyed() || NetflixActivity.access$100(NetflixActivity.this) == null || NetflixActivity.access$900(NetflixActivity.this) == null || NetflixActivity.access$700(NetflixActivity.this) == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("Checking to see if action bar visibility is valid.  Frag showing: ").append(NetflixActivity.access$100(NetflixActivity.this).isShowing()).append(", panel expanded: ").append(NetflixActivity.access$900(NetflixActivity.this).isExpanded()).append(", system action bar showing: ").append(NetflixActivity.access$700(NetflixActivity.this).isShowing()).toString());
        }
        if (!NetflixActivity.access$100(NetflixActivity.this).isShowing() || !NetflixActivity.access$900(NetflixActivity.this).isExpanded())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!NetflixActivity.access$700(NetflixActivity.this).isShowing()) goto _L2; else goto _L3
_L3:
        Log.v("NetflixActivity", "Hiding action bar since it should not be shown");
        NetflixActivity.access$700(NetflixActivity.this).hide();
        return;
        if (NetflixActivity.access$700(NetflixActivity.this).isShowing()) goto _L2; else goto _L4
_L4:
        Log.v("NetflixActivity", "Showing action bar since it should not be hidden");
        NetflixActivity.access$700(NetflixActivity.this).show();
        return;
    }

    ()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
