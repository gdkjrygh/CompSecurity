// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.widget.ImageView;

// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter, ImageResponse

class val.imageView
    implements 
{

    final GraphObjectAdapter this$0;
    final ImageView val$imageView;
    final String val$profileId;

    public void onCompleted(ImageResponse imageresponse)
    {
        GraphObjectAdapter.access$200(GraphObjectAdapter.this, imageresponse, val$profileId, val$imageView);
    }

    ()
    {
        this$0 = final_graphobjectadapter;
        val$profileId = s;
        val$imageView = ImageView.this;
        super();
    }
}
