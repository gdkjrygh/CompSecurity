// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Build;
import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.radio.data:
//            f

public static class  extends b
{

    private static String a;

    public static String a()
    {
        if (a == null)
        {
            return Build.DEVICE;
        } else
        {
            return a;
        }
    }
}
