// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.Context;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            VideoType

public interface SeasonDetails
{

    public abstract int getCurrentEpisodeNumber();

    public abstract String getId();

    public abstract int getNumOfEpisodes();

    public abstract int getSeasonNumber();

    public abstract String getSeasonNumberTitle(Context context);

    public abstract String getTitle();

    public abstract VideoType getType();

    public abstract int getYear();
}
