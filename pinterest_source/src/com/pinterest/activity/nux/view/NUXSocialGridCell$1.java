// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXSocialGridCell

class r extends com.pinterest.ui.imageview.stener
{

    final NUXSocialGridCell this$0;

    public void onBitmapSet()
    {
        NUXSocialGridCell.access$000(NUXSocialGridCell.this).setVisibility(0);
    }

    r()
    {
        this$0 = NUXSocialGridCell.this;
        super();
    }
}
