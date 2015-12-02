// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b

class init> extends BroadcastReceiver
{

    final b a;

    public void onReceive(Context context, Intent intent)
    {
        if ("clear_cloud_query_success".equals(intent.getAction()))
        {
            b.l(a);
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
