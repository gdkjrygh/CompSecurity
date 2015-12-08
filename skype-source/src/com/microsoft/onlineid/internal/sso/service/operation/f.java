// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.internal.b.a;
import com.microsoft.onlineid.internal.m;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.b;
import com.microsoft.onlineid.ui.SignOutActivity;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j

public final class f extends j
{

    public f(Context context, Bundle bundle, com.microsoft.onlineid.sts.a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
        throws a
    {
        Object obj = b().getString("com.microsoft.onlineid.user_cid");
        o.a(((String) (obj)), "com.microsoft.onlineid.user_cid");
        obj = j().a(((String) (obj)));
        if (obj == null)
        {
            throw new a("No account was found with the specified ID.");
        } else
        {
            return com.microsoft.onlineid.internal.sso.a.a(a(SignOutActivity.a(i(), ((b) (obj)).b(), ((b) (obj)).d(), ((b) (obj)).c(), f())).a(i()).a());
        }
    }
}
