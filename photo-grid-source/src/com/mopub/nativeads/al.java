// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.widget.ImageView;
import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.nativeads:
//            NativeResponse

final class al
    implements com.mopub.volley.toolbox.ImageLoader.ImageListener
{

    final ImageView a;
    final NativeResponse b;

    al(NativeResponse nativeresponse, ImageView imageview)
    {
        b = nativeresponse;
        a = imageview;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        MoPubLog.d("Failed to load image.", volleyerror);
        a.setImageDrawable(null);
    }

    public final void onResponse(com.mopub.volley.toolbox.ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        if (!flag)
        {
            MoPubLog.d("Image was not loaded immediately into your ad view. You should call preCacheImages as part of your custom event loading process.");
        }
        a.setImageBitmap(imagecontainer.getBitmap());
    }
}
