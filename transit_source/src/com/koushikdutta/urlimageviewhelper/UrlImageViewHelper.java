// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            HttpUrlDownloader, ContentUrlDownloader, ContactContentUrlDownloader, AssetUrlDownloader, 
//            FileUrlDownloader, DrawableCache, LruBitmapCache, UrlImageViewCallback, 
//            UrlDownloader

public final class UrlImageViewHelper
{
    private static abstract class Loader
        implements UrlDownloader.UrlDownloaderCallback
    {

        Bitmap result;

        private Loader()
        {
        }

    }

    public static interface RequestPropertiesCallback
    {

        public abstract ArrayList getHeadersForRequest(Context context, String s);
    }

    private static class ZombieDrawable extends BitmapDrawable
    {

        Brains mBrains;
        String mUrl;

        public ZombieDrawable clone(Resources resources)
        {
            return new ZombieDrawable(mUrl, resources, getBitmap(), mBrains);
        }

        protected void finalize()
            throws Throwable
        {
            super.finalize();
            Brains brains = mBrains;
            brains.mRefCounter = brains.mRefCounter - 1;
            if (mBrains.mRefCounter == 0)
            {
                if (!mBrains.mHeadshot)
                {
                    UrlImageViewHelper.mDeadCache.put(mUrl, getBitmap());
                }
                UrlImageViewHelper.mAllCache.remove(getBitmap());
                UrlImageViewHelper.mLiveCache.remove(mUrl);
                UrlImageViewHelper.clog((new StringBuilder()).append("Zombie GC event ").append(mUrl).toString(), new Object[0]);
            }
        }

        public void headshot()
        {
            UrlImageViewHelper.clog((new StringBuilder()).append("BOOM! Headshot: ").append(mUrl).toString(), new Object[0]);
            mBrains.mHeadshot = true;
            UrlImageViewHelper.mLiveCache.remove(mUrl);
            UrlImageViewHelper.mAllCache.remove(getBitmap());
        }

        public ZombieDrawable(String s, Resources resources, Bitmap bitmap)
        {
            this(s, resources, bitmap, new Brains());
        }

        private ZombieDrawable(String s, Resources resources, Bitmap bitmap, Brains brains)
        {
            super(resources, bitmap);
            mUrl = s;
            mBrains = brains;
            UrlImageViewHelper.mAllCache.add(bitmap);
            UrlImageViewHelper.mDeadCache.remove(s);
            UrlImageViewHelper.mLiveCache.put(s, this);
            s = mBrains;
            s.mRefCounter = ((Brains) (s)).mRefCounter + 1;
        }
    }

    private static class ZombieDrawable.Brains
    {

        boolean mHeadshot;
        int mRefCounter;

        private ZombieDrawable.Brains()
        {
        }

    }


    static final boolean $assertionsDisabled;
    public static final int CACHE_DURATION_FIVE_DAYS = 0x19bfcc00;
    public static final int CACHE_DURATION_FOUR_DAYS = 0x14997000;
    public static final int CACHE_DURATION_INFINITE = 0x7fffffff;
    public static final int CACHE_DURATION_ONE_DAY = 0x5265c00;
    public static final int CACHE_DURATION_ONE_WEEK = 0x240c8400;
    public static final int CACHE_DURATION_SIX_DAYS = 0x1ee62800;
    public static final int CACHE_DURATION_THREE_DAYS = 0xf731400;
    public static final int CACHE_DURATION_TWO_DAYS = 0xa4cb800;
    private static HashSet mAllCache = new HashSet();
    private static AssetUrlDownloader mAssetDownloader;
    private static ContactContentUrlDownloader mContactDownloader;
    private static ContentUrlDownloader mContentDownloader;
    private static LruBitmapCache mDeadCache;
    private static ArrayList mDownloaders;
    private static FileUrlDownloader mFileDownloader;
    private static boolean mHasCleaned = false;
    private static HttpUrlDownloader mHttpDownloader;
    private static DrawableCache mLiveCache = DrawableCache.getInstance();
    static DisplayMetrics mMetrics;
    private static Hashtable mPendingDownloads = new Hashtable();
    private static Hashtable mPendingViews = new Hashtable();
    private static RequestPropertiesCallback mRequestPropertiesCallback;
    static Resources mResources;
    private static boolean mUseBitmapScaling = true;

