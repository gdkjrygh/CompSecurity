// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.sts.a;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j, e, c

public final class b extends j
{

    public b(Context context, Bundle bundle, a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
    {
        if (!j().a())
        {
            return (new e(i(), b(), j(), k())).a();
        }
        java.util.Set set = j().b();
        if (set.size() == 1)
        {
            return com.microsoft.onlineid.internal.sso.a.a((com.microsoft.onlineid.sts.b)set.iterator().next());
        } else
        {
            return (new c(i(), b(), j(), k())).a();
        }
    }
}
