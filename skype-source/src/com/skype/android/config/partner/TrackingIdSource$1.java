// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.content.Context;
import com.skype.android.util.chained.AbstractChainedRetriever;

// Referenced classes of package com.skype.android.config.partner:
//            TrackingIdSource, BuildConfigTrackingIDRetriever

static final class nit> extends TrackingIdSource
{

    public final AbstractChainedRetriever createRetriever(Context context)
    {
        return new BuildConfigTrackingIDRetriever();
    }

    public final volatile AbstractChainedRetriever createRetriever(Object obj)
    {
        return createRetriever((Context)obj);
    }

    public final volatile boolean isApplicable(Object obj)
    {
        return super.isApplicable((Context)obj);
    }

    ver(String s, int i)
    {
        super(s, i, null);
    }
}
