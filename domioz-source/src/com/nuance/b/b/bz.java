// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.n;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            da

final class bz
    implements j
{

    private final da a;

    public bz(da da1)
    {
        a = da1;
    }

    public final void a(Object obj)
    {
        if (obj instanceof ap)
        {
            a.onStartOfSpeech((ap)obj);
        }
        if (obj instanceof n)
        {
            a.onEndOfSpeech((n)obj);
        }
    }
}
