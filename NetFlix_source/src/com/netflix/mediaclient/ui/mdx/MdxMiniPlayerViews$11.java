// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.common.SharingDialogFrag;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.iniPlayerViews._cls11
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        if (MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).destroyed())
        {
            MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, "Activity destroyed, can't show sharing frag");
            return;
        } else
        {
            view = SharingDialogFrag.newInstance();
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
