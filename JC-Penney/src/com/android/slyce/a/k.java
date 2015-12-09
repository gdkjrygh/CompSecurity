// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;
import javax.net.ssl.SSLException;

// Referenced classes of package com.android.slyce.a:
//            p

final class k
    implements a
{

    final p a;

    k(p p1)
    {
        a = p1;
        super();
    }

    public void a(Exception exception)
    {
        a.a(new SSLException(exception), null);
    }
}
