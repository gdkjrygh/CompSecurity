// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;

// Referenced classes of package com.mopub.nativeads:
//            RequestParameters

final class ao extends AdUrlGenerator
{

    private String e;
    private String f;

    ao(Context context)
    {
        super(context);
    }

    final ao a(int i)
    {
        f = String.valueOf(i);
        return this;
    }

    final ao a(RequestParameters requestparameters)
    {
        if (requestparameters != null)
        {
            c = requestparameters.getKeywords();
            d = requestparameters.getLocation();
            e = requestparameters.getDesiredAssets();
        }
        return this;
    }

    protected final void a(String s)
    {
        b("nsv", s);
    }

    public final String generateUrlString(String s)
    {
        a(s, "/m/ad");
        a(ClientMetadata.getInstance(a));
        if (!TextUtils.isEmpty(e))
        {
            b("assets", e);
        }
        if (!TextUtils.isEmpty(f))
        {
            b("MAGIC_NO", f);
        }
        return b();
    }

    public final volatile AdUrlGenerator withAdUnitId(String s)
    {
        return withAdUnitId(s);
    }

    public final ao withAdUnitId(String s)
    {
        b = s;
        return this;
    }
}
