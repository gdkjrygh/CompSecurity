// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.cache;

import Ic;
import KF;
import KH;
import KO;
import KP;
import KQ;
import Kd;
import Kl;
import android.os.Environment;
import android.os.StatFs;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class CacheType extends Enum
{
    static final class a extends Enum
    {

        private static final int $VALUES$4bc5adf1[];
        public static final int BLOB$17e89516;
        public static final int DIRECTORY$17e89516;
        public static final int IMAGE$17e89516;
        public static final int VIDEO$17e89516;

        public static int[] a()
        {
            return (int[])$VALUES$4bc5adf1.clone();
        }

        static 
        {
            VIDEO$17e89516 = 1;
            IMAGE$17e89516 = 2;
            BLOB$17e89516 = 3;
            DIRECTORY$17e89516 = 4;
            $VALUES$4bc5adf1 = (new int[] {
                VIDEO$17e89516, IMAGE$17e89516, BLOB$17e89516, DIRECTORY$17e89516
            });
        }
    }

    static final class b extends Enum
    {

        private static final int $VALUES$12f9c39f[];
        public static final int EXTERNAL_ONLY$105f8726;
        public static final int EXTERNAL_PREFERRED$105f8726;
        public static final int INTERNAL$105f8726;
        public static final int INTERNAL_PREFERRED$105f8726;

        static 
        {
            EXTERNAL_ONLY$105f8726 = 1;
            EXTERNAL_PREFERRED$105f8726 = 2;
            INTERNAL$105f8726 = 3;
            INTERNAL_PREFERRED$105f8726 = 4;
            $VALUES$12f9c39f = (new int[] {
                EXTERNAL_ONLY$105f8726, EXTERNAL_PREFERRED$105f8726, INTERNAL$105f8726, INTERNAL_PREFERRED$105f8726
            });
        }
    }


    private static final CacheType $VALUES[];
    public static final CacheType CHAT_MEDIA_RECEIVED_IMAGE;
    public static final CacheType CHAT_MEDIA_RECEIVED_OVERLAY;
    public static final CacheType DISCOVER_EDITIONS_CHUNKS;
    public static final CacheType DISCOVER_INTRO_VIDEOS;
    public static final CacheType DISCOVER_PUBLISHER_ICONS;
    public static final CacheType DISCOVER_SHARE;
    public static final String ENCRYPTION_SUFFIX = ".encrypted";
    public static final CacheType FONTS;
    public static final CacheType FRIEND_PROFILE_IMAGE;
    public static final CacheType GEOFILTERS_MEDIA;
    public static final CacheType GEOFILTERS_METADATA;
    public static final CacheType GEO_LENSES_METADATA;
    private static final String IMAGE_FILENAME_PREFIX = "h1a81hurcs00h";
    public static final CacheType LENSES_RESOURCES;
    public static final CacheType MY_MEDIA;
    public static final CacheType MY_STORY_THUMBNAIL;
    private static final String OTHER_FILENAME_PREFIX = "y78soep3m2n";
    public static final CacheType PROFILE_IMAGE;
    public static final CacheType PROMO_LENSES_METADATA;
    public static final CacheType PURCHASED_LENSES_METADATA;
    public static final CacheType SAVE_STORY_TO_GALLERY_IMAGES;
    public static final CacheType SCHEDULED_LENSES_METADATA;
    public static final CacheType SNAPS_RECEIVED_IMAGE;
    public static final CacheType SNAPS_RECEIVED_VIDEO;
    public static final CacheType SNAPS_TO_SEND_IMAGE;
    public static final CacheType SNAPS_TO_SEND_VIDEO;
    public static final CacheType STORIES_RECEIVED_IMAGE;
    public static final CacheType STORIES_RECEIVED_THUMBNAIL;
    public static final CacheType STORIES_RECEIVED_VIDEO;
    public static final CacheType STORY_REPLY_BUNDLE_CACHE;
    public static final CacheType UNENCRYPTED_VIDEOS;
    public static final CacheType UNENCRYPTED_VIDEOS_FOR_SNAP_PREVIEW;
    private static final String VIDEO_FILENAME_PREFIX = "sesrh_dlw21";
    private CbcEncryptionAlgorithm mEncryptionAlgorithm;
    private final boolean mEncryptionOnExternalStorage;
    private final int mFileType$17e89516;
    private final String mRelativePath;
    private final KP mSlightlySecurePreferencesKey;
    private final int mStorageLocation$105f8726;

    private CacheType(String s, int i, String s1, int j, int k)
    {
        this(s, i, s1, j, k, false, null);
    }

    private CacheType(String s, int i, String s1, int j, int k, boolean flag, KP kp)
    {
        super(s, i);
        mRelativePath = s1;
        mStorageLocation$105f8726 = j;
        mFileType$17e89516 = k;
        mEncryptionOnExternalStorage = flag;
        mSlightlySecurePreferencesKey = kp;
    }

    private File a()
    {
label0:
        {
            if (mStorageLocation$105f8726 == b.EXTERNAL_ONLY._fld105f8726)
            {
                if (Kl.sExternalCacheDirectory == null)
                {
                    throw new Kd("Well, this is awkward.");
                } else
                {
                    return Kl.sExternalCacheDirectory;
                }
            }
            if (mStorageLocation$105f8726 != b.EXTERNAL_PREFERRED._fld105f8726 || Kl.sExternalCacheDirectory == null)
            {
                if (mStorageLocation$105f8726 != b.INTERNAL_PREFERRED._fld105f8726)
                {
                    break label0;
                }
                StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
                long l = statfs.getBlockSize();
                boolean flag;
                if ((long)statfs.getAvailableBlocks() * l < 10L)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    break label0;
                }
            }
            return Kl.sExternalCacheDirectory;
        }
        return Kl.sInternalCacheDirectory;
    }

    public static boolean a(String s)
    {
        return s.endsWith(".encrypted");
    }

    private static int b()
    {
        if (Ic.SUPPORTS_VIDEO_PLAYBACK_FROM_INTERNAL_STORAGE)
        {
            return b.INTERNAL._fld105f8726;
        } else
        {
            return b.EXTERNAL_ONLY._fld105f8726;
        }
    }

    public static CacheType valueOf(String s)
    {
        return (CacheType)Enum.valueOf(com/snapchat/android/util/cache/CacheType, s);
    }

    public static CacheType[] values()
    {
        return (CacheType[])$VALUES.clone();
    }

    public final String generateFilename()
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType = new int[a.a().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType[a.VIDEO._fld17e89516 - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType[a.IMAGE._fld17e89516 - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType[a.DIRECTORY._fld17e89516 - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$CacheType$FileType[a.BLOB._fld17e89516 - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        String s;
        if (needToEncryptRawData())
        {
            s = ".encrypted";
        } else
        {
            s = "";
        }
        switch (_cls1..SwitchMap.com.snapchat.android.util.cache.CacheType.FileType[mFileType$17e89516 - 1])
        {
        default:
            return (new StringBuilder("y78soep3m2n")).append((new Random()).nextLong()).toString();

        case 1: // '\001'
            return (new StringBuilder("sesrh_dlw21")).append((new Random()).nextLong()).append(".mp4.nomedia").append(s).toString();

        case 2: // '\002'
            return (new StringBuilder("h1a81hurcs00h")).append((new Random()).nextLong()).append(".jpg.nomedia").append(s).toString();
        }
    }

    public final CbcEncryptionAlgorithm getCbcEncryptionAlgorithm()
    {
        if (mEncryptionAlgorithm != null) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        KH kh;
        kh = new KH();
        KP kp = mSlightlySecurePreferencesKey;
        abyte0 = kh.mSlightlySecurePreferences.b(kp);
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        Object obj = KH.a(abyte0);
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = (KF)((Map) (obj)).get(toString());
        if (obj == null) goto _L4; else goto _L6
_L6:
        boolean flag;
        setCbcEncryptionAlgorithm(new CbcEncryptionAlgorithm(((KF) (obj)).mKey, ((KF) (obj)).mIv));
        flag = true;
_L8:
        if (!flag)
        {
            setCbcEncryptionAlgorithm(new CbcEncryptionAlgorithm());
            KP kp1 = mSlightlySecurePreferencesKey;
            Object obj1 = null;
            byte abyte1[] = kh.mSlightlySecurePreferences.b(kp1);
            if (abyte1 != null)
            {
                obj1 = KH.a(abyte1);
            }
            Object obj2 = obj1;
            if (obj1 == null)
            {
                obj2 = new HashMap();
            }
            obj1 = getCbcEncryptionAlgorithm();
            obj1 = new KF(((CbcEncryptionAlgorithm) (obj1)).b(), ((CbcEncryptionAlgorithm) (obj1)).c());
            ((Map) (obj2)).put(toString(), obj1);
            kh.mSlightlySecurePreferences.a(kp1, KH.a(((Map) (obj2))));
        }
_L2:
        return mEncryptionAlgorithm;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final File getDirectory()
    {
        File file = a();
        if (file == null)
        {
            throw new NullPointerException();
        } else
        {
            return new File((new StringBuilder()).append(file.getAbsolutePath()).append(mRelativePath).toString());
        }
    }

    public final boolean needToEncryptRawData()
    {
        if (mEncryptionOnExternalStorage && mFileType$17e89516 != a.DIRECTORY._fld17e89516) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        File file;
        boolean flag;
        try
        {
            file = a();
        }
        catch (Kd kd)
        {
            return false;
        }
        if (file == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = file.equals(Kl.sExternalCacheDirectory);
        if (flag)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void setCbcEncryptionAlgorithm(CbcEncryptionAlgorithm cbcencryptionalgorithm)
    {
        mEncryptionAlgorithm = cbcencryptionalgorithm;
    }

    static 
    {
        MY_STORY_THUMBNAIL = new CacheType("MY_STORY_THUMBNAIL", 0, "/stories/my/thumbnail/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        STORIES_RECEIVED_THUMBNAIL = new CacheType("STORIES_RECEIVED_THUMBNAIL", 1, "/stories/received/thumbnail/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        STORIES_RECEIVED_IMAGE = new CacheType("STORIES_RECEIVED_IMAGE", 2, "/stories/received/image/", b.EXTERNAL_PREFERRED._fld105f8726, a.IMAGE._fld17e89516);
        STORIES_RECEIVED_VIDEO = new CacheType("STORIES_RECEIVED_VIDEO", 3, "/stories/received/video/", b.EXTERNAL_ONLY._fld105f8726, a.VIDEO._fld17e89516);
        SNAPS_RECEIVED_IMAGE = new CacheType("SNAPS_RECEIVED_IMAGE", 4, "/received_image_snaps/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        SNAPS_RECEIVED_VIDEO = new CacheType("SNAPS_RECEIVED_VIDEO", 5, "/received_video_snaps/", b.EXTERNAL_ONLY._fld105f8726, a.VIDEO._fld17e89516);
        CHAT_MEDIA_RECEIVED_IMAGE = new CacheType("CHAT_MEDIA_RECEIVED_IMAGE", 6, "/chat/received/image/", b.INTERNAL_PREFERRED._fld105f8726, a.IMAGE._fld17e89516);
        STORY_REPLY_BUNDLE_CACHE = new CacheType("STORY_REPLY_BUNDLE_CACHE", 7, "/chat/received/story_bundle/", b.INTERNAL_PREFERRED._fld105f8726, a.BLOB._fld17e89516);
        CHAT_MEDIA_RECEIVED_OVERLAY = new CacheType("CHAT_MEDIA_RECEIVED_OVERLAY", 8, "/chat/received/overlay/", b.INTERNAL_PREFERRED._fld105f8726, a.IMAGE._fld17e89516);
        DISCOVER_SHARE = new CacheType("DISCOVER_SHARE", 9, "/chat/received/discover_share/", b.INTERNAL_PREFERRED._fld105f8726, a.BLOB._fld17e89516);
        UNENCRYPTED_VIDEOS = new CacheType("UNENCRYPTED_VIDEOS", 10, "/uv/", b(), a.VIDEO._fld17e89516);
        SAVE_STORY_TO_GALLERY_IMAGES = new CacheType("SAVE_STORY_TO_GALLERY_IMAGES", 11, "/save_story_to_gallery/image/", b.EXTERNAL_PREFERRED._fld105f8726, a.IMAGE._fld17e89516);
        MY_MEDIA = new CacheType("MY_MEDIA", 12, "/my_media/", b.EXTERNAL_PREFERRED._fld105f8726, a.VIDEO._fld17e89516);
        SNAPS_TO_SEND_IMAGE = new CacheType("SNAPS_TO_SEND_IMAGE", 13, "/snaps/tosend/image/", b.INTERNAL_PREFERRED._fld105f8726, a.IMAGE._fld17e89516, true, KQ.SNAPS_ON_EXTERNAL_STORAGE_KEYS_AND_IVS);
        SNAPS_TO_SEND_VIDEO = new CacheType("SNAPS_TO_SEND_VIDEO", 14, "/snaps/tosend/video/", b.INTERNAL_PREFERRED._fld105f8726, a.VIDEO._fld17e89516, true, KQ.SNAPS_ON_EXTERNAL_STORAGE_KEYS_AND_IVS);
        UNENCRYPTED_VIDEOS_FOR_SNAP_PREVIEW = new CacheType("UNENCRYPTED_VIDEOS_FOR_SNAP_PREVIEW", 15, "/snaps/preview", b(), a.VIDEO._fld17e89516);
        GEO_LENSES_METADATA = new CacheType("GEO_LENSES_METADATA", 16, "/geolenses_metadata/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        SCHEDULED_LENSES_METADATA = new CacheType("SCHEDULED_LENSES_METADATA", 17, "/scheduled_lenses_metadata/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        PROMO_LENSES_METADATA = new CacheType("PROMO_LENSES_METADATA", 18, "/promo_lenses_metadata/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        PURCHASED_LENSES_METADATA = new CacheType("PURCHASED_LENSES_METADATA", 19, "/purchased_lenses_metadata/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        LENSES_RESOURCES = new CacheType("LENSES_RESOURCES", 20, "/lenses_resources/", b.INTERNAL._fld105f8726, a.DIRECTORY._fld17e89516);
        GEOFILTERS_MEDIA = new CacheType("GEOFILTERS_MEDIA", 21, "/geofilters/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        GEOFILTERS_METADATA = new CacheType("GEOFILTERS_METADATA", 22, "/geofilters/metadata/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        FONTS = new CacheType("FONTS", 23, "/fonts/", b.INTERNAL._fld105f8726, a.BLOB._fld17e89516);
        DISCOVER_INTRO_VIDEOS = new CacheType("DISCOVER_INTRO_VIDEOS", 24, "/discover/intro_videos/", b.EXTERNAL_ONLY._fld105f8726, a.VIDEO._fld17e89516);
        DISCOVER_EDITIONS_CHUNKS = new CacheType("DISCOVER_EDITIONS_CHUNKS", 25, "/discover/edition_chunks/", b.EXTERNAL_ONLY._fld105f8726, a.DIRECTORY._fld17e89516, true, KQ.DISCOVER_CONTENT_KEYS_AND_IVS);
        DISCOVER_PUBLISHER_ICONS = new CacheType("DISCOVER_PUBLISHER_ICONS", 26, "/discover/icons/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        PROFILE_IMAGE = new CacheType("PROFILE_IMAGE", 27, "/profile/my/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        FRIEND_PROFILE_IMAGE = new CacheType("FRIEND_PROFILE_IMAGE", 28, "/profile/friend/", b.INTERNAL._fld105f8726, a.IMAGE._fld17e89516);
        $VALUES = (new CacheType[] {
            MY_STORY_THUMBNAIL, STORIES_RECEIVED_THUMBNAIL, STORIES_RECEIVED_IMAGE, STORIES_RECEIVED_VIDEO, SNAPS_RECEIVED_IMAGE, SNAPS_RECEIVED_VIDEO, CHAT_MEDIA_RECEIVED_IMAGE, STORY_REPLY_BUNDLE_CACHE, CHAT_MEDIA_RECEIVED_OVERLAY, DISCOVER_SHARE, 
            UNENCRYPTED_VIDEOS, SAVE_STORY_TO_GALLERY_IMAGES, MY_MEDIA, SNAPS_TO_SEND_IMAGE, SNAPS_TO_SEND_VIDEO, UNENCRYPTED_VIDEOS_FOR_SNAP_PREVIEW, GEO_LENSES_METADATA, SCHEDULED_LENSES_METADATA, PROMO_LENSES_METADATA, PURCHASED_LENSES_METADATA, 
            LENSES_RESOURCES, GEOFILTERS_MEDIA, GEOFILTERS_METADATA, FONTS, DISCOVER_INTRO_VIDEOS, DISCOVER_EDITIONS_CHUNKS, DISCOVER_PUBLISHER_ICONS, PROFILE_IMAGE, FRIEND_PROFILE_IMAGE
        });
    }
}
