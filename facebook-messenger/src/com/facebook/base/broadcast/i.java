// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.base.broadcast:
//            n

public class i extends n
{

    public i(Context context)
    {
        super(context, (new StringBuilder()).append(context.getPackageName()).append(".permission.CROSS_PROCESS_BROADCAST_MANAGER").toString());
    }

    public void a(Intent intent)
    {
        intent.setPackage(a.getPackageName());
        super.a(intent);
    }
}
