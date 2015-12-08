// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.widget.ImageView;
import bolts.i;
import bolts.j;
import com.facebook.ads.NativeAd;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            d

class a
    implements i
{

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

    (d d1, ImageView imageview)
    {
        b = d1;
        a = imageview;
        super();
    }
}
