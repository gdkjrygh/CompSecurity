// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.gson.BaseNativeAdWebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.facebook.ads.NativeAd;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            a

public class d extends a
{

    public d(Context context, View view)
    {
        super(context, view);
    }

    public void a(int i, WebPhoto webphoto)
    {
        if (webphoto instanceof BaseNativeAdWebPhoto)
        {
            webphoto = (BaseNativeAdWebPhoto)webphoto;
            ImageView imageview = (ImageView)itemView.findViewById(0x7f10016d);
            webphoto.getLoadingResult().c(new i(imageview) {

                final ImageView a;
                final d b;

                public Object then(j j1)
                    throws Exception
                {
                    j1 = (NativeAd)j1.e();
                    NativeAd.downloadAndDisplayImage(j1.getAdCoverImage(), a);
                    j1.registerViewForInteraction(b.itemView);
                    return null;
                }

            
            {
                b = d.this;
                a = imageview;
                super();
            }
            }, j.b);
        }
    }
}
