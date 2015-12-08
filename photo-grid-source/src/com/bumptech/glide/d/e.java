// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.content.Context;

// Referenced classes of package com.bumptech.glide.d:
//            f, k, d, c

public final class e
{

    public e()
    {
    }

    public static c a(Context context, d d)
    {
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new f(context, d);
        } else
        {
            return new k();
        }
    }
}
