// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.graphics.RectF;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment

class this._cls0
    implements com.pinterest.activity.pin.view.ightCropperMoveListener
{

    final FlashlightResultsFragment this$0;

    public void onCropperMoveEnd(RectF rectf, int i, int j)
    {
        loadFlashlightSearchResults(rectf, i, j, null);
    }

    public void onCropperMoveStart(RectF rectf, int i, int j)
    {
    }

    htCropperMoveListener()
    {
        this$0 = FlashlightResultsFragment.this;
        super();
    }
}
