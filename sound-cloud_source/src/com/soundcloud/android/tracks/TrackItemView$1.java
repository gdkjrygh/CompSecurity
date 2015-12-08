// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.View;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemView

class this._cls0
    implements android.view.ener
{

    final TrackItemView this$0;

    public void onClick(View view)
    {
        if (TrackItemView.access$000(TrackItemView.this) != null)
        {
            TrackItemView.access$000(TrackItemView.this).onOverflow(view);
        }
    }

    erflowListener()
    {
        this$0 = TrackItemView.this;
        super();
    }
}
