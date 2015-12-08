// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.cache;

import JY;
import KK;
import PG;
import android.content.Context;
import android.graphics.Bitmap;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import java.io.ByteArrayOutputStream;
import java.util.Map;

// Referenced classes of package com.snapchat.android.util.cache:
//            CacheType

public final class DiscoverShareCache extends JY
{
    public static final class DiscoverShareFileType extends Enum
    {

        private static final DiscoverShareFileType $VALUES[];
        public static final DiscoverShareFileType BLOB;
        public static final DiscoverShareFileType IMAGE;
        public static final DiscoverShareFileType METADATA;
        public static final DiscoverShareFileType VIDEO;
        public static final DiscoverShareFileType VIDEO_OVERLAY;
        public static final DiscoverShareFileType VIDEO_THUMBNAIL;

        public static DiscoverShareFileType valueOf(String s)
        {
            return (DiscoverShareFileType)Enum.valueOf(com/snapchat/android/util/cache/DiscoverShareCache$DiscoverShareFileType, s);
        }

        public static DiscoverShareFileType[] values()
        {
            return (DiscoverShareFileType[])$VALUES.clone();
        }

        static 
        {
            METADATA = new DiscoverShareFileType("METADATA", 0);
            IMAGE = new DiscoverShareFileType("IMAGE", 1);
            VIDEO = new DiscoverShareFileType("VIDEO", 2);
            VIDEO_THUMBNAIL = new DiscoverShareFileType("VIDEO_THUMBNAIL", 3);
            VIDEO_OVERLAY = new DiscoverShareFileType("VIDEO_OVERLAY", 4);
            BLOB = new DiscoverShareFileType("BLOB", 5);
            $VALUES = (new DiscoverShareFileType[] {
                METADATA, IMAGE, VIDEO, VIDEO_THUMBNAIL, VIDEO_OVERLAY, BLOB
            });
        }

        private DiscoverShareFileType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "DiscoverShareCache";

    public DiscoverShareCache(CacheType cachetype)
    {
        super(cachetype, 1440L);
    }

    private static String c(String s, DiscoverShareFileType discoversharefiletype)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(s).append("-").append(discoversharefiletype);
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType = new int[DiscoverShareFileType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.METADATA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.IMAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.VIDEO_THUMBNAIL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.VIDEO_OVERLAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.VIDEO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$cache$DiscoverShareCache$DiscoverShareFileType[DiscoverShareFileType.BLOB.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType[discoversharefiletype.ordinal()];
        JVM INSTR tableswitch 1 6: default 68
    //                   1 78
    //                   2 90
    //                   3 90
    //                   4 96
    //                   5 102
    //                   6 108;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException("Invalid DiscoverShareFileType.");
_L2:
        s = ".json";
_L8:
        return stringbuilder.append(s).toString();
_L3:
        s = ".jpg.nomedia";
        continue; /* Loop/switch isn't completed */
_L4:
        s = ".png.nomedia";
        continue; /* Loop/switch isn't completed */
_L5:
        s = ".mp4.nomedia";
        continue; /* Loop/switch isn't completed */
_L6:
        s = ".zip.nomedia";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Bitmap a(Context context, String s, KK kk)
    {
        return a(context, s, kk, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public final Bitmap a(Context context, String s, KK kk, android.graphics.Bitmap.Config config)
    {
        return a(context, s, kk, config, DiscoverShareFileType.IMAGE);
    }

    public final Bitmap a(Context context, String s, KK kk, android.graphics.Bitmap.Config config, DiscoverShareFileType discoversharefiletype)
    {
        return super.a(context, c(s, discoversharefiletype), kk, config);
    }

    public final String a(String s, byte abyte0[], DiscoverShareFileType discoversharefiletype)
    {
        int i = 0;
        if (s == null)
        {
            Timber.e("DiscoverShareCache", (new StringBuilder("put: Trying to put null key in ")).append(mCacheType.name()).toString(), new Object[0]);
            if (ReleaseManager.e())
            {
                throw new NullPointerException();
            }
            abyte0 = null;
        } else
        {
            PG.b();
            if (abyte0 != null)
            {
                i = abyte0.length;
            }
            discoversharefiletype = c(s, discoversharefiletype);
            s = d(discoversharefiletype);
            if (s == null)
            {
                s = a(abyte0, i, ((String) (discoversharefiletype)));
            }
            abyte0 = s;
            if (s != null)
            {
                mKeyToItemMap.put(discoversharefiletype, JY.b.a(s, System.currentTimeMillis()));
                return s;
            }
        }
        return abyte0;
    }

    public final void a(String s, Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, DiscoverShareFileType discoversharefiletype, KK kk)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(compressformat, 90, bytearrayoutputstream);
        compressformat = bytearrayoutputstream.toByteArray();
        bitmap = compressformat;
        if (kk != null)
        {
            bitmap = kk.a(compressformat);
        }
        a(s, ((byte []) (bitmap)), discoversharefiletype);
    }

    public final byte[] a(String s, DiscoverShareFileType discoversharefiletype)
    {
        return super.b(c(s, discoversharefiletype));
    }

    public final String b(String s, DiscoverShareFileType discoversharefiletype)
    {
        return super.d(c(s, discoversharefiletype));
    }

    public final void e(String s)
    {
        DiscoverShareFileType adiscoversharefiletype[] = DiscoverShareFileType.values();
        int j = adiscoversharefiletype.length;
        for (int i = 0; i < j; i++)
        {
            super.e(c(s, adiscoversharefiletype[i]));
        }

    }
}
