// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.os.Build;

// Referenced classes of package org.chromium.media:
//            VideoCaptureAndroid

private static class IdAndSizes.mMinHeight
{
    private static class IdAndSizes
    {

        public final String mDevice;
        public final int mMinHeight;
        public final int mMinWidth;
        public final String mModel;

        IdAndSizes(String s, String s1, int i, int j)
        {
            mModel = s;
            mDevice = s1;
            mMinWidth = i;
            mMinHeight = j;
        }
    }


    private static final IdAndSizes CAPTURESIZE_BUGGY_DEVICE_LIST[] = {
        new IdAndSizes("Nexus 7", "flo", 640, 480)
    };
    private static final String COLORSPACE_BUGGY_DEVICE_LIST[] = {
        "SAMSUNG-SGH-I747", "ODROID-U2"
    };

    static void applyMinDimensions(IdAndSizes idandsizes)
    {
        IdAndSizes aidandsizes[] = CAPTURESIZE_BUGGY_DEVICE_LIST;
        int k = aidandsizes.length;
        int i = 0;
        while (i < k) 
        {
            IdAndSizes idandsizes1 = aidandsizes[i];
            if (idandsizes1.mModel.contentEquals(Build.MODEL) && idandsizes1.mDevice.contentEquals(Build.DEVICE))
            {
                int j;
                if (idandsizes1.mMinWidth > idandsizes.mMinWidth)
                {
                    j = idandsizes1.mMinWidth;
                } else
                {
                    j = idandsizes.mMinWidth;
                }
                idandsizes.mMinWidth = j;
                if (idandsizes1.mMinHeight > idandsizes.mMinHeight)
                {
                    j = idandsizes1.mMinHeight;
                } else
                {
                    j = idandsizes.mMinHeight;
                }
                idandsizes.mMinHeight = j;
            }
            i++;
        }
    }

    static int getImageFormat()
    {
        if (android.os.Height >= 16) goto _L2; else goto _L1
_L1:
        return 17;
_L2:
        String as[] = COLORSPACE_BUGGY_DEVICE_LIST;
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (as[i].contentEquals(Build.MODEL))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return 0x32315659;
    }


    private IdAndSizes.mMinHeight()
    {
    }
}
