// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.graphics.Bitmap;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.util.cache.DiskCacheMissReason;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class Kk
{
    final class a
    {

        public Bitmap firstFrameBitmap;
        public Bitmap overlayBitmap;
        final Kk this$0;
        public byte videoData[];

        private a()
        {
            this$0 = Kk.this;
            super();
            videoData = null;
            overlayBitmap = null;
            firstFrameBitmap = null;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final String TAG = "SnapVideoDecryptor";
    private final Jx mBitmapLoader;
    private final ln mMemoryAnalytics;
    private final Random mRandom;
    private final JY mUnencryptedVideoCache;

    public Kk()
    {
        this(new Random(), new Jx(SnapchatApplication.get().getApplicationContext()), Ka.UNENCRYPTED_VIDEO_CACHE, new ln());
    }

    private Kk(Random random, Jx jx, JY jy, ln ln1)
    {
        mRandom = random;
        mBitmapLoader = jx;
        mUnencryptedVideoCache = jy;
        mMemoryAnalytics = ln1;
    }

    private a a(String s, InputStream inputstream)
    {
        kC kc;
        a a1;
        kc = new kC("SnapVideoDecryptor", "readVideoFromZippedArchiveStream");
        a1 = new a((byte)0);
        ZipInputStream zipinputstream = new ZipInputStream(inputstream);
_L9:
        Object obj = zipinputstream.getNextEntry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        obj = ((ZipEntry) (obj)).getName();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[1024];
_L1:
        int i = zipinputstream.read(abyte1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        bytearrayoutputstream.write(abyte1, 0, i);
          goto _L1
        s;
        byte abyte0[];
        try
        {
            zipinputstream.close();
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally { }
        Timber.a("SnapVideoDecryptor", s);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.d("SnapVideoDecryptor", "Unable to close archive stream", new Object[0]);
        }
        Timber.a(kc);
        return a1;
        kc.a("unzip count");
        abyte0 = bytearrayoutputstream.toByteArray();
        if (!((String) (obj)).contains("overlay")) goto _L3; else goto _L2
_L2:
        abyte0 = (new JF.a()).a(s, abyte0);
        abyte0.mRequireExactDimensions = false;
        abyte0 = abyte0.a();
        a1.overlayBitmap = mBitmapLoader.a(abyte0).mBitmap;
_L6:
        kc.a((new StringBuilder("unzip ")).append(((String) (obj))).toString());
        continue; /* Loop/switch isn't completed */
_L3:
        if (!((String) (obj)).contains("firstFrame")) goto _L5; else goto _L4
_L4:
        abyte0 = (new JF.a()).a(s, abyte0);
        abyte0.mRequireExactDimensions = false;
        abyte0 = abyte0.a();
        a1.firstFrameBitmap = mBitmapLoader.a(abyte0).mBitmap;
          goto _L6
_L5:
        if (!((String) (obj)).contains("media")) goto _L6; else goto _L7
_L7:
        a1.videoData = abyte0;
          goto _L6
        zipinputstream.close();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.d("SnapVideoDecryptor", "Unable to close archive stream", new Object[0]);
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Timber.d("SnapVideoDecryptor", "Unable to close archive stream", new Object[0]);
        }
        throw s;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final AD a(Kj kj, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        boolean flag3 = false;
        Object obj = kj.mCache;
        String s = kj.mKey;
        if (obj == null || s == null)
        {
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag3;
            if (s == null)
            {
                flag1 = true;
            }
            throw new NullPointerException(String.format("videoSnap null cache/key [%s/%s]", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1)
            }));
        }
        obj = ((JY) (obj)).c(s);
        byte abyte0[] = ((JZ) (obj)).bytes;
        if (((JZ) (obj)).missReason != null || ((JZ) (obj)).bytes == null || ((JZ) (obj)).bytes.length == 0)
        {
            flag2 = true;
        }
        if (flag2)
        {
            if (((JZ) (obj)).missReason == DiskCacheMissReason.DECODING_ERROR)
            {
                throw new GeneralSecurityException();
            } else
            {
                return null;
            }
        } else
        {
            return a(s, abyte0, kj.mAlgorithm, flag, flag1, true);
        }
    }

    public final AD a(String s, byte abyte0[], KK kk, boolean flag, boolean flag1, boolean flag2)
    {
        byte abyte1[];
        kC kc;
        kc = new kC("SnapVideoDecryptor", "decrypt");
        abyte1 = abyte0;
        if (kk == null) goto _L2; else goto _L1
_L1:
        try
        {
            abyte0 = kk.b(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ln.a(s);
            return null;
        }
        abyte1 = abyte0;
        if (abyte0 != null) goto _L2; else goto _L3
_L3:
        return null;
_L2:
        kc.a("decrypt");
        if (!flag) goto _L5; else goto _L4
_L4:
        abyte0 = a(s, ((InputStream) (new ByteArrayInputStream(abyte1))));
        if (((a) (abyte0)).videoData == null) goto _L3; else goto _L6
_L6:
        abyte1 = ((a) (abyte0)).videoData;
_L17:
        kc.a("unzip");
        kk = s;
        if (flag2)
        {
            kk = (new StringBuilder()).append(s).append("#").append(mRandom.nextLong()).toString();
        }
        mUnencryptedVideoCache.a(kk, abyte1);
        kc.a("put");
        s = new AD.a(mUnencryptedVideoCache, kk);
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        if (((a) (abyte0)).overlayBitmap == null) goto _L10; else goto _L9
_L9:
        if (!flag1) goto _L12; else goto _L11
_L11:
        s.a(Jo.a(((a) (abyte0)).overlayBitmap, SnapchatApplication.get()));
_L15:
        if (((a) (abyte0)).firstFrameBitmap == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        if (!flag1) goto _L14; else goto _L13
_L13:
        s.b(Jo.a(((a) (abyte0)).firstFrameBitmap, SnapchatApplication.get()));
_L8:
        s = new AD(((AD.a) (s)).mCache, ((AD.a) (s)).mKey, ((AD.a) (s)).mOverlayBitmap, ((AD.a) (s)).mFirstFrameBitmap, (byte)0);
        Timber.a(kc);
        return s;
_L12:
        s.a(((a) (abyte0)).overlayBitmap);
          goto _L15
        s;
        Timber.e("SnapVideoDecryptor", "External storage not available to save unencrypted video", new Object[0]);
        Timber.a(kc);
        return null;
_L10:
        Timber.e("SnapVideoDecryptor", "Overlay bitmap is null while decrypting snap video!", new Object[0]);
          goto _L15
        s;
        Timber.a(kc);
        throw s;
_L14:
        s.b(((a) (abyte0)).firstFrameBitmap);
          goto _L8
        Timber.e("SnapVideoDecryptor", "First frame bitmap is null while decrypting snap video!", new Object[0]);
          goto _L8
_L5:
        abyte0 = null;
        if (true) goto _L17; else goto _L16
_L16:
    }
}
