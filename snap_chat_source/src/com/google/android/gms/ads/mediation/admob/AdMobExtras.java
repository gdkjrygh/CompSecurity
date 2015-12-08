// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import dh;

public final class AdMobExtras
    implements dh
{

    private final Bundle mExtras;

    public AdMobExtras(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = new Bundle(bundle);
        } else
        {
            bundle = null;
        }
        mExtras = bundle;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }
}
