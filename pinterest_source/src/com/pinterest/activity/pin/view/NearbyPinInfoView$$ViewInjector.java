// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            NearbyPinInfoView

public class 
{

    public static void inject(butterknife.oView oview, NearbyPinInfoView nearbypininfoview, Object obj)
    {
        nearbypininfoview._imageView = (WebImageView)oview._imageView(obj, 0x7f0f036d, "field '_imageView'");
        nearbypininfoview._placeName = (TextView)oview._placeName(obj, 0x7f0f04a9, "field '_placeName'");
    }

    public static void reset(NearbyPinInfoView nearbypininfoview)
    {
        nearbypininfoview._imageView = null;
        nearbypininfoview._placeName = null;
    }

    public ()
    {
    }
}
