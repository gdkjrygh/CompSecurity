// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;

public abstract class NativeAdMapper
{

    protected Bundle mExtras;
    protected boolean mOverrideClickHandling;
    protected boolean mOverrideImpressionRecording;

    public NativeAdMapper()
    {
        mExtras = new Bundle();
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final boolean getOverrideClickHandling()
    {
        return mOverrideClickHandling;
    }

    public final boolean getOverrideImpressionRecording()
    {
        return mOverrideImpressionRecording;
    }

    public void handleClick(View view)
    {
    }

    public void recordImpression()
    {
    }

    public final void setExtras(Bundle bundle)
    {
        mExtras = bundle;
    }

    public final void setOverrideClickHandling(boolean flag)
    {
        mOverrideClickHandling = flag;
    }

    public final void setOverrideImpressionRecording(boolean flag)
    {
        mOverrideImpressionRecording = flag;
    }

    public void trackView(View view)
    {
    }
}
