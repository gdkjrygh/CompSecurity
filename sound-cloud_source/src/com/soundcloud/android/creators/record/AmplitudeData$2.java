// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AmplitudeData

class this._cls0
    implements Iterator
{

    int index;
    final AmplitudeData this$0;

    public boolean hasNext()
    {
        return index < AmplitudeData.access$000(AmplitudeData.this);
    }

    public Float next()
    {
        float af[] = AmplitudeData.access$100(AmplitudeData.this);
        int i = index;
        index = i + 1;
        return Float.valueOf(af[i]);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$0 = AmplitudeData.this;
        super();
    }
}
