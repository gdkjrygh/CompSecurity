// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            av, as, ao

final class ar
    implements av
{

    final int a;

    ar(int i)
    {
        a = i;
        super();
    }

    public final Iterator a(ao ao, CharSequence charsequence)
    {
        return new as(this, ao, charsequence);
    }
}
