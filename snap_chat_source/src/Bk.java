// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Bk extends AT
{
    public static interface a
        extends Annotation
    {
    }


    private static final String AUTH_STORY_DOWNLOAD_ENDPOINT = "/bq/auth_story_blobs";
    private static final String AUTH_THUMBNAIL_DOWNLOAD_ENDPOINT = "/bq/auth_story_thumbnails";
    public static final int IS_EXPLORABLE = 0;
    public static final int IS_NOT_EXPLORABLE = 1;
    private static final String TAG = "StorySnap";
    public static final int UNKNOWN_IF_EXPLORABLE = 2;
    private Qa mAdPlacementMetadata;
    public boolean mCanAdFollow;
    public String mClientId;
    public Cf mDownloadContext;
    public long mExpirationTimestamp;
    public int mExplorableStatus;
    public boolean mFailed;
    public boolean mHasBeenViewed;
    public boolean mIsShared;
    public boolean mIsSponsored;
    public StoryLoadingContext mLoadingContext;
    public String mMediaId;
    private String mMediaUrl;
    public boolean mNeedsAuth;
    public List mParentIds;
    public String mPostedStoryId;
    public String mSponsoredSlugPosAndText;
    private final Bg mSponsoredSlugUtils;
    public String mStoryFilterId;
    public String mStoryUnlockables;
    private final transient Jg mStoryUtils;
    private String mThumbnailIv;
    private String mThumbnailUrl;
    private long mTimeToExpiration;
    public long mTimeToKnownExplorableStatusMs;
    private final Bn mUnlockablesUtils;
    public String mUsername;
    public boolean mWas404ResponseReceived;

    public Bk()
    {
        mSponsoredSlugPosAndText = "{}";
        mLoadingContext = StoryLoadingContext.ALREADY_LOADED;
        mParentIds = new ArrayList();
        mExplorableStatus = 2;
        mTimeToKnownExplorableStatusMs = 0L;
        mStoryUtils = new Jg();
        SnapchatApplication.getDIComponent().a(this);
        mSponsoredSlugUtils = Bg.a();
        mUnlockablesUtils = Bn.a();
    }

    public Bk(AA aa, String s, String s1)
    {
        this();
        mPostedStoryId = s;
        mUsername = s1;
        mClientId = ((Mediabryo) (aa)).mClientId;
        mCaptionText = aa.mCaptionText;
        mMediaType = aa.i();
        boolean flag;
        if (((Mediabryo) (aa)).mMediaMailingMetadata.mPostStatus == com.snapchat.android.model.MediaMailingMetadata.PostStatus.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mFailed = flag;
        mZipped = ((Mediabryo) (aa)).mIsZipUpload;
        mTimestamp = ((Mediabryo) (aa)).mTime.getTime();
        mCanonicalDisplayTime = ((Mediabryo) (aa)).mTimerValueOrDuration;
    }

    public Bk(SM sm)
    {
        this();
        mUsername = sm.b();
        mId = sm.a();
        mClientId = sm.c();
        mMediaId = sm.e();
        mTimestamp = sm.d().longValue();
        mMediaType = sm.k().intValue();
        mMediaUrl = sm.g();
        mMediaIv = sm.h();
        mMediaKey = sm.f();
        mThumbnailIv = sm.i();
        mThumbnailUrl = sm.j();
        mCanonicalDisplayTime = sm.l().doubleValue();
        mCaptionText = sm.n();
        mZipped = sm.o().booleanValue();
        mFilterId = sm.p();
        mIsShared = IJ.a(sm.s());
        mNeedsAuth = IJ.a(sm.u());
        mCanAdFollow = IJ.a(sm.v());
        mTimeToExpiration = sm.m().longValue();
        mAdPlacementMetadata = sm.t();
        mStoryFilterId = sm.r();
        Object obj = mUnlockablesUtils;
        List list = sm.q();
        if (list != null)
        {
            obj = ((Bn) (obj)).mGson.toJson(list);
        } else
        {
            obj = "";
        }
        mStoryUnlockables = ((String) (obj));
        if (sm.x())
        {
            mIsSponsored = sm.w().booleanValue();
        } else
        {
            mIsSponsored = false;
        }
        if (sm.z())
        {
            obj = mSponsoredSlugUtils;
            sm = sm.y();
            if (sm != null)
            {
                sm = ((Bg) (obj)).mGson.toJson(sm);
            } else
            {
                sm = "{}";
            }
            mSponsoredSlugPosAndText = sm;
        }
    }

    public Bk(String s, String s1, String s2, long l, long l1, 
            int k, String s3, String s4, com.snapchat.android.model.Snap.ClientSnapStatus clientsnapstatus, String s5, int i1, String s6, 
            boolean flag, boolean flag1, boolean flag2, boolean flag3, String s7, boolean flag4, boolean flag5, 
            boolean flag6, boolean flag7, long l2, String s8, String s9, boolean flag8, 
            String s10)
    {
        this();
        mId = s;
        mClientId = s1;
        mMediaId = s2;
        mTimestamp = l;
        mViewedTimestamp = l1;
        mMediaType = k;
        mMediaUrl = s3;
        mThumbnailUrl = s4;
        mClientSnapStatus = clientsnapstatus;
        mUsername = s5;
        mCanonicalDisplayTime = i1;
        mCaptionText = s6;
        mHasBeenViewed = flag;
        mWasOpened = flag;
        mIsScreenshotted = flag1;
        mFailed = flag2;
        mZipped = flag3;
        mFilterId = s7;
        mWas404ResponseReceived = flag4;
        mIsShared = flag5;
        mNeedsAuth = flag6;
        mCanAdFollow = flag7;
        mExpirationTimestamp = l2;
        mStoryFilterId = s8;
        mStoryUnlockables = s9;
        mIsSponsored = flag8;
        mSponsoredSlugPosAndText = s10;
    }

    private Bk(String s, String s1, boolean flag)
    {
        this();
        mUsername = (String)dv.a(s);
        mClientId = (String)dv.a(s1);
        mIsShared = flag;
    }

    protected Bk(String s, boolean flag)
    {
        this(s, UUID.randomUUID().toString(), flag);
    }

    private static boolean a(Kj kj)
    {
        return kj.mCache != null;
    }

    public static String aA()
    {
        return (new StringBuilder()).append(Lz.b()).append("/bq/auth_story_thumbnails").toString();
    }

    public final boolean D()
    {
        return mHasBeenViewed;
    }

    public final Kj J()
    {
        if (!TextUtils.isEmpty(mClientId))
        {
            if (Ka.MY_SNAP_IMAGE_CACHE.f(mClientId))
            {
                return new Kj(Ka.MY_SNAP_IMAGE_CACHE, mClientId, null);
            }
            if (Ka.MY_SNAP_IMAGE_CACHE.f((new StringBuilder()).append(mClientId).append("-unzippedbitmap").toString()))
            {
                return new Kj(Ka.MY_SNAP_IMAGE_CACHE, (new StringBuilder()).append(mClientId).append("-unzippedbitmap").toString(), null);
            }
        }
        return super.J();
    }

    public final Kj K()
    {
        if (Ka.MY_SNAP_VIDEO_CACHE.f(mClientId))
        {
            return new Kj(Ka.MY_SNAP_VIDEO_CACHE, mClientId, null);
        } else
        {
            return super.K();
        }
    }

    protected final JY L()
    {
        return Ka.STORY_RECEIVED_VIDEO_CACHE;
    }

    protected final JY M()
    {
        return Ka.STORY_RECEIVED_IMAGE_CACHE;
    }

    public final KK N()
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(mMediaIv)) goto _L2; else goto _L1
_L1:
        Object obj = new KR();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((KK) (obj));
_L2:
        obj = new CbcEncryptionAlgorithm(mMediaKey, mMediaIv);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean O()
    {
        if (mMediaType == 0)
        {
            return a(J());
        } else
        {
            return a(K());
        }
    }

    public boolean P()
    {
        while (mWas404ResponseReceived || ak() && Kl.sExternalCacheDirectory == null) 
        {
            return true;
        }
        return super.P();
    }

    public final long W()
    {
        return mTimestamp;
    }

    public boolean Z()
    {
        return false;
    }

    protected final int a(int k)
    {
        return Math.min(k, 20);
    }

    public final void a(KF kf)
    {
        this;
        JVM INSTR monitorenter ;
        mMediaKey = kf.mKey;
        mMediaIv = kf.mIv;
        mThumbnailIv = kf.mThumbnailIv;
        this;
        JVM INSTR monitorexit ;
        return;
        kf;
        throw kf;
    }

    public final String aB()
    {
        if (mNeedsAuth)
        {
            return mId;
        } else
        {
            return mThumbnailUrl;
        }
    }

    public final boolean aC()
    {
        String s;
        if (!Ka.MY_STORY_SNAP_THUMBNAIL_CACHE.f(mClientId))
        {
            if (TextUtils.isEmpty(s = aB()) || !Ka.STORY_SNAP_RECEIVED_THUMBNAIL_CACHE.f(s))
            {
                return false;
            }
        }
        return true;
    }

    public final KK aD()
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(mThumbnailIv)) goto _L2; else goto _L1
_L1:
        Object obj = new KR();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((KK) (obj));
