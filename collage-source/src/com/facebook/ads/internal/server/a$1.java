// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import android.content.Context;
import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.dto.e;
import com.facebook.ads.internal.dto.f;
import com.facebook.ads.internal.http.a;
import com.facebook.ads.internal.http.d;

// Referenced classes of package com.facebook.ads.internal.server:
//            a

class b
    implements Runnable
{

    final Context a;
    final e b;
    final com.facebook.ads.internal.server.a c;

    public void run()
    {
        f.b(a);
        c.a = b.e();
        try
        {
            com.facebook.ads.internal.server.a.a(c, new a(a, b.e));
            com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new d(c.a), com.facebook.ads.internal.server.a.b(c));
            return;
        }
        catch (Exception exception)
        {
            com.facebook.ads.internal.server.a.a(c, AdErrorType.AD_REQUEST_FAILED.getAdErrorWrapper(exception.getMessage()));
        }
    }

    (com.facebook.ads.internal.server.a a1, Context context, e e1)
    {
        c = a1;
        a = context;
        b = e1;
        super();
    }
}
