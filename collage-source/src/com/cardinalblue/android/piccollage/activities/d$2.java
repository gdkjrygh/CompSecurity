// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d

class a
    implements i
{

    final d a;

    public Object then(j j1)
        throws Exception
    {
        if (((List)j1.e()).isEmpty())
        {
            throw new com.cardinalblue.android.piccollage.model.<init>("no suggestion result");
        } else
        {
            d.b(a).a();
            d.b(a).a((Collection)j1.e());
            d.b(a).notifyDataSetChanged();
            return null;
        }
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
