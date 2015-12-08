// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.g.i;

// Referenced classes of package com.kik.cards.web:
//            aq

final class ar extends i
{

    final aq a;

    ar(aq aq1)
    {
        a = aq1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Boolean)obj1;
        a.setNetworkAvailable(((Boolean) (obj)).booleanValue());
    }
}
