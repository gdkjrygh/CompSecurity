// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;

import Bk;
import Ke;
import Kn;
import LB;
import PB;
import PG;
import Pt;
import Pu;
import VX;
import Wt;
import Wu;
import Wv;
import Wx;
import Wz;
import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.AsyncTask;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.model.StorySnapLogbook;
import dv;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lG;
import ls;
import rB;
import rG;
import rH;
import rK;
import rx;

// Referenced classes of package com.snapchat.android.util.save:
//            SaveMediaNotificationsToShow

public final class SaveStoryToGalleryTask extends AsyncTask
{
    public static final class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result FAILED_ALREADY_SAVING;
        public static final Result FAILED_DURING_TRANSCODER_SETUP;
        public static final Result FAILED_DURING_TRANSCODING;
        public static final Result FAILED_INITIALIZING_MEDIA_SOURCES;
        public static final Result FAILED_INTERRUPTED;
        public static final Result FAILED_SNAPS_DID_NOT_LOAD_IN_TIME;
        public static final Result FAILED_SNAPS_NOT_ALL_LOADED;
        public static final Result FAILED_SSTG_DISABLED;
        public static final Result INIT;
        public static final Result STARTED;
        public static final Result SUCCESS;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/snapchat/android/util/save/SaveStoryToGalleryTask$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        static 
        {
            INIT = new Result("INIT", 0);
            STARTED = new Result("STARTED", 1);
            SUCCESS = new Result("SUCCESS", 2);
            FAILED_SSTG_DISABLED = new Result("FAILED_SSTG_DISABLED", 3);
            FAILED_ALREADY_SAVING = new Result("FAILED_ALREADY_SAVING", 4);
            FAILED_SNAPS_NOT_ALL_LOADED = new Result("FAILED_SNAPS_NOT_ALL_LOADED", 5);
            FAILED_INITIALIZING_MEDIA_SOURCES = new Result("FAILED_INITIALIZING_MEDIA_SOURCES", 6);
            FAILED_INTERRUPTED = new Result("FAILED_INTERRUPTED", 7);
            FAILED_DURING_TRANSCODER_SETUP = new Result("FAILED_DURING_TRANSCODER_SETUP", 8);
            FAILED_DURING_TRANSCODING = new Result("FAILED_DURING_TRANSCODING", 9);
            FAILED_SNAPS_DID_NOT_LOAD_IN_TIME = new Result("FAILED_SNAPS_DID_NOT_LOAD_IN_TIME", 10);
            $VALUES = (new Result[] {
                INIT, STARTED, SUCCESS, FAILED_SSTG_DISABLED, FAILED_ALREADY_SAVING, FAILED_SNAPS_NOT_ALL_LOADED, FAILED_INITIALIZING_MEDIA_SOURCES, FAILED_INTERRUPTED, FAILED_DURING_TRANSCODER_SETUP, FAILED_DURING_TRANSCODING, 
                FAILED_SNAPS_DID_NOT_LOAD_IN_TIME
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }

    final class a
        implements Wv.a
    {

        final SaveStoryToGalleryTask this$0;
        final Object val$transcodingDoneSynchronizationObject;

        public final void a(Wv.c c, String s)
        {
            if (c == Wv.c.f)
            {
                Timber.c("SaveStoryToGalleryTask", (new StringBuilder("Transcoding finished. Status: , ")).append(s).toString(), new Object[0]);
            } else
            {
                Timber.e("SaveStoryToGalleryTask", (new StringBuilder("Transcoding failed. Status: , ")).append(s).toString(), new Object[0]);
            }
            synchronized (transcodingDoneSynchronizationObject)
            {
                transcodingDoneSynchronizationObject.notify();
            }
            return;
            s;
            c;
            JVM INSTR monitorexit ;
            throw s;
        }

        a()
        {
            this$0 = SaveStoryToGalleryTask.this;
            transcodingDoneSynchronizationObject = obj;
            super();
        }
    }

    final class b
        implements Wv.b
    {

        final SaveStoryToGalleryTask this$0;

        public final void a(int i)
        {
            i = Math.min(100, SaveStoryToGalleryTask.a(SaveStoryToGalleryTask.this) + (SaveStoryToGalleryTask.b(SaveStoryToGalleryTask.this) * i) / 100);
            SaveStoryToGalleryTask.a(SaveStoryToGalleryTask.this, new Integer[] {
                Integer.valueOf(i)
            });
        }

        b()
        {
            this$0 = SaveStoryToGalleryTask.this;
            super();
        }
    }


    private static final int MAX_INITIALIZATION_PROGRESS_PERCENT = 5;
    private static final String TAG = "SaveStoryToGalleryTask";
    private final ls mAnalytics;
    private final PB mClock;
    private final Context mContext;
    private boolean mDidSetupSucceed;
    private long mEndTimeMs;
    private final LB mExceptionReporter;
    private final int mInitializationProgressPercent;
    private final Pu mMediaSourceFactory;
    private final Pt mNotifications;
    private final SaveMediaNotificationsToShow mNotificationsToShow;
    private Result mResult;
    private final rG mSavingAudioEncoderConfiguration;
    private final rH mSavingVideoEncoderConfiguration;
    private long mStartTimeMs;
    private final StoryGroup mStoryGroup;
    private final List mStorySnapLogbooks;
    private Bk mStorySnaps[];
    private final int mTranscodingProgressPercent;
    private Wz mTranscodingTask;
    private final rB mVideoTranscoder;

    public SaveStoryToGalleryTask(Context context, StoryGroup storygroup, List list, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        this(rB.a(), new PB(), ls.a(), new LB(), new Pu(context), context, storygroup, list, savemedianotificationstoshow, Pt.a(), new rH(), new rG());
    }

    private SaveStoryToGalleryTask(rB rb, PB pb, ls ls1, LB lb, Pu pu, Context context, StoryGroup storygroup, 
            List list, SaveMediaNotificationsToShow savemedianotificationstoshow, Pt pt, rH rh, rG rg)
    {
        mDidSetupSucceed = true;
        mResult = Result.INIT;
        mVideoTranscoder = (rB)dv.a(rb);
        mClock = (PB)dv.a(pb);
        mAnalytics = (ls)dv.a(ls1);
        mExceptionReporter = (LB)dv.a(lb);
        mMediaSourceFactory = (Pu)dv.a(pu);
        mContext = (Context)dv.a(context);
        mStoryGroup = (StoryGroup)dv.a(storygroup);
        mStorySnapLogbooks = (List)dv.a(list);
        mNotificationsToShow = (SaveMediaNotificationsToShow)dv.a(savemedianotificationstoshow);
        mNotifications = (Pt)dv.a(pt);
        mSavingVideoEncoderConfiguration = rh;
        mSavingAudioEncoderConfiguration = rg;
        mInitializationProgressPercent = Math.min(mStorySnapLogbooks.size(), 5);
        mTranscodingProgressPercent = 100 - mInitializationProgressPercent;
    }

    static int a(SaveStoryToGalleryTask savestorytogallerytask)
    {
        return savestorytogallerytask.mInitializationProgressPercent;
    }

    private transient Boolean a()
    {
        Object obj1;
        if (!mDidSetupSucceed)
        {
            return Boolean.valueOf(false);
        }
        obj1 = Kn.a().b().getAbsolutePath();
        rK rk;
        rk = (new rK()).a(((String) (obj1)));
        rk.a = mSavingVideoEncoderConfiguration;
        rk.b = mSavingAudioEncoderConfiguration;
        rk.d = mMediaSourceFactory.mMediaTransformationCalculator.a;
        int i = 0;
_L5:
        if (i >= mStorySnaps.length) goto _L2; else goto _L1
_L1:
        final Object transcodingDoneSynchronizationObject;
        Bk bk;
        transcodingDoneSynchronizationObject = mMediaSourceFactory;
        bk = mStorySnaps[i];
        ((Pu) (transcodingDoneSynchronizationObject)).e();
        Object obj;
        int j;
        if (bk != null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        try
        {
            throw new NullPointerException("storySnap is null");
        }
        // Misplaced declaration of an exception variable
        catch (final Object transcodingDoneSynchronizationObject) { }
        finally
        {
            mMediaSourceFactory.d();
        }
        a("There was a setup issue with the transcoding operation", ((Exception) (transcodingDoneSynchronizationObject)));
        mResult = Result.FAILED_DURING_TRANSCODER_SETUP;
        mMediaSourceFactory.d();
        return Boolean.valueOf(false);
        PG.b();
        j = bk.am();
        if (j != 0) goto _L4; else goto _L3
_L3:
        transcodingDoneSynchronizationObject = ((Pu) (transcodingDoneSynchronizationObject)).a(bk);
_L6:
        rk.a(((Wt) (transcodingDoneSynchronizationObject)));
        publishProgress(new Integer[] {
            Integer.valueOf(((i + 1) * mInitializationProgressPercent) / mStorySnaps.length)
        });
        i++;
          goto _L5
_L8:
        transcodingDoneSynchronizationObject = ((Pu) (transcodingDoneSynchronizationObject)).b(bk);
          goto _L6
_L9:
        throw new IllegalStateException((new StringBuilder("Unexpected media type: ")).append(j).toString());
        if (true) goto _L5; else goto _L7
_L7:
        throw obj;
_L2:
        publishProgress(new Integer[] {
            Integer.valueOf(mInitializationProgressPercent)
        });
        mTranscodingTask = rk.a();
        obj = new Object();
        mVideoTranscoder.a(mTranscodingTask, new a(), new b());
        PG.b();
        obj;
        JVM INSTR monitorenter ;
        obj.wait();
        obj;
        JVM INSTR monitorexit ;
        if (((Wv) (mTranscodingTask)).d == Wv.c.f)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        a("Transcoding failed!", ((Exception) (null)));
        mResult = Result.FAILED_DURING_TRANSCODING;
        mMediaSourceFactory.d();
        return Boolean.valueOf(false);
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        a("Failed to wait for transcoding synchronization object to fire", ((Exception) (obj)));
        mResult = Result.FAILED_INTERRUPTED;
        mMediaSourceFactory.d();
        return Boolean.valueOf(false);
        Ke.a(mContext, Uri.parse(((String) (obj1))));
        mMediaSourceFactory.d();
        return Boolean.valueOf(true);
_L4:
        if (j != 1 && j != 2) goto _L9; else goto _L8
    }

    static void a(SaveStoryToGalleryTask savestorytogallerytask, Object aobj[])
    {
        savestorytogallerytask.publishProgress(aobj);
    }

    private void a(String s, Exception exception)
    {
        if (exception != null)
        {
            Timber.e("SaveStoryToGalleryTask", s, new Object[] {
                exception
            });
            s = new lG(s, exception);
        } else
        {
            Timber.e("SaveStoryToGalleryTask", s, new Object[0]);
            s = new lG(s);
        }
        mExceptionReporter.a(s);
    }

    static int b(SaveStoryToGalleryTask savestorytogallerytask)
    {
        return savestorytogallerytask.mTranscodingProgressPercent;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        long l2 = 0L;
        boolean flag2 = true;
        Boolean boolean1 = (Boolean)obj;
        for (obj = mStorySnapLogbooks.iterator(); ((Iterator) (obj)).hasNext();)
        {
            ((StorySnapLogbook)((Iterator) (obj)).next()).mIsDeletingAllowed = true;
        }

        mEndTimeMs = System.currentTimeMillis();
        if (boolean1.booleanValue())
        {
            mResult = Result.SUCCESS;
        }
        obj = mStorySnapLogbooks.iterator();
        int i = 0;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Bk bk = ((StorySnapLogbook)((Iterator) (obj)).next()).mStorySnap;
            boolean flag;
            if (bk.ak() || bk.al())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i++;
            }
        } while (true);
        obj = mStorySnapLogbooks.iterator();
        int k = 0;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Bk bk1 = ((StorySnapLogbook)((Iterator) (obj)).next()).mStorySnap;
            boolean flag1;
            if (bk1.ak() || bk1.al())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                k++;
            }
        } while (true);
        Result result;
        Wx wx;
        EasyMetric easymetric;
        long l1;
        if (mResult != Result.SUCCESS)
        {
            l1 = 0L;
        } else
        {
            l1 = mEndTimeMs - mStartTimeMs;
        }
        result = mResult;
        if (mTranscodingTask != null)
        {
            obj = ((Wv) (mTranscodingTask)).d;
        } else
        {
            obj = Wv.c.a;
        }
        wx = mTranscodingTask.b;
        easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SAVE_ENTIRE_STORY");
        if (result != Result.SUCCESS)
        {
            flag2 = false;
        }
        obj = easymetric.a("success", Boolean.valueOf(flag2)).a("reason", result.name()).a("transcoding_status", ((Wv.c) (obj)).name()).a("count", Integer.valueOf(i + k)).a("video_count", Integer.valueOf(i)).a("image_count", Integer.valueOf(k)).a("save_story_time", Long.valueOf(l1));
        if (wx != null)
        {
            Wt awt[] = wx.a;
            int l = awt.length;
            int j = 0;
            l1 = l2;
            for (; j < l; j++)
            {
                l1 += awt[j].a();
            }

            ((EasyMetric) (obj)).a("media_duration", Long.valueOf(l1));
            MediaFormat mediaformat = wx.c.b;
            ((EasyMetric) (obj)).a("video_width", Integer.valueOf(mediaformat.getInteger("width"))).a("video_height", Integer.valueOf(mediaformat.getInteger("height"))).a("video_bitrate", Integer.valueOf(mediaformat.getInteger("bitrate"))).a("video_framerate", Integer.valueOf(mediaformat.getInteger("frame-rate")));
        }
        ((EasyMetric) (obj)).a(false);
        if (boolean1.booleanValue())
        {
            if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
            {
                mNotifications.c();
            }
            mStoryGroup.a(com.snapchat.android.model.StoryGroup.ActionState.SAVED);
            return;
        }
        if (mNotificationsToShow != SaveMediaNotificationsToShow.NONE)
        {
            mNotifications.d();
        }
        mStoryGroup.a(com.snapchat.android.model.StoryGroup.ActionState.READY);
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
        if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
        {
            mNotifications.b();
        }
        mResult = Result.STARTED;
        mStartTimeMs = System.currentTimeMillis();
        mStoryGroup.a(com.snapchat.android.model.StoryGroup.ActionState.SAVING);
        mStoryGroup.a(0);
        for (Iterator iterator = mStorySnapLogbooks.iterator(); iterator.hasNext();)
        {
            ((StorySnapLogbook)iterator.next()).mIsDeletingAllowed = false;
        }

