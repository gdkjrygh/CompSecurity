// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.snapchat.android.ads.AdRequestError;

public static final class >
{

    AdRequestError mAdRequestError;
    Bundle mAdResponseFieldBundle;
    private long mImpressionViewThresholdMilliSeconds;
    String mTransformedUrl;

    public final kP a()
    {
        return new kP(mTransformedUrl, mAdRequestError, mAdResponseFieldBundle, mImpressionViewThresholdMilliSeconds, System.currentTimeMillis(), (byte)0);
    }

    public >()
    {
    }
}
