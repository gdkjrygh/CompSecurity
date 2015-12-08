// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsStorage

class this._cls0
    implements f
{

    final StationsStorage this$0;

    public volatile Object call(Object obj)
    {
        return call((CursorReader)obj);
    }

    public b call(CursorReader cursorreader)
    {
        return station(new Urn(cursorreader.getString(com.soundcloud.android.storage.ATION_URN)));
    }

    ()
    {
        this$0 = StationsStorage.this;
        super();
    }
}
