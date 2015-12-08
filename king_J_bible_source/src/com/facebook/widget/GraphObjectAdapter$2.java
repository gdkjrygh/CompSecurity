// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.widget.ImageView;
import com.facebook.internal.ImageResponse;

// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter

class val.imageView
    implements com.facebook.internal.
{

    final GraphObjectAdapter this$0;
    private final ImageView val$imageView;
    private final String val$profileId;

    public void onCompleted(ImageResponse imageresponse)
    {
        GraphObjectAdapter.access$3(GraphObjectAdapter.this, imageresponse, val$profileId, val$imageView);
    }

    ck()
    {
        this$0 = final_graphobjectadapter;
        val$profileId = s;
        val$imageView = ImageView.this;
        super();
    }
}
