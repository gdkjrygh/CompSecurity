// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.util:
//            g

public static class  extends b
{

    private static volatile g a;

    public static g a()
    {
        if (a == null)
        {
            a = new g(null);
        }
        return a;
    }
}
