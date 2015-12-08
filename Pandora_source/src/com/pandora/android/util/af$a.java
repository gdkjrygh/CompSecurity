// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.util:
//            af

public static class  extends b
{

    private static volatile af a;

    public static af a()
    {
        if (a == null)
        {
            a = new af(null);
        }
        return a;
    }
}
