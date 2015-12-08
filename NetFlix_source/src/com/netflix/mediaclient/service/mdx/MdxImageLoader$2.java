// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcherCallback;
import com.netflix.mediaclient.util.StringUtils;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxImageLoader

class this._cls0
    implements ResourceFetcherCallback
{

    final MdxImageLoader this$0;

    public void onResourceFetched(String s, final String localFileUrl, int i)
    {
        if (i == 0)
        {
            if (Log.isLoggable("nf_mdxImageLoader", 3))
            {
                Log.d("nf_mdxImageLoader", (new StringBuilder()).append("resource fetched to ").append(localFileUrl).toString());
            }
            if (mWorkerHandler != null && StringUtils.isNotEmpty(localFileUrl))
            {
                mWorkerHandler.post(new Runnable() {

                    final MdxImageLoader._cls2 this$1;
                    final String val$localFileUrl;

                    public void run()
                    {
                        Object obj = localFileUrl.substring("file://".length());
                        BufferedInputStream bufferedinputstream;
                        obj = new FileInputStream(((String) (obj)));
                        bufferedinputstream = new BufferedInputStream(((java.io.InputStream) (obj)));
                        MdxImageLoader.access$002(this$0, BitmapFactory.decodeStream(bufferedinputstream));
                        if (obj == null)
                        {
                            break MISSING_BLOCK_LABEL_54;
                        }
                        ((FileInputStream) (obj)).close();
                        if (bufferedinputstream != null)
                        {
                            try
                            {
                                bufferedinputstream.close();
                            }
                            catch (Exception exception)
                            {
                                Log.e("decode bitmap failed", exception.toString());
                            }
                        }
                        if (MdxImageLoader.access$000(this$0) != null)
                        {
                            if (Log.isLoggable("nf_mdxImageLoader", 3))
                            {
                                Log.d("nf_mdxImageLoader", (new StringBuilder()).append("mBitmap decoded, ").append(MdxImageLoader.access$000(this$0).getWidth()).append(" X ").append(MdxImageLoader.access$000(this$0).getHeight()).toString());
                            }
                            mCallback.onBitmapReady(MdxImageLoader.access$000(this$0));
                        }
                        return;
                    }

            
            {
                this$1 = MdxImageLoader._cls2.this;
                localFileUrl = s;
                super();
            }
                });
            }
        }
    }

    public void onResourcePrefetched(String s, int i, int j)
    {
        if (Log.isLoggable("nf_mdxImageLoader", 3))
        {
            Log.d("nf_mdxImageLoader", (new StringBuilder()).append("ERROR resource prefetched from ").append(s).toString());
        }
    }

    _cls1.val.localFileUrl()
    {
        this$0 = MdxImageLoader.this;
        super();
    }
}
