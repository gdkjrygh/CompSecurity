// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import java.util.HashMap;

// Referenced classes of package com.auditude.ads.model:
//            IClick

public interface IAsset
{

    public abstract String getAdParameters();

    public abstract String getApiFramework();

    public abstract IClick getClick();

    public abstract String getCompanionRequired();

    public abstract String getCreativeType();

    public abstract HashMap getCustomData();

    public abstract String getDescription();

    public abstract int getDurationInMillis();

    public abstract String getFormat();

    public abstract int getHeight();

    public abstract String getID();

    public abstract Boolean getIsSkippable();

    public abstract int getLeadTimeInMillis();

    public abstract String getResourceType();

    public abstract int getSkipOffset();

    public abstract String getTitle();

    public abstract String getUrl();

    public abstract int getWidth();

    public abstract boolean isNetworkAd();
}
