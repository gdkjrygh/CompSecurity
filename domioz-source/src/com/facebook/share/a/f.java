// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.am;
import com.facebook.internal.aw;

// Referenced classes of package com.facebook.share.a:
//            a

final class f extends BroadcastReceiver
{

    final a a;

    private f(a a1)
    {
        a = a1;
        super();
    }

    f(a a1, byte byte0)
    {
        this(a1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag1 = true;
        context = intent.getAction();
        intent = intent.getExtras();
        boolean flag = flag1;
        if (intent != null)
        {
            String s = intent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
            flag = flag1;
            if (!aw.a(s))
            {
                if (aw.a(com.facebook.share.a.a.a(a), s))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context))
        {
            com.facebook.share.a.a.b(a);
            return;
        }
        if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (com.facebook.share.a.a.c(a) == null) goto _L1; else goto _L3
_L3:
        am.a(intent);
        return;
        if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
        com.facebook.share.a.a.a(a, com.facebook.share.a.a.a(a), com.facebook.share.a.a.d(a));
        com.facebook.share.a.a.b(a);
        return;
    }
}
