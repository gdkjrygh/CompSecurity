// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fedorvlasov.lazylist;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.fedorvlasov.lazylist:
//            MemoryCache, FileCache, Utils

public class ImageLoader
{
    class BitmapDisplayer
        implements Runnable
    {

        Bitmap bitmap;
        PhotoToLoad photoToLoad;
        final ImageLoader this$0;

        public void run()
        {
            while (imageViewReused(photoToLoad) || bitmap == null) 
            {
                return;
            }
            photoToLoad.imageView.setImageBitmap(bitmap);
            photoToLoad.imageView.setVisibility(0);
        }

        public BitmapDisplayer(Bitmap bitmap1, PhotoToLoad phototoload)
        {
            this$0 = ImageLoader.this;
            super();
            bitmap = bitmap1;
            photoToLoad = phototoload;
        }
    }

    private class PhotoToLoad
    {

        public ImageView imageView;
        final ImageLoader this$0;
        public String url;

        public PhotoToLoad(String s, ImageView imageview)
        {
            this$0 = ImageLoader.this;
            super();
            url = s;
            imageView = imageview;
        }
    }

    class PhotosLoader
        implements Runnable
    {

        PhotoToLoad photoToLoad;
        final ImageLoader this$0;

        public void run()
        {
            if (!imageViewReused(photoToLoad))
            {
                Object obj = getBitmap(photoToLoad.url);
                memoryCache.put(photoToLoad.url, ((Bitmap) (obj)));
                if (!imageViewReused(photoToLoad))
                {
                    obj = new BitmapDisplayer(((Bitmap) (obj)), photoToLoad);
                    ((Activity)photoToLoad.imageView.getContext()).runOnUiThread(((Runnable) (obj)));
                    return;
                }
            }
        }

        PhotosLoader(PhotoToLoad phototoload)
        {
            this$0 = ImageLoader.this;
            super();
            photoToLoad = phototoload;
        }
    }


    ExecutorService executorService;
    FileCache fileCache;
    private Map imageViews;
    private int maxSize;
    MemoryCache memoryCache;

    public ImageLoader(Context context)
    {
        memoryCache = new MemoryCache();
        imageViews = Collections.synchronizedMap(new WeakHashMap());
        maxSize = 70;
        fileCache = new FileCache(context);
        executorService = Executors.newFixedThreadPool(5);
    }

    public ImageLoader(Context context, int i)
    {
        memoryCache = new MemoryCache();
        imageViews = Collections.synchronizedMap(new WeakHashMap());
        maxSize = i;
        fileCache = new FileCache(context);
        executorService = Executors.newFixedThreadPool(5);
    }

    private Bitmap decodeFile(File file)
    {
        android.graphics.BitmapFactory.Options options1;
        int i;
        int j;
        int k;
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            k = options.outWidth;
            j = options.outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        i = 1;
        if (k / 2 < maxSize || j / 2 < maxSize)
        {
            options1 = new android.graphics.BitmapFactory.Options();
            options1.inSampleSize = i;
            return BitmapFactory.decodeStream(new FileInputStream(file), null, options1);
        }
        k /= 2;
        j /= 2;
        i *= 2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_41;
        }
    }

    private Bitmap getBitmap(String s)
    {
        File file = fileCache.getFile(s);
        Bitmap bitmap = decodeFile(file);
        if (bitmap != null)
        {
            return bitmap;
        }
        try
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
            s.setConnectTimeout(30000);
            s.setReadTimeout(30000);
            s.setInstanceFollowRedirects(true);
            s = s.getInputStream();
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            Utils.CopyStream(s, fileoutputstream);
            fileoutputstream.close();
            s = decodeFile(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private void queuePhoto(String s, ImageView imageview)
    {
        s = new PhotoToLoad(s, imageview);
        executorService.submit(new PhotosLoader(s));
    }

    public void DisplayImage(String s, ImageView imageview)
    {
        imageview.setVisibility(4);
        imageViews.put(imageview, s);
        Bitmap bitmap = memoryCache.get(s);
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
            imageview.setVisibility(0);
            return;
        } else
        {
            queuePhoto(s, imageview);
            return;
        }
    }

    public void clearCache()
    {
        memoryCache.clear();
        fileCache.clear();
    }

    boolean imageViewReused(PhotoToLoad phototoload)
    {
        String s = (String)imageViews.get(phototoload.imageView);
        return s == null || !s.equals(phototoload.url);
    }

}
