// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

final class  extends AccessTokenTracker
{

    protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
    {
        while (accesstoken == null || accesstoken1 != null && Utility.areObjectsEqual(accesstoken1.getUserId(), accesstoken.getUserId())) 
        {
            return;
        }
        VideoUploader.access$200();
    }

    ()
    {
    }
}
