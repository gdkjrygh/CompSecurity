// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.volley.toolbox:
//            NetworkImageView, j

final class i
    implements ImageLoader.ImageListener
{

    final boolean a;
    final NetworkImageView b;

    i(NetworkImageView networkimageview, boolean flag)
    {
        b = networkimageview;
        a = flag;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        if (NetworkImageView.a(b) != 0)
        {
            b.setImageResource(NetworkImageView.a(b));
        }
    }

    public final void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        if (flag && a)
        {
            b.post(new j(this, imagecontainer));
        } else
        {
            if (imagecontainer.getBitmap() != null)
            {
                b.setImageBitmap(imagecontainer.getBitmap());
                return;
            }
            if (NetworkImageView.b(b) != 0)
            {
                b.setImageResource(NetworkImageView.b(b));
                return;
            }
        }
    }
}
