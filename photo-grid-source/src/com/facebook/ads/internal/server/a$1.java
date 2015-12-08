// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import android.content.Context;
import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.dev.Debug;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.dto.e;
import com.facebook.ads.internal.http.a;

// Referenced classes of package com.facebook.ads.internal.server:
//            a

class b
    implements Runnable
{

    final Context a;
    final d b;
    final com.facebook.ads.internal.server.a c;

    public void run()
    {
        e.b(a);
        c.a = b.e();
        Debug.d(c.a.toString());
        try
        {
            com.facebook.ads.internal.server.a.a(c, new a(a, b.f));
            com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new com.facebook.ads.internal.http.d(c.a), com.facebook.ads.internal.server.a.b(c));
            return;
        }
        catch (Exception exception)
        {
            com.facebook.ads.internal.server.a.a(c, AdErrorType.AD_REQUEST_FAILED.getAdErrorWrapper(exception.getMessage()));
        }
    }

    (com.facebook.ads.internal.server.a a1, Context context, d d1)
    {
        c = a1;
        a = context;
        b = d1;
        super();
    }
}
