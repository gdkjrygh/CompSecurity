// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import AK;
import Bd;
import Be;
import EV;
import Jo;
import Jy;
import KL;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.snapchat.android.util.debug.ReleaseManager;
import dv;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import vC;

// Referenced classes of package com.snapchat.android.model:
//            MediaMailingMetadata

public abstract class Mediabryo
    implements Comparable
{
    public static final class SnapType extends Enum
    {

        private static final SnapType $VALUES[];
        public static final SnapType CHATMEDIA;
        public static final SnapType DISCOVER;
        public static final SnapType SNAP;
        public static final SnapType STORY_REPLY;
        public static final SnapType TEXT;

        public static SnapType valueOf(String s1)
        {
            return (SnapType)Enum.valueOf(com/snapchat/android/model/Mediabryo$SnapType, s1);
        }

        public static SnapType[] values()
        {
            return (SnapType[])$VALUES.clone();
        }

        static 
        {
            SNAP = new SnapType("SNAP", 0);
            CHATMEDIA = new SnapType("CHATMEDIA", 1);
            DISCOVER = new SnapType("DISCOVER", 2);
            TEXT = new SnapType("TEXT", 3);
            STORY_REPLY = new SnapType("STORY_REPLY", 4);
            $VALUES = (new SnapType[] {
                SNAP, CHATMEDIA, DISCOVER, TEXT, STORY_REPLY
            });
        }

        private SnapType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static abstract class a
    {

        public int mCameraOrientation;
        public String mClientId;
        public int mHeight;
        public boolean mIsFlashOn;
        public boolean mIsFrontFacingSnap;
        public boolean mIsReply;
        public boolean mIsZipUpload;
        public AK mMediaExtras;
        public MediaMailingMetadata mMediaMailingMetadata;
        public boolean mMuted;
        public Bitmap mOverlayBitmap;
        public String mOverlayPath;
        public Be mPreviewConfiguration;
        public Bitmap mRawImageBitmap;
        boolean mShouldEnableSmartFilters;
        public boolean mShouldEnableSponsoredFilters;
        public boolean mShouldEnableVideoSpeedFilters;
        public boolean mShouldEnableVisualFilters;
        public int mSnapOrientation;
        public EV mSnapTrophyMetrics;
        SnapType mSnapType;
        Date mTime;
        public double mTimerValueOrDuration;
        Uri mVideoUri;
        public int mWidth;

        public final a a(Uri uri)
        {
            mVideoUri = (Uri)dv.a(uri);
            return this;
        }

        public final a a(Mediabryo mediabryo)
        {
            mClientId = Mediabryo.a(mediabryo);
            mTime = Mediabryo.b(mediabryo);
            mVideoUri = Mediabryo.c(mediabryo);
            mOverlayBitmap = Mediabryo.d(mediabryo);
            mRawImageBitmap = Mediabryo.e(mediabryo);
            mOverlayPath = Mediabryo.f(mediabryo);
            mPreviewConfiguration = Mediabryo.g(mediabryo);
            mSnapType = Mediabryo.h(mediabryo);
            mIsReply = Mediabryo.i(mediabryo);
            mIsFrontFacingSnap = Mediabryo.j(mediabryo);
            mIsFlashOn = Mediabryo.k(mediabryo);
            mIsZipUpload = Mediabryo.l(mediabryo);
            mCameraOrientation = Mediabryo.m(mediabryo);
            mSnapOrientation = Mediabryo.n(mediabryo);
            mMediaExtras = Mediabryo.o(mediabryo);
            mMediaMailingMetadata = Mediabryo.p(mediabryo).a();
            mTimerValueOrDuration = Mediabryo.q(mediabryo);
            mShouldEnableSmartFilters = Mediabryo.r(mediabryo);
            mShouldEnableVisualFilters = Mediabryo.s(mediabryo);
            mShouldEnableVideoSpeedFilters = Mediabryo.t(mediabryo);
            mShouldEnableSponsoredFilters = Mediabryo.u(mediabryo);
            mSnapTrophyMetrics = Mediabryo.v(mediabryo);
            return this;
        }

        public final a a(String s1)
        {
            mClientId = s1;
            return this;
        }

        public void a()
        {
            if (mSnapType == null)
            {
                throw new IllegalArgumentException("Can't build Mediabryo with null snap type!");
            } else
            {
                return;
            }
        }

        public a b(SnapType snaptype)
        {
            mSnapType = snaptype;
            return this;
        }

        public final a b(String s1)
        {
            try
            {
                mTime = DateFormat.getDateTimeInstance().parse(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (ReleaseManager.e())
                {
                    throw new RuntimeException(s1);
                }
            }
            return this;
        }

        public final a c(String s1)
        {
            if (!TextUtils.isEmpty(s1))
            {
                mVideoUri = Uri.parse(s1);
            }
            return this;
        }

        public a()
        {
            mTime = new Date();
            mIsReply = false;
            mIsFrontFacingSnap = false;
            mIsFlashOn = false;
            mMuted = false;
            mIsZipUpload = false;
            mCameraOrientation = 0;
            mSnapOrientation = 0;
            mShouldEnableSmartFilters = true;
            mShouldEnableVisualFilters = true;
            mShouldEnableVideoSpeedFilters = true;
            mShouldEnableSponsoredFilters = true;
        }
    }


    public final int mCameraOrientation;
    public String mClientId;
    public final int mHeight;
    public final boolean mIsFlashOn;
    public final boolean mIsFrontFacingSnap;
    public final boolean mIsReply;
    public boolean mIsZipUpload;
    private String mIv;
    private String mKey;
    public AK mMediaExtras;
    public final MediaMailingMetadata mMediaMailingMetadata;
    private boolean mMuted;
    public Bitmap mOverlayBitmap;
    public String mOverlayPath;
    public Be mPreviewConfiguration;
    public Bitmap mRawImageBitmap;
    public final boolean mShouldEnableSmartFilters;
    public final boolean mShouldEnableSponsoredFilters;
    public final boolean mShouldEnableVideoSpeedFilters;
    public final boolean mShouldEnableVisualFilters;
    public final int mSnapOrientation;
    public EV mSnapTrophyMetrics;
    public final SnapType mSnapType;
    public final Date mTime;
    public double mTimerValueOrDuration;
    public final Uri mVideoUri;
    public final int mWidth;

    public Mediabryo(a a1)
    {
        mClientId = a1.mClientId;
        mTime = a1.mTime;
        mMuted = a1.mMuted;
        mVideoUri = a1.mVideoUri;
        mOverlayBitmap = a1.mOverlayBitmap;
        mRawImageBitmap = a1.mRawImageBitmap;
        mOverlayPath = a1.mOverlayPath;
        mPreviewConfiguration = a1.mPreviewConfiguration;
        mSnapType = a1.mSnapType;
        mIsReply = a1.mIsReply;
        mIsFrontFacingSnap = a1.mIsFrontFacingSnap;
        mIsFlashOn = a1.mIsFlashOn;
        mIsZipUpload = a1.mIsZipUpload;
        mCameraOrientation = a1.mCameraOrientation;
        mSnapOrientation = a1.mSnapOrientation;
        mMediaExtras = a1.mMediaExtras;
        mTimerValueOrDuration = a1.mTimerValueOrDuration;
        mWidth = a1.mWidth;
        mHeight = a1.mHeight;
        mShouldEnableSmartFilters = a1.mShouldEnableSmartFilters;
        mShouldEnableVisualFilters = a1.mShouldEnableVisualFilters;
        mShouldEnableVideoSpeedFilters = a1.mShouldEnableVideoSpeedFilters;
        mShouldEnableSponsoredFilters = a1.mShouldEnableSponsoredFilters;
        mSnapTrophyMetrics = a1.mSnapTrophyMetrics;
        mKey = KL.a();
        mIv = KL.b();
        if (a1.mMediaMailingMetadata == null)
        {
            if (mSnapType == SnapType.SNAP)
            {
                mMediaMailingMetadata = new Bd();
                return;
            }
            if (mSnapType == SnapType.CHATMEDIA)
            {
                mMediaMailingMetadata = new Bd();
                return;
            }
            if (mSnapType == SnapType.DISCOVER)
            {
                mMediaMailingMetadata = new Bd();
                return;
            } else
            {
                mMediaMailingMetadata = new vC();
                return;
            }
        } else
        {
            mMediaMailingMetadata = a1.mMediaMailingMetadata;
            return;
        }
    }

    static String a(Mediabryo mediabryo)
    {
        return mediabryo.mClientId;
    }

    public static transient void a(Bitmap abitmap[])
    {
        int j1 = abitmap.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Bitmap bitmap = abitmap[i1];
            if (bitmap != null)
            {
                Jy.a().a(bitmap);
            }
        }

    }

    static Date b(Mediabryo mediabryo)
    {
        return mediabryo.mTime;
    }

    static Uri c(Mediabryo mediabryo)
    {
        return mediabryo.mVideoUri;
    }

    static Bitmap d(Mediabryo mediabryo)
    {
        return mediabryo.mOverlayBitmap;
    }

    static Bitmap e(Mediabryo mediabryo)
    {
        return mediabryo.mRawImageBitmap;
    }

    static String f(Mediabryo mediabryo)
    {
        return mediabryo.mOverlayPath;
    }

    static Be g(Mediabryo mediabryo)
    {
        return mediabryo.mPreviewConfiguration;
    }

    static SnapType h(Mediabryo mediabryo)
    {
        return mediabryo.mSnapType;
    }

    static boolean i(Mediabryo mediabryo)
    {
        return mediabryo.mIsReply;
    }

    static boolean j(Mediabryo mediabryo)
    {
        return mediabryo.mIsFrontFacingSnap;
    }

    static boolean k(Mediabryo mediabryo)
    {
        return mediabryo.mIsFlashOn;
    }

    static boolean l(Mediabryo mediabryo)
    {
        return mediabryo.mIsZipUpload;
    }

    static int m(Mediabryo mediabryo)
    {
        return mediabryo.mCameraOrientation;
    }

    static int n(Mediabryo mediabryo)
    {
        return mediabryo.mSnapOrientation;
    }

    static AK o(Mediabryo mediabryo)
    {
        return mediabryo.mMediaExtras;
    }

    static MediaMailingMetadata p(Mediabryo mediabryo)
    {
        return mediabryo.mMediaMailingMetadata;
    }

    static double q(Mediabryo mediabryo)
    {
        return mediabryo.mTimerValueOrDuration;
    }

    static boolean r(Mediabryo mediabryo)
    {
        return mediabryo.mShouldEnableSmartFilters;
    }

    static boolean s(Mediabryo mediabryo)
    {
        return mediabryo.mShouldEnableVisualFilters;
    }

    static boolean t(Mediabryo mediabryo)
    {
        return mediabryo.mShouldEnableVideoSpeedFilters;
    }

    static boolean u(Mediabryo mediabryo)
    {
        return mediabryo.mShouldEnableSponsoredFilters;
    }

    static EV v(Mediabryo mediabryo)
    {
        return mediabryo.mSnapTrophyMetrics;
    }

    public int a(Context context)
    {
        return Jo.e(context);
    }

    public volatile int compareTo(Object obj)
    {
        obj = (Mediabryo)obj;
        return mTime.compareTo(((Mediabryo) (obj)).mTime);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Mediabryo))
            {
                return false;
            }
            obj = (Mediabryo)obj;
            if (mSnapType != ((Mediabryo) (obj)).mSnapType || !mClientId.equals(((Mediabryo) (obj)).mClientId))
            {
                return false;
            }
        }
        return true;
    }

    public abstract byte[] h();

    public int hashCode()
    {
        return mClientId.hashCode();
    }

    public abstract int i();

    public void j()
    {
        mMuted = true;
    }

    public final void k()
    {
        a(new Bitmap[] {
            mOverlayBitmap
        });
        mOverlayBitmap = null;
    }

    public final void l()
    {
        a(new Bitmap[] {
            mRawImageBitmap
        });
        mRawImageBitmap = null;
    }

    public void m()
    {
        a(new Bitmap[] {
            mRawImageBitmap, mOverlayBitmap
        });
        mRawImageBitmap = null;
        mOverlayBitmap = null;
    }

    public boolean n()
    {
        return mMuted;
    }
}
