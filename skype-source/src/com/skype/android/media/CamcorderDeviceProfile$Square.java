// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.skype.android.media:
//            CamcorderDeviceProfile, Size

public static class  extends CamcorderDeviceProfile
{

    public final void d()
    {
        Size size;
        super.d();
        a(a, Boolean.valueOf(false));
        a(a, Boolean.valueOf(true));
        a(a, Size.j);
        size = Size.e;
        if (android.os.ofile.Key.h >= 18)
        {
            size = Size.g;
        }
        a(a, size);
        if (Build.BOARD.startsWith("MSM8960") || Build.BOARD.equalsIgnoreCase("MAKO") || Build.BOARD.equalsIgnoreCase("flo"))
        {
            a(a, Size.i);
        }
        if (android.os.ofile.Key.d < 18 && (Build.MODEL.equalsIgnoreCase("GT-I9195") || Build.MODEL.equalsIgnoreCase("GT-I9190")))
        {
            a(a, Boolean.valueOf(true));
        }
        if (!Build.BOARD.equals("MSM8960") && Build.MODEL.equals("HTC One X"))
        {
            a(a, Integer.valueOf(0x32315659));
        }
        a(a, new HashSet(Arrays.asList(new Size[] {
            new Size(576, 432), new Size(704, 576), new Size(528, 432), new Size(1056, 864), new Size(880, 720)
        })));
        size = null;
        if (android.os.ofile.Key.q < 18) goto _L2; else goto _L1
_L1:
        a(a, Size.g);
_L4:
        if (size != null)
        {
            a(a, size);
            a(a, size);
        }
        return;
_L2:
        if (Build.MODEL.equalsIgnoreCase("SAMSUNG-SGH-I747"))
        {
            size = Size.i;
        } else
        if (Build.MODEL.startsWith("GT-I9082"))
        {
            size = Size.e;
        } else
        if (Build.MODEL.startsWith("GT-I919"))
        {
            size = Size.g;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean d(int i)
    {
        return false;
    }

    public ()
    {
    }
}
