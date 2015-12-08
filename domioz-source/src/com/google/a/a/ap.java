// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            av, aq, ao

final class ap
    implements av
{

    final String a;

    ap(String s)
    {
        a = s;
        super();
    }

    public final Iterator a(ao ao, CharSequence charsequence)
    {
        return new aq(this, ao, charsequence);
    }
}
