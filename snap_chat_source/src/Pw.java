// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import java.io.File;

public class Pw
{

    private static final String TAG = "SaveVideoWithOverlayToGalleryTask";
    public static final String VIDEO_FILE_EXTENSION = ".mp4";
    private final JA mBitmapRecycling;
    private final CameraEventAnalytics mCameraEventAnalytics;
    private final int mCameraOrientationDegrees;
    private final Context mContext;
    private final WP.b mFilter;
    private final boolean mFlipHorizontally;
    public final rx mMediaTransformationCalculator;
    private final boolean mMuted;
    public final File mNewLocation;
    private final Pt mNotifications;
    private final SaveMediaNotificationsToShow mNotificationsToShow;
    private final Bitmap mOverlayBitmap;
    private final double mPlaybackRate;
    private final com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext mSaveSnapContext;
    private final Uri mUri;
    public final rB mVideoTranscoder;

    public Pw(Context context, Uri uri, boolean flag, Bitmap bitmap, WP.b b1, int i, boolean flag1, 
            double d1, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext savesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        File file = new File(Ke.b(), (new StringBuilder()).append(Ke.c()).append(".mp4").toString());
        rB rb = rB.a();
        JA ja = new JA();
        TranscodingPreferencesWrapper.a();
        this(context, uri, flag, bitmap, b1, i, flag1, d1, savesnapcontext, savemedianotificationstoshow, file, rb, ja, CameraEventAnalytics.a(), Pt.a(), new rx());
    }

    private Pw(Context context, Uri uri, boolean flag, Bitmap bitmap, WP.b b1, int i, boolean flag1, 
            double d1, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext savesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow, File file, rB rb, JA ja, 
            CameraEventAnalytics cameraeventanalytics, Pt pt, rx rx1)
    {
        dv.b(TranscodingPreferencesWrapper.c());
        mContext = context;
        mUri = uri;
        mOverlayBitmap = bitmap;
        mFilter = b1;
        mCameraOrientationDegrees = i;
        mFlipHorizontally = flag1;
        mPlaybackRate = d1;
        mSaveSnapContext = savesnapcontext;
        mNotificationsToShow = savemedianotificationstoshow;
        mMuted = flag;
        mNewLocation = file;
        mVideoTranscoder = rb;
        mBitmapRecycling = ja;
        mCameraEventAnalytics = cameraeventanalytics;
        mNotifications = pt;
        mMediaTransformationCalculator = rx1;
    }

    public void a()
    {
        if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
        {
            mNotifications.b();
        }
    }

    public void a(boolean flag)
    {
        if (mOverlayBitmap != null)
        {
            mBitmapRecycling.a(mOverlayBitmap);
        }
        if (flag)
        {
            Ke.a(mContext, mNewLocation);
            b();
            if (mNotificationsToShow == SaveMediaNotificationsToShow.ALL)
            {
                mNotifications.c();
            }
        } else
        {
            c();
            if (mNotificationsToShow != SaveMediaNotificationsToShow.NONE)
            {
                mNotifications.d();
                return;
            }
        }
    }

    public void b()
    {
        if (mSaveSnapContext != null)
        {
            CameraEventAnalytics.a(true, mSaveSnapContext);
        }
    }

    public void c()
    {
        if (mSaveSnapContext != null)
        {
            CameraEventAnalytics.b(true, mSaveSnapContext);
        }
    }

    public final Wt d()
    {
        WK wk = new WK();
        mMediaTransformationCalculator.a(wk, mCameraOrientationDegrees, mFlipHorizontally, 1.0F, 1.0F);
        Bitmap bitmap = rx.a(mOverlayBitmap, mCameraOrientationDegrees, mFlipHorizontally);
        try
        {
            String s = mUri.getPath();
            WP.b b1 = mFilter;
            double d1 = mPlaybackRate;
            WA.b b2 = WA.b.a;
            WA.a a1;
            if (mMuted)
            {
                a1 = WA.a.b;
            } else
            {
                a1 = WA.a.a;
            }
            return new WA(s, wk, bitmap, b1, d1, b2, a1);
        }
        catch (Ws ws)
        {
            throw new Wu(String.format("InvalidMediaException in %s: %s", new Object[] {
                "SaveVideoWithOverlayToGalleryTask", ws.toString()
            }), ws);
        }
    }

    // Unreferenced inner class Pw$1

/* anonymous class */
    public final class _cls1
        implements Wv.a
    {

        final Pw this$0;

        public final void a(Wv.c c1, String s)
        {
            PG.a(c1. new Runnable() {

                final _cls1 this$1;
                final Wv.c val$status;

                public final void run()
                {
    public final class _cls1
        implements Wv.a
    {
                    Pw pw = _fld0;
                    boolean flag;
                    if (status == Wv.c.f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    pw.a(flag);
                }

            
            {
                this$1 = final__pcls1;
                status = Wv.c.this;
                super();
            }
            });
        }

            public 
            {
                this$0 = Pw.this;
                super();
            }
    }

}
