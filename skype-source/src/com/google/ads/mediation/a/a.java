// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.e;

public final class a extends com.google.ads.mediation.a
    implements c, e
{

    public a()
    {
    }

    protected final Bundle a(Bundle bundle, Bundle bundle1)
    {
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle1.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle1.getString("adJson")))
        {
            bundle.putString("_ad", bundle1.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
