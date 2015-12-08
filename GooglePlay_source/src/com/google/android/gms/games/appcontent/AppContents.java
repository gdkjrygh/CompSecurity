// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionBuffer

public interface AppContents
{
    public static interface LoadAppContentResult
        extends Releasable, Result
    {

        public abstract AppContentSectionBuffer getSections();
    }


    public transient abstract void invalidateAppContentCacheFirstParty(GoogleApiClient googleapiclient, String as[]);

    public abstract PendingResult loadFirstParty$6b0b0641(GoogleApiClient googleapiclient, String s, String as[]);
}
