// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.common.VolumeDialogFrag;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.iniPlayerViews._cls12
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        if (MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).destroyed())
        {
            MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, "Activity destroyed, can't show volume frag");
            return;
        }
        if (!MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).isRemotePlayerReady())
        {
            Log.w("MdxMiniPlayerViews", "Remote player is not ready - can't get/set volume");
            return;
        } else
        {
            view = VolumeDialogFrag.newInstance();
            view.setCancelable(true);
            MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).showDialog(view);
            return;
        }
    }

    gFrag()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
