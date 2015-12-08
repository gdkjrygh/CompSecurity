// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AccessToken;
import com.facebook.h;
import com.facebook.internal.y;
import com.facebook.q;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//            a

final class g extends h
{

    g()
    {
    }

    protected final void a(AccessToken accesstoken)
    {
        Context context = q.f();
        if (accesstoken == null)
        {
            com.facebook.share.internal.a.a((com.facebook.share.internal.a.f() + 1) % 1000);
            context.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", com.facebook.share.internal.a.f()).apply();
            com.facebook.share.internal.a.g().clear();
            com.facebook.share.internal.a.h().a();
        }
        com.facebook.share.internal.a.a("com.facebook.sdk.LikeActionController.DID_RESET");
    }
}
