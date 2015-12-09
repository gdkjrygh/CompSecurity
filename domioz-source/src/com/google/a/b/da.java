// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.AbstractSet;
import java.util.Collection;

// Referenced classes of package com.google.a.b:
//            cy

abstract class da extends AbstractSet
{

    da()
    {
    }

    public boolean removeAll(Collection collection)
    {
        return cy.a(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return super.retainAll((Collection)ad.a(collection));
    }
}