    public UrlImageViewHelper()
    {
    }

    private static boolean checkCacheDuration(File file, long l)
    {
        return l == 0x7fffffffL || System.currentTimeMillis() < file.lastModified() + l;
    }

    public static void cleanup(Context context)
    {
        cleanup(context, 0x240c8400L);
    }

    public static void cleanup(Context context, long l)
    {
        if (!mHasCleaned) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        mHasCleaned = true;
        String as[];
        Object obj;
        int j;
        try
        {
            as = context.getFilesDir().list();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (as == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = as[i];
        if (!((String) (obj)).endsWith(".urlimage"))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append('/').append(((String) (obj))).toString());
        if (System.currentTimeMillis() > ((File) (obj)).lastModified() + l)
        {
            ((File) (obj)).delete();
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    static transient void clog(String s, Object aobj[])
    {
        if (aobj.length == 0)
        {
            return;
        } else
        {
            String.format(s, aobj);
            return;
        }
    }

    public static int copyStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[8192];
        int i = 0;
        do
        {
            int j = inputstream.read(abyte0);
            if (j != -1)
            {
                outputstream.write(abyte0, 0, j);
                i += j;
            } else
            {
                return i;
            }
        } while (true);
    }

    static void executeTask(AsyncTask asynctask)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            asynctask.execute(new Void[0]);
            return;
        } else
        {
            executeTaskHoneycomb(asynctask);
            return;
        }
    }

    private static void executeTaskHoneycomb(AsyncTask asynctask)
    {
        asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static Bitmap getCachedBitmap(String s)
    {
        Bitmap bitmap1;
        if (s == null)
        {
            bitmap1 = null;
        } else
        {
            Bitmap bitmap = null;
            if (mDeadCache != null)
            {
                bitmap = (Bitmap)mDeadCache.get(s);
            }
            bitmap1 = bitmap;
            if (bitmap == null)
            {
                if (mLiveCache != null)
                {
                    s = (Drawable)mLiveCache.get(s);
                    if (s instanceof ZombieDrawable)
                    {
                        return ((ZombieDrawable)s).getBitmap();
                    }
                }
                return null;
            }
        }
        return bitmap1;
    }

    public static ArrayList getDownloaders()
    {
        return mDownloaders;
    }

    public static String getFilenameForUrl(String s)
    {
        return (new StringBuilder()).append(s.hashCode()).append(".urlimage").toString();
    }

    private static int getHeapSize(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 1024 * 1024;
    }

    public static int getPendingDownloads()
    {
        return mPendingDownloads.size();
    }

    public static RequestPropertiesCallback getRequestPropertiesCallback()
    {
        return mRequestPropertiesCallback;
    }

    public static boolean getUseBitmapScaling()
    {
        return mUseBitmapScaling;
    }

    private static boolean isNullOrEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.equals("") || charsequence.equals("null") || charsequence.equals("NULL");
    }

    private static Bitmap loadBitmapFromStream(Context context, String s, String s1, int i, int j)
    {
        Object obj;
        android.graphics.BitmapFactory.Options options;
        android.graphics.BitmapFactory.Options options1;
        Object obj1;
        Object obj2;
        prepareResources(context);
        obj = null;
        obj2 = null;
        options = null;
        options1 = null;
        clog((new StringBuilder()).append("Decoding: ").append(s).append(" ").append(s1).toString(), new Object[0]);
        obj1 = null;
        s = options1;
        context = obj2;
        if (!mUseBitmapScaling) goto _L2; else goto _L1
_L1:
        s = options1;
        context = obj2;
        options1 = new android.graphics.BitmapFactory.Options();
        options1.inJustDecodeBounds = true;
        context = new BufferedInputStream(new FileInputStream(s1), 8192);
        BitmapFactory.decodeStream(context, null, options1);
        context.close();
        int k = 0;
_L12:
        if (options1.outWidth >> k <= i && options1.outHeight >> k <= j) goto _L4; else goto _L3
_L4:
        options = new android.graphics.BitmapFactory.Options();
        s = context;
        obj = context;
        options.inSampleSize = 1 << k;
_L10:
        s = context;
        obj = context;
        s1 = new BufferedInputStream(new FileInputStream(s1), 8192);
        s = s1;
        context = s1;
        obj = BitmapFactory.decodeStream(s1, null, options);
        s = s1;
        context = s1;
        clog(String.format("Loaded bitmap (%dx%d).", new Object[] {
            Integer.valueOf(((Bitmap) (obj)).getWidth()), Integer.valueOf(((Bitmap) (obj)).getHeight())
        }), new Object[0]);
        s = ((String) (obj));
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("UrlImageViewHelper", "Failed to close FileInputStream", context);
                return ((Bitmap) (obj));
            }
            s = ((String) (obj));
        }
