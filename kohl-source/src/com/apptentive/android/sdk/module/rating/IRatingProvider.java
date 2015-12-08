// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.rating;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.apptentive.android.sdk.module.rating:
//            InsufficientRatingArgumentsException

public interface IRatingProvider
{

    public abstract String activityNotFoundMessage(Context context);

    public abstract void startRating(Context context, Map map)
        throws InsufficientRatingArgumentsException;
}
