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

public class AmazonAppstoreRatingProvider
    implements IRatingProvider
{

    public AmazonAppstoreRatingProvider()
    {
    }

    public String activityNotFoundMessage(Context context)
    {
        return context.getString(com.apptentive.android.sdk.R.string.apptentive_rating_provider_no_amazon_appstore);
    }

    public void startRating(Context context, Map map)
        throws InsufficientRatingArgumentsException
    {
        if (!map.containsKey("package"))
        {
            throw new InsufficientRatingArgumentsException("Missing required argument 'package'");
        } else
        {
            map = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("amzn://apps/android?p=").append((String)map.get("package")).toString()));
            map.setFlags(0x50080000);
            context.startActivity(map);
            return;
        }
    }
}
