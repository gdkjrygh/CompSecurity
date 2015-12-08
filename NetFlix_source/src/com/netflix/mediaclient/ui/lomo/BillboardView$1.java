// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BillboardView

class this._cls0
    implements android.view..OnGlobalLayoutListener
{

    final BillboardView this$0;

    public void onGlobalLayout()
    {
        if (!((NetflixActivity)getContext()).destroyed())
        {
            if (Log.isLoggable("BillboardView", 2))
            {
                Log.v("BillboardView", (new StringBuilder()).append("vg height: ").append(BillboardView.access$000(BillboardView.this).getHeight()).append(", h: ").append(getHeight()).toString());
            }
            if (getHeight() > 0 && BillboardView.access$000(BillboardView.this).getHeight() >= getHeight())
            {
                Log.d("BillboardView", "Info view group is larger than view height - hiding some text");
                BillboardView.access$100(BillboardView.this).setVisibility(8);
                BillboardView.access$200(BillboardView.this).setVisibility(8);
            }
            if (getHeight() > 0)
            {
                ViewUtils.removeGlobalLayoutListener(BillboardView.this, this);
                return;
            }
        }
    }

    Activity()
    {
        this$0 = BillboardView.this;
        super();
    }
}
