// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.iap:
//            d

public static class .b extends b
{

    static d a = null;

    public static d a()
    {
        if (a == null)
        {
            a = new d(com.pandora.android.provider.b.a.h(), com.pandora.android.provider.b.a);
            a.a();
        }
        return a;
    }

}