        Collections.sort(mStorySnapLogbooks, new Comparator() {

            final SaveStoryToGalleryTask this$0;

            public final int compare(Object obj, Object obj1)
            {
                obj = (StorySnapLogbook)obj;
                obj1 = (StorySnapLogbook)obj1;
                if (((StorySnapLogbook) (obj)).mStorySnap.W() < ((StorySnapLogbook) (obj1)).mStorySnap.W())
                {
                    return -1;
                }
                return ((StorySnapLogbook) (obj)).mStorySnap.W() <= ((StorySnapLogbook) (obj1)).mStorySnap.W() ? 0 : 1;
            }

            
            {
                this$0 = SaveStoryToGalleryTask.this;
                super();
            }
        });
        mStorySnaps = new Bk[mStorySnapLogbooks.size()];
        Iterator iterator1 = mStorySnapLogbooks.iterator();
        int i = 0;
        do
        {
            Bk bk;
label0:
            {
                if (iterator1.hasNext())
                {
                    bk = ((StorySnapLogbook)iterator1.next()).mStorySnap;
                    if (bk.O())
                    {
                        break label0;
                    }
                    a((new StringBuilder("Story snap is not loaded: ")).append(bk.at()).toString(), ((Exception) (null)));
                    mResult = Result.FAILED_SNAPS_NOT_ALL_LOADED;
                    mDidSetupSucceed = false;
                }
                return;
            }
            mStorySnaps[i] = bk;
            i++;
        } while (true);
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (Integer[])aobj;
        super.onProgressUpdate(aobj);
        int i = ((Integer) (aobj[0])).intValue();
        mStoryGroup.a(i);
    }
}
