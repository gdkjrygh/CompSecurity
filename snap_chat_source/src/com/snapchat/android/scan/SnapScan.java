// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;

import android.graphics.Bitmap;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.nio.ByteBuffer;

// Referenced classes of package com.snapchat.android.scan:
//            SnapScanResult

public class SnapScan
{
    public static final class ImageFormat extends Enum
    {

        private static final ImageFormat $VALUES[];
        public static final ImageFormat ARGB_8888;
        public static final ImageFormat NV21;

        public static ImageFormat valueOf(String s)
        {
            return (ImageFormat)Enum.valueOf(com/snapchat/android/scan/SnapScan$ImageFormat, s);
        }

        public static ImageFormat[] values()
        {
            return (ImageFormat[])$VALUES.clone();
        }

        static 
        {
            NV21 = new ImageFormat("NV21", 0);
            ARGB_8888 = new ImageFormat("ARGB_8888", 1);
            $VALUES = (new ImageFormat[] {
                NV21, ARGB_8888
            });
        }

        private ImageFormat(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String a = com/snapchat/android/scan/SnapScan.getSimpleName();
    private static final boolean b = b();

    public SnapScan()
    {
    }

    public static SnapScanResult a(Bitmap bitmap, int i)
    {
        if (bitmap == null)
        {
            Timber.d(a, "processBitmap: No image to scan!", new Object[0]);
            return null;
        }
        if (!b)
        {
            Timber.d(a, "processBitmap: Cannot load SnapScan library!", new Object[0]);
            return null;
        }
        bitmap.setHasAlpha(true);
        if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
        {
            Timber.d(a, (new StringBuilder("processBitmap: Cannot scan image format: ")).append(bitmap.getConfig()).toString(), new Object[0]);
            return null;
        } else
        {
            ByteBuffer bytebuffer = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(bytebuffer);
            byte abyte0[] = bytebuffer.array();
            return processFrame(ImageFormat.ARGB_8888.ordinal(), bitmap.getWidth(), bitmap.getHeight(), abyte0, i);
        }
    }

    public static SnapScanResult a(ImageFormat imageformat, int i, int j, byte abyte0[])
    {
        if (imageformat == null)
        {
            Timber.d(a, "processImage: No specified image format!", new Object[0]);
            return null;
        }
        if (abyte0 == null)
        {
            Timber.d(a, "processImage: No image to scan!", new Object[0]);
            return null;
        }
        if (!b)
        {
            Timber.d(a, "processImage: Cannot load SnapScan library!", new Object[0]);
            return null;
        } else
        {
            return processFrame(imageformat.ordinal(), i, j, abyte0, 480);
        }
    }

    public static boolean a()
    {
        return b;
    }

    private static boolean b()
    {
        boolean flag = false;
        com/snapchat/android/scan/SnapScan;
        JVM INSTR monitorenter ;
        System.loadLibrary("c++_shared");
        System.loadLibrary("opencv");
        System.loadLibrary("snapscan");
        flag = true;
_L3:
        com/snapchat/android/scan/SnapScan;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        EasyMetric easymetric;
        easymetric = new EasyMetric();
        if (((Throwable) (obj)).getMessage() == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (!((Throwable) (obj)).getMessage().contains("snapscan")) goto _L2; else goto _L1
_L1:
        Timber.e(a, "Failed to load the SnapScan library!", new Object[0]);
        easymetric.a("SNAPSCAN_LOAD_FAILED");
_L4:
        easymetric.a("reason", ((Throwable) (obj)).getMessage());
_L5:
        easymetric.a("type", obj.getClass().getSimpleName());
        easymetric.b(false);
          goto _L3
        obj;
        throw obj;
_L2:
label0:
        {
            if (!((Throwable) (obj)).getMessage().contains("c++_shared"))
            {
                break label0;
            }
            Timber.e(a, "Failed to load the c++_shared library!", new Object[0]);
            easymetric.a("LLVMSTL_LOAD_FAILED");
        }
          goto _L4
label1:
        {
            if (!((Throwable) (obj)).getMessage().contains("opencv"))
            {
                break label1;
            }
            Timber.e(a, "Failed to load the opencv shared library!", new Object[0]);
            easymetric.a("OPENCV_LOAD_FAILED");
        }
          goto _L4
        Timber.e(a, "Failed to load native library!", new Object[0]);
        easymetric.a("NATIVE_LIBRARY_LOAD_FAILED");
          goto _L4
        Timber.e(a, "Failed to load native library!", new Object[0]);
        easymetric.a("NATIVE_LIBRARY_LOAD_FAILED");
          goto _L5
    }

    private static native SnapScanResult processFrame(int i, int j, int k, byte abyte0[], int l);

}
