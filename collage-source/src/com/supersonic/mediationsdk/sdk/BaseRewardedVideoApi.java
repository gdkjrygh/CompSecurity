// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import android.app.Activity;

// Referenced classes of package com.supersonic.mediationsdk.sdk:
//            BaseApi

public interface BaseRewardedVideoApi
    extends BaseApi
{

    public abstract void initRewardedVideo(Activity activity, String s, String s1);

    public abstract boolean isRewardedVideoAvailable();

    public abstract void showRewardedVideo();

    public abstract void showRewardedVideo(String s);
}
