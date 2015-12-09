// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.moodstocks.android.camera:
//            Size

class orientation
{

    private List availablePreviewSizes;
    private Size cachedLand;
    private Size cachedPort;
    private int displayOrientation;
    private int frameOrientation;
    private Size frameSize;
    private boolean front;
    private int orientation;

    private Size findBestPreviewSize(boolean flag, Size size)
    {
        float f;
        Iterator iterator;
        if (flag)
        {
            f = (float)size.height / (float)size.width;
        } else
        {
            f = (float)size.width / (float)size.height;
        }
        size = new Size();
        iterator = availablePreviewSizes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Size size1 = (Size)iterator.next();
            int i = size1.width;
            int k = size1.height;
            if (i <= 1280 && k <= 1280)
            {
                float f1 = (float)i / (float)k;
                if ((double)(((f1 - f) * (f1 - f)) / (f * f)) < 0.01D && i > size.width)
                {
                    size = size1;
                }
            }
        } while (true);
        Size size2 = size;
        if (!size.isSet())
        {
            Iterator iterator1 = availablePreviewSizes.iterator();
            do
            {
                size2 = size;
                if (!iterator1.hasNext())
                {
                    break;
                }
                size2 = (Size)iterator1.next();
                int j = size2.width;
                int l = size2.height;
                if (j <= 1280 && l <= 1280 && j > size.width)
                {
                    size = size2;
                }
            } while (true);
        }
        return size2;
    }

    protected int getDisplayOrientation()
    {
        return displayOrientation;
    }

    protected int getFrameOrientation()
    {
        return frameOrientation;
    }

    protected Size getFrameSize()
    {
        return frameSize;
    }

    protected void setAvailablePreviewSizes(List list)
    {
        availablePreviewSizes = list;
    }

    protected void update(Size size, boolean flag, int i)
    {
        int j;
        boolean flag1 = false;
        if (flag)
        {
            if (!cachedPort.isSet())
            {
                cachedPort = findBestPreviewSize(flag, size);
            }
            frameSize = cachedPort;
        } else
        {
            if (!cachedLand.isSet())
            {
                cachedLand = findBestPreviewSize(flag, size);
            }
            frameSize = cachedLand;
        }
        j = ((flag1) ? 1 : 0);
        i;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 76
    //                   1 154
    //                   2 161
    //                   3 169;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_169;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = ((flag1) ? 1 : 0);
_L6:
        if (front)
        {
            displayOrientation = (j + orientation) % 360;
            frameOrientation = displayOrientation;
            displayOrientation = (360 - displayOrientation) % 360;
            return;
        } else
        {
            displayOrientation = ((orientation - j) + 360) % 360;
            frameOrientation = displayOrientation;
            return;
        }
_L3:
        j = 90;
          goto _L6
_L4:
        j = 180;
          goto _L6
        j = 270;
          goto _L6
    }

    protected (boolean flag, int i)
    {
        cachedLand = new Size();
        cachedPort = new Size();
        front = flag;
        orientation = i;
    }
}
