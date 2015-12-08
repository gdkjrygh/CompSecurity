// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.view.View;

public interface CustomRenderedAd
{

    public abstract String getBaseUrl();

    public abstract String getContent();

    public abstract void onAdRendered(View view);

    public abstract void recordClick();

    public abstract void recordImpression();
}
