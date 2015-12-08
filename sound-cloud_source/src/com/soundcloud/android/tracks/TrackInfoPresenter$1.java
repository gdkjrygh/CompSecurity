// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.View;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackInfoPresenter

class mmentClickListener
    implements android.view.kInfoPresenter._cls1
{

    final TrackInfoPresenter this$0;
    final mmentClickListener val$commentClickListener;

    public void onClick(View view)
    {
        val$commentClickListener.onCommentsClicked();
    }

    mmentClickListener()
    {
        this$0 = final_trackinfopresenter;
        val$commentClickListener = mmentClickListener.this;
        super();
    }
}
