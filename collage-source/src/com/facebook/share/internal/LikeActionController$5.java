// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookSdk;
import com.facebook.internal.FileLruCache;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

static final class  extends AccessTokenTracker
{

    protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
    {
        accesstoken = FacebookSdk.getApplicationContext();
        if (accesstoken1 == null)
        {
            int _tmp = LikeActionController.access$302((LikeActionController.access$300() + 1) % 1000);
            accesstoken.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$300()).apply();
            LikeActionController.access$400().clear();
            LikeActionController.access$500().clearCache();
        }
        LikeActionController.access$600(null, "com.facebook.sdk.LikeActionController.DID_RESET");
    }

    ()
    {
    }
}
