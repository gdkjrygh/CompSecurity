// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcherCallback;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public final class MdxImageLoader
{
    public static interface MdxImageLoaderInterface
    {

        public abstract void onBitmapReady(Bitmap bitmap);
    }


    private static final String TAG = "nf_mdxImageLoader";
    private Bitmap mBitmap;
    MdxImageLoaderInterface mCallback;
    ResourceFetcher mResourceFetcher;
    Handler mWorkerHandler;

    public MdxImageLoader(ResourceFetcher resourcefetcher, MdxImageLoaderInterface mdximageloaderinterface, Handler handler)
    {
        mResourceFetcher = resourcefetcher;
        mCallback = mdximageloaderinterface;
        if (mResourceFetcher == null)
        {
            Log.e("nf_mdxImageLoader", "ResourceFetcher is null");
            return;
        } else
        {
            mWorkerHandler = handler;
            return;
        }
    }

    private void fetchImageWithResourceFetcher(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_mdxImageLoader", "Res fetcher url empty");
            return;
        }
        if (mResourceFetcher == null)
        {
            Log.e("nf_mdxImageLoader", "ResourceFetcher is null");
            return;
        } else
        {
            mResourceFetcher.fetchResource(s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, new ResourceFetcherCallback() {

                final MdxImageLoader this$0;

                public void onResourceFetched(String s1, String s2, int i)
                {
                    if (i == 0)
                    {
                        if (Log.isLoggable("nf_mdxImageLoader", 3))
                        {
                            Log.d("nf_mdxImageLoader", (new StringBuilder()).append("resource fetched to ").append(s2).toString());
                        }
                        if (mWorkerHandler != null && StringUtils.isNotEmpty(s2))
                        {
                            mWorkerHandler.post(s2. new Runnable() {

                                final _cls2 this$1;
                                final String val$localFileUrl;

                                public void run()
                                {
                                    Object obj = localFileUrl.substring("file://".length());
                                    BufferedInputStream bufferedinputstream;
                                    obj = new FileInputStream(((String) (obj)));
                                    bufferedinputstream = new BufferedInputStream(((java.io.InputStream) (obj)));
                                    mBitmap = BitmapFactory.decodeStream(bufferedinputstream);
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
                                    if (mBitmap != null)
                                    {
                                        if (Log.isLoggable("nf_mdxImageLoader", 3))
                                        {
                                            Log.d("nf_mdxImageLoader", (new StringBuilder()).append("mBitmap decoded, ").append(mBitmap.getWidth()).append(" X ").append(mBitmap.getHeight()).toString());
                                        }
                                        mCallback.onBitmapReady(mBitmap);
                                    }
                                    return;
                                }

            
            {
                this$1 = final__pcls2;
                localFileUrl = String.this;
                super();
            }
                            });
                        }
                    }
                }

                public void onResourcePrefetched(String s1, int i, int j)
                {
                    if (Log.isLoggable("nf_mdxImageLoader", 3))
                    {
                        Log.d("nf_mdxImageLoader", (new StringBuilder()).append("ERROR resource prefetched from ").append(s1).toString());
                    }
                }

            
            {
                this$0 = MdxImageLoader.this;
                super();
            }
            });
            return;
        }
    }

    public void fetchImage(String s)
    {
        fetchImageWithLoader(s);
    }

    public void fetchImageWithLoader(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_mdxImageLoader", "Loader url empty");
            return;
        }
        com.netflix.mediaclient.service.resfetcher.volley.ImageLoader imageloader = mResourceFetcher.getImageLoader();
        if (imageloader != null)
        {
            imageloader.getImg(s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, 0, 0, new com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener() {

                final MdxImageLoader this$0;

                public void onErrorResponse(String s1)
                {
                    Log.e("nf_mdxImageLoader", (new StringBuilder()).append("failed to downlod ").append(s1).toString());
                }

                public void onResponse(Bitmap bitmap, String s1)
                {
                    if (bitmap != null && !bitmap.isRecycled())
                    {
                        mBitmap = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
                    } else
                    {
                        Log.e("nf_mdxImageLoader", (new StringBuilder()).append("bitmap is not valid ").append(bitmap).toString());
                    }
                    if (Log.isLoggable("nf_mdxImageLoader", 3))
                    {
                        Log.d("nf_mdxImageLoader", (new StringBuilder()).append("downloaded image from ").append(s1).toString());
                    }
                    mCallback.onBitmapReady(mBitmap);
                }

            
            {
                this$0 = MdxImageLoader.this;
                super();
            }
            });
            return;
        } else
        {
            Log.e("nf_mdxImageLoader", "ImageLoader is null!");
            return;
        }
    }



/*
    static Bitmap access$002(MdxImageLoader mdximageloader, Bitmap bitmap)
    {
        mdximageloader.mBitmap = bitmap;
        return bitmap;
    }

*/
}
