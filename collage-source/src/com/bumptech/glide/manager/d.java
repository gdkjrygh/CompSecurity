// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.content.Context;

// Referenced classes of package com.bumptech.glide.manager:
//            e, i, c

public class d
{

    public d()
    {
    }

    public c a(Context context, c.a a1)
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
            return new e(context, a1);
        } else
        {
            return new i();
        }
    }
}
