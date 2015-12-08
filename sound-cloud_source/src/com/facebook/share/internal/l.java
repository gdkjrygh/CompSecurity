// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C;
import com.facebook.GraphRequest;
import com.facebook.internal.U;

// Referenced classes of package com.facebook.share.internal:
//            c, m

final class l
    implements c.k
{

    final Bundle a;
    final c b;

    l(c c1, Bundle bundle)
    {
        b = c1;
        a = bundle;
        super();
    }

    public final void a()
    {
        if (U.a(c.i(b)))
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
            c.c(b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
            return;
        } else
        {
            C c1 = new C();
            c.i i = new c.i(b, c.i(b), c.j(b));
            i.a(c1);
            c1.a(new m(this, i));
            GraphRequest.b(c1);
            return;
        }
    }
}
