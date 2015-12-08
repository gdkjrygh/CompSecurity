// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.widget.ImageButton;

// Referenced classes of package com.accuweather.android.maps:
//            NativeMapActivity, MapOverlayLayerManager

class this._cls0
    implements Runnable
{

    final NativeMapActivity this$0;

    public void run()
    {
        NativeMapActivity.access$000(NativeMapActivity.this).animateMap();
        mPlayButton.postDelayed(NativeMapActivity.access$100(NativeMapActivity.this), 500L);
    }

    er()
    {
        this$0 = NativeMapActivity.this;
        super();
    }
}
