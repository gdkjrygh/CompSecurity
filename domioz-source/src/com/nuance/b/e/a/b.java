// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e.a;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.e.a:
//            d, h, e

public interface b
{

    public abstract void dismiss();

    public abstract void dismissWithError(String s);

    public abstract void enable(boolean flag);

    public abstract void reportAudioEnergyLevel$558c7aa6(int i, float f);

    public abstract void reportNinaEvent(d d);

    public abstract boolean reportResult(h h);

    public abstract void setMode(e e);

    public abstract void show();

    public abstract void waitForDismissComplete();

    public abstract void waitForStartingComplete();

    public abstract void waitForUser(String s, CountDownLatch countdownlatch);

    public abstract void waitForUser(CountDownLatch countdownlatch);
}
