// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.graphics.Bitmap;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            SocialVideoView

private class index
    implements com.netflix.mediaclient.util.gfx.tener
{

    private final int index;
    final SocialVideoView this$0;

    public void onErrorResponse(String s)
    {
        Log.w("SocialVideoView", (new StringBuilder()).append("Could not load img: ").append(s).append(", index: ").append(index).toString());
    }

    public void onResponse(Bitmap bitmap, String s)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            Log.v("SocialVideoView", (new StringBuilder()).append("Loaded bitmap: ").append(s).append(", index: ").append(index).append(", size: ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
            SocialVideoView.access$000(SocialVideoView.this)[index] = bitmap;
            invalidate();
            return;
        }
    }

    public (int i)
    {
        this$0 = SocialVideoView.this;
        super();
        index = i;
    }
}
