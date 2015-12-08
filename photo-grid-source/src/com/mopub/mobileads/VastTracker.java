// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import java.io.Serializable;

public class VastTracker
    implements Serializable
{

    protected final String a;
    private boolean b;

    public VastTracker(String s)
    {
        Preconditions.checkNotNull(s);
        a = s;
    }

    public String getTrackingUrl()
    {
        return a;
    }

    public boolean isTracked()
    {
        return b;
    }

    public void setTracked()
    {
        b = true;
    }
}
