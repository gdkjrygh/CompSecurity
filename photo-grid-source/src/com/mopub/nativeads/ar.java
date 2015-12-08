// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;

final class ar extends BaseUrlGenerator
{

    private final Context a;
    private String b;

    public ar(Context context)
    {
        a = context;
    }

    public final String generateUrlString(String s)
    {
        a(s, "/m/pos");
        b("id", b);
        b("1");
        s = ClientMetadata.getInstance(a);
        b("nsv", s.getSdkVersion());
        a(new String[] {
            s.getDeviceManufacturer(), s.getDeviceModel(), s.getDeviceProduct()
        });
        c(s.getAppVersion());
        c();
        return b();
    }

    public final ar withAdUnitId(String s)
    {
        b = s;
        return this;
    }
}
