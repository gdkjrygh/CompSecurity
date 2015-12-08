// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.app.ActionBar;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0
    implements com.sothree.slidinguppanel.ut.PanelSlideListener
{

    final NetflixActivity this$0;

    public void onPanelAnchored(View view)
    {
        Log.v("NetflixActivity", "onPanelAnchored");
    }

    public void onPanelCollapsed(View view)
    {
        Log.v("NetflixActivity", "onPanelCollapsed");
        onSlidingPanelCollapsed(view);
        if (NetflixActivity.access$100(NetflixActivity.this) != null)
        {
            NetflixActivity.access$100(NetflixActivity.this).onPanelCollapsed();
        }
    }

    public void onPanelExpanded(View view)
    {
        Log.v("NetflixActivity", "onPanelExpanded");
        onSlidingPanelExpanded(view);
        if (NetflixActivity.access$100(NetflixActivity.this) != null)
        {
            NetflixActivity.access$100(NetflixActivity.this).onPanelExpanded();
        }
    }

    public void onPanelSlide(View view, float f)
    {
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("onPanelSlide, offset: ").append(f).toString());
        }
        if (NetflixActivity.access$100(NetflixActivity.this) != null)
        {
            NetflixActivity.access$100(NetflixActivity.this).onPanelSlide(f);
        }
        if (NetflixActivity.access$700(NetflixActivity.this) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (f >= 0.3F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!NetflixActivity.access$700(NetflixActivity.this).isShowing()) goto _L1; else goto _L3
_L3:
        NetflixActivity.access$700(NetflixActivity.this).hide();
        return;
        if (NetflixActivity.access$700(NetflixActivity.this).isShowing()) goto _L1; else goto _L4
_L4:
        NetflixActivity.access$700(NetflixActivity.this).show();
        return;
    }

    istener()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
