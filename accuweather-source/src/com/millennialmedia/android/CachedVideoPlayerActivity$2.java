// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.millennialmedia.android:
//            CachedVideoPlayerActivity, VideoImage

class val.button
    implements android.view.ayerActivity._cls2
{

    final CachedVideoPlayerActivity this$0;
    final VideoImage val$button;
    final ImageButton val$newButton;

    public void onClick(View view)
    {
        if (val$newButton != null)
        {
            val$newButton.setEnabled(false);
        }
        redirectListenerImpl.orientation = val$button.overlayOrientation;
        dispatchButtonClick(val$button.linkUrl);
        logButtonEvent(val$button);
    }

    istenerImpl()
    {
        this$0 = final_cachedvideoplayeractivity;
        val$newButton = imagebutton;
        val$button = VideoImage.this;
        super();
    }
}
