// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.koushikdutta.urlimageviewhelper.UrlImageViewCallback;
import com.thetransitapp.droid.model.RouteImage;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteItem

class val.spacer
    implements UrlImageViewCallback
{

    final RouteItem this$0;
    private final RouteImage val$routeImage;
    private final View val$routeNumber;
    private final View val$spacer;

    public void onLoaded(ImageView imageview, Bitmap bitmap, String s, boolean flag)
    {
label0:
        {
            if (imageview.getVisibility() == 0)
            {
                if (bitmap == null || !val$routeImage.isReplaceName())
                {
                    break label0;
                }
                ((TextView)val$routeNumber).setText("");
                val$spacer.setVisibility(8);
            }
            return;
        }
        val$spacer.setVisibility(0);
    }

    allback()
    {
        this$0 = final_routeitem;
        val$routeImage = routeimage;
        val$routeNumber = view;
        val$spacer = View.this;
        super();
    }
}
