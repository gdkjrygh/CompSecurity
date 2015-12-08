// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.internal.m;
import com.microsoft.onlineid.internal.sso.a;
import com.microsoft.onlineid.ui.AddAccountActivity;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j

public final class g extends j
{

    public g(Context context, Bundle bundle, com.microsoft.onlineid.sts.a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
    {
        String s = b().getString("com.microsoft.onlineid.preferred_membername_type");
        String s1 = b().getString("com.microsoft.onlineid.cobranding_id");
        return com.microsoft.onlineid.internal.sso.a.a(a(AddAccountActivity.a(i(), s, s1, c(), f())).a(i()).a());
    }
}
