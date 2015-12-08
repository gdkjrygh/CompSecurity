// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.data;

import java.util.Comparator;

// Referenced classes of package com.netflix.mediaclient.util.data:
//            FileSystemDataRepositoryImpl

class this._cls0
    implements Comparator
{

    final FileSystemDataRepositoryImpl this$0;

    public int compare(this._cls0 _pcls0, this._cls0 _pcls0_1)
    {
        if (_pcls0._mth0() == _pcls0_1._mth0())
        {
            return 0;
        }
        return _pcls0._mth0() >= _pcls0_1._mth0() ? 1 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    ()
    {
        this$0 = FileSystemDataRepositoryImpl.this;
        super();
    }
}
