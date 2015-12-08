// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParams

final class b
    implements Iterator
{

    Iterator a;
    final EventParams b;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final volatile Object next()
    {
        return (String)a.next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Remove not supported");
    }

    (EventParams eventparams)
    {
        b = eventparams;
        super();
        a = EventParams.a(b).keySet().iterator();
    }
}
