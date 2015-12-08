// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.aa;
import com.facebook.aj;

// Referenced classes of package com.facebook.share.internal:
//            j

final class k
    implements aa
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void a(aj aj1)
    {
        a.c = aj1.a();
        if (a.c != null)
        {
            a.a(a.c);
            return;
        } else
        {
            a.a(aj1);
            return;
        }
    }
}