_L6:
        return s;
        context;
        context = s;
_L9:
        s = null;
        if (context == null) goto _L6; else goto _L5
_L5:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("UrlImageViewHelper", "Failed to close FileInputStream", context);
            return null;
        }
        return null;
        s;
_L8:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("UrlImageViewHelper", "Failed to close FileInputStream", context);
            }
        }
        throw s;
        s;
        context = options;
        continue; /* Loop/switch isn't completed */
        s;
        continue; /* Loop/switch isn't completed */
        s1;
        context = s;
        s = s1;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        context = ((Context) (obj));
          goto _L9
        s;
          goto _L9
        context;
        context = ((Context) (obj));
          goto _L9
_L2:
        context = null;
        options = obj1;
        if (true) goto _L10; else goto _L3
_L3:
        k++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static void loadUrlDrawable(Context context, String s)
    {
        setUrlDrawable(context, null, s, ((Drawable) (null)), 0xf731400L, null);
    }

    public static void loadUrlDrawable(Context context, String s, long l)
    {
        setUrlDrawable(context, null, s, ((Drawable) (null)), l, null);
    }

    public static void loadUrlDrawable(Context context, String s, long l, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(context, null, s, ((Drawable) (null)), l, urlimageviewcallback);
    }

    public static void loadUrlDrawable(Context context, String s, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(context, null, s, ((Drawable) (null)), 0xf731400L, urlimageviewcallback);
    }

    private static void prepareResources(Context context)
    {
        if (mMetrics != null)
        {
            return;
        } else
        {
            mMetrics = new DisplayMetrics();
            ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
            mResources = new Resources(context.getAssets(), mMetrics, context.getResources().getConfiguration());
            return;
        }
    }

    public static Bitmap remove(String s)
    {
        (new File(getFilenameForUrl(s))).delete();
        s = (Drawable)mLiveCache.remove(s);
        if (s instanceof ZombieDrawable)
        {
            s = (ZombieDrawable)s;
            Bitmap bitmap = s.getBitmap();
            s.headshot();
            return bitmap;
        } else
        {
            return null;
        }
    }

    public static void setRequestPropertiesCallback(RequestPropertiesCallback requestpropertiescallback)
    {
        mRequestPropertiesCallback = requestpropertiescallback;
    }

    private static void setUrlDrawable(Context context, ImageView imageview, String s, int i, long l)
    {
        Drawable drawable = null;
        if (i != 0)
        {
            drawable = imageview.getResources().getDrawable(i);
        }
        setUrlDrawable(context, imageview, s, drawable, l, null);
    }

    private static void setUrlDrawable(Context context, ImageView imageview, String s, int i, long l, UrlImageViewCallback urlimageviewcallback)
    {
        Drawable drawable = null;
        if (i != 0)
        {
            drawable = imageview.getResources().getDrawable(i);
        }
        setUrlDrawable(context, imageview, s, drawable, l, urlimageviewcallback);
    }

    private static void setUrlDrawable(Context context, ImageView imageview, String s, Drawable drawable, long l, UrlImageViewCallback urlimageviewcallback)
    {
        if (!$assertionsDisabled && Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            throw new AssertionError("setUrlDrawable and loadUrlDrawable should only be called from the main thread.");
        }
        cleanup(context);
        if (!isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        if (imageview != null)
        {
            mPendingViews.remove(imageview);
            imageview.setImageDrawable(drawable);
        }
_L4:
        return;
_L2:
        String s1;
        File file;
        int i;
        int j;
        Object obj;
        Bitmap bitmap;
label0:
        {
            if (mMetrics == null)
            {
                prepareResources(context);
            }
            i = mMetrics.widthPixels;
            j = mMetrics.heightPixels;
            s1 = context.getFileStreamPath(getFilenameForUrl(s)).getAbsolutePath();
            file = new File(s1);
            if (mDeadCache == null)
            {
                mDeadCache = new LruBitmapCache(getHeapSize(context) / 8);
            }
            Drawable drawable1 = null;
            Bitmap bitmap1 = (Bitmap)mDeadCache.remove(s);
            if (bitmap1 != null)
            {
                clog((new StringBuilder()).append("zombie load: ").append(s).toString(), new Object[0]);
            } else
            {
                drawable1 = (Drawable)mLiveCache.get(s);
            }
            if (drawable1 == null)
            {
                bitmap = bitmap1;
                obj = drawable1;
                if (bitmap1 == null)
                {
                    break label0;
                }
            }
            clog((new StringBuilder()).append("Cache hit on: ").append(s).toString(), new Object[0]);
            if (file.exists() && !checkCacheDuration(file, l))
            {
                clog((new StringBuilder()).append("Cache hit, but file is stale. Forcing reload: ").append(s).toString(), new Object[0]);
                if (drawable1 != null && (drawable1 instanceof ZombieDrawable))
                {
                    ((ZombieDrawable)drawable1).headshot();
                }
                obj = null;
                bitmap = null;
            } else
            {
                clog((new StringBuilder()).append("Using cached: ").append(s).toString(), new Object[0]);
                bitmap = bitmap1;
                obj = drawable1;
            }
        }
        if (obj == null && bitmap == null)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        context = ((Context) (obj));
        if (imageview == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        mPendingViews.remove(imageview);
        if (obj instanceof ZombieDrawable)
        {
            obj = ((ZombieDrawable)obj).clone(mResources);
        } else
        if (bitmap != null)
        {
            obj = new ZombieDrawable(s, mResources, bitmap);
        }
        imageview.setImageDrawable(((Drawable) (obj)));
        context = ((Context) (obj));
        if (urlimageviewcallback == null) goto _L4; else goto _L3
_L3:
        drawable = bitmap;
        if (bitmap == null)
        {
            drawable = bitmap;
            if (context instanceof ZombieDrawable)
            {
                drawable = ((ZombieDrawable)context).getBitmap();
            }
        }
        urlimageviewcallback.onLoaded(imageview, drawable, s, true);
        return;
        clog((new StringBuilder()).append("Waiting for ").append(s).append(" ").append(imageview).toString(), new Object[0]);
        if (imageview != null)
        {
            imageview.setImageDrawable(drawable);
            mPendingViews.put(imageview, s);
        }
        ArrayList arraylist = (ArrayList)mPendingDownloads.get(s);
        if (arraylist == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (imageview != null)
        {
            arraylist.add(imageview);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        Loader loader;
        ArrayList arraylist1 = new ArrayList();
        if (imageview != null)
        {
            arraylist1.add(imageview);
        }
        mPendingDownloads.put(s, arraylist1);
        if (i <= 0)
        {
            i = 0x7fffffff;
        }
        if (j <= 0)
        {
            j = 0x7fffffff;
        }
        loader = new Loader(s1, context, s, i, j) {

            static final boolean $assertionsDisabled;
            final Context val$context;
            final String val$filename;
            final int val$targetHeight;
            final int val$targetWidth;
            final String val$url;

            public void onDownloadComplete(UrlDownloader urldownloader1, InputStream inputstream, String s2)
            {
                if ($assertionsDisabled || inputstream == null || s2 == null) goto _L2; else goto _L1
_L1:
                String s3;
                try
                {
                    throw new AssertionError();
                }
                // Misplaced declaration of an exception variable
                catch (InputStream inputstream) { }
                finally { }
_L10:
                (new File(filename)).delete();
                if (urldownloader1 != null && !urldownloader1.allowCache())
                {
                    (new File(filename)).delete();
                }
_L8:
                return;
_L2:
                if (inputstream == null && s2 == null)
                {
                    if (urldownloader1 != null && !urldownloader1.allowCache())
                    {
                        (new File(filename)).delete();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
                }
                s3 = filename;
                if (inputstream == null) goto _L4; else goto _L3
_L3:
                inputstream = new BufferedInputStream(inputstream, 8192);
                s2 = new BufferedOutputStream(new FileOutputStream(filename), 8192);
                UrlImageViewHelper.copyStream(inputstream, s2);
                s2.close();
                inputstream = s3;
_L6:
                result = UrlImageViewHelper.loadBitmapFromStream(context, url, inputstream, targetWidth, targetHeight);
                if (urldownloader1 != null && !urldownloader1.allowCache())
                {
                    (new File(filename)).delete();
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L4:
                inputstream = s2;
                if (true) goto _L6; else goto _L5
_L5:
                if (urldownloader1 != null && !urldownloader1.allowCache())
                {
                    (new File(filename)).delete();
                }
                throw inputstream;
                if (true) goto _L8; else goto _L7
_L7:
                inputstream;
                  goto _L5
                inputstream;
                if (true) goto _L10; else goto _L9
_L9:
            }

            static 
            {
                boolean flag;
                if (!com/koushikdutta/urlimageviewhelper/UrlImageViewHelper.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                filename = s;
                context = context1;
                url = s1;
                targetWidth = i;
                targetHeight = j;
                super();
            }
        };
        urlimageviewcallback = new Runnable(loader, s, drawable, urlimageviewcallback, imageview, arraylist1) {

            static final boolean $assertionsDisabled;
            final UrlImageViewCallback val$callback;
            final Drawable val$defaultDrawable;
            final ArrayList val$downloads;
            final ImageView val$imageView;
            final Loader val$loader;
            final String val$url;

            public void run()
            {
                if (!$assertionsDisabled && !Looper.myLooper().equals(Looper.getMainLooper()))
                {
                    throw new AssertionError();
                }
                Object obj2 = loader.result;
                Object obj1 = null;
                if (obj2 != null)
                {
                    obj1 = new ZombieDrawable(url, UrlImageViewHelper.mResources, ((Bitmap) (obj2)));
                }
                obj2 = obj1;
                if (obj1 == null)
                {
                    UrlImageViewHelper.clog((new StringBuilder()).append("No usable result, defaulting ").append(url).toString(), new Object[0]);
                    obj2 = defaultDrawable;
                    UrlImageViewHelper.mLiveCache.put(url, obj2);
                }
                UrlImageViewHelper.mPendingDownloads.remove(url);
                if (callback != null && imageView == null)
                {
                    callback.onLoaded(null, loader.result, url, false);
                }
                int k = 0;
                obj1 = downloads.iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ImageView imageview1 = (ImageView)((Iterator) (obj1)).next();
                    String s2 = (String)UrlImageViewHelper.mPendingViews.get(imageview1);
                    if (!url.equals(s2))
                    {
                        UrlImageViewHelper.clog((new StringBuilder()).append("Ignoring out of date request to update view for ").append(url).append(" ").append(s2).append(" ").append(imageview1).toString(), new Object[0]);
                    } else
                    {
                        int i1 = k + 1;
                        UrlImageViewHelper.mPendingViews.remove(imageview1);
                        if (obj2 != null)
                        {
                            imageview1.setImageDrawable(((Drawable) (obj2)));
                        }
                        k = i1;
                        if (callback != null)
                        {
                            k = i1;
                            if (imageview1 == imageView)
                            {
                                callback.onLoaded(imageview1, loader.result, url, false);
                                k = i1;
                            }
                        }
                    }
                } while (true);
                UrlImageViewHelper.clog((new StringBuilder()).append("Populated: ").append(k).toString(), new Object[0]);
            }

            static 
            {
                boolean flag;
                if (!com/koushikdutta/urlimageviewhelper/UrlImageViewHelper.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                loader = loader1;
                url = s;
                defaultDrawable = drawable;
                callback = urlimageviewcallback;
                imageView = imageview;
                downloads = arraylist;
                super();
            }
        };
        if (!file.exists()) goto _L7; else goto _L6
_L6:
        Exception exception;
        if (checkCacheDuration(file, l))
        {
            clog((new StringBuilder()).append("File Cache hit on: ").append(s).append(". ").append(System.currentTimeMillis() - file.lastModified()).append("ms old.").toString(), new Object[0]);
            executeTask(new AsyncTask(loader, s1, urlimageviewcallback) {

                final Runnable val$completion;
                final String val$filename;
                final Loader val$loader;

                protected volatile Object doInBackground(Object aobj[])
                {
                    return doInBackground((Void[])aobj);
                }

                protected transient Void doInBackground(Void avoid[])
                {
                    loader.onDownloadComplete(null, null, filename);
                    return null;
                }

                protected volatile void onPostExecute(Object obj1)
                {
                    onPostExecute((Void)obj1);
                }

                protected void onPostExecute(Void void1)
                {
                    completion.run();
                }

            
            {
                loader = loader1;
                filename = s;
                completion = runnable;
                super();
            }
            });
            return;
        }
          goto _L8
_L7:
        Iterator iterator = mDownloaders.iterator();
        UrlDownloader urldownloader;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            urldownloader = (UrlDownloader)iterator.next();
        } while (!urldownloader.canDownloadUrl(s));
        urldownloader.download(context, s, s1, loader, urlimageviewcallback);
        return;
_L8:
        try
        {
            clog("File cache has expired. Refreshing.", new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
        if (true) goto _L7; else goto _L9
_L9:
        imageview.setImageDrawable(drawable);
        return;
    }

    public static void setUrlDrawable(ImageView imageview, String s)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, ((Drawable) (null)), 0xf731400L, null);
    }

    public static void setUrlDrawable(ImageView imageview, String s, int i)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, i, 0xf731400L);
    }

    public static void setUrlDrawable(ImageView imageview, String s, int i, long l)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, i, l);
    }

    public static void setUrlDrawable(ImageView imageview, String s, int i, long l, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, i, l, urlimageviewcallback);
    }

    public static void setUrlDrawable(ImageView imageview, String s, int i, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, i, 0xf731400L, urlimageviewcallback);
    }

    public static void setUrlDrawable(ImageView imageview, String s, Drawable drawable)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, drawable, 0xf731400L, null);
    }

    public static void setUrlDrawable(ImageView imageview, String s, Drawable drawable, long l)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, drawable, l, null);
    }

    public static void setUrlDrawable(ImageView imageview, String s, Drawable drawable, long l, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, drawable, l, urlimageviewcallback);
    }

    public static void setUrlDrawable(ImageView imageview, String s, Drawable drawable, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, drawable, 0xf731400L, urlimageviewcallback);
    }

    public static void setUrlDrawable(ImageView imageview, String s, UrlImageViewCallback urlimageviewcallback)
    {
        setUrlDrawable(imageview.getContext(), imageview, s, ((Drawable) (null)), 0xf731400L, urlimageviewcallback);
    }

    public static void setUseBitmapScaling(boolean flag)
    {
        mUseBitmapScaling = flag;
    }

    static 
    {
        boolean flag;
        if (!com/koushikdutta/urlimageviewhelper/UrlImageViewHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        mHttpDownloader = new HttpUrlDownloader();
        mContentDownloader = new ContentUrlDownloader();
        mContactDownloader = new ContactContentUrlDownloader();
        mAssetDownloader = new AssetUrlDownloader();
        mFileDownloader = new FileUrlDownloader();
        mDownloaders = new ArrayList();
        mDownloaders.add(mHttpDownloader);
        mDownloaders.add(mContactDownloader);
        mDownloaders.add(mContentDownloader);
        mDownloaders.add(mAssetDownloader);
        mDownloaders.add(mFileDownloader);
    }






}
