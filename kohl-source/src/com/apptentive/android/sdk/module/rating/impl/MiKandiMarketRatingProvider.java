// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.rating.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.apptentive.android.sdk.module.rating.IRatingProvider;
import com.apptentive.android.sdk.module.rating.InsufficientRatingArgumentsException;
import java.util.Map;

public class MiKandiMarketRatingProvider
    implements IRatingProvider
{

    private int mAppId;

    public MiKandiMarketRatingProvider(int i)
    {
        mAppId = i;
    }

    public String activityNotFoundMessage(Context context)
    {
        return context.getString(com.apptentive.android.sdk.R.string.apptentive_rating_provider_no_mikandi);
    }

    public void startRating(Context context, Map map)
        throws InsufficientRatingArgumentsException
    {
        map = Uri.parse((new StringBuilder()).append("mikandi://link.mikandi.com/app?app_id=").append(mAppId).append("&referrer=apptentive").toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(map);
        context.startActivity(intent);
    }
}