_L2:
        obj = new CbcEncryptionAlgorithm(mMediaKey, mThumbnailIv);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final KF aE()
    {
        return new KF(mMediaKey, mMediaIv, mThumbnailIv);
    }

    public final String aF()
    {
        if (mNeedsAuth)
        {
            return aA();
        } else
        {
            return mThumbnailUrl;
        }
    }

    public final boolean aG()
    {
        return System.currentTimeMillis() > mExpirationTimestamp;
    }

    public final void aH()
    {
        mExpirationTimestamp = System.currentTimeMillis() + mTimeToExpiration;
    }

    public final void aI()
    {
        mWas404ResponseReceived = true;
        mHasBeenViewed = true;
    }

    public final boolean aJ()
    {
        if (mId == null)
        {
            Timber.e("StorySnap", "Attempting to check if snap is a brand snap when id is null", new Object[0]);
            return false;
        } else
        {
            return mId.endsWith("BRAND_SNAP");
        }
    }

    public final boolean aK()
    {
        return mAdPlacementMetadata != null;
    }

    public final String aL()
    {
        return (new StringBuilder()).append(mMediaUrl).append(mId).toString();
    }

    public final String aM()
    {
        if (mParentIds.isEmpty())
        {
            return null;
        } else
        {
            return (String)mParentIds.get(mParentIds.size() - 1);
        }
    }

    public final String aN()
    {
        if (mParentIds.isEmpty())
        {
            return null;
        } else
        {
            return (String)mParentIds.get(0);
        }
    }

    public final int aO()
    {
        return mParentIds.size();
    }

    public String ab()
    {
        return ds.a("StorySnap").a("sender", mUsername).a("url", at()).a("cacheKey", i()).a("loaded", O()).a("loading", U()).a("unableToLoad", P()).toString();
    }

    public boolean ac()
    {
        return false;
    }

    public final Cf ad()
    {
        if (mDownloadContext != null)
        {
            return mDownloadContext;
        } else
        {
            ED ed = new ED();
            ed.a = this;
            return ed.a();
        }
    }

    public String at()
    {
        if (mNeedsAuth)
        {
            return (new StringBuilder()).append(Lz.b()).append("/bq/auth_story_blobs").toString();
        } else
        {
            return mMediaUrl;
        }
    }

    public String au()
    {
        return null;
    }

    public String av()
    {
        return null;
    }

    public String aw()
    {
        return null;
    }

    public int ax()
    {
        return 0;
    }

    public String ay()
    {
        return null;
    }

    public String az()
    {
        return null;
    }

    public final String b(Context context)
    {
        return Ii.b(context, mTimestamp);
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public final String d()
    {
        return super.d();
    }

    public final void e(boolean flag)
    {
        int k = 1;
        mViewedTimestamp = (new Date()).getTime();
        c(false);
        mHasBeenViewed = true;
        mWasOpened = true;
        mClientSnapStatus = com.snapchat.android.model.Snap.ClientSnapStatus.RECEIVED_AND_VIEWED;
        if (flag)
        {
            Map map = Br.a().b();
            if (!as())
            {
                k = 0;
            }
            map.put(super.d(), (new SW()).a(super.d()).a(Long.valueOf(F())).a(Integer.valueOf(k)));
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Bk))
        {
            return false;
        } else
        {
            obj = (Bk)obj;
            return mClientId.equals(((Bk) (obj)).mClientId);
        }
    }

    public final boolean f()
    {
        return !mIsLoading;
    }

    public int hashCode()
    {
        return mClientId.hashCode();
    }

    public String i()
    {
        return mId;
    }

    public final String j()
    {
        return mUsername;
    }

    public final void o()
    {
        mStoryUtils.a(Br.a(), this, false);
    }

    public String toString()
    {
        return ds.a("StorySnap").a("id", super.d()).a("sender", mUsername).a("hasBeenViewed", mHasBeenViewed).toString();
    }
}
