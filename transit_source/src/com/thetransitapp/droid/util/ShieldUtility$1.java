// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.koushikdutta.urlimageviewhelper.UrlImageViewCallback;
import com.thetransitapp.droid.model.RoutingLeg;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.util:
//            ShieldUtility, BitmapUtility

class val.positions
    implements UrlImageViewCallback
{

    final ShieldUtility this$0;
    private final RoutingLeg val$leg;
    private final List val$positions;

    public void onLoaded(ImageView imageview, Bitmap bitmap, String s, boolean flag)
    {
        if (bitmap != null)
        {
            imageview = BitmapDescriptorFactory.fromBitmap(BitmapUtility.getShield(bitmap, val$leg.getRoute(), ShieldUtility.access$0(ShieldUtility.this).getResources().getDimensionPixelSize(0x7f08001e), ShieldUtility.access$0(ShieldUtility.this)));
            ShieldUtility.access$1(ShieldUtility.this, val$positions, imageview);
        }
    }

    iptorFactory()
    {
        this$0 = final_shieldutility;
        val$leg = routingleg;
        val$positions = List.this;
        super();
    }
}
