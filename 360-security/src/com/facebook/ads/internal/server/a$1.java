// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import android.content.Context;
import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.c.a;
import com.facebook.ads.internal.d.d;
import com.facebook.ads.internal.d.e;

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
        c.a = b.g();
        com.facebook.ads.internal.c.a.b(c.a.toString());
        try
        {
            com.facebook.ads.internal.server.a.a(c, new com.facebook.ads.internal.e.a(a, b.i));
            com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new com.facebook.ads.internal.e.d(c.a), com.facebook.ads.internal.server.a.b(c));
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
