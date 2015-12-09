// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParams

final class this._cls0
    implements Iterator
{

    Iterator mBundleIterator;
    final EventParams this$0;

    public final boolean hasNext()
    {
        return mBundleIterator.hasNext();
    }

    public final volatile Object next()
    {
        return (String)mBundleIterator.next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Remove not supported");
    }

    ()
    {
        this$0 = EventParams.this;
        super();
        mBundleIterator = EventParams.access$000(EventParams.this).keySet().iterator();
    }
}
