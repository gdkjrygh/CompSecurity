// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.widget.LikeView;

public final class asb extends BroadcastReceiver
{

    private LikeView a;

    private asb(LikeView likeview)
    {
        a = likeview;
        super();
    }

    public asb(LikeView likeview, byte byte0)
    {
        this(likeview);
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag1 = true;
        context = intent.getAction();
        intent = intent.getExtras();
        boolean flag = flag1;
        if (intent != null)
        {
            intent = intent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
            flag = flag1;
            if (!arp.a(intent))
            {
                if (arp.a(LikeView.b(a), intent))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag)
        {
            if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context))
            {
                LikeView.c(a);
                return;
            }
            if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context) && "com.facebook.sdk.LikeActionController.DID_RESET".equals(context))
            {
                LikeView.a(a, LikeView.b(a));
                LikeView.c(a);
                return;
            }
        }
    }
}
