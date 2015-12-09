// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.util.MdxUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.iniPlayerViews._cls13
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).displayDialog(MdxUtils.createMdxTargetSelectionDialog(MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this), MdxMiniPlayerViews.access$1200(MdxMiniPlayerViews.this)));
    }

    ity()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
