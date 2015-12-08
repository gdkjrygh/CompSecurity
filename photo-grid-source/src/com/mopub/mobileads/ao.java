// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.widget.ImageView;
import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.mobileads:
//            an

final class ao
    implements com.mopub.volley.toolbox.ImageLoader.ImageListener
{

    final String a;
    final an b;

    ao(an an1, String s)
    {
        b = an1;
        a = s;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        MoPubLog.d("Failed to load image.", volleyerror);
    }

    public final void onResponse(com.mopub.volley.toolbox.ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        imagecontainer = imagecontainer.getBitmap();
        if (imagecontainer != null)
        {
            an.a(b).setImageBitmap(imagecontainer);
            return;
        } else
        {
            MoPubLog.d(String.format("%s returned null bitmap", new Object[] {
                a
            }));
            return;
        }
    }
}
