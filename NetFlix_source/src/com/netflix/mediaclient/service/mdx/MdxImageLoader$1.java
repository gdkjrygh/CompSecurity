// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.graphics.Bitmap;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxImageLoader

class this._cls0
    implements com.netflix.mediaclient.util.gfx.LoaderListener
{

    final MdxImageLoader this$0;

    public void onErrorResponse(String s)
    {
        Log.e("nf_mdxImageLoader", (new StringBuilder()).append("failed to downlod ").append(s).toString());
    }

    public void onResponse(Bitmap bitmap, String s)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            MdxImageLoader.access$002(MdxImageLoader.this, bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
        } else
        {
            Log.e("nf_mdxImageLoader", (new StringBuilder()).append("bitmap is not valid ").append(bitmap).toString());
        }
        if (Log.isLoggable("nf_mdxImageLoader", 3))
        {
            Log.d("nf_mdxImageLoader", (new StringBuilder()).append("downloaded image from ").append(s).toString());
        }
        mCallback.onBitmapReady(MdxImageLoader.access$000(MdxImageLoader.this));
    }

    xImageLoaderInterface()
    {
        this$0 = MdxImageLoader.this;
        super();
    }
}
