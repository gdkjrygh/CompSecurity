// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.z;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a

abstract class ai extends a
{

    private z a;

    public ai(z z1)
    {
        a = z1;
    }

    public final void a(Object obj)
    {
        z z1 = a;
        if (z1 != null)
        {
            z1.a(obj);
            a = null;
        }
    }
}
