// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import java.util.ArrayList;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity, CropImageView, HighlightView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        cess._mth700(this._cls1.this);
        CropImageActivity.access$100(_fld0).invalidate();
        if (CropImageActivity.access$100(_fld0).highlightViews.size() == 1)
        {
            CropImageActivity.access$802(_fld0, (HighlightView)CropImageActivity.access$100(_fld0).highlightViews.get(0));
            CropImageActivity.access$800(_fld0).setFocus(true);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
