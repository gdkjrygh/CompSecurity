// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.c;
import com.facebook.c.m;

// Referenced classes of package com.facebook.auth.broadcast:
//            CrossProcessLogoutService

public class CrossProcessLogoutReceiver extends m
{

    public CrossProcessLogoutReceiver()
    {
        super("AUTH_LOGOUT");
    }

    protected void a(Context context, Intent intent, c c, String s)
    {
        intent = new Intent(intent);
        intent.setClass(context, com/facebook/auth/broadcast/CrossProcessLogoutService);
        context.startService(intent);
    }
}
