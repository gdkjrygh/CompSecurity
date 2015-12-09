// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

private class imgUrl
    implements imgUrl
{

    protected final String imgUrl;
    final ImageLoader this$0;
    protected final AdvancedImageView view;

    private boolean responseIsOutdated()
    {
        boolean flag;
        if (!StringUtils.safeEquals(view.getUrlTag(), imgUrl))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag);
        return flag;
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
        if (responseIsOutdated())
        {
            return;
        } else
        {
            Log.w("ImageLoader", (new StringBuilder()).append("Error loading bitmap for url: ").append(imgUrl).toString());
            ImageLoader.access$000(ImageLoader.this, view, 0x7f020062);
            return;
        }
    }

    public void onResponse(view view1, boolean flag)
    {
        if (responseIsOutdated())
        {
            return;
        }
        view1 = view1.itmap();
        if (view1 != null && flag)
        {
            ImageLoader.access$100(ImageLoader.this, view, view1);
            return;
        } else
        {
            updateView(view, view1);
            return;
        }
    }

    protected void updateView(ImageView imageview, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            ImageLoader.access$200(ImageLoader.this, imageview);
            return;
        } else
        {
            ImageLoader.access$100(ImageLoader.this, imageview, bitmap);
            return;
        }
    }

    public (AdvancedImageView advancedimageview, String s)
    {
        this$0 = ImageLoader.this;
        super();
        view = advancedimageview;
        imgUrl = s;
    }
}
