// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, CrashlyticsListener, PinningInfoProvider

public static class a
{

    public boolean a;
    private float b;
    private CrashlyticsListener c;
    private PinningInfoProvider d;

    public final CrashlyticsCore a()
    {
        if (b < 0.0F)
        {
            b = 1.0F;
        }
        return new CrashlyticsCore(b, c, d, a);
    }

    public ()
    {
        b = -1F;
        a = false;
    }
}
