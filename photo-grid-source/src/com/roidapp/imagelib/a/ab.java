// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import java.util.Comparator;

// Referenced classes of package com.roidapp.imagelib.a:
//            aa

final class ab
    implements Comparator
{

    final aa a;

    ab(aa aa)
    {
        a = aa;
        super();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (android.hardware.Camera.Size)obj;
        obj1 = (android.hardware.Camera.Size)obj1;
        if (((android.hardware.Camera.Size) (obj)).width <= ((android.hardware.Camera.Size) (obj1)).width)
        {
            if (((android.hardware.Camera.Size) (obj)).width < ((android.hardware.Camera.Size) (obj1)).width)
            {
                return -1;
            }
            if (((android.hardware.Camera.Size) (obj)).height <= ((android.hardware.Camera.Size) (obj1)).height)
            {
                return ((android.hardware.Camera.Size) (obj)).height >= ((android.hardware.Camera.Size) (obj1)).height ? 0 : -1;
            }
        }
        return 1;
    }
}
