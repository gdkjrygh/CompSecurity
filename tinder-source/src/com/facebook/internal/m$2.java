// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.j;

// Referenced classes of package com.facebook.internal:
//            m, k

static final class b
    implements com.facebook.hRequest.b
{

    final a a;
    final String b;

    public final void a(j j1)
    {
        if (j1.b != null)
        {
            a.a(j1.b.e);
            return;
        } else
        {
            k.a(b, j1.a);
            a.a(j1.a);
            return;
        }
    }

    stError(stError sterror, String s)
    {
        a = sterror;
        b = s;
        super();
    }
}
