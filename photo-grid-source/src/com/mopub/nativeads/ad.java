// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.nativeads:
//            c

interface ad
{

    public abstract void clear(View view);

    public abstract void destroy();

    public abstract String getCallToAction();

    public abstract String getClickDestinationUrl();

    public abstract Object getExtra(String s);

    public abstract Map getExtras();

    public abstract String getIconImageUrl();

    public abstract int getImpressionMinPercentageViewed();

    public abstract int getImpressionMinTimeViewed();

    public abstract Set getImpressionTrackers();

    public abstract String getMainImageUrl();

    public abstract Double getStarRating();

    public abstract String getText();

    public abstract String getTitle();

    public abstract void handleClick(View view);

    public abstract boolean isOverridingClickTracker();

    public abstract boolean isOverridingImpressionTracker();

    public abstract void prepare(View view);

    public abstract void recordImpression();

    public abstract void setNativeEventListener(c c);
}
