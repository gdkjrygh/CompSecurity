// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.N;
import com.facebook.internal.U;

// Referenced classes of package com.facebook.share.widget:
//            LikeView

private final class <init> extends BroadcastReceiver
{

    final LikeView a;

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
            if (!U.a(s))
            {
                if (U.a(LikeView.b(a), s))
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
            LikeView.c(a);
            return;
        }
        if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (LikeView.d(a) == null) goto _L1; else goto _L3
_L3:
        LikeView.d(a);
        N.a(intent);
        return;
        if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
        LikeView.a(a, LikeView.b(a), LikeView.e(a));
        LikeView.c(a);
        return;
    }

    private (LikeView likeview)
    {
        a = likeview;
        super();
    }

    it>(LikeView likeview, byte byte0)
    {
        this(likeview);
    }
}
