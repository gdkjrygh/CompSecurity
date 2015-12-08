// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.widget.ImageView;
import com.mopub.volley.VolleyError;

final class d
    implements ImageLoader.ImageListener
{

    final int a;
    final ImageView b;
    final int c;

    d(int i, ImageView imageview, int j)
    {
        a = i;
        b = imageview;
        c = j;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        if (a != 0)
        {
            b.setImageResource(a);
        }
    }

    public final void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        if (imagecontainer.getBitmap() != null)
        {
            b.setImageBitmap(imagecontainer.getBitmap());
        } else
        if (c != 0)
        {
            b.setImageResource(c);
            return;
        }
    }
}
