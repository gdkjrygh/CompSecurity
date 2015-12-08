// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.stories.StoriesThumbnailType;
import com.snapchat.android.util.SnapMediaUtils;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Ie
    implements th.b
{

    static final String CACHED_THUMBNAIL_COUNT = "CachedThumbnails";
    static final String DOWNLOAD_THUMBNAIL_COUNT = "DownloadThumbnails";
    static final String PIE_SLICE_BUILD_TIME_METRIC = "PIE_SLICE_BUILD_TIME";
    private static final String TAG = "BuildPieSliceTask";
    static final String THUMBNAIL_DECRYPT_FAILURE_COUNT = "ThumbnailDecryptFailureCount";
    public static final int THUMBNAIL_SIZE = 102;
    private final Jy mBitmapPool;
    private final Context mContext;
    private final Cf mDownloadContext;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mEasyMetricFactory;
    private final ExecutorService mMiscExecutor;
    private final AtomicInteger mPendingDownloadCount;
    private final AtomicInteger mPendingDownloadRequestsCount;
    protected EasyMetric mPieSliceBuildMetric;
    private final List mStorySnaps;
    private final th mThumbnailDownloader;
    private final StoriesThumbnailType mThumbnailType;

    public Ie(Context context, List list, Jf jf, Cf cf)
    {
        this(context, new th(), Jy.a(), IO.MISCELLANEOUS_EXECUTOR, list, jf, new Eu(), new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory(), cf);
    }

    private Ie(Context context, th th1, Jy jy, ExecutorService executorservice, List list, Jf jf, Eu eu, 
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory, Cf cf)
    {
        mPieSliceBuildMetric = null;
        mStorySnaps = new ArrayList();
        mPendingDownloadRequestsCount = new AtomicInteger(0);
        dv.a(list, "stories is null");
        static final class _cls3
        {

            static final int $SwitchMap$com$snapchat$android$stories$StoriesThumbnailType[];

            static 
            {
                $SwitchMap$com$snapchat$android$stories$StoriesThumbnailType = new int[StoriesThumbnailType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$stories$StoriesThumbnailType[StoriesThumbnailType.ALL_SNAPS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$stories$StoriesThumbnailType[StoriesThumbnailType.NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$stories$StoriesThumbnailType[StoriesThumbnailType.SOME_SNAPS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag, "stories size is 0");
        mContext = (Context)dv.a(context, "context is null");
        mBitmapPool = jy;
        mThumbnailDownloader = th1;
        mMiscExecutor = executorservice;
        mThumbnailType = jf.mType;
        mEasyMetricFactory = easymetricfactory;
        mDownloadContext = cf;
        _cls3..SwitchMap.com.snapchat.android.stories.StoriesThumbnailType[mThumbnailType.ordinal()];
        JVM INSTR tableswitch 1 3: default 148
    //                   1 175
    //                   2 190
    //                   3 211;
           goto _L1 _L2 _L3 _L4
_L1:
        mPendingDownloadCount = new AtomicInteger(mStorySnaps.size());
        return;
_L2:
        mStorySnaps.addAll(list);
        continue; /* Loop/switch isn't completed */
_L3:
        mStorySnaps.add(list.get(0));
        continue; /* Loop/switch isn't completed */
_L4:
        mStorySnaps.addAll(eu.a(list));
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void b(final Bitmap bitmap)
    {
        PG.a(new Runnable() {

            final Ie this$0;
            final Bitmap val$bitmap;

            public final void run()
            {
                a(bitmap);
            }

            
            {
                this$0 = Ie.this;
                bitmap = bitmap1;
                super();
            }
        });
    }

    public final void a()
    {
        if (mStorySnaps.size() == 0)
        {
            b(null);
        } else
        {
            Object obj = mStorySnaps.iterator();
            int j = 0;
            int i = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                Bk bk = (Bk)((Iterator) (obj)).next();
                if (!bk.aC() && bk.aF() != null)
                {
                    i++;
                } else
                {
                    j++;
                }
            }
            if (i > 0)
            {
                mPieSliceBuildMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("PIE_SLICE_BUILD_TIME", 0.10000000000000001D);
                mPieSliceBuildMetric.a("DownloadThumbnails", Integer.valueOf(i));
                mPieSliceBuildMetric.a("CachedThumbnails", Integer.valueOf(j));
                mPieSliceBuildMetric.b();
            }
            obj = new ArrayList();
            for (Iterator iterator = mStorySnaps.iterator(); iterator.hasNext();)
            {
                Bk bk1 = (Bk)iterator.next();
                if (!bk1.aC() && bk1.aF() != null)
                {
                    if (!bk1.mNeedsAuth || i == 1)
                    {
                        mThumbnailDownloader.a(bk1, this, mDownloadContext);
                        mPendingDownloadRequestsCount.incrementAndGet();
                    } else
                    {
                        ((List) (obj)).add(bk1);
                    }
                } else
                {
                    mPendingDownloadRequestsCount.incrementAndGet();
                    a(1);
                }
            }

            if (!((List) (obj)).isEmpty())
            {
                mThumbnailDownloader.a(((java.util.Collection) (obj)), this, mDownloadContext);
                mPendingDownloadRequestsCount.incrementAndGet();
                return;
            }
        }
    }

    public final void a(int i)
    {
        i = mPendingDownloadCount.addAndGet(i * -1);
        int j = mPendingDownloadRequestsCount.decrementAndGet();
        if (i <= 0 && j == 0)
        {
            mMiscExecutor.execute(new Runnable() {

                final Ie this$0;

                public final void run()
                {
                    b();
                }

            
            {
                this$0 = Ie.this;
                super();
            }
            });
            return;
        } else
        {
            Timber.c("BuildPieSliceTask", "Thumbnail downloads not complete for %s: %d thumbnails left, %d requests left", new Object[] {
                mStorySnaps.toString(), Integer.valueOf(mPendingDownloadCount.get()), Integer.valueOf(mPendingDownloadRequestsCount.get())
            });
            return;
        }
    }

    protected abstract void a(Bitmap bitmap);

    protected final void b()
    {
        Timber.c("BuildPieSliceTask", "All thumbnail downloads complete for %d story snaps: %s", new Object[] {
            Integer.valueOf(mStorySnaps.size()), mStorySnaps.toString()
        });
        Bitmap bitmap = mBitmapPool.a(102, 102, android.graphics.Bitmap.Config.ARGB_8888);
        if (bitmap == null)
        {
            bitmap = Bitmap.createBitmap(102, 102, android.graphics.Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Iterator iterator = mStorySnaps.iterator();
        int i = 0;
        int j = 0;
        do
        {
            if (iterator.hasNext())
            {
                Object obj2 = (Bk)iterator.next();
                Object obj = ((Bk) (obj2)).mClientId;
                Object obj1 = Ka.MY_STORY_SNAP_THUMBNAIL_CACHE.a(mContext, ((String) (obj)), null, android.graphics.Bitmap.Config.RGB_565);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = ((Bk) (obj2)).aD();
                    String s = ((Bk) (obj2)).aB();
                    if (s == null)
                    {
                        Timber.e("BuildPieSliceTask", "Failed to load thumbnail for %s from cache because key is null", new Object[] {
                            ((Bk) (obj2)).ab()
                        });
                        continue;
                    }
                    byte abyte0[] = Ka.STORY_SNAP_RECEIVED_THUMBNAIL_CACHE.b(s);
                    if (abyte0 == null)
                    {
                        Timber.e("BuildPieSliceTask", "Failed to load thumbnail for %s with key %s from cache", new Object[] {
                            ((Bk) (obj2)).ab(), s
                        });
                        continue;
                    }
                    try
                    {
                        obj = ((KK) (obj)).b(abyte0, s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        Timber.e("BuildPieSliceTask", "Failed to decrypt thumbnail for %s with key %s from cache", new Object[] {
                            ((Bk) (obj2)).ab(), s
                        });
                        i++;
                        continue;
                    }
                    abyte0 = mContext;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
                    abyte0 = SnapMediaUtils.b(abyte0, ((byte []) (obj))).mBitmap;
                    obj = abyte0;
                    if (abyte0 == null)
                    {
                        Timber.e("BuildPieSliceTask", "Failed to decode thumbnail for %s with key %s from cache", new Object[] {
                            ((Bk) (obj2)).ab(), s
                        });
                        continue;
                    }
                }
                if (((Bitmap) (obj)).getWidth() != 102 || ((Bitmap) (obj)).getHeight() != 102)
                {
                    obj = JC.a(((Bitmap) (obj)), 102, 102, false);
                }
                j = bitmap.getWidth();
                float f;
                Matrix matrix;
                if (102 == j)
                {
                    abyte0 = new RectF(0.0F, 0.0F, j, j);
                } else
                {
                    int k = j / 2;
                    j = k - 51;
                    k += 51;
                    abyte0 = new RectF(j, j, k, k);
                }
                if (mThumbnailType == StoriesThumbnailType.NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY)
                {
                    f = 1.0F;
                } else
                {
                    long l = ((Bk) (obj2)).W();
                    f = (24F - (float)(Long.valueOf((new Date()).getTime()).longValue() - l) / 3600000F) / 24F;
                }
                f = 360F * f;
                obj2 = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
                matrix = new Matrix();
                matrix.setTranslate(((RectF) (abyte0)).left, ((RectF) (abyte0)).top);
                ((BitmapShader) (obj2)).setLocalMatrix(matrix);
                paint.setShader(((android.graphics.Shader) (obj2)));
                canvas.drawArc(abyte0, -90F - f, f, true, paint);
                mBitmapPool.a(((Bitmap) (obj)));
                j = 1;
            } else
            {
                if (mPieSliceBuildMetric != null)
                {
                    mPieSliceBuildMetric.a("ThumbnailDecryptFailureCount", Integer.valueOf(i));
                    mPieSliceBuildMetric.a(false);
                }
                mPieSliceBuildMetric = null;
                if (j != 0)
                {
                    b(bitmap);
                    return;
                }
                b(null);
                return;
            }
        } while (true);
    }
}
