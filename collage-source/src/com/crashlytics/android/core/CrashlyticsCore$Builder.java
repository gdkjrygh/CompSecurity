// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, CrashlyticsListener, PinningInfoProvider

public static class disabled
{

    private float delay;
    private boolean disabled;
    private CrashlyticsListener listener;
    private PinningInfoProvider pinningInfoProvider;

    public CrashlyticsCore build()
    {
        if (delay < 0.0F)
        {
            delay = 1.0F;
        }
        return new CrashlyticsCore(delay, listener, pinningInfoProvider, disabled);
    }

    public disabled delay(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException("delay must be greater than 0");
        }
        if (delay > 0.0F)
        {
            throw new IllegalStateException("delay already set.");
        } else
        {
            delay = f;
            return this;
        }
    }

    public delay disabled(boolean flag)
    {
        disabled = flag;
        return this;
    }

    public disabled listener(CrashlyticsListener crashlyticslistener)
    {
        if (crashlyticslistener == null)
        {
            throw new IllegalArgumentException("listener must not be null.");
        }
        if (listener != null)
        {
            throw new IllegalStateException("listener already set.");
        } else
        {
            listener = crashlyticslistener;
            return this;
        }
    }

    public listener pinningInfo(PinningInfoProvider pinninginfoprovider)
    {
        if (pinninginfoprovider == null)
        {
            throw new IllegalArgumentException("pinningInfoProvider must not be null.");
        }
        if (pinningInfoProvider != null)
        {
            throw new IllegalStateException("pinningInfoProvider already set.");
        } else
        {
            pinningInfoProvider = pinninginfoprovider;
            return this;
        }
    }

    public ()
    {
        delay = -1F;
        disabled = false;
    }
}
