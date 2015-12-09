// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import arb;
import arx;
import com.facebook.AppEventsLogger;
import com.facebook.LoggingBehavior;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class a
    implements arx
{

    private Bundle a;
    private LikeActionController b;

    public final void a(com.facebook.widget.all all, Bundle bundle)
    {
        if (!bundle.containsKey("object_is_liked"))
        {
            return;
        }
        boolean flag = bundle.getBoolean("object_is_liked");
        String s = bundle.getString("like_count_string");
        String s1 = bundle.getString("social_sentence");
        String s2 = bundle.getString("unlike_token");
        if (a == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = a;
        }
        bundle.putString("call_id", all.a.toString());
        LikeActionController.b(b).b("fb_like_control_dialog_did_succeed", bundle);
        LikeActionController.a(b, flag, s, s, s1, s1, s2);
    }

    public final void a(com.facebook.widget.all all, Exception exception, Bundle bundle)
    {
        exception = LoggingBehavior.a;
        LikeActionController.h();
        arb.b();
        if (a == null)
        {
            exception = new Bundle();
        } else
        {
            exception = a;
        }
        exception.putString("call_id", all.a.toString());
        LikeActionController.a(b, "present_dialog", exception);
        LikeActionController.a(LikeActionController.c(b), b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    l(LikeActionController likeactioncontroller, Bundle bundle)
    {
        b = likeactioncontroller;
        a = bundle;
        super();
    }
}
